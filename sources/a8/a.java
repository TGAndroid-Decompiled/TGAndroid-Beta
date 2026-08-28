package a8;

import android.os.Bundle;
import h3.c2;
import h3.q2;
import h3.r2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.i;
import r0.m1;
public abstract class a implements c2 {
    public Object f108a;

    public abstract Object F(Object obj);

    public Object G(Object obj) {
        synchronized (((HashMap) this.f108a)) {
            try {
                if (((HashMap) this.f108a).containsKey(obj)) {
                    return ((HashMap) this.f108a).get(obj);
                }
                Object F = F(obj);
                ((HashMap) this.f108a).put(obj, F);
                return F;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean H(int i9) {
        return f().f9826a.f4361a.get(i9);
    }

    public boolean I() {
        r2 A = A();
        if (!A.p() && A.m(x(), (q2) this.f108a, 0L).f9664r) {
            return true;
        }
        return false;
    }

    public boolean J() {
        r2 A = A();
        if (!A.p() && A.m(x(), (q2) this.f108a, 0L).a()) {
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
        synchronized (this.f108a) {
        }
    }

    public abstract void O(long j10, int i9, int i10, boolean z10);

    public void P(int i9, long j10) {
        O(j10, x(), i9, false);
    }

    public a(int i9) {
        switch (i9) {
            case 3:
                this.f108a = new q2();
                return;
            case 7:
                this.f108a = new LinkedHashMap();
                return;
            case 8:
                this.f108a = new HashMap();
                return;
            default:
                this.f108a = new Object();
                return;
        }
    }

    public a(String str, Bundle data) {
        i.e(data, "data");
        this.f108a = data;
    }
}
