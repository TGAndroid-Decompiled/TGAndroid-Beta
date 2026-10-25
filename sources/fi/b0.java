package fi;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f10540a;
    public final int f10541b;
    public final int f10542c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f10540a = i13;
        this.e = obj;
        this.f10541b = i10;
        this.f10542c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f10540a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f10592b;
                w7 w7Var = d0Var.f10712n;
                if (w7Var != null) {
                    int i10 = w7Var.f11911k0;
                    int i11 = this.f10541b;
                    int i12 = this.f10542c;
                    int i13 = this.d;
                    if (i10 != i11 || w7Var.f11913l0 != i12 || w7Var.Q != i13) {
                        w7Var.f11911k0 = i11;
                        w7Var.f11913l0 = i12;
                        w7Var.Q = i13;
                        TextureView textureView = d0Var.e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                li.v3 v3Var = (li.v3) this.e;
                View G4 = v3Var.G4(this.f10541b);
                if (G4 instanceof org.telegram.ui.Cells.r9) {
                    v3Var.f17569v3.b0(this.f10542c, this.d, (org.telegram.ui.Cells.r9) G4);
                    return;
                }
                return;
            case 2:
                li.v3.Q1(((li.l3) this.e).f17347b, this.f10541b, this.f10542c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$214(this.f10541b, this.f10542c, this.d);
                return;
        }
    }
}
