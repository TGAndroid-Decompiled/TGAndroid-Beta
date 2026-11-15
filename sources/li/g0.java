package li;

import org.telegram.ui.Components.cc;
import org.telegram.ui.an;
public final class g0 implements Runnable {
    public final int f19572a = 0;
    public final an f19573b;
    public final boolean f19574c;
    public final int d;

    public g0(int i7, an anVar, boolean z10) {
        this.d = i7;
        this.f19573b = anVar;
        this.f19574c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19572a) {
            case 0:
                int i7 = this.d;
                an anVar = this.f19573b;
                if (i7 != 2) {
                    anVar.xa();
                    anVar.Fc();
                }
                l0.f(cc.a0(anVar), i7, this.f19574c);
                return;
            default:
                boolean z10 = this.f19574c;
                this.f19573b.gd(this.d, z10);
                return;
        }
    }

    public g0(an anVar, boolean z10, int i7) {
        this.f19573b = anVar;
        this.f19574c = z10;
        this.d = i7;
    }
}
