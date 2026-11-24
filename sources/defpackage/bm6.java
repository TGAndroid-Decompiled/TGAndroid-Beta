package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class bm6 {
    public zl6 A;
    public CharSequence a;
    public boolean b;
    public String c;
    public long d;
    public TLRPC.Photo e;
    public k27 f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public long m;
    public ArrayList n;
    public lm6 o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;
    public oac s;
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
        oac oacVar = this.s;
        if (oacVar != null && (oacVar.t || oacVar.a > 0 || oacVar.b > 0)) {
            return true;
        }
        zl6 zl6Var = this.A;
        if ((zl6Var == null || zl6Var.b()) && this.o == null && this.j == null && (((arrayList = this.p) == null || arrayList.isEmpty()) && this.g == null)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Boolean bool = this.z;
        if (bool == null) {
            return gba.d1;
        }
        return bool.booleanValue();
    }

    public boolean d() {
        if ((this instanceof jm6) && ((jm6) this).d()) {
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
