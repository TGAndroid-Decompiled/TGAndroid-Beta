package g7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public abstract class o8 {
    public static void A(Parcel parcel, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        throw new androidx.car.app.j(aa.d.r(e2.c.o("Expected size ", i10, " got ", i9, " (0x"), Integer.toHexString(i9), ")"), parcel);
    }

    public static void B(Parcel parcel, int i9, int i10) {
        int x10 = x(parcel, i9);
        if (x10 == i10) {
            return;
        }
        throw new androidx.car.app.j(aa.d.r(e2.c.o("Expected size ", i10, " got ", x10, " (0x"), Integer.toHexString(x10), ")"), parcel);
    }

    public static Bundle a(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x10);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            bArr[i10] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + x10);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + x10);
        return createIntArray;
    }

    public static ArrayList e(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + x10);
        return arrayList;
    }

    public static long[] f(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + x10);
        return createLongArray;
    }

    public static Parcelable g(Parcel parcel, int i9, Parcelable.Creator creator) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x10);
        return parcelable;
    }

    public static String h(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x10);
        return readString;
    }

    public static String[] i(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + x10);
        return createStringArray;
    }

    public static ArrayList j(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x10);
        return createStringArrayList;
    }

    public static Object[] k(Parcel parcel, int i9, Parcelable.Creator creator) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x10);
        return createTypedArray;
    }

    public static ArrayList l(Parcel parcel, int i9, Parcelable.Creator creator) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + x10);
        return createTypedArrayList;
    }

    public static void m(Parcel parcel, int i9) {
        if (parcel.dataPosition() == i9) {
            return;
        }
        throw new androidx.car.app.j(j3.r0.l(i9, "Overread allowed size end="), parcel);
    }

    public static boolean n(Parcel parcel, int i9) {
        B(parcel, i9, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean o(Parcel parcel, int i9) {
        boolean z10;
        int x10 = x(parcel, i9);
        if (x10 == 0) {
            return null;
        }
        A(parcel, x10, 4);
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static byte p(Parcel parcel, int i9) {
        B(parcel, i9, 4);
        return (byte) parcel.readInt();
    }

    public static double q(Parcel parcel, int i9) {
        B(parcel, i9, 8);
        return parcel.readDouble();
    }

    public static float r(Parcel parcel, int i9) {
        B(parcel, i9, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        if (x10 == 0) {
            return null;
        }
        A(parcel, x10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder t(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x10);
        return readStrongBinder;
    }

    public static int u(Parcel parcel, int i9) {
        B(parcel, i9, 4);
        return parcel.readInt();
    }

    public static Integer v(Parcel parcel, int i9) {
        int x10 = x(parcel, i9);
        if (x10 == 0) {
            return null;
        }
        A(parcel, x10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(Parcel parcel, int i9) {
        B(parcel, i9, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int i9) {
        if ((i9 & (-65536)) != -65536) {
            return (char) (i9 >> 16);
        }
        return parcel.readInt();
    }

    public static void y(Parcel parcel, int i9) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i9));
    }

    public static int z(Parcel parcel) {
        int readInt = parcel.readInt();
        int x10 = x(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == 20293) {
            int i9 = x10 + dataPosition;
            if (i9 >= dataPosition && i9 <= parcel.dataSize()) {
                return i9;
            }
            throw new androidx.car.app.j(aa.d.k(dataPosition, i9, "Size read is invalid start=", " end="), parcel);
        }
        throw new androidx.car.app.j("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }
}
