package k7;

public final class r extends com.google.android.gms.internal.cast.i0 {

    public final transient Object[] f14929e;

    public r(Object[] objArr) {
        super(6);
        this.f14929e = objArr;
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f14929e;
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
