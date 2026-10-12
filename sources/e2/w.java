package e2;

import android.content.Context;
import di.x6;
import di.x8;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class w {
    public static w f8405f;
    public boolean f8406a;
    public int f8407b;
    public final Object f8408c;
    public final Object d;
    public final Object e;

    public w(com.google.android.gms.common.api.internal.r rVar, com.google.android.gms.common.api.internal.p pVar, k6.c[] cVarArr, boolean z10, int i10) {
        this.e = rVar;
        this.f8408c = pVar;
        this.d = cVarArr;
        this.f8406a = z10;
        this.f8407b = i10;
    }

    public static synchronized w a(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f8405f == null) {
                    f8405f = new w(context);
                }
                wVar = f8405f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public int b() {
        int i10;
        synchronized (this.e) {
            i10 = this.f8407b;
        }
        return i10;
    }

    public void c(int i10) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f8402a.get() == null) {
                copyOnWriteArrayList.remove(vVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.f8406a && this.f8407b == i10) {
                    return;
                }
                this.f8406a = true;
                this.f8407b = i10;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    v vVar2 = (v) it2.next();
                    vVar2.f8403b.execute(new x8(vVar2, 10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public w(Context context) {
        Executor e = a.e();
        this.f8408c = e;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.f8407b = 0;
        e.execute(new x6(20, this, context));
    }
}
