package ld;
public final class x extends kotlin.jvm.internal.k implements dd.p {
    public static final x f12046c = new x(2, 0);
    public static final x d = new x(2, 1);
    public final int f12047b;

    public x(int i10, int i11) {
        super(i10);
        this.f12047b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12047b) {
            case 0:
                return ((uc.h) obj).plus((uc.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                uc.f fVar = (uc.f) obj2;
                return bool;
            default:
                return ((uc.h) obj).plus((uc.f) obj2);
        }
    }
}
