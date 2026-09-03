package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new f8.o(17);
    public final String f8899b;
    public final String f8900c;
    public final String d;
    public final byte[] e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f8899b = str;
        this.f8900c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (d0.a(this.f8899b, fVar.f8899b) && d0.a(this.f8900c, fVar.f8900c) && d0.a(this.d, fVar.d) && Arrays.equals(this.e, fVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f8899b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f8900c;
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
        return Arrays.hashCode(this.e) + ((i14 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f8906a + ": mimeType=" + this.f8899b + ", filename=" + this.f8900c + ", description=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8899b);
        parcel.writeString(this.f8900c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = d0.f6924a;
        this.f8899b = readString;
        this.f8900c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.createByteArray();
    }
}
