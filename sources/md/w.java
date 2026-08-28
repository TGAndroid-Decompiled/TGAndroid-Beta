package md;

import hd.c2;
public final class w extends kotlin.jvm.internal.j implements zc.p {
    public static final w f17673c = new w(2, 0);
    public static final w d = new w(2, 1);
    public static final w f17674e = new w(2, 2);
    public final int f17675b;

    public w(int i9, int i10) {
        super(i9);
        this.f17675b = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i9;
        switch (this.f17675b) {
            case 0:
                qc.f fVar = (qc.f) obj2;
                if (fVar instanceof c2) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i9 = num.intValue();
                    } else {
                        i9 = 1;
                    }
                    if (i9 == 0) {
                        return fVar;
                    }
                    return Integer.valueOf(i9 + 1);
                }
                return obj;
            case 1:
                c2 c2Var = (c2) obj;
                qc.f fVar2 = (qc.f) obj2;
                if (c2Var == null) {
                    if (fVar2 instanceof c2) {
                        return (c2) fVar2;
                    }
                    return null;
                }
                return c2Var;
            default:
                qc.f fVar3 = (qc.f) obj2;
                return (y) obj;
        }
    }
}
