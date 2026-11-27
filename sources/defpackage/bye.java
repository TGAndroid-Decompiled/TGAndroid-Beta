package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public abstract class bye {
    public static void a(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        q(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void b(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeBundle(bundle);
        s(parcel, r);
    }

    public static void c(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeByteArray(bArr);
        s(parcel, r);
    }

    public static void d(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        s(parcel, r);
    }

    public static void e(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        q(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void f(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeStrongBinder(iBinder);
        s(parcel, r);
    }

    public static void g(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeIntArray(iArr);
        s(parcel, r);
    }

    public static void h(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int r = r(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        s(parcel, r);
    }

    public static void i(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        q(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void j(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeLongArray(jArr);
        s(parcel, r);
    }

    public static void k(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int r = r(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        s(parcel, r);
    }

    public static void l(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeString(str);
        s(parcel, r);
    }

    public static void m(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeStringArray(strArr);
        s(parcel, r);
    }

    public static void n(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeStringList(list);
        s(parcel, r);
    }

    public static void o(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int r = r(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        s(parcel, r);
    }

    public static void p(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int r = r(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        s(parcel, r);
    }

    public static void q(Parcel parcel, int i, int i2) {
        parcel.writeInt((i2 << 16) | i);
    }

    public static int r(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void s(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
