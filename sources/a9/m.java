package a9;

import com.google.android.gms.internal.play_billing.s1;
import j$.util.Objects;
public final class m extends k {
    public static final m d = new m(new Object[0]);
    public final transient Object[] f348c;

    public m(Object[] objArr) {
        this.f348c = objArr;
    }

    @Override
    public final Object get(int i10) {
        s1.a(i10, 0);
        Object obj = this.f348c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h(Object[] objArr) {
        System.arraycopy(this.f348c, 0, objArr, 0, 0);
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
        return this.f348c;
    }

    @Override
    public final int size() {
        return 0;
    }
}
