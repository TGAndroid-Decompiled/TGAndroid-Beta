package gb;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
public final class e0 {
    public final Context f13314a;
    public final gd.i f13315b;
    public final int f13316c;
    public final gd.i d;
    public final gd.i f13317e;
    public boolean f13318f;

    public e0(Context appContext, j1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13314a = appContext;
        this.f13315b = b7.h.b(new rd.a(this) {
            public final e0 f13306b;

            {
                this.f13306b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((f0) this.f13306b.f13317e.getValue()).f13332a;
                    default:
                        return g0.b(this.f13306b.f13314a);
                }
            }
        });
        this.f13316c = Process.myPid();
        this.d = b7.h.b(new androidx.activity.d(uuidGenerator, 1));
        this.f13317e = b7.h.b(new rd.a(this) {
            public final e0 f13306b;

            {
                this.f13306b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((f0) this.f13306b.f13317e.getValue()).f13332a;
                    default:
                        return g0.b(this.f13306b.f13314a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f13315b.getValue();
    }

    public final Map b(Map map) {
        gd.i iVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new c0(Process.myPid(), (String) iVar.getValue()));
            int size = linkedHashMap.size();
            if (size != 0) {
                if (size != 1) {
                    return new LinkedHashMap(linkedHashMap);
                }
                return hd.r.g(linkedHashMap);
            }
            return hd.o.f14141a;
        }
        return hd.r.c(new gd.e(a(), new c0(Process.myPid(), (String) iVar.getValue())));
    }
}
