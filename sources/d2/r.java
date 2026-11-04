package d2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new q(1);
    public int f8336a;
    public final UUID f8337b;
    public final String f8338c;
    public final String d;
    public final byte[] f8339e;

    public r(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f8337b = uuid;
        this.f8338c = str;
        str2.getClass();
        this.d = u0.n(str2);
        this.f8339e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = m.f8183b;
        UUID uuid3 = this.f8337b;
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
        if (!Objects.equals(this.f8338c, rVar.f8338c) || !Objects.equals(this.d, rVar.d) || !Objects.equals(this.f8337b, rVar.f8337b) || !Arrays.equals(this.f8339e, rVar.f8339e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f8336a == 0) {
            int hashCode2 = this.f8337b.hashCode() * 31;
            String str = this.f8338c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f8336a = Arrays.hashCode(this.f8339e) + com.google.android.recaptcha.internal.a.g((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f8336a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        UUID uuid = this.f8337b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f8338c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f8339e);
    }

    public r(Parcel parcel) {
        this.f8337b = new UUID(parcel.readLong(), parcel.readLong());
        this.f8338c = parcel.readString();
        String readString = parcel.readString();
        String str = g2.n0.f11873a;
        this.d = readString;
        this.f8339e = parcel.createByteArray();
    }
}
