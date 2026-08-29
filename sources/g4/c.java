package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.Arrays;
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new d6.d(21);
    public final String f6988b;
    public final int f6989c;
    public final int d;
    public final long f6990e;
    public final long f6991f;
    public final j[] h;

    public c(String str, int i10, int i11, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.f6988b = str;
        this.f6989c = i10;
        this.d = i11;
        this.f6990e = j10;
        this.f6991f = j11;
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
            if (this.f6989c == cVar.f6989c && this.d == cVar.d && this.f6990e == cVar.f6990e && this.f6991f == cVar.f6991f && d0.a(this.f6988b, cVar.f6988b) && Arrays.equals(this.h, cVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (((((((527 + this.f6989c) * 31) + this.d) * 31) + ((int) this.f6990e)) * 31) + ((int) this.f6991f)) * 31;
        String str = this.f6988b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6988b);
        parcel.writeInt(this.f6989c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f6990e);
        parcel.writeLong(this.f6991f);
        j[] jVarArr = this.h;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f6988b = readString;
        this.f6989c = parcel.readInt();
        this.d = parcel.readInt();
        this.f6990e = parcel.readLong();
        this.f6991f = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new j[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.h[i11] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
