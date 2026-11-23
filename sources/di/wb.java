package di;

import android.content.Context;
import org.telegram.messenger.hd;
public final class wb extends jc {
    public final boolean f10015n0;
    public final int f10016o0;
    public final mc f10017p0;

    public wb(mc mcVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, int i7) {
        super(context, h6Var);
        this.f10017p0 = mcVar;
        this.f10015n0 = z10;
        this.f10016o0 = i7;
    }

    @Override
    public final void e(int i7) {
        long j3 = i7;
        mc mcVar = this.f10017p0;
        mcVar.O0(j3);
        hi.e eVar = mcVar.f9378x1;
        if (eVar != null) {
            eVar.i(pb.Z0(false, hd.a0(null, null, 2131744804, hd.E(j3, ',')), mcVar.N1), true, true);
        }
        if (this.f10015n0) {
            fi.r0 r0Var = mcVar.B1;
            r0Var.f12522g = j3;
            mcVar.C1.set(r0Var);
            int i10 = this.f10016o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }

    @Override
    public final void setValue(int i7) {
        super.setValue(i7);
        if (this.f10015n0) {
            int i10 = this.f10016o0;
            f(fi.t.b(i10, i7, 3), fi.t.b(i10, i7, 4), true);
        }
    }
}
