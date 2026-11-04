package j8;

import ai.c0;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b8.ke;
import com.google.android.gms.internal.cast.o;
import java.util.HashMap;
import k8.e;
import l8.f;
import org.telegram.messenger.ba;
import org.telegram.messenger.p1;
import org.telegram.messenger.s9;
import org.telegram.messenger.wa;
import org.telegram.messenger.xa;
import org.telegram.messenger.y9;
import org.telegram.messenger.z9;
import org.telegram.ui.Components.ik;
import org.telegram.ui.u90;
import p6.m;
public final class b extends o {
    public final int f16214b = 1;
    public final Object f16215c;

    public b(org.telegram.messenger.o oVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.f16215c = oVar;
    }

    @Override
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        u7.a aVar;
        b8.a aVar2;
        switch (this.f16214b) {
            case 0:
                if (i3 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        aVar = 0;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (queryLocalInterface instanceof u7.a) {
                            aVar = (u7.a) queryLocalInterface;
                        } else {
                            aVar = new b8.a(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 10);
                        }
                    }
                    u7.b.a(parcel);
                    org.telegram.messenger.o oVar = (org.telegram.messenger.o) this.f16215c;
                    f fVar = new f(aVar);
                    xa xaVar = (xa) oVar.f24467c;
                    HashMap hashMap = ((z9) oVar.f24466b).f26755b;
                    if (((y9) hashMap.get(fVar)) == null) {
                        hashMap.put(fVar, new y9(fVar));
                    }
                    xaVar.onClick();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                }
                return false;
            case 1:
                if (i3 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        aVar2 = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        if (queryLocalInterface2 instanceof e) {
                            aVar2 = (e) queryLocalInterface2;
                        } else {
                            aVar2 = new b8.a(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 10);
                        }
                    }
                    u7.b.a(parcel);
                    ba baVar = (ba) this.f16215c;
                    ?? obj = new Object();
                    new HashMap();
                    m.g(aVar2);
                    obj.f53181a = aVar2;
                    ke keVar = baVar.f21756a;
                    ?? r62 = baVar.f21757b;
                    ?? obj2 = new Object();
                    obj2.f26755b = new HashMap();
                    obj2.f26756c = new HashMap();
                    obj2.f26754a = obj;
                    r62.accept(obj2);
                    keVar.m((c0) keVar.f2716b);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 2:
                if (i3 == 1) {
                    z6.a M0 = z6.b.M0(parcel.readStrongBinder());
                    u7.b.a(parcel);
                    ((s9) this.f16215c).f25296b.accept((Location) z6.b.N0(M0));
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 3:
                if (i3 == 1) {
                    ((ik) ((p1) this.f16215c).f24685b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 4:
                if (i3 == 1) {
                    int readInt = parcel.readInt();
                    u7.b.a(parcel);
                    wa waVar = (wa) ((p1) this.f16215c).f24685b;
                    int i10 = 2;
                    if (readInt != 2) {
                        i10 = 3;
                        if (readInt != 3) {
                            i10 = 1;
                        }
                    }
                    waVar.c(i10);
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            case 5:
                if (i3 == 1) {
                    ((u90) ((p1) this.f16215c).f24685b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
            default:
                if (i3 == 1) {
                    ((ik) ((p1) this.f16215c).f24685b).run();
                    parcel2.writeNoException();
                    return true;
                }
                return false;
        }
    }

    public b(p1 p1Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.f16215c = p1Var;
    }

    public b(p1 p1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.f16215c = p1Var;
    }

    public b(p1 p1Var, char c2) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.f16215c = p1Var;
    }

    public b(p1 p1Var, int i3) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.f16215c = p1Var;
    }

    public b(s9 s9Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.f16215c = s9Var;
    }

    public b(ba baVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.f16215c = baVar;
    }
}
