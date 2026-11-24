package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zqa extends AnimatorListenerAdapter {
    public final byte a;
    public final n28 b;
    public final wsa c;

    public zqa(wsa wsaVar, int i, n28 n28Var) {
        this.c = wsaVar;
        this.a = i;
        this.b = n28Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        int i3;
        wsa wsaVar = this.c;
        wsaVar.O1();
        gra graVar = wsaVar.b2;
        int i4 = 8;
        byte b = this.a;
        if (b == 0) {
            i = 0;
        } else {
            i = 8;
        }
        graVar.setVisibility(i);
        gra graVar2 = wsaVar.n2;
        if (b == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        graVar2.setVisibility(i2);
        gra graVar3 = wsaVar.w2;
        if (b == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        graVar3.setVisibility(i3);
        gra graVar4 = wsaVar.y2;
        if (b == 3) {
            i4 = 0;
        }
        graVar4.setVisibility(i4);
        wsaVar.B2();
        wsaVar.X2 = null;
        n28 n28Var = this.b;
        if (n28Var != null) {
            n28Var.run();
        }
    }
}
