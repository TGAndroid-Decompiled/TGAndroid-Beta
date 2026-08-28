package f2;

import android.os.Parcel;
import android.os.Parcelable;
import m.n3;
import m.z2;
public final class j1 implements Parcelable.ClassLoaderCreator {
    public final int f5398a;

    public j1(int i9) {
        this.f5398a = i9;
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f5398a) {
            case 0:
                return new k1(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.f10869b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new z2(parcel, classLoader);
            case 3:
                return new n3(parcel, classLoader);
            default:
                return new m2.f(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f5398a) {
            case 0:
                return new k1[i9];
            case 1:
                return new i1.b[i9];
            case 2:
                return new z2[i9];
            case 3:
                return new n3[i9];
            default:
                return new m2.f[i9];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5398a) {
            case 0:
                return new k1(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.f10869b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new z2(parcel, null);
            case 3:
                return new n3(parcel, null);
            default:
                return new m2.f(parcel, null);
        }
    }
}
