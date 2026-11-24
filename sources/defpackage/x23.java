package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
public abstract class x23 {
    public Object a;

    public x23(byte b) {
        switch (b) {
            case 2:
                this.a = new Object();
                return;
            case 3:
            default:
                this.a = new LinkedHashMap();
                return;
            case 4:
                this.a = new HashMap();
                return;
        }
    }

    public abstract Object a(Object obj);

    public Object b(w23 w23Var) {
        return null;
    }

    public final Object c(Object obj) {
        synchronized (((HashMap) this.a)) {
            if (((HashMap) this.a).containsKey(obj)) {
                return ((HashMap) this.a).get(obj);
            }
            Object a = a(obj);
            ((HashMap) this.a).put(obj, a);
            return a;
        }
    }

    public void d() {
        synchronized (this.a) {
        }
    }

    public final void e() {
        synchronized (this) {
        }
    }

    public final void f() {
        synchronized (this) {
        }
        e();
    }

    public final void g() {
        synchronized (this) {
        }
    }

    public x23(String str, Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    public x23(cwc cwcVar, String str, nf5 nf5Var) {
        this.a = cwcVar;
    }
}
