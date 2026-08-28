package d4;

import aa.d;
import android.os.Parcel;
import android.os.Parcelable;
import h3.g1;
import h3.t0;
import j3.r0;
import java.util.Arrays;
public final class c implements z3.b {
    public static final Parcelable.Creator<c> CREATOR = new c.c(5);
    public final byte[] f4318a;
    public final String f4319b;
    public final String f4320c;

    public c(String str, String str2, byte[] bArr) {
        this.f4318a = bArr;
        this.f4319b = str;
        this.f4320c = str2;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f4318a, ((c) obj).f4318a);
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
        return Arrays.hashCode(this.f4318a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f4319b;
        if (str != null) {
            g1Var.f9411a = str;
        }
    }

    public final String toString() {
        return d.l(this.f4318a.length, "\"", r0.q("ICY: title=\"", this.f4319b, "\", url=\"", this.f4320c, "\", rawMetadata.length=\""));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeByteArray(this.f4318a);
        parcel.writeString(this.f4319b);
        parcel.writeString(this.f4320c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f4318a = createByteArray;
        this.f4319b = parcel.readString();
        this.f4320c = parcel.readString();
    }
}
