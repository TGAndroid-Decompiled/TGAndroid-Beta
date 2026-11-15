package gb;

import a8.bb;
import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;
public final class d0 {
    public final Context f13000a;
    public final gd.i f13001b;
    public final int f13002c;
    public final gd.i d;
    public final gd.i f13003e;
    public boolean f13004f;

    public d0(Context appContext, i1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f13000a = appContext;
        this.f13001b = bb.b(new rd.a(this) {
            public final d0 f12989b;

            {
                this.f12989b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((e0) this.f12989b.f13003e.getValue()).f13017a;
                    default:
                        return f0.b(this.f12989b.f13000a);
                }
            }
        });
        this.f13002c = Process.myPid();
        this.d = bb.b(new androidx.activity.d(uuidGenerator, 1));
        this.f13003e = bb.b(new rd.a(this) {
            public final d0 f12989b;

            {
                this.f12989b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((e0) this.f12989b.f13003e.getValue()).f13017a;
                    default:
                        return f0.b(this.f12989b.f13000a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f13001b.getValue();
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
            return hd.o.f13832a;
        }
        return hd.r.c(new gd.e(a(), new b0(Process.myPid(), (String) iVar.getValue())));
    }
}
