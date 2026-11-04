package j8;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import b8.fd;
import b8.nd;
import b8.wd;
import java.util.List;
import k8.d;
import m6.f;
import p6.m;
import u7.e;
public abstract class a {
    public static boolean f16212a = false;
    public static int f16213b = 1;

    public static synchronized int a(Context context) {
        String str;
        synchronized (a.class) {
            try {
                m.h(context, "Context is null");
                Log.d("a", "preferredRenderer: ".concat("null"));
                if (f16212a) {
                    return 0;
                }
                try {
                    d a10 = nd.a(context);
                    try {
                        k8.a X0 = a10.X0();
                        m.g(X0);
                        fd.f2607a = X0;
                        e Z0 = a10.Z0();
                        if (wd.f3110a == null) {
                            m.h(Z0, "delegate must not be null");
                            wd.f3110a = Z0;
                        }
                        f16212a = true;
                        try {
                            Parcel O0 = a10.O0(a10.P0(), 9);
                            int readInt = O0.readInt();
                            O0.recycle();
                            if (readInt == 2) {
                                f16213b = 2;
                            }
                            z6.b bVar = new z6.b(context);
                            Parcel P0 = a10.P0();
                            u7.b.c(P0, bVar);
                            P0.writeInt(0);
                            a10.T0(P0, 10);
                        } catch (RemoteException e10) {
                            Log.e("a", "Failed to retrieve renderer type or log initialization.", e10);
                        }
                        int i3 = f16213b;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                str = "null";
                            } else {
                                str = "LATEST";
                            }
                        } else {
                            str = "LEGACY";
                        }
                        Log.d("a", "loadedRenderer: ".concat(str));
                        return 0;
                    } catch (RemoteException e11) {
                        throw new RuntimeException(e11);
                    }
                } catch (f e12) {
                    return e12.f19190a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(Parcel parcel, int i3, Boolean bool) {
        if (bool == null) {
            return;
        }
        r(parcel, i3, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void c(Parcel parcel, int i3, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeBundle(bundle);
        t(parcel, s6);
    }

    public static void d(Parcel parcel, int i3, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeByteArray(bArr);
        t(parcel, s6);
    }

    public static void e(Parcel parcel, int i3, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        t(parcel, s6);
    }

    public static void f(Parcel parcel, int i3, Float f10) {
        if (f10 == null) {
            return;
        }
        r(parcel, i3, 4);
        parcel.writeFloat(f10.floatValue());
    }

    public static void g(Parcel parcel, int i3, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeStrongBinder(iBinder);
        t(parcel, s6);
    }

    public static void h(Parcel parcel, int i3, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeIntArray(iArr);
        t(parcel, s6);
    }

    public static void i(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int s6 = s(parcel, i3);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(((Integer) list.get(i10)).intValue());
        }
        t(parcel, s6);
    }

    public static void j(Parcel parcel, int i3, Integer num) {
        if (num == null) {
            return;
        }
        r(parcel, i3, 4);
        parcel.writeInt(num.intValue());
    }

    public static void k(Parcel parcel, int i3, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeLongArray(jArr);
        t(parcel, s6);
    }

    public static void l(Parcel parcel, int i3, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcelable.writeToParcel(parcel, i10);
        t(parcel, s6);
    }

    public static void m(Parcel parcel, int i3, String str) {
        if (str == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeString(str);
        t(parcel, s6);
    }

    public static void n(Parcel parcel, int i3, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeStringArray(strArr);
        t(parcel, s6);
    }

    public static void o(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int s6 = s(parcel, i3);
        parcel.writeStringList(list);
        t(parcel, s6);
    }

    public static void p(Parcel parcel, int i3, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int s6 = s(parcel, i3);
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
        t(parcel, s6);
    }

    public static void q(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int s6 = s(parcel, i3);
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
        t(parcel, s6);
    }

    public static void r(Parcel parcel, int i3, int i10) {
        parcel.writeInt(i3 | (i10 << 16));
    }

    public static int s(Parcel parcel, int i3) {
        parcel.writeInt(i3 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void t(Parcel parcel, int i3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(dataPosition - i3);
        parcel.setDataPosition(dataPosition);
    }
}
