package db;

import android.content.Context;
import android.os.Process;
import b8.hb;
import java.util.LinkedHashMap;
import java.util.Map;
public final class c0 {
    public final Context f8617a;
    public final dd.i f8618b;
    public final int f8619c;
    public final dd.i d;
    public final dd.i f8620e;
    public boolean f8621f;

    public c0(Context appContext, j1 uuidGenerator) {
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(uuidGenerator, "uuidGenerator");
        this.f8617a = appContext;
        this.f8618b = hb.b(new od.a(this) {
            public final c0 f8607b;

            {
                this.f8607b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((e0) this.f8607b.f8620e.getValue()).f8641a;
                    default:
                        return f0.b(this.f8607b.f8617a);
                }
            }
        });
        this.f8619c = Process.myPid();
        this.d = hb.b(new androidx.activity.d(uuidGenerator, 1));
        this.f8620e = hb.b(new od.a(this) {
            public final c0 f8607b;

            {
                this.f8607b = this;
            }

            @Override
            public final Object invoke() {
                switch (r2) {
                    case 0:
                        return ((e0) this.f8607b.f8620e.getValue()).f8641a;
                    default:
                        return f0.b(this.f8607b.f8617a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f8618b.getValue();
    }

    public final Map b(Map map) {
        dd.i iVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new a0(Process.myPid(), (String) iVar.getValue()));
            int size = linkedHashMap.size();
            if (size != 0) {
                if (size != 1) {
                    return new LinkedHashMap(linkedHashMap);
                }
                return ed.s.g(linkedHashMap);
            }
            return ed.p.f9954a;
        }
        return ed.s.c(new dd.e(a(), new a0(Process.myPid(), (String) iVar.getValue())));
    }
}
