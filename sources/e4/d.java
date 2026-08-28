package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new c.c(9);
    public final String f4836b;
    public final boolean f4837c;
    public final boolean d;
    public final String[] f4838e;
    public final j[] f4839f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f4836b = str;
        this.f4837c = z10;
        this.d = z11;
        this.f4838e = strArr;
        this.f4839f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f4837c == dVar.f4837c && this.d == dVar.d && f0.a(this.f4836b, dVar.f4836b) && Arrays.equals(this.f4838e, dVar.f4838e) && Arrays.equals(this.f4839f, dVar.f4839f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = (((527 + (this.f4837c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f4836b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4836b);
        parcel.writeByte(this.f4837c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f4838e);
        j[] jVarArr = this.f4839f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f4836b = readString;
        this.f4837c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f4838e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f4839f = new j[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f4839f[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
