package defpackage;

import java.util.LinkedHashMap;
public final class jc5 implements no3 {
    public final byte a;
    public final Object b;
    public final Object c;

    public jc5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void dispose() {
        switch (this.a) {
            case 0:
                ((kc5) this.b).c.removeCallbacks((nob) this.c);
                return;
            default:
                String str = (String) this.b;
                tg7 tg7Var = (tg7) this.c;
                synchronized (ug7.b) {
                    LinkedHashMap linkedHashMap = ug7.c;
                    ug7 ug7Var = (ug7) linkedHashMap.get(str);
                    if (ug7Var != null) {
                        ug7Var.a.remove(tg7Var);
                        if (ug7Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            ug7Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
