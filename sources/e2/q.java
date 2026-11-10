package e2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new p(1);
    public int f10485a;
    public final UUID f10486b;
    public final String f10487c;
    public final String d;
    public final byte[] f10488e;

    public q(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f10486b = uuid;
        this.f10487c = str;
        str2.getClass();
        this.d = s0.n(str2);
        this.f10488e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = l.f10344b;
        UUID uuid3 = this.f10486b;
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
        if (!(obj instanceof q)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        q qVar = (q) obj;
        if (!Objects.equals(this.f10487c, qVar.f10487c) || !Objects.equals(this.d, qVar.d) || !Objects.equals(this.f10486b, qVar.f10486b) || !Arrays.equals(this.f10488e, qVar.f10488e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f10485a == 0) {
            int hashCode2 = this.f10486b.hashCode() * 31;
            String str = this.f10487c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f10485a = Arrays.hashCode(this.f10488e) + com.google.android.recaptcha.internal.a.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f10485a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f10486b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f10487c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f10488e);
    }

    public q(Parcel parcel) {
        this.f10486b = new UUID(parcel.readLong(), parcel.readLong());
        this.f10487c = parcel.readString();
        String readString = parcel.readString();
        String str = h2.m0.f14114a;
        this.d = readString;
        this.f10488e = parcel.createByteArray();
    }
}
