package k8;

import a8.q;
import a8.r7;
import ai.j0;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import l8.e;
import m8.f;
import org.telegram.messenger.cb;
import org.telegram.messenger.da;
import org.telegram.messenger.db;
import org.telegram.messenger.ea;
import org.telegram.messenger.ga;
import org.telegram.messenger.j1;
import org.telegram.messenger.o;
import org.telegram.messenger.x9;
import org.telegram.ui.Components.rk;
import org.telegram.ui.y90;
public final class c extends q {
    public final int f17792b = 1;
    public final Object f17793c;

    public c(o oVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 12);
        this.f17793c = oVar;
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        v7.a aVar;
        e aVar2;
        switch (this.f17792b) {
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
                    o oVar = (o) this.f17793c;
                    f fVar = new f(aVar);
                    db dbVar = (db) oVar.f25686c;
                    HashMap hashMap = ((ea) oVar.f25685b).f23282b;
                    if (((da) hashMap.get(fVar)) == null) {
                        hashMap.put(fVar, new da(fVar));
                    }
                    dbVar.onClick();
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
                    ga gaVar = (ga) this.f17793c;
                    a aVar3 = new a((e) aVar2);
                    r7 r7Var = gaVar.f23709a;
                    ?? r62 = gaVar.f23710b;
                    ?? obj = new Object();
                    obj.f23282b = new HashMap();
                    obj.f23283c = new HashMap();
                    obj.f23281a = aVar3;
                    r62.accept(obj);
                    r7Var.n((j0) r7Var.f617b);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 2:
                if (i7 == 1) {
                    a7.a m12 = a7.b.m1(parcel.readStrongBinder());
                    v7.b.a(parcel);
                    ((x9) this.f17793c).f27476b.accept((Location) a7.b.n1(m12));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i7 == 1) {
                    ((rk) ((j1) this.f17793c).f24500b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i7 == 1) {
                    int readInt = parcel.readInt();
                    v7.b.a(parcel);
                    cb cbVar = (cb) ((j1) this.f17793c).f24500b;
                    int i10 = 2;
                    if (readInt != 2) {
                        i10 = 3;
                        if (readInt != 3) {
                            i10 = 1;
                        }
                    }
                    cbVar.b(i10);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i7 == 1) {
                    ((y90) ((j1) this.f17793c).f24500b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i7 == 1) {
                    ((rk) ((j1) this.f17793c).f24500b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public c(j1 j1Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 12);
        this.f17793c = j1Var;
    }

    public c(j1 j1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 12);
        this.f17793c = j1Var;
    }

    public c(j1 j1Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 12);
        this.f17793c = j1Var;
    }

    public c(j1 j1Var, int i7) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 12);
        this.f17793c = j1Var;
    }

    public c(x9 x9Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 12);
        this.f17793c = x9Var;
    }

    public c(ga gaVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 12);
        this.f17793c = gaVar;
    }
}
