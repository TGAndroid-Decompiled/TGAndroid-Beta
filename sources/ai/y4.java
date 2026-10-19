package ai;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class y4 implements Utilities.Callback {
    public final int f2479a = 1;
    public final int f2480b;
    public final int f2481c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f2482f;
    public final Object f2483g;

    public y4(int i10, int i11, org.telegram.ui.Components.r3 r3Var, org.telegram.ui.Components.t3 t3Var, int i12, org.telegram.ui.Components.s3 s3Var) {
        this.f2480b = i10;
        this.f2481c = i11;
        this.e = r3Var;
        this.f2482f = t3Var;
        this.d = i12;
        this.f2483g = s3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f2479a) {
            case 0:
                l7.X0((l7) this.e, this.f2480b, this.f2481c, this.d, (ug.m1[]) this.f2482f, (TL_stars.TL_starGiftUnique) this.f2483g, (Long) obj);
                return;
            default:
                org.telegram.ui.Components.r3 r3Var = (org.telegram.ui.Components.r3) this.e;
                org.telegram.ui.Components.t3 t3Var = (org.telegram.ui.Components.t3) this.f2482f;
                org.telegram.ui.Components.s3 s3Var = (org.telegram.ui.Components.s3) this.f2483g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f2480b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f2481c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = 59;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = r3Var.getValue();
                    i10 = t3Var.getValue();
                } else {
                    int i19 = this.d;
                    i10 = i19 % 60;
                    i11 = (i19 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                r3Var.setMinValue(i14);
                r3Var.setMaxValue(i17);
                if (i11 > i17) {
                    r3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    r3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    t3Var.setMinValue(i13);
                    if (i14 == i17) {
                        i18 = i16;
                    }
                    t3Var.setMaxValue(i18);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    t3Var.setMinValue(i13);
                    t3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    t3Var.setMinValue(i13);
                    t3Var.setMaxValue(i16);
                } else {
                    t3Var.setMinValue(0);
                    t3Var.setMaxValue(59);
                }
                if (i10 > t3Var.getMaxValue()) {
                    i10 = t3Var.getMaxValue();
                    t3Var.setValue(i10);
                } else if (i10 < t3Var.getMinValue()) {
                    i10 = t3Var.getMinValue();
                    t3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    r3Var.setValue(i11);
                    t3Var.setValue(i10);
                }
                s3Var.invalidate();
                return;
        }
    }

    public y4(l7 l7Var, int i10, int i11, int i12, ug.m1[] m1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = l7Var;
        this.f2480b = i10;
        this.f2481c = i11;
        this.d = i12;
        this.f2482f = m1VarArr;
        this.f2483g = tL_starGiftUnique;
    }
}
