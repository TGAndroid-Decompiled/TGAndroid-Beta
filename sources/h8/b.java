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
import org.telegram.messenger.db;
import org.telegram.messenger.eb;
import org.telegram.messenger.fa;
import org.telegram.messenger.ga;
import org.telegram.messenger.ia;
import org.telegram.messenger.p;
import org.telegram.messenger.s1;
import org.telegram.messenger.z9;
import org.telegram.ui.Components.lk;
public final class b extends b8.b {
    public final int f7638b = 1;
    public final Object f7639c;

    public b(p pVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.f7639c = pVar;
    }

    @Override
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        s7.a aVar;
        a9.a aVar2;
        switch (this.f7638b) {
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
                    p pVar = (p) this.f7639c;
                    e eVar = new e(aVar);
                    ga gaVar = (ga) pVar.f17389b;
                    eb ebVar = (eb) pVar.f17390c;
                    HashMap hashMap = gaVar.f15690b;
                    fa faVar = (fa) hashMap.get(eVar);
                    if (faVar == null) {
                        faVar = new fa(gaVar, eVar);
                        hashMap.put(eVar, faVar);
                    }
                    ebVar.a(faVar);
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
                    ia iaVar = (ia) this.f7639c;
                    ?? obj = new Object();
                    new HashMap();
                    l.g(aVar2);
                    obj.f13526a = aVar2;
                    d dVar = iaVar.f16092a;
                    ?? r62 = iaVar.f16093b;
                    ?? obj2 = new Object();
                    obj2.f15690b = new HashMap();
                    obj2.f15691c = new HashMap();
                    obj2.f15689a = obj;
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
                    ((z9) this.f7639c).f19492b.accept((Location) x6.b.N0(M0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i10 == 1) {
                    ((lk) ((s1) this.f7639c).f17863b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    s7.b.a(parcel);
                    db dbVar = (db) ((s1) this.f7639c).f17863b;
                    int i11 = 2;
                    if (readInt != 2) {
                        i11 = 3;
                        if (readInt != 3) {
                            i11 = 1;
                        }
                    }
                    dbVar.d(i11);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i10 == 1) {
                    ((Runnable) ((s1) this.f7639c).f17863b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i10 == 1) {
                    ((lk) ((s1) this.f7639c).f17863b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public b(s1 s1Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.f7639c = s1Var;
    }

    public b(s1 s1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.f7639c = s1Var;
    }

    public b(s1 s1Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.f7639c = s1Var;
    }

    public b(s1 s1Var, int i10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.f7639c = s1Var;
    }

    public b(z9 z9Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.f7639c = z9Var;
    }

    public b(ia iaVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.f7639c = iaVar;
    }
}
