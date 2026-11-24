package defpackage;
public final class dm2 implements eq4 {
    public final byte a;

    public dm2(byte b) {
        this.a = b;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        em2 em2Var;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                qw2 qw2Var = (qw2) obj2;
                str.getClass();
                qw2Var.getClass();
                if (str.length() == 0) {
                    return qw2Var.toString();
                }
                return str + ", " + qw2Var;
            case 1:
                sw2 sw2Var = (sw2) obj;
                qw2 qw2Var2 = (qw2) obj2;
                sw2Var.getClass();
                qw2Var2.getClass();
                sw2 minusKey = sw2Var.minusKey(qw2Var2.getKey());
                z14 z14Var = z14.a;
                if (minusKey != z14Var) {
                    vi2 vi2Var = vi2.b;
                    vw2 vw2Var = (vw2) minusKey.get(vi2Var);
                    if (vw2Var == null) {
                        em2Var = new em2(qw2Var2, minusKey);
                    } else {
                        sw2 minusKey2 = minusKey.minusKey(vi2Var);
                        if (minusKey2 == z14Var) {
                            return new em2(vw2Var, qw2Var2);
                        }
                        em2Var = new em2(vw2Var, new em2(qw2Var2, minusKey2));
                    }
                    return em2Var;
                }
                return qw2Var2;
            case 2:
                qw2 qw2Var3 = (qw2) obj2;
                return Boolean.valueOf(((Boolean) obj).booleanValue());
            case 3:
                return ((sw2) obj).plus((qw2) obj2);
            case 4:
                return ((sw2) obj).plus((qw2) obj2);
            case 5:
                qw2 qw2Var4 = (qw2) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                qw2 qw2Var5 = (qw2) obj2;
                return obj;
            case 7:
                if (obj == null) {
                    qw2 qw2Var6 = (qw2) obj2;
                    return null;
                }
                fyb.g();
                return null;
            default:
                qw2 qw2Var7 = (qw2) obj2;
                return (fnb) obj;
        }
    }
}
