package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.d1;
import java.util.Arrays;
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new f8.o(12);
    public final String f9507b;
    public final String f9508c;
    public final int d;
    public final byte[] f9509e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f9507b = str;
        this.f9508c = str2;
        this.d = i10;
        this.f9509e = bArr;
    }

    @Override
    public final void c(d1 d1Var) {
        d1Var.a(this.d, this.f9509e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && d0.a(this.f9507b, aVar.f9507b) && d0.a(this.f9508c, aVar.f9508c) && Arrays.equals(this.f9509e, aVar.f9509e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f9507b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f9508c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f9509e) + ((i13 + i12) * 31);
    }

    @Override
    public final String toString() {
        return this.f9529a + ": mimeType=" + this.f9507b + ", description=" + this.f9508c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9507b);
        parcel.writeString(this.f9508c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f9509e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f9507b = readString;
        this.f9508c = parcel.readString();
        this.d = parcel.readInt();
        this.f9509e = parcel.createByteArray();
    }
}
