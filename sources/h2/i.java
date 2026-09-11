package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class i extends Thread {
    public final int f10854a = 0;
    public final Object f10855b;

    public i(j jVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10855b = jVar;
    }

    @Override
    public final void run() {
        switch (this.f10854a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e7) {
                        throw new IllegalStateException(e7);
                    }
                } while (((j) this.f10855b).j());
                return;
            default:
                tg.e eVar = (tg.e) this.f10855b;
                eVar.f46527x = true;
                try {
                    tg.e.a(eVar);
                    int glGetError = ((tg.e) this.f10855b).f46524r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((tg.e) this.f10855b).f46527x) {
                        while (true) {
                            tg.e eVar2 = (tg.e) this.f10855b;
                            tg.a aVar = eVar2.f46519b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.f46527x) {
                                            aVar.onSurfaceCreated(eVar2.f46524r, eVar2.f46523n);
                                            aVar.onSurfaceChanged(eVar2.f46524r, eVar2.f46526w, eVar2.v);
                                        }
                                    }
                                    ((tg.e) this.f10855b).E = false;
                                }
                                try {
                                    if (!tg.e.b((tg.e) this.f10855b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        tg.e.c((tg.e) this.f10855b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((tg.e) this.f10855b).P) {
                                            ((tg.e) this.f10855b).P = true;
                                            AndroidUtilities.runOnUIThread(((tg.e) this.f10855b).Q);
                                            ((tg.e) this.f10855b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (tg.e.b((tg.e) this.f10855b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((tg.e) this.f10855b).f46525s; currentTimeMillis3 = System.currentTimeMillis()) {
                                            }
                                        }
                                    } catch (InterruptedException unused2) {
                                    }
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    ((tg.e) this.f10855b).f46527x = false;
                    return;
                }
        }
    }

    public i(tg.e eVar) {
        this.f10855b = eVar;
    }
}
