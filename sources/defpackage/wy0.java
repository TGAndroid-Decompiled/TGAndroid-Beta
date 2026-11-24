package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.ui.m;
import org.telegram.ui.o;
public class wy0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public String E;
    public Bitmap F;
    public boolean G;
    public String H;
    public float I;
    public o J;
    public ws0 K;
    public boolean L;
    public rwc a;
    public mw0 b;
    public m c;
    public Object d;
    public boolean e;
    public String f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public float k = Float.MAX_VALUE;
    public boolean l = true;
    public Bitmap m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public kq w;
    public String x;
    public boolean y;
    public boolean z;

    public final void a() {
        try {
            mw0 mw0Var = this.b;
            if (mw0Var != null) {
                mw0Var.destroy();
                this.b = null;
            }
            o oVar = this.J;
            if (oVar != null) {
                oVar.p();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public String b() {
        if (this.J != null) {
            if (TextUtils.isEmpty(this.E)) {
                return jb6.M0(2131742589, null);
            }
            return this.E;
        }
        rwc rwcVar = this.a;
        if (rwcVar == null) {
            return "";
        }
        if (rwcVar.g == 6) {
            return rwcVar.e;
        }
        return m9c.r(oc7.r1(rwcVar.a).W1(Long.valueOf(this.a.c)));
    }
}
