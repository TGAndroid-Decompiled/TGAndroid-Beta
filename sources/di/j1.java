package di;

import android.view.View;
public final class j1 implements View.OnClickListener {
    public final int f9066a;
    public final f6 f9067b;
    public final int f9068c;

    public j1(f6 f6Var, int i7, int i10) {
        this.f9066a = i10;
        this.f9067b = f6Var;
        this.f9068c = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f9066a) {
            case 0:
                f6 f6Var = this.f9067b;
                int i13 = this.f9068c;
                f6Var.Q2 = i13;
                h4 h4Var = f6Var.V1;
                int currentPosition = h4Var.getCurrentPosition();
                if (i13 > f6Var.I1()) {
                    i7 = 1;
                } else {
                    i7 = -1;
                }
                h4Var.A(currentPosition + i7);
                return;
            case 1:
                f6 f6Var2 = this.f9067b;
                int i14 = this.f9068c;
                f6Var2.Q2 = i14;
                h4 h4Var2 = f6Var2.V1;
                int currentPosition2 = h4Var2.getCurrentPosition();
                if (i14 > f6Var2.I1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                h4Var2.A(currentPosition2 + i10);
                return;
            case 2:
                f6 f6Var3 = this.f9067b;
                int i15 = this.f9068c;
                f6Var3.Q2 = i15;
                h4 h4Var3 = f6Var3.V1;
                int currentPosition3 = h4Var3.getCurrentPosition();
                if (i15 > f6Var3.I1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                h4Var3.A(currentPosition3 + i11);
                return;
            default:
                f6 f6Var4 = this.f9067b;
                int i16 = this.f9068c;
                f6Var4.Q2 = i16;
                h4 h4Var4 = f6Var4.V1;
                int currentPosition4 = h4Var4.getCurrentPosition();
                if (i16 > f6Var4.I1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                h4Var4.A(currentPosition4 + i12);
                return;
        }
    }
}
