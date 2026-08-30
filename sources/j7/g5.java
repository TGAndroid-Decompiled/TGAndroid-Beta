package j7;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class g5 {
    public static c6.b a(byte[] bArr, Parcelable.Creator creator) {
        b6.m.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        c6.b bVar = (c6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
