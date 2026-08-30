package o3;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.Arrays;
import java.util.UUID;
import kh.a2;
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new l4.j(15);
    public int f16257a;
    public final UUID f16258b;
    public final String f16259c;
    public final String d;
    public final byte[] e;

    public f(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f16258b = uuid;
        this.f16259c = str;
        str2.getClass();
        this.d = str2;
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = j3.h.f8593a;
        UUID uuid3 = this.f16258b;
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
        if (!d0.a(this.f16259c, fVar.f16259c) || !d0.a(this.d, fVar.d) || !d0.a(this.f16258b, fVar.f16258b) || !Arrays.equals(this.e, fVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f16257a == 0) {
            int hashCode2 = this.f16258b.hashCode() * 31;
            String str = this.f16259c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f16257a = Arrays.hashCode(this.e) + a2.e((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f16257a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f16258b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f16259c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public f(Parcel parcel) {
        this.f16258b = new UUID(parcel.readLong(), parcel.readLong());
        this.f16259c = parcel.readString();
        String readString = parcel.readString();
        int i10 = d0.f6937a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }
}
