package ai;

import android.view.View;
public final class c3 implements View.OnClickListener {
    public final int f1060a;
    public final k7 f1061b;
    public final int f1062c;

    public c3(k7 k7Var, int i10, int i11) {
        this.f1060a = i11;
        this.f1061b = k7Var;
        this.f1062c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f1060a) {
            case 0:
                k7 k7Var = this.f1061b;
                int i14 = this.f1062c;
                k7Var.U0 = i14;
                h5 h5Var = k7Var.Z;
                int currentPosition = h5Var.getCurrentPosition();
                if (i14 > k7Var.b2()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                h5Var.D(currentPosition + i10);
                return;
            case 1:
                k7 k7Var2 = this.f1061b;
                int i15 = this.f1062c;
                k7Var2.U0 = i15;
                h5 h5Var2 = k7Var2.Z;
                int currentPosition2 = h5Var2.getCurrentPosition();
                if (i15 > k7Var2.b2()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                h5Var2.D(currentPosition2 + i11);
                return;
            case 2:
                k7 k7Var3 = this.f1061b;
                int i16 = this.f1062c;
                k7Var3.U0 = i16;
                h5 h5Var3 = k7Var3.Z;
                int currentPosition3 = h5Var3.getCurrentPosition();
                if (i16 > k7Var3.b2()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                h5Var3.D(currentPosition3 + i12);
                return;
            default:
                k7 k7Var4 = this.f1061b;
                int i17 = this.f1062c;
                k7Var4.U0 = i17;
                h5 h5Var4 = k7Var4.Z;
                int currentPosition4 = h5Var4.getCurrentPosition();
                if (i17 > k7Var4.b2()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                h5Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
