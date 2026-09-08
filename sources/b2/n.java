package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public int f2200a;
    public final UUID f2201b;
    public final String f2202c;
    public final String d;
    public final byte[] f2203e;

    public n(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f2201b = uuid;
        this.f2202c = str;
        str2.getClass();
        this.d = r0.n(str2);
        this.f2203e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = i.f2087a;
        UUID uuid3 = this.f2201b;
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
        if (!(obj instanceof n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        n nVar = (n) obj;
        if (!Objects.equals(this.f2202c, nVar.f2202c) || !Objects.equals(this.d, nVar.d) || !Objects.equals(this.f2201b, nVar.f2201b) || !Arrays.equals(this.f2203e, nVar.f2203e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f2200a == 0) {
            int hashCode2 = this.f2201b.hashCode() * 31;
            String str = this.f2202c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f2200a = Arrays.hashCode(this.f2203e) + a4.a.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f2200a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f2201b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2202c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f2203e);
    }

    public n(Parcel parcel) {
        this.f2201b = new UUID(parcel.readLong(), parcel.readLong());
        this.f2202c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.d0.f8765a;
        this.d = readString;
        this.f2203e = parcel.createByteArray();
    }
}
