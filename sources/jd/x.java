package jd;
public final class x extends kotlin.jvm.internal.k implements bd.p {
    public static final x f11539c = new x(2, 0);
    public static final x d = new x(2, 1);
    public final int f11540b;

    public x(int i10, int i11) {
        super(i10);
        this.f11540b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11540b) {
            case 0:
                return ((sc.h) obj).plus((sc.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                sc.f fVar = (sc.f) obj2;
                return bool;
            default:
                return ((sc.h) obj).plus((sc.f) obj2);
        }
    }
}
