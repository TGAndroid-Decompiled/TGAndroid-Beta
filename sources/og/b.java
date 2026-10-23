package og;

import org.telegram.ui.sn;
import org.telegram.ui.ye1;
public final class b implements Runnable {
    public final int f17801a;
    public final sn f17802b;

    public b(sn snVar, int i10) {
        this.f17801a = i10;
        this.f17802b = snVar;
    }

    @Override
    public final void run() {
        switch (this.f17801a) {
            case 0:
                sn snVar = this.f17802b;
                if (snVar.getParentLayout() != null) {
                    ye1.H0(snVar);
                    return;
                }
                return;
            default:
                this.f17802b.ec();
                return;
        }
    }
}
