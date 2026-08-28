package kh;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class b4 {
    public final View f14990a;
    public View f14991b;
    public final Utilities.Callback f14992c;
    public boolean d;
    public boolean f14993e;
    public boolean f14994f;
    public boolean f14995g;
    public final Rect h = new Rect();
    public final y3 f14996i;
    public final z3 f14997j;
    public int f14998k;
    public int f14999l;

    public b4(View view, boolean z10, Utilities.Callback callback) {
        y3 y3Var = new y3(this, 0);
        this.f14996i = y3Var;
        z3 z3Var = new z3(this, 0);
        this.f14997j = z3Var;
        this.f14990a = view;
        this.f14992c = callback;
        this.f14991b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(z3Var);
            view.addOnLayoutChangeListener(y3Var);
        }
        view.addOnAttachStateChangeListener(new a4(this, z10, view));
    }

    public final void a() {
        if (this.f14993e) {
            if (this.f14999l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.f14993e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f14992c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f14999l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f14999l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.f14993e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i9;
        if (!this.d) {
            boolean z10 = this.f14994f;
            boolean z11 = false;
            View view = this.f14990a;
            if (z10) {
                View view2 = this.f14991b;
                if (view2 != null) {
                    view = view2;
                }
                r0.m1 f10 = r0.j0.f(view);
                if (f10 != null) {
                    i9 = f10.f46929a.f(8).d;
                } else {
                    i9 = 0;
                }
                this.f14999l = i9;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f14991b;
                if (view3 != null) {
                    view = view3;
                }
                this.f14999l = view.getHeight() - rect.bottom;
            }
            if (this.f14995g) {
                this.f14999l = Math.max(0, this.f14999l - AndroidUtilities.navigationBarHeight);
            }
            int i10 = this.f14998k;
            int i11 = this.f14999l;
            if (i10 != i11) {
                z11 = true;
            }
            this.f14998k = i11;
            if (z11) {
                a();
            }
        }
    }
}
