package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public int f2173a;
    public final UUID f2174b;
    public final String f2175c;
    public final String d;
    public final byte[] f2176e;

    public n(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f2174b = uuid;
        this.f2175c = str;
        str2.getClass();
        this.d = r0.n(str2);
        this.f2176e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = i.f2060a;
        UUID uuid3 = this.f2174b;
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
        if (!Objects.equals(this.f2175c, nVar.f2175c) || !Objects.equals(this.d, nVar.d) || !Objects.equals(this.f2174b, nVar.f2174b) || !Arrays.equals(this.f2176e, nVar.f2176e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f2173a == 0) {
            int hashCode2 = this.f2174b.hashCode() * 31;
            String str = this.f2175c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f2173a = Arrays.hashCode(this.f2176e) + a4.a.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f2173a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f2174b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2175c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f2176e);
    }

    public n(Parcel parcel) {
        this.f2174b = new UUID(parcel.readLong(), parcel.readLong());
        this.f2175c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.d0.f8737a;
        this.d = readString;
        this.f2176e = parcel.createByteArray();
    }
}
