package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j3.g1;
import j3.t0;
import j7.l1;
import java.util.Arrays;
public final class a implements b4.b {
    public static final Parcelable.Creator<a> CREATOR = new g8.b(4);
    public final String f7524a;
    public final byte[] f7525b;
    public final int f7526c;
    public final int d;

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f7524a = str;
        this.f7525b = bArr;
        this.f7526c = i10;
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
            if (this.f7524a.equals(aVar.f7524a) && Arrays.equals(this.f7525b, aVar.f7525b) && this.f7526c == aVar.f7526c && this.d == aVar.d) {
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
        return ((((Arrays.hashCode(this.f7525b) + l1.f(527, 31, this.f7524a)) * 31) + this.f7526c) * 31) + this.d;
    }

    public final String toString() {
        return "mdta: key=" + this.f7524a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7524a);
        parcel.writeByteArray(this.f7525b);
        parcel.writeInt(this.f7526c);
        parcel.writeInt(this.d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f7524a = readString;
        this.f7525b = parcel.createByteArray();
        this.f7526c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
    }
}
