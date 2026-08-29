package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class j1 {
    public int f6373a = -1;
    public RecyclerView f6374b;
    public w0 f6375c;
    public boolean d;
    public boolean f6376e;
    public View f6377f;
    public final i1 f6378g;
    public boolean h;

    public j1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f6355f = false;
        obj.f6356g = 0;
        obj.f6351a = 0;
        obj.f6352b = 0;
        obj.f6353c = Integer.MIN_VALUE;
        obj.f6354e = null;
        this.f6378g = obj;
    }

    public static void b(PointF pointF) {
        float f9 = pointF.x;
        float f10 = pointF.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i10) {
        w0 w0Var = this.f6375c;
        if (w0Var instanceof j0) {
            return ((j0) w0Var).E0(i10);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + j0.class.getCanonicalName());
        return null;
    }

    public final void c(int i10, int i11) {
        PointF a2;
        RecyclerView recyclerView = this.f6374b;
        if (this.f6373a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f6377f == null && this.f6375c != null && (a2 = a(this.f6373a)) != null) {
            float f9 = a2.x;
            if (f9 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f9), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f6377f;
        i1 i1Var = this.f6378g;
        if (view != null) {
            this.f6374b.getClass();
            if (RecyclerView.S(view) == this.f6373a) {
                View view2 = this.f6377f;
                k1 k1Var = recyclerView.f1847p0;
                g(view2, i1Var);
                i1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f6377f = null;
            }
        }
        if (this.f6376e) {
            k1 k1Var2 = recyclerView.f1847p0;
            d(i10, i11, i1Var);
            if (i1Var.d >= 0) {
                z10 = true;
            }
            i1Var.a(recyclerView);
            if (z10 && this.f6376e) {
                this.d = true;
                recyclerView.m0.a();
            }
        }
    }

    public abstract void d(int i10, int i11, i1 i1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, i1 i1Var);

    public final void h() {
        if (!this.f6376e) {
            return;
        }
        this.f6376e = false;
        f();
        this.f6374b.f1847p0.f6392a = -1;
        this.f6377f = null;
        this.f6373a = -1;
        this.d = false;
        w0 w0Var = this.f6375c;
        if (w0Var.f6499e == this) {
            w0Var.f6499e = null;
        }
        this.f6375c = null;
        this.f6374b = null;
    }
}
