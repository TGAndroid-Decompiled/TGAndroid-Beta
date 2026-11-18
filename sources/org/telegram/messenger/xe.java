package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class xe {
    public we A;
    public CharSequence f27846a;
    public boolean f27847b;
    public String f27848c;
    public long d;
    public TLRPC.Photo f27849e;
    public fj f27850f;
    public String f27851g;
    public String h;
    public String f27852i;
    public String f27853j;
    public String f27854k;
    public String f27855l;
    public long f27856m;
    public ArrayList f27857n;
    public ff f27858o;
    public ArrayList f27859p;
    public ArrayList f27860q;
    public ArrayList f27861r;
    public e20 f27862s;
    public long f27863t;
    public boolean f27864u;
    public boolean v;
    public boolean f27865w;
    public int f27866x;
    public long f27867y;
    public Boolean f27868z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f27847b) {
            return false;
        }
        e20 e20Var = this.f27862s;
        if (e20Var != null && (e20Var.f23653t || e20Var.f23634a > 0 || e20Var.f23636b > 0)) {
            return true;
        }
        we weVar = this.A;
        if ((weVar == null || weVar.b()) && this.f27858o == null && this.f27853j == null && (((arrayList = this.f27859p) == null || arrayList.isEmpty()) && this.f27851g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f27868z;
        if (bool == null) {
            return bz.f23166h1;
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
        this.f27846a = null;
        this.f27851g = null;
        this.f27849e = null;
        this.f27850f = null;
        this.f27848c = null;
        this.f27852i = null;
        this.h = null;
        this.f27853j = null;
        this.f27855l = null;
        this.f27854k = null;
        this.f27864u = false;
        this.v = false;
        this.f27865w = false;
        this.f27866x = 0;
        this.f27859p = null;
        this.f27862s = null;
        this.f27857n = null;
        this.f27858o = null;
        this.f27861r = null;
        this.A = null;
        this.f27868z = null;
    }
}
