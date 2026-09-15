package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public int f3115a;
    public final UUID f3116b;
    public final String f3117c;
    public final String d;
    public final byte[] e;

    public n(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3116b = uuid;
        this.f3117c = str;
        str2.getClass();
        this.d = r0.n(str2);
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = i.f3012a;
        UUID uuid3 = this.f3116b;
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
        if (!Objects.equals(this.f3117c, nVar.f3117c) || !Objects.equals(this.d, nVar.d) || !Objects.equals(this.f3116b, nVar.f3116b) || !Arrays.equals(this.e, nVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3115a == 0) {
            int hashCode2 = this.f3116b.hashCode() * 31;
            String str = this.f3117c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3115a = Arrays.hashCode(this.e) + a4.a.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f3115a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f3116b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3117c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public n(Parcel parcel) {
        this.f3116b = new UUID(parcel.readLong(), parcel.readLong());
        this.f3117c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.d0.f7883a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
