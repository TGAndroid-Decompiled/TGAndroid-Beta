package defpackage;

import java.util.LinkedHashMap;
public final class ke5 implements ep3 {
    public final byte a;
    public final Object b;
    public final Object c;

    public ke5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((le5) this.b).c.removeCallbacks((nsb) this.c);
                return;
            default:
                String str = (String) this.b;
                cj7 cj7Var = (cj7) this.c;
                synchronized (dj7.b) {
                    LinkedHashMap linkedHashMap = dj7.c;
                    dj7 dj7Var = (dj7) linkedHashMap.get(str);
                    if (dj7Var != null) {
                        dj7Var.a.remove(cj7Var);
                        if (dj7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            dj7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
