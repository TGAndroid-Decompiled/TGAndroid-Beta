package c8;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class xb {
    public static r6.b a(byte[] bArr, Parcelable.Creator creator) {
        q6.m.g(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        r6.b bVar = (r6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
