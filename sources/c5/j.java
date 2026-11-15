package c5;

import android.os.Parcel;
import android.os.Parcelable;
import m.i3;
import m.v2;
import v4.y0;
public final class j implements Parcelable.ClassLoaderCreator {
    public final int f4146a;

    public j(int i7) {
        this.f4146a = i7;
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f4146a) {
            case 0:
                return new k(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return j1.b.f16758b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new v2(parcel, classLoader);
            case 3:
                return new i3(parcel, classLoader);
            default:
                return new y0(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f4146a) {
            case 0:
                return new k[i7];
            case 1:
                return new j1.b[i7];
            case 2:
                return new v2[i7];
            case 3:
                return new i3[i7];
            default:
                return new y0[i7];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4146a) {
            case 0:
                return new k(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return j1.b.f16758b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new v2(parcel, null);
            case 3:
                return new i3(parcel, null);
            default:
                return new y0(parcel, null);
        }
    }
}
