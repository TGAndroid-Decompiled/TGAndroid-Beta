package defpackage;

import java.util.HashMap;
public final class fz1 extends HashMap {
    public final byte a;
    public final Object b;

    public fz1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                byte b = ((iz1) this.b).w;
                b29 b29Var = (b29) super.get(obj);
                if (b29Var == null) {
                    hz1 hz1Var = (hz1) obj;
                    b29 b29Var2 = new b29(hz1Var.c, hl.L(b), hl.L(b));
                    put(hz1Var, b29Var2);
                    return b29Var2;
                }
                return b29Var;
            default:
                return super.get(obj);
        }
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        String lowerCase;
        switch (this.a) {
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                HashMap hashMap = ((lk7) this.b).f;
                if (str == null) {
                    lowerCase = str;
                } else {
                    lowerCase = str.toLowerCase();
                }
                hashMap.put(lowerCase, str2);
                return (String) super.put(str, str2);
            default:
                return super.put(obj, obj2);
        }
    }
}
