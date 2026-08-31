package g5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
public final class i0 extends Handler implements Runnable {
    public final int f6862a;
    public final j0 f6863b;
    public final long f6864c;
    public h0 d;
    public IOException f6865e;
    public int f6866f;
    public Thread h;
    public boolean f6867n;
    public volatile boolean f6868r;
    public final m0 f6869s;

    public i0(m0 m0Var, Looper looper, j0 j0Var, h0 h0Var, int i10, long j10) {
        super(looper);
        this.f6869s = m0Var;
        this.f6863b = j0Var;
        this.d = h0Var;
        this.f6862a = i10;
        this.f6864c = j10;
    }

    public final void a(boolean z4) {
        this.f6868r = z4;
        this.f6865e = null;
        if (hasMessages(0)) {
            this.f6867n = true;
            removeMessages(0);
            if (!z4) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f6867n = true;
                    this.f6863b.l();
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
            this.f6869s.f6876b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h0 h0Var = this.d;
            h0Var.getClass();
            h0Var.u(this.f6863b, elapsedRealtime, elapsedRealtime - this.f6864c, true);
            this.d = null;
        }
    }

    @Override
    public final void handleMessage(Message message) {
        if (!this.f6868r) {
            int i10 = message.what;
            if (i10 == 0) {
                this.f6865e = null;
                m0 m0Var = this.f6869s;
                ExecutorService executorService = m0Var.f6875a;
                i0 i0Var = m0Var.f6876b;
                i0Var.getClass();
                executorService.execute(i0Var);
            } else if (i10 != 3) {
                this.f6869s.f6876b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f6864c;
                h0 h0Var = this.d;
                h0Var.getClass();
                if (this.f6867n) {
                    h0Var.u(this.f6863b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                boolean z4 = true;
                if (i11 != 1) {
                    if (i11 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f6865e = iOException;
                        int i12 = this.f6866f + 1;
                        this.f6866f = i12;
                        c4.e q10 = h0Var.q(this.f6863b, iOException, i12);
                        int i13 = q10.f2253a;
                        if (i13 == 3) {
                            this.f6869s.f6877c = this.f6865e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f6866f = 1;
                            }
                            long j11 = q10.f2254b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f6866f - 1) * 1000, 5000);
                            }
                            m0 m0Var2 = this.f6869s;
                            if (m0Var2.f6876b != null) {
                                z4 = false;
                            }
                            h5.a.i(z4);
                            m0Var2.f6876b = this;
                            if (j11 > 0) {
                                sendEmptyMessageDelayed(0, j11);
                                return;
                            }
                            this.f6865e = null;
                            m0Var2.f6875a.execute(this);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    h0Var.x(this.f6863b, elapsedRealtime, j10);
                } catch (RuntimeException e6) {
                    h5.a.p("LoadTask", "Unexpected exception handling load completed", e6);
                    this.f6869s.f6877c = new l0(e6);
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
                z4 = this.f6867n;
                this.h = Thread.currentThread();
            }
            if (!z4) {
                h5.a.c("load:".concat(this.f6863b.getClass().getSimpleName()));
                try {
                    this.f6863b.a();
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
            if (!this.f6868r) {
                sendEmptyMessage(1);
            }
        } catch (IOException e6) {
            if (!this.f6868r) {
                obtainMessage(2, e6).sendToTarget();
            }
        } catch (Exception e10) {
            if (!this.f6868r) {
                h5.a.p("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(2, new l0(e10)).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.f6868r) {
                h5.a.p("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(2, new l0(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f6868r) {
                h5.a.p("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
