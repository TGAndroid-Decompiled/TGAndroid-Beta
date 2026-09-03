package l5;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import j7.f5;
import java.util.Arrays;
import l4.j;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new j(1);
    public final d f11455a;
    public final a f11456b;
    public final String f11457c;
    public final boolean d;
    public final int e;
    public final c f11458f;
    public final b h;
    public final boolean f11459n;

    public e(d dVar, a aVar, String str, boolean z4, int i10, c cVar, b bVar, boolean z10) {
        m.h(dVar);
        this.f11455a = dVar;
        m.h(aVar);
        this.f11456b = aVar;
        this.f11457c = str;
        this.d = z4;
        this.e = i10;
        this.f11458f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f11459n = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.l(this.f11455a, eVar.f11455a) || !m.l(this.f11456b, eVar.f11456b) || !m.l(this.f11458f, eVar.f11458f) || !m.l(this.h, eVar.h) || !m.l(this.f11457c, eVar.f11457c) || this.d != eVar.d || this.e != eVar.e || this.f11459n != eVar.f11459n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11455a, this.f11456b, this.f11458f, this.h, this.f11457c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.f11459n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f11455a, i10);
        f5.k(parcel, 2, this.f11456b, i10);
        f5.l(parcel, 3, this.f11457c);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f5.k(parcel, 6, this.f11458f, i10);
        f5.k(parcel, 7, this.h, i10);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.f11459n ? 1 : 0);
        f5.r(parcel, q10);
    }
}
