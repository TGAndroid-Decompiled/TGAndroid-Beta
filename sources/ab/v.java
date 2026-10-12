package ab;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import v7.i8;
public final class v extends md.i implements td.p {
    public final int f466a;
    public int f467b;
    public final Object f468c;

    public v(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.f466a = i10;
        this.f468c = obj;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f466a) {
            case 0:
                return new v((c0) this.f468c, cVar, 0);
            default:
                return new v((String) this.f468c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        be.c0 c0Var = (be.c0) obj;
        kd.c cVar = (kd.c) obj2;
        switch (this.f466a) {
            case 0:
                return ((v) create(c0Var, cVar)).invokeSuspend(id.i.f11386a);
            default:
                return ((v) create(c0Var, cVar)).invokeSuspend(id.i.f11386a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f466a) {
            case 0:
                ld.a aVar = ld.a.f14658a;
                int i10 = this.f467b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        i8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i8.b(obj);
                    c0 c0Var = (c0) this.f468c;
                    n4.s sVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.f467b = 1;
                    if (sVar.g(uVar, this) == aVar) {
                        return aVar;
                    }
                }
                return id.i.f11386a;
            default:
                ld.a aVar2 = ld.a.f14658a;
                int i11 = this.f467b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i8.b(obj);
                    bb.c cVar = bb.c.f2623a;
                    this.f467b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f468c;
                for (x9.j jVar : ((Map) obj).values()) {
                    bb.e eVar = new bb.e(str);
                    jVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    x9.i iVar = jVar.f48296b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f48294c, str)) {
                            x9.i.a(iVar.f48292a, iVar.f48293b, str);
                            iVar.f48294c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + bb.d.f2625a + " of new session " + str);
                }
                return id.i.f11386a;
        }
    }
}
