package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k extends Thread {
    public final int f9213a = 0;
    public final Object f9214b;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f9214b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f9213a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((l) this.f9214b).j());
                return;
            default:
                rg.f fVar = (rg.f) this.f9214b;
                fVar.f41492x = true;
                try {
                    rg.f.a(fVar);
                    int glGetError = ((rg.f) this.f9214b).f41489r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((rg.f) this.f9214b).f41492x) {
                        while (true) {
                            rg.f fVar2 = (rg.f) this.f9214b;
                            rg.a aVar = fVar2.f41485b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (fVar2.E) {
                                    synchronized (fVar2) {
                                        if (fVar2.f41492x) {
                                            aVar.onSurfaceCreated(fVar2.f41489r, fVar2.f41488n);
                                            aVar.onSurfaceChanged(fVar2.f41489r, fVar2.f41491w, fVar2.v);
                                        }
                                    }
                                    ((rg.f) this.f9214b).E = false;
                                }
                                try {
                                    if (!rg.f.b((rg.f) this.f9214b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        rg.f.c((rg.f) this.f9214b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((rg.f) this.f9214b).P) {
                                            ((rg.f) this.f9214b).P = true;
                                            AndroidUtilities.runOnUIThread(((rg.f) this.f9214b).Q);
                                            ((rg.f) this.f9214b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (rg.f.b((rg.f) this.f9214b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((rg.f) this.f9214b).f41490s; currentTimeMillis3 = System.currentTimeMillis()) {
                                            }
                                        }
                                    } catch (InterruptedException unused2) {
                                    }
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    ((rg.f) this.f9214b).f41492x = false;
                    return;
                }
        }
    }

    public k(rg.f fVar) {
        this.f9214b = fVar;
    }
}
