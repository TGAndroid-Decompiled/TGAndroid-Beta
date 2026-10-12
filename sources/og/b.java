package og;

import org.telegram.ui.fo;
import org.telegram.ui.lg1;
public final class b implements Runnable {
    public final int f16647a;
    public final fo f16648b;

    public b(fo foVar, int i10) {
        this.f16647a = i10;
        this.f16648b = foVar;
    }

    @Override
    public final void run() {
        switch (this.f16647a) {
            case 0:
                fo foVar = this.f16648b;
                if (foVar.getParentLayout() != null) {
                    lg1.I0(foVar);
                    return;
                }
                return;
            default:
                this.f16648b.cc();
                return;
        }
    }
}
