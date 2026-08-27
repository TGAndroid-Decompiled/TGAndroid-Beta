package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.Arrays;

public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new c8.o(15);

    public final byte[] f5190b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f5190b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f5209a.equals(bVar.f5209a) && Arrays.equals(this.f5190b, bVar.f5190b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5190b) + i0.a.g(527, 31, this.f5209a);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5209a);
        parcel.writeByteArray(this.f5190b);
    }

    public b(Parcel parcel) {
        String string = parcel.readString();
        int i10 = g0.f4795a;
        super(string);
        this.f5190b = parcel.createByteArray();
    }
}
