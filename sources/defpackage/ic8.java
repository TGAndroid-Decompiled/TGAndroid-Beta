package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
public final class ic8 extends tc8 {
    public final byte p0;
    public final fn7 q0;

    public ic8(fn7 fn7Var, Context context, wc8 wc8Var, FrameLayout frameLayout, byte b) {
        super(context, wc8Var, frameLayout);
        this.p0 = b;
        this.q0 = fn7Var;
    }

    @Override
    public final boolean D() {
        switch (this.p0) {
            case 0:
                return !((PhotoViewer) this.q0).s;
            default:
                return super.D();
        }
    }

    @Override
    public final void E() {
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.K && getScrollY() <= 0) {
                    hl.d3(secretMediaViewer.q1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void F() {
        switch (this.p0) {
            case 1:
                hl.r(((SecretMediaViewer) this.q0).q1);
                return;
            default:
                return;
        }
    }

    @Override
    public final void G() {
        boolean z;
        switch (this.p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.q0;
                if (secretMediaViewer.J0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.j0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    secretMediaViewer.l(z, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void invalidate() {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        switch (this.p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.q0;
                lb8[] lb8VarArr = photoViewer.X0;
                ImageView[] imageViewArr = photoViewer.y3;
                if (photoViewer.K) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.R1.getTranslationY();
                    float f = 0.0f;
                    if (scrollY == 0 && translationY == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (scrollY == 0 && translationY == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z) {
                        int b = lb8VarArr[0].b() + lb8VarArr[0].j;
                        if (D()) {
                            i = hl.m;
                        } else {
                            i = 0;
                        }
                        int top = (((photoViewer.a2.getTop() + ((int) translationY)) - scrollY) + (a.getCurrentActionBarHeight() + i)) - hl.L(12.0f);
                        if (top > hl.L(32.0f) + ((int) imageViewArr[0].getY())) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (top > b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = z3;
                    }
                    if (photoViewer.z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z2) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new n88(this, (byte) 6)).start();
                        } else if (imageViewArr[0].getTag() == null && !z2) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    lb8 lb8Var = lb8VarArr[0];
                    if (z) {
                        f = 1.0f;
                    }
                    lb8Var.e(2, f, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
