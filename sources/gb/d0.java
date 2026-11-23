package gb;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
public final class d0 {
    public final Context f13309a;
    public final gd.i f13310b;
    public final int f13311c;
    public final gd.i d;
    public final gd.i f13312e;
    public boolean f13313f;

    public d0(Context appContext, i1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13309a = appContext;
        this.f13310b = b7.h.b(new rd.a(this) {
            public final d0 f13298b;

            {
                this.f13298b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((e0) this.f13298b.f13312e.getValue()).f13326a;
                    default:
                        return f0.b(this.f13298b.f13309a);
                }
            }
        });
        this.f13311c = Process.myPid();
        this.d = b7.h.b(new androidx.activity.d(uuidGenerator, 1));
        this.f13312e = b7.h.b(new rd.a(this) {
            public final d0 f13298b;

            {
                this.f13298b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((e0) this.f13298b.f13312e.getValue()).f13326a;
                    default:
                        return f0.b(this.f13298b.f13309a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f13310b.getValue();
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
            return hd.o.f14141a;
        }
        return hd.r.c(new gd.e(a(), new b0(Process.myPid(), (String) iVar.getValue())));
    }
}
