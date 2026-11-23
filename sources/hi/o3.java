package hi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.y10;
public class o3 {
    public final View f15105a;
    public View f15106b;
    public final y10 f15107c;
    public boolean d;
    public boolean f15108e;
    public boolean f15109f;
    public boolean f15110g;
    public final Rect h = new Rect();
    public final bi.t1 f15111i;
    public final m3 f15112j;
    public int f15113k;
    public int f15114l;

    public o3(View view, boolean z10, y10 y10Var) {
        bi.t1 t1Var = new bi.t1(this, 1);
        this.f15111i = t1Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                o3.this.d();
            }
        };
        this.f15112j = r12;
        this.f15105a = view;
        this.f15107c = y10Var;
        this.f15106b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(t1Var);
        }
        view.addOnAttachStateChangeListener(new n3(this, z10, view));
    }

    public final void a() {
        if (this.f15108e) {
            if (this.f15114l >= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24005n) {
                this.f15108e = false;
            } else {
                return;
            }
        }
        y10 y10Var = this.f15107c;
        if (y10Var != null) {
            y10Var.a(Integer.valueOf(this.f15114l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f15114l <= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24005n && !this.f15108e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        if (!this.d) {
            boolean z10 = this.f15109f;
            boolean z11 = false;
            View view = this.f15105a;
            if (z10) {
                View view2 = this.f15106b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f56254a;
                r0.l1 a10 = r0.b0.a(view);
                if (a10 != null) {
                    i7 = a10.f56268a.f(8).d;
                } else {
                    i7 = 0;
                }
                this.f15114l = i7;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f15106b;
                if (view3 != null) {
                    view = view3;
                }
                this.f15114l = view.getHeight() - rect.bottom;
            }
            if (this.f15110g) {
                this.f15114l = Math.max(0, this.f15114l - org.telegram.messenger.g0.f24005n);
            }
            int i10 = this.f15113k;
            int i11 = this.f15114l;
            if (i10 != i11) {
                z11 = true;
            }
            this.f15113k = i11;
            if (z11) {
                a();
            }
        }
    }
}
