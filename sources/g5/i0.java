package g5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
public final class i0 extends Handler implements Runnable {
    public final int f6381a;
    public final j0 f6382b;
    public final long f6383c;
    public h0 d;
    public IOException e;
    public int f6384f;
    public Thread h;
    public boolean f6385n;
    public volatile boolean f6386r;
    public final m0 f6387s;

    public i0(m0 m0Var, Looper looper, j0 j0Var, h0 h0Var, int i10, long j10) {
        super(looper);
        this.f6387s = m0Var;
        this.f6382b = j0Var;
        this.d = h0Var;
        this.f6381a = i10;
        this.f6383c = j10;
    }

    public final void a(boolean z4) {
        this.f6386r = z4;
        this.e = null;
        if (hasMessages(0)) {
            this.f6385n = true;
            removeMessages(0);
            if (!z4) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f6385n = true;
                    this.f6382b.b();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z4) {
            this.f6387s.f6393b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h0 h0Var = this.d;
            h0Var.getClass();
            h0Var.x0(this.f6382b, elapsedRealtime, elapsedRealtime - this.f6383c, true);
            this.d = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        if (!this.f6386r) {
            int i10 = message.what;
            if (i10 == 0) {
                this.e = null;
                m0 m0Var = this.f6387s;
                ExecutorService executorService = m0Var.f6392a;
                i0 i0Var = m0Var.f6393b;
                i0Var.getClass();
                executorService.execute(i0Var);
            } else if (i10 != 3) {
                this.f6387s.f6393b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f6383c;
                h0 h0Var = this.d;
                h0Var.getClass();
                if (this.f6385n) {
                    h0Var.x0(this.f6382b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                boolean z4 = true;
                if (i11 != 1) {
                    if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f6384f + 1;
                        this.f6384f = i12;
                        c4.e X = h0Var.X(this.f6382b, iOException, i12);
                        int i13 = X.f2095a;
                        if (i13 == 3) {
                            this.f6387s.f6394c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f6384f = 1;
                            }
                            long j11 = X.f2096b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f6384f - 1) * 1000, 5000);
                            }
                            m0 m0Var2 = this.f6387s;
                            if (m0Var2.f6393b != null) {
                                z4 = false;
                            }
                            h5.a.i(z4);
                            m0Var2.f6393b = this;
                            if (j11 > 0) {
                                sendEmptyMessageDelayed(0, j11);
                                return;
                            }
                            this.e = null;
                            m0Var2.f6392a.execute(this);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    h0Var.k1(this.f6382b, elapsedRealtime, j10);
                } catch (RuntimeException e) {
                    h5.a.p("LoadTask", "Unexpected exception handling load completed", e);
                    this.f6387s.f6394c = new l0(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.f6385n;
                this.h = Thread.currentThread();
            }
            if (!z4) {
                h5.a.c("load:".concat(this.f6382b.getClass().getSimpleName()));
                try {
                    this.f6382b.a();
                    h5.a.q();
                } catch (Throwable th2) {
                    h5.a.q();
                    throw th2;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (!this.f6386r) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.f6386r) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e6) {
            if (!this.f6386r) {
                h5.a.p("LoadTask", "Unexpected exception loading stream", e6);
                obtainMessage(2, new l0(e6)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f6386r) {
                h5.a.p("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(2, new l0(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f6386r) {
                h5.a.p("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(3, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
