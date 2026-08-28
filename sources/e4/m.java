package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import java.util.Arrays;
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new c.c(14);
    public final String f4857b;
    public final byte[] f4858c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f4857b = str;
        this.f4858c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (f0.a(this.f4857b, mVar.f4857b) && Arrays.equals(this.f4858c, mVar.f4858c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        String str = this.f4857b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return Arrays.hashCode(this.f4858c) + ((527 + i9) * 31);
    }

    @Override
    public final String toString() {
        return this.f4850a + ": owner=" + this.f4857b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f4857b);
        parcel.writeByteArray(this.f4858c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.f4857b = readString;
        this.f4858c = parcel.createByteArray();
    }
}
