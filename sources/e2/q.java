package e2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new p(1);
    public int f10634a;
    public final UUID f10635b;
    public final String f10636c;
    public final String d;
    public final byte[] f10637e;

    public q(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f10635b = uuid;
        this.f10636c = str;
        str2.getClass();
        this.d = s0.n(str2);
        this.f10637e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = l.f10493b;
        UUID uuid3 = this.f10635b;
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
        if (!Objects.equals(this.f10636c, qVar.f10636c) || !Objects.equals(this.d, qVar.d) || !Objects.equals(this.f10635b, qVar.f10635b) || !Arrays.equals(this.f10637e, qVar.f10637e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f10634a == 0) {
            int hashCode2 = this.f10635b.hashCode() * 31;
            String str = this.f10636c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f10634a = Arrays.hashCode(this.f10637e) + e2.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f10634a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f10635b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f10636c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f10637e);
    }

    public q(Parcel parcel) {
        this.f10635b = new UUID(parcel.readLong(), parcel.readLong());
        this.f10636c = parcel.readString();
        String readString = parcel.readString();
        String str = h2.l0.f13786a;
        this.d = readString;
        this.f10637e = parcel.createByteArray();
    }
}
