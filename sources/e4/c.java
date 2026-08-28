package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new c.c(8);
    public final String f4832b;
    public final int f4833c;
    public final int d;
    public final long f4834e;
    public final long f4835f;
    public final j[] h;

    public c(String str, int i9, int i10, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.f4832b = str;
        this.f4833c = i9;
        this.d = i10;
        this.f4834e = j10;
        this.f4835f = j11;
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
            if (this.f4833c == cVar.f4833c && this.d == cVar.d && this.f4834e == cVar.f4834e && this.f4835f == cVar.f4835f && f0.a(this.f4832b, cVar.f4832b) && Arrays.equals(this.h, cVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = (((((((527 + this.f4833c) * 31) + this.d) * 31) + ((int) this.f4834e)) * 31) + ((int) this.f4835f)) * 31;
        String str = this.f4832b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4832b);
        parcel.writeInt(this.f4833c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f4834e);
        parcel.writeLong(this.f4835f);
        j[] jVarArr = this.h;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f4832b = readString;
        this.f4833c = parcel.readInt();
        this.d = parcel.readInt();
        this.f4834e = parcel.readLong();
        this.f4835f = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new j[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.h[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
