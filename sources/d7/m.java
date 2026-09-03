package d7;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import java.util.Locale;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new b9.e(14);
    public final f f4230a;
    public final long f4231b;
    public final int f4232c;
    public final String d;
    public final e e;
    public final boolean f4233f;
    public final int h;
    public final int f4234n;
    public final String f4235r;

    public m(f fVar, long j10, int i10, String str, e eVar, boolean z4, int i11, int i12, String str2) {
        this.f4230a = fVar;
        this.f4231b = j10;
        this.f4232c = i10;
        this.d = str;
        this.e = eVar;
        this.f4233f = z4;
        this.h = i11;
        this.f4234n = i12;
        this.f4235r = str2;
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "UsageInfo[documentId=" + this.f4230a + ", timestamp=" + this.f4231b + ", usageType=" + this.f4232c + ", status=" + this.f4234n + "]";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.f4230a, i10);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.f4231b);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f4232c);
        f5.l(parcel, 4, this.d);
        f5.k(parcel, 5, this.e, i10);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.f4233f ? 1 : 0);
        f5.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f5.s(parcel, 8, 4);
        parcel.writeInt(this.f4234n);
        f5.l(parcel, 9, this.f4235r);
        f5.r(parcel, q10);
    }
}
