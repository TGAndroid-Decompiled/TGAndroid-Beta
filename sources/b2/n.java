package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public int f3446a;
    public final UUID f3447b;
    public final String f3448c;
    public final String d;
    public final byte[] f3449e;

    public n(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f3447b = uuid;
        this.f3448c = str;
        str2.getClass();
        this.d = r0.n(str2);
        this.f3449e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = i.f3333a;
        UUID uuid3 = this.f3447b;
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
        if (!Objects.equals(this.f3448c, nVar.f3448c) || !Objects.equals(this.d, nVar.d) || !Objects.equals(this.f3447b, nVar.f3447b) || !Arrays.equals(this.f3449e, nVar.f3449e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f3446a == 0) {
            int hashCode2 = this.f3447b.hashCode() * 31;
            String str = this.f3448c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f3446a = Arrays.hashCode(this.f3449e) + a1.g.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f3446a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f3447b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f3448c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f3449e);
    }

    public n(Parcel parcel) {
        this.f3447b = new UUID(parcel.readLong(), parcel.readLong());
        this.f3448c = parcel.readString();
        String readString = parcel.readString();
        String str = e2.d0.f8532a;
        this.d = readString;
        this.f3449e = parcel.createByteArray();
    }
}
