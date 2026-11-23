package e2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new p(1);
    public int f10626a;
    public final UUID f10627b;
    public final String f10628c;
    public final String d;
    public final byte[] f10629e;

    public q(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f10627b = uuid;
        this.f10628c = str;
        str2.getClass();
        this.d = s0.n(str2);
        this.f10629e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = l.f10485b;
        UUID uuid3 = this.f10627b;
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
        if (!Objects.equals(this.f10628c, qVar.f10628c) || !Objects.equals(this.d, qVar.d) || !Objects.equals(this.f10627b, qVar.f10627b) || !Arrays.equals(this.f10629e, qVar.f10629e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f10626a == 0) {
            int hashCode2 = this.f10627b.hashCode() * 31;
            String str = this.f10628c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f10626a = Arrays.hashCode(this.f10629e) + e2.h((hashCode2 + hashCode) * 31, 31, this.d);
        }
        return this.f10626a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        UUID uuid = this.f10627b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f10628c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f10629e);
    }

    public q(Parcel parcel) {
        this.f10627b = new UUID(parcel.readLong(), parcel.readLong());
        this.f10628c = parcel.readString();
        String readString = parcel.readString();
        String str = h2.l0.f13778a;
        this.d = readString;
        this.f10629e = parcel.createByteArray();
    }
}
