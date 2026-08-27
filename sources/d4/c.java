package d4;

import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import c8.o;
import h3.g1;
import h3.t0;
import java.util.Arrays;

public final class c implements z3.b {
    public static final Parcelable.Creator<c> CREATOR = new o(13);

    public final byte[] f4760a;

    public final String f4761b;

    public final String f4762c;

    public c(String str, String str2, byte[] bArr) {
        this.f4760a = bArr;
        this.f4761b = str;
        this.f4762c = str2;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4760a, ((c) obj).f4760a);
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
        return Arrays.hashCode(this.f4760a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f4761b;
        if (str != null) {
            g1Var.f7841a = str;
        }
    }

    public final String toString() {
        return p.k(this.f4760a.length, "\"", i0.a.p("ICY: title=\"", this.f4761b, "\", url=\"", this.f4762c, "\", rawMetadata.length=\""));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f4760a);
        parcel.writeString(this.f4761b);
        parcel.writeString(this.f4762c);
    }

    public c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f4760a = bArrCreateByteArray;
        this.f4761b = parcel.readString();
        this.f4762c = parcel.readString();
    }
}
