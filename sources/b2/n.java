package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public int f3444a;
    public final UUID f3445b;
    public final String f3446c;
    public final String d;
    public final byte[] f3447e;

    public n(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3445b = uuid;
        this.f3446c = str;
        str2.getClass();
        this.d = r0.n(str2);
        this.f3447e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = i.f3331a;
        UUID uuid3 = this.f3445b;
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
        if (!Objects.equals(this.f3446c, nVar.f3446c) || !Objects.equals(this.d, nVar.d) || !Objects.equals(this.f3445b, nVar.f3445b) || !Arrays.equals(this.f3447e, nVar.f3447e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3444a == 0) {
            int hashCode2 = this.f3445b.hashCode() * 31;
            String str = this.f3446c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3444a = Arrays.hashCode(this.f3447e) + a1.g.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f3444a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f3445b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3446c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f3447e);
    }

    public n(Parcel parcel) {
        this.f3445b = new UUID(parcel.readLong(), parcel.readLong());
        this.f3446c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.d0.f8529a;
        this.d = readString;
        this.f3447e = parcel.createByteArray();
    }
}
