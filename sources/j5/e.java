package j5;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Arrays;
import z5.l;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new i4.g(12);
    public final d f10880a;
    public final a f10881b;
    public final String f10882c;
    public final boolean d;
    public final int f10883e;
    public final c f10884f;
    public final b h;
    public final boolean f10885n;

    public e(d dVar, a aVar, String str, boolean z10, int i10, c cVar, b bVar, boolean z11) {
        l.h(dVar);
        this.f10880a = dVar;
        l.h(aVar);
        this.f10881b = aVar;
        this.f10882c = str;
        this.d = z10;
        this.f10883e = i10;
        this.f10884f = cVar == null ? new c(false, null, null) : cVar;
        this.h = bVar == null ? new b(null, false) : bVar;
        this.f10885n = z11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!l.l(this.f10880a, eVar.f10880a) || !l.l(this.f10881b, eVar.f10881b) || !l.l(this.f10884f, eVar.f10884f) || !l.l(this.h, eVar.h) || !l.l(this.f10882c, eVar.f10882c) || this.d != eVar.d || this.f10883e != eVar.f10883e || this.f10885n != eVar.f10885n) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10880a, this.f10881b, this.f10884f, this.h, this.f10882c, Boolean.valueOf(this.d), Integer.valueOf(this.f10883e), Boolean.valueOf(this.f10885n)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 1, this.f10880a, i10);
        o.k(parcel, 2, this.f10881b, i10);
        o.l(parcel, 3, this.f10882c);
        o.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        o.s(parcel, 5, 4);
        parcel.writeInt(this.f10883e);
        o.k(parcel, 6, this.f10884f, i10);
        o.k(parcel, 7, this.h, i10);
        o.s(parcel, 8, 4);
        parcel.writeInt(this.f10885n ? 1 : 0);
        o.r(parcel, q6);
    }
}
