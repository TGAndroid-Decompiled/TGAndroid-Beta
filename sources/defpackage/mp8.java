package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mp8 implements eec {
    public final ym8 a;

    public mp8(ym8 ym8Var) {
        this.a = ym8Var;
    }

    @Override
    public final void a(int i) {
        boolean z;
        ym8 ym8Var = this.a;
        int i2 = ym8Var.p1;
        int i3 = 0;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (i != i2) {
            ym8Var.p1 = i;
        }
        w97 w97Var = ym8Var.T0;
        if (w97Var != null) {
            rp8 rp8Var = ym8Var.E0;
            if (rp8Var != null) {
                i3 = rp8Var.j();
            }
            w97Var.b(i - i3, z);
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        gl5 gl5Var;
        ym8 ym8Var = this.a;
        ym8Var.B(f, i);
        if (i2 == 0) {
            int k = ym8Var.E0.k(i);
            ym8Var.getCurrentItemView();
            int childCount = ym8Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = ym8Var.getChildAt(i3);
                if (childAt instanceof be0) {
                    rp8 rp8Var = ym8Var.E0;
                    int k2 = rp8Var.k(rp8Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((be0) childAt).getImageReceiver();
                    boolean z = imageReceiver.u0;
                    if (k2 >= 0 && k2 < ym8Var.X0.size()) {
                        if (k2 == k) {
                            if (!z) {
                                imageReceiver.u0 = true;
                                imageReceiver.w0(false);
                            }
                            gl5 gl5Var2 = (gl5) ym8Var.X0.get(k2);
                            if (gl5Var2 != null) {
                                ba4 G = ba4.G(ym8Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gl5Var2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    ba4.K.c(new eu3(G, tL_fileLocationToBeDeprecated, (byte) 22));
                                }
                            }
                        } else if (z) {
                            km m = imageReceiver.m();
                            if (m != null && (gl5Var = (gl5) ym8Var.X0.get(k2)) != null) {
                                m.y(gl5Var.j, false, true);
                            }
                            imageReceiver.u0 = false;
                            imageReceiver.x0();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void c(int i) {
    }
}
