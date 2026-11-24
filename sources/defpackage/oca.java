package defpackage;

import android.content.Context;
import android.graphics.Rect;
public final class oca extends xr8 {
    public final nfa x;

    public oca(nfa nfaVar, Context context, u1b u1bVar, nca ncaVar) {
        super(context, u1bVar, ncaVar);
        this.x = nfaVar;
    }

    @Override
    public final void b() {
        sca scaVar;
        Rect rect = this.s;
        rect.set(0, 0, getMeasuredWidth(), (int) getVisualHeight());
        setClipBounds(rect);
        invalidate();
        nfa nfaVar = this.x;
        iea[] ieaVarArr = nfaVar.n0;
        if (ieaVarArr != null) {
            for (iea ieaVar : ieaVarArr) {
                if (ieaVar != null && (scaVar = ieaVar.h) != null) {
                    int paddingTop = scaVar.getPaddingTop();
                    sca scaVar2 = ieaVar.h;
                    int paddingLeft = scaVar2.getPaddingLeft();
                    int T = nfaVar.T(ieaVar.F);
                    int paddingRight = ieaVar.h.getPaddingRight();
                    sca scaVar3 = ieaVar.h;
                    int S = nfaVar.S(nfaVar.s0());
                    scaVar3.i3 = S;
                    scaVar2.setPadding(paddingLeft, T, paddingRight, S);
                    int paddingTop2 = paddingTop - ieaVar.h.getPaddingTop();
                    if (paddingTop2 != 0) {
                        gl.J(ieaVar.h, new wba(ieaVar, paddingTop2, (byte) 2));
                    }
                }
                if (ieaVar != null && ieaVar.s != null) {
                    nfaVar.I1(ieaVar);
                }
            }
        }
        fj3 fj3Var = nfaVar.S0;
        if (fj3Var != null) {
            fj3Var.setTranslationY(nfaVar.O1);
        }
    }
}
