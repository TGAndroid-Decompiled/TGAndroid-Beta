package jh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class i3 implements Utilities.Callback {
    public final int f12240a = 1;
    public final int f12241b;
    public final int f12242c;
    public final int d;
    public final KeyEvent.Callback f12243e;
    public final Object f12244f;
    public final Object f12245g;

    public i3(int i10, int i11, org.telegram.ui.Components.p3 p3Var, org.telegram.ui.Components.r3 r3Var, int i12, org.telegram.ui.Components.q3 q3Var) {
        this.f12241b = i10;
        this.f12242c = i11;
        this.f12243e = p3Var;
        this.f12244f = r3Var;
        this.d = i12;
        this.f12245g = q3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f12240a) {
            case 0:
                h5.E0((h5) this.f12243e, this.f12241b, this.f12242c, this.d, (TL_stars.TL_starGiftUnique) this.f12244f, (eg.w2[]) this.f12245g, (Long) obj);
                return;
            default:
                org.telegram.ui.Components.p3 p3Var = (org.telegram.ui.Components.p3) this.f12243e;
                org.telegram.ui.Components.r3 r3Var = (org.telegram.ui.Components.r3) this.f12244f;
                org.telegram.ui.Components.q3 q3Var = (org.telegram.ui.Components.q3) this.f12245g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f12241b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f12242c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = 59;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = p3Var.getValue();
                    i10 = r3Var.getValue();
                } else {
                    int i19 = this.d;
                    i10 = i19 % 60;
                    i11 = (i19 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                p3Var.setMinValue(i14);
                p3Var.setMaxValue(i17);
                if (i11 > i17) {
                    p3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    p3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    r3Var.setMinValue(i13);
                    if (i14 == i17) {
                        i18 = i16;
                    }
                    r3Var.setMaxValue(i18);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    r3Var.setMinValue(i13);
                    r3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    r3Var.setMinValue(i13);
                    r3Var.setMaxValue(i16);
                } else {
                    r3Var.setMinValue(0);
                    r3Var.setMaxValue(59);
                }
                if (i10 > r3Var.getMaxValue()) {
                    i10 = r3Var.getMaxValue();
                    r3Var.setValue(i10);
                } else if (i10 < r3Var.getMinValue()) {
                    i10 = r3Var.getMinValue();
                    r3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    p3Var.setValue(i11);
                    r3Var.setValue(i10);
                }
                q3Var.invalidate();
                return;
        }
    }

    public i3(h5 h5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, eg.w2[] w2VarArr) {
        this.f12243e = h5Var;
        this.f12241b = i10;
        this.f12242c = i11;
        this.d = i12;
        this.f12244f = tL_starGiftUnique;
        this.f12245g = w2VarArr;
    }
}
