package bb;

import a8.jd;
import android.util.Log;
import j$.util.Objects;
import java.util.Map;
public final class v extends nd.i implements ud.p {
    public final int f3824a;
    public int f3825b;
    public final Object f3826c;

    public v(Object obj, ld.c cVar, int i10) {
        super(2, cVar);
        this.f3824a = i10;
        this.f3826c = obj;
    }

    @Override
    public final ld.c create(Object obj, ld.c cVar) {
        switch (this.f3824a) {
            case 0:
                return new v((c0) this.f3826c, cVar, 0);
            default:
                return new v((String) this.f3826c, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        ce.c0 c0Var = (ce.c0) obj;
        ld.c cVar = (ld.c) obj2;
        switch (this.f3824a) {
            case 0:
                return ((v) create(c0Var, cVar)).invokeSuspend(jd.i.f15579a);
            default:
                return ((v) create(c0Var, cVar)).invokeSuspend(jd.i.f15579a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.f3824a) {
            case 0:
                md.a aVar = md.a.f18411a;
                int i10 = this.f3825b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        jd.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    jd.b(obj);
                    c0 c0Var = (c0) this.f3826c;
                    rf.b bVar = c0Var.d;
                    u uVar = new u(c0Var, 0);
                    this.f3825b = 1;
                    if (bVar.C(uVar, this) == aVar) {
                        return aVar;
                    }
                }
                return jd.i.f15579a;
            default:
                md.a aVar2 = md.a.f18411a;
                int i11 = this.f3825b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        jd.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    jd.b(obj);
                    cb.c cVar = cb.c.f6179a;
                    this.f3825b = 1;
                    obj = cVar.b(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                String str = (String) this.f3826c;
                for (y9.j jVar : ((Map) obj).values()) {
                    cb.e eVar = new cb.e(str);
                    jVar.getClass();
                    String str2 = "App Quality Sessions session changed: " + eVar;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    y9.i iVar = jVar.f52491b;
                    synchronized (iVar) {
                        if (!Objects.equals(iVar.f52489c, str)) {
                            y9.i.a(iVar.f52487a, iVar.f52488b, str);
                            iVar.f52489c = str;
                        }
                    }
                    Log.d("SessionLifecycleClient", "Notified " + cb.d.f6181a + " of new session " + str);
                }
                return jd.i.f15579a;
        }
    }
}
