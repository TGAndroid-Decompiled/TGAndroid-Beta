package eg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ka;
import org.telegram.ui.pw0;
public final class k1 implements m2.f {
    public final ka f5334a;
    public final o1 f5335b;

    public k1(o1 o1Var, ka kaVar) {
        this.f5335b = o1Var;
        this.f5334a = kaVar;
    }

    @Override
    public final void a(int i10) {
        o1 o1Var = this.f5335b;
        ArrayList arrayList = o1Var.d;
        if (((pw0) arrayList.get(i10)).f37545a == 0) {
            o1Var.K.setTitle(LocaleController.getString(R.string.DoubledLimits));
            o1Var.K.requestLayout();
        } else if (((pw0) arrayList.get(i10)).f37545a == 14) {
            o1Var.K.setTitle(LocaleController.getString(R.string.UpgradedStories));
            o1Var.K.requestLayout();
        } else if (((pw0) arrayList.get(i10)).f37545a == 40) {
            o1Var.K.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            o1Var.K.requestLayout();
        } else if (((pw0) arrayList.get(i10)).f37545a == 28) {
            o1Var.K.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            o1Var.K.requestLayout();
        }
        d();
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        int i12;
        ka kaVar = this.f5334a;
        kaVar.f26241b = f10;
        kaVar.f26242c = i10;
        kaVar.invalidate();
        o1 o1Var = this.f5335b;
        o1Var.D = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        o1Var.E = i12;
        o1Var.F = f10;
        d();
    }

    public final void d() {
        boolean z4;
        boolean z10;
        int i10;
        int i11;
        o1 o1Var = this.f5335b;
        i1 i1Var = o1Var.f5394n;
        ArrayList arrayList = o1Var.d;
        int i12 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i12 >= i1Var.getChildCount()) {
                break;
            }
            n1 n1Var = (n1) i1Var.getChildAt(i12);
            if (!o1Var.f5397w || !(n1Var.f5371f instanceof z0)) {
                int i13 = n1Var.f5368a;
                x0 x0Var = n1Var.e;
                if (i13 == o1Var.D) {
                    f10 = (-n1Var.getMeasuredWidth()) * o1Var.F;
                    x0Var.setOffset(f10);
                } else if (i13 == o1Var.E) {
                    f10 = ((-n1Var.getMeasuredWidth()) * o1Var.F) + n1Var.getMeasuredWidth();
                    x0Var.setOffset(f10);
                } else {
                    x0Var.setOffset(n1Var.getMeasuredWidth());
                }
            }
            if (n1Var.f5371f instanceof z0) {
                n1Var.setTranslationX(-f10);
                n1Var.f5369b.setTranslationX(f10);
                n1Var.f5370c.setTranslationX(f10);
            }
            i12++;
        }
        int i14 = o1Var.D;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((pw0) arrayList.get(o1Var.D)).f37545a) == 0 || i11 == 14 || i11 == 28)) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i15 = o1Var.E;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((pw0) arrayList.get(o1Var.E)).f37545a) == 0 || i10 == 14 || i10 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 && z10) {
            o1Var.f5393f = 1.0f;
            float f11 = o1Var.F;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            o1Var.e = f11;
            o1Var.h = true;
        } else if (z4) {
            float f12 = 1.0f - o1Var.F;
            o1Var.e = f12;
            o1Var.f5393f = f12;
            o1Var.h = true;
        } else if (z10) {
            float f13 = o1Var.F;
            o1Var.e = f13;
            o1Var.f5393f = f13;
            o1Var.h = false;
        } else {
            o1Var.e = 0.0f;
            o1Var.f5393f = 0.0f;
            o1Var.h = true;
        }
        int i16 = (int) ((1.0f - o1Var.e) * 255.0f);
        if (i16 != o1Var.H) {
            o1Var.H = i16;
            o1Var.f5395r.invalidate();
            AndroidUtilities.runOnUIThread(new ef.e(this, 3));
        }
    }

    @Override
    public final void c(int i10) {
    }
}
