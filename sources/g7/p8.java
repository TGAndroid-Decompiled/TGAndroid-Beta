package g7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public abstract class p8 {
    public static void a(Parcel parcel, int i9, Boolean bool) {
        if (bool == null) {
            return;
        }
        s(parcel, i9, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void b(Parcel parcel, int i9, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeBundle(bundle);
        r(parcel, q10);
    }

    public static void c(Parcel parcel, int i9, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeByteArray(bArr);
        r(parcel, q10);
    }

    public static void d(Parcel parcel, int i9, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        r(parcel, q10);
    }

    public static void e(Parcel parcel, int i9, Float f10) {
        if (f10 == null) {
            return;
        }
        s(parcel, i9, 4);
        parcel.writeFloat(f10.floatValue());
    }

    public static void f(Parcel parcel, int i9, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeStrongBinder(iBinder);
        r(parcel, q10);
    }

    public static void g(Parcel parcel, int i9, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeIntArray(iArr);
        r(parcel, q10);
    }

    public static void h(Parcel parcel, int i9, List list) {
        if (list == null) {
            return;
        }
        int q10 = q(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(((Integer) list.get(i10)).intValue());
        }
        r(parcel, q10);
    }

    public static void i(Parcel parcel, int i9, Integer num) {
        if (num == null) {
            return;
        }
        s(parcel, i9, 4);
        parcel.writeInt(num.intValue());
    }

    public static void j(Parcel parcel, int i9, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeLongArray(jArr);
        r(parcel, q10);
    }

    public static void k(Parcel parcel, int i9, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcelable.writeToParcel(parcel, i10);
        r(parcel, q10);
    }

    public static void l(Parcel parcel, int i9, String str) {
        if (str == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeString(str);
        r(parcel, q10);
    }

    public static void m(Parcel parcel, int i9, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeStringArray(strArr);
        r(parcel, q10);
    }

    public static void n(Parcel parcel, int i9, List list) {
        if (list == null) {
            return;
        }
        int q10 = q(parcel, i9);
        parcel.writeStringList(list);
        r(parcel, q10);
    }

    public static void o(Parcel parcel, int i9, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int q10 = q(parcel, i9);
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
        r(parcel, q10);
    }

    public static void p(Parcel parcel, int i9, List list) {
        if (list == null) {
            return;
        }
        int q10 = q(parcel, i9);
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
        r(parcel, q10);
    }

    public static int q(Parcel parcel, int i9) {
        parcel.writeInt(i9 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void r(Parcel parcel, int i9) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i9 - 4);
        parcel.writeInt(dataPosition - i9);
        parcel.setDataPosition(dataPosition);
    }

    public static void s(Parcel parcel, int i9, int i10) {
        parcel.writeInt(i9 | (i10 << 16));
    }
}
