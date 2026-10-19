package ai;

import android.view.View;
public final class a3 implements View.OnClickListener {
    public final int f950a;
    public final l7 f951b;
    public final int f952c;

    public a3(l7 l7Var, int i10, int i11) {
        this.f950a = i11;
        this.f951b = l7Var;
        this.f952c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f950a) {
            case 0:
                l7 l7Var = this.f951b;
                int i14 = this.f952c;
                l7Var.U0 = i14;
                i5 i5Var = l7Var.Z;
                int currentPosition = i5Var.getCurrentPosition();
                if (i14 > l7Var.b2()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                i5Var.D(currentPosition + i10);
                return;
            case 1:
                l7 l7Var2 = this.f951b;
                int i15 = this.f952c;
                l7Var2.U0 = i15;
                i5 i5Var2 = l7Var2.Z;
                int currentPosition2 = i5Var2.getCurrentPosition();
                if (i15 > l7Var2.b2()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                i5Var2.D(currentPosition2 + i11);
                return;
            case 2:
                l7 l7Var3 = this.f951b;
                int i16 = this.f952c;
                l7Var3.U0 = i16;
                i5 i5Var3 = l7Var3.Z;
                int currentPosition3 = i5Var3.getCurrentPosition();
                if (i16 > l7Var3.b2()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                i5Var3.D(currentPosition3 + i12);
                return;
            default:
                l7 l7Var4 = this.f951b;
                int i17 = this.f952c;
                l7Var4.U0 = i17;
                i5 i5Var4 = l7Var4.Z;
                int currentPosition4 = i5Var4.getCurrentPosition();
                if (i17 > l7Var4.b2()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                i5Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
