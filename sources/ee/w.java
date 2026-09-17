package ee;

import zd.b2;
public final class w extends kotlin.jvm.internal.j implements rd.p {
    public static final w f9123c = new w(2, 0);
    public static final w d = new w(2, 1);
    public static final w f9124e = new w(2, 2);
    public final int f9125b;

    public w(int i10, int i11) {
        super(i10);
        this.f9125b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i10;
        switch (this.f9125b) {
            case 0:
                id.f fVar = (id.f) obj2;
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
                id.f fVar2 = (id.f) obj2;
                if (b2Var == null) {
                    if (fVar2 instanceof b2) {
                        return (b2) fVar2;
                    }
                    return null;
                }
                return b2Var;
            default:
                id.f fVar3 = (id.f) obj2;
                return (y) obj;
        }
    }
}
