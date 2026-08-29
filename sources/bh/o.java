package bh;

import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
public final class o extends a1 {
    public final t f2692a;
    public final u f2693b;

    public o(u uVar, t tVar) {
        this.f2693b = uVar;
        this.f2692a = tVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t tVar = this.f2692a;
        if (!tVar.h && !tVar.f2706i) {
            u uVar = this.f2693b;
            if ((uVar.f2710c.U2.f29942x.size() - 1) - uVar.f2710c.T2.M0() < 5) {
                tVar.a();
            }
        }
    }
}
