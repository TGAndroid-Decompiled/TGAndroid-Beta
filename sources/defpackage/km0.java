package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
public class km0 {
    public final iz4 a;
    public final iz4 b;
    public final iz4 c;
    public int d;
    public int e;
    public g79 f;
    public g79 g;
    public zgc h;
    public ViewGroup i;
    public sy4 j;
    public boolean k;

    public km0(iz4 iz4Var, iz4 iz4Var2, iz4 iz4Var3) {
        this.a = iz4Var;
        this.b = iz4Var2;
        this.c = iz4Var3;
    }

    public final im0 a(View view) {
        return c(view, null, false);
    }

    public final im0 b(View view, am0 am0Var) {
        return c(view, am0Var, false);
    }

    public im0 c(View view, am0 am0Var, boolean z) {
        im0 im0Var;
        iz4 iz4Var = this.c;
        iz4 iz4Var2 = this.a;
        iz4 iz4Var3 = this.b;
        if (iz4Var2 == iz4Var3 && iz4Var3 == iz4Var) {
            if (iz4Var2 instanceof jm0) {
                im0Var = ((jm0) iz4Var2).b();
            } else {
                im0Var = new im0(iz4Var2, iz4Var2, iz4Var2);
            }
        } else {
            im0 im0Var2 = new im0(iz4Var2, iz4Var3, iz4Var);
            if (iz4Var2 instanceof jm0) {
                ((jm0) iz4Var2).c(im0Var2);
            }
            if (iz4Var3 != iz4Var2 && (iz4Var3 instanceof jm0)) {
                ((jm0) iz4Var3).c(im0Var2);
            }
            if (iz4Var != iz4Var2 && iz4Var != iz4Var3 && (iz4Var instanceof jm0)) {
                ((jm0) iz4Var).c(im0Var2);
            }
            im0Var = im0Var2;
        }
        if (this.k && !im0Var.Y) {
            im0Var.Y = true;
            im0Var.b0 = true;
        }
        im0Var.p(am0Var);
        int i = this.d;
        int i2 = this.e;
        im0Var.L = i;
        im0Var.M = i2;
        g79 g79Var = this.g;
        if (g79Var != null && view != null) {
            g79Var.add(view);
        }
        sy4 sy4Var = this.j;
        if (sy4Var != null && view != null) {
            sy4Var.c.add(new ry4(view, im0Var));
        }
        if (this.h != null && this.i != null && view != null) {
            this.h.d(view, this.i, new o(im0Var, new WeakReference(view), (byte) 17), z);
        }
        g79 g79Var2 = this.f;
        if (g79Var2 != null) {
            g79Var2.add(im0Var);
        }
        return im0Var;
    }

    public final void d() {
        g79 g79Var = this.g;
        if (g79Var != null) {
            Iterator it = g79Var.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(zgc zgcVar, ViewGroup viewGroup) {
        this.h = zgcVar;
        this.i = viewGroup;
    }
}
