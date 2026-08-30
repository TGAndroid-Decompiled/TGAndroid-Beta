package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new f8.o(15);
    public final String f8912b;
    public final boolean f8913c;
    public final boolean d;
    public final String[] e;
    public final j[] f8914f;

    public d(String str, boolean z4, boolean z10, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f8912b = str;
        this.f8913c = z4;
        this.d = z10;
        this.e = strArr;
        this.f8914f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f8913c == dVar.f8913c && this.d == dVar.d && d0.a(this.f8912b, dVar.f8912b) && Arrays.equals(this.e, dVar.e) && Arrays.equals(this.f8914f, dVar.f8914f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f8913c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f8912b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8912b);
        parcel.writeByte(this.f8913c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.e);
        j[] jVarArr = this.f8914f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = d0.f6937a;
        this.f8912b = readString;
        this.f8913c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f8914f = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f8914f[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
