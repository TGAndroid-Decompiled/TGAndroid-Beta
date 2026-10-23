package ab;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
import v7.i8;
public final class v extends md.i implements td.p {
    public final int f468a;
    public int f469b;
    public final Object f470c;

    public v(Object obj, kd.c cVar, int i10) {
        super(2, cVar);
        this.f468a = i10;
        this.f470c = obj;
    }

    @Override
    public final kd.c create(Object obj, kd.c cVar) {
        switch (this.f468a) {
            case 0:
                return new v((c0) this.f470c, cVar, 0);
            default:
                return new v((String) this.f470c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        be.c0 c0Var = (be.c0) obj;
        kd.c cVar = (kd.c) obj2;
        switch (this.f468a) {
            case 0:
                return ((v) create(c0Var, cVar)).invokeSuspend(id.i.f12775a);
            default:
                return ((v) create(c0Var, cVar)).invokeSuspend(id.i.f12775a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f468a) {
            case 0:
                ld.a aVar = ld.a.f15999a;
                int i10 = this.f469b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        i8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i8.b(obj);
                    c0 c0Var = (c0) this.f470c;
                    n4.s sVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.f469b = 1;
                    if (sVar.l(uVar, this) == aVar) {
                        return aVar;
                    }
                }
                return id.i.f12775a;
            default:
                ld.a aVar2 = ld.a.f15999a;
                int i11 = this.f469b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i8.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i8.b(obj);
                    bb.c cVar = bb.c.f4236a;
                    this.f469b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f470c;
                for (x9.j jVar : ((Map) obj).values()) {
                    bb.e eVar = new bb.e(str);
                    jVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    x9.i iVar = jVar.f49692b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f49690c, str)) {
                            x9.i.a(iVar.f49688a, iVar.f49689b, str);
                            iVar.f49690c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + bb.d.f4238a + " of new session " + str);
                }
                return id.i.f12775a;
        }
    }
}
