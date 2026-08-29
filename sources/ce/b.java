package ce;

import a4.w;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j7.l1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
public abstract class b {
    public static int A(Parcel parcel) {
        int readInt = parcel.readInt();
        int y8 = y(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 == 20293) {
            int i10 = y8 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a6.b(w.k(dataPosition, i10, "Size read is invalid start=", " end="), parcel);
        }
        throw new a6.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void B(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new a6.b(w.q(com.google.android.recaptcha.internal.a.o("Expected size ", i11, " got ", i10, " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    public static void C(Parcel parcel, int i10, int i11) {
        int y8 = y(parcel, i10);
        if (y8 == i11) {
            return;
        }
        throw new a6.b(w.q(com.google.android.recaptcha.internal.a.o("Expected size ", i11, " got ", y8, " (0x"), Integer.toHexString(y8), ")"), parcel);
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static Bundle b(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + y8);
        return readBundle;
    }

    public static byte[] c(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + y8);
        return createByteArray;
    }

    public static byte[][] d(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + y8);
        return bArr;
    }

    public static int[] e(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + y8);
        return createIntArray;
    }

    public static ArrayList f(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + y8);
        return arrayList;
    }

    public static long[] g(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + y8);
        return createLongArray;
    }

    public static Parcelable h(Parcel parcel, int i10, Parcelable.Creator creator) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + y8);
        return parcelable;
    }

    public static String i(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + y8);
        return readString;
    }

    public static String[] j(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + y8);
        return createStringArray;
    }

    public static ArrayList k(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + y8);
        return createStringArrayList;
    }

    public static Object[] l(Parcel parcel, int i10, Parcelable.Creator creator) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + y8);
        return createTypedArray;
    }

    public static ArrayList m(Parcel parcel, int i10, Parcelable.Creator creator) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + y8);
        return createTypedArrayList;
    }

    public static void n(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a6.b(l1.k(i10, "Overread allowed size end="), parcel);
    }

    public static boolean o(Parcel parcel, int i10) {
        C(parcel, i10, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean p(Parcel parcel, int i10) {
        boolean z10;
        int y8 = y(parcel, i10);
        if (y8 == 0) {
            return null;
        }
        B(parcel, y8, 4);
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static byte q(Parcel parcel, int i10) {
        C(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double r(Parcel parcel, int i10) {
        C(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static float s(Parcel parcel, int i10) {
        C(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float t(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        if (y8 == 0) {
            return null;
        }
        B(parcel, y8, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder u(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (y8 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + y8);
        return readStrongBinder;
    }

    public static int v(Parcel parcel, int i10) {
        C(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer w(Parcel parcel, int i10) {
        int y8 = y(parcel, i10);
        if (y8 == 0) {
            return null;
        }
        B(parcel, y8, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long x(Parcel parcel, int i10) {
        C(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int y(Parcel parcel, int i10) {
        if ((i10 & (-65536)) != -65536) {
            return (char) (i10 >> 16);
        }
        return parcel.readInt();
    }

    public static void z(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + y(parcel, i10));
    }
}
