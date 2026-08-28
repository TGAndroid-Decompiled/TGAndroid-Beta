package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new c.c(11);
    public final String f4842b;
    public final String f4843c;
    public final String d;
    public final byte[] f4844e;

    public f(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.f4842b = str;
        this.f4843c = str2;
        this.d = str3;
        this.f4844e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (f0.a(this.f4842b, fVar.f4842b) && f0.a(this.f4843c, fVar.f4843c) && f0.a(this.d, fVar.d) && Arrays.equals(this.f4844e, fVar.f4844e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = 0;
        String str = this.f4842b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (527 + i9) * 31;
        String str2 = this.f4843c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return Arrays.hashCode(this.f4844e) + ((i13 + i11) * 31);
    }

    @Override
    public final String toString() {
        return this.f4850a + ": mimeType=" + this.f4842b + ", filename=" + this.f4843c + ", description=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4842b);
        parcel.writeString(this.f4843c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f4844e);
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f4842b = readString;
        this.f4843c = parcel.readString();
        this.d = parcel.readString();
        this.f4844e = parcel.createByteArray();
    }
}
