package h2;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class k extends Thread {
    public final int f10984a = 0;
    public final Object f10985b;

    public k(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f10985b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f10984a) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e7) {
                        throw new IllegalStateException(e7);
                    }
                } while (((l) this.f10985b).j());
                return;
            default:
                sg.e eVar = (sg.e) this.f10985b;
                eVar.f46835x = true;
                try {
                    sg.e.a(eVar);
                    int glGetError = ((sg.e) this.f10985b).f46832r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((sg.e) this.f10985b).f46835x) {
                        while (true) {
                            sg.e eVar2 = (sg.e) this.f10985b;
                            sg.a aVar = eVar2.f46827b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (eVar2.E) {
                                    synchronized (eVar2) {
                                        if (eVar2.f46835x) {
                                            aVar.onSurfaceCreated(eVar2.f46832r, eVar2.f46831n);
                                            aVar.onSurfaceChanged(eVar2.f46832r, eVar2.f46834w, eVar2.v);
                                        }
                                    }
                                    ((sg.e) this.f10985b).E = false;
                                }
                                try {
                                    if (!sg.e.b((sg.e) this.f10985b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        sg.e.c((sg.e) this.f10985b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((sg.e) this.f10985b).P) {
                                            ((sg.e) this.f10985b).P = true;
                                            AndroidUtilities.runOnUIThread(((sg.e) this.f10985b).Q);
                                            ((sg.e) this.f10985b).Q = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (sg.e.b((sg.e) this.f10985b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((sg.e) this.f10985b).f46833s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((sg.e) this.f10985b).f46835x = false;
                    return;
                }
        }
    }

    public k(sg.e eVar) {
        this.f10985b = eVar;
    }
}
