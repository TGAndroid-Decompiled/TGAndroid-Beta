package defpackage;
public final class qn2 implements fs4 {
    public final byte a;

    public qn2(byte b) {
        this.a = b;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        rn2 rn2Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                ay2 ay2Var = (ay2) obj2;
                str.getClass();
                ay2Var.getClass();
                if (str.length() == 0) {
                    return ay2Var.toString();
                }
                return str + ", " + ay2Var;
            case 1:
                cy2 cy2Var = (cy2) obj;
                ay2 ay2Var2 = (ay2) obj2;
                cy2Var.getClass();
                ay2Var2.getClass();
                cy2 minusKey = cy2Var.minusKey(ay2Var2.getKey());
                k34 k34Var = k34.a;
                if (minusKey != k34Var) {
                    jk2 jk2Var = jk2.b;
                    fy2 fy2Var = (fy2) minusKey.get(jk2Var);
                    if (fy2Var == null) {
                        rn2Var = new rn2(ay2Var2, minusKey);
                    } else {
                        cy2 minusKey2 = minusKey.minusKey(jk2Var);
                        if (minusKey2 == k34Var) {
                            return new rn2(fy2Var, ay2Var2);
                        }
                        rn2Var = new rn2(fy2Var, new rn2(ay2Var2, minusKey2));
                    }
                    return rn2Var;
                }
                return ay2Var2;
            case 2:
                ay2 ay2Var3 = (ay2) obj2;
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 3:
                return ((cy2) obj).plus((ay2) obj2);
            case 4:
                return ((cy2) obj).plus((ay2) obj2);
            case 5:
                ay2 ay2Var4 = (ay2) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                ay2 ay2Var5 = (ay2) obj2;
                return obj;
            case 7:
                if (obj == null) {
                    ay2 ay2Var6 = (ay2) obj2;
                    return null;
                }
                rjb.p();
                return null;
            default:
                ay2 ay2Var7 = (ay2) obj2;
                return (gpb) obj;
        }
    }
}
