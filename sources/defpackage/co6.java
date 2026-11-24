package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class co6 {
    public ao6 A;
    public CharSequence a;
    public boolean b;
    public String c;
    public long d;
    public TLRPC.Photo e;
    public k47 f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public long m;
    public ArrayList n;
    public lo6 o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public rcc s;
    public long t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public long y;
    public Boolean z;

    public abstract String a();

    public final boolean b() {
        ArrayList arrayList;
        if (!this.b) {
            return false;
        }
        rcc rccVar = this.s;
        if (rccVar != null && (rccVar.t || rccVar.a > 0 || rccVar.b > 0)) {
            return true;
        }
        ao6 ao6Var = this.A;
        if ((ao6Var == null || ao6Var.b()) && this.o == null && this.j == null && (((arrayList = this.p) == null || arrayList.isEmpty()) && this.g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.z;
        if (bool == null) {
            return gda.d1;
        }
        return bool.booleanValue();
    }

    public boolean d() {
        if ((this instanceof jo6) && ((jo6) this).d()) {
            return true;
        }
        return false;
    }

    public void e() {
        this.a = null;
        this.g = null;
        this.e = null;
        this.f = null;
        this.c = null;
        this.i = null;
        this.h = null;
        this.j = null;
        this.l = null;
        this.k = null;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = 0;
        this.p = null;
        this.s = null;
        this.n = null;
        this.o = null;
        this.r = null;
        this.A = null;
        this.z = null;
    }
}
