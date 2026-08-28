package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import h3.g1;
import java.util.Arrays;
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new c.c(6);
    public final String f4828b;
    public final String f4829c;
    public final int d;
    public final byte[] f4830e;

    public a(int i9, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f4828b = str;
        this.f4829c = str2;
        this.d = i9;
        this.f4830e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && f0.a(this.f4828b, aVar.f4828b) && f0.a(this.f4829c, aVar.f4829c) && Arrays.equals(this.f4830e, aVar.f4830e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = (527 + this.d) * 31;
        int i11 = 0;
        String str = this.f4828b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i10 + i9) * 31;
        String str2 = this.f4829c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f4830e) + ((i12 + i11) * 31);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        g1Var.a(this.d, this.f4830e);
    }

    @Override
    public final String toString() {
        return this.f4850a + ": mimeType=" + this.f4828b + ", description=" + this.f4829c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4828b);
        parcel.writeString(this.f4829c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f4830e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f4828b = readString;
        this.f4829c = parcel.readString();
        this.d = parcel.readInt();
        this.f4830e = parcel.createByteArray();
    }
}
