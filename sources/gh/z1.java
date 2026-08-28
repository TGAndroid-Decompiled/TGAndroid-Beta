package gh;

import android.view.View;
public final class z1 implements View.OnClickListener {
    public final int f9245a;
    public final k5 f9246b;
    public final int f9247c;

    public z1(k5 k5Var, int i9, int i10) {
        this.f9245a = i10;
        this.f9246b = k5Var;
        this.f9247c = i9;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        int i11;
        int i12;
        switch (this.f9245a) {
            case 0:
                k5 k5Var = this.f9246b;
                int i13 = this.f9247c;
                k5Var.N0 = i13;
                q3 q3Var = k5Var.V;
                int currentPosition = q3Var.getCurrentPosition();
                if (i13 > k5Var.G1()) {
                    i9 = 1;
                } else {
                    i9 = -1;
                }
                q3Var.D(currentPosition + i9);
                return;
            case 1:
                k5 k5Var2 = this.f9246b;
                int i14 = this.f9247c;
                k5Var2.N0 = i14;
                q3 q3Var2 = k5Var2.V;
                int currentPosition2 = q3Var2.getCurrentPosition();
                if (i14 > k5Var2.G1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                q3Var2.D(currentPosition2 + i10);
                return;
            case 2:
                k5 k5Var3 = this.f9246b;
                int i15 = this.f9247c;
                k5Var3.N0 = i15;
                q3 q3Var3 = k5Var3.V;
                int currentPosition3 = q3Var3.getCurrentPosition();
                if (i15 > k5Var3.G1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                q3Var3.D(currentPosition3 + i11);
                return;
            default:
                k5 k5Var4 = this.f9246b;
                int i16 = this.f9247c;
                k5Var4.N0 = i16;
                q3 q3Var4 = k5Var4.V;
                int currentPosition4 = q3Var4.getCurrentPosition();
                if (i16 > k5Var4.G1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                q3Var4.D(currentPosition4 + i12);
                return;
        }
    }
}
