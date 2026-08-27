package h7;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class s8 {
    public static z5.b a(byte[] bArr, Parcelable.Creator creator) {
        y5.l.h(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        z5.b bVar = (z5.b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bVar;
    }
}
