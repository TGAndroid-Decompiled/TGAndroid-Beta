package di;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public class h4 {
    public final View f6995a;
    public View f6996b;
    public final Utilities.Callback f6997c;
    public boolean d;
    public boolean e;
    public boolean f6998f;
    public boolean f6999g;
    public final Rect h = new Rect();
    public final e4 f7000i;
    public final f4 f7001j;
    public int f7002k;
    public int f7003l;

    public h4(View view, boolean z10, Utilities.Callback callback) {
        e4 e4Var = new e4(this, 0);
        this.f7000i = e4Var;
        f4 f4Var = new f4(this, 0);
        this.f7001j = f4Var;
        this.f6995a = view;
        this.f6997c = callback;
        this.f6996b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(f4Var);
            view.addOnLayoutChangeListener(e4Var);
        }
        view.addOnAttachStateChangeListener(new g4(this, z10, view));
    }

    public final void a() {
        if (this.e) {
            if (this.f7003l >= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight) {
                this.e = false;
            } else {
                return;
            }
        }
        Utilities.Callback callback = this.f6997c;
        if (callback != null) {
            callback.run(Integer.valueOf(this.f7003l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f7003l <= AndroidUtilities.dp(20.0f) + AndroidUtilities.navigationBarHeight && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i10;
        if (!this.d) {
            boolean z10 = this.f6998f;
            boolean z11 = false;
            View view = this.f6995a;
            if (z10) {
                View view2 = this.f6996b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f43485a;
                r0.l1 a2 = r0.b0.a(view);
                if (a2 != null) {
                    i10 = a2.f43497a.f(8).d;
                } else {
                    i10 = 0;
                }
                this.f7003l = i10;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f6996b;
                if (view3 != null) {
                    view = view3;
                }
                this.f7003l = view.getHeight() - rect.bottom;
            }
            if (this.f6999g) {
                this.f7003l = Math.max(0, this.f7003l - AndroidUtilities.navigationBarHeight);
            }
            int i11 = this.f7002k;
            int i12 = this.f7003l;
            if (i11 != i12) {
                z11 = true;
            }
            this.f7002k = i12;
            if (z11) {
                a();
            }
        }
    }
}
