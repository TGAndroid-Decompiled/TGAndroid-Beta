package nh;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class c0 implements Runnable {
    public final int f17453a;
    public final int f17454b;
    public final int f17455c;
    public final int d;
    public final Object f17456e;

    public c0(Object obj, int i10, int i11, int i12, int i13) {
        this.f17453a = i13;
        this.f17456e = obj;
        this.f17454b = i10;
        this.f17455c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f17453a) {
            case 0:
                d0 d0Var = (d0) ((cg.v2) this.f17456e).f3429b;
                o7 o7Var = d0Var.f17515n;
                if (o7Var != null) {
                    int i10 = o7Var.f18278k0;
                    int i11 = this.f17454b;
                    int i12 = this.f17455c;
                    int i13 = this.d;
                    if (i10 != i11 || o7Var.f18280l0 != i12 || o7Var.Q != i13) {
                        o7Var.f18278k0 = i11;
                        o7Var.f18280l0 = i12;
                        o7Var.Q = i13;
                        TextureView textureView = d0Var.f17507e;
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
                ((MessagesStorage) this.f17456e).lambda$setMessageSeq$211(this.f17454b, this.f17455c, this.d);
                return;
            case 2:
                th.p3 p3Var = (th.p3) this.f17456e;
                View A4 = p3Var.A4(this.f17454b);
                if (A4 instanceof org.telegram.ui.Cells.j9) {
                    p3Var.f48650j3.c0(this.f17455c, this.d, (org.telegram.ui.Cells.j9) A4);
                    return;
                }
                return;
            default:
                th.p3.K1(((th.f3) this.f17456e).f48441b, this.f17454b, this.f17455c, this.d);
                return;
        }
    }
}
