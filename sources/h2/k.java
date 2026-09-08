package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k extends Thread {
    public final int f10880a = 0;
    public final Object f10881b;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10881b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f10880a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e7) {
                        throw new IllegalStateException(e7);
                    }
                } while (((l) this.f10881b).j());
                return;
            default:
                tg.e eVar = (tg.e) this.f10881b;
                eVar.f46555x = true;
                try {
                    tg.e.a(eVar);
                    int glGetError = ((tg.e) this.f10881b).f46552r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((tg.e) this.f10881b).f46555x) {
                        while (true) {
                            tg.e eVar2 = (tg.e) this.f10881b;
                            tg.a aVar = eVar2.f46547b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.f46555x) {
                                            aVar.onSurfaceCreated(eVar2.f46552r, eVar2.f46551n);
                                            aVar.onSurfaceChanged(eVar2.f46552r, eVar2.f46554w, eVar2.v);
                                        }
                                    }
                                    ((tg.e) this.f10881b).E = false;
                                }
                                try {
                                    if (!tg.e.b((tg.e) this.f10881b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        tg.e.c((tg.e) this.f10881b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((tg.e) this.f10881b).P) {
                                            ((tg.e) this.f10881b).P = true;
                                            AndroidUtilities.runOnUIThread(((tg.e) this.f10881b).Q);
                                            ((tg.e) this.f10881b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (tg.e.b((tg.e) this.f10881b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((tg.e) this.f10881b).f46553s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((tg.e) this.f10881b).f46555x = false;
                    return;
                }
        }
    }

    public k(tg.e eVar) {
        this.f10881b = eVar;
    }
}
