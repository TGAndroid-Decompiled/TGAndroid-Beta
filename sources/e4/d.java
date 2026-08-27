package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.Arrays;

public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new c8.o(17);

    public final String f5195b;

    public final boolean f5196c;
    public final boolean d;

    public final String[] f5197e;

    public final j[] f5198f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f5195b = str;
        this.f5196c = z10;
        this.d = z11;
        this.f5197e = strArr;
        this.f5198f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f5196c == dVar.f5196c && this.d == dVar.d && g0.a(this.f5195b, dVar.f5195b) && Arrays.equals(this.f5197e, dVar.f5197e) && Arrays.equals(this.f5198f, dVar.f5198f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f5196c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f5195b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5195b);
        parcel.writeByte(this.f5196c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f5197e);
        j[] jVarArr = this.f5198f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f5195b = string;
        this.f5196c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f5197e = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.f5198f = new j[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f5198f[i12] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
