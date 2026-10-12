package ci;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class h4 {
    public final View f5156a;
    public View f5157b;
    public final Utilities.Callback f5158c;
    public boolean d;
    public boolean f5159e;
    public boolean f5160f;
    public boolean f5161g;
    public final Rect h = new Rect();
    public final e4 f5162i;
    public final f4 f5163j;
    public int f5164k;
    public int f5165l;

    public h4(View view, boolean z10, Utilities.Callback callback) {
        e4 e4Var = new e4(this, 0);
        this.f5162i = e4Var;
        f4 f4Var = new f4(this, 0);
        this.f5163j = f4Var;
        this.f5156a = view;
        this.f5158c = callback;
        this.f5157b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(f4Var);
            view.addOnLayoutChangeListener(e4Var);
        }
        view.addOnAttachStateChangeListener(new g4(this, z10, view));
    }

    public final void a() {
        if (this.f5159e) {
            if (this.f5165l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.f5159e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f5158c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f5165l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f5165l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.f5159e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f5160f;
            boolean z11 = false;
            View view = this.f5156a;
            if (z10) {
                View view2 = this.f5157b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f46989a;
                r0.k1 a2 = r0.b0.a(view);
                if (a2 != null) {
                    i10 = a2.f47000a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f5165l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f5157b;
                if (view3 != null) {
                    view = view3;
                }
                this.f5165l = view.getHeight() - rect.bottom;
            }
            if (this.f5161g) {
                this.f5165l = Math.max(0, this.f5165l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f5164k;
            int i12 = this.f5165l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f5164k = i12;
            if (z11) {
                a();
            }
        }
    }
}
