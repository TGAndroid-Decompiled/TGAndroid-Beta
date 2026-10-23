package ei;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f8773a;
    public final int f8774b;
    public final int f8775c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f8773a = i13;
        this.e = obj;
        this.f8774b = i10;
        this.f8775c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f8773a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f8814b;
                a8 a8Var = d0Var.f8887n;
                if (a8Var != null) {
                    int i10 = a8Var.f8726k0;
                    int i11 = this.f8774b;
                    int i12 = this.f8775c;
                    int i13 = this.d;
                    if (i10 != i11 || a8Var.f8728l0 != i12 || a8Var.Q != i13) {
                        a8Var.f8726k0 = i11;
                        a8Var.f8728l0 = i12;
                        a8Var.Q = i13;
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
                ki.w3 w3Var = (ki.w3) this.e;
                View G4 = w3Var.G4(this.f8774b);
                if (G4 instanceof org.telegram.ui.Cells.n9) {
                    w3Var.f15667o3.b0(this.f8775c, this.d, (org.telegram.ui.Cells.n9) G4);
                    return;
                }
                return;
            case 2:
                ki.w3.Q1(((ki.l3) this.e).f15436b, this.f8774b, this.f8775c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f8774b, this.f8775c, this.d);
                return;
        }
    }
}
