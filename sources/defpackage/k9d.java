package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
public final class k9d extends u3d {
    public final byte b = 0;
    public final Object c;

    public k9d(e05 e05Var) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", (byte) 9);
        this.c = e05Var;
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        byte b = this.b;
        bad badVar = null;
        qae qaeVar = null;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i != 1) {
                    return false;
                }
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                    if (queryLocalInterface instanceof bad) {
                        badVar = (bad) queryLocalInterface;
                    } else {
                        badVar = new v3d(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                    }
                }
                jld.a(parcel);
                dl6 dl6Var = new dl6(badVar);
                HashMap hashMap = ((x05) ((e05) obj).b).b;
                if (((w05) hashMap.get(dl6Var)) == null) {
                    hashMap.put(dl6Var, new w05(dl6Var));
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
                    if (queryLocalInterface2 instanceof qae) {
                        qaeVar = (qae) queryLocalInterface2;
                    } else {
                        qaeVar = new v3d(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", (byte) 6);
                    }
                }
                jld.a(parcel);
                z05 z05Var = (z05) obj;
                um4 um4Var = new um4(qaeVar);
                am2 am2Var = z05Var.a;
                ?? r5 = z05Var.b;
                ?? obj2 = new Object();
                obj2.b = new HashMap();
                obj2.c = new HashMap();
                obj2.a = um4Var;
                r5.accept(obj2);
                am2Var.v((tt) am2Var.b);
                parcel2.writeNoException();
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                al5 T = br7.T(parcel.readStrongBinder());
                jld.a(parcel);
                ((n42) ((e05) obj).b).accept((Location) br7.U(T));
                parcel2.writeNoException();
                return true;
            case 3:
                if (i != 1) {
                    return false;
                }
                ((i42) ((e05) obj).b).run();
                parcel2.writeNoException();
                return true;
            case 4:
                if (i != 1) {
                    return false;
                }
                int readInt = parcel.readInt();
                jld.a(parcel);
                bk5 bk5Var = (bk5) ((e05) obj).b;
                int i2 = 2;
                if (readInt != 2) {
                    i2 = 3;
                    if (readInt != 3) {
                        i2 = 1;
                    }
                }
                bk5Var.c(i2);
                parcel2.writeNoException();
                return true;
            case 5:
                if (i != 1) {
                    return false;
                }
                ((dc6) ((e05) obj).b).run();
                parcel2.writeNoException();
                return true;
            default:
                if (i != 1) {
                    return false;
                }
                ((i42) ((e05) obj).b).run();
                parcel2.writeNoException();
                return true;
        }
    }

    public k9d(e05 e05Var, byte b) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", (byte) 9);
        this.c = e05Var;
    }

    public k9d(e05 e05Var, byte b, boolean z) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", (byte) 9);
        this.c = e05Var;
    }

    public k9d(e05 e05Var, char c) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", (byte) 9);
        this.c = e05Var;
    }

    public k9d(e05 e05Var, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", (byte) 9);
        this.c = e05Var;
    }

    public k9d(e05 e05Var, short s) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", (byte) 9);
        this.c = e05Var;
    }

    public k9d(z05 z05Var) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", (byte) 9);
        this.c = z05Var;
    }
}
