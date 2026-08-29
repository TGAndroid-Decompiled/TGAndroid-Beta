package ah;

import android.graphics.RectF;
import android.view.View;
import r0.j0;
public final class h implements Runnable {
    public final int f747a;
    public final i f748b;

    public h(i iVar, int i10) {
        this.f747a = i10;
        this.f748b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f747a;
        i iVar = this.f748b;
        switch (i10) {
            case 0:
                if (iVar.v != 0) {
                    iVar.h(false);
                    return;
                }
                return;
            default:
                int i11 = iVar.C - 1;
                iVar.C = i11;
                if (i11 == 0) {
                    View view = iVar.A;
                    RectF rectF = e.f743e;
                    iVar.j(e.Q(j0.f(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
