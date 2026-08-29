package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j3.g1;
import java.util.Arrays;
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new d6.d(19);
    public final String f6984b;
    public final String f6985c;
    public final int d;
    public final byte[] f6986e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f6984b = str;
        this.f6985c = str2;
        this.d = i10;
        this.f6986e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && d0.a(this.f6984b, aVar.f6984b) && d0.a(this.f6985c, aVar.f6985c) && Arrays.equals(this.f6986e, aVar.f6986e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.d) * 31;
        int i12 = 0;
        String str = this.f6984b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.f6985c;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.f6986e) + ((i13 + i12) * 31);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        g1Var.a(this.d, this.f6986e);
    }

    @Override
    public final String toString() {
        return this.f7006a + ": mimeType=" + this.f6984b + ", description=" + this.f6985c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6984b);
        parcel.writeString(this.f6985c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f6986e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f6984b = readString;
        this.f6985c = parcel.readString();
        this.d = parcel.readInt();
        this.f6986e = parcel.createByteArray();
    }
}
