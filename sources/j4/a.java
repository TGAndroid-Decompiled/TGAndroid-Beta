package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.d1;
import java.util.Arrays;
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new f8.o(12);
    public final String f8888b;
    public final String f8889c;
    public final int d;
    public final byte[] e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f8888b = str;
        this.f8889c = str2;
        this.d = i10;
        this.e = bArr;
    }

    @Override
    public final void c(d1 d1Var) {
        d1Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && d0.a(this.f8888b, aVar.f8888b) && d0.a(this.f8889c, aVar.f8889c) && Arrays.equals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f8888b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f8889c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f8906a + ": mimeType=" + this.f8888b + ", description=" + this.f8889c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8888b);
        parcel.writeString(this.f8889c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = d0.f6924a;
        this.f8888b = readString;
        this.f8889c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }
}
