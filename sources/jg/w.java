package jg;

import android.content.DialogInterface;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cr0;
import rh.j7;
public final class w implements DialogInterface.OnDismissListener {
    public final int f10335a = 1;
    public final int f10336b;
    public final vs f10337c;

    public w(int i10, j7 j7Var) {
        this.f10336b = i10;
        this.f10337c = j7Var;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f10335a) {
            case 0:
                r0 r0Var = (r0) this.f10337c;
                PhotoViewer photoViewer = ((cr0) r0Var).X1;
                if (photoViewer.F2 != null) {
                    photoViewer.H2 = false;
                    photoViewer.v0();
                    photoViewer.F2.h0();
                }
                r0Var.A0(this.f10336b);
                return;
            default:
                at.f(this.f10336b).n((j7) this.f10337c, 223);
                return;
        }
    }

    public w(r0 r0Var, int i10) {
        this.f10337c = r0Var;
        this.f10336b = i10;
    }
}
