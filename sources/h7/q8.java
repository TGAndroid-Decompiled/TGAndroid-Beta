package h7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public abstract class q8 {
    public static void A(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        throw new a7.c(a9.p.p(com.google.android.recaptcha.internal.a.p("Expected size ", i11, " got ", i10, " (0x"), Integer.toHexString(i10), ")"), parcel);
    }

    public static void B(Parcel parcel, int i10, int i11) {
        int iX = x(parcel, i10);
        if (iX == i11) {
            return;
        }
        throw new a7.c(a9.p.p(com.google.android.recaptcha.internal.a.p("Expected size ", i11, " got ", iX, " (0x"), Integer.toHexString(iX), ")"), parcel);
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iX);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iX);
        return bArrCreateByteArray;
    }

    public static byte[][] c(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iX);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iX);
        return iArrCreateIntArray;
    }

    public static ArrayList e(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iX);
        return arrayList;
    }

    public static long[] f(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iX);
        return jArrCreateLongArray;
    }

    public static Parcelable g(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iX);
        return parcelable;
    }

    public static String h(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iX);
        return string;
    }

    public static String[] i(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iX);
        return strArrCreateStringArray;
    }

    public static ArrayList j(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iX);
        return arrayListCreateStringArrayList;
    }

    public static Object[] k(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return objArrCreateTypedArray;
    }

    public static ArrayList l(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return arrayListCreateTypedArrayList;
    }

    public static void m(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new a7.c(i0.a.k(i10, "Overread allowed size end="), parcel);
        }
    }

    public static boolean n(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean o(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        if (iX == 0) {
            return null;
        }
        A(parcel, iX, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
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
        int iX = x(parcel, i10);
        if (iX == 0) {
            return null;
        }
        A(parcel, iX, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder t(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iX);
        return strongBinder;
    }

    public static int u(Parcel parcel, int i10) {
        B(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer v(Parcel parcel, int i10) {
        int iX = x(parcel, i10);
        if (iX == 0) {
            return null;
        }
        A(parcel, iX, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long w(Parcel parcel, int i10) {
        B(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int x(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void y(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + x(parcel, i10));
    }

    public static int z(Parcel parcel) {
        int i10 = parcel.readInt();
        int iX = x(parcel, i10);
        char c10 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new a7.c("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iX + iDataPosition;
        if (i11 < iDataPosition || i11 > parcel.dataSize()) {
            throw new a7.c(a9.p.j(iDataPosition, i11, "Size read is invalid start=", " end="), parcel);
        }
        return i11;
    }
}
