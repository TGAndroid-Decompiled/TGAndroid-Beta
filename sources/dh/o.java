package dh;

import androidx.recyclerview.widget.RecyclerView;
import f2.z0;
public final class o extends z0 {
    public final t f4932a;
    public final u f4933b;

    public o(u uVar, t tVar) {
        this.f4933b = uVar;
        this.f4932a = tVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t tVar = this.f4932a;
        if (!tVar.h && !tVar.f4945i) {
            u uVar = this.f4933b;
            if ((uVar.f4949c.V2.f30151x.size() - 1) - uVar.f4949c.U2.M0() < 5) {
                tVar.a();
            }
        }
    }
}
