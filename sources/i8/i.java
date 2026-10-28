package i8;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.g0;
import org.telegram.messenger.o4;
import org.telegram.messenger.p4;
import org.telegram.messenger.q4;
public final class i extends c8.b {
    public final int f13890b = 1;
    public final Object f13891c;

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 10);
        this.f13891c = bVar;
    }

    @Override
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        t7.a aVar;
        boolean lambda$setOnMarkerClickListener$1;
        j8.f aVar2;
        switch (this.f13890b) {
            case 0:
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        aVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface instanceof t7.a) {
                            aVar = (t7.a) queryLocalInterface;
                        } else {
                            aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 10);
                        }
                    }
                    t7.b.a(parcel);
                    org.telegram.messenger.f fVar = (org.telegram.messenger.f) this.f13891c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) fVar.f20031b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) fVar.f20032c, new k8.f(aVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    return true;
                }
                return false;
            case 1:
                b bVar = (b) this.f13891c;
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
                        if (queryLocalInterface2 instanceof j8.f) {
                            aVar2 = (j8.f) queryLocalInterface2;
                        } else {
                            aVar2 = new a8.a(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 10);
                        }
                    }
                    t7.b.a(parcel);
                    c cVar = new c(aVar2);
                    q4 q4Var = (q4) ((f) this.f13891c);
                    q4Var.f21011a.lambda$getMapAsync$0(q4Var.f21012b, cVar);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i10 == 1) {
                    y6.a K0 = y6.b.K0(parcel.readStrongBinder());
                    t7.b.a(parcel);
                    ((o4) this.f13891c).f20831b.accept((Location) y6.b.L0(K0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i10 == 1) {
                    ((p4) this.f13891c).f20918a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    t7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((g0) this.f13891c).f20128b, readInt);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 6:
                if (i10 == 1) {
                    ((p4) this.f13891c).f20918a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    ((p4) this.f13891c).f20918a.run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.f13891c = fVar;
    }

    public i(org.telegram.messenger.f fVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.f13891c = fVar;
    }

    public i(g0 g0Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.f13891c = g0Var;
    }

    public i(o4 o4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.f13891c = o4Var;
    }

    public i(p4 p4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.f13891c = p4Var;
    }

    public i(p4 p4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.f13891c = p4Var;
    }

    public i(p4 p4Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.f13891c = p4Var;
    }
}
