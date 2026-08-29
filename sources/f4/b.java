package f4;

import android.os.Parcel;
import android.os.Parcelable;
import d6.d;
import f5.d0;
import j3.g1;
import j3.t0;
public final class b implements b4.b {
    public static final Parcelable.Creator<b> CREATOR = new d(17);
    public final int f6550a;
    public final String f6551b;
    public final String f6552c;
    public final String d;
    public final boolean f6553e;
    public final int f6554f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        f5.a.f(i11 == -1 || i11 > 0);
        this.f6550a = i10;
        this.f6551b = str;
        this.f6552c = str2;
        this.d = str3;
        this.f6553e = z10;
        this.f6554f = i11;
    }

    public static f4.b a(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: f4.b.a(java.util.Map):f4.b");
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
            if (this.f6550a == bVar.f6550a && d0.a(this.f6551b, bVar.f6551b) && d0.a(this.f6552c, bVar.f6552c) && d0.a(this.d, bVar.d) && this.f6553e == bVar.f6553e && this.f6554f == bVar.f6554f) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override
    public final t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = (527 + this.f6550a) * 31;
        int i13 = 0;
        String str = this.f6551b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        String str2 = this.f6552c;
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
        return ((((i15 + i13) * 31) + (this.f6553e ? 1 : 0)) * 31) + this.f6554f;
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f6552c;
        if (str != null) {
            g1Var.E = str;
        }
        String str2 = this.f6551b;
        if (str2 != null) {
            g1Var.C = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f6552c + "\", genre=\"" + this.f6551b + "\", bitrate=" + this.f6550a + ", metadataInterval=" + this.f6554f;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6550a);
        parcel.writeString(this.f6551b);
        parcel.writeString(this.f6552c);
        parcel.writeString(this.d);
        int i11 = d0.f6579a;
        parcel.writeInt(this.f6553e ? 1 : 0);
        parcel.writeInt(this.f6554f);
    }

    public b(Parcel parcel) {
        this.f6550a = parcel.readInt();
        this.f6551b = parcel.readString();
        this.f6552c = parcel.readString();
        this.d = parcel.readString();
        int i10 = d0.f6579a;
        this.f6553e = parcel.readInt() != 0;
        this.f6554f = parcel.readInt();
    }
}
