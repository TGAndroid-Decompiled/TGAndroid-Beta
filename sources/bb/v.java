package bb;

import android.util.Log;
import j$.util.Objects;
import java.util.Map;
public final class v extends ed.j implements ld.p {
    public final int f2625a;
    public int f2626b;
    public final Object f2627c;

    public v(Object obj, cd.c cVar, int i10) {
        super(2, cVar);
        this.f2625a = i10;
        this.f2627c = obj;
    }

    @Override
    public final cd.c create(Object obj, cd.c cVar) {
        switch (this.f2625a) {
            case 0:
                return new v((c0) this.f2627c, cVar, 0);
            default:
                return new v((String) this.f2627c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        td.c0 c0Var = (td.c0) obj;
        cd.c cVar = (cd.c) obj2;
        switch (this.f2625a) {
            case 0:
                return ((v) create(c0Var, cVar)).invokeSuspend(ad.j.f401a);
            default:
                return ((v) create(c0Var, cVar)).invokeSuspend(ad.j.f401a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f2625a) {
            case 0:
                dd.a aVar = dd.a.f5864a;
                int i10 = this.f2626b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        l9.b.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l9.b.b(obj);
                    c0 c0Var = (c0) this.f2627c;
                    hf.b bVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.f2626b = 1;
                    if (bVar.p(uVar, this) == aVar) {
                        return aVar;
                    }
                }
                return ad.j.f401a;
            default:
                dd.a aVar2 = dd.a.f5864a;
                int i11 = this.f2626b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        l9.b.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l9.b.b(obj);
                    cb.c cVar = cb.c.f4095a;
                    this.f2626b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f2627c;
                for (x9.j jVar : ((Map) obj).values()) {
                    cb.e eVar = new cb.e(str);
                    jVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    x9.i iVar = jVar.f53476b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f53474c, str)) {
                            x9.i.a(iVar.f53472a, iVar.f53473b, str);
                            iVar.f53474c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + cb.d.f4097a + " of new session " + str);
                }
                return ad.j.f401a;
        }
    }
}
