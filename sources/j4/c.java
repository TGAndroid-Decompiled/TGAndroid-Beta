package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new f8.o(14);
    public final String f9511b;
    public final int f9512c;
    public final int d;
    public final long f9513e;
    public final long f9514f;
    public final j[] h;

    public c(String str, int i10, int i11, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.f9511b = str;
        this.f9512c = i10;
        this.d = i11;
        this.f9513e = j10;
        this.f9514f = j11;
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
            if (this.f9512c == cVar.f9512c && this.d == cVar.d && this.f9513e == cVar.f9513e && this.f9514f == cVar.f9514f && d0.a(this.f9511b, cVar.f9511b) && Arrays.equals(this.h, cVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f9512c) * 31) + this.d) * 31) + ((int) this.f9513e)) * 31) + ((int) this.f9514f)) * 31;
        String str = this.f9511b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9511b);
        parcel.writeInt(this.f9512c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f9513e);
        parcel.writeLong(this.f9514f);
        j[] jVarArr = this.h;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f9511b = readString;
        this.f9512c = parcel.readInt();
        this.d = parcel.readInt();
        this.f9513e = parcel.readLong();
        this.f9514f = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.h[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
