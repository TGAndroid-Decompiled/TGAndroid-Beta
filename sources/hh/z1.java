package hh;

import android.view.View;

public final class z1 implements View.OnClickListener {

    public final int f10405a;

    public final i5 f10406b;

    public final int f10407c;

    public z1(i5 i5Var, int i10, int i11) {
        this.f10405a = i11;
        this.f10406b = i5Var;
        this.f10407c = i10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10405a) {
            case 0:
                i5 i5Var = this.f10406b;
                int i10 = this.f10407c;
                i5Var.N0 = i10;
                p3 p3Var = i5Var.V;
                p3Var.D(p3Var.getCurrentPosition() + (i10 > i5Var.G1() ? 1 : -1));
                break;
            case 1:
                i5 i5Var2 = this.f10406b;
                int i11 = this.f10407c;
                i5Var2.N0 = i11;
                p3 p3Var2 = i5Var2.V;
                p3Var2.D(p3Var2.getCurrentPosition() + (i11 > i5Var2.G1() ? 1 : -1));
                break;
            case 2:
                i5 i5Var3 = this.f10406b;
                int i12 = this.f10407c;
                i5Var3.N0 = i12;
                p3 p3Var3 = i5Var3.V;
                p3Var3.D(p3Var3.getCurrentPosition() + (i12 > i5Var3.G1() ? 1 : -1));
                break;
            default:
                i5 i5Var4 = this.f10406b;
                int i13 = this.f10407c;
                i5Var4.N0 = i13;
                p3 p3Var4 = i5Var4.V;
                p3Var4.D(p3Var4.getCurrentPosition() + (i13 > i5Var4.G1() ? 1 : -1));
                break;
        }
    }
}
