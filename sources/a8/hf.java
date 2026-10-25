package a8;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class hf {
    public static p6.b a(byte[] bArr, Parcelable.Creator creator) {
        o6.l.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        p6.b bVar = (p6.b) creator.createFromParcel(obtain);
        obtain.recycle();
        return bVar;
    }
}
