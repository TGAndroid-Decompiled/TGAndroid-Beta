package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.g5;
import java.util.Arrays;
import l4.j;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(1);
    public final d f11721a;
    public final a f11722b;
    public final String f11723c;
    public final boolean d;
    public final int f11724e;
    public final c f11725f;
    public final b h;
    public final boolean f11726n;

    public e(d dVar, a aVar, String str, boolean z4, int i10, c cVar, b bVar, boolean z10) {
        m.h(dVar);
        this.f11721a = dVar;
        m.h(aVar);
        this.f11722b = aVar;
        this.f11723c = str;
        this.d = z4;
        this.f11724e = i10;
        this.f11725f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f11726n = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.l(this.f11721a, eVar.f11721a) || !m.l(this.f11722b, eVar.f11722b) || !m.l(this.f11725f, eVar.f11725f) || !m.l(this.h, eVar.h) || !m.l(this.f11723c, eVar.f11723c) || this.d != eVar.d || this.f11724e != eVar.f11724e || this.f11726n != eVar.f11726n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11721a, this.f11722b, this.f11725f, this.h, this.f11723c, Boolean.valueOf(this.d), Integer.valueOf(this.f11724e), Boolean.valueOf(this.f11726n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f11721a, i10);
        g5.k(parcel, 2, this.f11722b, i10);
        g5.l(parcel, 3, this.f11723c);
        g5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.f11724e);
        g5.k(parcel, 6, this.f11725f, i10);
        g5.k(parcel, 7, this.h, i10);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.f11726n ? 1 : 0);
        g5.r(parcel, q10);
    }
}
