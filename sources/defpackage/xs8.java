package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class xs8 implements dic {
    public final et8 a;

    public xs8(et8 et8Var) {
        this.a = et8Var;
    }

    @Override
    public final void a(int i) {
        boolean z;
        et8 et8Var = this.a;
        int i2 = et8Var.p1;
        int i3 = 0;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (i != i2) {
            et8Var.p1 = i;
        }
        dc7 dc7Var = et8Var.T0;
        if (dc7Var != null) {
            dt8 dt8Var = et8Var.E0;
            if (dt8Var != null) {
                i3 = dt8Var.j();
            }
            dc7Var.b(i - i3, z);
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        jn5 jn5Var;
        et8 et8Var = this.a;
        et8Var.B(f, i);
        if (i2 == 0) {
            int k = et8Var.E0.k(i);
            if (et8Var.j1) {
                k--;
            }
            et8Var.getCurrentItemView();
            int childCount = et8Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = et8Var.getChildAt(i3);
                if (childAt instanceof de0) {
                    dt8 dt8Var = et8Var.E0;
                    int k2 = dt8Var.k(dt8Var.d.indexOf(childAt));
                    if (et8Var.j1) {
                        k2--;
                    }
                    ImageReceiver imageReceiver = ((de0) childAt).getImageReceiver();
                    boolean z = imageReceiver.u0;
                    if (k2 >= 0 && k2 < et8Var.X0.size()) {
                        if (k2 == k) {
                            if (!z) {
                                imageReceiver.u0 = true;
                                imageReceiver.w0(false);
                            }
                            jn5 jn5Var2 = (jn5) et8Var.X0.get(k2);
                            if (jn5Var2 != null) {
                                xb4 G = xb4.G(et8Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jn5Var2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    xb4.K.c(new vx3(G, tL_fileLocationToBeDeprecated, (byte) 18));
                                }
                            }
                        } else if (z) {
                            lm m = imageReceiver.m();
                            if (m != null && (jn5Var = (jn5) et8Var.X0.get(k2)) != null) {
                                m.y(jn5Var.j, false, true);
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
