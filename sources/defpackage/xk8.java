package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
public final class xk8 {
    public final Context a;
    public final ycb b;
    public final int c;
    public final ycb d;
    public final ycb e;
    public boolean f;

    public xk8(Context context, v8c v8cVar) {
        context.getClass();
        v8cVar.getClass();
        this.a = context;
        this.b = new ycb(new op4(this) {
            public final xk8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                byte b = r2;
                xk8 xk8Var = this.b;
                switch (b) {
                    case 0:
                        return ((zk8) xk8Var.e.getValue()).a;
                    default:
                        return s4.f(xk8Var.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new ycb(new np2(v8cVar, (byte) 2));
        this.e = new ycb(new op4(this) {
            public final xk8 b;

            {
                this.b = this;
            }

            @Override
            public final Object invoke() {
                byte b = r2;
                xk8 xk8Var = this.b;
                switch (b) {
                    case 0:
                        return ((zk8) xk8Var.e.getValue()).a;
                    default:
                        return s4.f(xk8Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        ycb ycbVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new vk8(Process.myPid(), (String) ycbVar.getValue()));
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
            return d24.a;
        }
        Map singletonMap2 = Collections.singletonMap(a(), new vk8(Process.myPid(), (String) ycbVar.getValue()));
        singletonMap2.getClass();
        return singletonMap2;
    }
}
