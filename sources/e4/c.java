package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.Arrays;

public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new c8.o(16);

    public final String f5191b;

    public final int f5192c;
    public final int d;

    public final long f5193e;

    public final long f5194f;
    public final j[] h;

    public c(String str, int i10, int i11, long j10, long j11, j[] jVarArr) {
        super("CHAP");
        this.f5191b = str;
        this.f5192c = i10;
        this.d = i11;
        this.f5193e = j10;
        this.f5194f = j11;
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
            if (this.f5192c == cVar.f5192c && this.d == cVar.d && this.f5193e == cVar.f5193e && this.f5194f == cVar.f5194f && g0.a(this.f5191b, cVar.f5191b) && Arrays.equals(this.h, cVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f5192c) * 31) + this.d) * 31) + ((int) this.f5193e)) * 31) + ((int) this.f5194f)) * 31;
        String str = this.f5191b;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5191b);
        parcel.writeInt(this.f5192c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f5193e);
        parcel.writeLong(this.f5194f);
        j[] jVarArr = this.h;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f5191b = string;
        this.f5192c = parcel.readInt();
        this.d = parcel.readInt();
        this.f5193e = parcel.readLong();
        this.f5194f = parcel.readLong();
        int i11 = parcel.readInt();
        this.h = new j[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.h[i12] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
