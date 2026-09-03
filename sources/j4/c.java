package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new f8.o(14);
    public final String f8891b;
    public final int f8892c;
    public final int d;
    public final long e;
    public final long f8893f;
    public final j[] h;

    public c(String str, int i10, int i11, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.f8891b = str;
        this.f8892c = i10;
        this.d = i11;
        this.e = j10;
        this.f8893f = j11;
        this.h = jVarArr;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f8892c == cVar.f8892c && this.d == cVar.d && this.e == cVar.e && this.f8893f == cVar.f8893f && d0.a(this.f8891b, cVar.f8891b) && Arrays.equals(this.h, cVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f8892c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f8893f)) * 31;
        String str = this.f8891b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8891b);
        parcel.writeInt(this.f8892c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f8893f);
        j[] jVarArr = this.h;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = d0.f6924a;
        this.f8891b = readString;
        this.f8892c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f8893f = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.h[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
