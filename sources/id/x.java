package id;

public final class x extends kotlin.jvm.internal.k implements ad.p {

    public static final x f11210c;
    public static final x d;

    public final int f11211b;

    static {
        int i10 = 2;
        f11210c = new x(i10, 0);
        d = new x(i10, 1);
    }

    public x(int i10, int i11) {
        super(i10);
        this.f11211b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11211b) {
            case 0:
                return ((rc.h) obj).plus((rc.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((rc.h) obj).plus((rc.f) obj2);
        }
    }
}
