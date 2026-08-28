package e4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.r0;
import java.util.Arrays;
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new c.c(7);
    public final byte[] f4831b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f4831b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4850a.equals(bVar.f4850a) && Arrays.equals(this.f4831b, bVar.f4831b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4831b) + r0.f(527, 31, this.f4850a);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4850a);
        parcel.writeByteArray(this.f4831b);
    }

    public b(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: e4.b.<init>(android.os.Parcel):void");
    }
}
