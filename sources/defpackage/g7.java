package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
public final class g7 extends AnimatorListenerAdapter {
    public final byte a;
    public final ArrayList b;
    public final r7 c;

    public g7(r7 r7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = r7Var;
        this.b = arrayList;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = 0;
        r7 r7Var = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                r7Var.G.setAlpha(0.0f);
                while (i < arrayList.size()) {
                    ((View) arrayList.get(i)).setAlpha(1.0f);
                    i++;
                }
                r7Var.G.setVisibility(8);
                return;
            default:
                r7Var.G.setAlpha(1.0f);
                while (i < arrayList.size()) {
                    ((View) arrayList.get(i)).setAlpha(0.0f);
                    i++;
                }
                return;
        }
    }
}
