package b3;

import a8.ja;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class k extends Handler implements Runnable {
    public final int f2909a;
    public final l f2910b;
    public final long f2911c;
    public j d;
    public IOException f2912e;
    public int f2913f;
    public Thread h;
    public boolean f2914n;
    public volatile boolean f2915r;
    public final o f2916s;

    public k(o oVar, Looper looper, l lVar, j jVar, int i7, long j3) {
        super(looper);
        this.f2916s = oVar;
        this.f2910b = lVar;
        this.d = jVar;
        this.f2909a = i7;
        this.f2911c = j3;
    }

    public final void a(boolean z10) {
        this.f2915r = z10;
        this.f2912e = null;
        if (hasMessages(1)) {
            this.f2914n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f2914n = true;
                    this.f2910b.D();
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
            this.f2916s.f2920b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.d;
            jVar.getClass();
            jVar.m(this.f2910b, elapsedRealtime, elapsedRealtime - this.f2911c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f2911c;
        j jVar = this.d;
        jVar.getClass();
        jVar.r(this.f2910b, elapsedRealtime, j3, this.f2913f);
        this.f2912e = null;
        o oVar = this.f2916s;
        c3.a aVar = oVar.f2919a;
        k kVar = oVar.f2920b;
        kVar.getClass();
        aVar.execute(kVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f2915r) {
            int i7 = message.what;
            if (i7 == 1) {
                b();
            } else if (i7 != 4) {
                this.f2916s.f2920b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f2911c;
                j jVar = this.d;
                jVar.getClass();
                if (this.f2914n) {
                    jVar.m(this.f2910b, elapsedRealtime, j3, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 2) {
                    if (i10 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f2912e = iOException;
                        int i11 = this.f2913f + 1;
                        this.f2913f = i11;
                        i k10 = jVar.k(this.f2910b, elapsedRealtime, j3, iOException, i11);
                        int i12 = k10.f2907a;
                        if (i12 == 3) {
                            this.f2916s.f2921c = this.f2912e;
                            return;
                        } else if (i12 != 2) {
                            if (i12 == 1) {
                                this.f2913f = 1;
                            }
                            long j10 = k10.f2908b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f2913f - 1) * 1000, 5000);
                            }
                            o oVar = this.f2916s;
                            if (oVar.f2920b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ja.p(z10);
                            oVar.f2920b = this;
                            if (j10 > 0) {
                                sendEmptyMessageDelayed(1, j10);
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
                    jVar.w(this.f2910b, elapsedRealtime, j3);
                } catch (RuntimeException e10) {
                    h2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                    this.f2916s.f2921c = new n(e10);
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
                z10 = this.f2914n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f2910b.getClass().getSimpleName()));
                try {
                    this.f2910b.a();
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
            if (!this.f2915r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e10) {
            if (!this.f2915r) {
                obtainMessage(3, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.f2915r) {
                h2.a.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new n(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.f2915r) {
                h2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new n(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.f2915r) {
                h2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
