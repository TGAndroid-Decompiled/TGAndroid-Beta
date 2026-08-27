package i7;

public final class b0 extends com.google.android.gms.internal.cast.i0 {

    public final transient Object[] f10593e;

    public b0(Object[] objArr) {
        super(5);
        this.f10593e = objArr;
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f10593e;
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override
    public final int size() {
        return 1;
    }
}
