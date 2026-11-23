package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class xe {
    public we A;
    public CharSequence f27962a;
    public boolean f27963b;
    public String f27964c;
    public long d;
    public TLRPC.Photo f27965e;
    public fj f27966f;
    public String f27967g;
    public String h;
    public String f27968i;
    public String f27969j;
    public String f27970k;
    public String f27971l;
    public long f27972m;
    public ArrayList f27973n;
    public ff f27974o;
    public ArrayList f27975p;
    public ArrayList f27976q;
    public ArrayList f27977r;
    public d20 f27978s;
    public long f27979t;
    public boolean f27980u;
    public boolean v;
    public boolean f27981w;
    public int f27982x;
    public long f27983y;
    public Boolean f27984z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f27963b) {
            return false;
        }
        d20 d20Var = this.f27978s;
        if (d20Var != null && (d20Var.f23606t || d20Var.f23587a > 0 || d20Var.f23589b > 0)) {
            return true;
        }
        we weVar = this.A;
        if ((weVar == null || weVar.b()) && this.f27974o == null && this.f27969j == null && (((arrayList = this.f27975p) == null || arrayList.isEmpty()) && this.f27967g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f27984z;
        if (bool == null) {
            return bz.f23291h1;
        }
        return bool.booleanValue();
    }

    public boolean d() {
        if ((this instanceof ef) && ((ef) this).d()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f27962a = null;
        this.f27967g = null;
        this.f27965e = null;
        this.f27966f = null;
        this.f27964c = null;
        this.f27968i = null;
        this.h = null;
        this.f27969j = null;
        this.f27971l = null;
        this.f27970k = null;
        this.f27980u = false;
        this.v = false;
        this.f27981w = false;
        this.f27982x = 0;
        this.f27975p = null;
        this.f27978s = null;
        this.f27973n = null;
        this.f27974o = null;
        this.f27977r = null;
        this.A = null;
        this.f27984z = null;
    }
}
