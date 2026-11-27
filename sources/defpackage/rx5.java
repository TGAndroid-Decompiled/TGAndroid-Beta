package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.WeakHashMap;
public class rx5 {
    public final View a;
    public View b;
    public final pcc c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Rect h = new Rect();
    public final pk1 i;
    public final l45 j;
    public int k;
    public int l;

    public rx5(View view, boolean z, pcc pccVar) {
        pk1 pk1Var = new pk1(this, (byte) 4);
        this.i = pk1Var;
        l45 l45Var = new l45(this, (byte) 1);
        this.j = l45Var;
        this.a = view;
        this.c = pccVar;
        this.b = view;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(l45Var);
            view.addOnLayoutChangeListener(pk1Var);
        }
        view.addOnAttachStateChangeListener(new qx5(this, z, view));
    }

    public final void a() {
        if (this.e) {
            if (this.l >= hl.L(20.0f) + hl.n) {
                this.e = false;
            } else {
                return;
            }
        }
        pcc pccVar = this.c;
        if (pccVar != null) {
            pccVar.a(Integer.valueOf(this.l));
        }
    }

    public void b(boolean z) {
        this.d = z;
        d();
    }

    public final boolean c() {
        if (this.l <= hl.L(20.0f) + hl.n && !this.e) {
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
                WeakHashMap weakHashMap = ihc.a;
                l2d a = bhc.a(view);
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
                height = Math.max(0, height - hl.n);
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
