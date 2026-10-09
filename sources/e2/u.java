package e2;

import android.content.Context;
import ci.rc;
import ci.y8;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class u {
    public static u f8577f;
    public boolean f8578a;
    public int f8579b;
    public final Object f8580c;
    public final Object d;
    public final Object f8581e;

    public u(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.f8581e = rVar;
        this.f8580c = pVar;
        this.d = cVarArr;
        this.f8578a = z10;
        this.f8579b = i10;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f8577f == null) {
                    f8577f = new u(context);
                }
                uVar = f8577f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public int b() {
        int i10;
        synchronized (this.f8581e) {
            i10 = this.f8579b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar.f8574a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
            }
        }
        synchronized (this.f8581e) {
            try {
                if (this.f8578a && this.f8579b == i10) {
                    return;
                }
                this.f8578a = true;
                this.f8579b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    t tVar2 = (t) it2.next();
                    tVar2.f8575b.execute(new rc(tVar2, 5));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u(Context context) {
        Executor g10 = a.g();
        this.f8580c = g10;
        this.d = new CopyOnWriteArrayList();
        this.f8581e = new Object();
        this.f8579b = 0;
        g10.execute(new y8(12, this, context));
    }
}
