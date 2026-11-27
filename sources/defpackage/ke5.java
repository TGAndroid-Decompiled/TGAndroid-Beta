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
                dj7 dj7Var = (dj7) this.c;
                synchronized (ej7.b) {
                    LinkedHashMap linkedHashMap = ej7.c;
                    ej7 ej7Var = (ej7) linkedHashMap.get(str);
                    if (ej7Var != null) {
                        ej7Var.a.remove(dj7Var);
                        if (ej7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            ej7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
