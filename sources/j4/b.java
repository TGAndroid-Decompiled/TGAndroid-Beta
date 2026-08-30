package j4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kh.a2;
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new f8.o(13);
    public final byte[] f8908b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f8908b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8924a.equals(bVar.f8924a) && Arrays.equals(this.f8908b, bVar.f8908b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8908b) + a2.e(527, 31, this.f8924a);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8924a);
        parcel.writeByteArray(this.f8908b);
    }

    public b(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.<init>(android.os.Parcel):void");
    }
}
