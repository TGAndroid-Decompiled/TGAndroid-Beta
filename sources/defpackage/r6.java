package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class r6 {
    public s6 a;
    public byte b;
    public int c;
    public String d;
    public int e;
    public Drawable f;
    public int g;
    public vnb h;
    public float i;
    public Boolean j;
    public Boolean k;
    public byte l;
    public s7 m;
    public ArrayList n;

    public final void a() {
        s6 s6Var = this.a;
        if (this.m == null) {
            int childCount = s6Var.getChildCount();
            ArrayList arrayList = s6Var.e;
            int i = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.b));
                int i2 = 0;
                while (true) {
                    if (i2 >= s6Var.getChildCount()) {
                        break;
                    }
                    Object tag = s6Var.getChildAt(i2).getTag();
                    if (tag instanceof Integer) {
                        if (s6Var.e.indexOf((Integer) tag) > indexOf) {
                            childCount = i2;
                            break;
                        }
                    }
                    i2++;
                }
            }
            s7 f = s6Var.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
            this.m = f;
            f.setVisibility(this.l);
            String str = this.d;
            if (str != null) {
                this.m.setContentDescription(str);
            }
            Boolean bool = this.k;
            if (bool != null) {
                this.m.S = bool.booleanValue();
            }
            Boolean bool2 = this.j;
            if (bool2 != null) {
                this.m.T = bool2.booleanValue();
            }
            this.m.setAlpha(this.i);
            ArrayList arrayList2 = this.n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((pcc) obj).a(this.m);
                }
                this.n = null;
            }
        }
    }

    public final void b(gl1 gl1Var) {
        s7 s7Var = this.m;
        if (s7Var != null) {
            gl1Var.a(s7Var);
            return;
        }
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.n = arrayList;
        }
        arrayList.add(gl1Var);
    }

    public final void c() {
        this.k = Boolean.FALSE;
        s7 s7Var = this.m;
        if (s7Var != null) {
            s7Var.S = false;
        }
    }

    public final void d() {
        this.j = Boolean.TRUE;
        s7 s7Var = this.m;
        if (s7Var != null) {
            s7Var.T = true;
        }
    }

    public final void e(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                a();
            }
            s7 s7Var = this.m;
            if (s7Var != null) {
                s7Var.setVisibility(i);
            }
        }
    }
}
