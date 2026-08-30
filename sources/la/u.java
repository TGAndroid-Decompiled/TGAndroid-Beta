package la;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import k7.p7;
public final class u extends wc.i implements dd.p {
    public final int f11822a;
    public int f11823b;
    public final Object f11824c;

    public u(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.f11822a = i10;
        this.f11824c = obj;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f11822a) {
            case 0:
                return new u((z) this.f11824c, cVar, 0);
            default:
                return new u((String) this.f11824c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        ld.c0 c0Var = (ld.c0) obj;
        uc.c cVar = (uc.c) obj2;
        switch (this.f11822a) {
            case 0:
                return ((u) create(c0Var, cVar)).invokeSuspend(sc.i.f44253a);
            default:
                return ((u) create(c0Var, cVar)).invokeSuspend(sc.i.f44253a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f11822a) {
            case 0:
                vc.a aVar = vc.a.f45663a;
                int i10 = this.f11823b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    p7.b(obj);
                    z zVar = (z) this.f11824c;
                    f7.b bVar = zVar.d;
                    t tVar = new t(zVar, 0);
                    this.f11823b = 1;
                    if (bVar.z(tVar, this) == aVar) {
                        return aVar;
                    }
                }
                return sc.i.f44253a;
            default:
                vc.a aVar2 = vc.a.f45663a;
                int i11 = this.f11823b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    p7.b(obj);
                    ma.c cVar = ma.c.f13894a;
                    this.f11823b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f11824c;
                for (i9.k kVar : ((Map) obj).values()) {
                    ma.e eVar = new ma.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    i9.j jVar = kVar.f7393b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.f7391c, str)) {
                            i9.j.a(jVar.f7389a, jVar.f7390b, str);
                            jVar.f7391c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ma.d.f13896a + " of new session " + str);
                }
                return sc.i.f44253a;
        }
    }
}
