package f2;

import android.os.Parcel;
import android.os.Parcelable;
import m.m3;
import m.z2;
public final class g1 implements Parcelable.ClassLoaderCreator {
    public final int f6327a;

    public g1(int i10) {
        this.f6327a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f6327a) {
            case 0:
                return new h1(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.f8207b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new z2(parcel, classLoader);
            case 3:
                return new m3(parcel, classLoader);
            default:
                return new m2.f(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f6327a) {
            case 0:
                return new h1[i10];
            case 1:
                return new i1.b[i10];
            case 2:
                return new z2[i10];
            case 3:
                return new m3[i10];
            default:
                return new m2.f[i10];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6327a) {
            case 0:
                return new h1(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.f8207b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new z2(parcel, null);
            case 3:
                return new m3(parcel, null);
            default:
                return new m2.f(parcel, null);
        }
    }
}
