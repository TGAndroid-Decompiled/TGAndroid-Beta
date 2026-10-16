package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new r(1);
    public int f2324a;
    public final UUID f2325b;
    public final String f2326c;
    public final String d;
    public final byte[] e;

    public s(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f2325b = uuid;
        this.f2326c = str;
        str2.getClass();
        this.d = w0.n(str2);
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = n.f2221b;
        UUID uuid3 = this.f2325b;
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
        if (!Objects.equals(this.f2326c, sVar.f2326c) || !Objects.equals(this.d, sVar.d) || !Objects.equals(this.f2325b, sVar.f2325b) || !Arrays.equals(this.e, sVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f2324a == 0) {
            int hashCode2 = this.f2325b.hashCode() * 31;
            String str = this.f2326c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f2324a = Arrays.hashCode(this.e) + a1.g.g((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f2324a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f2325b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f2326c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public s(Parcel parcel) {
        this.f2325b = new UUID(parcel.readLong(), parcel.readLong());
        this.f2326c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.m0.f8375a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
