package bi;

import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
public final class aa implements Runnable {
    public final int f3462a;
    public final ca f3463b;

    public aa(ca caVar, int i7) {
        this.f3462a = i7;
        this.f3463b = caVar;
    }

    @Override
    public final void run() {
        int i7 = this.f3462a;
        ca caVar = this.f3463b;
        switch (i7) {
            case 0:
                caVar.b();
                return;
            case 1:
                caVar.a();
                return;
            default:
                org.telegram.ui.Components.cc ccVar = caVar.d;
                ea eaVar = caVar.f3601q;
                aa aaVar = caVar.f3600p;
                ij ijVar = caVar.f3588b;
                if (!caVar.f3596l) {
                    caVar.f3596l = true;
                    ijVar.f((int) caVar.f3595k, caVar.c(), true);
                    long j3 = eaVar.f3812g;
                    int i10 = eaVar.f3807a;
                    eaVar.f3812g = j3 + caVar.f3595k;
                    qs.f(i10).k(221, new Object[0]);
                    caVar.f3595k = 0L;
                    qs.f(i10).k(103, Long.valueOf(ij.B0(ijVar.f23262k)), Integer.valueOf(ijVar.e1()), ijVar.f23262k.reactions);
                }
                if (!caVar.f3597m) {
                    caVar.f3597m = true;
                    caVar.f3591f.f39024b = 5000L;
                    org.telegram.messenger.g0.r(aaVar);
                    org.telegram.messenger.g0.i3(aaVar, 5000L);
                    ccVar.k(true);
                    ccVar.v = aaVar;
                }
                caVar.f3590e.f40029b.setText(caVar.d());
                return;
        }
    }
}
