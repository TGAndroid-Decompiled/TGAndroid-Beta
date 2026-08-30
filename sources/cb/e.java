package cb;

import android.os.Bundle;
import j3.a2;
import j3.n2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import r0.m1;
public abstract class e implements a2 {
    public Object f2215a;

    public abstract Object E(Object obj);

    public Object F(Object obj) {
        synchronized (((HashMap) this.f2215a)) {
            try {
                if (((HashMap) this.f2215a).containsKey(obj)) {
                    return ((HashMap) this.f2215a).get(obj);
                }
                Object E = E(obj);
                ((HashMap) this.f2215a).put(obj, E);
                return E;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean G() {
        if (b() == 3 && j() && y() == 0) {
            return true;
        }
        return false;
    }

    public abstract void H();

    public abstract m1 I(m1 m1Var, List list);

    public void J() {
        synchronized (this.f2215a) {
        }
    }

    public abstract void K(int i10, int i11, long j10);

    public e(int i10) {
        switch (i10) {
            case 2:
                this.f2215a = new Object();
                return;
            case 3:
                this.f2215a = new n2();
                return;
            case 7:
                this.f2215a = new LinkedHashMap();
                return;
            default:
                this.f2215a = new HashMap();
                return;
        }
    }

    public e(String str, Bundle data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.f2215a = data;
    }
}
