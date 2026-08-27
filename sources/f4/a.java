package f4;

import android.os.Parcel;
import android.os.Parcelable;
import c8.o;
import d5.g0;
import h3.g1;
import h3.t0;
import java.util.Arrays;

public final class a implements z3.b {
    public static final Parcelable.Creator<a> CREATOR = new o(26);

    public final String f5869a;

    public final byte[] f5870b;

    public final int f5871c;
    public final int d;

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f5869a = str;
        this.f5870b = bArr;
        this.f5871c = i10;
        this.d = i11;
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
            if (this.f5869a.equals(aVar.f5869a) && Arrays.equals(this.f5870b, aVar.f5870b) && this.f5871c == aVar.f5871c && this.d == aVar.d) {
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
        return ((((Arrays.hashCode(this.f5870b) + i0.a.g(527, 31, this.f5869a)) * 31) + this.f5871c) * 31) + this.d;
    }

    public final String toString() {
        return "mdta: key=" + this.f5869a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5869a);
        parcel.writeByteArray(this.f5870b);
        parcel.writeInt(this.f5871c);
        parcel.writeInt(this.d);
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f5869a = string;
        this.f5870b = parcel.createByteArray();
        this.f5871c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
