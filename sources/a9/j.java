package a9;

import com.google.android.gms.internal.play_billing.s1;
public final class j extends k {
    public final transient int f349c;
    public final transient int d;
    public final k f350e;

    public j(k kVar, int i10, int i11) {
        this.f350e = kVar;
        this.f349c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        s1.a(i10, this.d);
        return this.f350e.get(i10 + this.f349c);
    }

    @Override
    public final int n() {
        return this.f350e.o() + this.f349c + this.d;
    }

    @Override
    public final int o() {
        return this.f350e.o() + this.f349c;
    }

    @Override
    public final Object[] p() {
        return this.f350e.p();
    }

    @Override
    public final k subList(int i10, int i11) {
        s1.b(i10, i11, this.d);
        int i12 = this.f349c;
        return this.f350e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
