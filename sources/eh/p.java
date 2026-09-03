package eh;

import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
public final class p extends a1 {
    public final u f5663a;
    public final v f5664b;

    public p(v vVar, u uVar) {
        this.f5664b = vVar;
        this.f5663a = uVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u uVar = this.f5663a;
        if (!uVar.h && !uVar.f5677i) {
            v vVar = this.f5664b;
            if ((vVar.f5681c.V2.f32654x.size() - 1) - vVar.f5681c.U2.M0() < 5) {
                uVar.a();
            }
        }
    }
}
