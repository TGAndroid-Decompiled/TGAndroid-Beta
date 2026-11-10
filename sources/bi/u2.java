package bi;

import android.view.View;
public final class u2 implements View.OnClickListener {
    public final int f4792a;
    public final k7 f4793b;
    public final int f4794c;

    public u2(k7 k7Var, int i7, int i10) {
        this.f4792a = i10;
        this.f4793b = k7Var;
        this.f4794c = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f4792a) {
            case 0:
                k7 k7Var = this.f4793b;
                int i13 = this.f4794c;
                k7Var.P2 = i13;
                f5 f5Var = k7Var.U1;
                int currentPosition = f5Var.getCurrentPosition();
                if (i13 > k7Var.C1()) {
                    i7 = 1;
                } else {
                    i7 = -1;
                }
                f5Var.E(currentPosition + i7);
                return;
            case 1:
                k7 k7Var2 = this.f4793b;
                int i14 = this.f4794c;
                k7Var2.P2 = i14;
                f5 f5Var2 = k7Var2.U1;
                int currentPosition2 = f5Var2.getCurrentPosition();
                if (i14 > k7Var2.C1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                f5Var2.E(currentPosition2 + i10);
                return;
            case 2:
                k7 k7Var3 = this.f4793b;
                int i15 = this.f4794c;
                k7Var3.P2 = i15;
                f5 f5Var3 = k7Var3.U1;
                int currentPosition3 = f5Var3.getCurrentPosition();
                if (i15 > k7Var3.C1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                f5Var3.E(currentPosition3 + i11);
                return;
            default:
                k7 k7Var4 = this.f4793b;
                int i16 = this.f4794c;
                k7Var4.P2 = i16;
                f5 f5Var4 = k7Var4.U1;
                int currentPosition4 = f5Var4.getCurrentPosition();
                if (i16 > k7Var4.C1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                f5Var4.E(currentPosition4 + i12);
                return;
        }
    }
}
