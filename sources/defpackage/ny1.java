package defpackage;

import java.util.HashMap;
public final class ny1 extends HashMap {
    public final byte a;
    public final Object b;

    public ny1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                byte b = ((qy1) this.b).w;
                oy8 oy8Var = (oy8) super.get(obj);
                if (oy8Var == null) {
                    py1 py1Var = (py1) obj;
                    oy8 oy8Var2 = new oy8(py1Var.c, gl.L(b), gl.L(b));
                    put(py1Var, oy8Var2);
                    return oy8Var2;
                }
                return oy8Var;
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
                HashMap hashMap = ((ci7) this.b).f;
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
