package mh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class h3 implements Utilities.Callback {
    public final int f14159a = 1;
    public final int f14160b;
    public final int f14161c;
    public final int d;
    public final KeyEvent.Callback f14162e;
    public final Object f14163f;
    public final Object f14164g;

    public h3(int i10, int i11, org.telegram.ui.Components.m3 m3Var, org.telegram.ui.Components.o3 o3Var, int i12, org.telegram.ui.Components.n3 n3Var) {
        this.f14160b = i10;
        this.f14161c = i11;
        this.f14162e = m3Var;
        this.f14163f = o3Var;
        this.d = i12;
        this.f14164g = n3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f14159a) {
            case 0:
                g5.E0((g5) this.f14162e, this.f14160b, this.f14161c, this.d, (TL_stars.TL_starGiftUnique) this.f14163f, (hg.v2[]) this.f14164g, (Long) obj);
                return;
            default:
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.f14162e;
                org.telegram.ui.Components.o3 o3Var = (org.telegram.ui.Components.o3) this.f14163f;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) this.f14164g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f14160b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f14161c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = 59;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = m3Var.getValue();
                    i10 = o3Var.getValue();
                } else {
                    int i19 = this.d;
                    i10 = i19 % 60;
                    i11 = (i19 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                m3Var.setMinValue(i14);
                m3Var.setMaxValue(i17);
                if (i11 > i17) {
                    m3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    m3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    o3Var.setMinValue(i13);
                    if (i14 == i17) {
                        i18 = i16;
                    }
                    o3Var.setMaxValue(i18);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    o3Var.setMinValue(i13);
                    o3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    o3Var.setMinValue(i13);
                    o3Var.setMaxValue(i16);
                } else {
                    o3Var.setMinValue(0);
                    o3Var.setMaxValue(59);
                }
                if (i10 > o3Var.getMaxValue()) {
                    i10 = o3Var.getMaxValue();
                    o3Var.setValue(i10);
                } else if (i10 < o3Var.getMinValue()) {
                    i10 = o3Var.getMinValue();
                    o3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    m3Var.setValue(i11);
                    o3Var.setValue(i10);
                }
                n3Var.invalidate();
                return;
        }
    }

    public h3(g5 g5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, hg.v2[] v2VarArr) {
        this.f14162e = g5Var;
        this.f14160b = i10;
        this.f14161c = i11;
        this.d = i12;
        this.f14163f = tL_starGiftUnique;
        this.f14164g = v2VarArr;
    }
}
