package ja;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.lifecycle.k0;
import b8.cc;
import b8.tb;
import com.google.android.gms.internal.play_billing.s0;
import gi.w5;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.s;
import l1.e0;
import l1.f0;
import n1.e;
import od.l;
import p1.h;
import sd.g;
import wd.b0;
import wd.c1;
import wd.j0;
public final class d {
    public static final g[] d;
    public final String f16232a;
    public final ThreadLocal f16233b;
    public final p1.d f16234c;

    static {
        n nVar = new n(kotlin.jvm.internal.c.NO_RECEIVER, d.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s.f17362a.getClass();
        d = new g[]{nVar};
    }

    public d(Context context, String name) {
        p1.d dVar;
        j.e(context, "context");
        j.e(name, "name");
        this.f16232a = name;
        this.f16233b = new ThreadLocal();
        w5 w5Var = new w5(new l(this) {
            public final d f16225b;

            {
                this.f16225b = this;
            }

            @Override
            public final Object invoke(Object obj) {
                switch (r2) {
                    case 0:
                        l1.b ex = (l1.b) obj;
                        j.e(ex, "ex");
                        String b10 = s.a(d.class).b();
                        Log.w(b10, "CorruptionException in " + this.f16225b.f16232a + " DataStore running in process " + Process.myPid(), ex);
                        return new p1.b(true);
                    default:
                        Context it = (Context) obj;
                        j.e(it, "it");
                        String sharedPreferencesName = this.f16225b.f16232a;
                        LinkedHashSet keysToMigrate = o1.j.f20503a;
                        j.e(sharedPreferencesName, "sharedPreferencesName");
                        j.e(keysToMigrate, "keysToMigrate");
                        return tb.a(new n1.d(it, sharedPreferencesName, e.f20125a, new b(keysToMigrate, null, 2), new hd.j(3, null)));
                }
            }
        }, 12);
        l lVar = new l(this) {
            public final d f16225b;

            {
                this.f16225b = this;
            }

            @Override
            public final Object invoke(Object obj) {
                switch (r2) {
                    case 0:
                        l1.b ex = (l1.b) obj;
                        j.e(ex, "ex");
                        String b10 = s.a(d.class).b();
                        Log.w(b10, "CorruptionException in " + this.f16225b.f16232a + " DataStore running in process " + Process.myPid(), ex);
                        return new p1.b(true);
                    default:
                        Context it = (Context) obj;
                        j.e(it, "it");
                        String sharedPreferencesName = this.f16225b.f16232a;
                        LinkedHashSet keysToMigrate = o1.j.f20503a;
                        j.e(sharedPreferencesName, "sharedPreferencesName");
                        j.e(keysToMigrate, "keysToMigrate");
                        return tb.a(new n1.d(it, sharedPreferencesName, e.f20125a, new b(keysToMigrate, null, 2), new hd.j(3, null)));
                }
            }
        };
        de.e eVar = j0.f57503a;
        de.d dVar2 = de.d.f8823c;
        c1 c1Var = new c1();
        dVar2.getClass();
        be.c b10 = b0.b(cc.c(dVar2, c1Var));
        s0 s0Var = new s0(name, w5Var, lVar, b10);
        g property = d[0];
        j.e(property, "property");
        p1.d dVar3 = (p1.d) s0Var.f7509b;
        if (dVar3 == null) {
            synchronized (s0Var.f7510c) {
                try {
                    if (((p1.d) s0Var.f7509b) == null) {
                        Context applicationContext = context.getApplicationContext();
                        j.d(applicationContext, "applicationContext");
                        n1.a aVar = new n1.a(1, applicationContext, s0Var);
                        s0Var.f7509b = new p1.d(new p1.d(new l1.b0(new f0(h.f53067a, e0.f17523b, new k0(aVar, 3)), tb.a(new ae.d((List) lVar.invoke(applicationContext), (fd.c) null, 7)), w5Var, b10)));
                    }
                    dVar = (p1.d) s0Var.f7509b;
                    j.b(dVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar3 = dVar;
        }
        this.f16234c = dVar3;
    }

    public final void a(l lVar) {
        p1.b bVar = (p1.b) b0.u(new ae.d(this, lVar, null, 6));
    }

    public final Object b(p1.e key, Long l10) {
        j.e(key, "key");
        return b0.u(new ae.c(this, key, (Object) l10, (fd.c) null));
    }
}
