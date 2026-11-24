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
public final class rn4 implements vx3 {
    public final Context a;
    public final pn4 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public bhe h;

    public rn4(Context context, pn4 pn4Var) {
        nte.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = pn4Var;
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

    public final void b() {
        synchronized (this.c) {
            if (this.h == null) {
                return;
            }
            ThreadPoolExecutor threadPoolExecutor = this.e;
            if (threadPoolExecutor == null) {
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ds2("emojiCompat", (byte) 0));
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                this.f = threadPoolExecutor2;
                this.e = threadPoolExecutor2;
                threadPoolExecutor = threadPoolExecutor2;
            }
            threadPoolExecutor.execute(new qn4(this, (byte) 0));
        }
    }

    @Override
    public final void c(bhe bheVar) {
        synchronized (this.c) {
            this.h = bheVar;
        }
        b();
    }

    public final co4 d() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            bo4 a = on4.a(context, DesugarCollections.unmodifiableList(arrayList));
            boolean z = a.c;
            if (!z) {
                co4[] co4VarArr = (co4[]) a.b.get(0);
                if (co4VarArr != null && co4VarArr.length != 0) {
                    return co4VarArr[0];
                }
                zo4.k("fetchFonts failed (empty result)");
                return null;
            }
            zo4.k(td4.o(z ? 1 : 0, "fetchFonts failed (", ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            rjb.k("provider not found", e);
            return null;
        }
    }
}
