package h8;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.c0;
import org.telegram.messenger.f4;
import org.telegram.messenger.g4;
import org.telegram.messenger.h4;
public final class i extends b8.b {
    public final int f10906b = 1;
    public final Object f10907c;

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 10);
        this.f10907c = bVar;
    }

    @Override
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        s7.a aVar;
        boolean lambda$setOnMarkerClickListener$1;
        i8.f aVar2;
        switch (this.f10906b) {
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
                    org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f10907c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) cVar.f17308b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) cVar.f17309c, new j8.f(aVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    return true;
                }
                return false;
            case 1:
                b bVar = (b) this.f10907c;
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
                    c cVar2 = new c(aVar2);
                    h4 h4Var = (h4) ((f) this.f10907c);
                    h4Var.f17854a.lambda$getMapAsync$0(h4Var.f17855b, cVar2);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i10 == 1) {
                    x6.a L0 = x6.b.L0(parcel.readStrongBinder());
                    s7.b.a(parcel);
                    ((f4) this.f10907c).f17630b.accept((Location) x6.b.M0(L0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i10 == 1) {
                    ((g4) this.f10907c).f17752a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    s7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((c0) this.f10907c).f17311b, readInt);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 6:
                if (i10 == 1) {
                    ((g4) this.f10907c).f17752a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    ((g4) this.f10907c).f17752a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.f10907c = fVar;
    }

    public i(org.telegram.messenger.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.f10907c = cVar;
    }

    public i(c0 c0Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.f10907c = c0Var;
    }

    public i(f4 f4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.f10907c = f4Var;
    }

    public i(g4 g4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.f10907c = g4Var;
    }

    public i(g4 g4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.f10907c = g4Var;
    }

    public i(g4 g4Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.f10907c = g4Var;
    }
}
