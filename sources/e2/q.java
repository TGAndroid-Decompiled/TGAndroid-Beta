package e2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new p(1);
    public int f10631a;
    public final UUID f10632b;
    public final String f10633c;
    public final String d;
    public final byte[] f10634e;

    public q(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f10632b = uuid;
        this.f10633c = str;
        str2.getClass();
        this.d = s0.n(str2);
        this.f10634e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = l.f10490b;
        UUID uuid3 = this.f10632b;
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
        if (!Objects.equals(this.f10633c, qVar.f10633c) || !Objects.equals(this.d, qVar.d) || !Objects.equals(this.f10632b, qVar.f10632b) || !Arrays.equals(this.f10634e, qVar.f10634e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f10631a == 0) {
            int hashCode2 = this.f10632b.hashCode() * 31;
            String str = this.f10633c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f10631a = Arrays.hashCode(this.f10634e) + e2.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f10631a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f10632b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f10633c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f10634e);
    }

    public q(Parcel parcel) {
        this.f10632b = new UUID(parcel.readLong(), parcel.readLong());
        this.f10633c = parcel.readString();
        String readString = parcel.readString();
        String str = h2.l0.f13783a;
        this.d = readString;
        this.f10634e = parcel.createByteArray();
    }
}
