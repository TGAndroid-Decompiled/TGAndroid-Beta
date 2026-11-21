package hi;

import android.view.KeyEvent;
import android.view.View;
public final class f3 implements r1.c {
    public final int f14634a = 1;
    public final Runnable f14635b;
    public final float f14636c;
    public final KeyEvent.Callback d;

    public f3(float f10, View view, Runnable runnable) {
        this.f14635b = runnable;
        this.d = view;
        this.f14636c = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7 = this.f14634a;
        float f12 = this.f14636c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.f14635b;
        switch (i7) {
            case 0:
                h3 h3Var = (h3) callback;
                g3 g3Var = h3Var.f14741m1;
                if (!z10) {
                    g3Var.setTranslationY(f12);
                    g3Var.L = false;
                    h3Var.f14742o1 = null;
                    h3Var.f14743p1 = null;
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
        this.f14636c = f10;
        this.f14635b = runnable;
    }
}
