package gb;

import a8.ab;
import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
public final class d0 {
    public final Context f13653a;
    public final gd.i f13654b;
    public final int f13655c;
    public final gd.i d;
    public final gd.i f13656e;
    public boolean f13657f;

    public d0(Context appContext, k1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13653a = appContext;
        this.f13654b = ab.b(new rd.a(this) {
            public final d0 f13643b;

            {
                this.f13643b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((f0) this.f13643b.f13656e.getValue()).f13675a;
                    default:
                        return g0.b(this.f13643b.f13653a);
                }
            }
        });
        this.f13655c = Process.myPid();
        this.d = ab.b(new androidx.activity.d(uuidGenerator, 1));
        this.f13656e = ab.b(new rd.a(this) {
            public final d0 f13643b;

            {
                this.f13643b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((f0) this.f13643b.f13656e.getValue()).f13675a;
                    default:
                        return g0.b(this.f13643b.f13653a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f13654b.getValue();
    }

    public final Map b(Map map) {
        gd.i iVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new b0(Process.myPid(), (String) iVar.getValue()));
            int size = linkedHashMap.size();
            if (size != 0) {
                if (size != 1) {
                    return new LinkedHashMap(linkedHashMap);
                }
                return hd.r.g(linkedHashMap);
            }
            return hd.o.f14477a;
        }
        return hd.r.c(new gd.e(a(), new b0(Process.myPid(), (String) iVar.getValue())));
    }
}
