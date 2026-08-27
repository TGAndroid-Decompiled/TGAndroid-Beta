package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.Arrays;

public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new c8.o(21);

    public final int f5212b;

    public final int f5213c;
    public final int d;

    public final int[] f5214e;

    public final int[] f5215f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f5212b = i10;
        this.f5213c = i11;
        this.d = i12;
        this.f5214e = iArr;
        this.f5215f = iArr2;
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
            if (this.f5212b == lVar.f5212b && this.f5213c == lVar.f5213c && this.d == lVar.d && Arrays.equals(this.f5214e, lVar.f5214e) && Arrays.equals(this.f5215f, lVar.f5215f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5215f) + ((Arrays.hashCode(this.f5214e) + ((((((527 + this.f5212b) * 31) + this.f5213c) * 31) + this.d) * 31)) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5212b);
        parcel.writeInt(this.f5213c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.f5214e);
        parcel.writeIntArray(this.f5215f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f5212b = parcel.readInt();
        this.f5213c = parcel.readInt();
        this.d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i10 = g0.f4795a;
        this.f5214e = iArrCreateIntArray;
        this.f5215f = parcel.createIntArray();
    }
}
