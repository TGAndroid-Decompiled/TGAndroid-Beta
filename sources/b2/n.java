package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public int f3114a;
    public final UUID f3115b;
    public final String f3116c;
    public final String d;
    public final byte[] e;

    public n(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3115b = uuid;
        this.f3116c = str;
        str2.getClass();
        this.d = r0.n(str2);
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = i.f3011a;
        UUID uuid3 = this.f3115b;
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
        if (!Objects.equals(this.f3116c, nVar.f3116c) || !Objects.equals(this.d, nVar.d) || !Objects.equals(this.f3115b, nVar.f3115b) || !Arrays.equals(this.e, nVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3114a == 0) {
            int hashCode2 = this.f3115b.hashCode() * 31;
            String str = this.f3116c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3114a = Arrays.hashCode(this.e) + a4.a.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f3114a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f3115b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3116c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public n(Parcel parcel) {
        this.f3115b = new UUID(parcel.readLong(), parcel.readLong());
        this.f3116c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.d0.f7872a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
