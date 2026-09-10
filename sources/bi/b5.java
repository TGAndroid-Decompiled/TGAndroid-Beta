package bi;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class b5 {
    public final View f2357a;
    public View f2358b;
    public final Utilities.Callback f2359c;
    public boolean d;
    public boolean e;
    public boolean f2360f;
    public boolean f2361g;
    public final Rect h = new Rect();
    public final y4 f2362i;
    public final z4 f2363j;
    public int f2364k;
    public int f2365l;

    public b5(View view, boolean z10, Utilities.Callback callback) {
        y4 y4Var = new y4(this, 0);
        this.f2362i = y4Var;
        z4 z4Var = new z4(this, 0);
        this.f2363j = z4Var;
        this.f2357a = view;
        this.f2359c = callback;
        this.f2358b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(z4Var);
            view.addOnLayoutChangeListener(y4Var);
        }
        view.addOnAttachStateChangeListener(new a5(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f2365l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f2359c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f2365l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f2365l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f2360f;
            boolean z11 = false;
            View view = this.f2357a;
            if (z10) {
                View view2 = this.f2358b;
                if (view2 != null) {
                    view = view2;
                }
                r0.l1 f7 = r0.i0.f(view);
                if (f7 != null) {
                    i10 = f7.f41074a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f2365l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f2358b;
                if (view3 != null) {
                    view = view3;
                }
                this.f2365l = view.getHeight() - rect.bottom;
            }
            if (this.f2361g) {
                this.f2365l = Math.max(0, this.f2365l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f2364k;
            int i12 = this.f2365l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f2364k = i12;
            if (z11) {
                a();
            }
        }
    }
}
