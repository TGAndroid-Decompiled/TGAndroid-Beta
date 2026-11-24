package defpackage;

import android.view.View;
public final class pgc implements g59, h59 {
    public final vgc a;

    public pgc(vgc vgcVar) {
        this.a = vgcVar;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        vgc vgcVar = this.a;
        ugc ugcVar = vgcVar.E;
        if (ugcVar == null || ugcVar.b()) {
            tgc tgcVar = (tgc) view;
            if (i == vgcVar.G && vgcVar.E != null) {
                return;
            }
            kac kacVar = vgcVar.m0;
            if (kacVar != null && ((Boolean) kacVar.j(Integer.valueOf(tgcVar.a.a), Integer.valueOf(i))).booleanValue()) {
                return;
            }
            vgcVar.e(tgcVar.a.a, i);
        }
    }

    @Override
    public final boolean g(int i, View view) {
        kac kacVar = this.a.b;
        if (kacVar == null) {
            return false;
        }
        return ((Boolean) kacVar.j(Integer.valueOf(((tgc) view).a.a), view)).booleanValue();
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
