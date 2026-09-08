package di;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class j4 {
    public final View f7454a;
    public View f7455b;
    public final Utilities.Callback f7456c;
    public boolean d;
    public boolean f7457e;
    public boolean f7458f;
    public boolean f7459g;
    public final Rect h = new Rect();
    public final g4 f7460i;
    public final h4 f7461j;
    public int f7462k;
    public int f7463l;

    public j4(View view, boolean z10, Utilities.Callback callback) {
        g4 g4Var = new g4(this, 0);
        this.f7460i = g4Var;
        h4 h4Var = new h4(this, 0);
        this.f7461j = h4Var;
        this.f7454a = view;
        this.f7456c = callback;
        this.f7455b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(h4Var);
            view.addOnLayoutChangeListener(g4Var);
        }
        view.addOnAttachStateChangeListener(new i4(this, z10, view));
    }

    public final void a() {
        if (this.f7457e) {
            if (this.f7463l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.f7457e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f7456c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f7463l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f7463l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.f7457e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f7458f;
            boolean z11 = false;
            View view = this.f7454a;
            if (z10) {
                View view2 = this.f7455b;
                if (view2 != null) {
                    view = view2;
                }
                r0.l1 f7 = r0.i0.f(view);
                if (f7 != null) {
                    i10 = f7.f44739a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f7463l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f7455b;
                if (view3 != null) {
                    view = view3;
                }
                this.f7463l = view.getHeight() - rect.bottom;
            }
            if (this.f7459g) {
                this.f7463l = Math.max(0, this.f7463l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f7462k;
            int i12 = this.f7463l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f7462k = i12;
            if (z11) {
                a();
            }
        }
    }
}
