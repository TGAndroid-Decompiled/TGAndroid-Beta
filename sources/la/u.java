package la;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import k7.q7;
public final class u extends wc.i implements dd.p {
    public final int f12239a;
    public int f12240b;
    public final Object f12241c;

    public u(Object obj, uc.c cVar, int i10) {
        super(2, cVar);
        this.f12239a = i10;
        this.f12241c = obj;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.f12239a) {
            case 0:
                return new u((z) this.f12241c, cVar, 0);
            default:
                return new u((String) this.f12241c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        ld.c0 c0Var = (ld.c0) obj;
        uc.c cVar = (uc.c) obj2;
        switch (this.f12239a) {
            case 0:
                return ((u) create(c0Var, cVar)).invokeSuspend(sc.i.f47243a);
            default:
                return ((u) create(c0Var, cVar)).invokeSuspend(sc.i.f47243a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f12239a) {
            case 0:
                vc.a aVar = vc.a.f48962a;
                int i10 = this.f12240b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        q7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    q7.b(obj);
                    z zVar = (z) this.f12241c;
                    f7.b bVar = zVar.d;
                    t tVar = new t(zVar, 0);
                    this.f12240b = 1;
                    if (bVar.x(tVar, this) == aVar) {
                        return aVar;
                    }
                }
                return sc.i.f47243a;
            default:
                vc.a aVar2 = vc.a.f48962a;
                int i11 = this.f12240b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        q7.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    q7.b(obj);
                    ma.c cVar = ma.c.f13611a;
                    this.f12240b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f12241c;
                for (i9.k kVar : ((Map) obj).values()) {
                    ma.e eVar = new ma.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    i9.j jVar = kVar.f7957b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.f7955c, str)) {
                            i9.j.a(jVar.f7953a, jVar.f7954b, str);
                            jVar.f7955c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ma.d.f13613a + " of new session " + str);
                }
                return sc.i.f47243a;
        }
    }
}
