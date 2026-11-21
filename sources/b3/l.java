package b3;

import a8.la;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class l extends Handler implements Runnable {
    public final int f2916a;
    public final m f2917b;
    public final long f2918c;
    public k d;
    public IOException f2919e;
    public int f2920f;
    public Thread h;
    public boolean f2921n;
    public volatile boolean f2922r;
    public final p f2923s;

    public l(p pVar, Looper looper, m mVar, k kVar, int i7, long j3) {
        super(looper);
        this.f2923s = pVar;
        this.f2917b = mVar;
        this.d = kVar;
        this.f2916a = i7;
        this.f2918c = j3;
    }

    public final void a(boolean z10) {
        this.f2922r = z10;
        this.f2919e = null;
        if (hasMessages(1)) {
            this.f2921n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f2921n = true;
                    this.f2917b.A();
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
            this.f2923s.f2927b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            k kVar = this.d;
            kVar.getClass();
            kVar.p(this.f2917b, elapsedRealtime, elapsedRealtime - this.f2918c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f2918c;
        k kVar = this.d;
        kVar.getClass();
        kVar.s(this.f2917b, elapsedRealtime, j3, this.f2920f);
        this.f2919e = null;
        p pVar = this.f2923s;
        c3.a aVar = pVar.f2926a;
        l lVar = pVar.f2927b;
        lVar.getClass();
        aVar.execute(lVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f2922r) {
            int i7 = message.what;
            if (i7 == 1) {
                b();
            } else if (i7 != 4) {
                this.f2923s.f2927b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f2918c;
                k kVar = this.d;
                kVar.getClass();
                if (this.f2921n) {
                    kVar.p(this.f2917b, elapsedRealtime, j3, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 2) {
                    if (i10 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f2919e = iOException;
                        int i11 = this.f2920f + 1;
                        this.f2920f = i11;
                        i l10 = kVar.l(this.f2917b, elapsedRealtime, j3, iOException, i11);
                        int i12 = l10.f2911a;
                        if (i12 == 3) {
                            this.f2923s.f2928c = this.f2919e;
                            return;
                        } else if (i12 != 2) {
                            if (i12 == 1) {
                                this.f2920f = 1;
                            }
                            long j10 = l10.f2912b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f2920f - 1) * 1000, 5000);
                            }
                            p pVar = this.f2923s;
                            if (pVar.f2927b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            la.p(z10);
                            pVar.f2927b = this;
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
                    kVar.z(this.f2917b, elapsedRealtime, j3);
                } catch (RuntimeException e10) {
                    h2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                    this.f2923s.f2928c = new o(e10);
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
                z10 = this.f2921n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f2917b.getClass().getSimpleName()));
                try {
                    this.f2917b.a();
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
            if (!this.f2922r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e10) {
            if (!this.f2922r) {
                obtainMessage(3, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.f2922r) {
                h2.a.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new o(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.f2922r) {
                h2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new o(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.f2922r) {
                h2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
