package f4;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import d6.d;
import j3.g1;
import j3.t0;
import java.util.Arrays;
import org.telegram.ui.th;
public final class c implements b4.b {
    public static final Parcelable.Creator<c> CREATOR = new d(18);
    public final byte[] f6555a;
    public final String f6556b;
    public final String f6557c;

    public c(String str, String str2, byte[] bArr) {
        this.f6555a = bArr;
        this.f6556b = str;
        this.f6557c = str2;
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
            return Arrays.equals(this.f6555a, ((c) obj).f6555a);
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
        return Arrays.hashCode(this.f6555a);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.f6556b;
        if (str != null) {
            g1Var.f10448a = str;
        }
    }

    public final String toString() {
        return w.l(this.f6555a.length, "\"", th.k("ICY: title=\"", this.f6556b, "\", url=\"", this.f6557c, "\", rawMetadata.length=\""));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f6555a);
        parcel.writeString(this.f6556b);
        parcel.writeString(this.f6557c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f6555a = createByteArray;
        this.f6556b = parcel.readString();
        this.f6557c = parcel.readString();
    }
}
