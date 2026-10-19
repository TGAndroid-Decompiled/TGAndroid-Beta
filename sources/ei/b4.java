package ei;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class b4 {
    public final View f8776a;
    public View f8777b;
    public final Utilities.Callback f8778c;
    public boolean d;
    public boolean e;
    public boolean f8779f;
    public boolean f8780g;
    public final Rect h = new Rect();
    public final y3 f8781i;
    public final z3 f8782j;
    public int f8783k;
    public int f8784l;

    public b4(View view, boolean z10, Utilities.Callback callback) {
        y3 y3Var = new y3(this, 0);
        this.f8781i = y3Var;
        z3 z3Var = new z3(this, 0);
        this.f8782j = z3Var;
        this.f8776a = view;
        this.f8778c = callback;
        this.f8777b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(z3Var);
            view.addOnLayoutChangeListener(y3Var);
        }
        view.addOnAttachStateChangeListener(new a4(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f8784l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f8778c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f8784l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f8784l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f8779f;
            boolean z11 = false;
            View view = this.f8776a;
            if (z10) {
                View view2 = this.f8777b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f44818a;
                r0.k1 a2 = r0.b0.a(view);
                if (a2 != null) {
                    i10 = a2.f44827a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f8784l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f8777b;
                if (view3 != null) {
                    view = view3;
                }
                this.f8784l = view.getHeight() - rect.bottom;
            }
            if (this.f8780g) {
                this.f8784l = Math.max(0, this.f8784l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f8783k;
            int i12 = this.f8784l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f8783k = i12;
            if (z11) {
                a();
            }
        }
    }
}
