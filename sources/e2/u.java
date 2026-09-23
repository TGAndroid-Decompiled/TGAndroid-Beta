package e2;

import android.content.Context;
import ci.rc;
import ci.y8;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class u {
    public static u f7912f;
    public boolean f7913a;
    public int f7914b;
    public final Object f7915c;
    public final Object d;
    public final Object e;

    public u(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = rVar;
        this.f7915c = pVar;
        this.d = cVarArr;
        this.f7913a = z10;
        this.f7914b = i10;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f7912f == null) {
                    f7912f = new u(context);
                }
                uVar = f7912f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.f7914b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar.f7909a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.f7913a && this.f7914b == i10) {
                    return;
                }
                this.f7913a = true;
                this.f7914b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    t tVar2 = (t) it2.next();
                    tVar2.f7910b.execute(new rc(tVar2, 5));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u(Context context) {
        Executor g10 = a.g();
        this.f7915c = g10;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f7914b = 0;
        g10.execute(new y8(12, this, context));
    }
}
