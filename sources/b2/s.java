package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new r(1);
    public int f3387a;
    public final UUID f3388b;
    public final String f3389c;
    public final String d;
    public final byte[] e;

    public s(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3388b = uuid;
        this.f3389c = str;
        str2.getClass();
        this.d = w0.n(str2);
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = n.f3284b;
        UUID uuid3 = this.f3388b;
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
        if (!(obj instanceof s)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        s sVar = (s) obj;
        if (!Objects.equals(this.f3389c, sVar.f3389c) || !Objects.equals(this.d, sVar.d) || !Objects.equals(this.f3388b, sVar.f3388b) || !Arrays.equals(this.e, sVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3387a == 0) {
            int hashCode2 = this.f3388b.hashCode() * 31;
            String str = this.f3389c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3387a = Arrays.hashCode(this.e) + a1.g.f((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f3387a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f3388b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3389c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public s(Parcel parcel) {
        this.f3388b = new UUID(parcel.readLong(), parcel.readLong());
        this.f3389c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.n0.f9692a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
