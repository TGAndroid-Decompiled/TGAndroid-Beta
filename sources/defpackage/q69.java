package defpackage;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class q69 {
    public int a = -1;
    public RecyclerView b;
    public f69 c;
    public boolean d;
    public boolean e;
    public View f;
    public final p69 g;
    public boolean h;

    public q69() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f = false;
        obj.g = 0;
        obj.a = 0;
        obj.b = 0;
        obj.c = Integer.MIN_VALUE;
        obj.e = null;
        this.g = obj;
    }

    public static void b(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i) {
        f69 f69Var = this.c;
        if (f69Var instanceof u46) {
            return ((u46) f69Var).D0(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + u46.class.getCanonicalName());
        return null;
    }

    public final void c(int i, int i2) {
        PointF a;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f == null && this.c != null && (a = a(this.a)) != null) {
            float f = a.x;
            if (f != 0.0f || a.y != 0.0f) {
                recyclerView.v0((int) Math.signum(f), (int) Math.signum(a.y), null);
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        p69 p69Var = this.g;
        if (view != null) {
            this.b.getClass();
            if (RecyclerView.S(view) == this.a) {
                View view2 = this.f;
                r69 r69Var = recyclerView.v0;
                g(view2, p69Var);
                p69Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            r69 r69Var2 = recyclerView.v0;
            d(i, i2, p69Var);
            if (p69Var.d >= 0) {
                z = true;
            }
            p69Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.s0.a();
            }
        }
    }

    public abstract void d(int i, int i2, p69 p69Var);

    public abstract void f();

    public abstract void g(View view, p69 p69Var);

    public final void h() {
        if (!this.e) {
            return;
        }
        this.e = false;
        f();
        this.b.v0.a = -1;
        this.f = null;
        this.a = -1;
        this.d = false;
        f69 f69Var = this.c;
        if (f69Var.e == this) {
            f69Var.e = null;
        }
        this.c = null;
        this.b = null;
    }

    public void e() {
    }
}
