package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.Locale;
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new w.a(23);
    public final f f1968a;
    public final long f1969b;
    public final int f1970c;
    public final String d;
    public final e f1971e;
    public final boolean f1972f;
    public final int h;
    public final int f1973n;
    public final String f1974r;

    public m(f fVar, long j10, int i10, String str, e eVar, boolean z10, int i11, int i12, String str2) {
        this.f1968a = fVar;
        this.f1969b = j10;
        this.f1970c = i10;
        this.d = str;
        this.f1971e = eVar;
        this.f1972f = z10;
        this.h = i11;
        this.f1973n = i12;
        this.f1974r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f1968a + ", timestamp=" + this.f1969b + ", usageType=" + this.f1970c + ", status=" + this.f1973n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.k(parcel, 1, this.f1968a, i10);
        o.s(parcel, 2, 8);
        parcel.writeLong(this.f1969b);
        o.s(parcel, 3, 4);
        parcel.writeInt(this.f1970c);
        o.l(parcel, 4, this.d);
        o.k(parcel, 5, this.f1971e, i10);
        o.s(parcel, 6, 4);
        parcel.writeInt(this.f1972f ? 1 : 0);
        o.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        o.s(parcel, 8, 4);
        parcel.writeInt(this.f1973n);
        o.l(parcel, 9, this.f1974r);
        o.r(parcel, q6);
    }
}
