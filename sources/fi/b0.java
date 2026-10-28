package fi;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f10539a;
    public final int f10540b;
    public final int f10541c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f10539a = i13;
        this.e = obj;
        this.f10540b = i10;
        this.f10541c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f10539a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f10591b;
                w7 w7Var = d0Var.f10711n;
                if (w7Var != null) {
                    int i10 = w7Var.f11910k0;
                    int i11 = this.f10540b;
                    int i12 = this.f10541c;
                    int i13 = this.d;
                    if (i10 != i11 || w7Var.f11912l0 != i12 || w7Var.Q != i13) {
                        w7Var.f11910k0 = i11;
                        w7Var.f11912l0 = i12;
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
                View G4 = v3Var.G4(this.f10540b);
                if (G4 instanceof org.telegram.ui.Cells.r9) {
                    v3Var.f17568v3.b0(this.f10541c, this.d, (org.telegram.ui.Cells.r9) G4);
                    return;
                }
                return;
            case 2:
                li.v3.Q1(((li.l3) this.e).f17346b, this.f10540b, this.f10541c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$215(this.f10540b, this.f10541c, this.d);
                return;
        }
    }
}
