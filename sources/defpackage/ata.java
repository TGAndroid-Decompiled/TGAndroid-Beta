package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ata extends AnimatorListenerAdapter {
    public final byte a;
    public final q38 b;
    public final wua c;

    public ata(wua wuaVar, int i, q38 q38Var) {
        this.c = wuaVar;
        this.a = i;
        this.b = q38Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        int i3;
        wua wuaVar = this.c;
        wuaVar.P1();
        gta gtaVar = wuaVar.b2;
        int i4 = 8;
        byte b = this.a;
        if (b == 0) {
            i = 0;
        } else {
            i = 8;
        }
        gtaVar.setVisibility(i);
        gta gtaVar2 = wuaVar.n2;
        if (b == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        gtaVar2.setVisibility(i2);
        gta gtaVar3 = wuaVar.w2;
        if (b == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        gtaVar3.setVisibility(i3);
        gta gtaVar4 = wuaVar.y2;
        if (b == 3) {
            i4 = 0;
        }
        gtaVar4.setVisibility(i4);
        wuaVar.C2();
        wuaVar.X2 = null;
        q38 q38Var = this.b;
        if (q38Var != null) {
            q38Var.run();
        }
    }
}
