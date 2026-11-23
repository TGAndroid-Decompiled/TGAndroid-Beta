package hi;

import android.view.KeyEvent;
import android.view.View;
public final class f3 implements r1.c {
    public final int f14637a = 1;
    public final Runnable f14638b;
    public final float f14639c;
    public final KeyEvent.Callback d;

    public f3(float f10, View view, Runnable runnable) {
        this.f14638b = runnable;
        this.d = view;
        this.f14639c = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7 = this.f14637a;
        float f12 = this.f14639c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.f14638b;
        switch (i7) {
            case 0:
                h3 h3Var = (h3) callback;
                g3 g3Var = h3Var.f14744m1;
                if (!z10) {
                    g3Var.setTranslationY(f12);
                    g3Var.L = false;
                    h3Var.f14745o1 = null;
                    h3Var.f14746p1 = null;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                View view = (View) callback;
                if (runnable != null) {
                    runnable.run();
                }
                view.setTranslationX(f12);
                view.setTag(2131296665, null);
                view.setTag(2131296666, null);
                return;
        }
    }

    public f3(h3 h3Var, float f10, Runnable runnable) {
        this.d = h3Var;
        this.f14639c = f10;
        this.f14638b = runnable;
    }
}
