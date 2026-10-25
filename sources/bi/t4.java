package bi;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class t4 implements Utilities.Callback {
    public final int f5446a = 1;
    public final int f5447b;
    public final int f5448c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f5449f;
    public final Object f5450g;

    public t4(int i10, int i11, org.telegram.ui.Components.s3 s3Var, org.telegram.ui.Components.u3 u3Var, int i12, org.telegram.ui.Components.t3 t3Var) {
        this.f5447b = i10;
        this.f5448c = i11;
        this.e = s3Var;
        this.f5449f = u3Var;
        this.d = i12;
        this.f5450g = t3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f5446a) {
            case 0:
                h7.W0((h7) this.e, this.f5447b, this.f5448c, this.d, (vg.n1[]) this.f5449f, (TL_stars.TL_starGiftUnique) this.f5450g, (Long) obj);
                return;
            default:
                org.telegram.ui.Components.s3 s3Var = (org.telegram.ui.Components.s3) this.e;
                org.telegram.ui.Components.u3 u3Var = (org.telegram.ui.Components.u3) this.f5449f;
                org.telegram.ui.Components.t3 t3Var = (org.telegram.ui.Components.t3) this.f5450g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f5447b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f5448c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = 59;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = s3Var.getValue();
                    i10 = u3Var.getValue();
                } else {
                    int i19 = this.d;
                    i10 = i19 % 60;
                    i11 = (i19 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                s3Var.setMinValue(i14);
                s3Var.setMaxValue(i17);
                if (i11 > i17) {
                    s3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    s3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    u3Var.setMinValue(i13);
                    if (i14 == i17) {
                        i18 = i16;
                    }
                    u3Var.setMaxValue(i18);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    u3Var.setMinValue(i13);
                    u3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    u3Var.setMinValue(i13);
                    u3Var.setMaxValue(i16);
                } else {
                    u3Var.setMinValue(0);
                    u3Var.setMaxValue(59);
                }
                if (i10 > u3Var.getMaxValue()) {
                    i10 = u3Var.getMaxValue();
                    u3Var.setValue(i10);
                } else if (i10 < u3Var.getMinValue()) {
                    i10 = u3Var.getMinValue();
                    u3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    s3Var.setValue(i11);
                    u3Var.setValue(i10);
                }
                t3Var.invalidate();
                return;
        }
    }

    public t4(h7 h7Var, int i10, int i11, int i12, vg.n1[] n1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        this.e = h7Var;
        this.f5447b = i10;
        this.f5448c = i11;
        this.d = i12;
        this.f5449f = n1VarArr;
        this.f5450g = tL_starGiftUnique;
    }
}
