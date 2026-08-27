package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.Arrays;

public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new c8.o(19);

    public final String f5201b;

    public final String f5202c;
    public final String d;

    public final byte[] f5203e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f5201b = str;
        this.f5202c = str2;
        this.d = str3;
        this.f5203e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (g0.a(this.f5201b, fVar.f5201b) && g0.a(this.f5202c, fVar.f5202c) && g0.a(this.d, fVar.d) && Arrays.equals(this.f5203e, fVar.f5203e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5201b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5202c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return Arrays.hashCode(this.f5203e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override
    public final String toString() {
        return this.f5209a + ": mimeType=" + this.f5201b + ", filename=" + this.f5202c + ", description=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5201b);
        parcel.writeString(this.f5202c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f5203e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f5201b = string;
        this.f5202c = parcel.readString();
        this.d = parcel.readString();
        this.f5203e = parcel.createByteArray();
    }
}
