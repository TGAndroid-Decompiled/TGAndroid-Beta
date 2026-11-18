package b3;

import a8.la;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class l extends Handler implements Runnable {
    public final int f2904a;
    public final m f2905b;
    public final long f2906c;
    public k d;
    public IOException f2907e;
    public int f2908f;
    public Thread h;
    public boolean f2909n;
    public volatile boolean f2910r;
    public final p f2911s;

    public l(p pVar, Looper looper, m mVar, k kVar, int i7, long j3) {
        super(looper);
        this.f2911s = pVar;
        this.f2905b = mVar;
        this.d = kVar;
        this.f2904a = i7;
        this.f2906c = j3;
    }

    public final void a(boolean z10) {
        this.f2910r = z10;
        this.f2907e = null;
        if (hasMessages(1)) {
            this.f2909n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f2909n = true;
                    this.f2905b.A();
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
            this.f2911s.f2915b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k kVar = this.d;
            kVar.getClass();
            kVar.p(this.f2905b, elapsedRealtime, elapsedRealtime - this.f2906c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f2906c;
        k kVar = this.d;
        kVar.getClass();
        kVar.s(this.f2905b, elapsedRealtime, j3, this.f2908f);
        this.f2907e = null;
        p pVar = this.f2911s;
        c3.a aVar = pVar.f2914a;
        l lVar = pVar.f2915b;
        lVar.getClass();
        aVar.execute(lVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f2910r) {
            int i7 = message.what;
            if (i7 == 1) {
                b();
            } else if (i7 != 4) {
                this.f2911s.f2915b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f2906c;
                k kVar = this.d;
                kVar.getClass();
                if (this.f2909n) {
                    kVar.p(this.f2905b, elapsedRealtime, j3, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 2) {
                    if (i10 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f2907e = iOException;
                        int i11 = this.f2908f + 1;
                        this.f2908f = i11;
                        i l10 = kVar.l(this.f2905b, elapsedRealtime, j3, iOException, i11);
                        int i12 = l10.f2899a;
                        if (i12 == 3) {
                            this.f2911s.f2916c = this.f2907e;
                            return;
                        } else if (i12 != 2) {
                            if (i12 == 1) {
                                this.f2908f = 1;
                            }
                            long j10 = l10.f2900b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f2908f - 1) * 1000, 5000);
                            }
                            p pVar = this.f2911s;
                            if (pVar.f2915b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            la.p(z10);
                            pVar.f2915b = this;
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
                    kVar.z(this.f2905b, elapsedRealtime, j3);
                } catch (RuntimeException e10) {
                    h2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                    this.f2911s.f2916c = new o(e10);
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
                z10 = this.f2909n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f2905b.getClass().getSimpleName()));
                try {
                    this.f2905b.a();
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
            if (!this.f2910r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e10) {
            if (!this.f2910r) {
                obtainMessage(3, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.f2910r) {
                h2.a.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new o(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.f2910r) {
                h2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new o(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.f2910r) {
                h2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
