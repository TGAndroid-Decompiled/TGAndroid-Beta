package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.Arrays;

public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new c8.o(22);

    public final String f5216b;

    public final byte[] f5217c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f5216b = str;
        this.f5217c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (g0.a(this.f5216b, mVar.f5216b) && Arrays.equals(this.f5217c, mVar.f5217c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5216b;
        return Arrays.hashCode(this.f5217c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override
    public final String toString() {
        return this.f5209a + ": owner=" + this.f5216b;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5216b);
        parcel.writeByteArray(this.f5217c);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.f5216b = string;
        this.f5217c = parcel.createByteArray();
    }
}
