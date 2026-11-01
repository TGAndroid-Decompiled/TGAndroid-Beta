package h8;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bh.d;
import fg.i;
import i8.f;
import j8.e;
import java.util.HashMap;
import n6.l;
import org.telegram.messenger.aa;
import org.telegram.messenger.eb;
import org.telegram.messenger.fb;
import org.telegram.messenger.ga;
import org.telegram.messenger.ha;
import org.telegram.messenger.ja;
import org.telegram.messenger.p;
import org.telegram.messenger.s1;
import org.telegram.ui.Components.lk;
public final class b extends b8.b {
    public final int f7639b = 2;
    public final Object f7640c;

    public b(p pVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.f7640c = pVar;
    }

    @Override
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        s7.a aVar;
        a9.a aVar2;
        switch (this.f7639b) {
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
                    p pVar = (p) this.f7640c;
                    e eVar = new e(aVar);
                    ha haVar = (ha) pVar.f17542b;
                    fb fbVar = (fb) pVar.f17543c;
                    HashMap hashMap = haVar.f16039b;
                    ga gaVar = (ga) hashMap.get(eVar);
                    if (gaVar == null) {
                        gaVar = new ga(haVar, eVar);
                        hashMap.put(eVar, gaVar);
                    }
                    fbVar.a(gaVar);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                }
                return false;
            case 1:
                if (i10 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        aVar2 = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        if (queryLocalInterface2 instanceof f) {
                            aVar2 = (f) queryLocalInterface2;
                        } else {
                            aVar2 = new a9.a(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 9);
                        }
                    }
                    s7.b.a(parcel);
                    ja jaVar = (ja) this.f7640c;
                    ?? obj = new Object();
                    new HashMap();
                    l.g(aVar2);
                    obj.f13527a = aVar2;
                    d dVar = jaVar.f16427a;
                    ?? r62 = jaVar.f16428b;
                    ?? obj2 = new Object();
                    obj2.f16039b = new HashMap();
                    obj2.f16040c = new HashMap();
                    obj2.f16038a = obj;
                    r62.accept(obj2);
                    dVar.q((i) dVar.f2777a);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 2:
                if (i10 == 1) {
                    x6.a M0 = x6.b.M0(parcel.readStrongBinder());
                    s7.b.a(parcel);
                    ((aa) this.f7640c).f14588b.accept((Location) x6.b.N0(M0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i10 == 1) {
                    ((lk) ((s1) this.f7640c).f18056b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    s7.b.a(parcel);
                    eb ebVar = (eb) ((s1) this.f7640c).f18056b;
                    int i11 = 2;
                    if (readInt != 2) {
                        i11 = 3;
                        if (readInt != 3) {
                            i11 = 1;
                        }
                    }
                    ebVar.d(i11);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i10 == 1) {
                    ((Runnable) ((s1) this.f7640c).f18056b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    ((lk) ((s1) this.f7640c).f18056b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public b(s1 s1Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.f7640c = s1Var;
    }

    public b(s1 s1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.f7640c = s1Var;
    }

    public b(s1 s1Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.f7640c = s1Var;
    }

    public b(s1 s1Var, int i10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.f7640c = s1Var;
    }

    public b(aa aaVar) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.f7640c = aaVar;
    }

    public b(ja jaVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.f7640c = jaVar;
    }
}
