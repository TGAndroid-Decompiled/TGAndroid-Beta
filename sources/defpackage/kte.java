package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public abstract class kte {
    public static yo9 a(byte[] bArr, Parcelable.Creator creator) {
        fre.h(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        yo9 yo9Var = (yo9) creator.createFromParcel(obtain);
        obtain.recycle();
        return yo9Var;
    }
}
