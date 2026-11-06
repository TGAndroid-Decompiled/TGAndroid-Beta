package e2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new p(1);
    public int f10480a;
    public final UUID f10481b;
    public final String f10482c;
    public final String d;
    public final byte[] f10483e;

    public q(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f10481b = uuid;
        this.f10482c = str;
        str2.getClass();
        this.d = s0.n(str2);
        this.f10483e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = l.f10339b;
        UUID uuid3 = this.f10481b;
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
        if (!Objects.equals(this.f10482c, qVar.f10482c) || !Objects.equals(this.d, qVar.d) || !Objects.equals(this.f10481b, qVar.f10481b) || !Arrays.equals(this.f10483e, qVar.f10483e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f10480a == 0) {
            int hashCode2 = this.f10481b.hashCode() * 31;
            String str = this.f10482c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f10480a = Arrays.hashCode(this.f10483e) + com.google.android.recaptcha.internal.a.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f10480a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f10481b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f10482c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f10483e);
    }

    public q(Parcel parcel) {
        this.f10481b = new UUID(parcel.readLong(), parcel.readLong());
        this.f10482c = parcel.readString();
        String readString = parcel.readString();
        String str = h2.m0.f14112a;
        this.d = readString;
        this.f10483e = parcel.createByteArray();
    }
}
