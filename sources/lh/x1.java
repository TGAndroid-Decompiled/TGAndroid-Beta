package lh;

import android.view.View;
public final class x1 implements View.OnClickListener {
    public final int f13313a;
    public final g5 f13314b;
    public final int f13315c;

    public x1(g5 g5Var, int i10, int i11) {
        this.f13313a = i11;
        this.f13314b = g5Var;
        this.f13315c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f13313a) {
            case 0:
                g5 g5Var = this.f13314b;
                int i14 = this.f13315c;
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
                g5 g5Var2 = this.f13314b;
                int i15 = this.f13315c;
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
                g5 g5Var3 = this.f13314b;
                int i16 = this.f13315c;
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
                g5 g5Var4 = this.f13314b;
                int i17 = this.f13315c;
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
