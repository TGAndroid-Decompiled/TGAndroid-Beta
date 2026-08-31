package dh;

import android.graphics.RectF;
import android.view.View;
import r0.j0;
public final class h implements Runnable {
    public final int f4755a;
    public final i f4756b;

    public h(i iVar, int i10) {
        this.f4755a = i10;
        this.f4756b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f4755a;
        i iVar = this.f4756b;
        switch (i10) {
            case 0:
                if (iVar.v != 0) {
                    iVar.h(false);
                    return;
                }
                return;
            default:
                int i11 = iVar.D - 1;
                iVar.D = i11;
                if (i11 == 0) {
                    View view = iVar.B;
                    RectF rectF = e.f4751e;
                    iVar.j(e.L(j0.f(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
