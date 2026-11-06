package ii;

import org.telegram.ui.Components.hc;
import org.telegram.ui.an;
public final class h0 implements Runnable {
    public final int f15541a = 0;
    public final an f15542b;
    public final boolean f15543c;
    public final int d;

    public h0(int i7, an anVar, boolean z9) {
        this.d = i7;
        this.f15542b = anVar;
        this.f15543c = z9;
    }

    @Override
    public final void run() {
        switch (this.f15541a) {
            case 0:
                int i7 = this.d;
                an anVar = this.f15542b;
                if (i7 != 2) {
                    anVar.ua();
                    anVar.Bc();
                }
                m0.f(hc.a0(anVar), i7, this.f15543c);
                return;
            default:
                boolean z9 = this.f15543c;
                this.f15542b.cd(this.d, z9);
                return;
        }
    }

    public h0(an anVar, boolean z9, int i7) {
        this.f15542b = anVar;
        this.f15543c = z9;
        this.d = i7;
    }
}
