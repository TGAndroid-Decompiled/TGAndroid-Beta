package defpackage;

import android.view.View;
public final class oic implements s69, t69 {
    public final uic a;

    public oic(uic uicVar) {
        this.a = uicVar;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        uic uicVar = this.a;
        tic ticVar = uicVar.E;
        if (ticVar == null || ticVar.b()) {
            sic sicVar = (sic) view;
            if (i == uicVar.G && uicVar.E != null) {
                return;
            }
            jcc jccVar = uicVar.m0;
            if (jccVar != null && ((Boolean) jccVar.g(Integer.valueOf(sicVar.a.a), Integer.valueOf(i))).booleanValue()) {
                return;
            }
            uicVar.e(sicVar.a.a, i);
        }
    }

    @Override
    public final boolean e(int i, View view) {
        jcc jccVar = this.a.b;
        if (jccVar == null) {
            return false;
        }
        return ((Boolean) jccVar.g(Integer.valueOf(((sic) view).a.a), view)).booleanValue();
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
