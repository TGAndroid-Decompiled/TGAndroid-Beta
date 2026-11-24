package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class lp8 implements eec {
    public final sp8 a;

    public lp8(sp8 sp8Var) {
        this.a = sp8Var;
    }

    @Override
    public final void a(int i) {
        boolean z;
        sp8 sp8Var = this.a;
        int i2 = sp8Var.p1;
        int i3 = 0;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (i != i2) {
            sp8Var.p1 = i;
        }
        w97 w97Var = sp8Var.T0;
        if (w97Var != null) {
            rp8 rp8Var = sp8Var.E0;
            if (rp8Var != null) {
                i3 = rp8Var.j();
            }
            w97Var.b(i - i3, z);
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        gl5 gl5Var;
        sp8 sp8Var = this.a;
        sp8Var.B(f, i);
        if (i2 == 0) {
            int k = sp8Var.E0.k(i);
            if (sp8Var.j1) {
                k--;
            }
            sp8Var.getCurrentItemView();
            int childCount = sp8Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = sp8Var.getChildAt(i3);
                if (childAt instanceof be0) {
                    rp8 rp8Var = sp8Var.E0;
                    int k2 = rp8Var.k(rp8Var.d.indexOf(childAt));
                    if (sp8Var.j1) {
                        k2--;
                    }
                    ImageReceiver imageReceiver = ((be0) childAt).getImageReceiver();
                    boolean z = imageReceiver.u0;
                    if (k2 >= 0 && k2 < sp8Var.X0.size()) {
                        if (k2 == k) {
                            if (!z) {
                                imageReceiver.u0 = true;
                                imageReceiver.w0(false);
                            }
                            gl5 gl5Var2 = (gl5) sp8Var.X0.get(k2);
                            if (gl5Var2 != null) {
                                ba4 G = ba4.G(sp8Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gl5Var2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    ba4.K.c(new eu3(G, tL_fileLocationToBeDeprecated, (byte) 22));
                                }
                            }
                        } else if (z) {
                            km m = imageReceiver.m();
                            if (m != null && (gl5Var = (gl5) sp8Var.X0.get(k2)) != null) {
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
