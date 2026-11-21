package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class xe {
    public we A;
    public CharSequence f27874a;
    public boolean f27875b;
    public String f27876c;
    public long d;
    public TLRPC.Photo f27877e;
    public fj f27878f;
    public String f27879g;
    public String h;
    public String f27880i;
    public String f27881j;
    public String f27882k;
    public String f27883l;
    public long f27884m;
    public ArrayList f27885n;
    public ff f27886o;
    public ArrayList f27887p;
    public ArrayList f27888q;
    public ArrayList f27889r;
    public e20 f27890s;
    public long f27891t;
    public boolean f27892u;
    public boolean v;
    public boolean f27893w;
    public int f27894x;
    public long f27895y;
    public Boolean f27896z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f27875b) {
            return false;
        }
        e20 e20Var = this.f27890s;
        if (e20Var != null && (e20Var.f23681t || e20Var.f23662a > 0 || e20Var.f23664b > 0)) {
            return true;
        }
        we weVar = this.A;
        if ((weVar == null || weVar.b()) && this.f27886o == null && this.f27881j == null && (((arrayList = this.f27887p) == null || arrayList.isEmpty()) && this.f27879g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f27896z;
        if (bool == null) {
            return bz.f23194h1;
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
        this.f27874a = null;
        this.f27879g = null;
        this.f27877e = null;
        this.f27878f = null;
        this.f27876c = null;
        this.f27880i = null;
        this.h = null;
        this.f27881j = null;
        this.f27883l = null;
        this.f27882k = null;
        this.f27892u = false;
        this.v = false;
        this.f27893w = false;
        this.f27894x = 0;
        this.f27887p = null;
        this.f27890s = null;
        this.f27885n = null;
        this.f27886o = null;
        this.f27889r = null;
        this.A = null;
        this.f27896z = null;
    }
}
