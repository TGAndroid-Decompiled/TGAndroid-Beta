package defpackage;

import org.telegram.messenger.MediaController;
public final class b3b implements Runnable {
    public final byte a;
    public final k3b b;

    public b3b(k3b k3bVar, byte b) {
        this.a = b;
        this.b = k3bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k3b k3bVar = this.b;
        switch (b) {
            case 0:
                hnb hnbVar = k3bVar.T;
                if (hnbVar != null) {
                    k3bVar.T = null;
                    k3bVar.removeView(hnbVar);
                    return;
                }
                return;
            default:
                i3b i3bVar = k3bVar.a0;
                if (i3bVar != null) {
                    if (i3bVar.r != null) {
                        MediaController.z().d(k3bVar.a0.r);
                        xb4.G(k3bVar.a).b(k3bVar.a0.b, false);
                        k3bVar.a0.getClass();
                    }
                    k3bVar.a0.a();
                    k3bVar.a0 = null;
                }
                k3bVar.e0.a();
                k3bVar.e0 = null;
                return;
        }
    }
}
