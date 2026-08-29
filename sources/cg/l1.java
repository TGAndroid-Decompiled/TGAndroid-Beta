package cg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pa;
import org.telegram.ui.fw0;
public final class l1 implements m2.e {
    public final pa f3198a;
    public final p1 f3199b;

    public l1(p1 p1Var, pa paVar) {
        this.f3199b = p1Var;
        this.f3198a = paVar;
    }

    @Override
    public final void a(int i10) {
        p1 p1Var = this.f3199b;
        ArrayList arrayList = p1Var.d;
        if (((fw0) arrayList.get(i10)).f38243a == 0) {
            p1Var.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            p1Var.J.requestLayout();
        } else if (((fw0) arrayList.get(i10)).f38243a == 14) {
            p1Var.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            p1Var.J.requestLayout();
        } else if (((fw0) arrayList.get(i10)).f38243a == 40) {
            p1Var.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            p1Var.J.requestLayout();
        } else if (((fw0) arrayList.get(i10)).f38243a == 28) {
            p1Var.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            p1Var.J.requestLayout();
        }
        d();
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        int i12;
        pa paVar = this.f3198a;
        paVar.f31622b = f9;
        paVar.f31623c = i10;
        paVar.invalidate();
        p1 p1Var = this.f3199b;
        p1Var.C = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        p1Var.D = i12;
        p1Var.E = f9;
        d();
    }

    public final void d() {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        p1 p1Var = this.f3199b;
        j1 j1Var = p1Var.f3267n;
        ArrayList arrayList = p1Var.d;
        int i12 = 0;
        while (true) {
            float f9 = 0.0f;
            if (i12 >= j1Var.getChildCount()) {
                break;
            }
            o1 o1Var = (o1) j1Var.getChildAt(i12);
            if (!p1Var.f3270w || !(o1Var.f3243f instanceof a1)) {
                int i13 = o1Var.f3239a;
                y0 y0Var = o1Var.f3242e;
                if (i13 == p1Var.C) {
                    f9 = (-o1Var.getMeasuredWidth()) * p1Var.E;
                    y0Var.setOffset(f9);
                } else if (i13 == p1Var.D) {
                    f9 = ((-o1Var.getMeasuredWidth()) * p1Var.E) + o1Var.getMeasuredWidth();
                    y0Var.setOffset(f9);
                } else {
                    y0Var.setOffset(o1Var.getMeasuredWidth());
                }
            }
            if (o1Var.f3243f instanceof a1) {
                o1Var.setTranslationX(-f9);
                o1Var.f3240b.setTranslationX(f9);
                o1Var.f3241c.setTranslationX(f9);
            }
            i12++;
        }
        int i14 = p1Var.C;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((fw0) arrayList.get(p1Var.C)).f38243a) == 0 || i11 == 14 || i11 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i15 = p1Var.D;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((fw0) arrayList.get(p1Var.D)).f38243a) == 0 || i10 == 14 || i10 == 28)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            p1Var.f3266f = 1.0f;
            float f10 = p1Var.E;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            p1Var.f3265e = f10;
            p1Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - p1Var.E;
            p1Var.f3265e = f11;
            p1Var.f3266f = f11;
            p1Var.h = true;
        } else if (z11) {
            float f12 = p1Var.E;
            p1Var.f3265e = f12;
            p1Var.f3266f = f12;
            p1Var.h = false;
        } else {
            p1Var.f3265e = 0.0f;
            p1Var.f3266f = 0.0f;
            p1Var.h = true;
        }
        int i16 = (int) ((1.0f - p1Var.f3265e) * 255.0f);
        if (i16 != p1Var.G) {
            p1Var.G = i16;
            p1Var.f3268r.invalidate();
            AndroidUtilities.runOnUIThread(new a4.g(this, 28));
        }
    }

    @Override
    public final void c(int i10) {
    }
}
