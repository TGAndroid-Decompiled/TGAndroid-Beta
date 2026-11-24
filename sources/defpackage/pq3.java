package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class pq3 implements Parcelable {
    public static final Parcelable.Creator<pq3> CREATOR = new x21((byte) 16);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    public pq3(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String readString = parcel.readString();
        String str = g8c.a;
        this.d = readString;
        this.e = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = g51.b;
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
        if (!(obj instanceof pq3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        pq3 pq3Var = (pq3) obj;
        if (!Objects.equals(this.c, pq3Var.c) || !Objects.equals(this.d, pq3Var.d) || !Objects.equals(this.b, pq3Var.b) || !Arrays.equals(this.e, pq3Var.e)) {
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
            int hashCode3 = Arrays.hashCode(this.e) + ir2.j((hashCode2 + hashCode) * 31, 31, this.d);
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

    public pq3(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = ud7.n(str2);
        this.e = bArr;
    }
}
