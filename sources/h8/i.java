package h8;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.c0;
import org.telegram.messenger.l4;
import org.telegram.messenger.m4;
import org.telegram.messenger.n4;
public final class i extends b8.b {
    public final int f9262b = 1;
    public final Object f9263c;

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 10);
        this.f9263c = bVar;
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        s7.a aVar;
        boolean lambda$setOnMarkerClickListener$1;
        i8.f aVar2;
        switch (this.f9262b) {
            case 0:
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        aVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface instanceof s7.a) {
                            aVar = (s7.a) queryLocalInterface;
                        } else {
                            aVar = new a9.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 9);
                        }
                    }
                    s7.b.a(parcel);
                    org.telegram.messenger.d dVar = (org.telegram.messenger.d) this.f9263c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) dVar.f14952b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) dVar.f14953c, new j8.f(aVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    return true;
                }
                return false;
            case 1:
                b bVar = (b) this.f9263c;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    bVar.onCancel();
                } else {
                    bVar.onFinish();
                }
                parcel2.writeNoException();
                return true;
            case 2:
                if (i10 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        aVar2 = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        if (queryLocalInterface2 instanceof i8.f) {
                            aVar2 = (i8.f) queryLocalInterface2;
                        } else {
                            aVar2 = new a9.a(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 9);
                        }
                    }
                    s7.b.a(parcel);
                    c cVar = new c(aVar2);
                    n4 n4Var = (n4) ((f) this.f9263c);
                    n4Var.f15828a.lambda$getMapAsync$0(n4Var.f15829b, cVar);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i10 == 1) {
                    x6.a L0 = x6.b.L0(parcel.readStrongBinder());
                    s7.b.a(parcel);
                    ((l4) this.f9263c).f15673b.accept((Location) x6.b.M0(L0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i10 == 1) {
                    ((m4) this.f9263c).f15753a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    s7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((c0) this.f9263c).f14824b, readInt);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 6:
                if (i10 == 1) {
                    ((m4) this.f9263c).f15753a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    ((m4) this.f9263c).f15753a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.f9263c = fVar;
    }

    public i(org.telegram.messenger.d dVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.f9263c = dVar;
    }

    public i(c0 c0Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.f9263c = c0Var;
    }

    public i(l4 l4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.f9263c = l4Var;
    }

    public i(m4 m4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.f9263c = m4Var;
    }

    public i(m4 m4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.f9263c = m4Var;
    }

    public i(m4 m4Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.f9263c = m4Var;
    }
}
