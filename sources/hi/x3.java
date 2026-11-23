package hi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.w10;
public class x3 {
    public final View f15708a;
    public View f15709b;
    public final w10 f15710c;
    public boolean d;
    public boolean f15711e;
    public boolean f15712f;
    public boolean f15713g;
    public final Rect h = new Rect();
    public final bi.t1 f15714i;
    public final v3 f15715j;
    public int f15716k;
    public int f15717l;

    public x3(View view, boolean z10, w10 w10Var) {
        bi.t1 t1Var = new bi.t1(this, 1);
        this.f15714i = t1Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                x3.this.d();
            }
        };
        this.f15715j = r12;
        this.f15708a = view;
        this.f15710c = w10Var;
        this.f15709b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(t1Var);
        }
        view.addOnAttachStateChangeListener(new w3(this, z10, view));
    }

    public final void a() {
        if (this.f15711e) {
            if (this.f15717l >= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24221n) {
                this.f15711e = false;
            } else {
                return;
            }
        }
        w10 w10Var = this.f15710c;
        if (w10Var != null) {
            w10Var.a(Integer.valueOf(this.f15717l));
        }
    }

    public void b(boolean z10) {
        this.d = z10;
        d();
    }

    public final boolean c() {
        if (this.f15717l <= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f24221n && !this.f15711e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        if (!this.d) {
            boolean z10 = this.f15712f;
            boolean z11 = false;
            View view = this.f15708a;
            if (z10) {
                View view2 = this.f15709b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f56367a;
                r0.l1 a10 = r0.b0.a(view);
                if (a10 != null) {
                    i7 = a10.f56381a.f(8).d;
                } else {
                    i7 = 0;
                }
                this.f15717l = i7;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f15709b;
                if (view3 != null) {
                    view = view3;
                }
                this.f15717l = view.getHeight() - rect.bottom;
            }
            if (this.f15713g) {
                this.f15717l = Math.max(0, this.f15717l - org.telegram.messenger.g0.f24221n);
            }
            int i10 = this.f15716k;
            int i11 = this.f15717l;
            if (i10 != i11) {
                z11 = true;
            }
            this.f15716k = i11;
            if (z11) {
                a();
            }
        }
    }
}
