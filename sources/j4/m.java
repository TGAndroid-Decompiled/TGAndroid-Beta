package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new f8.o(20);
    public final String f8912b;
    public final byte[] f8913c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f8912b = str;
        this.f8913c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (d0.a(this.f8912b, mVar.f8912b) && Arrays.equals(this.f8913c, mVar.f8913c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f8912b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f8913c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f8906a + ": owner=" + this.f8912b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8912b);
        parcel.writeByteArray(this.f8913c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = d0.f6924a;
        this.f8912b = readString;
        this.f8913c = parcel.createByteArray();
    }
}
