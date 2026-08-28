package f4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import h3.g1;
import h3.t0;
import j3.r0;
import java.util.Arrays;
public final class a implements z3.b {
    public static final Parcelable.Creator<a> CREATOR = new c.c(22);
    public final String f5574a;
    public final byte[] f5575b;
    public final int f5576c;
    public final int d;

    public a(String str, byte[] bArr, int i9, int i10) {
        this.f5574a = str;
        this.f5575b = bArr;
        this.f5576c = i9;
        this.d = i10;
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
            if (this.f5574a.equals(aVar.f5574a) && Arrays.equals(this.f5575b, aVar.f5575b) && this.f5576c == aVar.f5576c && this.d == aVar.d) {
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
        return ((((Arrays.hashCode(this.f5575b) + r0.f(527, 31, this.f5574a)) * 31) + this.f5576c) * 31) + this.d;
    }

    public final String toString() {
        return "mdta: key=" + this.f5574a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f5574a);
        parcel.writeByteArray(this.f5575b);
        parcel.writeInt(this.f5576c);
        parcel.writeInt(this.d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f5574a = readString;
        this.f5575b = parcel.createByteArray();
        this.f5576c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
