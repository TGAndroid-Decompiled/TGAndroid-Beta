package ia;

import android.util.Log;
import h7.k6;
import j$.util.Objects;
import java.util.Collection;
import java.util.Map;

public final class w extends tc.i implements ad.p {

    public final int f11085a;

    public int f11086b;

    public final Object f11087c;

    public w(Object obj, rc.c cVar, int i10) {
        super(2, cVar);
        this.f11085a = i10;
        this.f11087c = obj;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.f11085a) {
            case 0:
                return new w((d0) this.f11087c, cVar, 0);
            default:
                return new w((String) this.f11087c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        id.c0 c0Var = (id.c0) obj;
        rc.c cVar = (rc.c) obj2;
        switch (this.f11085a) {
            case 0:
                break;
        }
        return ((w) create(c0Var, cVar)).invokeSuspend(pc.i.f45696a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f11085a) {
            case 0:
                sc.a aVar = sc.a.f47847a;
                int i10 = this.f11086b;
                if (i10 == 0) {
                    k6.b(obj);
                    d0 d0Var = (d0) this.f11087c;
                    g5.b bVar = d0Var.d;
                    v vVar = new v(d0Var, 0);
                    this.f11086b = 1;
                    if (bVar.q(vVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                return pc.i.f45696a;
            default:
                sc.a aVar2 = sc.a.f47847a;
                int i11 = this.f11086b;
                if (i11 == 0) {
                    k6.b(obj);
                    ja.c cVar = ja.c.f12874a;
                    this.f11086b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                }
                Collection<f9.k> collectionValues = ((Map) obj).values();
                String str = (String) this.f11087c;
                for (f9.k kVar : collectionValues) {
                    ja.e eVar = new ja.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    f9.j jVar = kVar.f5944b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.f5942c, str)) {
                            f9.j.a(jVar.f5940a, jVar.f5941b, str);
                            jVar.f5942c = str;
                        }
                        break;
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ja.d.f12876a + " of new session " + str);
                }
                return pc.i.f45696a;
        }
    }
}
