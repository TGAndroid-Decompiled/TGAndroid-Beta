package a8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public abstract class bf {
    public static void A(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new androidx.car.app.j(a1.g.s(c3.h0.n("Expected size ", i11, " got ", i10, " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    public static void B(Parcel parcel, int i10, int i11) {
        int x9 = x(parcel, i10);
        if (x9 == i11) {
            return;
        }
        throw new androidx.car.app.j(a1.g.s(c3.h0.n("Expected size ", i11, " got ", x9, " (0x"), Integer.toHexString(x9), ")"), parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x9);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x9);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + x9);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + x9);
        return createIntArray;
    }

    public static ArrayList e(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + x9);
        return arrayList;
    }

    public static long[] f(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + x9);
        return createLongArray;
    }

    public static Parcelable g(Parcel parcel, int i10, Parcelable.Creator creator) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x9);
        return parcelable;
    }

    public static String h(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x9);
        return readString;
    }

    public static String[] i(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + x9);
        return createStringArray;
    }

    public static ArrayList j(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x9);
        return createStringArrayList;
    }

    public static Object[] k(Parcel parcel, int i10, Parcelable.Creator creator) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x9);
        return createTypedArray;
    }

    public static ArrayList l(Parcel parcel, int i10, Parcelable.Creator creator) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + x9);
        return createTypedArrayList;
    }

    public static void m(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new androidx.car.app.j(ic.a.i(i10, "Overread allowed size end="), parcel);
    }

    public static boolean n(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean o(Parcel parcel, int i10) {
        boolean z10;
        int x9 = x(parcel, i10);
        if (x9 == 0) {
            return null;
        }
        A(parcel, x9, 4);
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static byte p(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double q(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static float r(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        if (x9 == 0) {
            return null;
        }
        A(parcel, x9, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder t(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (x9 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x9);
        return readStrongBinder;
    }

    public static int u(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer v(Parcel parcel, int i10) {
        int x9 = x(parcel, i10);
        if (x9 == 0) {
            return null;
        }
        A(parcel, x9, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int i10) {
        if ((i10 & (-65536)) != -65536) {
            return (char) (i10 >> 16);
        }
        return parcel.readInt();
    }

    public static void y(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i10));
    }

    public static int z(Parcel parcel) {
        int readInt = parcel.readInt();
        int x9 = x(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == 20293) {
            int i10 = x9 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new androidx.car.app.j(a1.g.l(dataPosition, i10, "Size read is invalid start=", " end="), parcel);
        }
        throw new androidx.car.app.j("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }
}
