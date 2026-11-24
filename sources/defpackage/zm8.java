package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public final class zm8 {
    public final Context a;
    public final zeb b;
    public final int c;
    public final zeb d;
    public final zeb e;
    public boolean f;

    public zm8(Context context, wac wacVar) {
        context.getClass();
        wacVar.getClass();
        this.a = context;
        this.b = new zeb(new pr4(this) {
            public final zm8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                byte b = r2;
                zm8 zm8Var = this.b;
                switch (b) {
                    case 0:
                        return ((bn8) zm8Var.e.getValue()).a;
                    default:
                        return s4.f(zm8Var.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new zeb(new yq2(wacVar, (byte) 2));
        this.e = new zeb(new pr4(this) {
            public final zm8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                byte b = r2;
                zm8 zm8Var = this.b;
                switch (b) {
                    case 0:
                        return ((bn8) zm8Var.e.getValue()).a;
                    default:
                        return s4.f(zm8Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        zeb zebVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new xm8(Process.myPid(), (String) zebVar.getValue()));
            int size = linkedHashMap.size();
            if (size != 0) {
                if (size != 1) {
                    return new LinkedHashMap(linkedHashMap);
                }
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                singletonMap.getClass();
                return singletonMap;
            }
            return o34.a;
        }
        Map singletonMap2 = Collections.singletonMap(a(), new xm8(Process.myPid(), (String) zebVar.getValue()));
        singletonMap2.getClass();
        return singletonMap2;
    }
}
