package og;

import org.telegram.ui.fo;
import org.telegram.ui.kg1;
public final class b implements Runnable {
    public final int f16340a;
    public final fo f16341b;

    public b(fo foVar, int i10) {
        this.f16340a = i10;
        this.f16341b = foVar;
    }

    @Override
    public final void run() {
        switch (this.f16340a) {
            case 0:
                fo foVar = this.f16341b;
                if (foVar.getParentLayout() != null) {
                    kg1.I0(foVar);
                    return;
                }
                return;
            default:
                this.f16341b.cc();
                return;
        }
    }
}
