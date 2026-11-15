package b3;

import a8.ja;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class k extends Handler implements Runnable {
    public final int f2906a;
    public final l f2907b;
    public final long f2908c;
    public j d;
    public IOException f2909e;
    public int f2910f;
    public Thread h;
    public boolean f2911n;
    public volatile boolean f2912r;
    public final o f2913s;

    public k(o oVar, Looper looper, l lVar, j jVar, int i7, long j3) {
        super(looper);
        this.f2913s = oVar;
        this.f2907b = lVar;
        this.d = jVar;
        this.f2906a = i7;
        this.f2908c = j3;
    }

    public final void a(boolean z10) {
        this.f2912r = z10;
        this.f2909e = null;
        if (hasMessages(1)) {
            this.f2911n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f2911n = true;
                    this.f2907b.D();
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
            this.f2913s.f2917b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.d;
            jVar.getClass();
            jVar.m(this.f2907b, elapsedRealtime, elapsedRealtime - this.f2908c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f2908c;
        j jVar = this.d;
        jVar.getClass();
        jVar.r(this.f2907b, elapsedRealtime, j3, this.f2910f);
        this.f2909e = null;
        o oVar = this.f2913s;
        c3.a aVar = oVar.f2916a;
        k kVar = oVar.f2917b;
        kVar.getClass();
        aVar.execute(kVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f2912r) {
            int i7 = message.what;
            if (i7 == 1) {
                b();
            } else if (i7 != 4) {
                this.f2913s.f2917b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f2908c;
                j jVar = this.d;
                jVar.getClass();
                if (this.f2911n) {
                    jVar.m(this.f2907b, elapsedRealtime, j3, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 2) {
                    if (i10 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f2909e = iOException;
                        int i11 = this.f2910f + 1;
                        this.f2910f = i11;
                        i k10 = jVar.k(this.f2907b, elapsedRealtime, j3, iOException, i11);
                        int i12 = k10.f2904a;
                        if (i12 == 3) {
                            this.f2913s.f2918c = this.f2909e;
                            return;
                        } else if (i12 != 2) {
                            if (i12 == 1) {
                                this.f2910f = 1;
                            }
                            long j10 = k10.f2905b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f2910f - 1) * 1000, 5000);
                            }
                            o oVar = this.f2913s;
                            if (oVar.f2917b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            ja.p(z10);
                            oVar.f2917b = this;
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
                    jVar.w(this.f2907b, elapsedRealtime, j3);
                } catch (RuntimeException e10) {
                    h2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                    this.f2913s.f2918c = new n(e10);
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
                z10 = this.f2911n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f2907b.getClass().getSimpleName()));
                try {
                    this.f2907b.a();
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
            if (!this.f2912r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e10) {
            if (!this.f2912r) {
                obtainMessage(3, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.f2912r) {
                h2.a.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new n(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.f2912r) {
                h2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new n(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.f2912r) {
                h2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
