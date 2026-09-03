package la;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import k7.p7;
public final class u extends wc.i implements dd.p {
    public final int f11932a;
    public int f11933b;
    public final Object f11934c;

    public u(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.f11932a = i10;
        this.f11934c = obj;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f11932a) {
            case 0:
                return new u((z) this.f11934c, cVar, 0);
            default:
                return new u((String) this.f11934c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        ld.c0 c0Var = (ld.c0) obj;
        uc.c cVar = (uc.c) obj2;
        switch (this.f11932a) {
            case 0:
                return ((u) create(c0Var, cVar)).invokeSuspend(sc.i.f44318a);
            default:
                return ((u) create(c0Var, cVar)).invokeSuspend(sc.i.f44318a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f11932a) {
            case 0:
                vc.a aVar = vc.a.f45727a;
                int i10 = this.f11933b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    p7.b(obj);
                    z zVar = (z) this.f11934c;
                    f7.b bVar = zVar.d;
                    t tVar = new t(zVar, 0);
                    this.f11933b = 1;
                    if (bVar.z(tVar, this) == aVar) {
                        return aVar;
                    }
                }
                return sc.i.f44318a;
            default:
                vc.a aVar2 = vc.a.f45727a;
                int i11 = this.f11933b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    p7.b(obj);
                    ma.c cVar = ma.c.f13878a;
                    this.f11933b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f11934c;
                for (i9.k kVar : ((Map) obj).values()) {
                    ma.e eVar = new ma.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    i9.j jVar = kVar.f7375b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.f7373c, str)) {
                            i9.j.a(jVar.f7371a, jVar.f7372b, str);
                            jVar.f7373c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ma.d.f13880a + " of new session " + str);
                }
                return sc.i.f44318a;
        }
    }
}
