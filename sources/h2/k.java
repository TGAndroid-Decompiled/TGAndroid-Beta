package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k extends Thread {
    public final int f10100a = 0;
    public final Object f10101b;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10101b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f10100a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((l) this.f10101b).j());
                return;
            default:
                sg.e eVar = (sg.e) this.f10101b;
                eVar.f43246x = true;
                try {
                    sg.e.a(eVar);
                    int glGetError = ((sg.e) this.f10101b).f43243r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((sg.e) this.f10101b).f43246x) {
                        while (true) {
                            sg.e eVar2 = (sg.e) this.f10101b;
                            sg.a aVar = eVar2.f43239b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.f43246x) {
                                            aVar.onSurfaceCreated(eVar2.f43243r, eVar2.f43242n);
                                            aVar.onSurfaceChanged(eVar2.f43243r, eVar2.f43245w, eVar2.v);
                                        }
                                    }
                                    ((sg.e) this.f10101b).E = false;
                                }
                                try {
                                    if (!sg.e.b((sg.e) this.f10101b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        sg.e.c((sg.e) this.f10101b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((sg.e) this.f10101b).P) {
                                            ((sg.e) this.f10101b).P = true;
                                            AndroidUtilities.runOnUIThread(((sg.e) this.f10101b).Q);
                                            ((sg.e) this.f10101b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (sg.e.b((sg.e) this.f10101b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((sg.e) this.f10101b).f43244s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((sg.e) this.f10101b).f43246x = false;
                    return;
                }
        }
    }

    public k(sg.e eVar) {
        this.f10101b = eVar;
    }
}
