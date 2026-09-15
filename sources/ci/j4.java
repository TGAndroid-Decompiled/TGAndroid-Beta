package ci;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class j4 {
    public final View f4835a;
    public View f4836b;
    public final Utilities.Callback f4837c;
    public boolean d;
    public boolean e;
    public boolean f4838f;
    public boolean f4839g;
    public final Rect h = new Rect();
    public final g4 f4840i;
    public final h4 f4841j;
    public int f4842k;
    public int f4843l;

    public j4(View view, boolean z10, Utilities.Callback callback) {
        g4 g4Var = new g4(this, 0);
        this.f4840i = g4Var;
        h4 h4Var = new h4(this, 0);
        this.f4841j = h4Var;
        this.f4835a = view;
        this.f4837c = callback;
        this.f4836b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(h4Var);
            view.addOnLayoutChangeListener(g4Var);
        }
        view.addOnAttachStateChangeListener(new i4(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f4843l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f4837c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f4843l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f4843l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f4838f;
            boolean z11 = false;
            View view = this.f4835a;
            if (z10) {
                View view2 = this.f4836b;
                if (view2 != null) {
                    view = view2;
                }
                r0.l1 f7 = r0.i0.f(view);
                if (f7 != null) {
                    i10 = f7.f41855a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f4843l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f4836b;
                if (view3 != null) {
                    view = view3;
                }
                this.f4843l = view.getHeight() - rect.bottom;
            }
            if (this.f4839g) {
                this.f4843l = Math.max(0, this.f4843l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f4842k;
            int i12 = this.f4843l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f4842k = i12;
            if (z11) {
                a();
            }
        }
    }
}
