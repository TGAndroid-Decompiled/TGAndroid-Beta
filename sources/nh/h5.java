package nh;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.Components.mh0;
public final class h5 implements m2.f {
    public final int f15382a;
    public final View f15383b;

    public h5(int i10, View view) {
        this.f15382a = i10;
        this.f15383b = view;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        switch (this.f15382a) {
            case 0:
                return;
            case 1:
                fd0 fd0Var = (fd0) this.f15383b;
                m2.f fVar = fd0Var.f24856c;
                if (fVar != null) {
                    fVar.a(i10);
                }
                for (int i11 = 0; i11 < fd0Var.d.getChildCount(); i11++) {
                    View childAt = fd0Var.d.getChildAt(i11);
                    if (i11 == i10) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    childAt.setSelected(z4);
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        float f11;
        switch (this.f15382a) {
            case 0:
                m5 m5Var = (m5) this.f15383b;
                if (m5Var.f15615w) {
                    f5 f5Var = m5Var.h;
                    f5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = f5Var.J;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            f5Var.J = null;
                        }
                        int i12 = f5Var.f15414s;
                        float f12 = (i12 / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i12 + f5Var.f15412n) * i10);
                        if (f10 > 0.0f) {
                            int i13 = f5Var.f15414s;
                            f11 = (i13 / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (i13 + f5Var.f15412n));
                        } else {
                            int i14 = f5Var.f15414s;
                            f11 = (i14 / 2.0f) + ((-f5Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (i14 + f5Var.f15412n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            f5Var.e = f12;
                        } else {
                            f5Var.e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        f5Var.I = false;
                        f5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                fd0 fd0Var = (fd0) this.f15383b;
                fd0Var.h = i10;
                fd0Var.f24858n = f10;
                if (fd0Var.d.getChildAt(i10) != null) {
                    fd0.a(fd0Var, i10, (int) (fd0Var.d.getChildAt(i10).getWidth() * f10));
                    fd0Var.invalidate();
                    m2.f fVar = fd0Var.f24856c;
                    if (fVar != null) {
                        fVar.b(f10, i10, i11);
                        return;
                    }
                    return;
                }
                return;
            default:
                mh0 mh0Var = (mh0) this.f15383b;
                if (!mh0Var.f27020a && Math.abs(i10 - mh0Var.f27027w) == 1) {
                    int i15 = mh0Var.f27027w;
                    if (i10 > i15) {
                        mh0.a(mh0Var, 0, 1, 1);
                    } else if (i10 < i15) {
                        mh0.a(mh0Var, 1, 0, 0);
                        mh0.a(mh0Var, 2, 0, -1);
                    }
                }
                int i16 = mh0Var.f27027w;
                int i17 = mh0Var.f27028x;
                mh0Var.f27027w = i10;
                mh0Var.f27028x = i11;
                if (i16 != i10 || i17 != i11) {
                    mh0Var.E = true;
                    mh0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f15382a) {
            case 0:
                m5 m5Var = (m5) this.f15383b;
                if (i10 == 1) {
                    m5Var.f15615w = true;
                    return;
                }
                return;
            case 1:
                fd0 fd0Var = (fd0) this.f15383b;
                if (i10 == 0) {
                    fd0.a(fd0Var, fd0Var.e.getCurrentItem(), 0);
                }
                m2.f fVar = fd0Var.f24856c;
                if (fVar != null) {
                    fVar.c(i10);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }
}
