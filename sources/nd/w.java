package nd;

import id.c2;

public final class w extends kotlin.jvm.internal.k implements ad.p {

    public static final w f18509c;
    public static final w d;

    public static final w f18510e;

    public final int f18511b;

    static {
        int i10 = 2;
        f18509c = new w(i10, 0);
        d = new w(i10, 1);
        f18510e = new w(i10, 2);
    }

    public w(int i10, int i11) {
        super(i10);
        this.f18511b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18511b) {
            case 0:
                rc.f fVar = (rc.f) obj2;
                if (!(fVar instanceof c2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? fVar : Integer.valueOf(iIntValue + 1);
            case 1:
                c2 c2Var = (c2) obj;
                rc.f fVar2 = (rc.f) obj2;
                if (c2Var != null) {
                    return c2Var;
                }
                if (fVar2 instanceof c2) {
                    return (c2) fVar2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
