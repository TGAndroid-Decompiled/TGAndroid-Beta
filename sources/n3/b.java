package n3;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j7.l1;
import java.util.Arrays;
import java.util.UUID;
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new i4.g(27);
    public int f17096a;
    public final UUID f17097b;
    public final String f17098c;
    public final String d;
    public final byte[] f17099e;

    public b(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f17097b = uuid;
        this.f17098c = str;
        str2.getClass();
        this.d = str2;
        this.f17099e = bArr;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        if (!d0.a(this.f17098c, bVar.f17098c) || !d0.a(this.d, bVar.d) || !d0.a(this.f17097b, bVar.f17097b) || !Arrays.equals(this.f17099e, bVar.f17099e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f17096a == 0) {
            int hashCode2 = this.f17097b.hashCode() * 31;
            String str = this.f17098c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f17096a = Arrays.hashCode(this.f17099e) + l1.f((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f17096a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f17097b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f17098c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f17099e);
    }

    public b(Parcel parcel) {
        this.f17097b = new UUID(parcel.readLong(), parcel.readLong());
        this.f17098c = parcel.readString();
        String readString = parcel.readString();
        int i10 = d0.f6579a;
        this.d = readString;
        this.f17099e = parcel.createByteArray();
    }
}
