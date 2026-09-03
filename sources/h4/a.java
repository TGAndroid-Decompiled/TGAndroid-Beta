package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import h5.w;
import j3.d1;
import j3.n0;
import java.util.Arrays;
import kf.k0;
import r8.d;
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new o(4);
    public final int f6897a;
    public final String f6898b;
    public final String f6899c;
    public final int d;
    public final int e;
    public final int f6900f;
    public final int h;
    public final byte[] f6901n;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f6897a = i10;
        this.f6898b = str;
        this.f6899c = str2;
        this.d = i11;
        this.e = i12;
        this.f6900f = i13;
        this.h = i14;
        this.f6901n = bArr;
    }

    public static a a(w wVar) {
        int g10 = wVar.g();
        String s6 = wVar.s(wVar.g(), d.f43411a);
        String s9 = wVar.s(wVar.g(), d.f43413c);
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
        d1Var.a(this.f6897a, this.f6901n);
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
            if (this.f6897a == aVar.f6897a && this.f6898b.equals(aVar.f6898b) && this.f6899c.equals(aVar.f6899c) && this.d == aVar.d && this.e == aVar.e && this.f6900f == aVar.f6900f && this.h == aVar.h && Arrays.equals(this.f6901n, aVar.f6901n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6901n) + ((((((((k0.e(k0.e((527 + this.f6897a) * 31, 31, this.f6898b), 31, this.f6899c) + this.d) * 31) + this.e) * 31) + this.f6900f) * 31) + this.h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f6898b + ", description=" + this.f6899c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6897a);
        parcel.writeString(this.f6898b);
        parcel.writeString(this.f6899c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f6900f);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.f6901n);
    }

    public a(Parcel parcel) {
        this.f6897a = parcel.readInt();
        String readString = parcel.readString();
        int i10 = d0.f6924a;
        this.f6898b = readString;
        this.f6899c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f6900f = parcel.readInt();
        this.h = parcel.readInt();
        this.f6901n = parcel.createByteArray();
    }
}
