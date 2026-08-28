package ag;

import k3.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class i extends Thread {
    public final int f202a = 0;
    public final Object f203b;

    public i(m mVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f203b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f202a) {
            case 0:
                j jVar = (j) this.f203b;
                jVar.f213x = true;
                try {
                    j.a(jVar);
                    int glGetError = ((j) this.f203b).f210r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((j) this.f203b).f213x) {
                        while (true) {
                            j jVar2 = (j) this.f203b;
                            a aVar = jVar2.f205b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (jVar2.A) {
                                    synchronized (jVar2) {
                                        if (jVar2.f213x) {
                                            aVar.onSurfaceCreated(jVar2.f210r, jVar2.f209n);
                                            aVar.onSurfaceChanged(jVar2.f210r, jVar2.f212w, jVar2.v);
                                        }
                                    }
                                    ((j) this.f203b).A = false;
                                }
                                try {
                                    if (!j.b((j) this.f203b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        j.c((j) this.f203b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((j) this.f203b).L) {
                                            ((j) this.f203b).L = true;
                                            AndroidUtilities.runOnUIThread(((j) this.f203b).M);
                                            ((j) this.f203b).M = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (j.b((j) this.f203b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((j) this.f203b).f211s; currentTimeMillis3 = System.currentTimeMillis()) {
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
                    ((j) this.f203b).f213x = false;
                    return;
                }
            default:
                m.access$000((m) this.f203b);
                return;
        }
    }

    public i(j jVar) {
        this.f203b = jVar;
    }
}
