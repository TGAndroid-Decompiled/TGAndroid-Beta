package gi;

import android.view.KeyEvent;
import android.view.View;
public final class f3 implements q1.c {
    public final int f12693a = 1;
    public final Runnable f12694b;
    public final float f12695c;
    public final KeyEvent.Callback d;

    public f3(float f10, View view, Runnable runnable) {
        this.f12694b = runnable;
        this.d = view;
        this.f12695c = f10;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        int i3 = this.f12693a;
        float f12 = this.f12695c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.f12694b;
        switch (i3) {
            case 0:
                h3 h3Var = (h3) callback;
                g3 g3Var = h3Var.f12871j1;
                if (!z10) {
                    g3Var.setTranslationY(f12);
                    g3Var.L = false;
                    h3Var.f12872l1 = null;
                    h3Var.m1 = null;
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
                view.setTag(2131296663, null);
                view.setTag(2131296664, null);
                return;
        }
    }

    public f3(h3 h3Var, float f10, Runnable runnable) {
        this.d = h3Var;
        this.f12695c = f10;
        this.f12694b = runnable;
    }
}
