package b3;

import a8.ia;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class k extends Handler implements Runnable {
    public final int f2952a;
    public final l f2953b;
    public final long f2954c;
    public j d;
    public IOException f2955e;
    public int f2956f;
    public Thread h;
    public boolean f2957n;
    public volatile boolean f2958r;
    public final o f2959s;

    public k(o oVar, Looper looper, l lVar, j jVar, int i7, long j3) {
        super(looper);
        this.f2959s = oVar;
        this.f2953b = lVar;
        this.d = jVar;
        this.f2952a = i7;
        this.f2954c = j3;
    }

    public final void a(boolean z9) {
        this.f2958r = z9;
        this.f2955e = null;
        if (hasMessages(1)) {
            this.f2957n = true;
            removeMessages(1);
            if (!z9) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f2957n = true;
                    this.f2953b.q0();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z9) {
            this.f2959s.f2963b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j jVar = this.d;
            jVar.getClass();
            jVar.q0(this.f2953b, elapsedRealtime, elapsedRealtime - this.f2954c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f2954c;
        j jVar = this.d;
        jVar.getClass();
        jVar.M0(this.f2953b, elapsedRealtime, j3, this.f2956f);
        this.f2955e = null;
        o oVar = this.f2959s;
        c3.a aVar = oVar.f2962a;
        k kVar = oVar.f2963b;
        kVar.getClass();
        aVar.execute(kVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z9;
        if (!this.f2958r) {
            int i7 = message.what;
            if (i7 == 1) {
                b();
            } else if (i7 != 4) {
                this.f2959s.f2963b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f2954c;
                j jVar = this.d;
                jVar.getClass();
                if (this.f2957n) {
                    jVar.q0(this.f2953b, elapsedRealtime, j3, false);
                    return;
                }
                int i10 = message.what;
                if (i10 != 2) {
                    if (i10 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f2955e = iOException;
                        int i11 = this.f2956f + 1;
                        this.f2956f = i11;
                        i o02 = jVar.o0(this.f2953b, elapsedRealtime, j3, iOException, i11);
                        int i12 = o02.f2950a;
                        if (i12 == 3) {
                            this.f2959s.f2964c = this.f2955e;
                            return;
                        } else if (i12 != 2) {
                            if (i12 == 1) {
                                this.f2956f = 1;
                            }
                            long j10 = o02.f2951b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f2956f - 1) * 1000, 5000);
                            }
                            o oVar = this.f2959s;
                            if (oVar.f2963b == null) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            ia.p(z9);
                            oVar.f2963b = this;
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
                    jVar.o1(this.f2953b, elapsedRealtime, j3);
                } catch (RuntimeException e10) {
                    h2.a.d("LoadTask", "Unexpected exception handling load completed", e10);
                    this.f2959s.f2964c = new n(e10);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override
    public final void run() {
        boolean z9;
        try {
            synchronized (this) {
                z9 = this.f2957n;
                this.h = Thread.currentThread();
            }
            if (!z9) {
                Trace.beginSection("load:".concat(this.f2953b.getClass().getSimpleName()));
                try {
                    this.f2953b.a();
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
            if (!this.f2958r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e10) {
            if (!this.f2958r) {
                obtainMessage(3, e10).sendToTarget();
            }
        } catch (Exception e11) {
            if (!this.f2958r) {
                h2.a.d("LoadTask", "Unexpected exception loading stream", e11);
                obtainMessage(3, new n(e11)).sendToTarget();
            }
        } catch (OutOfMemoryError e12) {
            if (!this.f2958r) {
                h2.a.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new n(e12)).sendToTarget();
            }
        } catch (Error e13) {
            if (!this.f2958r) {
                h2.a.d("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
