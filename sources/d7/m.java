package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
import java.util.Locale;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new b9.e(14);
    public final f f4323a;
    public final long f4324b;
    public final int f4325c;
    public final String d;
    public final e f4326e;
    public final boolean f4327f;
    public final int h;
    public final int f4328n;
    public final String f4329r;

    public m(f fVar, long j10, int i10, String str, e eVar, boolean z4, int i11, int i12, String str2) {
        this.f4323a = fVar;
        this.f4324b = j10;
        this.f4325c = i10;
        this.d = str;
        this.f4326e = eVar;
        this.f4327f = z4;
        this.h = i11;
        this.f4328n = i12;
        this.f4329r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f4323a + ", timestamp=" + this.f4324b + ", usageType=" + this.f4325c + ", status=" + this.f4328n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.f4323a, i10);
        g5.s(parcel, 2, 8);
        parcel.writeLong(this.f4324b);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.f4325c);
        g5.l(parcel, 4, this.d);
        g5.k(parcel, 5, this.f4326e, i10);
        g5.s(parcel, 6, 4);
        parcel.writeInt(this.f4327f ? 1 : 0);
        g5.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        g5.s(parcel, 8, 4);
        parcel.writeInt(this.f4328n);
        g5.l(parcel, 9, this.f4329r);
        g5.r(parcel, q10);
    }
}
