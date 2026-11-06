package k8;

import a8.q;
import a8.r7;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bi.x5;
import java.util.HashMap;
import l8.e;
import m8.f;
import org.telegram.messenger.db;
import org.telegram.messenger.ea;
import org.telegram.messenger.eb;
import org.telegram.messenger.fa;
import org.telegram.messenger.ha;
import org.telegram.messenger.o;
import org.telegram.messenger.p1;
import org.telegram.messenger.y9;
import org.telegram.ui.Components.jk;
import org.telegram.ui.x90;
public final class c extends q {
    public final int f17230b = 1;
    public final Object f17231c;

    public c(o oVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 12);
        this.f17231c = oVar;
    }

    @Override
    public final boolean K0(int i7, Parcel parcel, Parcel parcel2) {
        v7.a aVar;
        e aVar2;
        switch (this.f17230b) {
            case 0:
                if (i7 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        aVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface instanceof v7.a) {
                            aVar = (v7.a) queryLocalInterface;
                        } else {
                            aVar = new a8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 11);
                        }
                    }
                    v7.b.a(parcel);
                    o oVar = (o) this.f17231c;
                    f fVar = new f(aVar);
                    eb ebVar = (eb) oVar.f24246c;
                    HashMap hashMap = ((fa) oVar.f24245b).f22365b;
                    if (((ea) hashMap.get(fVar)) == null) {
                        hashMap.put(fVar, new ea(fVar));
                    }
                    ebVar.onClick();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                }
                return false;
            case 1:
                if (i7 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        aVar2 = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        if (queryLocalInterface2 instanceof e) {
                            aVar2 = (e) queryLocalInterface2;
                        } else {
                            aVar2 = new a8.a(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 11);
                        }
                    }
                    v7.b.a(parcel);
                    ha haVar = (ha) this.f17231c;
                    wf.b bVar = new wf.b((e) aVar2);
                    r7 r7Var = haVar.f22850a;
                    ?? r62 = haVar.f22851b;
                    ?? obj = new Object();
                    obj.f22365b = new HashMap();
                    obj.f22366c = new HashMap();
                    obj.f22364a = bVar;
                    r62.accept(obj);
                    r7Var.n((x5) r7Var.f614b);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 2:
                if (i7 == 1) {
                    a7.a M0 = a7.b.M0(parcel.readStrongBinder());
                    v7.b.a(parcel);
                    ((y9) this.f17231c).f26606b.accept((Location) a7.b.N0(M0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i7 == 1) {
                    ((jk) ((p1) this.f17231c).f24458b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i7 == 1) {
                    int readInt = parcel.readInt();
                    v7.b.a(parcel);
                    db dbVar = (db) ((p1) this.f17231c).f24458b;
                    int i10 = 2;
                    if (readInt != 2) {
                        i10 = 3;
                        if (readInt != 3) {
                            i10 = 1;
                        }
                    }
                    dbVar.c(i10);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i7 == 1) {
                    ((x90) ((p1) this.f17231c).f24458b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i7 == 1) {
                    ((jk) ((p1) this.f17231c).f24458b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public c(p1 p1Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 12);
        this.f17231c = p1Var;
    }

    public c(p1 p1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 12);
        this.f17231c = p1Var;
    }

    public c(p1 p1Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 12);
        this.f17231c = p1Var;
    }

    public c(p1 p1Var, int i7) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 12);
        this.f17231c = p1Var;
    }

    public c(y9 y9Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 12);
        this.f17231c = y9Var;
    }

    public c(ha haVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 12);
        this.f17231c = haVar;
    }
}
