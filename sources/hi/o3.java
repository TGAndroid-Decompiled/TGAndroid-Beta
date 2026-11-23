package hi;

import android.view.KeyEvent;
import android.view.View;
public final class o3 implements r1.c {
    public final int f15151a = 1;
    public final Runnable f15152b;
    public final float f15153c;
    public final KeyEvent.Callback d;

    public o3(float f10, View view, Runnable runnable) {
        this.f15152b = runnable;
        this.d = view;
        this.f15153c = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        int i7 = this.f15151a;
        float f12 = this.f15153c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.f15152b;
        switch (i7) {
            case 0:
                q3 q3Var = (q3) callback;
                p3 p3Var = q3Var.f15215m1;
                if (!z10) {
                    p3Var.setTranslationY(f12);
                    p3Var.L = false;
                    q3Var.f15216o1 = null;
                    q3Var.f15217p1 = null;
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

    public o3(q3 q3Var, float f10, Runnable runnable) {
        this.d = q3Var;
        this.f15153c = f10;
        this.f15152b = runnable;
    }
}
