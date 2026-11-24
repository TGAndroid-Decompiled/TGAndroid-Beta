package defpackage;

import android.view.View;
public final class pec implements d39, e39 {
    public final vec a;

    public pec(vec vecVar) {
        this.a = vecVar;
    }

    @Override
    public final boolean d(int i, View view) {
        j8c j8cVar = this.a.b;
        if (j8cVar == null) {
            return false;
        }
        return ((Boolean) j8cVar.g(Integer.valueOf(((tec) view).a.a), view)).booleanValue();
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        vec vecVar = this.a;
        uec uecVar = vecVar.E;
        if (uecVar == null || uecVar.b()) {
            tec tecVar = (tec) view;
            if (i == vecVar.G && vecVar.E != null) {
                return;
            }
            j8c j8cVar = vecVar.m0;
            if (j8cVar != null && ((Boolean) j8cVar.g(Integer.valueOf(tecVar.a.a), Integer.valueOf(i))).booleanValue()) {
                return;
            }
            vecVar.e(tecVar.a.a, i);
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
