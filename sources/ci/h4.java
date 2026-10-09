package ci;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class h4 {
    public final View f5158a;
    public View f5159b;
    public final Utilities.Callback f5160c;
    public boolean d;
    public boolean f5161e;
    public boolean f5162f;
    public boolean f5163g;
    public final Rect h = new Rect();
    public final e4 f5164i;
    public final f4 f5165j;
    public int f5166k;
    public int f5167l;

    public h4(View view, boolean z10, Utilities.Callback callback) {
        e4 e4Var = new e4(this, 0);
        this.f5164i = e4Var;
        f4 f4Var = new f4(this, 0);
        this.f5165j = f4Var;
        this.f5158a = view;
        this.f5160c = callback;
        this.f5159b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(f4Var);
            view.addOnLayoutChangeListener(e4Var);
        }
        view.addOnAttachStateChangeListener(new g4(this, z10, view));
    }

    public final void a() {
        if (this.f5161e) {
            if (this.f5167l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.f5161e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f5160c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f5167l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f5167l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.f5161e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f5162f;
            boolean z11 = false;
            View view = this.f5158a;
            if (z10) {
                View view2 = this.f5159b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f46764a;
                r0.k1 a2 = r0.b0.a(view);
                if (a2 != null) {
                    i10 = a2.f46775a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f5167l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f5159b;
                if (view3 != null) {
                    view = view3;
                }
                this.f5167l = view.getHeight() - rect.bottom;
            }
            if (this.f5163g) {
                this.f5167l = Math.max(0, this.f5167l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f5166k;
            int i12 = this.f5167l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f5166k = i12;
            if (z11) {
                a();
            }
        }
    }
}
