package kg;

import androidx.recyclerview.widget.RecyclerView;
public final class a1 extends s4.s0 {
    public final int f10994a;
    public final i1 f10995b;

    public a1(i1 i1Var, int i10) {
        this.f10994a = i10;
        this.f10995b = i1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f10994a) {
            case 0:
                i1 i1Var = this.f10995b;
                i1Var.f21587b.invalidate();
                i1Var.I0();
                return;
            default:
                i1 i1Var2 = this.f10995b;
                i1Var2.f21587b.invalidate();
                i1Var2.I0();
                return;
        }
    }
}
