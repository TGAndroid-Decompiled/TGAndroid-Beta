package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.Arrays;
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new d6.d(27);
    public final String f7013b;
    public final byte[] f7014c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f7013b = str;
        this.f7014c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (d0.a(this.f7013b, mVar.f7013b) && Arrays.equals(this.f7014c, mVar.f7014c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f7013b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.f7014c) + ((527 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f7006a + ": owner=" + this.f7013b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7013b);
        parcel.writeByteArray(this.f7014c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.f7013b = readString;
        this.f7014c = parcel.createByteArray();
    }
}
