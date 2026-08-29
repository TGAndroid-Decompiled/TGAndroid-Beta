package dg;

import m3.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class h extends Thread {
    public final int f5587a = 0;
    public final Object f5588b;

    public h(m mVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f5588b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f5587a) {
            case 0:
                i iVar = (i) this.f5588b;
                iVar.f5598x = true;
                try {
                    i.a(iVar);
                    int glGetError = ((i) this.f5588b).f5595r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((i) this.f5588b).f5598x) {
                        while (true) {
                            i iVar2 = (i) this.f5588b;
                            a aVar = iVar2.f5590b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (iVar2.A) {
                                    synchronized (iVar2) {
                                        if (iVar2.f5598x) {
                                            aVar.onSurfaceCreated(iVar2.f5595r, iVar2.f5594n);
                                            aVar.onSurfaceChanged(iVar2.f5595r, iVar2.f5597w, iVar2.v);
                                        }
                                    }
                                    ((i) this.f5588b).A = false;
                                }
                                try {
                                    if (!i.b((i) this.f5588b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        i.c((i) this.f5588b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((i) this.f5588b).L) {
                                            ((i) this.f5588b).L = true;
                                            AndroidUtilities.runOnUIThread(((i) this.f5588b).M);
                                            ((i) this.f5588b).M = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (i.b((i) this.f5588b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((i) this.f5588b).f5596s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((i) this.f5588b).f5598x = false;
                    return;
                }
            default:
                m.access$000((m) this.f5588b);
                return;
        }
    }

    public h(i iVar) {
        this.f5588b = iVar;
    }
}
