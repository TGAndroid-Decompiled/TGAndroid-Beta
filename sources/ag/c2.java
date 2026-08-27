package ag;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ia;
import org.telegram.ui.gw0;

public final class c2 implements m2.e {

    public final ia f317a;

    public final g2 f318b;

    public c2(g2 g2Var, ia iaVar) {
        this.f318b = g2Var;
        this.f317a = iaVar;
    }

    public final void a() {
        int i10;
        int i11;
        g2 g2Var = this.f318b;
        a2 a2Var = g2Var.f394n;
        ArrayList arrayList = g2Var.d;
        int i12 = 0;
        while (true) {
            float measuredWidth = 0.0f;
            if (i12 >= a2Var.getChildCount()) {
                break;
            }
            f2 f2Var = (f2) a2Var.getChildAt(i12);
            if (!g2Var.f397w || !(f2Var.f379f instanceof n1)) {
                int i13 = f2Var.f375a;
                l1 l1Var = f2Var.f378e;
                if (i13 == g2Var.C) {
                    measuredWidth = (-f2Var.getMeasuredWidth()) * g2Var.E;
                    l1Var.setOffset(measuredWidth);
                } else if (i13 == g2Var.D) {
                    measuredWidth = ((-f2Var.getMeasuredWidth()) * g2Var.E) + f2Var.getMeasuredWidth();
                    l1Var.setOffset(measuredWidth);
                } else {
                    l1Var.setOffset(f2Var.getMeasuredWidth());
                }
            }
            if (f2Var.f379f instanceof n1) {
                f2Var.setTranslationX(-measuredWidth);
                f2Var.f376b.setTranslationX(measuredWidth);
                f2Var.f377c.setTranslationX(measuredWidth);
            }
            i12++;
        }
        int i14 = g2Var.C;
        boolean z10 = i14 >= 0 && i14 < arrayList.size() && ((i11 = ((gw0) arrayList.get(g2Var.C)).f38486a) == 0 || i11 == 14 || i11 == 28);
        int i15 = g2Var.D;
        boolean z11 = i15 >= 0 && i15 < arrayList.size() && ((i10 = ((gw0) arrayList.get(g2Var.D)).f38486a) == 0 || i10 == 14 || i10 == 28);
        if (z10 && z11) {
            g2Var.f393f = 1.0f;
            float f10 = g2Var.E;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            g2Var.f392e = f10;
            g2Var.h = true;
        } else if (z10) {
            float f11 = 1.0f - g2Var.E;
            g2Var.f392e = f11;
            g2Var.f393f = f11;
            g2Var.h = true;
        } else if (z11) {
            float f12 = g2Var.E;
            g2Var.f392e = f12;
            g2Var.f393f = f12;
            g2Var.h = false;
        } else {
            g2Var.f392e = 0.0f;
            g2Var.f393f = 0.0f;
            g2Var.h = true;
        }
        int i16 = (int) ((1.0f - g2Var.f392e) * 255.0f);
        if (i16 != g2Var.G) {
            g2Var.G = i16;
            g2Var.f395r.invalidate();
            AndroidUtilities.runOnUIThread(new af.e(this, 3));
        }
    }

    @Override
    public final void b(int i10) {
        g2 g2Var = this.f318b;
        ArrayList arrayList = g2Var.d;
        if (((gw0) arrayList.get(i10)).f38486a == 0) {
            g2Var.J.setTitle(LocaleController.getString(R.string.DoubledLimits));
            g2Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i10)).f38486a == 14) {
            g2Var.J.setTitle(LocaleController.getString(R.string.UpgradedStories));
            g2Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i10)).f38486a == 40) {
            g2Var.J.setTitle(LocaleController.getString(R.string.FeaturePreviewGifts));
            g2Var.J.requestLayout();
        } else if (((gw0) arrayList.get(i10)).f38486a == 28) {
            g2Var.J.setTitle(LocaleController.getString(R.string.TelegramBusiness));
            g2Var.J.requestLayout();
        }
        a();
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        ia iaVar = this.f317a;
        iaVar.f29320b = f10;
        iaVar.f29321c = i10;
        iaVar.invalidate();
        g2 g2Var = this.f318b;
        g2Var.C = i10;
        g2Var.D = i11 > 0 ? i10 + 1 : i10 - 1;
        g2Var.E = f10;
        a();
    }

    @Override
    public final void d(int i10) {
    }
}
