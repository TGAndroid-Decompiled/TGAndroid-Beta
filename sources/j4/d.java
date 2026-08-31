package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new f8.o(15);
    public final String f9515b;
    public final boolean f9516c;
    public final boolean d;
    public final String[] f9517e;
    public final j[] f9518f;

    public d(String str, boolean z4, boolean z10, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f9515b = str;
        this.f9516c = z4;
        this.d = z10;
        this.f9517e = strArr;
        this.f9518f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f9516c == dVar.f9516c && this.d == dVar.d && d0.a(this.f9515b, dVar.f9515b) && Arrays.equals(this.f9517e, dVar.f9517e) && Arrays.equals(this.f9518f, dVar.f9518f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f9516c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f9515b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9515b);
        parcel.writeByte(this.f9516c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f9517e);
        j[] jVarArr = this.f9518f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f9515b = readString;
        this.f9516c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f9517e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f9518f = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f9518f[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
