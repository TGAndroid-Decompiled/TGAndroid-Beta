package a9;

import com.google.android.gms.internal.play_billing.s1;
public final class j extends k {
    public final transient int f361c;
    public final transient int d;
    public final k f362e;

    public j(k kVar, int i10, int i11) {
        this.f362e = kVar;
        this.f361c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        s1.a(i10, this.d);
        return this.f362e.get(i10 + this.f361c);
    }

    @Override
    public final int n() {
        return this.f362e.o() + this.f361c + this.d;
    }

    @Override
    public final int o() {
        return this.f362e.o() + this.f361c;
    }

    @Override
    public final Object[] p() {
        return this.f362e.p();
    }

    @Override
    public final k subList(int i10, int i11) {
        s1.b(i10, i11, this.d);
        int i12 = this.f361c;
        return this.f362e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
