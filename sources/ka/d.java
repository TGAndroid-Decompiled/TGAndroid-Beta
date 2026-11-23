package ka;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.lifecycle.k0;
import c8.g0;
import c8.q0;
import com.google.android.gms.internal.play_billing.s0;
import j6.r;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.s;
import m1.e0;
import m1.f0;
import o1.e;
import q1.h;
import rd.l;
import vd.g;
import zd.b0;
import zd.c1;
import zd.j0;
public final class d {
    public static final g[] d;
    public final String f18298a;
    public final ThreadLocal f18299b;
    public final q1.d f18300c;

    static {
        n nVar = new n(kotlin.jvm.internal.c.NO_RECEIVER, d.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s.f19218a.getClass();
        d = new g[]{nVar};
    }

    public d(Context context, String name) {
        q1.d dVar;
        j.e(context, "context");
        j.e(name, "name");
        this.f18298a = name;
        this.f18299b = new ThreadLocal();
        r rVar = new r(new l(this) {
            public final d f18291b;

            {
                this.f18291b = this;
            }

            @Override
            public final Object invoke(Object obj) {
                switch (r2) {
                    case 0:
                        m1.b ex = (m1.b) obj;
                        j.e(ex, "ex");
                        String b10 = s.a(d.class).b();
                        Log.w(b10, "CorruptionException in " + this.f18291b.f18298a + " DataStore running in process " + Process.myPid(), ex);
                        return new q1.b(true);
                    default:
                        Context it = (Context) obj;
                        j.e(it, "it");
                        String sharedPreferencesName = this.f18291b.f18298a;
                        LinkedHashSet keysToMigrate = p1.j.f55201a;
                        j.e(sharedPreferencesName, "sharedPreferencesName");
                        j.e(keysToMigrate, "keysToMigrate");
                        return g0.a(new o1.d(it, sharedPreferencesName, e.f21684a, new b(keysToMigrate, null, 2), new kd.j(3, null)));
                }
            }
        }, 9);
        l lVar = new l(this) {
            public final d f18291b;

            {
                this.f18291b = this;
            }

            @Override
            public final Object invoke(Object obj) {
                switch (r2) {
                    case 0:
                        m1.b ex = (m1.b) obj;
                        j.e(ex, "ex");
                        String b10 = s.a(d.class).b();
                        Log.w(b10, "CorruptionException in " + this.f18291b.f18298a + " DataStore running in process " + Process.myPid(), ex);
                        return new q1.b(true);
                    default:
                        Context it = (Context) obj;
                        j.e(it, "it");
                        String sharedPreferencesName = this.f18291b.f18298a;
                        LinkedHashSet keysToMigrate = p1.j.f55201a;
                        j.e(sharedPreferencesName, "sharedPreferencesName");
                        j.e(keysToMigrate, "keysToMigrate");
                        return g0.a(new o1.d(it, sharedPreferencesName, e.f21684a, new b(keysToMigrate, null, 2), new kd.j(3, null)));
                }
            }
        };
        ge.e eVar = j0.f61986a;
        ge.d dVar2 = ge.d.f13502c;
        c1 c1Var = new c1();
        dVar2.getClass();
        ee.c b10 = b0.b(q0.c(dVar2, c1Var));
        s0 s0Var = new s0(name, rVar, lVar, b10);
        g property = d[0];
        j.e(property, "property");
        q1.d dVar3 = (q1.d) s0Var.f7118b;
        if (dVar3 == null) {
            synchronized (s0Var.f7119c) {
                try {
                    if (((q1.d) s0Var.f7118b) == null) {
                        Context applicationContext = context.getApplicationContext();
                        j.d(applicationContext, "applicationContext");
                        o1.a aVar = new o1.a(1, applicationContext, s0Var);
                        s0Var.f7118b = new q1.d(new q1.d(new m1.b0(new f0(h.f55834a, e0.f20417b, new k0(aVar, 3)), g0.a(new be.l((List) lVar.invoke(applicationContext), (id.c) null, 8)), rVar, b10)));
                    }
                    dVar = (q1.d) s0Var.f7118b;
                    j.b(dVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar3 = dVar;
        }
        this.f18300c = dVar3;
    }

    public final void a(l lVar) {
        q1.b bVar = (q1.b) b0.u(new be.l(this, lVar, null, 7));
    }

    public final Object b(q1.e key, Long l10) {
        j.e(key, "key");
        return b0.u(new de.c(this, key, (Object) l10, (id.c) null));
    }
}
