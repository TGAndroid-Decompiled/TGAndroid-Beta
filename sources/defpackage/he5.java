package defpackage;

import java.util.LinkedHashMap;
public final class he5 implements xp3 {
    public final byte a;
    public final Object b;
    public final Object c;

    public he5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((ie5) this.b).c.removeCallbacks((oqb) this.c);
                return;
            default:
                String str = (String) this.b;
                wi7 wi7Var = (wi7) this.c;
                synchronized (xi7.b) {
                    LinkedHashMap linkedHashMap = xi7.c;
                    xi7 xi7Var = (xi7) linkedHashMap.get(str);
                    if (xi7Var != null) {
                        xi7Var.a.remove(wi7Var);
                        if (xi7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            xi7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
