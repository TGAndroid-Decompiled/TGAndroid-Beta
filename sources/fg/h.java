package fg;

import n3.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class h extends Thread {
    public final int f6153a = 0;
    public final Object f6154b;

    public h(l lVar) {
        super("ExoPlayer:SimpleDecoder");
        this.f6154b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f6153a) {
            case 0:
                i iVar = (i) this.f6154b;
                iVar.f6163x = true;
                try {
                    i.a(iVar);
                    int glGetError = ((i) this.f6154b).f6160r.glGetError();
                    if (glGetError != 0) {
                        FileLog.e("GL error = 0x" + Integer.toHexString(glGetError));
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    while (((i) this.f6154b).f6163x) {
                        while (true) {
                            i iVar2 = (i) this.f6154b;
                            a aVar = iVar2.f6156b;
                            if (aVar == null) {
                                try {
                                    Thread.sleep(100L);
                                } catch (InterruptedException unused) {
                                }
                            } else {
                                if (iVar2.B) {
                                    synchronized (iVar2) {
                                        if (iVar2.f6163x) {
                                            aVar.onSurfaceCreated(iVar2.f6160r, iVar2.f6159n);
                                            aVar.onSurfaceChanged(iVar2.f6160r, iVar2.f6162w, iVar2.v);
                                        }
                                    }
                                    ((i) this.f6154b).B = false;
                                }
                                try {
                                    if (!i.b((i) this.f6154b)) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        i.c((i) this.f6154b, ((float) (currentTimeMillis2 - currentTimeMillis)) / 1000.0f);
                                        if (!((i) this.f6154b).M) {
                                            ((i) this.f6154b).M = true;
                                            AndroidUtilities.runOnUIThread(((i) this.f6154b).N);
                                            ((i) this.f6154b).N = null;
                                        }
                                        currentTimeMillis = currentTimeMillis2;
                                    }
                                    try {
                                        if (i.b((i) this.f6154b)) {
                                            Thread.sleep(100L);
                                        } else {
                                            for (long currentTimeMillis3 = System.currentTimeMillis(); currentTimeMillis3 - currentTimeMillis < ((i) this.f6154b).f6161s; currentTimeMillis3 = System.currentTimeMillis()) {
                                            }
                                        }
                                    } catch (InterruptedException unused2) {
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                        }
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    ((i) this.f6154b).f6163x = false;
                    return;
                }
            default:
                do {
                    try {
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                } while (((l) this.f6154b).i());
                return;
        }
    }

    public h(i iVar) {
        this.f6154b = iVar;
    }
}
