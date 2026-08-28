package ha;

import android.util.Log;
import g7.y5;
import j$.util.Objects;
import java.util.Map;
public final class v extends sc.i implements zc.p {
    public final int f10373a;
    public int f10374b;
    public final Object f10375c;

    public v(Object obj, qc.c cVar, int i9) {
        super(2, cVar);
        this.f10373a = i9;
        this.f10375c = obj;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.f10373a) {
            case 0:
                return new v((c0) this.f10375c, cVar, 0);
            default:
                return new v((String) this.f10375c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        hd.c0 c0Var = (hd.c0) obj;
        qc.c cVar = (qc.c) obj2;
        switch (this.f10373a) {
            case 0:
                return ((v) create(c0Var, cVar)).invokeSuspend(oc.i.f19197a);
            default:
                return ((v) create(c0Var, cVar)).invokeSuspend(oc.i.f19197a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f10373a) {
            case 0:
                rc.a aVar = rc.a.f47127a;
                int i9 = this.f10374b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        y5.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    y5.b(obj);
                    c0 c0Var = (c0) this.f10375c;
                    g5.b bVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.f10374b = 1;
                    if (bVar.q(uVar, this) == aVar) {
                        return aVar;
                    }
                }
                return oc.i.f19197a;
            default:
                rc.a aVar2 = rc.a.f47127a;
                int i10 = this.f10374b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        y5.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    y5.b(obj);
                    ia.c cVar = ia.c.f11072a;
                    this.f10374b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f10375c;
                for (e9.k kVar : ((Map) obj).values()) {
                    ia.e eVar = new ia.e(str);
                    kVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    e9.j jVar = kVar.f5012b;
                    synchronized (jVar) {
                        if (!Objects.equals(jVar.f5010c, str)) {
                            e9.j.a(jVar.f5008a, jVar.f5009b, str);
                            jVar.f5010c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + ia.d.f11074a + " of new session " + str);
                }
                return oc.i.f19197a;
        }
    }
}
