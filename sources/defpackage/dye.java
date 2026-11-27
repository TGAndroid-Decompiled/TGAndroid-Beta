package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class dye {
    public static qs9 a(byte[] bArr, Parcelable.Creator creator) {
        xve.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        qs9 qs9Var = (qs9) creator.createFromParcel(obtain);
        obtain.recycle();
        return qs9Var;
    }
}
