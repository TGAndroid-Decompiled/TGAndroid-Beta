package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class zr3 implements Parcelable {
    public static final Parcelable.Creator<zr3> CREATOR = new f41((byte) 16);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    public zr3(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String readString = parcel.readString();
        String str = hac.a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = n61.b;
        UUID uuid3 = this.b;
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
        if (!(obj instanceof zr3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zr3 zr3Var = (zr3) obj;
        if (!Objects.equals(this.c, zr3Var.c) || !Objects.equals(this.d, zr3Var.d) || !Objects.equals(this.b, zr3Var.b) || !Arrays.equals(this.e, zr3Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.a;
        if (i == 0) {
            int hashCode2 = this.b.hashCode() * 31;
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = Arrays.hashCode(this.e) + ts2.j((hashCode2 + hashCode) * 31, 31, this.d);
            this.a = hashCode3;
            return hashCode3;
        }
        return i;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public zr3(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = wf7.n(str2);
        this.e = bArr;
    }
}
