package he;

import ce.c2;
public final class x extends kotlin.jvm.internal.j implements ud.p {
    public static final x f12823c = new x(2, 0);
    public static final x d = new x(2, 1);
    public static final x e = new x(2, 2);
    public final int f12824b;

    public x(int i10, int i11) {
        super(i10);
        this.f12824b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i10;
        switch (this.f12824b) {
            case 0:
                ld.f fVar = (ld.f) obj2;
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
                ld.f fVar2 = (ld.f) obj2;
                if (c2Var == null) {
                    if (fVar2 instanceof c2) {
                        return (c2) fVar2;
                    }
                    return null;
                }
                return c2Var;
            default:
                ld.f fVar3 = (ld.f) obj2;
                return (z) obj;
        }
    }
}
