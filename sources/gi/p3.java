package gi;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
import org.telegram.messenger.u10;
public class p3 {
    public final View f13358a;
    public View f13359b;
    public final u10 f13360c;
    public boolean d;
    public boolean f13361e;
    public boolean f13362f;
    public boolean f13363g;
    public final Rect h = new Rect();
    public final m3 f13364i;
    public final n3 f13365j;
    public int f13366k;
    public int f13367l;

    public p3(View view, boolean z10, u10 u10Var) {
        m3 m3Var = new m3(this, 0);
        this.f13364i = m3Var;
        n3 n3Var = new n3(this, 0);
        this.f13365j = n3Var;
        this.f13358a = view;
        this.f13360c = u10Var;
        this.f13359b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(n3Var);
            view.addOnLayoutChangeListener(m3Var);
        }
        view.addOnAttachStateChangeListener(new o3(this, z10, view));
    }

    public final void a() {
        if (this.f13361e) {
            if (this.f13367l >= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f22603n) {
                this.f13361e = false;
            } else {
                return;
            }
        }
        u10 u10Var = this.f13360c;
        if (u10Var != null) {
            u10Var.a(Integer.valueOf(this.f13367l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f13367l <= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f22603n && !this.f13361e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i3;
        if (!this.d) {
            boolean z10 = this.f13362f;
            boolean z11 = false;
            View view = this.f13358a;
            if (z10) {
                View view2 = this.f13359b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f54015a;
                r0.k1 a10 = r0.b0.a(view);
                if (a10 != null) {
                    i3 = a10.f54026a.f(8).d;
                } else {
                    i3 = 0;
                }
                this.f13367l = i3;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f13359b;
                if (view3 != null) {
                    view = view3;
                }
                this.f13367l = view.getHeight() - rect.bottom;
            }
            if (this.f13363g) {
                this.f13367l = Math.max(0, this.f13367l - org.telegram.messenger.g0.f22603n);
            }
            int i10 = this.f13366k;
            int i11 = this.f13367l;
            if (i10 != i11) {
                z11 = true;
            }
            this.f13366k = i11;
            if (z11) {
                a();
            }
        }
    }
}
