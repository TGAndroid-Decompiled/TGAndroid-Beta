package hh;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

public final class i3 implements Utilities.Callback {

    public final int f9441a = 1;

    public final int f9442b;

    public final int f9443c;
    public final int d;

    public final KeyEvent.Callback f9444e;

    public final Object f9445f;

    public final Object f9446g;

    public i3(int i10, int i11, org.telegram.ui.Components.l3 l3Var, org.telegram.ui.Components.n3 n3Var, int i12, org.telegram.ui.Components.m3 m3Var) {
        this.f9442b = i10;
        this.f9443c = i11;
        this.f9444e = l3Var;
        this.f9445f = n3Var;
        this.d = i12;
        this.f9446g = m3Var;
    }

    @Override
    public final void run(Object obj) {
        int minValue;
        int value;
        switch (this.f9441a) {
            case 0:
                i5.E0((i5) this.f9444e, this.f9442b, this.f9443c, this.d, (TL_stars.TL_starGiftUnique) this.f9445f, (cg.y2[]) this.f9446g, (Long) obj);
                break;
            default:
                org.telegram.ui.Components.l3 l3Var = (org.telegram.ui.Components.l3) this.f9444e;
                org.telegram.ui.Components.n3 n3Var = (org.telegram.ui.Components.n3) this.f9445f;
                org.telegram.ui.Components.m3 m3Var = (org.telegram.ui.Components.m3) this.f9446g;
                Boolean bool = (Boolean) obj;
                int i10 = this.f9442b;
                int i11 = i10 % 60;
                int i12 = (i10 - i11) / 60;
                int i13 = this.f9443c;
                int i14 = i13 % 60;
                int i15 = (i13 - i14) / 60;
                if (i14 == 0 && i15 > 0) {
                    i15--;
                    i14 = 59;
                }
                if (bool.booleanValue()) {
                    value = l3Var.getValue();
                    minValue = n3Var.getValue();
                } else {
                    int i16 = this.d;
                    minValue = i16 % 60;
                    value = (i16 - minValue) / 60;
                    if (value == 24) {
                        value--;
                        minValue = 59;
                    }
                }
                l3Var.setMinValue(i12);
                l3Var.setMaxValue(i15);
                if (value > i15) {
                    l3Var.setValue(i15);
                    value = i15;
                } else if (value < i12) {
                    l3Var.setValue(i12);
                    value = i12;
                }
                if (value <= i12) {
                    n3Var.setMinValue(i11);
                    n3Var.setMaxValue(i12 == i15 ? i14 : 59);
                } else if (value >= i15) {
                    if (i12 != i15) {
                        i11 = 0;
                    }
                    n3Var.setMinValue(i11);
                    n3Var.setMaxValue(i14);
                } else if (i12 == i15) {
                    n3Var.setMinValue(i11);
                    n3Var.setMaxValue(i14);
                } else {
                    n3Var.setMinValue(0);
                    n3Var.setMaxValue(59);
                }
                if (minValue > n3Var.getMaxValue()) {
                    minValue = n3Var.getMaxValue();
                    n3Var.setValue(minValue);
                } else if (minValue < n3Var.getMinValue()) {
                    minValue = n3Var.getMinValue();
                    n3Var.setValue(minValue);
                }
                if (!bool.booleanValue()) {
                    l3Var.setValue(value);
                    n3Var.setValue(minValue);
                }
                m3Var.invalidate();
                break;
        }
    }

    public i3(i5 i5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, cg.y2[] y2VarArr) {
        this.f9444e = i5Var;
        this.f9442b = i10;
        this.f9443c = i11;
        this.d = i12;
        this.f9445f = tL_starGiftUnique;
        this.f9446g = y2VarArr;
    }
}
