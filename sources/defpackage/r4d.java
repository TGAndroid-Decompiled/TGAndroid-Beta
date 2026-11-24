package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
public final class r4d extends dzc {
    public final byte b = 3;
    public final Object c;

    public r4d(kx3 kx3Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", (byte) 9);
        this.c = kx3Var;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        byte b = this.b;
        i5d i5dVar = null;
        a6e a6eVar = null;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface instanceof i5d) {
                        i5dVar = (i5d) queryLocalInterface;
                    } else {
                        i5dVar = new ezc(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                    }
                }
                sgd.a(parcel);
                yi6 yi6Var = new yi6(i5dVar);
                HashMap hashMap = ((ty4) ((ry4) obj).b).b;
                if (((sy4) hashMap.get(yi6Var)) == null) {
                    hashMap.put(yi6Var, new sy4(yi6Var));
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
                    if (queryLocalInterface2 instanceof a6e) {
                        a6eVar = (a6e) queryLocalInterface2;
                    } else {
                        a6eVar = new ezc(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", (byte) 6);
                    }
                }
                sgd.a(parcel);
                vy4 vy4Var = (vy4) obj;
                wk4 wk4Var = new wk4(a6eVar);
                gl2 gl2Var = vy4Var.a;
                ?? r5 = vy4Var.b;
                ?? obj2 = new Object();
                obj2.b = new HashMap();
                obj2.c = new HashMap();
                obj2.a = wk4Var;
                r5.accept(obj2);
                gl2Var.n((st) gl2Var.b);
                parcel2.writeNoException();
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                yi5 T = bo7.T(parcel.readStrongBinder());
                sgd.a(parcel);
                ((x32) ((ry4) obj).b).accept((Location) bo7.U(T));
                parcel2.writeNoException();
                return true;
            case 3:
                if (i != 1) {
                    return false;
                }
                ((s32) ((kx3) obj).b).run();
                parcel2.writeNoException();
                return true;
            case 4:
                if (i != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                sgd.a(parcel);
                zh5 zh5Var = (zh5) ((ry4) obj).b;
                int i2 = 2;
                if (readInt != 2) {
                    i2 = 3;
                    if (readInt != 3) {
                        i2 = 1;
                    }
                }
                zh5Var.c(i2);
                parcel2.writeNoException();
                return true;
            case 5:
                if (i != 1) {
                    return false;
                }
                ((t96) ((ry4) obj).b).run();
                parcel2.writeNoException();
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                ((s32) ((ry4) obj).b).run();
                parcel2.writeNoException();
                return true;
        }
    }

    public r4d(ry4 ry4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", (byte) 9);
        this.c = ry4Var;
    }

    public r4d(ry4 ry4Var, byte b) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", (byte) 9);
        this.c = ry4Var;
    }

    public r4d(ry4 ry4Var, char c) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", (byte) 9);
        this.c = ry4Var;
    }

    public r4d(ry4 ry4Var, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", (byte) 9);
        this.c = ry4Var;
    }

    public r4d(ry4 ry4Var, short s) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", (byte) 9);
        this.c = ry4Var;
    }

    public r4d(vy4 vy4Var) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", (byte) 9);
        this.c = vy4Var;
    }
}
