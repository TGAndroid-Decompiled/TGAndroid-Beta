package defpackage;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class rub implements wy1, z97, no7, f39 {
    public final qvb a;

    public rub(qvb qvbVar) {
        this.a = qvbVar;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        int i = vxcVar.a.f(519).d;
        qvb qvbVar = this.a;
        qvbVar.h1 = i;
        mvb mvbVar = qvbVar.s0;
        if (mvbVar != null) {
            mvbVar.setPadding(0, 0, 0, i);
        }
        ttb ttbVar = qvbVar.n;
        if (ttbVar != null) {
            ((TextView) ttbVar.d).setTranslationY((-qvbVar.h1) - qvbVar.g1);
        }
        qvbVar.h.setTranslationY(((-qvbVar.Y0) - qvbVar.h1) - qvbVar.g1);
        qvbVar.B0();
        return vxc.b;
    }

    @Override
    public final boolean b(TLRPC.TL_error tL_error) {
        return this.a.J0(tL_error);
    }

    @Override
    public final boolean mo8e(float f, float f2, int i, View view) {
        return this.a.I0(view, f);
    }

    @Override
    public final void h(boolean z, boolean z2) {
        qvb qvbVar = this.a;
        qvbVar.V0.j(qvbVar.S0.b(), z, z2);
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g(float f) {
    }
}
