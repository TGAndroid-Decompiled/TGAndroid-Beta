package ci;

import android.view.View;
public final class j2 implements View.OnClickListener {
    public final int f5326a;
    public final l6 f5327b;
    public final int f5328c;

    public j2(l6 l6Var, int i3, int i10) {
        this.f5326a = i10;
        this.f5327b = l6Var;
        this.f5328c = i3;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        int i10;
        int i11;
        int i12;
        switch (this.f5326a) {
            case 0:
                l6 l6Var = this.f5327b;
                int i13 = this.f5328c;
                l6Var.N2 = i13;
                n4 n4Var = l6Var.S1;
                int currentPosition = n4Var.getCurrentPosition();
                if (i13 > l6Var.D1()) {
                    i3 = 1;
                } else {
                    i3 = -1;
                }
                n4Var.D(currentPosition + i3);
                return;
            case 1:
                l6 l6Var2 = this.f5327b;
                int i14 = this.f5328c;
                l6Var2.N2 = i14;
                n4 n4Var2 = l6Var2.S1;
                int currentPosition2 = n4Var2.getCurrentPosition();
                if (i14 > l6Var2.D1()) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                n4Var2.D(currentPosition2 + i10);
                return;
            case 2:
                l6 l6Var3 = this.f5327b;
                int i15 = this.f5328c;
                l6Var3.N2 = i15;
                n4 n4Var3 = l6Var3.S1;
                int currentPosition3 = n4Var3.getCurrentPosition();
                if (i15 > l6Var3.D1()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                n4Var3.D(currentPosition3 + i11);
                return;
            default:
                l6 l6Var4 = this.f5327b;
                int i16 = this.f5328c;
                l6Var4.N2 = i16;
                n4 n4Var4 = l6Var4.S1;
                int currentPosition4 = n4Var4.getCurrentPosition();
                if (i16 > l6Var4.D1()) {
                    i12 = 1;
                } else {
                    i12 = -1;
                }
                n4Var4.D(currentPosition4 + i12);
                return;
        }
    }
}
