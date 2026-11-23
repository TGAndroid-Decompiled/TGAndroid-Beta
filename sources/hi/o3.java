package hi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.y10;
public class o3 {
    public final View f15201a;
    public View f15202b;
    public final y10 f15203c;
    public boolean d;
    public boolean f15204e;
    public boolean f15205f;
    public boolean f15206g;
    public final Rect h = new Rect();
    public final bi.s1 f15207i;
    public final m3 f15208j;
    public int f15209k;
    public int f15210l;

    public o3(View view, boolean z10, y10 y10Var) {
        bi.s1 s1Var = new bi.s1(this, 1);
        this.f15207i = s1Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                o3.this.d();
            }
        };
        this.f15208j = r12;
        this.f15201a = view;
        this.f15203c = y10Var;
        this.f15202b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(s1Var);
        }
        view.addOnAttachStateChangeListener(new n3(this, z10, view));
    }

    public final void a() {
        if (this.f15204e) {
            if (this.f15210l >= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24041n) {
                this.f15204e = false;
            } else {
                return;
            }
        }
        y10 y10Var = this.f15203c;
        if (y10Var != null) {
            y10Var.a(Integer.valueOf(this.f15210l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f15210l <= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24041n && !this.f15204e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        if (!this.d) {
            boolean z10 = this.f15205f;
            boolean z11 = false;
            View view = this.f15201a;
            if (z10) {
                View view2 = this.f15202b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f56289a;
                r0.l1 a10 = r0.b0.a(view);
                if (a10 != null) {
                    i7 = a10.f56303a.f(8).d;
                } else {
                    i7 = 0;
                }
                this.f15210l = i7;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f15202b;
                if (view3 != null) {
                    view = view3;
                }
                this.f15210l = view.getHeight() - rect.bottom;
            }
            if (this.f15206g) {
                this.f15210l = Math.max(0, this.f15210l - org.telegram.messenger.g0.f24041n);
            }
            int i10 = this.f15209k;
            int i11 = this.f15210l;
            if (i10 != i11) {
                z11 = true;
            }
            this.f15209k = i11;
            if (z11) {
                a();
            }
        }
    }
}
