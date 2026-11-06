package c8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public abstract class wb {
    public static void A(Parcel parcel, int i7, int i10) {
        int x10 = x(parcel, i7);
        if (x10 == i10) {
            return;
        }
        String hexString = Integer.toHexString(x10);
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(x10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + length2 + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(x10);
        throw new androidx.car.app.j(org.telegram.ui.Cells.f1.n(" (0x", hexString, ")", sb2), parcel);
    }

    public static void B(Parcel parcel, int i7, int i10) {
        if (i7 == i10) {
            return;
        }
        String hexString = Integer.toHexString(i7);
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(i7).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + length2 + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i10);
        sb2.append(" got ");
        sb2.append(i7);
        throw new androidx.car.app.j(org.telegram.ui.Cells.f1.n(" (0x", hexString, ")", sb2), parcel);
    }

    public static Bundle a(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + x10);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + x10);
        return createByteArray;
    }

    public static byte[][] c(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
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

    public static int[] d(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + x10);
        return createIntArray;
    }

    public static ArrayList e(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
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

    public static long[] f(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + x10);
        return createLongArray;
    }

    public static Parcelable g(Parcel parcel, int i7, Parcelable.Creator creator) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + x10);
        return parcelable;
    }

    public static String h(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + x10);
        return readString;
    }

    public static String[] i(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + x10);
        return createStringArray;
    }

    public static ArrayList j(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + x10);
        return createStringArrayList;
    }

    public static Object[] k(Parcel parcel, int i7, Parcelable.Creator creator) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + x10);
        return createTypedArray;
    }

    public static ArrayList l(Parcel parcel, int i7, Parcelable.Creator creator) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + x10);
        return createTypedArrayList;
    }

    public static void m(Parcel parcel, int i7) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i7);
        throw new androidx.car.app.j(sb2.toString(), parcel);
    }

    public static boolean n(Parcel parcel, int i7) {
        A(parcel, i7, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean o(Parcel parcel, int i7) {
        boolean z9;
        int x10 = x(parcel, i7);
        if (x10 == 0) {
            return null;
        }
        B(parcel, x10, 4);
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    public static byte p(Parcel parcel, int i7) {
        A(parcel, i7, 4);
        return (byte) parcel.readInt();
    }

    public static double q(Parcel parcel, int i7) {
        A(parcel, i7, 8);
        return parcel.readDouble();
    }

    public static float r(Parcel parcel, int i7) {
        A(parcel, i7, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        if (x10 == 0) {
            return null;
        }
        B(parcel, x10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder t(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        int dataPosition = parcel.dataPosition();
        if (x10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + x10);
        return readStrongBinder;
    }

    public static int u(Parcel parcel, int i7) {
        A(parcel, i7, 4);
        return parcel.readInt();
    }

    public static Integer v(Parcel parcel, int i7) {
        int x10 = x(parcel, i7);
        if (x10 == 0) {
            return null;
        }
        B(parcel, x10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(Parcel parcel, int i7) {
        A(parcel, i7, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int i7) {
        if ((i7 & (-65536)) != -65536) {
            return (char) (i7 >> 16);
        }
        return parcel.readInt();
    }

    public static void y(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i7));
    }

    public static int z(Parcel parcel) {
        int readInt = parcel.readInt();
        int x10 = x(parcel, readInt);
        char c10 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c10 == 20293) {
            int i7 = x10 + dataPosition;
            if (i7 >= dataPosition && i7 <= parcel.dataSize()) {
                return i7;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i7).length());
            sb2.append("Size read is invalid start=");
            sb2.append(dataPosition);
            sb2.append(" end=");
            sb2.append(i7);
            throw new androidx.car.app.j(sb2.toString(), parcel);
        }
        throw new androidx.car.app.j("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }
}
