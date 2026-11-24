package defpackage;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class swb implements j02, ac7, qq7, i59 {
    public final sxb a;

    public swb(sxb sxbVar) {
        this.a = sxbVar;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        int i = wzcVar.a.f(519).d;
        sxb sxbVar = this.a;
        sxbVar.h1 = i;
        nxb nxbVar = sxbVar.s0;
        if (nxbVar != null) {
            nxbVar.setPadding(0, 0, 0, i);
        }
        uvb uvbVar = sxbVar.n;
        if (uvbVar != null) {
            ((TextView) uvbVar.d).setTranslationY((-sxbVar.h1) - sxbVar.g1);
        }
        sxbVar.h.setTranslationY(((-sxbVar.Y0) - sxbVar.h1) - sxbVar.g1);
        sxbVar.C0();
        return wzc.b;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        return this.a.K0(tL_error);
    }

    @Override
    public final boolean mo14d(float f, float f2, int i, View view) {
        return this.a.J0(view, f);
    }

    @Override
    public final void e(boolean z, boolean z2) {
        sxb sxbVar = this.a;
        sxbVar.V0.j(sxbVar.S0.b(), z, z2);
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k(float f) {
    }
}
