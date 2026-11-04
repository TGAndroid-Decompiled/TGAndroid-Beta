package a3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import b8.zb;
import java.io.IOException;
public final class l extends Handler implements Runnable {
    public final int f95a;
    public final m f96b;
    public final long f97c;
    public k d;
    public IOException f98e;
    public int f99f;
    public Thread h;
    public boolean f100n;
    public volatile boolean f101r;
    public final q f102s;

    public l(q qVar, Looper looper, m mVar, k kVar, int i3, long j10) {
        super(looper);
        this.f102s = qVar;
        this.f96b = mVar;
        this.d = kVar;
        this.f95a = i3;
        this.f97c = j10;
    }

    public final void a(boolean z10) {
        this.f101r = z10;
        this.f98e = null;
        if (hasMessages(1)) {
            this.f100n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f100n = true;
                    this.f96b.X1();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f102s.f108b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k kVar = this.d;
            kVar.getClass();
            kVar.q0(this.f96b, elapsedRealtime, elapsedRealtime - this.f97c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f97c;
        k kVar = this.d;
        kVar.getClass();
        kVar.M(this.f96b, elapsedRealtime, j10, this.f99f);
        this.f98e = null;
        q qVar = this.f102s;
        b3.a aVar = qVar.f107a;
        l lVar = qVar.f108b;
        lVar.getClass();
        aVar.execute(lVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f101r) {
            int i3 = message.what;
            if (i3 == 1) {
                b();
            } else if (i3 != 4) {
                this.f102s.f108b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f97c;
                k kVar = this.d;
                kVar.getClass();
                if (this.f100n) {
                    kVar.q0(this.f96b, elapsedRealtime, j10, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 2) {
                    if (i10 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f98e = iOException;
                        int i11 = this.f99f + 1;
                        this.f99f = i11;
                        i k10 = kVar.k(this.f96b, elapsedRealtime, j10, iOException, i11);
                        int i12 = k10.f92a;
                        if (i12 == 3) {
                            this.f102s.f109c = this.f98e;
                            return;
                        } else if (i12 != 2) {
                            if (i12 == 1) {
                                this.f99f = 1;
                            }
                            long j11 = k10.f93b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f99f - 1) * 1000, 5000);
                            }
                            q qVar = this.f102s;
                            if (qVar.f108b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            zb.p(z10);
                            qVar.f108b = this;
                            if (j11 > 0) {
                                sendEmptyMessageDelayed(1, j11);
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
                    kVar.h(this.f96b, elapsedRealtime, j10);
                } catch (RuntimeException e10) {
                    g2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                    this.f102s.f109c = new p(e10);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f100n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f96b.getClass().getSimpleName()));
                try {
                    this.f96b.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (!this.f101r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e10) {
            if (!this.f101r) {
                obtainMessage(3, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.f101r) {
                g2.a.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new p(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.f101r) {
                g2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new p(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.f101r) {
                g2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
