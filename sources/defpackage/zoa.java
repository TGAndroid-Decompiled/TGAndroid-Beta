package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zoa extends AnimatorListenerAdapter {
    public final byte a;
    public final k08 b;
    public final vqa c;

    public zoa(vqa vqaVar, int i, k08 k08Var) {
        this.c = vqaVar;
        this.a = i;
        this.b = k08Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        int i2;
        int i3;
        vqa vqaVar = this.c;
        vqaVar.O1();
        gpa gpaVar = vqaVar.b2;
        int i4 = 8;
        byte b = this.a;
        if (b == 0) {
            i = 0;
        } else {
            i = 8;
        }
        gpaVar.setVisibility(i);
        gpa gpaVar2 = vqaVar.n2;
        if (b == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        gpaVar2.setVisibility(i2);
        gpa gpaVar3 = vqaVar.w2;
        if (b == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        gpaVar3.setVisibility(i3);
        gpa gpaVar4 = vqaVar.y2;
        if (b == 3) {
            i4 = 0;
        }
        gpaVar4.setVisibility(i4);
        vqaVar.B2();
        vqaVar.X2 = null;
        k08 k08Var = this.b;
        if (k08Var != null) {
            k08Var.run();
        }
    }
}
