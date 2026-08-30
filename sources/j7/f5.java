package j7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
public abstract class f5 {
    public static void a(Parcel parcel, int i10, Boolean bool) {
        if (bool == null) {
            return;
        }
        s(parcel, i10, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void b(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeBundle(bundle);
        r(parcel, q10);
    }

    public static void c(Parcel parcel, int i10, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeByteArray(bArr);
        r(parcel, q10);
    }

    public static void d(Parcel parcel, int i10, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        r(parcel, q10);
    }

    public static void e(Parcel parcel, int i10, Float f10) {
        if (f10 == null) {
            return;
        }
        s(parcel, i10, 4);
        parcel.writeFloat(f10.floatValue());
    }

    public static void f(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        r(parcel, q10);
    }

    public static void g(Parcel parcel, int i10, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeIntArray(iArr);
        r(parcel, q10);
    }

    public static void h(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int q10 = q(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(((Integer) list.get(i11)).intValue());
        }
        r(parcel, q10);
    }

    public static void i(Parcel parcel, int i10, Integer num) {
        if (num == null) {
            return;
        }
        s(parcel, i10, 4);
        parcel.writeInt(num.intValue());
    }

    public static void j(Parcel parcel, int i10, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeLongArray(jArr);
        r(parcel, q10);
    }

    public static void k(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        r(parcel, q10);
    }

    public static void l(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeString(str);
        r(parcel, q10);
    }

    public static void m(Parcel parcel, int i10, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeStringArray(strArr);
        r(parcel, q10);
    }

    public static void n(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeStringList(list);
        r(parcel, q10);
    }

    public static void o(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int q10 = q(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        r(parcel, q10);
    }

    public static void p(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int q10 = q(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
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

    public static int q(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void r(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static void s(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
