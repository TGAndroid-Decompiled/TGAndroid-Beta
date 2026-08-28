package f2;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public abstract class m1 {
    public int f5443a = -1;
    public RecyclerView f5444b;
    public z0 f5445c;
    public boolean d;
    public boolean f5446e;
    public View f5447f;
    public final l1 f5448g;
    public boolean h;

    public m1() {
        ?? obj = new Object();
        obj.d = -1;
        obj.f5426f = false;
        obj.f5427g = 0;
        obj.f5422a = 0;
        obj.f5423b = 0;
        obj.f5424c = Integer.MIN_VALUE;
        obj.f5425e = null;
        this.f5448g = obj;
    }

    public static void b(PointF pointF) {
        float f10 = pointF.x;
        float f11 = pointF.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    public PointF a(int i9) {
        z0 z0Var = this.f5445c;
        if (z0Var instanceof m0) {
            return ((m0) z0Var).E0(i9);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + m0.class.getCanonicalName());
        return null;
    }

    public final void c(int i9, int i10) {
        PointF a2;
        RecyclerView recyclerView = this.f5444b;
        if (this.f5443a == -1 || recyclerView == null) {
            h();
        }
        if (this.d && this.f5447f == null && this.f5445c != null && (a2 = a(this.f5443a)) != null) {
            float f10 = a2.x;
            if (f10 != 0.0f || a2.y != 0.0f) {
                recyclerView.t0((int) Math.signum(f10), (int) Math.signum(a2.y), null);
            }
        }
        boolean z10 = false;
        this.d = false;
        View view = this.f5447f;
        l1 l1Var = this.f5448g;
        if (view != null) {
            this.f5444b.getClass();
            if (RecyclerView.S(view) == this.f5443a) {
                View view2 = this.f5447f;
                n1 n1Var = recyclerView.f1357p0;
                g(view2, l1Var);
                l1Var.a(recyclerView);
                h();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f5447f = null;
            }
        }
        if (this.f5446e) {
            n1 n1Var2 = recyclerView.f1357p0;
            d(i9, i10, l1Var);
            if (l1Var.d >= 0) {
                z10 = true;
            }
            l1Var.a(recyclerView);
            if (z10 && this.f5446e) {
                this.d = true;
                recyclerView.m0.a();
            }
        }
    }

    public abstract void d(int i9, int i10, l1 l1Var);

    public abstract void e();

    public abstract void f();

    public abstract void g(View view, l1 l1Var);

    public final void h() {
        if (!this.f5446e) {
            return;
        }
        this.f5446e = false;
        f();
        this.f5444b.f1357p0.f5469a = -1;
        this.f5447f = null;
        this.f5443a = -1;
        this.d = false;
        z0 z0Var = this.f5445c;
        if (z0Var.f5565e == this) {
            z0Var.f5565e = null;
        }
        this.f5445c = null;
        this.f5444b = null;
    }
}
