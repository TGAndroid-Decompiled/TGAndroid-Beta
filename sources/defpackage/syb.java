package defpackage;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class syb implements oz1, gc7, nr7, u69 {
    public final tzb a;

    public syb(tzb tzbVar) {
        this.a = tzbVar;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        int i = l2dVar.a.f(519).d;
        tzb tzbVar = this.a;
        tzbVar.h1 = i;
        ozb ozbVar = tzbVar.s0;
        if (ozbVar != null) {
            ozbVar.setPadding(0, 0, 0, i);
        }
        uxb uxbVar = tzbVar.n;
        if (uxbVar != null) {
            ((TextView) uxbVar.d).setTranslationY((-tzbVar.h1) - tzbVar.g1);
        }
        tzbVar.h.setTranslationY(((-tzbVar.Y0) - tzbVar.h1) - tzbVar.g1);
        tzbVar.C0();
        return l2d.b;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        return this.a.K0(tL_error);
    }

    @Override
    public final boolean mo8d(float f, float f2, int i, View view) {
        return this.a.J0(view, f);
    }

    @Override
    public final void g(boolean z, boolean z2) {
        tzb tzbVar = this.a;
        tzbVar.V0.j(tzbVar.S0.b(), z, z2);
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h(float f) {
    }
}
