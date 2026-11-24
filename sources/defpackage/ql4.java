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
public final class ql4 implements kw3 {
    public final Context a;
    public final pl4 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public afe h;

    public ql4(Context context, pl4 pl4Var) {
        kre.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = pl4Var;
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
    public final void b(afe afeVar) {
        synchronized (this.c) {
            this.h = afeVar;
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
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new sq2("emojiCompat", (byte) 0));
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                this.f = threadPoolExecutor2;
                this.e = threadPoolExecutor2;
                threadPoolExecutor = threadPoolExecutor2;
            }
            threadPoolExecutor.execute(new s54(this, (byte) 23));
        }
    }

    public final bm4 d() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            am4 a = ol4.a(context, DesugarCollections.unmodifiableList(arrayList));
            boolean z = a.c;
            if (!z) {
                bm4[] bm4VarArr = (bm4[]) a.b.get(0);
                if (bm4VarArr != null && bm4VarArr.length != 0) {
                    return bm4VarArr[0];
                }
                wn4.j("fetchFonts failed (empty result)");
                return null;
            }
            wn4.j(tb4.n(z ? 1 : 0, "fetchFonts failed (", ")"));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            fyb.j("provider not found", e);
            return null;
        }
    }
}
