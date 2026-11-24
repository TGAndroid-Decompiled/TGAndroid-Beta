package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class j86 extends Handler implements Runnable {
    public final int a;
    public final k86 b;
    public final long c;
    public h86 d;
    public IOException e;
    public int f;
    public Thread h;
    public boolean n;
    public volatile boolean r;
    public final mv6 s;

    public j86(mv6 mv6Var, Looper looper, k86 k86Var, h86 h86Var, int i, long j) {
        super(looper);
        this.s = mv6Var;
        this.b = k86Var;
        this.d = h86Var;
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
                this.b.d();
                Thread thread = this.h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.s.c = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h86 h86Var = this.d;
            h86Var.getClass();
            h86Var.v(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        h86 h86Var = this.d;
        h86Var.getClass();
        h86Var.C0(this.b, elapsedRealtime, j, this.f);
        this.e = null;
        mv6 mv6Var = this.s;
        j86 j86Var = (j86) mv6Var.c;
        j86Var.getClass();
        ((e69) mv6Var.b).execute(j86Var);
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
                h86 h86Var = this.d;
                h86Var.getClass();
                if (this.n) {
                    h86Var.v(this.b, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 2) {
                    if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i3 = this.f + 1;
                        this.f = i3;
                        i86 w1 = h86Var.w1(this.b, elapsedRealtime, j, iOException, i3);
                        byte b = w1.a;
                        if (b == 3) {
                            this.s.d = this.e;
                            return;
                        } else if (b != 2) {
                            if (b == 1) {
                                this.f = 1;
                            }
                            long j2 = w1.b;
                            if (j2 == -9223372036854775807L) {
                                j2 = Math.min((this.f - 1) * 1000, 5000);
                            }
                            mv6 mv6Var = this.s;
                            if (((j86) mv6Var.c) == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            gre.p(z);
                            mv6Var.c = this;
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
                    h86Var.Z(this.b, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    lad.d("LoadTask", "Unexpected exception handling load completed", e);
                    this.s.d = new m86(e);
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
                lad.d("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (!this.r) {
                lad.d("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(3, new m86(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            if (!this.r) {
                lad.d("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(3, new m86(e4)).sendToTarget();
            }
        }
    }
}
