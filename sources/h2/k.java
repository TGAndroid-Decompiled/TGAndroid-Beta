package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k extends Thread {
    public final int f10095a = 0;
    public final Object f10096b;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10096b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f10095a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((l) this.f10096b).j());
                return;
            default:
                sg.e eVar = (sg.e) this.f10096b;
                eVar.f42944x = true;
                try {
                    sg.e.a(eVar);
                    int glGetError = ((sg.e) this.f10096b).f42941r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((sg.e) this.f10096b).f42944x) {
                        while (true) {
                            sg.e eVar2 = (sg.e) this.f10096b;
                            sg.a aVar = eVar2.f42937b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.f42944x) {
                                            aVar.onSurfaceCreated(eVar2.f42941r, eVar2.f42940n);
                                            aVar.onSurfaceChanged(eVar2.f42941r, eVar2.f42943w, eVar2.v);
                                        }
                                    }
                                    ((sg.e) this.f10096b).E = false;
                                }
                                try {
                                    if (!sg.e.b((sg.e) this.f10096b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        sg.e.c((sg.e) this.f10096b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((sg.e) this.f10096b).P) {
                                            ((sg.e) this.f10096b).P = true;
                                            AndroidUtilities.runOnUIThread(((sg.e) this.f10096b).Q);
                                            ((sg.e) this.f10096b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (sg.e.b((sg.e) this.f10096b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((sg.e) this.f10096b).f42942s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((sg.e) this.f10096b).f42944x = false;
                    return;
                }
        }
    }

    public k(sg.e eVar) {
        this.f10096b = eVar;
    }
}
