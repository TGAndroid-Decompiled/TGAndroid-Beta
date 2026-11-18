package gb;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
public final class d0 {
    public final Context f13314a;
    public final gd.i f13315b;
    public final int f13316c;
    public final gd.i d;
    public final gd.i f13317e;
    public boolean f13318f;

    public d0(Context appContext, i1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13314a = appContext;
        this.f13315b = b5.a.c(new rd.a(this) {
            public final d0 f13303b;

            {
                this.f13303b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((e0) this.f13303b.f13317e.getValue()).f13331a;
                    default:
                        return f0.b(this.f13303b.f13314a);
                }
            }
        });
        this.f13316c = Process.myPid();
        this.d = b5.a.c(new androidx.activity.d(uuidGenerator, 1));
        this.f13317e = b5.a.c(new rd.a(this) {
            public final d0 f13303b;

            {
                this.f13303b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((e0) this.f13303b.f13317e.getValue()).f13331a;
                    default:
                        return f0.b(this.f13303b.f13314a);
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
            linkedHashMap.put(a(), new b0(Process.myPid(), (String) iVar.getValue()));
            int size = linkedHashMap.size();
            if (size != 0) {
                if (size != 1) {
                    return new LinkedHashMap(linkedHashMap);
                }
                return hd.r.g(linkedHashMap);
            }
            return hd.o.f14146a;
        }
        return hd.r.c(new gd.e(a(), new b0(Process.myPid(), (String) iVar.getValue())));
    }
}
