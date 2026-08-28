package h5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import x5.l;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new h(0);
    public final d f9843a;
    public final a f9844b;
    public final String f9845c;
    public final boolean d;
    public final int f9846e;
    public final c f9847f;
    public final b h;
    public final boolean f9848n;

    public e(d dVar, a aVar, String str, boolean z10, int i9, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f9843a = dVar;
        l.h(aVar);
        this.f9844b = aVar;
        this.f9845c = str;
        this.d = z10;
        this.f9846e = i9;
        this.f9847f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f9848n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f9843a, eVar.f9843a) || !l.l(this.f9844b, eVar.f9844b) || !l.l(this.f9847f, eVar.f9847f) || !l.l(this.h, eVar.h) || !l.l(this.f9845c, eVar.f9845c) || this.d != eVar.d || this.f9846e != eVar.f9846e || this.f9848n != eVar.f9848n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9843a, this.f9844b, this.f9847f, this.h, this.f9845c, Boolean.valueOf(this.d), Integer.valueOf(this.f9846e), Boolean.valueOf(this.f9848n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.f9843a, i9);
        p8.k(parcel, 2, this.f9844b, i9);
        p8.l(parcel, 3, this.f9845c);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.f9846e);
        p8.k(parcel, 6, this.f9847f, i9);
        p8.k(parcel, 7, this.h, i9);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.f9848n ? 1 : 0);
        p8.r(parcel, q10);
    }
}
