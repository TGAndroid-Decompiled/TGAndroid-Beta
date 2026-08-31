package e4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
import java.util.List;
import k7.z7;
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Object();
    public final b[] f4938a;
    public final long f4939b;

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final c a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        int i10 = d0.f7237a;
        b[] bVarArr2 = this.f4938a;
        Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
        return new c(this.f4939b, (b[]) copyOf);
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
            if (Arrays.equals(this.f4938a, cVar.f4938a) && this.f4939b == cVar.f4939b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return z7.a(this.f4939b) + (Arrays.hashCode(this.f4938a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f4938a));
        long j10 = this.f4939b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        b[] bVarArr = this.f4938a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f4939b);
    }

    public c(long j10, b... bVarArr) {
        this.f4939b = j10;
        this.f4938a = bVarArr;
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(Parcel parcel) {
        this.f4938a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f4938a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f4939b = parcel.readLong();
                return;
            }
        }
    }
}
