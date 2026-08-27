package bg;

import k3.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public final class h extends Thread {

    public final int f2126a = 0;

    public final Object f2127b;

    public h(m mVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f2127b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f2126a) {
            case 0:
                i iVar = (i) this.f2127b;
                iVar.f2137x = true;
                try {
                    i.a(iVar);
                    int iGlGetError = ((i) this.f2127b).f2134r.glGetError();
                    if (iGlGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(iGlGetError));
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    while (((i) this.f2127b).f2137x) {
                        while (true) {
                            i iVar2 = (i) this.f2127b;
                            a aVar = iVar2.f2129b;
                            if (aVar != null) {
                                if (iVar2.A) {
                                    synchronized (iVar2) {
                                        if (iVar2.f2137x) {
                                            aVar.onSurfaceCreated(iVar2.f2134r, iVar2.f2133n);
                                            aVar.onSurfaceChanged(iVar2.f2134r, iVar2.f2136w, iVar2.v);
                                        }
                                        break;
                                    }
                                    ((i) this.f2127b).A = false;
                                }
                                try {
                                    if (!i.b((i) this.f2127b)) {
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        i.c((i) this.f2127b, (jCurrentTimeMillis2 - jCurrentTimeMillis) / 1000.0f);
                                        if (!((i) this.f2127b).L) {
                                            ((i) this.f2127b).L = true;
                                            AndroidUtilities.runOnUIThread(((i) this.f2127b).M);
                                            ((i) this.f2127b).M = null;
                                        }
                                        jCurrentTimeMillis = jCurrentTimeMillis2;
                                    }
                                    try {
                                        if (i.b((i) this.f2127b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long jCurrentTimeMillis3 = System.currentTimeMillis(); jCurrentTimeMillis3 - jCurrentTimeMillis < ((i) this.f2127b).f2135s; jCurrentTimeMillis3 = System.currentTimeMillis()) {
                                            }
                                        }
                                    } catch (InterruptedException unused) {
                                    }
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    return;
                                }
                                break;
                            } else {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused2) {
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    ((i) this.f2127b).f2137x = false;
                    return;
                }
            default:
                m.access$000((m) this.f2127b);
                return;
        }
    }

    public h(i iVar) {
        this.f2127b = iVar;
    }
}
