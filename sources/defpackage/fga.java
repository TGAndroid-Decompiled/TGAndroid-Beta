package defpackage;

import android.content.Context;
import android.graphics.Rect;
public final class fga extends gv8 {
    public final eja x;

    public fga(eja ejaVar, Context context, r5b r5bVar, ega egaVar) {
        super(context, r5bVar, egaVar);
        this.x = ejaVar;
    }

    @Override
    public final void b() {
        jga jgaVar;
        Rect rect = this.s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        eja ejaVar = this.x;
        zha[] zhaVarArr = ejaVar.n0;
        if (zhaVarArr != null) {
            for (zha zhaVar : zhaVarArr) {
                if (zhaVar != null && (jgaVar = zhaVar.h) != null) {
                    int paddingTop = jgaVar.getPaddingTop();
                    jga jgaVar2 = zhaVar.h;
                    int paddingLeft = jgaVar2.getPaddingLeft();
                    int T = ejaVar.T(zhaVar.F);
                    int paddingRight = zhaVar.h.getPaddingRight();
                    jga jgaVar3 = zhaVar.h;
                    int S = ejaVar.S(ejaVar.s0());
                    jgaVar3.i3 = S;
                    jgaVar2.setPadding(paddingLeft, T, paddingRight, S);
                    int paddingTop2 = paddingTop - zhaVar.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        hl.J(zhaVar.h, new jfa(zhaVar, paddingTop2, (byte) 2));
                    }
                }
                if (zhaVar != null && zhaVar.s != null) {
                    ejaVar.I1(zhaVar);
                }
            }
        }
        xj3 xj3Var = ejaVar.S0;
        if (xj3Var != null) {
            xj3Var.setTranslationY(ejaVar.O1);
        }
    }
}
