package d4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import h3.g1;
import h3.t0;
public final class b implements z3.b {
    public static final Parcelable.Creator<b> CREATOR = new c.c(4);
    public final int f4313a;
    public final String f4314b;
    public final String f4315c;
    public final String d;
    public final boolean f4316e;
    public final int f4317f;

    public b(int i9, String str, String str2, String str3, boolean z10, int i10) {
        d5.a.f(i10 == -1 || i10 > 0);
        this.f4313a = i9;
        this.f4314b = str;
        this.f4315c = str2;
        this.d = str3;
        this.f4316e = z10;
        this.f4317f = i10;
    }

    public static d4.b a(java.util.Map r14) {
        throw new UnsupportedOperationException("Method not decompiled: d4.b.a(java.util.Map):d4.b");
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
            if (this.f4313a == bVar.f4313a && f0.a(this.f4314b, bVar.f4314b) && f0.a(this.f4315c, bVar.f4315c) && f0.a(this.d, bVar.d) && this.f4316e == bVar.f4316e && this.f4317f == bVar.f4317f) {
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
        int i9;
        int i10;
        int i11 = (527 + this.f4313a) * 31;
        int i12 = 0;
        String str = this.f4314b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i11 + i9) * 31;
        String str2 = this.f4315c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((((i14 + i12) * 31) + (this.f4316e ? 1 : 0)) * 31) + this.f4317f;
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f4315c;
        if (str != null) {
            g1Var.E = str;
        }
        String str2 = this.f4314b;
        if (str2 != null) {
            g1Var.C = str2;
        }
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f4315c + "\", genre=\"" + this.f4314b + "\", bitrate=" + this.f4313a + ", metadataInterval=" + this.f4317f;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f4313a);
        parcel.writeString(this.f4314b);
        parcel.writeString(this.f4315c);
        parcel.writeString(this.d);
        int i10 = f0.f4349a;
        parcel.writeInt(this.f4316e ? 1 : 0);
        parcel.writeInt(this.f4317f);
    }

    public b(Parcel parcel) {
        this.f4313a = parcel.readInt();
        this.f4314b = parcel.readString();
        this.f4315c = parcel.readString();
        this.d = parcel.readString();
        int i9 = f0.f4349a;
        this.f4316e = parcel.readInt() != 0;
        this.f4317f = parcel.readInt();
    }
}
