package be;
public final class x extends kotlin.jvm.internal.j implements td.p {
    public static final x f2725c = new x(2, 0);
    public static final x d = new x(2, 1);
    public final int f2726b;

    public x(int i10, int i11) {
        super(i10);
        this.f2726b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2726b) {
            case 0:
                return ((kd.h) obj).plus((kd.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                kd.f fVar = (kd.f) obj2;
                return bool;
            default:
                return ((kd.h) obj).plus((kd.f) obj2);
        }
    }
}
