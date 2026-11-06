package fi;

import android.view.KeyEvent;
import android.view.View;
public final class h3 implements r1.c {
    public final int f12128a = 1;
    public final Runnable f12129b;
    public final float f12130c;
    public final KeyEvent.Callback d;

    public h3(float f10, View view, Runnable runnable) {
        this.f12129b = runnable;
        this.d = view;
        this.f12130c = f10;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        int i7 = this.f12128a;
        float f12 = this.f12130c;
        KeyEvent.Callback callback = this.d;
        Runnable runnable = this.f12129b;
        switch (i7) {
            case 0:
                j3 j3Var = (j3) callback;
                i3 i3Var = j3Var.f12221i1;
                if (!z9) {
                    i3Var.setTranslationY(f12);
                    i3Var.K = false;
                    j3Var.f12223k1 = null;
                    j3Var.l1 = null;
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

    public h3(j3 j3Var, float f10, Runnable runnable) {
        this.d = j3Var;
        this.f12130c = f10;
        this.f12129b = runnable;
    }
}
