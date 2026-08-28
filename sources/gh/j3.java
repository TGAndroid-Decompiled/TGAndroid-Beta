package gh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 implements Utilities.Callback {
    public final int f8335a = 1;
    public final int f8336b;
    public final int f8337c;
    public final int d;
    public final KeyEvent.Callback f8338e;
    public final Object f8339f;
    public final Object f8340g;

    public j3(int i9, int i10, org.telegram.ui.Components.l3 l3Var, org.telegram.ui.Components.n3 n3Var, int i11, org.telegram.ui.Components.m3 m3Var) {
        this.f8336b = i9;
        this.f8337c = i10;
        this.f8338e = l3Var;
        this.f8339f = n3Var;
        this.d = i11;
        this.f8340g = m3Var;
    }

    @Override
    public final void run(Object obj) {
        int i9;
        int i10;
        switch (this.f8335a) {
            case 0:
                k5.D0((k5) this.f8338e, this.f8336b, this.f8337c, this.d, (TL_stars.TL_starGiftUnique) this.f8339f, (bg.g3[]) this.f8340g, (Long) obj);
                return;
            default:
                org.telegram.ui.Components.l3 l3Var = (org.telegram.ui.Components.l3) this.f8338e;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) this.f8339f;
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.f8340g;
                Boolean bool = (Boolean) obj;
                int i11 = this.f8336b;
                int i12 = i11 % 60;
                int i13 = (i11 - i12) / 60;
                int i14 = this.f8337c;
                int i15 = i14 % 60;
                int i16 = (i14 - i15) / 60;
                int i17 = 59;
                if (i15 == 0 && i16 > 0) {
                    i16--;
                    i15 = 59;
                }
                if (bool.booleanValue()) {
                    i10 = l3Var.getValue();
                    i9 = n3Var.getValue();
                } else {
                    int i18 = this.d;
                    i9 = i18 % 60;
                    i10 = (i18 - i9) / 60;
                    if (i10 == 24) {
                        i10--;
                        i9 = 59;
                    }
                }
                l3Var.setMinValue(i13);
                l3Var.setMaxValue(i16);
                if (i10 > i16) {
                    l3Var.setValue(i16);
                    i10 = i16;
                } else if (i10 < i13) {
                    l3Var.setValue(i13);
                    i10 = i13;
                }
                if (i10 <= i13) {
                    n3Var.setMinValue(i12);
                    if (i13 == i16) {
                        i17 = i15;
                    }
                    n3Var.setMaxValue(i17);
                } else if (i10 >= i16) {
                    if (i13 != i16) {
                        i12 = 0;
                    }
                    n3Var.setMinValue(i12);
                    n3Var.setMaxValue(i15);
                } else if (i13 == i16) {
                    n3Var.setMinValue(i12);
                    n3Var.setMaxValue(i15);
                } else {
                    n3Var.setMinValue(0);
                    n3Var.setMaxValue(59);
                }
                if (i9 > n3Var.getMaxValue()) {
                    i9 = n3Var.getMaxValue();
                    n3Var.setValue(i9);
                } else if (i9 < n3Var.getMinValue()) {
                    i9 = n3Var.getMinValue();
                    n3Var.setValue(i9);
                }
                if (!bool.booleanValue()) {
                    l3Var.setValue(i10);
                    n3Var.setValue(i9);
                }
                m3Var.invalidate();
                return;
        }
    }

    public j3(k5 k5Var, int i9, int i10, int i11, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.g3[] g3VarArr) {
        this.f8338e = k5Var;
        this.f8336b = i9;
        this.f8337c = i10;
        this.d = i11;
        this.f8339f = tL_starGiftUnique;
        this.f8340g = g3VarArr;
    }
}
