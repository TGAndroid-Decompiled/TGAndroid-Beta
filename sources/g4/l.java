package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.Arrays;
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new d6.d(26);
    public final int f7009b;
    public final int f7010c;
    public final int d;
    public final int[] f7011e;
    public final int[] f7012f;

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f7009b = i10;
        this.f7010c = i11;
        this.d = i12;
        this.f7011e = iArr;
        this.f7012f = iArr2;
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
            if (this.f7009b == lVar.f7009b && this.f7010c == lVar.f7010c && this.d == lVar.d && Arrays.equals(this.f7011e, lVar.f7011e) && Arrays.equals(this.f7012f, lVar.f7012f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f7011e);
        return Arrays.hashCode(this.f7012f) + ((hashCode + ((((((527 + this.f7009b) * 31) + this.f7010c) * 31) + this.d) * 31)) * 31);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7009b);
        parcel.writeInt(this.f7010c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.f7011e);
        parcel.writeIntArray(this.f7012f);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f7009b = parcel.readInt();
        this.f7010c = parcel.readInt();
        this.d = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = d0.f6579a;
        this.f7011e = createIntArray;
        this.f7012f = parcel.createIntArray();
    }
}
