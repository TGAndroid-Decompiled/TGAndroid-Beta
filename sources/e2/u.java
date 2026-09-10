package e2;

import android.content.Context;
import bi.af;
import bi.wc;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class u {
    public static u f7229f;
    public boolean f7230a;
    public int f7231b;
    public final Object f7232c;
    public final Object d;
    public final Object e;

    public u(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = rVar;
        this.f7232c = pVar;
        this.d = cVarArr;
        this.f7230a = z10;
        this.f7231b = i10;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f7229f == null) {
                    f7229f = new u(context);
                }
                uVar = f7229f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.f7231b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar.f7226a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.f7230a && this.f7231b == i10) {
                    return;
                }
                this.f7230a = true;
                this.f7231b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    t tVar2 = (t) it2.next();
                    tVar2.f7227b.execute(new wc(tVar2, 22));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u(Context context) {
        Executor g10 = a.g();
        this.f7232c = g10;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f7231b = 0;
        g10.execute(new af(21, this, context));
    }
}
