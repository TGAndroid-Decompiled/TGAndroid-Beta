package e2;

import android.content.Context;
import ci.rc;
import ci.y8;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class u {
    public static u f8574f;
    public boolean f8575a;
    public int f8576b;
    public final Object f8577c;
    public final Object d;
    public final Object f8578e;

    public u(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.f8578e = rVar;
        this.f8577c = pVar;
        this.d = cVarArr;
        this.f8575a = z10;
        this.f8576b = i10;
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f8574f == null) {
                    f8574f = new u(context);
                }
                uVar = f8574f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public int b() {
        int i10;
        synchronized (this.f8578e) {
            i10 = this.f8576b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            t tVar = (t) it.next();
            if (tVar.f8571a.get() == null) {
                copyOnWriteArrayList.remove(tVar);
            }
        }
        synchronized (this.f8578e) {
            try {
                if (this.f8575a && this.f8576b == i10) {
                    return;
                }
                this.f8575a = true;
                this.f8576b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    t tVar2 = (t) it2.next();
                    tVar2.f8572b.execute(new rc(tVar2, 5));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public u(Context context) {
        Executor g10 = a.g();
        this.f8577c = g10;
        this.d = new CopyOnWriteArrayList();
        this.f8578e = new Object();
        this.f8576b = 0;
        g10.execute(new y8(12, this, context));
    }
}
