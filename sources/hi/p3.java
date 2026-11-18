package hi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.x10;
public class p3 {
    public final View f15215a;
    public View f15216b;
    public final x10 f15217c;
    public boolean d;
    public boolean f15218e;
    public boolean f15219f;
    public boolean f15220g;
    public final Rect h = new Rect();
    public final bi.o1 f15221i;
    public final n3 f15222j;
    public int f15223k;
    public int f15224l;

    public p3(View view, boolean z10, x10 x10Var) {
        bi.o1 o1Var = new bi.o1(this, 1);
        this.f15221i = o1Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                p3.this.d();
            }
        };
        this.f15222j = r12;
        this.f15215a = view;
        this.f15217c = x10Var;
        this.f15216b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(o1Var);
        }
        view.addOnAttachStateChangeListener(new o3(this, z10, view));
    }

    public final void a() {
        if (this.f15218e) {
            if (this.f15224l >= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24113n) {
                this.f15218e = false;
            } else {
                return;
            }
        }
        x10 x10Var = this.f15217c;
        if (x10Var != null) {
            x10Var.a(Integer.valueOf(this.f15224l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f15224l <= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24113n && !this.f15218e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        if (!this.d) {
            boolean z10 = this.f15219f;
            boolean z11 = false;
            View view = this.f15215a;
            if (z10) {
                View view2 = this.f15216b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f56244a;
                r0.l1 a10 = r0.b0.a(view);
                if (a10 != null) {
                    i7 = a10.f56258a.f(8).d;
                } else {
                    i7 = 0;
                }
                this.f15224l = i7;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f15216b;
                if (view3 != null) {
                    view = view3;
                }
                this.f15224l = view.getHeight() - rect.bottom;
            }
            if (this.f15220g) {
                this.f15224l = Math.max(0, this.f15224l - org.telegram.messenger.g0.f24113n);
            }
            int i10 = this.f15223k;
            int i11 = this.f15224l;
            if (i10 != i11) {
                z11 = true;
            }
            this.f15223k = i11;
            if (z11) {
                a();
            }
        }
    }
}
