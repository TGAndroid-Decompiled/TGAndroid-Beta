package ae;
public final class y extends kotlin.jvm.internal.j implements sd.p {
    public static final y f520c = new y(2, 0);
    public static final y d = new y(2, 1);
    public final int f521b;

    public y(int i10, int i11) {
        super(i10);
        this.f521b = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f521b) {
            case 0:
                return ((jd.h) obj).plus((jd.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                jd.f fVar = (jd.f) obj2;
                return bool;
            default:
                return ((jd.h) obj).plus((jd.f) obj2);
        }
    }
}
