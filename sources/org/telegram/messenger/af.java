package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class af {
    public ze A;
    public CharSequence f14602a;
    public boolean f14603b;
    public String f14604c;
    public long d;
    public TLRPC.Photo e;
    public kj f14605f;
    public String f14606g;
    public String h;
    public String f14607i;
    public String f14608j;
    public String f14609k;
    public String f14610l;
    public long f14611m;
    public ArrayList f14612n;
    public gf f14613o;
    public ArrayList f14614p;
    public ArrayList f14615q;
    public ArrayList f14616r;
    public y20 f14617s;
    public long f14618t;
    public boolean f14619u;
    public boolean v;
    public boolean f14620w;
    public int f14621x;
    public long f14622y;
    public Boolean f14623z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f14603b) {
            return false;
        }
        y20 y20Var = this.f14617s;
        if (y20Var != null && (y20Var.f19544t || y20Var.f19526a > 0 || y20Var.f19528b > 0)) {
            return true;
        }
        ze zeVar = this.A;
        if ((zeVar == null || zeVar.b()) && this.f14613o == null && this.f14608j == null && (((arrayList = this.f14614p) == null || arrayList.isEmpty()) && this.f14606g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f14623z;
        if (bool == null) {
            return uz.f18520h1;
        }
        return bool.booleanValue();
    }

    public boolean d() {
        if ((this instanceof ff) && ((ff) this).d()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f14602a = null;
        this.f14606g = null;
        this.e = null;
        this.f14605f = null;
        this.f14604c = null;
        this.f14607i = null;
        this.h = null;
        this.f14608j = null;
        this.f14610l = null;
        this.f14609k = null;
        this.f14619u = false;
        this.v = false;
        this.f14620w = false;
        this.f14621x = 0;
        this.f14614p = null;
        this.f14617s = null;
        this.f14612n = null;
        this.f14613o = null;
        this.f14616r = null;
        this.A = null;
        this.f14623z = null;
    }
}
