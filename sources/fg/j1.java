package fg;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ka;
import org.telegram.ui.rw0;
public final class j1 implements m2.f {
    public final ka f6353a;
    public final n1 f6354b;

    public j1(n1 n1Var, ka kaVar) {
        this.f6354b = n1Var;
        this.f6353a = kaVar;
    }

    @Override
    public final void a(int i10) {
        n1 n1Var = this.f6354b;
        ArrayList arrayList = n1Var.d;
        if (((rw0) arrayList.get(i10)).f41056a == 0) {
            n1Var.K.setTitle(LocaleController.getString(R.string.DoubledLimits));
            n1Var.K.requestLayout();
        } else if (((rw0) arrayList.get(i10)).f41056a == 14) {
            n1Var.K.setTitle(LocaleController.getString(R.string.UpgradedStories));
            n1Var.K.requestLayout();
        } else if (((rw0) arrayList.get(i10)).f41056a == 40) {
            n1Var.K.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            n1Var.K.requestLayout();
        } else if (((rw0) arrayList.get(i10)).f41056a == 28) {
            n1Var.K.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            n1Var.K.requestLayout();
        }
        d();
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        int i12;
        ka kaVar = this.f6353a;
        kaVar.f28352b = f10;
        kaVar.f28353c = i10;
        kaVar.invalidate();
        n1 n1Var = this.f6354b;
        n1Var.D = i10;
        if (i11 > 0) {
            i12 = i10 + 1;
        } else {
            i12 = i10 - 1;
        }
        n1Var.E = i12;
        n1Var.F = f10;
        d();
    }

    public final void d() {
        boolean z4;
        boolean z10;
        int i10;
        int i11;
        n1 n1Var = this.f6354b;
        h1 h1Var = n1Var.f6415n;
        ArrayList arrayList = n1Var.d;
        int i12 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i12 >= h1Var.getChildCount()) {
                break;
            }
            m1 m1Var = (m1) h1Var.getChildAt(i12);
            if (!n1Var.f6418w || !(m1Var.f6394f instanceof z0)) {
                int i13 = m1Var.f6390a;
                x0 x0Var = m1Var.f6393e;
                if (i13 == n1Var.D) {
                    f10 = (-m1Var.getMeasuredWidth()) * n1Var.F;
                    x0Var.setOffset(f10);
                } else if (i13 == n1Var.E) {
                    f10 = ((-m1Var.getMeasuredWidth()) * n1Var.F) + m1Var.getMeasuredWidth();
                    x0Var.setOffset(f10);
                } else {
                    x0Var.setOffset(m1Var.getMeasuredWidth());
                }
            }
            if (m1Var.f6394f instanceof z0) {
                m1Var.setTranslationX(-f10);
                m1Var.f6391b.setTranslationX(f10);
                m1Var.f6392c.setTranslationX(f10);
            }
            i12++;
        }
        int i14 = n1Var.D;
        if (i14 >= 0 && i14 < arrayList.size() && ((i11 = ((rw0) arrayList.get(n1Var.D)).f41056a) == 0 || i11 == 14 || i11 == 28)) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i15 = n1Var.E;
        if (i15 >= 0 && i15 < arrayList.size() && ((i10 = ((rw0) arrayList.get(n1Var.E)).f41056a) == 0 || i10 == 14 || i10 == 28)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 && z10) {
            n1Var.f6414f = 1.0f;
            float f11 = n1Var.F;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            n1Var.f6413e = f11;
            n1Var.h = true;
        } else if (z4) {
            float f12 = 1.0f - n1Var.F;
            n1Var.f6413e = f12;
            n1Var.f6414f = f12;
            n1Var.h = true;
        } else if (z10) {
            float f13 = n1Var.F;
            n1Var.f6413e = f13;
            n1Var.f6414f = f13;
            n1Var.h = false;
        } else {
            n1Var.f6413e = 0.0f;
            n1Var.f6414f = 0.0f;
            n1Var.h = true;
        }
        int i16 = (int) ((1.0f - n1Var.f6413e) * 255.0f);
        if (i16 != n1Var.H) {
            n1Var.H = i16;
            n1Var.f6416r.invalidate();
            AndroidUtilities.runOnUIThread(new eh.m(this, 6));
        }
    }

    @Override
    public final void c(int i10) {
    }
}
