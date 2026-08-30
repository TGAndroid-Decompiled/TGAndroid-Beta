package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new f8.o(19);
    public final int f8927b;
    public final int f8928c;
    public final int d;
    public final int[] e;
    public final int[] f8929f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f8927b = i10;
        this.f8928c = i11;
        this.d = i12;
        this.e = iArr;
        this.f8929f = iArr2;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f8927b == lVar.f8927b && this.f8928c == lVar.f8928c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f8929f, lVar.f8929f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f8929f) + ((hashCode + ((((((527 + this.f8927b) * 31) + this.f8928c) * 31) + this.d) * 31)) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8927b);
        parcel.writeInt(this.f8928c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f8929f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f8927b = parcel.readInt();
        this.f8928c = parcel.readInt();
        this.d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = d0.f6937a;
        this.e = createIntArray;
        this.f8929f = parcel.createIntArray();
    }
}
