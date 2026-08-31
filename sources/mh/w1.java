package mh;

import android.view.View;
public final class w1 implements View.OnClickListener {
    public final int f14963a;
    public final g5 f14964b;
    public final int f14965c;

    public w1(g5 g5Var, int i10, int i11) {
        this.f14963a = i11;
        this.f14964b = g5Var;
        this.f14965c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f14963a) {
            case 0:
                g5 g5Var = this.f14964b;
                int i14 = this.f14965c;
                g5Var.O0 = i14;
                o3 o3Var = g5Var.W;
                int currentPosition = o3Var.getCurrentPosition();
                if (i14 > g5Var.G1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                o3Var.D(currentPosition + i10);
                return;
            case 1:
                g5 g5Var2 = this.f14964b;
                int i15 = this.f14965c;
                g5Var2.O0 = i15;
                o3 o3Var2 = g5Var2.W;
                int currentPosition2 = o3Var2.getCurrentPosition();
                if (i15 > g5Var2.G1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                o3Var2.D(currentPosition2 + i11);
                return;
            case 2:
                g5 g5Var3 = this.f14964b;
                int i16 = this.f14965c;
                g5Var3.O0 = i16;
                o3 o3Var3 = g5Var3.W;
                int currentPosition3 = o3Var3.getCurrentPosition();
                if (i16 > g5Var3.G1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                o3Var3.D(currentPosition3 + i12);
                return;
            default:
                g5 g5Var4 = this.f14964b;
                int i17 = this.f14965c;
                g5Var4.O0 = i17;
                o3 o3Var4 = g5Var4.W;
                int currentPosition4 = o3Var4.getCurrentPosition();
                if (i17 > g5Var4.G1()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                o3Var4.D(currentPosition4 + i13);
                return;
        }
    }
}
