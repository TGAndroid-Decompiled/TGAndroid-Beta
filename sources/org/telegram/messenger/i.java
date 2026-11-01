package org.telegram.messenger;

import android.view.KeyEvent;
import android.view.View;
public final class i implements o1.f {
    public final int f16142a = 0;
    public final float f16143b;
    public final Runnable f16144c;
    public final KeyEvent.Callback d;

    public i(float f7, View view, Runnable runnable) {
        this.f16144c = runnable;
        this.d = view;
        this.f16143b = f7;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        int i10 = this.f16142a;
        Runnable runnable = this.f16144c;
        float f11 = this.f16143b;
        KeyEvent.Callback callback = this.d;
        switch (i10) {
            case 0:
                View view = (View) callback;
                if (runnable != null) {
                    runnable.run();
                }
                view.setTranslationX(f11);
                view.setTag(2131296663, null);
                view.setTag(2131296664, null);
                return;
            default:
                vh.n2 n2Var = (vh.n2) callback;
                vh.m2 m2Var = n2Var.f51516i1;
                if (!z10) {
                    m2Var.setTranslationY(f11);
                    m2Var.K = false;
                    n2Var.f51518k1 = null;
                    n2Var.l1 = null;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i(vh.n2 n2Var, float f7, Runnable runnable) {
        this.d = n2Var;
        this.f16143b = f7;
        this.f16144c = runnable;
    }
}
