package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class q6 {
    public r6 a;
    public byte b;
    public int c;
    public String d;
    public int e;
    public Drawable f;
    public int g;
    public ylb h;
    public float i;
    public Boolean j;
    public Boolean k;
    public byte l;
    public r7 m;
    public ArrayList n;

    public final void a() {
        r6 r6Var = this.a;
        if (this.m == null) {
            int childCount = r6Var.getChildCount();
            ArrayList arrayList = r6Var.e;
            int i = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.b));
                int i2 = 0;
                while (true) {
                    if (i2 >= r6Var.getChildCount()) {
                        break;
                    }
                    Object tag = r6Var.getChildAt(i2).getTag();
                    if (tag instanceof Integer) {
                        if (r6Var.e.indexOf((Integer) tag) > indexOf) {
                            childCount = i2;
                            break;
                        }
                    }
                    i2++;
                }
            }
            r7 f = r6Var.f(childCount, this.b, this.c, null, this.e, this.f, this.g, null, this.h);
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
                    ((qac) obj).a(this.m);
                }
                this.n = null;
            }
        }
    }

    public final void b(qm1 qm1Var) {
        r7 r7Var = this.m;
        if (r7Var != null) {
            qm1Var.a(r7Var);
            return;
        }
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.n = arrayList;
        }
        arrayList.add(qm1Var);
    }

    public final void c() {
        this.k = Boolean.FALSE;
        r7 r7Var = this.m;
        if (r7Var != null) {
            r7Var.S = false;
        }
    }

    public final void d() {
        this.j = Boolean.TRUE;
        r7 r7Var = this.m;
        if (r7Var != null) {
            r7Var.T = true;
        }
    }

    public final void e(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                a();
            }
            r7 r7Var = this.m;
            if (r7Var != null) {
                r7Var.setVisibility(i);
            }
        }
    }
}
