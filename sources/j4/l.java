package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new f8.o(19);
    public final int f8909b;
    public final int f8910c;
    public final int d;
    public final int[] e;
    public final int[] f8911f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f8909b = i10;
        this.f8910c = i11;
        this.d = i12;
        this.e = iArr;
        this.f8911f = iArr2;
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
            if (this.f8909b == lVar.f8909b && this.f8910c == lVar.f8910c && this.d == lVar.d && Arrays.equals(this.e, lVar.e) && Arrays.equals(this.f8911f, lVar.f8911f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.e);
        return Arrays.hashCode(this.f8911f) + ((hashCode + ((((((527 + this.f8909b) * 31) + this.f8910c) * 31) + this.d) * 31)) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8909b);
        parcel.writeInt(this.f8910c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f8911f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f8909b = parcel.readInt();
        this.f8910c = parcel.readInt();
        this.d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = d0.f6924a;
        this.e = createIntArray;
        this.f8911f = parcel.createIntArray();
    }
}
