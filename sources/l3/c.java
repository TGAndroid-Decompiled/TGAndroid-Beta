package l3;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.Arrays;
import java.util.UUID;

public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new h5.h(21);

    public int f15386a;

    public final UUID f15387b;

    public final String f15388c;
    public final String d;

    public final byte[] f15389e;

    public c(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f15387b = uuid;
        this.f15388c = str;
        str2.getClass();
        this.d = str2;
        this.f15389e = bArr;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        c cVar = (c) obj;
        return g0.a(this.f15388c, cVar.f15388c) && g0.a(this.d, cVar.d) && g0.a(this.f15387b, cVar.f15387b) && Arrays.equals(this.f15389e, cVar.f15389e);
    }

    public final int hashCode() {
        if (this.f15386a == 0) {
            int iHashCode = this.f15387b.hashCode() * 31;
            String str = this.f15388c;
            this.f15386a = Arrays.hashCode(this.f15389e) + i0.a.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }
        return this.f15386a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f15387b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f15388c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f15389e);
    }

    public c(Parcel parcel) {
        this.f15387b = new UUID(parcel.readLong(), parcel.readLong());
        this.f15388c = parcel.readString();
        String string = parcel.readString();
        int i10 = g0.f4795a;
        this.d = string;
        this.f15389e = parcel.createByteArray();
    }
}
