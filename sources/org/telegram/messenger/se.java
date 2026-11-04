package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class se {
    public re A;
    public CharSequence f25309a;
    public boolean f25310b;
    public String f25311c;
    public long d;
    public TLRPC.Photo f25312e;
    public zi f25313f;
    public String f25314g;
    public String h;
    public String f25315i;
    public String f25316j;
    public String f25317k;
    public String f25318l;
    public long f25319m;
    public ArrayList f25320n;
    public ze f25321o;
    public ArrayList f25322p;
    public ArrayList f25323q;
    public ArrayList f25324r;
    public b20 f25325s;
    public long f25326t;
    public boolean f25327u;
    public boolean v;
    public boolean f25328w;
    public int f25329x;
    public long f25330y;
    public Boolean f25331z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.f25310b) {
            return false;
        }
        b20 b20Var = this.f25325s;
        if (b20Var != null && (b20Var.f21727t || b20Var.f21708a > 0 || b20Var.f21710b > 0)) {
            return true;
        }
        re reVar = this.A;
        if ((reVar == null || reVar.b()) && this.f25321o == null && this.f25316j == null && (((arrayList = this.f25322p) == null || arrayList.isEmpty()) && this.f25314g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.f25331z;
        if (bool == null) {
            return az.f21633h1;
        }
        return bool.booleanValue();
    }

    public boolean d() {
        if ((this instanceof ye) && ((ye) this).d()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.f25309a = null;
        this.f25314g = null;
        this.f25312e = null;
        this.f25313f = null;
        this.f25311c = null;
        this.f25315i = null;
        this.h = null;
        this.f25316j = null;
        this.f25318l = null;
        this.f25317k = null;
        this.f25327u = false;
        this.v = false;
        this.f25328w = false;
        this.f25329x = 0;
        this.f25322p = null;
        this.f25325s = null;
        this.f25320n = null;
        this.f25321o = null;
        this.f25324r = null;
        this.A = null;
        this.f25331z = null;
    }
}
