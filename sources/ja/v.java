package ja;

import android.util.Log;
import i7.c7;
import j$.util.Objects;
import java.util.Map;
public final class v extends uc.i implements bd.p {
    public final int f11408a;
    public int f11409b;
    public final Object f11410c;

    public v(Object obj, sc.c cVar, int i10) {
        super(2, cVar);
        this.f11408a = i10;
        this.f11410c = obj;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        switch (this.f11408a) {
            case 0:
                return new v((c0) this.f11410c, cVar, 0);
            default:
                return new v((String) this.f11410c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        jd.c0 c0Var = (jd.c0) obj;
        sc.c cVar = (sc.c) obj2;
        switch (this.f11408a) {
            case 0:
                return ((v) create(c0Var, cVar)).invokeSuspend(qc.i.f46603a);
            default:
                return ((v) create(c0Var, cVar)).invokeSuspend(qc.i.f46603a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f11408a) {
            case 0:
                tc.a aVar = tc.a.f48210a;
                int i10 = this.f11409b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        c7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c7.b(obj);
                    c0 c0Var = (c0) this.f11410c;
                    g9.l lVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.f11409b = 1;
                    if (lVar.e(uVar, this) == aVar) {
                        return aVar;
                    }
                }
                return qc.i.f46603a;
            default:
                tc.a aVar2 = tc.a.f48210a;
                int i11 = this.f11409b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        c7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c7.b(obj);
                    ka.c cVar = ka.c.f13595a;
                    this.f11409b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f11410c;
                for (g9.k kVar : ((Map) obj).values()) {
                    ka.e eVar = new ka.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    g9.j jVar = kVar.f7166b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.f7164c, str)) {
                            g9.j.a(jVar.f7162a, jVar.f7163b, str);
                            jVar.f7164c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ka.d.f13597a + " of new session " + str);
                }
                return qc.i.f46603a;
        }
    }
}
