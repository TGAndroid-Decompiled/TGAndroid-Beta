package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new q(1);
    public int f3929a;
    public final UUID f3930b;
    public final String f3931c;
    public final String d;
    public final byte[] e;

    public r(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3930b = uuid;
        this.f3931c = str;
        str2.getClass();
        this.d = v0.n(str2);
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = m.f3826b;
        UUID uuid3 = this.f3930b;
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
        if (!(obj instanceof r)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        r rVar = (r) obj;
        if (!Objects.equals(this.f3931c, rVar.f3931c) || !Objects.equals(this.d, rVar.d) || !Objects.equals(this.f3930b, rVar.f3930b) || !Arrays.equals(this.e, rVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3929a == 0) {
            int hashCode2 = this.f3930b.hashCode() * 31;
            String str = this.f3931c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3929a = Arrays.hashCode(this.e) + a1.g.g((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f3929a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f3930b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3931c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public r(Parcel parcel) {
        this.f3930b = new UUID(parcel.readLong(), parcel.readLong());
        this.f3931c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.m0.f8252a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
