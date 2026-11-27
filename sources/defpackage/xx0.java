package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import org.telegram.ui.m;
import org.telegram.ui.o;
public class xx0 {
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
    public wr0 K;
    public boolean L;
    public gzc a;
    public nv0 b;
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
    public lp w;
    public String x;
    public boolean y;
    public boolean z;

    public final void a() {
        try {
            nv0 nv0Var = this.b;
            if (nv0Var != null) {
                nv0Var.destroy();
                this.b = null;
            }
            o oVar = this.J;
            if (oVar != null) {
                oVar.p();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public String b() {
        if (this.J != null) {
            if (TextUtils.isEmpty(this.E)) {
                return ob6.M0(2131742557, null);
            }
            return this.E;
        }
        gzc gzcVar = this.a;
        if (gzcVar == null) {
            return "";
        }
        if (gzcVar.g == 6) {
            return gzcVar.e;
        }
        return lbc.r(uc7.s1(gzcVar.a).X1(Long.valueOf(this.a.c)));
    }
}
