package ih;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.rg0;
public final class j5 implements m2.e {
    public final int f11629a;
    public final View f11630b;

    public j5(int i9, View view) {
        this.f11629a = i9;
        this.f11630b = view;
    }

    @Override
    public final void b(int i9) {
        boolean z10;
        switch (this.f11629a) {
            case 0:
                return;
            case 1:
                kc0 kc0Var = (kc0) this.f11630b;
                m2.e eVar = kc0Var.f30055c;
                if (eVar != null) {
                    eVar.b(i9);
                }
                for (int i10 = 0; i10 < kc0Var.d.getChildCount(); i10++) {
                    View childAt = kc0Var.d.getChildAt(i10);
                    if (i10 == i9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    childAt.setSelected(z10);
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        float f11;
        switch (this.f11629a) {
            case 0:
                o5 o5Var = (o5) this.f11630b;
                if (o5Var.f11898w) {
                    h5 h5Var = o5Var.h;
                    h5Var.d.abortAnimation();
                    if (Math.abs(f10) <= 1.0f) {
                        ValueAnimator valueAnimator = h5Var.I;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h5Var.I = null;
                        }
                        int i11 = h5Var.f11763s;
                        float f12 = (i11 / 2.0f) + ((-h5Var.getMeasuredWidth()) / 2.0f) + ((i11 + h5Var.f11761n) * i9);
                        if (f10 > 0.0f) {
                            int i12 = h5Var.f11763s;
                            f11 = (i12 / 2.0f) + ((-h5Var.getMeasuredWidth()) / 2.0f) + ((i9 + 1) * (i12 + h5Var.f11761n));
                        } else {
                            int i13 = h5Var.f11763s;
                            f11 = (i13 / 2.0f) + ((-h5Var.getMeasuredWidth()) / 2.0f) + ((i9 - 1) * (i13 + h5Var.f11761n));
                            f10 = -f10;
                        }
                        if (f10 == 0.0f) {
                            h5Var.f11759e = f12;
                        } else {
                            h5Var.f11759e = AndroidUtilities.lerp(f12, f11, f10);
                        }
                        h5Var.H = false;
                        h5Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                kc0 kc0Var = (kc0) this.f11630b;
                kc0Var.h = i9;
                kc0Var.f30058n = f10;
                if (kc0Var.d.getChildAt(i9) != null) {
                    kc0.a(kc0Var, i9, (int) (kc0Var.d.getChildAt(i9).getWidth() * f10));
                    kc0Var.invalidate();
                    m2.e eVar = kc0Var.f30055c;
                    if (eVar != null) {
                        eVar.c(f10, i9, i10);
                        return;
                    }
                    return;
                }
                return;
            default:
                rg0 rg0Var = (rg0) this.f11630b;
                if (!rg0Var.f32161a && Math.abs(i9 - rg0Var.f32169w) == 1) {
                    int i14 = rg0Var.f32169w;
                    if (i9 > i14) {
                        rg0.a(rg0Var, 0, 1, 1);
                    } else if (i9 < i14) {
                        rg0.a(rg0Var, 1, 0, 0);
                        rg0.a(rg0Var, 2, 0, -1);
                    }
                }
                int i15 = rg0Var.f32169w;
                int i16 = rg0Var.f32170x;
                rg0Var.f32169w = i9;
                rg0Var.f32170x = i10;
                if (i15 != i9 || i16 != i10) {
                    rg0Var.D = true;
                    rg0Var.postInvalidateOnAnimation();
                    return;
                }
                return;
        }
    }

    @Override
    public final void d(int i9) {
        switch (this.f11629a) {
            case 0:
                o5 o5Var = (o5) this.f11630b;
                if (i9 == 1) {
                    o5Var.f11898w = true;
                    return;
                }
                return;
            case 1:
                kc0 kc0Var = (kc0) this.f11630b;
                if (i9 == 0) {
                    kc0.a(kc0Var, kc0Var.f30056e.getCurrentItem(), 0);
                }
                m2.e eVar = kc0Var.f30055c;
                if (eVar != null) {
                    eVar.d(i9);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void a(int i9) {
    }

    private final void e(int i9) {
    }

    private final void f(int i9) {
    }
}
