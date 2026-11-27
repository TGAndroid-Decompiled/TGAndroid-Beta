package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class w1 implements Parcelable.ClassLoaderCreator {
    public final byte a;

    public w1(byte b) {
        this.a = b;
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return x1.b;
                }
                grb.i("superState must be null");
                return null;
            case 1:
                return new z79(parcel, classLoader);
            case 2:
                return new ww9(parcel, classLoader);
            case 3:
                return new hxb(parcel, classLoader);
            default:
                return new eic(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x1[i];
            case 1:
                return new z79[i];
            case 2:
                return new ww9[i];
            case 3:
                return new hxb[i];
            default:
                return new eic[i];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return x1.b;
                }
                grb.i("superState must be null");
                return null;
            case 1:
                return new z79(parcel, null);
            case 2:
                return new ww9(parcel, null);
            case 3:
                return new hxb(parcel, null);
            default:
                return new eic(parcel, null);
        }
    }
}
