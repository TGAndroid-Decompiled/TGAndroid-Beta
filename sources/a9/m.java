package a9;

import com.google.android.gms.internal.play_billing.s1;
import j$.util.Objects;
public final class m extends k {
    public static final m d = new m(new Object[0]);
    public final transient Object[] f347c;

    public m(Object[] objArr) {
        this.f347c = objArr;
    }

    @Override
    public final Object get(int i10) {
        s1.a(i10, 0);
        Object obj = this.f347c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        System.arraycopy(this.f347c, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final Object[] o() {
        return this.f347c;
    }

    @Override
    public final int size() {
        return 0;
    }
}
