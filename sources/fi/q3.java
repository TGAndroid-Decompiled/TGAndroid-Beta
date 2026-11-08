package fi;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;
import org.telegram.messenger.c20;
public class q3 {
    public final View f12649a;
    public View f12650b;
    public final c20 f12651c;
    public boolean d;
    public boolean f12652e;
    public boolean f12653f;
    public boolean f12654g;
    public final Rect h = new Rect();
    public final n3 f12655i;
    public final o3 f12656j;
    public int f12657k;
    public int f12658l;

    public q3(View view, boolean z9, c20 c20Var) {
        n3 n3Var = new n3(this, 0);
        this.f12655i = n3Var;
        ?? r12 = new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public final void onGlobalLayout() {
                q3.this.d();
            }
        };
        this.f12656j = r12;
        this.f12649a = view;
        this.f12651c = c20Var;
        this.f12650b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(r12);
            view.addOnLayoutChangeListener(n3Var);
        }
        view.addOnAttachStateChangeListener(new p3(this, z9, view));
    }

    public final void a() {
        if (this.f12652e) {
            if (this.f12658l >= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f22558n) {
                this.f12652e = false;
            } else {
                return;
            }
        }
        c20 c20Var = this.f12651c;
        if (c20Var != null) {
            c20Var.a(Integer.valueOf(this.f12658l));
        }
    }

    public void b(boolean z9) {
        this.d = z9;
        d();
    }

    public final boolean c() {
        if (this.f12658l <= org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.f22558n && !this.f12652e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i7;
        if (!this.d) {
            boolean z9 = this.f12653f;
            boolean z10 = false;
            View view = this.f12649a;
            if (z9) {
                View view2 = this.f12650b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = r0.i0.f54190a;
                r0.k1 a10 = r0.b0.a(view);
                if (a10 != null) {
                    i7 = a10.f54201a.f(8).d;
                } else {
                    i7 = 0;
                }
                this.f12658l = i7;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.f12650b;
                if (view3 != null) {
                    view = view3;
                }
                this.f12658l = view.getHeight() - rect.bottom;
            }
            if (this.f12654g) {
                this.f12658l = Math.max(0, this.f12658l - org.telegram.messenger.g0.f22558n);
            }
            int i10 = this.f12657k;
            int i11 = this.f12658l;
            if (i10 != i11) {
                z10 = true;
            }
            this.f12657k = i11;
            if (z10) {
                a();
            }
        }
    }
}
