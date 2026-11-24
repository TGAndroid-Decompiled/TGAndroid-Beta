package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class kw9 implements f39 {
    public final int a;
    public final Context b;
    public final wjb c;
    public final Integer d;
    public final tx9 e;

    public kw9(tx9 tx9Var, int i, Context context, wjb wjbVar, Integer num) {
        this.e = tx9Var;
        this.a = i;
        this.b = context;
        this.c = wjbVar;
        this.d = num;
    }

    @Override
    public final boolean mo8e(float f, float f2, int i, View view) {
        tx9 tx9Var = this.e;
        int i2 = tx9Var.W;
        int i3 = this.a;
        if (i3 != 11 && i3 != 13 && tx9Var.i1 && (view instanceof dx9)) {
            if (i3 != 1 && i3 != 8) {
                dx9 dx9Var = (dx9) view;
                if (dx9Var.e != null && (i3 == 0 || i3 == 12 || i3 == 9 || i3 == 10)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = dx9Var.w;
                    jw9 jw9Var = new jw9(this, this.b, tx9Var.V1, tx9Var, dx9Var, this.c, view, tL_starGiftUnique);
                    tx9Var.Y0 = jw9Var;
                    jw9Var.show();
                    try {
                        view.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    return true;
                }
            } else {
                tx9Var.k();
                try {
                    tx9Var.performHapticFeedback(0);
                } catch (Exception unused2) {
                }
                dx9 dx9Var2 = (dx9) view;
                if (!dx9Var2.s && !y6c.h(i2).p()) {
                    gm gmVar = dx9Var2.e;
                    TLRPC.Document document = gmVar.document;
                    if (document == null) {
                        document = vl.e(i2, gmVar.documentId);
                    }
                    tx9Var.o(dx9Var2, Long.valueOf(dx9Var2.e.documentId), document, dx9Var2.w, null);
                    return true;
                }
                tx9Var.T0 = dx9Var2;
                tx9Var.V0 = 0.0f;
                tx9Var.U0 = false;
                if (dx9Var2.s) {
                    tx9.a(tx9Var, null);
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i2).r.get(tx9Var.T0.y.f);
                    if (tL_availableReaction != null) {
                        tx9Var.W0.Z(gl5.b(tL_availableReaction.select_animation), "60_60_pcache", null, null, null, 0L, "tgs", tx9Var.T0.y, 0);
                    }
                } else {
                    tx9.a(tx9Var, new vl(4, i2, tx9Var.T0.e.documentId));
                }
                tx9Var.i0.invalidate();
                tx9Var.l();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void f() {
        tx9 tx9Var = this.e;
        if (tx9Var.T0 != null) {
            tx9Var.U0 = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(tx9Var.V0, 0.0f);
            ofFloat.addUpdateListener(new x89(this, (byte) 16));
            ofFloat.addListener(new ng9(this, (byte) 7));
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(s33.f);
            ofFloat.start();
        }
    }

    @Override
    public final void g(float f) {
    }
}
