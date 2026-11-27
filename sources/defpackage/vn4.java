package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class vn4 implements fx3 {
    public final Context a;
    public final un4 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public rje h;

    public vn4(Context context, un4 un4Var) {
        ewe.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = un4Var;
    }

    public final void a() {
        synchronized (this.c) {
            this.h = null;
            Handler handler = this.d;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.d = null;
            ThreadPoolExecutor threadPoolExecutor = this.f;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.e = null;
            this.f = null;
        }
    }

    @Override
    public final void b(rje rjeVar) {
        synchronized (this.c) {
            this.h = rjeVar;
        }
        c();
    }

    public final void c() {
        synchronized (this.c) {
            if (this.h == null) {
                return;
            }
            ThreadPoolExecutor threadPoolExecutor = this.e;
            if (threadPoolExecutor == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new lr2("emojiCompat", (byte) 0));
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                this.f = threadPoolExecutor2;
                this.e = threadPoolExecutor2;
                threadPoolExecutor = threadPoolExecutor2;
            }
            threadPoolExecutor.execute(new rj4(this, (byte) 7));
        }
    }

    public final go4 d() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            fo4 a = tn4.a(context, DesugarCollections.unmodifiableList(arrayList));
            boolean z = a.c;
            if (!z) {
                go4[] go4VarArr = (go4[]) a.b.get(0);
                if (go4VarArr != null && go4VarArr.length != 0) {
                    return go4VarArr[0];
                }
                xi4.l("fetchFonts failed (empty result)");
                return null;
            }
            xi4.l(qd4.n(z ? 1 : 0, "fetchFonts failed (", ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            grb.j("provider not found", e);
            return null;
        }
    }
}
