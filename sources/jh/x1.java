package jh;

import android.view.View;
public final class x1 implements View.OnClickListener {
    public final int f13049a;
    public final h5 f13050b;
    public final int f13051c;

    public x1(h5 h5Var, int i10, int i11) {
        this.f13049a = i11;
        this.f13050b = h5Var;
        this.f13051c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f13049a) {
            case 0:
                h5 h5Var = this.f13050b;
                int i14 = this.f13051c;
                h5Var.N0 = i14;
                p3 p3Var = h5Var.V;
                int currentPosition = p3Var.getCurrentPosition();
                if (i14 > h5Var.G1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                p3Var.D(currentPosition + i10);
                return;
            case 1:
                h5 h5Var2 = this.f13050b;
                int i15 = this.f13051c;
                h5Var2.N0 = i15;
                p3 p3Var2 = h5Var2.V;
                int currentPosition2 = p3Var2.getCurrentPosition();
                if (i15 > h5Var2.G1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                p3Var2.D(currentPosition2 + i11);
                return;
            case 2:
                h5 h5Var3 = this.f13050b;
                int i16 = this.f13051c;
                h5Var3.N0 = i16;
                p3 p3Var3 = h5Var3.V;
                int currentPosition3 = p3Var3.getCurrentPosition();
                if (i16 > h5Var3.G1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                p3Var3.D(currentPosition3 + i12);
                return;
            default:
                h5 h5Var4 = this.f13050b;
                int i17 = this.f13051c;
                h5Var4.N0 = i17;
                p3 p3Var4 = h5Var4.V;
                int currentPosition4 = p3Var4.getCurrentPosition();
                if (i17 > h5Var4.G1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                p3Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
