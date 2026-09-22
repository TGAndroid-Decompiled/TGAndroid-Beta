package a9;

import com.google.android.gms.internal.play_billing.s1;
import j$.util.Objects;
public final class m extends k {
    public static final m d = new m(new Object[0]);
    public final transient Object[] f342c;

    public m(Object[] objArr) {
        this.f342c = objArr;
    }

    @Override
    public final Object get(int i10) {
        s1.a(i10, 0);
        Object obj = this.f342c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int i(Object[] objArr) {
        System.arraycopy(this.f342c, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final Object[] p() {
        return this.f342c;
    }

    @Override
    public final int size() {
        return 0;
    }
}
