package e4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
import java.util.List;
import k7.z7;
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Object();
    public final b[] f5109a;
    public final long f5110b;

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final c a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        int i10 = d0.f6924a;
        b[] bVarArr2 = this.f5109a;
        Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
        return new c(this.f5110b, (b[]) copyOf);
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
            if (Arrays.equals(this.f5109a, cVar.f5109a) && this.f5110b == cVar.f5110b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return z7.a(this.f5110b) + (Arrays.hashCode(this.f5109a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f5109a));
        long j10 = this.f5110b;
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
        b[] bVarArr = this.f5109a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f5110b);
    }

    public c(long j10, b... bVarArr) {
        this.f5110b = j10;
        this.f5109a = bVarArr;
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(Parcel parcel) {
        this.f5109a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f5109a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f5110b = parcel.readLong();
                return;
            }
        }
    }
}
