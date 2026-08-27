package lh;

import android.view.KeyEvent;
import android.view.TextureView;
import org.telegram.messenger.MessagesStorage;

public final class c0 implements Runnable {

    public final int f15717a;

    public final int f15718b;

    public final int f15719c;
    public final int d;

    public final Object f15720e;

    public c0(Object obj, int i10, int i11, int i12, int i13) {
        this.f15717a = i13;
        this.f15720e = obj;
        this.f15718b = i10;
        this.f15719c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f15717a) {
            case 0:
                d0 d0Var = (d0) ((ag.o3) this.f15720e).f584b;
                z7 z7Var = d0Var.f15846n;
                if (z7Var != null) {
                    int i10 = z7Var.f17217k0;
                    int i11 = this.f15718b;
                    int i12 = this.f15719c;
                    int i13 = this.d;
                    if (i10 != i11 || z7Var.f17219l0 != i12 || z7Var.Q != i13) {
                        z7Var.f17217k0 = i11;
                        z7Var.f17219l0 = i12;
                        z7Var.Q = i13;
                        TextureView textureView = d0Var.f15838e;
                        if (textureView != null) {
                            textureView.requestLayout();
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((MessagesStorage) this.f15720e).lambda$setMessageSeq$211(this.f15718b, this.f15719c, this.d);
                break;
            case 2:
                rh.p3 p3Var = (rh.p3) this.f15720e;
                KeyEvent.Callback callbackA4 = p3Var.A4(this.f15718b);
                if (callbackA4 instanceof org.telegram.ui.Cells.i9) {
                    p3Var.f47352j3.c0(this.f15719c, this.d, (org.telegram.ui.Cells.i9) callbackA4);
                }
                break;
            default:
                rh.f3 f3Var = (rh.f3) this.f15720e;
                rh.p3.K1(f3Var.f47141b, this.f15718b, this.f15719c, this.d);
                break;
        }
    }
}
