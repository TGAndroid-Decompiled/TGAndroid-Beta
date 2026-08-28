package hd;
public final class x extends kotlin.jvm.internal.j implements zc.p {
    public static final x f10501c = new x(2, 0);
    public static final x d = new x(2, 1);
    public final int f10502b;

    public x(int i9, int i10) {
        super(i9);
        this.f10502b = i10;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10502b) {
            case 0:
                return ((qc.h) obj).plus((qc.f) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                qc.f fVar = (qc.f) obj2;
                return bool;
            default:
                return ((qc.h) obj).plus((qc.f) obj2);
        }
    }
}
