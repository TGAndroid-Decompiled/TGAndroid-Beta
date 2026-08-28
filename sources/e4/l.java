package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new c.c(13);
    public final int f4853b;
    public final int f4854c;
    public final int d;
    public final int[] f4855e;
    public final int[] f4856f;

    public l(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f4853b = i9;
        this.f4854c = i10;
        this.d = i11;
        this.f4855e = iArr;
        this.f4856f = iArr2;
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
            if (this.f4853b == lVar.f4853b && this.f4854c == lVar.f4854c && this.d == lVar.d && Arrays.equals(this.f4855e, lVar.f4855e) && Arrays.equals(this.f4856f, lVar.f4856f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f4855e);
        return Arrays.hashCode(this.f4856f) + ((hashCode + ((((((527 + this.f4853b) * 31) + this.f4854c) * 31) + this.d) * 31)) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f4853b);
        parcel.writeInt(this.f4854c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.f4855e);
        parcel.writeIntArray(this.f4856f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f4853b = parcel.readInt();
        this.f4854c = parcel.readInt();
        this.d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i9 = f0.f4349a;
        this.f4855e = createIntArray;
        this.f4856f = parcel.createIntArray();
    }
}
