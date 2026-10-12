package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new r(1);
    public int f2320a;
    public final UUID f2321b;
    public final String f2322c;
    public final String d;
    public final byte[] e;

    public s(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f2321b = uuid;
        this.f2322c = str;
        str2.getClass();
        this.d = w0.n(str2);
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = n.f2217b;
        UUID uuid3 = this.f2321b;
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
        if (!Objects.equals(this.f2322c, sVar.f2322c) || !Objects.equals(this.d, sVar.d) || !Objects.equals(this.f2321b, sVar.f2321b) || !Arrays.equals(this.e, sVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f2320a == 0) {
            int hashCode2 = this.f2321b.hashCode() * 31;
            String str = this.f2322c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f2320a = Arrays.hashCode(this.e) + a1.g.g((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f2320a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f2321b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2322c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public s(Parcel parcel) {
        this.f2321b = new UUID(parcel.readLong(), parcel.readLong());
        this.f2322c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.m0.f8372a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
