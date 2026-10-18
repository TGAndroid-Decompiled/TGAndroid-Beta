package ei;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class b4 {
    public final View f8777a;
    public View f8778b;
    public final Utilities.Callback f8779c;
    public boolean d;
    public boolean e;
    public boolean f8780f;
    public boolean f8781g;
    public final Rect h = new Rect();
    public final y3 f8782i;
    public final z3 f8783j;
    public int f8784k;
    public int f8785l;

    public b4(View view, boolean z10, Utilities.Callback callback) {
        y3 y3Var = new y3(this, 0);
        this.f8782i = y3Var;
        z3 z3Var = new z3(this, 0);
        this.f8783j = z3Var;
        this.f8777a = view;
        this.f8779c = callback;
        this.f8778b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(z3Var);
            view.addOnLayoutChangeListener(y3Var);
        }
        view.addOnAttachStateChangeListener(new a4(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f8785l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f8779c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f8785l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f8785l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f8780f;
            boolean z11 = false;
            View view = this.f8777a;
            if (z10) {
                View view2 = this.f8778b;
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
                this.f8785l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f8778b;
                if (view3 != null) {
                    view = view3;
                }
                this.f8785l = view.getHeight() - rect.bottom;
            }
            if (this.f8781g) {
                this.f8785l = Math.max(0, this.f8785l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f8784k;
            int i12 = this.f8785l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f8784k = i12;
            if (z11) {
                a();
            }
        }
    }
}
