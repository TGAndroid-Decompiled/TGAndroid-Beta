package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.Arrays;
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new d6.d(24);
    public final String f6998b;
    public final String f6999c;
    public final String d;
    public final byte[] f7000e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f6998b = str;
        this.f6999c = str2;
        this.d = str3;
        this.f7000e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d0.a(this.f6998b, fVar.f6998b) && d0.a(this.f6999c, fVar.f6999c) && d0.a(this.d, fVar.d) && Arrays.equals(this.f7000e, fVar.f7000e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f6998b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f6999c;
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
        return Arrays.hashCode(this.f7000e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f7006a + ": mimeType=" + this.f6998b + ", filename=" + this.f6999c + ", description=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6998b);
        parcel.writeString(this.f6999c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f7000e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f6998b = readString;
        this.f6999c = parcel.readString();
        this.d = parcel.readString();
        this.f7000e = parcel.createByteArray();
    }
}
