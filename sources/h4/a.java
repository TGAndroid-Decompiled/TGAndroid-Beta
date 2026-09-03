package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import h5.w;
import j3.d1;
import j3.n0;
import java.util.Arrays;
import r8.d;
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new o(4);
    public final int f7208a;
    public final String f7209b;
    public final String f7210c;
    public final int d;
    public final int f7211e;
    public final int f7212f;
    public final int h;
    public final byte[] f7213n;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f7208a = i10;
        this.f7209b = str;
        this.f7210c = str2;
        this.d = i11;
        this.f7211e = i12;
        this.f7212f = i13;
        this.h = i14;
        this.f7213n = bArr;
    }

    public static a a(w wVar) {
        int g10 = wVar.g();
        String s6 = wVar.s(wVar.g(), d.f46767a);
        String s9 = wVar.s(wVar.g(), d.f46769c);
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
        d1Var.a(this.f7208a, this.f7213n);
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
            if (this.f7208a == aVar.f7208a && this.f7209b.equals(aVar.f7209b) && this.f7210c.equals(aVar.f7210c) && this.d == aVar.d && this.f7211e == aVar.f7211e && this.f7212f == aVar.f7212f && this.h == aVar.h && Arrays.equals(this.f7213n, aVar.f7213n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7213n) + ((((((((l.d.e(l.d.e((527 + this.f7208a) * 31, 31, this.f7209b), 31, this.f7210c) + this.d) * 31) + this.f7211e) * 31) + this.f7212f) * 31) + this.h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f7209b + ", description=" + this.f7210c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7208a);
        parcel.writeString(this.f7209b);
        parcel.writeString(this.f7210c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f7211e);
        parcel.writeInt(this.f7212f);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.f7213n);
    }

    public a(Parcel parcel) {
        this.f7208a = parcel.readInt();
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f7209b = readString;
        this.f7210c = parcel.readString();
        this.d = parcel.readInt();
        this.f7211e = parcel.readInt();
        this.f7212f = parcel.readInt();
        this.h = parcel.readInt();
        this.f7213n = parcel.createByteArray();
    }
}
