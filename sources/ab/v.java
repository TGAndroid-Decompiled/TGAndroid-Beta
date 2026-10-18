package ab;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import v7.i8;
public final class v extends md.i implements td.p {
    public final int f469a;
    public int f470b;
    public final Object f471c;

    public v(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.f469a = i10;
        this.f471c = obj;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f469a) {
            case 0:
                return new v((c0) this.f471c, cVar, 0);
            default:
                return new v((String) this.f471c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        be.c0 c0Var = (be.c0) obj;
        kd.c cVar = (kd.c) obj2;
        switch (this.f469a) {
            case 0:
                return ((v) create(c0Var, cVar)).invokeSuspend(id.i.f12777a);
            default:
                return ((v) create(c0Var, cVar)).invokeSuspend(id.i.f12777a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f469a) {
            case 0:
                ld.a aVar = ld.a.f16000a;
                int i10 = this.f470b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        i8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i8.b(obj);
                    c0 c0Var = (c0) this.f471c;
                    n4.s sVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.f470b = 1;
                    if (sVar.p(uVar, this) == aVar) {
                        return aVar;
                    }
                }
                return id.i.f12777a;
            default:
                ld.a aVar2 = ld.a.f16000a;
                int i11 = this.f470b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i8.b(obj);
                    bb.c cVar = bb.c.f4240a;
                    this.f470b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f471c;
                for (x9.j jVar : ((Map) obj).values()) {
                    bb.e eVar = new bb.e(str);
                    jVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    x9.i iVar = jVar.f49729b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f49727c, str)) {
                            x9.i.a(iVar.f49725a, iVar.f49726b, str);
                            iVar.f49727c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + bb.d.f4242a + " of new session " + str);
                }
                return id.i.f12777a;
        }
    }
}
