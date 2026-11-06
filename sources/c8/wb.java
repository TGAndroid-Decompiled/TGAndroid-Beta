package c8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public abstract class wb {
    public static void a(Parcel parcel, int i7, Boolean bool) {
        if (bool == null) {
            return;
        }
        q(parcel, i7, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void b(Parcel parcel, int i7, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeBundle(bundle);
        s(parcel, r10);
    }

    public static void c(Parcel parcel, int i7, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeByteArray(bArr);
        s(parcel, r10);
    }

    public static void d(Parcel parcel, int i7, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        s(parcel, r10);
    }

    public static void e(Parcel parcel, int i7, Float f10) {
        if (f10 == null) {
            return;
        }
        q(parcel, i7, 4);
        parcel.writeFloat(f10.floatValue());
    }

    public static void f(Parcel parcel, int i7, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeStrongBinder(iBinder);
        s(parcel, r10);
    }

    public static void g(Parcel parcel, int i7, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeIntArray(iArr);
        s(parcel, r10);
    }

    public static void h(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int r10 = r(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(((Integer) list.get(i10)).intValue());
        }
        s(parcel, r10);
    }

    public static void i(Parcel parcel, int i7, Integer num) {
        if (num == null) {
            return;
        }
        q(parcel, i7, 4);
        parcel.writeInt(num.intValue());
    }

    public static void j(Parcel parcel, int i7, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeLongArray(jArr);
        s(parcel, r10);
    }

    public static void k(Parcel parcel, int i7, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcelable.writeToParcel(parcel, i10);
        s(parcel, r10);
    }

    public static void l(Parcel parcel, int i7, String str) {
        if (str == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeString(str);
        s(parcel, r10);
    }

    public static void m(Parcel parcel, int i7, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeStringArray(strArr);
        s(parcel, r10);
    }

    public static void n(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeStringList(list);
        s(parcel, r10);
    }

    public static void o(Parcel parcel, int i7, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int r10 = r(parcel, i7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        s(parcel, r10);
    }

    public static void p(Parcel parcel, int i7, List list) {
        if (list == null) {
            return;
        }
        int r10 = r(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
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
        s(parcel, r10);
    }

    public static void q(Parcel parcel, int i7, int i10) {
        parcel.writeInt(i7 | (i10 << 16));
    }

    public static int r(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void s(Parcel parcel, int i7) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(dataPosition - i7);
        parcel.setDataPosition(dataPosition);
    }
}
