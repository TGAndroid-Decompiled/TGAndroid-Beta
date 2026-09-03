package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class h1 {
    public int f5712a = -1;
    public RecyclerView f5713b;
    public v0 f5714c;
    public boolean d;
    public boolean e;
    public View f5715f;
    public final g1 f5716g;
    public boolean h;

    public h1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f5703f = false;
        obj.f5704g = 0;
        obj.f5700a = 0;
        obj.f5701b = 0;
        obj.f5702c = Integer.MIN_VALUE;
        obj.e = null;
        this.f5716g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        v0 v0Var = this.f5714c;
        if (v0Var instanceof i0) {
            return ((i0) v0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + i0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f5713b;
        if (this.f5712a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f5715f == null && this.f5714c != null && (a2 = a(this.f5712a)) != null) {
            float f10 = a2.x;
            if (f10 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f10), (int) Math.signum(a2.y), null);
            }
        }
        boolean z4 = false;
        this.d = false;
        View view = this.f5715f;
        g1 g1Var = this.f5716g;
        if (view != null) {
            this.f5713b.getClass();
            if (RecyclerView.S(view) == this.f5712a) {
                View view2 = this.f5715f;
                i1 i1Var = recyclerView.f1251q0;
                g(view2, g1Var);
                g1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f5715f = null;
            }
        }
        if (this.e) {
            i1 i1Var2 = recyclerView.f1251q0;
            d(i10, i11, g1Var);
            if (g1Var.d >= 0) {
                z4 = true;
            }
            g1Var.a(recyclerView);
            if (z4 && this.e) {
                this.d = true;
                recyclerView.f1248n0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, g1 g1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, g1 g1Var);

    public final void h() {
        if (!this.e) {
            return;
        }
        this.e = false;
        f();
        this.f5713b.f1251q0.f5731a = -1;
        this.f5715f = null;
        this.f5712a = -1;
        this.d = false;
        v0 v0Var = this.f5714c;
        if (v0Var.e == this) {
            v0Var.e = null;
        }
        this.f5714c = null;
        this.f5713b = null;
    }
}
