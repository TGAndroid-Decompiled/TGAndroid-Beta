package i1;

import android.os.Parcel;
import android.os.Parcelable;
import m.j3;
import m.w2;
import s4.w0;
import z4.f;
public final class b implements Parcelable.ClassLoaderCreator {
    public final int f11472a;

    public b(int i10) {
        this.f11472a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f11472a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f11473b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new w2(parcel, classLoader);
            case 2:
                return new j3(parcel, classLoader);
            case 3:
                return new w0(parcel, classLoader);
            default:
                return new f(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f11472a) {
            case 0:
                return new c[i10];
            case 1:
                return new w2[i10];
            case 2:
                return new j3[i10];
            case 3:
                return new w0[i10];
            default:
                return new f[i10];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11472a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f11473b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new w2(parcel, null);
            case 2:
                return new j3(parcel, null);
            case 3:
                return new w0(parcel, null);
            default:
                return new f(parcel, null);
        }
    }
}
