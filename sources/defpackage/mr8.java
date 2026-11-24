package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class mr8 implements egc {
    public final tr8 a;

    public mr8(tr8 tr8Var) {
        this.a = tr8Var;
    }

    @Override
    public final void a(int i) {
        boolean z;
        tr8 tr8Var = this.a;
        int i2 = tr8Var.p1;
        int i3 = 0;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (i != i2) {
            tr8Var.p1 = i;
        }
        xb7 xb7Var = tr8Var.T0;
        if (xb7Var != null) {
            sr8 sr8Var = tr8Var.E0;
            if (sr8Var != null) {
                i3 = sr8Var.j();
            }
            xb7Var.b(i - i3, z);
        }
    }

    @Override
    public final void b(float f, int i, int i2) {
        gn5 gn5Var;
        tr8 tr8Var = this.a;
        tr8Var.B(f, i);
        if (i2 == 0) {
            int k = tr8Var.E0.k(i);
            if (tr8Var.j1) {
                k--;
            }
            tr8Var.getCurrentItemView();
            int childCount = tr8Var.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = tr8Var.getChildAt(i3);
                if (childAt instanceof bf0) {
                    sr8 sr8Var = tr8Var.E0;
                    int k2 = sr8Var.k(sr8Var.d.indexOf(childAt));
                    if (tr8Var.j1) {
                        k2--;
                    }
                    ImageReceiver imageReceiver = ((bf0) childAt).getImageReceiver();
                    boolean z = imageReceiver.u0;
                    if (k2 >= 0 && k2 < tr8Var.X0.size()) {
                        if (k2 == k) {
                            if (!z) {
                                imageReceiver.u0 = true;
                                imageReceiver.w0(false);
                            }
                            gn5 gn5Var2 = (gn5) tr8Var.X0.get(k2);
                            if (gn5Var2 != null) {
                                bc4 G = bc4.G(tr8Var.M0);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = gn5Var2.f;
                                if (tL_fileLocationToBeDeprecated != null) {
                                    bc4.K.c(new pv3(G, tL_fileLocationToBeDeprecated, (byte) 23));
                                }
                            }
                        } else if (z) {
                            kn m = imageReceiver.m();
                            if (m != null && (gn5Var = (gn5) tr8Var.X0.get(k2)) != null) {
                                m.y(gn5Var.j, false, true);
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
