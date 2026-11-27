package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
public final class ztc extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public ztc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i;
        byte b = this.a;
        int i2 = 4;
        Object obj = this.b;
        switch (b) {
            case 0:
                duc ducVar = (duc) obj;
                ducVar.n = null;
                yrc yrcVar = ducVar.d;
                if (ducVar.x) {
                    i = 4;
                } else {
                    i = 0;
                }
                yrcVar.setVisibility(i);
                TextView textView = ducVar.f;
                if (ducVar.y) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                return;
            case 1:
                ((hyc) obj).f0 = null;
                return;
            case 2:
                ((jzc) ((tu) obj).b).c.setVisibility(4);
                return;
            default:
                ((r3d) obj).L = null;
                return;
        }
    }
}
