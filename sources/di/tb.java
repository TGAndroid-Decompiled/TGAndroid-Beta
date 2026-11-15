package di;

import android.content.Context;
import org.telegram.messenger.hd;
public final class tb extends gc {
    public final boolean f9494n0;
    public final int f9495o0;
    public final jc f9496p0;

    public tb(jc jcVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i7) {
        super(context, e6Var);
        this.f9496p0 = jcVar;
        this.f9494n0 = z10;
        this.f9495o0 = i7;
    }

    @Override
    public final void e(int i7) {
        long j3 = i7;
        jc jcVar = this.f9496p0;
        jcVar.N0(j3);
        hi.d dVar = jcVar.f8884x1;
        if (dVar != null) {
            dVar.i(mb.Y0(false, hd.a0(null, null, 2131745047, hd.E(j3, ',')), jcVar.N1), true, true);
        }
        if (this.f9494n0) {
            fi.s0 s0Var = jcVar.B1;
            s0Var.f12302g = j3;
            jcVar.C1.set(s0Var);
            int i10 = this.f9495o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.f9494n0) {
            int i10 = this.f9495o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }
}
