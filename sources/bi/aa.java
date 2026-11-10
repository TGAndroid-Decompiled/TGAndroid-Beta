package bi;

import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
public final class aa implements Runnable {
    public final int f3465a;
    public final ca f3466b;

    public aa(ca caVar, int i7) {
        this.f3465a = i7;
        this.f3466b = caVar;
    }

    @Override
    public final void run() {
        int i7 = this.f3465a;
        ca caVar = this.f3466b;
        switch (i7) {
            case 0:
                caVar.b();
                return;
            case 1:
                caVar.a();
                return;
            default:
                org.telegram.ui.Components.bc bcVar = caVar.d;
                ea eaVar = caVar.f3604q;
                aa aaVar = caVar.f3603p;
                ij ijVar = caVar.f3591b;
                if (!caVar.f3599l) {
                    caVar.f3599l = true;
                    ijVar.f((int) caVar.f3598k, caVar.c(), true);
                    long j3 = eaVar.f3809g;
                    int i10 = eaVar.f3804a;
                    eaVar.f3809g = j3 + caVar.f3598k;
                    qs.f(i10).k(221, new Object[0]);
                    caVar.f3598k = 0L;
                    qs.f(i10).k(103, Long.valueOf(ij.B0(ijVar.f23266k)), Integer.valueOf(ijVar.e1()), ijVar.f23266k.reactions);
                }
                if (!caVar.f3600m) {
                    caVar.f3600m = true;
                    caVar.f3594f.f38609b = 5000L;
                    org.telegram.messenger.g0.r(aaVar);
                    org.telegram.messenger.g0.i3(aaVar, 5000L);
                    bcVar.k(true);
                    bcVar.v = aaVar;
                }
                caVar.f3593e.f38980b.setText(caVar.d());
                return;
        }
    }
}
