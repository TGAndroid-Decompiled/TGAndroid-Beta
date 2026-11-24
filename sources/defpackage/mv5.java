package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
public class mv5 {
    public final View a;
    public View b;
    public final p8c c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final gk1 i;
    public final c25 j;
    public int k;
    public int l;

    public mv5(View view, boolean z, p8c p8cVar) {
        gk1 gk1Var = new gk1(this, (byte) 4);
        this.i = gk1Var;
        c25 c25Var = new c25(this, (byte) 1);
        this.j = c25Var;
        this.a = view;
        this.c = p8cVar;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(c25Var);
            view.addOnLayoutChangeListener(gk1Var);
        }
        view.addOnAttachStateChangeListener(new lv5(this, z, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l >= gl.L(20.0f) + gl.n) {
                this.e = false;
            } else {
                return;
            }
        }
        p8c p8cVar = this.c;
        if (p8cVar != null) {
            p8cVar.a(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z) {
        this.d = z;
        d();
    }

    public final boolean c() {
        if (this.l <= gl.L(20.0f) + gl.n && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int height;
        if (!this.d) {
            boolean z = this.f;
            boolean z2 = false;
            View view = this.a;
            if (z) {
                View view2 = this.b;
                if (view2 != null) {
                    view = view2;
                }
                WeakHashMap weakHashMap = jdc.a;
                vxc a = cdc.a(view);
                if (a != null) {
                    height = a.a.f(8).d;
                } else {
                    height = 0;
                }
                this.l = height;
            } else {
                Rect rect = this.h;
                view.getWindowVisibleDisplayFrame(rect);
                View view3 = this.b;
                if (view3 != null) {
                    view = view3;
                }
                height = view.getHeight() - rect.bottom;
                this.l = height;
            }
            if (this.g) {
                height = Math.max(0, height - gl.n);
                this.l = height;
            }
            if (this.k != height) {
                z2 = true;
            }
            this.k = height;
            if (z2) {
                a();
            }
        }
    }
}
