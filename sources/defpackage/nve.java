package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class nve {
    public static zq9 a(byte[] bArr, Parcelable.Creator creator) {
        ite.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        zq9 zq9Var = (zq9) creator.createFromParcel(obtain);
        obtain.recycle();
        return zq9Var;
    }
}
