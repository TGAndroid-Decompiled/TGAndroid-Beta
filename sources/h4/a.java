package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import h5.w;
import j3.d1;
import j3.n0;
import java.util.Arrays;
import kh.a2;
import r8.d;
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new o(4);
    public final int f6910a;
    public final String f6911b;
    public final String f6912c;
    public final int d;
    public final int e;
    public final int f6913f;
    public final int h;
    public final byte[] f6914n;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f6910a = i10;
        this.f6911b = str;
        this.f6912c = str2;
        this.d = i11;
        this.e = i12;
        this.f6913f = i13;
        this.h = i14;
        this.f6914n = bArr;
    }

    public static a a(w wVar) {
        int g10 = wVar.g();
        String s6 = wVar.s(wVar.g(), d.f43387a);
        String s9 = wVar.s(wVar.g(), d.f43389c);
        int g11 = wVar.g();
        int g12 = wVar.g();
        int g13 = wVar.g();
        int g14 = wVar.g();
        int g15 = wVar.g();
        byte[] bArr = new byte[g15];
        wVar.e(0, g15, bArr);
        return new a(g10, s6, s9, g11, g12, g13, g14, bArr);
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final void c(d1 d1Var) {
        d1Var.a(this.f6910a, this.f6914n);
    }

    @Override
    public final byte[] d() {
        return null;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f6910a == aVar.f6910a && this.f6911b.equals(aVar.f6911b) && this.f6912c.equals(aVar.f6912c) && this.d == aVar.d && this.e == aVar.e && this.f6913f == aVar.f6913f && this.h == aVar.h && Arrays.equals(this.f6914n, aVar.f6914n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6914n) + ((((((((a2.e(a2.e((527 + this.f6910a) * 31, 31, this.f6911b), 31, this.f6912c) + this.d) * 31) + this.e) * 31) + this.f6913f) * 31) + this.h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f6911b + ", description=" + this.f6912c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6910a);
        parcel.writeString(this.f6911b);
        parcel.writeString(this.f6912c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f6913f);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.f6914n);
    }

    public a(Parcel parcel) {
        this.f6910a = parcel.readInt();
        String readString = parcel.readString();
        int i10 = d0.f6937a;
        this.f6911b = readString;
        this.f6912c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f6913f = parcel.readInt();
        this.h = parcel.readInt();
        this.f6914n = parcel.createByteArray();
    }
}
