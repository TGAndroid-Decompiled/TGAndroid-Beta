package di;

import android.view.View;
public final class d2 implements View.OnClickListener {
    public final int f8395a;
    public final c6 f8396b;
    public final int f8397c;

    public d2(c6 c6Var, int i7, int i10) {
        this.f8395a = i10;
        this.f8396b = c6Var;
        this.f8397c = i7;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        int i11;
        int i12;
        switch (this.f8395a) {
            case 0:
                c6 c6Var = this.f8396b;
                int i13 = this.f8397c;
                c6Var.Q2 = i13;
                e4 e4Var = c6Var.V1;
                int currentPosition = e4Var.getCurrentPosition();
                if (i13 > c6Var.D1()) {
                    i7 = 1;
                } else {
                    i7 = -1;
                }
                e4Var.C(currentPosition + i7);
                return;
            case 1:
                c6 c6Var2 = this.f8396b;
                int i14 = this.f8397c;
                c6Var2.Q2 = i14;
                e4 e4Var2 = c6Var2.V1;
                int currentPosition2 = e4Var2.getCurrentPosition();
                if (i14 > c6Var2.D1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                e4Var2.C(currentPosition2 + i10);
                return;
            case 2:
                c6 c6Var3 = this.f8396b;
                int i15 = this.f8397c;
                c6Var3.Q2 = i15;
                e4 e4Var3 = c6Var3.V1;
                int currentPosition3 = e4Var3.getCurrentPosition();
                if (i15 > c6Var3.D1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                e4Var3.C(currentPosition3 + i11);
                return;
            default:
                c6 c6Var4 = this.f8396b;
                int i16 = this.f8397c;
                c6Var4.Q2 = i16;
                e4 e4Var4 = c6Var4.V1;
                int currentPosition4 = e4Var4.getCurrentPosition();
                if (i16 > c6Var4.D1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                e4Var4.C(currentPosition4 + i12);
                return;
        }
    }
}
