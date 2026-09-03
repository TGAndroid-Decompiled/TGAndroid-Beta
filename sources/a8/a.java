package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new w.a(3);
    public final String f126a;
    public final byte[] f127b;
    public final int f128c;

    public a(String str, byte[] bArr, int i10) {
        this.f126a = str;
        this.f127b = bArr;
        this.f128c = i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.f126a);
        f5.c(parcel, 3, this.f127b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f128c);
        f5.r(parcel, q10);
    }
}
