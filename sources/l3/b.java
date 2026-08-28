package l3;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import j3.r0;
import java.util.Arrays;
import java.util.UUID;
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new h5.h(14);
    public int f16629a;
    public final UUID f16630b;
    public final String f16631c;
    public final String d;
    public final byte[] f16632e;

    public b(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f16630b = uuid;
        this.f16631c = str;
        str2.getClass();
        this.d = str2;
        this.f16632e = bArr;
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
        if (!f0.a(this.f16631c, bVar.f16631c) || !f0.a(this.d, bVar.d) || !f0.a(this.f16630b, bVar.f16630b) || !Arrays.equals(this.f16632e, bVar.f16632e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f16629a == 0) {
            int hashCode2 = this.f16630b.hashCode() * 31;
            String str = this.f16631c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f16629a = Arrays.hashCode(this.f16632e) + r0.f((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f16629a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        UUID uuid = this.f16630b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f16631c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f16632e);
    }

    public b(Parcel parcel) {
        this.f16630b = new UUID(parcel.readLong(), parcel.readLong());
        this.f16631c = parcel.readString();
        String readString = parcel.readString();
        int i9 = f0.f4349a;
        this.d = readString;
        this.f16632e = parcel.createByteArray();
    }
}
