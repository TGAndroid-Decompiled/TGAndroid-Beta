package fe;

import ae.d2;
public final class w extends kotlin.jvm.internal.j implements sd.p {
    public static final w f9918c = new w(2, 0);
    public static final w d = new w(2, 1);
    public static final w f9919e = new w(2, 2);
    public final int f9920b;

    public w(int i10, int i11) {
        super(i10);
        this.f9920b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i10;
        switch (this.f9920b) {
            case 0:
                jd.f fVar = (jd.f) obj2;
                if (fVar instanceof d2) {
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
                d2 d2Var = (d2) obj;
                jd.f fVar2 = (jd.f) obj2;
                if (d2Var == null) {
                    if (fVar2 instanceof d2) {
                        return (d2) fVar2;
                    }
                    return null;
                }
                return d2Var;
            default:
                jd.f fVar3 = (jd.f) obj2;
                return (y) obj;
        }
    }
}
