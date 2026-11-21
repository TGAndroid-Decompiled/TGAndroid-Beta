package di;

import android.content.Context;
import org.telegram.messenger.gd;
public final class wb extends jc {
    public final boolean f10012n0;
    public final int f10013o0;
    public final mc f10014p0;

    public wb(mc mcVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, int i7) {
        super(context, h6Var);
        this.f10014p0 = mcVar;
        this.f10012n0 = z10;
        this.f10013o0 = i7;
    }

    @Override
    public final void e(int i7) {
        long j3 = i7;
        mc mcVar = this.f10014p0;
        mcVar.O0(j3);
        hi.e eVar = mcVar.f9375x1;
        if (eVar != null) {
            eVar.i(pb.Z0(false, gd.a0(null, null, 2131744806, gd.E(j3, ',')), mcVar.N1), true, true);
        }
        if (this.f10012n0) {
            fi.r0 r0Var = mcVar.B1;
            r0Var.f12519g = j3;
            mcVar.C1.set(r0Var);
            int i10 = this.f10013o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.f10012n0) {
            int i10 = this.f10013o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }
}
