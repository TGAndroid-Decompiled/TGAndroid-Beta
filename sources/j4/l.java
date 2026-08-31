package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new f8.o(19);
    public final int f9532b;
    public final int f9533c;
    public final int d;
    public final int[] f9534e;
    public final int[] f9535f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f9532b = i10;
        this.f9533c = i11;
        this.d = i12;
        this.f9534e = iArr;
        this.f9535f = iArr2;
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
            if (this.f9532b == lVar.f9532b && this.f9533c == lVar.f9533c && this.d == lVar.d && Arrays.equals(this.f9534e, lVar.f9534e) && Arrays.equals(this.f9535f, lVar.f9535f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f9534e);
        return Arrays.hashCode(this.f9535f) + ((hashCode + ((((((527 + this.f9532b) * 31) + this.f9533c) * 31) + this.d) * 31)) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9532b);
        parcel.writeInt(this.f9533c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.f9534e);
        parcel.writeIntArray(this.f9535f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f9532b = parcel.readInt();
        this.f9533c = parcel.readInt();
        this.d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = d0.f7237a;
        this.f9534e = createIntArray;
        this.f9535f = parcel.createIntArray();
    }
}
