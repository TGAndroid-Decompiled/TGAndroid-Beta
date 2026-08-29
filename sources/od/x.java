package od;

import jd.b2;
public final class x extends kotlin.jvm.internal.k implements bd.p {
    public static final x f19539c = new x(2, 0);
    public static final x d = new x(2, 1);
    public static final x f19540e = new x(2, 2);
    public final int f19541b;

    public x(int i10, int i11) {
        super(i10);
        this.f19541b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i10;
        switch (this.f19541b) {
            case 0:
                sc.f fVar = (sc.f) obj2;
                if (fVar instanceof b2) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i10 = num.intValue();
                    } else {
                        i10 = 1;
                    }
                    if (i10 == 0) {
                        return fVar;
                    }
                    return Integer.valueOf(i10 + 1);
                }
                return obj;
            case 1:
                b2 b2Var = (b2) obj;
                sc.f fVar2 = (sc.f) obj2;
                if (b2Var == null) {
                    if (fVar2 instanceof b2) {
                        return (b2) fVar2;
                    }
                    return null;
                }
                return b2Var;
            default:
                sc.f fVar3 = (sc.f) obj2;
                return (z) obj;
        }
    }
}
