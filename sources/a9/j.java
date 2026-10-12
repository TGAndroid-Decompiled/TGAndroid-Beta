package a9;

import com.google.android.gms.internal.play_billing.s1;
public final class j extends k {
    public final transient int f362c;
    public final transient int d;
    public final k f363e;

    public j(k kVar, int i10, int i11) {
        this.f363e = kVar;
        this.f362c = i10;
        this.d = i11;
    }

    @Override
    public final Object get(int i10) {
        s1.a(i10, this.d);
        return this.f363e.get(i10 + this.f362c);
    }

    @Override
    public final int n() {
        return this.f363e.o() + this.f362c + this.d;
    }

    @Override
    public final int o() {
        return this.f363e.o() + this.f362c;
    }

    @Override
    public final Object[] p() {
        return this.f363e.p();
    }

    @Override
    public final k subList(int i10, int i11) {
        s1.b(i10, i11, this.d);
        int i12 = this.f362c;
        return this.f363e.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.d;
    }
}
