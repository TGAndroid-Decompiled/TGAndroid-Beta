package lh;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public class a4 {

    public final View f15633a;

    public View f15634b;

    public final Utilities.Callback f15635c;
    public boolean d;

    public boolean f15636e;

    public boolean f15637f;

    public boolean f15638g;
    public final Rect h = new Rect();

    public final x3 f15639i;

    public final y3 f15640j;

    public int f15641k;

    public int f15642l;

    public a4(View view, boolean z10, Utilities.Callback callback) {
        x3 x3Var = new x3(this, 0);
        this.f15639i = x3Var;
        y3 y3Var = new y3(this, 0);
        this.f15640j = y3Var;
        this.f15633a = view;
        this.f15635c = callback;
        this.f15634b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(y3Var);
            view.addOnLayoutChangeListener(x3Var);
        }
        view.addOnAttachStateChangeListener(new z3(this, z10, view));
    }

    public final void a() {
        if (this.f15636e) {
            if (this.f15642l < AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                return;
            } else {
                this.f15636e = false;
            }
        }
        Utilities.Callback callback = this.f15635c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f15642l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        return this.f15642l > AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight || this.f15636e;
    }

    public final void d() {
        if (this.d) {
            return;
        }
        boolean z10 = this.f15637f;
        View view = this.f15633a;
        if (z10) {
            View view2 = this.f15634b;
            if (view2 != null) {
                view = view2;
            }
            r0.m1 m1VarF = r0.j0.f(view);
            this.f15642l = m1VarF != null ? m1VarF.f46619a.f(8).d : 0;
        } else {
            Rect rect = this.h;
            view.getWindowVisibleDisplayFrame(rect);
            View view3 = this.f15634b;
            if (view3 != null) {
                view = view3;
            }
            this.f15642l = view.getHeight() - rect.bottom;
        }
        if (this.f15638g) {
            this.f15642l = Math.max(0, this.f15642l - AndroidUtilities.navigationBarHeight);
        }
        int i10 = this.f15641k;
        int i11 = this.f15642l;
        boolean z11 = i10 != i11;
        this.f15641k = i11;
        if (z11) {
            a();
        }
    }
}
