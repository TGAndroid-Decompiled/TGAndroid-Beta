package ge;

import be.c2;
public final class w extends kotlin.jvm.internal.j implements td.p {
    public static final w f10135c = new w(2, 0);
    public static final w d = new w(2, 1);
    public static final w e = new w(2, 2);
    public final int f10136b;

    public w(int i10, int i11) {
        super(i10);
        this.f10136b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i10;
        switch (this.f10136b) {
            case 0:
                kd.f fVar = (kd.f) obj2;
                if (fVar instanceof c2) {
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
                c2 c2Var = (c2) obj;
                kd.f fVar2 = (kd.f) obj2;
                if (c2Var == null) {
                    if (fVar2 instanceof c2) {
                        return (c2) fVar2;
                    }
                    return null;
                }
                return c2Var;
            default:
                kd.f fVar3 = (kd.f) obj2;
                return (y) obj;
        }
    }
}
