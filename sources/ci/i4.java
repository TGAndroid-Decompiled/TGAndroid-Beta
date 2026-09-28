package ci;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class i4 {
    public final View f4774a;
    public View f4775b;
    public final Utilities.Callback f4776c;
    public boolean d;
    public boolean e;
    public boolean f4777f;
    public boolean f4778g;
    public final Rect h = new Rect();
    public final f4 f4779i;
    public final g4 f4780j;
    public int f4781k;
    public int f4782l;

    public i4(View view, boolean z10, Utilities.Callback callback) {
        f4 f4Var = new f4(this, 0);
        this.f4779i = f4Var;
        g4 g4Var = new g4(this, 0);
        this.f4780j = g4Var;
        this.f4774a = view;
        this.f4776c = callback;
        this.f4775b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(g4Var);
            view.addOnLayoutChangeListener(f4Var);
        }
        view.addOnAttachStateChangeListener(new h4(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f4782l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f4776c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f4782l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f4782l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f4777f;
            boolean z11 = false;
            View view = this.f4774a;
            if (z10) {
                View view2 = this.f4775b;
                if (view2 != null) {
                    view = view2;
                }
                r0.l1 f7 = r0.i0.f(view);
                if (f7 != null) {
                    i10 = f7.f42140a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f4782l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f4775b;
                if (view3 != null) {
                    view = view3;
                }
                this.f4782l = view.getHeight() - rect.bottom;
            }
            if (this.f4778g) {
                this.f4782l = Math.max(0, this.f4782l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f4781k;
            int i12 = this.f4782l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f4781k = i12;
            if (z11) {
                a();
            }
        }
    }
}
