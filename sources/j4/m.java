package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new f8.o(20);
    public final String f8930b;
    public final byte[] f8931c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f8930b = str;
        this.f8931c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (d0.a(this.f8930b, mVar.f8930b) && Arrays.equals(this.f8931c, mVar.f8931c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f8930b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f8931c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f8924a + ": owner=" + this.f8930b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8930b);
        parcel.writeByteArray(this.f8931c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = d0.f6937a;
        this.f8930b = readString;
        this.f8931c = parcel.createByteArray();
    }
}
