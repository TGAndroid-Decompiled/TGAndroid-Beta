package hi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.z10;
public class p3 {
    public final View f14842a;
    public View f14843b;
    public final z10 f14844c;
    public boolean d;
    public boolean f14845e;
    public boolean f14846f;
    public boolean f14847g;
    public final Rect h = new Rect();
    public final m3 f14848i;
    public final n3 f14849j;
    public int f14850k;
    public int f14851l;

    public p3(View view, boolean z10, z10 z10Var) {
        m3 m3Var = new m3(this, 0);
        this.f14848i = m3Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                p3.this.d();
            }
        };
        this.f14849j = r12;
        this.f14842a = view;
        this.f14844c = z10Var;
        this.f14843b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(m3Var);
        }
        view.addOnAttachStateChangeListener(new o3(this, z10, view));
    }

    public final void a() {
        if (this.f14845e) {
            if (this.f14851l >= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f23604n) {
                this.f14845e = false;
            } else {
                return;
            }
        }
        z10 z10Var = this.f14844c;
        if (z10Var != null) {
            z10Var.a(Integer.valueOf(this.f14851l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f14851l <= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f23604n && !this.f14845e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        if (!this.d) {
            boolean z10 = this.f14846f;
            boolean z11 = false;
            View view = this.f14842a;
            if (z10) {
                View view2 = this.f14843b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f55671a;
                r0.k1 a10 = r0.b0.a(view);
                if (a10 != null) {
                    i7 = a10.f55682a.f(8).d;
                } else {
                    i7 = 0;
                }
                this.f14851l = i7;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f14843b;
                if (view3 != null) {
                    view = view3;
                }
                this.f14851l = view.getHeight() - rect.bottom;
            }
            if (this.f14847g) {
                this.f14851l = Math.max(0, this.f14851l - org.telegram.messenger.g0.f23604n);
            }
            int i10 = this.f14850k;
            int i11 = this.f14851l;
            if (i10 != i11) {
                z11 = true;
            }
            this.f14850k = i11;
            if (z11) {
                a();
            }
        }
    }
}
