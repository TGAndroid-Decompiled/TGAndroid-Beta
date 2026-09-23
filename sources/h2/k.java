package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k extends Thread {
    public final int f10082a = 0;
    public final Object f10083b;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10083b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f10082a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (((l) this.f10083b).j());
                return;
            default:
                sg.e eVar = (sg.e) this.f10083b;
                eVar.f42896x = true;
                try {
                    sg.e.a(eVar);
                    int glGetError = ((sg.e) this.f10083b).f42893r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((sg.e) this.f10083b).f42896x) {
                        while (true) {
                            sg.e eVar2 = (sg.e) this.f10083b;
                            sg.a aVar = eVar2.f42889b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.f42896x) {
                                            aVar.onSurfaceCreated(eVar2.f42893r, eVar2.f42892n);
                                            aVar.onSurfaceChanged(eVar2.f42893r, eVar2.f42895w, eVar2.v);
                                        }
                                    }
                                    ((sg.e) this.f10083b).E = false;
                                }
                                try {
                                    if (!sg.e.b((sg.e) this.f10083b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        sg.e.c((sg.e) this.f10083b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((sg.e) this.f10083b).P) {
                                            ((sg.e) this.f10083b).P = true;
                                            AndroidUtilities.runOnUIThread(((sg.e) this.f10083b).Q);
                                            ((sg.e) this.f10083b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (sg.e.b((sg.e) this.f10083b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((sg.e) this.f10083b).f42894s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((sg.e) this.f10083b).f42896x = false;
                    return;
                }
        }
    }

    public k(sg.e eVar) {
        this.f10083b = eVar;
    }
}
