package b4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import i7.q7;
import java.util.Arrays;
import java.util.List;
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Object();
    public final b[] f1919a;
    public final long f1920b;

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public final c a(c cVar) {
        if (cVar != null) {
            b[] bVarArr = cVar.f1919a;
            if (bVarArr.length != 0) {
                int i10 = d0.f6579a;
                b[] bVarArr2 = this.f1919a;
                Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
                return new c(this.f1920b, (b[]) copyOf);
            }
        }
        return this;
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
            if (Arrays.equals(this.f1919a, cVar.f1919a) && this.f1920b == cVar.f1920b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return q7.a(this.f1920b) + (Arrays.hashCode(this.f1919a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f1919a));
        long j10 = this.f1920b;
        if (j10 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j10;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        b[] bVarArr = this.f1919a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f1920b);
    }

    public c(long j10, b... bVarArr) {
        this.f1920b = j10;
        this.f1919a = bVarArr;
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(Parcel parcel) {
        this.f1919a = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f1919a;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f1920b = parcel.readLong();
                return;
            }
        }
    }
}
