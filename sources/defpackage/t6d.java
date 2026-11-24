package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
public final class t6d extends e1d {
    public final byte b = 1;
    public final Object c;

    public t6d(wx4 wx4Var) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", (byte) 9);
        this.c = wx4Var;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        byte b = this.b;
        k7d k7dVar = null;
        d8e d8eVar = null;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface instanceof k7d) {
                        k7dVar = (k7d) queryLocalInterface;
                    } else {
                        k7dVar = new f1d(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                    }
                }
                tid.a(parcel);
                bl6 bl6Var = new bl6(k7dVar);
                HashMap hashMap = ((s05) ((wx4) obj).b).b;
                if (((r05) hashMap.get(bl6Var)) == null) {
                    hashMap.put(bl6Var, new r05(bl6Var));
                }
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                    if (queryLocalInterface2 instanceof d8e) {
                        d8eVar = (d8e) queryLocalInterface2;
                    } else {
                        d8eVar = new f1d(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", (byte) 6);
                    }
                }
                tid.a(parcel);
                u05 u05Var = (u05) obj;
                wm4 wm4Var = new wm4(d8eVar);
                sm2 sm2Var = u05Var.a;
                ?? r5 = u05Var.b;
                ?? obj2 = new Object();
                obj2.b = new HashMap();
                obj2.c = new HashMap();
                obj2.a = wm4Var;
                r5.accept(obj2);
                sm2Var.u((su) sm2Var.b);
                parcel2.writeNoException();
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                xk5 T = eq7.T(parcel.readStrongBinder());
                tid.a(parcel);
                ((i52) ((wx4) obj).b).accept((Location) eq7.U(T));
                parcel2.writeNoException();
                return true;
            case 3:
                if (i != 1) {
                    return false;
                }
                ((d52) ((wx4) obj).b).run();
                parcel2.writeNoException();
                return true;
            case 4:
                if (i != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                tid.a(parcel);
                yj5 yj5Var = (yj5) ((wx4) obj).b;
                int i2 = 2;
                if (readInt != 2) {
                    i2 = 3;
                    if (readInt != 3) {
                        i2 = 1;
                    }
                }
                yj5Var.c(i2);
                parcel2.writeNoException();
                return true;
            case 5:
                if (i != 1) {
                    return false;
                }
                ((sb6) ((wx4) obj).b).run();
                parcel2.writeNoException();
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                ((d52) ((wx4) obj).b).run();
                parcel2.writeNoException();
                return true;
        }
    }

    public t6d(wx4 wx4Var, byte b) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", (byte) 9);
        this.c = wx4Var;
    }

    public t6d(wx4 wx4Var, byte b, boolean z) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", (byte) 9);
        this.c = wx4Var;
    }

    public t6d(wx4 wx4Var, char c) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", (byte) 9);
        this.c = wx4Var;
    }

    public t6d(wx4 wx4Var, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", (byte) 9);
        this.c = wx4Var;
    }

    public t6d(wx4 wx4Var, short s) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", (byte) 9);
        this.c = wx4Var;
    }

    public t6d(u05 u05Var) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", (byte) 9);
        this.c = u05Var;
    }
}
