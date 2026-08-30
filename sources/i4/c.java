package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j3.d1;
import j3.n0;
import java.util.Arrays;
import org.telegram.ui.yh;
public final class c implements e4.b {
    public static final Parcelable.Creator<c> CREATOR = new o(7);
    public final byte[] f7247a;
    public final String f7248b;
    public final String f7249c;

    public c(String str, String str2, byte[] bArr) {
        this.f7247a = bArr;
        this.f7248b = str;
        this.f7249c = str2;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final void c(d1 d1Var) {
        String str = this.f7248b;
        if (str != null) {
            d1Var.f8465a = str;
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
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f7247a, ((c) obj).f7247a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7247a);
    }

    public final String toString() {
        return android.support.v4.media.a.m(this.f7247a.length, "\"", yh.m("ICY: title=\"", this.f7248b, "\", url=\"", this.f7249c, "\", rawMetadata.length=\""));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f7247a);
        parcel.writeString(this.f7248b);
        parcel.writeString(this.f7249c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f7247a = createByteArray;
        this.f7248b = parcel.readString();
        this.f7249c = parcel.readString();
    }
}
