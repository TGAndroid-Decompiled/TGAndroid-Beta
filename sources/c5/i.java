package c5;

import android.os.Parcel;
import android.os.Parcelable;
import m.k3;
import m.w2;
import v4.x0;
public final class i implements Parcelable.ClassLoaderCreator {
    public final int f5320a;

    public i(int i7) {
        this.f5320a = i7;
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f5320a) {
            case 0:
                return new j(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return j1.b.f16401b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new w2(parcel, classLoader);
            case 3:
                return new k3(parcel, classLoader);
            default:
                return new x0(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f5320a) {
            case 0:
                return new j[i7];
            case 1:
                return new j1.b[i7];
            case 2:
                return new w2[i7];
            case 3:
                return new k3[i7];
            default:
                return new x0[i7];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5320a) {
            case 0:
                return new j(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return j1.b.f16401b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new w2(parcel, null);
            case 3:
                return new k3(parcel, null);
            default:
                return new x0(parcel, null);
        }
    }
}
