package o3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import kf.k0;
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new l4.j(15);
    public int f16242a;
    public final UUID f16243b;
    public final String f16244c;
    public final String d;
    public final byte[] e;

    public g(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f16243b = uuid;
        this.f16244c = str;
        str2.getClass();
        this.d = str2;
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = j3.h.f8575a;
        UUID uuid3 = this.f16243b;
        if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
            return false;
        }
        return true;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        if (!h5.d0.a(this.f16244c, gVar.f16244c) || !h5.d0.a(this.d, gVar.d) || !h5.d0.a(this.f16243b, gVar.f16243b) || !Arrays.equals(this.e, gVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f16242a == 0) {
            int hashCode2 = this.f16243b.hashCode() * 31;
            String str = this.f16244c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f16242a = Arrays.hashCode(this.e) + k0.e((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f16242a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f16243b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f16244c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public g(Parcel parcel) {
        this.f16243b = new UUID(parcel.readLong(), parcel.readLong());
        this.f16244c = parcel.readString();
        String readString = parcel.readString();
        int i10 = h5.d0.f6924a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
