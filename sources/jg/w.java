package jg;

import android.content.DialogInterface;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.er0;
import rh.j7;
public final class w implements DialogInterface.OnDismissListener {
    public final int f10334a = 1;
    public final int f10335b;
    public final us f10336c;

    public w(int i10, j7 j7Var) {
        this.f10335b = i10;
        this.f10336c = j7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10334a) {
            case 0:
                r0 r0Var = (r0) this.f10336c;
                PhotoViewer photoViewer = ((er0) r0Var).X1;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.h0();
                }
                r0Var.A0(this.f10335b);
                return;
            default:
                zs.f(this.f10335b).n((j7) this.f10336c, 223);
                return;
        }
    }

    public w(r0 r0Var, int i10) {
        this.f10336c = r0Var;
        this.f10335b = i10;
    }
}
