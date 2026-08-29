package ab;

import android.os.Bundle;
import j3.c2;
import j3.q2;
import j3.r2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import r0.m1;
public abstract class e implements c2 {
    public Object f306a;

    public abstract Object F(Object obj);

    public Object G(Object obj) {
        synchronized (((HashMap) this.f306a)) {
            try {
                if (((HashMap) this.f306a).containsKey(obj)) {
                    return ((HashMap) this.f306a).get(obj);
                }
                Object F = F(obj);
                ((HashMap) this.f306a).put(obj, F);
                return F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean H(int i10) {
        return f().f10863a.f6596a.get(i10);
    }

    public boolean I() {
        r2 A = A();
        if (!A.p() && A.m(x(), (q2) this.f306a, 0L).f10701r) {
            return true;
        }
        return false;
    }

    public boolean J() {
        r2 A = A();
        if (!A.p() && A.m(x(), (q2) this.f306a, 0L).a()) {
            return true;
        }
        return false;
    }

    public boolean K() {
        if (b() == 3 && h() && z() == 0) {
            return true;
        }
        return false;
    }

    public abstract void L();

    public abstract m1 M(m1 m1Var, List list);

    public void N() {
        synchronized (this.f306a) {
        }
    }

    public abstract void O(long j10, int i10, int i11, boolean z10);

    public void P(int i10, long j10) {
        O(j10, x(), i10, false);
    }

    public e(int i10) {
        switch (i10) {
            case 1:
                this.f306a = new Object();
                return;
            case 3:
                this.f306a = new q2();
                return;
            case 8:
                this.f306a = new LinkedHashMap();
                return;
            default:
                this.f306a = new HashMap();
                return;
        }
    }

    public e(String str, Bundle data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.f306a = data;
    }
}
