package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new q(1);
    public int f3936a;
    public final UUID f3937b;
    public final String f3938c;
    public final String d;
    public final byte[] e;

    public r(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3937b = uuid;
        this.f3938c = str;
        str2.getClass();
        this.d = v0.n(str2);
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = m.f3833b;
        UUID uuid3 = this.f3937b;
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
        if (!Objects.equals(this.f3938c, rVar.f3938c) || !Objects.equals(this.d, rVar.d) || !Objects.equals(this.f3937b, rVar.f3937b) || !Arrays.equals(this.e, rVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3936a == 0) {
            int hashCode2 = this.f3937b.hashCode() * 31;
            String str = this.f3938c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3936a = Arrays.hashCode(this.e) + a1.g.g((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f3936a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f3937b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3938c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public r(Parcel parcel) {
        this.f3937b = new UUID(parcel.readLong(), parcel.readLong());
        this.f3938c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.m0.f8259a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
