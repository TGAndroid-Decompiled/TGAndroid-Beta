package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public final class ko8 {
    public final Context a;
    public final tgb b;
    public final int c;
    public final tgb d;
    public final tgb e;
    public boolean f;

    public ko8(Context context, vcc vccVar) {
        context.getClass();
        vccVar.getClass();
        this.a = context;
        this.b = new tgb(new sr4(this) {
            public final ko8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                byte b = r2;
                ko8 ko8Var = this.b;
                switch (b) {
                    case 0:
                        return ((mo8) ko8Var.e.getValue()).a;
                    default:
                        return t4.f(ko8Var.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new tgb(new gq2(vccVar, (byte) 2));
        this.e = new tgb(new sr4(this) {
            public final ko8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                byte b = r2;
                ko8 ko8Var = this.b;
                switch (b) {
                    case 0:
                        return ((mo8) ko8Var.e.getValue()).a;
                    default:
                        return t4.f(ko8Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        tgb tgbVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new io8(Process.myPid(), (String) tgbVar.getValue()));
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
            return y24.a;
        }
        Map singletonMap2 = Collections.singletonMap(a(), new io8(Process.myPid(), (String) tgbVar.getValue()));
        singletonMap2.getClass();
        return singletonMap2;
    }
}
