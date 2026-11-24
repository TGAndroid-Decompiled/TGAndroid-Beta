package defpackage;

import java.util.HashMap;
public final class a02 extends HashMap {
    public final byte a;
    public final Object b;

    public a02(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                byte b = ((d02) this.b).w;
                p09 p09Var = (p09) super.get(obj);
                if (p09Var == null) {
                    c02 c02Var = (c02) obj;
                    p09 p09Var2 = new p09(c02Var.c, gm.L(b), gm.L(b));
                    put(c02Var, p09Var2);
                    return p09Var2;
                }
                return p09Var;
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
                HashMap hashMap = ((fk7) this.b).f;
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
