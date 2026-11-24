package defpackage;

import android.content.Context;
import android.graphics.Rect;
public final class oea extends yt8 {
    public final nha x;

    public oea(nha nhaVar, Context context, v3b v3bVar, nea neaVar) {
        super(context, v3bVar, neaVar);
        this.x = nhaVar;
    }

    @Override
    public final void b() {
        sea seaVar;
        Rect rect = this.s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        nha nhaVar = this.x;
        iga[] igaVarArr = nhaVar.n0;
        if (igaVarArr != null) {
            for (iga igaVar : igaVarArr) {
                if (igaVar != null && (seaVar = igaVar.h) != null) {
                    int paddingTop = seaVar.getPaddingTop();
                    sea seaVar2 = igaVar.h;
                    int paddingLeft = seaVar2.getPaddingLeft();
                    int T = nhaVar.T(igaVar.F);
                    int paddingRight = igaVar.h.getPaddingRight();
                    sea seaVar3 = igaVar.h;
                    int S = nhaVar.S(nhaVar.s0());
                    seaVar3.i3 = S;
                    seaVar2.setPadding(paddingLeft, T, paddingRight, S);
                    int paddingTop2 = paddingTop - igaVar.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        gm.J(igaVar.h, new xda(igaVar, paddingTop2, (byte) 2));
                    }
                }
                if (igaVar != null && igaVar.s != null) {
                    nhaVar.I1(igaVar);
                }
            }
        }
        qk3 qk3Var = nhaVar.S0;
        if (qk3Var != null) {
            qk3Var.setTranslationY(nhaVar.O1);
        }
    }
}
