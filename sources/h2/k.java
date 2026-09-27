package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k extends Thread {
    public final int f10087a = 0;
    public final Object f10088b;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10088b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f10087a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((l) this.f10088b).j());
                return;
            default:
                sg.e eVar = (sg.e) this.f10088b;
                eVar.f43277x = true;
                try {
                    sg.e.a(eVar);
                    int glGetError = ((sg.e) this.f10088b).f43274r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((sg.e) this.f10088b).f43277x) {
                        while (true) {
                            sg.e eVar2 = (sg.e) this.f10088b;
                            sg.a aVar = eVar2.f43270b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.f43277x) {
                                            aVar.onSurfaceCreated(eVar2.f43274r, eVar2.f43273n);
                                            aVar.onSurfaceChanged(eVar2.f43274r, eVar2.f43276w, eVar2.v);
                                        }
                                    }
                                    ((sg.e) this.f10088b).E = false;
                                }
                                try {
                                    if (!sg.e.b((sg.e) this.f10088b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        sg.e.c((sg.e) this.f10088b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((sg.e) this.f10088b).P) {
                                            ((sg.e) this.f10088b).P = true;
                                            AndroidUtilities.runOnUIThread(((sg.e) this.f10088b).Q);
                                            ((sg.e) this.f10088b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (sg.e.b((sg.e) this.f10088b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((sg.e) this.f10088b).f43275s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((sg.e) this.f10088b).f43277x = false;
                    return;
                }
        }
    }

    public k(sg.e eVar) {
        this.f10088b = eVar;
    }
}
