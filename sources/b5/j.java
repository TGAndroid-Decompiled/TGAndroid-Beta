package b5;

import android.os.Parcel;
import android.os.Parcelable;
import m.i3;
import m.v2;
import u4.x0;
public final class j implements Parcelable.ClassLoaderCreator {
    public final int f2408a;

    public j(int i3) {
        this.f2408a = i3;
    }

    @Override
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2408a) {
            case 0:
                return new k(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return i1.b.f14516b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new v2(parcel, classLoader);
            case 3:
                return new i3(parcel, classLoader);
            default:
                return new x0(parcel, classLoader);
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f2408a) {
            case 0:
                return new k[i3];
            case 1:
                return new i1.b[i3];
            case 2:
                return new v2[i3];
            case 3:
                return new i3[i3];
            default:
                return new x0[i3];
        }
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2408a) {
            case 0:
                return new k(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return i1.b.f14516b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new v2(parcel, null);
            case 3:
                return new i3(parcel, null);
            default:
                return new x0(parcel, null);
        }
    }
}
