package ai;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class x4 implements Utilities.Callback {
    public final int f2429a = 1;
    public final int f2430b;
    public final int f2431c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f2432f;
    public final Object f2433g;

    public x4(int i10, int i11, org.telegram.ui.Components.r3 r3Var, org.telegram.ui.Components.t3 t3Var, int i12, org.telegram.ui.Components.s3 s3Var) {
        this.f2430b = i10;
        this.f2431c = i11;
        this.e = r3Var;
        this.f2432f = t3Var;
        this.d = i12;
        this.f2433g = s3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f2429a) {
            case 0:
                k7.w0((k7) this.e, this.f2430b, this.f2431c, this.d, (ug.m1[]) this.f2432f, (TL_stars.TL_starGiftUnique) this.f2433g, (Long) obj);
                return;
            default:
                org.telegram.ui.Components.r3 r3Var = (org.telegram.ui.Components.r3) this.e;
                org.telegram.ui.Components.t3 t3Var = (org.telegram.ui.Components.t3) this.f2432f;
                org.telegram.ui.Components.s3 s3Var = (org.telegram.ui.Components.s3) this.f2433g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f2430b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f2431c;
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

    public x4(k7 k7Var, int i10, int i11, int i12, ug.m1[] m1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = k7Var;
        this.f2430b = i10;
        this.f2431c = i11;
        this.d = i12;
        this.f2432f = m1VarArr;
        this.f2433g = tL_starGiftUnique;
    }
}
