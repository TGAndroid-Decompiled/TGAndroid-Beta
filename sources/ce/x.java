package ce;
public final class x extends kotlin.jvm.internal.j implements ud.p {
    public static final x f6277c = new x(2, 0);
    public static final x d = new x(2, 1);
    public final int f6278b;

    public x(int i10, int i11) {
        super(i10);
        this.f6278b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6278b) {
            case 0:
                return ((ld.h) obj).plus((ld.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ld.f fVar = (ld.f) obj2;
                return bool;
            default:
                return ((ld.h) obj).plus((ld.f) obj2);
        }
    }
}
