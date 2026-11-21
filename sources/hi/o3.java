package hi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.x10;
public class o3 {
    public final View f15198a;
    public View f15199b;
    public final x10 f15200c;
    public boolean d;
    public boolean f15201e;
    public boolean f15202f;
    public boolean f15203g;
    public final Rect h = new Rect();
    public final bi.s1 f15204i;
    public final m3 f15205j;
    public int f15206k;
    public int f15207l;

    public o3(View view, boolean z10, x10 x10Var) {
        bi.s1 s1Var = new bi.s1(this, 1);
        this.f15204i = s1Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                o3.this.d();
            }
        };
        this.f15205j = r12;
        this.f15198a = view;
        this.f15200c = x10Var;
        this.f15199b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(s1Var);
        }
        view.addOnAttachStateChangeListener(new n3(this, z10, view));
    }

    public final void a() {
        if (this.f15201e) {
            if (this.f15207l >= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24141n) {
                this.f15201e = false;
            } else {
                return;
            }
        }
        x10 x10Var = this.f15200c;
        if (x10Var != null) {
            x10Var.a(Integer.valueOf(this.f15207l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f15207l <= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24141n && !this.f15201e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        if (!this.d) {
            boolean z10 = this.f15202f;
            boolean z11 = false;
            View view = this.f15198a;
            if (z10) {
                View view2 = this.f15199b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f56285a;
                r0.l1 a10 = r0.b0.a(view);
                if (a10 != null) {
                    i7 = a10.f56299a.f(8).d;
                } else {
                    i7 = 0;
                }
                this.f15207l = i7;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f15199b;
                if (view3 != null) {
                    view = view3;
                }
                this.f15207l = view.getHeight() - rect.bottom;
            }
            if (this.f15203g) {
                this.f15207l = Math.max(0, this.f15207l - org.telegram.messenger.g0.f24141n);
            }
            int i10 = this.f15206k;
            int i11 = this.f15207l;
            if (i10 != i11) {
                z11 = true;
            }
            this.f15206k = i11;
            if (z11) {
                a();
            }
        }
    }
}
