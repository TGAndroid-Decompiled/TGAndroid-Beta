package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k extends Thread {
    public final int f10096a = 0;
    public final Object f10097b;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10097b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f10096a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((l) this.f10097b).j());
                return;
            default:
                sg.e eVar = (sg.e) this.f10097b;
                eVar.f42940x = true;
                try {
                    sg.e.a(eVar);
                    int glGetError = ((sg.e) this.f10097b).f42937r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((sg.e) this.f10097b).f42940x) {
                        while (true) {
                            sg.e eVar2 = (sg.e) this.f10097b;
                            sg.a aVar = eVar2.f42933b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.f42940x) {
                                            aVar.onSurfaceCreated(eVar2.f42937r, eVar2.f42936n);
                                            aVar.onSurfaceChanged(eVar2.f42937r, eVar2.f42939w, eVar2.v);
                                        }
                                    }
                                    ((sg.e) this.f10097b).E = false;
                                }
                                try {
                                    if (!sg.e.b((sg.e) this.f10097b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        sg.e.c((sg.e) this.f10097b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((sg.e) this.f10097b).P) {
                                            ((sg.e) this.f10097b).P = true;
                                            AndroidUtilities.runOnUIThread(((sg.e) this.f10097b).Q);
                                            ((sg.e) this.f10097b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (sg.e.b((sg.e) this.f10097b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((sg.e) this.f10097b).f42938s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((sg.e) this.f10097b).f42940x = false;
                    return;
                }
        }
    }

    public k(sg.e eVar) {
        this.f10097b = eVar;
    }
}
