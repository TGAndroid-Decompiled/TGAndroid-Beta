package gb;

import a8.ab;
import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
public final class d0 {
    public final Context f13651a;
    public final gd.i f13652b;
    public final int f13653c;
    public final gd.i d;
    public final gd.i f13654e;
    public boolean f13655f;

    public d0(Context appContext, k1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13651a = appContext;
        this.f13652b = ab.b(new rd.a(this) {
            public final d0 f13641b;

            {
                this.f13641b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((f0) this.f13641b.f13654e.getValue()).f13673a;
                    default:
                        return g0.b(this.f13641b.f13651a);
                }
            }
        });
        this.f13653c = Process.myPid();
        this.d = ab.b(new androidx.activity.d(uuidGenerator, 1));
        this.f13654e = ab.b(new rd.a(this) {
            public final d0 f13641b;

            {
                this.f13641b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((f0) this.f13641b.f13654e.getValue()).f13673a;
                    default:
                        return g0.b(this.f13641b.f13651a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f13652b.getValue();
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
            return hd.o.f14475a;
        }
        return hd.r.c(new gd.e(a(), new b0(Process.myPid(), (String) iVar.getValue())));
    }
}
