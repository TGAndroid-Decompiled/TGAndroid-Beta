package j4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kf.k0;
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new f8.o(13);
    public final byte[] f8890b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f8890b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8906a.equals(bVar.f8906a) && Arrays.equals(this.f8890b, bVar.f8890b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8890b) + k0.e(527, 31, this.f8906a);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8906a);
        parcel.writeByteArray(this.f8890b);
    }

    public b(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.<init>(android.os.Parcel):void");
    }
}
