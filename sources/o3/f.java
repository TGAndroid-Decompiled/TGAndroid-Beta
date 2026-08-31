package o3;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
import java.util.UUID;
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new l4.j(15);
    public int f16397a;
    public final UUID f16398b;
    public final String f16399c;
    public final String d;
    public final byte[] f16400e;

    public f(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f16398b = uuid;
        this.f16399c = str;
        str2.getClass();
        this.d = str2;
        this.f16400e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = j3.h.f9162a;
        UUID uuid3 = this.f16398b;
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
        if (!d0.a(this.f16399c, fVar.f16399c) || !d0.a(this.d, fVar.d) || !d0.a(this.f16398b, fVar.f16398b) || !Arrays.equals(this.f16400e, fVar.f16400e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f16397a == 0) {
            int hashCode2 = this.f16398b.hashCode() * 31;
            String str = this.f16399c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f16397a = Arrays.hashCode(this.f16400e) + l.d.e((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f16397a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f16398b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f16399c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f16400e);
    }

    public f(Parcel parcel) {
        this.f16398b = new UUID(parcel.readLong(), parcel.readLong());
        this.f16399c = parcel.readString();
        String readString = parcel.readString();
        int i10 = d0.f7237a;
        this.d = readString;
        this.f16400e = parcel.createByteArray();
    }
}
