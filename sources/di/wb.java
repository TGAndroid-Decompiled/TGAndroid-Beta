package di;

import android.content.Context;
import org.telegram.messenger.gd;
public final class wb extends jc {
    public final boolean f9980n0;
    public final int f9981o0;
    public final mc f9982p0;

    public wb(mc mcVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, int i7) {
        super(context, i6Var);
        this.f9982p0 = mcVar;
        this.f9980n0 = z10;
        this.f9981o0 = i7;
    }

    @Override
    public final void e(int i7) {
        long j3 = i7;
        mc mcVar = this.f9982p0;
        mcVar.O0(j3);
        hi.d dVar = mcVar.f9354x1;
        if (dVar != null) {
            dVar.i(pb.Z0(false, gd.a0(null, null, 2131744812, gd.E(j3, ',')), mcVar.N1), true, true);
        }
        if (this.f9980n0) {
            fi.r0 r0Var = mcVar.B1;
            r0Var.f12491g = j3;
            mcVar.C1.set(r0Var);
            int i10 = this.f9981o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.f9980n0) {
            int i10 = this.f9981o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }
}
