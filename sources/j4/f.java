package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new f8.o(17);
    public final String f9521b;
    public final String f9522c;
    public final String d;
    public final byte[] f9523e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f9521b = str;
        this.f9522c = str2;
        this.d = str3;
        this.f9523e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d0.a(this.f9521b, fVar.f9521b) && d0.a(this.f9522c, fVar.f9522c) && d0.a(this.d, fVar.d) && Arrays.equals(this.f9523e, fVar.f9523e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f9521b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f9522c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f9523e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f9529a + ": mimeType=" + this.f9521b + ", filename=" + this.f9522c + ", description=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9521b);
        parcel.writeString(this.f9522c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f9523e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f9521b = readString;
        this.f9522c = parcel.readString();
        this.d = parcel.readString();
        this.f9523e = parcel.createByteArray();
    }
}
