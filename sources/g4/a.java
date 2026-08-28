package g4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import f8.r;
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new r(15);
    public final long f7076a;
    public final long f7077b;
    public final byte[] f7078c;

    public a(long j10, long j11, byte[] bArr) {
        this.f7076a = j11;
        this.f7077b = j10;
        this.f7078c = bArr;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f7076a);
        parcel.writeLong(this.f7077b);
        parcel.writeByteArray(this.f7078c);
    }

    public a(Parcel parcel) {
        this.f7076a = parcel.readLong();
        this.f7077b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i9 = f0.f4349a;
        this.f7078c = createByteArray;
    }
}
