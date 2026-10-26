package fi;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class z3 {
    public final View f12057a;
    public View f12058b;
    public final Utilities.Callback f12059c;
    public boolean d;
    public boolean e;
    public boolean f12060f;
    public boolean f12061g;
    public final Rect h = new Rect();
    public final w3 f12062i;
    public final x3 f12063j;
    public int f12064k;
    public int f12065l;

    public z3(View view, boolean z10, Utilities.Callback callback) {
        w3 w3Var = new w3(this, 0);
        this.f12062i = w3Var;
        x3 x3Var = new x3(this, 0);
        this.f12063j = x3Var;
        this.f12057a = view;
        this.f12059c = callback;
        this.f12058b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(x3Var);
            view.addOnLayoutChangeListener(w3Var);
        }
        view.addOnAttachStateChangeListener(new y3(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f12065l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f12059c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f12065l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f12065l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f12060f;
            boolean z11 = false;
            View view = this.f12057a;
            if (z10) {
                View view2 = this.f12058b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f47108a;
                r0.k1 a2 = r0.b0.a(view);
                if (a2 != null) {
                    i10 = a2.f47118a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f12065l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f12058b;
                if (view3 != null) {
                    view = view3;
                }
                this.f12065l = view.getHeight() - rect.bottom;
            }
            if (this.f12061g) {
                this.f12065l = Math.max(0, this.f12065l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f12064k;
            int i12 = this.f12065l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f12064k = i12;
            if (z11) {
                a();
            }
        }
    }
}
