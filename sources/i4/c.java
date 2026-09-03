package i4;

import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j3.d1;
import j3.n0;
import java.util.Arrays;
import org.telegram.ui.ai;
public final class c implements e4.b {
    public static final Parcelable.Creator<c> CREATOR = new o(7);
    public final byte[] f7230a;
    public final String f7231b;
    public final String f7232c;

    public c(String str, String str2, byte[] bArr) {
        this.f7230a = bArr;
        this.f7231b = str;
        this.f7232c = str2;
    }

    @Override
    public final n0 b() {
        return null;
    }

    @Override
    public final void c(d1 d1Var) {
        String str = this.f7231b;
        if (str != null) {
            d1Var.f8447a = str;
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
            return Arrays.equals(this.f7230a, ((c) obj).f7230a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7230a);
    }

    public final String toString() {
        return android.support.v4.media.a.m(this.f7230a.length, "\"", ai.l("ICY: title=\"", this.f7231b, "\", url=\"", this.f7232c, "\", rawMetadata.length=\""));
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f7230a);
        parcel.writeString(this.f7231b);
        parcel.writeString(this.f7232c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f7230a = createByteArray;
        this.f7231b = parcel.readString();
        this.f7232c = parcel.readString();
    }
}
