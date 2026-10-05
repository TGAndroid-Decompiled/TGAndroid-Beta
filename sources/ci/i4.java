package ci;

import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class i4 {
    public final View f5159a;
    public View f5160b;
    public final Utilities.Callback f5161c;
    public boolean d;
    public boolean f5162e;
    public boolean f5163f;
    public boolean f5164g;
    public final Rect h = new Rect();
    public final f4 f5165i;
    public final g4 f5166j;
    public int f5167k;
    public int f5168l;

    public i4(View view, boolean z10, Utilities.Callback callback) {
        f4 f4Var = new f4(this, 0);
        this.f5165i = f4Var;
        g4 g4Var = new g4(this, 0);
        this.f5166j = g4Var;
        this.f5159a = view;
        this.f5161c = callback;
        this.f5160b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(g4Var);
            view.addOnLayoutChangeListener(f4Var);
        }
        view.addOnAttachStateChangeListener(new h4(this, z10, view));
    }

    public final void a() {
        if (this.f5162e) {
            if (this.f5168l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.f5162e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f5161c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f5168l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f5168l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.f5162e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f5163f;
            boolean z11 = false;
            View view = this.f5159a;
            if (z10) {
                View view2 = this.f5160b;
                if (view2 != null) {
                    view = view2;
                }
                r0.l1 f7 = r0.i0.f(view);
                if (f7 != null) {
                    i10 = f7.f45624a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f5168l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f5160b;
                if (view3 != null) {
                    view = view3;
                }
                this.f5168l = view.getHeight() - rect.bottom;
            }
            if (this.f5164g) {
                this.f5168l = Math.max(0, this.f5168l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f5167k;
            int i12 = this.f5168l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f5167k = i12;
            if (z11) {
                a();
            }
        }
    }
}
