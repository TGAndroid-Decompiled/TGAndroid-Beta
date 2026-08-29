package nh;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class w3 {
    public final View f18777a;
    public View f18778b;
    public final Utilities.Callback f18779c;
    public boolean d;
    public boolean f18780e;
    public boolean f18781f;
    public boolean f18782g;
    public final Rect h = new Rect();
    public final u3 f18783i;
    public final af.e f18784j;
    public int f18785k;
    public int f18786l;

    public w3(View view, boolean z10, Utilities.Callback callback) {
        u3 u3Var = new u3(this, 0);
        this.f18783i = u3Var;
        af.e eVar = new af.e(this, 1);
        this.f18784j = eVar;
        this.f18777a = view;
        this.f18779c = callback;
        this.f18778b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(eVar);
            view.addOnLayoutChangeListener(u3Var);
        }
        view.addOnAttachStateChangeListener(new v3(this, z10, view));
    }

    public final void a() {
        if (this.f18780e) {
            if (this.f18786l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.f18780e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f18779c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f18786l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f18786l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.f18780e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f18781f;
            boolean z11 = false;
            View view = this.f18777a;
            if (z10) {
                View view2 = this.f18778b;
                if (view2 != null) {
                    view = view2;
                }
                r0.m1 f9 = r0.j0.f(view);
                if (f9 != null) {
                    i10 = f9.f46843a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f18786l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f18778b;
                if (view3 != null) {
                    view = view3;
                }
                this.f18786l = view.getHeight() - rect.bottom;
            }
            if (this.f18782g) {
                this.f18786l = Math.max(0, this.f18786l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f18785k;
            int i12 = this.f18786l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f18785k = i12;
            if (z11) {
                a();
            }
        }
    }
}
