package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import h3.g1;
import java.util.Arrays;

public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new c8.o(14);

    public final String f5187b;

    public final String f5188c;
    public final int d;

    public final byte[] f5189e;

    public a(int i10, String str, String str2, byte[] bArr) {
        super("APIC");
        this.f5187b = str;
        this.f5188c = str2;
        this.d = i10;
        this.f5189e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.d == aVar.d && g0.a(this.f5187b, aVar.f5187b) && g0.a(this.f5188c, aVar.f5188c) && Arrays.equals(this.f5189e, aVar.f5189e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.d) * 31;
        String str = this.f5187b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5188c;
        return Arrays.hashCode(this.f5189e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        g1Var.a(this.d, this.f5189e);
    }

    @Override
    public final String toString() {
        return this.f5209a + ": mimeType=" + this.f5187b + ", description=" + this.f5188c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5187b);
        parcel.writeString(this.f5188c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f5189e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f5187b = string;
        this.f5188c = parcel.readString();
        this.d = parcel.readInt();
        this.f5189e = parcel.createByteArray();
    }
}
