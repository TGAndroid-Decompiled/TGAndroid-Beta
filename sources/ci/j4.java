package ci;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class j4 {
    public final View f4840a;
    public View f4841b;
    public final Utilities.Callback f4842c;
    public boolean d;
    public boolean e;
    public boolean f4843f;
    public boolean f4844g;
    public final Rect h = new Rect();
    public final g4 f4845i;
    public final h4 f4846j;
    public int f4847k;
    public int f4848l;

    public j4(View view, boolean z10, Utilities.Callback callback) {
        g4 g4Var = new g4(this, 0);
        this.f4845i = g4Var;
        h4 h4Var = new h4(this, 0);
        this.f4846j = h4Var;
        this.f4840a = view;
        this.f4842c = callback;
        this.f4841b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(h4Var);
            view.addOnLayoutChangeListener(g4Var);
        }
        view.addOnAttachStateChangeListener(new i4(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f4848l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f4842c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f4848l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f4848l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f4843f;
            boolean z11 = false;
            View view = this.f4840a;
            if (z10) {
                View view2 = this.f4841b;
                if (view2 != null) {
                    view = view2;
                }
                r0.m1 f7 = r0.i0.f(view);
                if (f7 != null) {
                    i10 = f7.f42109a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f4848l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f4841b;
                if (view3 != null) {
                    view = view3;
                }
                this.f4848l = view.getHeight() - rect.bottom;
            }
            if (this.f4844g) {
                this.f4848l = Math.max(0, this.f4848l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f4847k;
            int i12 = this.f4848l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f4847k = i12;
            if (z11) {
                a();
            }
        }
    }
}
