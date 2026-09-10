package a9;

import com.google.android.gms.internal.play_billing.s1;
public final class j extends k {
    public final transient int f334c;
    public final transient int d;
    public final k e;

    public j(k kVar, int i10, int i11) {
        this.e = kVar;
        this.f334c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        s1.a(i10, this.d);
        return this.e.get(i10 + this.f334c);
    }

    @Override
    public final int n() {
        return this.e.o() + this.f334c + this.d;
    }

    @Override
    public final int o() {
        return this.e.o() + this.f334c;
    }

    @Override
    public final Object[] p() {
        return this.e.p();
    }

    @Override
    public final k subList(int i10, int i11) {
        s1.b(i10, i11, this.d);
        int i12 = this.f334c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
