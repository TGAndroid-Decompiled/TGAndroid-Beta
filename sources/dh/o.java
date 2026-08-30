package dh;

import androidx.recyclerview.widget.RecyclerView;
import f2.z0;
public final class o extends z0 {
    public final t f4926a;
    public final u f4927b;

    public o(u uVar, t tVar) {
        this.f4927b = uVar;
        this.f4926a = tVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t tVar = this.f4926a;
        if (!tVar.h && !tVar.f4939i) {
            u uVar = this.f4927b;
            if ((uVar.f4943c.V2.f30243x.size() - 1) - uVar.f4943c.U2.M0() < 5) {
                tVar.a();
            }
        }
    }
}
