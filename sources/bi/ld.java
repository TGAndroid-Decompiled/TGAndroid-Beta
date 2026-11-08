package bi;

import android.content.Context;
public final class ld extends zd {
    public final boolean m0;
    public final int f4295n0;
    public final ce f4296o0;

    public ld(ce ceVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, int i7) {
        super(context, f6Var);
        this.f4296o0 = ceVar;
        this.m0 = z9;
        this.f4295n0 = i7;
    }

    @Override
    public final void e(int i7) {
        long j3 = i7;
        ce ceVar = this.f4296o0;
        ceVar.N0(j3);
        fi.d dVar = ceVar.f3623t1;
        if (dVar != null) {
            dVar.i(dd.Y0(false, org.telegram.messenger.id.a0(null, null, 2131745050, org.telegram.messenger.id.E(j3, ',')), ceVar.J1), true, true);
        }
        if (this.m0) {
            di.s0 s0Var = ceVar.f3627x1;
            s0Var.f9741g = j3;
            ceVar.f3628y1.set(s0Var);
            int i10 = this.f4295n0;
            f(di.t.b(i10, i7, 3), di.t.b(i10, i7, 4), true);
        }
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.m0) {
            int i10 = this.f4295n0;
            f(di.t.b(i10, i7, 3), di.t.b(i10, i7, 4), true);
        }
    }
}
