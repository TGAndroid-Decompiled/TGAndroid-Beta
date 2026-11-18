package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class xe {
    public we A;
    public CharSequence f27848a;
    public boolean f27849b;
    public String f27850c;
    public long d;
    public TLRPC.Photo f27851e;
    public fj f27852f;
    public String f27853g;
    public String h;
    public String f27854i;
    public String f27855j;
    public String f27856k;
    public String f27857l;
    public long f27858m;
    public ArrayList f27859n;
    public ff f27860o;
    public ArrayList f27861p;
    public ArrayList f27862q;
    public ArrayList f27863r;
    public e20 f27864s;
    public long f27865t;
    public boolean f27866u;
    public boolean v;
    public boolean f27867w;
    public int f27868x;
    public long f27869y;
    public Boolean f27870z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f27849b) {
            return false;
        }
        e20 e20Var = this.f27864s;
        if (e20Var != null && (e20Var.f23656t || e20Var.f23637a > 0 || e20Var.f23639b > 0)) {
            return true;
        }
        we weVar = this.A;
        if ((weVar == null || weVar.b()) && this.f27860o == null && this.f27855j == null && (((arrayList = this.f27861p) == null || arrayList.isEmpty()) && this.f27853g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f27870z;
        if (bool == null) {
            return bz.f23169h1;
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
        this.f27848a = null;
        this.f27853g = null;
        this.f27851e = null;
        this.f27852f = null;
        this.f27850c = null;
        this.f27854i = null;
        this.h = null;
        this.f27855j = null;
        this.f27857l = null;
        this.f27856k = null;
        this.f27866u = false;
        this.v = false;
        this.f27867w = false;
        this.f27868x = 0;
        this.f27861p = null;
        this.f27864s = null;
        this.f27859n = null;
        this.f27860o = null;
        this.f27863r = null;
        this.A = null;
        this.f27870z = null;
    }
}
