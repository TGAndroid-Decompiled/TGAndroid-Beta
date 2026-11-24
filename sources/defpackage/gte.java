package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public abstract class gte {
    public static void A(Parcel parcel, int i, int i2) {
        int x = x(parcel, i);
        if (x == i2) {
            return;
        }
        String hexString = Integer.toHexString(x);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(x).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + length2 + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(x);
        throw new gp2(ls6.o(" (0x", hexString, ")", sb), parcel);
    }

    public static void B(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + length2 + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new gp2(ls6.o(" (0x", hexString, ")", sb), parcel);
    }

    public static Bundle a(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + x);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + x);
        return createIntArray;
    }

    public static ArrayList e(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + x);
        return arrayList;
    }

    public static long[] f(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + x);
        return createLongArray;
    }

    public static Parcelable g(Parcel parcel, int i, Parcelable.Creator creator) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x);
        return parcelable;
    }

    public static String h(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x);
        return readString;
    }

    public static String[] i(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + x);
        return createStringArray;
    }

    public static ArrayList j(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x);
        return createStringArrayList;
    }

    public static Object[] k(Parcel parcel, int i, Parcelable.Creator creator) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x);
        return createTypedArray;
    }

    public static ArrayList l(Parcel parcel, int i, Parcelable.Creator creator) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + x);
        return createTypedArrayList;
    }

    public static void m(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new gp2(sb.toString(), parcel);
    }

    public static boolean n(Parcel parcel, int i) {
        A(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean o(Parcel parcel, int i) {
        boolean z;
        int x = x(parcel, i);
        if (x == 0) {
            return null;
        }
        B(parcel, x, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static byte p(Parcel parcel, int i) {
        A(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double q(Parcel parcel, int i) {
        A(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float r(Parcel parcel, int i) {
        A(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i) {
        int x = x(parcel, i);
        if (x == 0) {
            return null;
        }
        B(parcel, x, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder t(Parcel parcel, int i) {
        int x = x(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (x == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x);
        return readStrongBinder;
    }

    public static int u(Parcel parcel, int i) {
        A(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer v(Parcel parcel, int i) {
        int x = x(parcel, i);
        if (x == 0) {
            return null;
        }
        B(parcel, x, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(Parcel parcel, int i) {
        A(parcel, i, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static void y(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i));
    }

    public static int z(Parcel parcel) {
        int readInt = parcel.readInt();
        int x = x(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c == 20293) {
            int i = x + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new gp2(sb.toString(), parcel);
        }
        throw new gp2("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }
}
