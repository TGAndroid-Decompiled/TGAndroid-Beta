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
    public final byte[] f7794a;
    public final String f7795b;
    public final String f7796c;

    public c(String str, String str2, byte[] bArr) {
        this.f7794a = bArr;
        this.f7795b = str;
        this.f7796c = str2;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final void c(d1 d1Var) {
        String str = this.f7795b;
        if (str != null) {
            d1Var.f9027a = str;
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
            return Arrays.equals(this.f7794a, ((c) obj).f7794a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7794a);
    }

    public final String toString() {
        return android.support.v4.media.a.m(this.f7794a.length, "\"", yh.m("ICY: title=\"", this.f7795b, "\", url=\"", this.f7796c, "\", rawMetadata.length=\""));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f7794a);
        parcel.writeString(this.f7795b);
        parcel.writeString(this.f7796c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f7794a = createByteArray;
        this.f7795b = parcel.readString();
        this.f7796c = parcel.readString();
    }
}
