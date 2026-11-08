package ii;

import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
public final class h0 implements Runnable {
    public final int f15544a = 0;
    public final an f15545b;
    public final boolean f15546c;
    public final int d;

    public h0(int i7, an anVar, boolean z9) {
        this.d = i7;
        this.f15545b = anVar;
        this.f15546c = z9;
    }

    @Override
    public final void run() {
        switch (this.f15544a) {
            case 0:
                int i7 = this.d;
                an anVar = this.f15545b;
                if (i7 != 2) {
                    anVar.ua();
                    anVar.Bc();
                }
                m0.f(hc.a0(anVar), i7, this.f15546c);
                return;
            default:
                boolean z9 = this.f15546c;
                this.f15545b.cd(this.d, z9);
                return;
        }
    }

    public h0(an anVar, boolean z9, int i7) {
        this.f15545b = anVar;
        this.f15546c = z9;
        this.d = i7;
    }
}
