package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import h5.d0;
import j3.d1;
import j3.n0;
public final class b implements e4.b {
    public static final Parcelable.Creator<b> CREATOR = new o(6);
    public final int f7226a;
    public final String f7227b;
    public final String f7228c;
    public final String d;
    public final boolean e;
    public final int f7229f;

    public b(int i10, String str, String str2, String str3, boolean z4, int i11) {
        h5.a.f(i11 == -1 || i11 > 0);
        this.f7226a = i10;
        this.f7227b = str;
        this.f7228c = str2;
        this.d = str3;
        this.e = z4;
        this.f7229f = i11;
    }

    public static i4.b a(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: i4.b.a(java.util.Map):i4.b");
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final void c(d1 d1Var) {
        String str = this.f7228c;
        if (str != null) {
            d1Var.E = str;
        }
        String str2 = this.f7227b;
        if (str2 != null) {
            d1Var.C = str2;
        }
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
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7226a == bVar.f7226a && d0.a(this.f7227b, bVar.f7227b) && d0.a(this.f7228c, bVar.f7228c) && d0.a(this.d, bVar.d) && this.e == bVar.e && this.f7229f == bVar.f7229f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f7226a) * 31;
        int i13 = 0;
        String str = this.f7227b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f7228c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return ((((i15 + i13) * 31) + (this.e ? 1 : 0)) * 31) + this.f7229f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f7228c + "\", genre=\"" + this.f7227b + "\", bitrate=" + this.f7226a + ", metadataInterval=" + this.f7229f;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7226a);
        parcel.writeString(this.f7227b);
        parcel.writeString(this.f7228c);
        parcel.writeString(this.d);
        int i11 = d0.f6924a;
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f7229f);
    }

    public b(Parcel parcel) {
        this.f7226a = parcel.readInt();
        this.f7227b = parcel.readString();
        this.f7228c = parcel.readString();
        this.d = parcel.readString();
        int i10 = d0.f6924a;
        this.e = parcel.readInt() != 0;
        this.f7229f = parcel.readInt();
    }
}
