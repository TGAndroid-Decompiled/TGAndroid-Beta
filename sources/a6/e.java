package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import q6.m;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(1);
    public final d f285a;
    public final a f286b;
    public final String f287c;
    public final boolean d;
    public final int f288e;
    public final c f289f;
    public final b h;
    public final boolean f290n;

    public e(d dVar, a aVar, String str, boolean z10, int i7, c cVar, b bVar, boolean z11) {
        m.h(dVar);
        this.f285a = dVar;
        m.h(aVar);
        this.f286b = aVar;
        this.f287c = str;
        this.d = z10;
        this.f288e = i7;
        this.f289f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f290n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!m.l(this.f285a, eVar.f285a) || !m.l(this.f286b, eVar.f286b) || !m.l(this.f289f, eVar.f289f) || !m.l(this.h, eVar.h) || !m.l(this.f287c, eVar.f287c) || this.d != eVar.d || this.f288e != eVar.f288e || this.f290n != eVar.f290n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f285a, this.f286b, this.f289f, this.h, this.f287c, Boolean.valueOf(this.d), Integer.valueOf(this.f288e), Boolean.valueOf(this.f290n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.f285a, i7);
        bc.k(parcel, 2, this.f286b, i7);
        bc.l(parcel, 3, this.f287c);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.f288e);
        bc.k(parcel, 6, this.f289f, i7);
        bc.k(parcel, 7, this.h, i7);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.f290n ? 1 : 0);
        bc.s(parcel, r10);
    }
}
