package defpackage;

import android.view.View;
public final class lc8 implements View.OnClickListener {
    public final byte a;
    public final mc8 b;
    public final Runnable c;

    public lc8(mc8 mc8Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = mc8Var;
        this.c = runnable;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Runnable runnable = this.c;
        mc8 mc8Var = this.b;
        switch (b) {
            case 0:
                bka bkaVar = mc8Var.d;
                if (bkaVar.I) {
                    mc8Var.I = runnable;
                    bkaVar.a(true);
                    return;
                }
                return;
            default:
                bka bkaVar2 = mc8Var.d;
                if (bkaVar2.I) {
                    mc8Var.I = runnable;
                    bkaVar2.a(true);
                    return;
                }
                return;
        }
    }
}
