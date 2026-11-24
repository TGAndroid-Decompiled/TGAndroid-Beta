package defpackage;

import org.telegram.messenger.MediaController;
public final class d1b implements Runnable {
    public final byte a;
    public final n1b b;

    public d1b(n1b n1bVar, byte b) {
        this.a = b;
        this.b = n1bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        n1b n1bVar = this.b;
        switch (b) {
            case 0:
                l1b l1bVar = n1bVar.a0;
                if (l1bVar != null) {
                    if (l1bVar.r != null) {
                        MediaController.w().d(n1bVar.a0.r);
                        bc4.G(n1bVar.a).b(n1bVar.a0.b, false);
                        n1bVar.a0.getClass();
                    }
                    n1bVar.a0.a();
                    n1bVar.a0 = null;
                }
                n1bVar.e0.a();
                n1bVar.e0 = null;
                return;
            default:
                jlb jlbVar = n1bVar.T;
                if (jlbVar != null) {
                    n1bVar.T = null;
                    n1bVar.removeView(jlbVar);
                    return;
                }
                return;
        }
    }
}
