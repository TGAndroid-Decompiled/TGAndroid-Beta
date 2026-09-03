package cb;

import android.os.Bundle;
import j3.a2;
import j3.n2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import r0.m1;
public abstract class e implements a2 {
    public Object f2238a;

    public abstract Object E(Object obj);

    public Object F(Object obj) {
        synchronized (((HashMap) this.f2238a)) {
            try {
                if (((HashMap) this.f2238a).containsKey(obj)) {
                    return ((HashMap) this.f2238a).get(obj);
                }
                Object E = E(obj);
                ((HashMap) this.f2238a).put(obj, E);
                return E;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean G() {
        if (c() == 3 && j() && y() == 0) {
            return true;
        }
        return false;
    }

    public abstract void H();

    public abstract m1 I(m1 m1Var, List list);

    public void J() {
        synchronized (this.f2238a) {
        }
    }

    public abstract void K(int i10, int i11, long j10);

    public e(int i10) {
        switch (i10) {
            case 2:
                this.f2238a = new Object();
                return;
            case 3:
                this.f2238a = new n2();
                return;
            case 7:
                this.f2238a = new LinkedHashMap();
                return;
            default:
                this.f2238a = new HashMap();
                return;
        }
    }

    public e(String str, Bundle data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.f2238a = data;
    }
}
