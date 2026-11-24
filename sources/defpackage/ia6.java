package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class ia6 extends Handler implements Runnable {
    public final int a;
    public final ja6 b;
    public final long c;
    public ga6 d;
    public IOException e;
    public int f;
    public Thread h;
    public boolean n;
    public volatile boolean r;
    public final mx6 s;

    public ia6(mx6 mx6Var, Looper looper, ja6 ja6Var, ga6 ga6Var, int i, long j) {
        super(looper);
        this.s = mx6Var;
        this.b = ja6Var;
        this.d = ga6Var;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.r = z;
        this.e = null;
        if (hasMessages(1)) {
            this.n = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.n = true;
                this.b.e();
                Thread thread = this.h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.s.c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ga6 ga6Var = this.d;
            ga6Var.getClass();
            ga6Var.w(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        ga6 ga6Var = this.d;
        ga6Var.getClass();
        ga6Var.W0(this.b, elapsedRealtime, j, this.f);
        this.e = null;
        mx6 mx6Var = this.s;
        ia6 ia6Var = (ia6) mx6Var.c;
        ia6Var.getClass();
        ((g89) mx6Var.b).execute(ia6Var);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z;
        if (!this.r) {
            int i = message.what;
            if (i == 1) {
                b();
            } else if (i != 4) {
                this.s.c = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.c;
                ga6 ga6Var = this.d;
                ga6Var.getClass();
                if (this.n) {
                    ga6Var.w(this.b, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 2) {
                    if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i3 = this.f + 1;
                        this.f = i3;
                        ha6 f2 = ga6Var.f2(this.b, elapsedRealtime, j, iOException, i3);
                        byte b = f2.a;
                        if (b == 3) {
                            this.s.d = this.e;
                            return;
                        } else if (b != 2) {
                            if (b == 1) {
                                this.f = 1;
                            }
                            long j2 = f2.b;
                            if (j2 == -9223372036854775807L) {
                                j2 = Math.min((this.f - 1) * 1000, 5000);
                            }
                            mx6 mx6Var = this.s;
                            if (((ia6) mx6Var.c) == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jte.p(z);
                            mx6Var.c = this;
                            if (j2 > 0) {
                                sendEmptyMessageDelayed(1, j2);
                                return;
                            } else {
                                b();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    ga6Var.g0(this.b, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    ncd.d("LoadTask", "Unexpected exception handling load completed", e);
                    this.s.d = new la6(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.n;
                this.h = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (!this.r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Error e2) {
            if (!this.r) {
                ncd.d("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (!this.r) {
                ncd.d("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(3, new la6(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            if (!this.r) {
                ncd.d("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(3, new la6(e4)).sendToTarget();
            }
        }
    }
}
