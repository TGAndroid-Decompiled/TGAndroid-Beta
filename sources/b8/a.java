package b8;

import android.os.Bundle;
import h3.c2;
import h3.r2;
import h3.s2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.j;
import r0.m1;

public abstract class a implements c2 {

    public Object f2040a;

    public abstract Object F(Object obj);

    public Object G(Object obj) {
        synchronized (((HashMap) this.f2040a)) {
            try {
                if (((HashMap) this.f2040a).containsKey(obj)) {
                    return ((HashMap) this.f2040a).get(obj);
                }
                Object objF = F(obj);
                ((HashMap) this.f2040a).put(obj, objF);
                return objF;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean H(int i10) {
        return f().f8256a.f4794a.get(i10);
    }

    public boolean I() {
        s2 s2VarA = A();
        return !s2VarA.p() && s2VarA.m(x(), (r2) this.f2040a, 0L).f8118r;
    }

    public boolean J() {
        s2 s2VarA = A();
        return !s2VarA.p() && s2VarA.m(x(), (r2) this.f2040a, 0L).a();
    }

    public boolean K() {
        return b() == 3 && h() && z() == 0;
    }

    public abstract void L();

    public abstract m1 M(m1 m1Var, List list);

    public void N() {
        synchronized (this.f2040a) {
        }
    }

    public abstract void O(long j10, int i10, int i11, boolean z10);

    public void P(int i10, long j10) {
        O(j10, x(), i10, false);
    }

    public a(int i10) {
        switch (i10) {
            case 2:
                this.f2040a = new r2();
                break;
            case 7:
                this.f2040a = new LinkedHashMap();
                break;
            case 8:
                this.f2040a = new HashMap();
                break;
            default:
                this.f2040a = new Object();
                break;
        }
    }

    public a(String str, Bundle data) {
        j.e(data, "data");
        this.f2040a = data;
    }
}
