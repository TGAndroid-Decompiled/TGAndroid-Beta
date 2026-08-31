package gg;

import n3.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class h extends Thread {
    public final int f7084a = 0;
    public final Object f7085b;

    public h(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f7085b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f7084a) {
            case 0:
                i iVar = (i) this.f7085b;
                iVar.f7095x = true;
                try {
                    i.a(iVar);
                    int glGetError = ((i) this.f7085b).f7092r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((i) this.f7085b).f7095x) {
                        while (true) {
                            i iVar2 = (i) this.f7085b;
                            a aVar = iVar2.f7087b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (iVar2.B) {
                                    synchronized (iVar2) {
                                        if (iVar2.f7095x) {
                                            aVar.onSurfaceCreated(iVar2.f7092r, iVar2.f7091n);
                                            aVar.onSurfaceChanged(iVar2.f7092r, iVar2.f7094w, iVar2.v);
                                        }
                                    }
                                    ((i) this.f7085b).B = false;
                                }
                                try {
                                    if (!i.b((i) this.f7085b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        i.c((i) this.f7085b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((i) this.f7085b).M) {
                                            ((i) this.f7085b).M = true;
                                            AndroidUtilities.runOnUIThread(((i) this.f7085b).N);
                                            ((i) this.f7085b).N = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (i.b((i) this.f7085b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((i) this.f7085b).f7093s; currentTimeMillis3 = System.currentTimeMillis()) {
                                            }
                                        }
                                    } catch (InterruptedException unused2) {
                                    }
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    ((i) this.f7085b).f7095x = false;
                    return;
                }
            default:
                do {
                    try {
                    } catch (InterruptedException e11) {
                        throw new IllegalStateException(e11);
                    }
                } while (((l) this.f7085b).i());
                return;
        }
    }

    public h(i iVar) {
        this.f7085b = iVar;
    }
}
