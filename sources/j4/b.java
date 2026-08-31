package j4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new f8.o(13);
    public final byte[] f9510b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f9510b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f9529a.equals(bVar.f9529a) && Arrays.equals(this.f9510b, bVar.f9510b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9510b) + l.d.e(527, 31, this.f9529a);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9529a);
        parcel.writeByteArray(this.f9510b);
    }

    public b(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.<init>(android.os.Parcel):void");
    }
}
