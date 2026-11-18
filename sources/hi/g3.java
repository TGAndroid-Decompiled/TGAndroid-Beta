package hi;

import android.view.KeyEvent;
import android.view.View;
public final class g3 implements r1.c {
    public final int f14685a = 1;
    public final Runnable f14686b;
    public final float f14687c;
    public final KeyEvent.Callback d;

    public g3(float f10, View view, Runnable runnable) {
        this.f14686b = runnable;
        this.d = view;
        this.f14687c = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7 = this.f14685a;
        float f12 = this.f14687c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.f14686b;
        switch (i7) {
            case 0:
                i3 i3Var = (i3) callback;
                h3 h3Var = i3Var.f14757m1;
                if (!z10) {
                    h3Var.setTranslationY(f12);
                    h3Var.L = false;
                    i3Var.f14758o1 = null;
                    i3Var.f14759p1 = null;
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

    public g3(i3 i3Var, float f10, Runnable runnable) {
        this.d = i3Var;
        this.f14687c = f10;
        this.f14686b = runnable;
    }
}
