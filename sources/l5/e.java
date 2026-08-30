package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.Arrays;
import l4.j;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(1);
    public final d f11345a;
    public final a f11346b;
    public final String f11347c;
    public final boolean d;
    public final int e;
    public final c f11348f;
    public final b h;
    public final boolean f11349n;

    public e(d dVar, a aVar, String str, boolean z4, int i10, c cVar, b bVar, boolean z10) {
        m.h(dVar);
        this.f11345a = dVar;
        m.h(aVar);
        this.f11346b = aVar;
        this.f11347c = str;
        this.d = z4;
        this.e = i10;
        this.f11348f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f11349n = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.l(this.f11345a, eVar.f11345a) || !m.l(this.f11346b, eVar.f11346b) || !m.l(this.f11348f, eVar.f11348f) || !m.l(this.h, eVar.h) || !m.l(this.f11347c, eVar.f11347c) || this.d != eVar.d || this.e != eVar.e || this.f11349n != eVar.f11349n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11345a, this.f11346b, this.f11348f, this.h, this.f11347c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f11349n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f11345a, i10);
        f5.k(parcel, 2, this.f11346b, i10);
        f5.l(parcel, 3, this.f11347c);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f5.k(parcel, 6, this.f11348f, i10);
        f5.k(parcel, 7, this.h, i10);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.f11349n ? 1 : 0);
        f5.r(parcel, q10);
    }
}
