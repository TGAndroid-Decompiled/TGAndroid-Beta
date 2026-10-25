package a5;

import android.os.Parcel;
import android.os.Parcelable;
import m.l3;
import m.x2;
import s4.y0;
public final class k implements Parcelable.ClassLoaderCreator {
    public final int f295a;

    public k(int i10) {
        this.f295a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f295a) {
            case 0:
                return new l(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.f13470b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new x2(parcel, classLoader);
            case 3:
                return new l3(parcel, classLoader);
            default:
                return new y0(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f295a) {
            case 0:
                return new l[i10];
            case 1:
                return new i1.b[i10];
            case 2:
                return new x2[i10];
            case 3:
                return new l3[i10];
            default:
                return new y0[i10];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f295a) {
            case 0:
                return new l(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.f13470b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new x2(parcel, null);
            case 3:
                return new l3(parcel, null);
            default:
                return new y0(parcel, null);
        }
    }
}
