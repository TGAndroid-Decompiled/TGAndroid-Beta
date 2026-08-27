package h5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import y5.l;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new f4.e(29);

    public final d f8273a;

    public final a f8274b;

    public final String f8275c;
    public final boolean d;

    public final int f8276e;

    public final c f8277f;
    public final b h;

    public final boolean f8278n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f8273a = dVar;
        l.h(aVar);
        this.f8274b = aVar;
        this.f8275c = str;
        this.d = z10;
        this.f8276e = i10;
        this.f8277f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f8278n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.l(this.f8273a, eVar.f8273a) && l.l(this.f8274b, eVar.f8274b) && l.l(this.f8277f, eVar.f8277f) && l.l(this.h, eVar.h) && l.l(this.f8275c, eVar.f8275c) && this.d == eVar.d && this.f8276e == eVar.f8276e && this.f8278n == eVar.f8278n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8273a, this.f8274b, this.f8277f, this.h, this.f8275c, Boolean.valueOf(this.d), Integer.valueOf(this.f8276e), Boolean.valueOf(this.f8278n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f8273a, i10);
        r8.k(parcel, 2, this.f8274b, i10);
        r8.l(parcel, 3, this.f8275c);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.f8276e);
        r8.k(parcel, 6, this.f8277f, i10);
        r8.k(parcel, 7, this.h, i10);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.f8278n ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
