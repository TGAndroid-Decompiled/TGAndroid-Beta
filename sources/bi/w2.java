package bi;

import android.view.View;
public final class w2 implements View.OnClickListener {
    public final int f5594a;
    public final h7 f5595b;
    public final int f5596c;

    public w2(h7 h7Var, int i10, int i11) {
        this.f5594a = i11;
        this.f5595b = h7Var;
        this.f5596c = i10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f5594a) {
            case 0:
                h7 h7Var = this.f5595b;
                int i14 = this.f5596c;
                h7Var.U0 = i14;
                d5 d5Var = h7Var.Z;
                int currentPosition = d5Var.getCurrentPosition();
                if (i14 > h7Var.a2()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                d5Var.E(currentPosition + i10);
                return;
            case 1:
                h7 h7Var2 = this.f5595b;
                int i15 = this.f5596c;
                h7Var2.U0 = i15;
                d5 d5Var2 = h7Var2.Z;
                int currentPosition2 = d5Var2.getCurrentPosition();
                if (i15 > h7Var2.a2()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                d5Var2.E(currentPosition2 + i11);
                return;
            case 2:
                h7 h7Var3 = this.f5595b;
                int i16 = this.f5596c;
                h7Var3.U0 = i16;
                d5 d5Var3 = h7Var3.Z;
                int currentPosition3 = d5Var3.getCurrentPosition();
                if (i16 > h7Var3.a2()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                d5Var3.E(currentPosition3 + i12);
                return;
            default:
                h7 h7Var4 = this.f5595b;
                int i17 = this.f5596c;
                h7Var4.U0 = i17;
                d5 d5Var4 = h7Var4.Z;
                int currentPosition4 = d5Var4.getCurrentPosition();
                if (i17 > h7Var4.a2()) {
                    i13 = 1;
                } else {
                    i13 = -1;
                }
                d5Var4.E(currentPosition4 + i13);
                return;
        }
    }
}
