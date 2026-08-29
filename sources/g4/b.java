package g4;

import android.os.Parcel;
import android.os.Parcelable;
import j7.l1;
import java.util.Arrays;
public final class b extends j {
    public static final Parcelable.Creator<b> CREATOR = new d6.d(20);
    public final byte[] f6987b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f6987b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7006a.equals(bVar.f7006a) && Arrays.equals(this.f6987b, bVar.f6987b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6987b) + l1.f(527, 31, this.f7006a);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7006a);
        parcel.writeByteArray(this.f6987b);
    }

    public b(android.os.Parcel r3) {
        throw new UnsupportedOperationException("Method not decompiled: g4.b.<init>(android.os.Parcel):void");
    }
}
