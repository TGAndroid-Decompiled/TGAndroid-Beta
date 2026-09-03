package o3;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
import java.util.UUID;
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new l4.j(15);
    public int f16399a;
    public final UUID f16400b;
    public final String f16401c;
    public final String d;
    public final byte[] f16402e;

    public f(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f16400b = uuid;
        this.f16401c = str;
        str2.getClass();
        this.d = str2;
        this.f16402e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = j3.h.f9162a;
        UUID uuid3 = this.f16400b;
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
        if (!(obj instanceof f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        f fVar = (f) obj;
        if (!d0.a(this.f16401c, fVar.f16401c) || !d0.a(this.d, fVar.d) || !d0.a(this.f16400b, fVar.f16400b) || !Arrays.equals(this.f16402e, fVar.f16402e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f16399a == 0) {
            int hashCode2 = this.f16400b.hashCode() * 31;
            String str = this.f16401c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f16399a = Arrays.hashCode(this.f16402e) + l.d.e((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f16399a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f16400b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f16401c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f16402e);
    }

    public f(Parcel parcel) {
        this.f16400b = new UUID(parcel.readLong(), parcel.readLong());
        this.f16401c = parcel.readString();
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.d = readString;
        this.f16402e = parcel.createByteArray();
    }
}
