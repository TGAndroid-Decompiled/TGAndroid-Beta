package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.Arrays;
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new d6.d(22);
    public final String f6992b;
    public final boolean f6993c;
    public final boolean d;
    public final String[] f6994e;
    public final j[] f6995f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f6992b = str;
        this.f6993c = z10;
        this.d = z11;
        this.f6994e = strArr;
        this.f6995f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f6993c == dVar.f6993c && this.d == dVar.d && d0.a(this.f6992b, dVar.f6992b) && Arrays.equals(this.f6994e, dVar.f6994e) && Arrays.equals(this.f6995f, dVar.f6995f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((527 + (this.f6993c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.f6992b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6992b);
        parcel.writeByte(this.f6993c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f6994e);
        j[] jVarArr = this.f6995f;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f6992b = readString;
        this.f6993c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f6994e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f6995f = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f6995f[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
