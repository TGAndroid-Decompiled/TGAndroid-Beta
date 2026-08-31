package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new f8.o(20);
    public final String f9536b;
    public final byte[] f9537c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f9536b = str;
        this.f9537c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (d0.a(this.f9536b, mVar.f9536b) && Arrays.equals(this.f9537c, mVar.f9537c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f9536b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f9537c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f9529a + ": owner=" + this.f9536b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9536b);
        parcel.writeByteArray(this.f9537c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.f9536b = readString;
        this.f9537c = parcel.createByteArray();
    }
}
