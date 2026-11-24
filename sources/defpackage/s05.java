package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
public final class s05 {
    public wm4 a;
    public HashMap b;
    public HashMap c;

    public final r05 a(ai4 ai4Var) {
        k7d k7dVar;
        wm4 wm4Var = this.a;
        cl6 cl6Var = (cl6) ai4Var.b;
        wm4Var.getClass();
        bl6 bl6Var = null;
        try {
            ite.i(cl6Var, "MarkerOptions must not be null.");
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.b(R, cl6Var);
            Parcel Q = d8eVar.Q(R, 11);
            IBinder readStrongBinder = Q.readStrongBinder();
            int i = zjf.b;
            if (readStrongBinder == null) {
                k7dVar = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (queryLocalInterface instanceof k7d) {
                    k7dVar = (k7d) queryLocalInterface;
                } else {
                    k7dVar = new f1d(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                }
            }
            Q.recycle();
            if (k7dVar != 0) {
                bl6Var = new bl6(k7dVar);
            }
            r05 r05Var = new r05(bl6Var);
            this.b.put(bl6Var, r05Var);
            return r05Var;
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }

    public final void b(pj5 pj5Var) {
        wm4 wm4Var = this.a;
        sz4 sz4Var = ((p05) pj5Var).a;
        wm4Var.getClass();
        try {
            ite.i(sz4Var, "CameraUpdate must not be null.");
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.c(R, (xk5) sz4Var.a);
            d8eVar.V(R, 5);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void c(pj5 pj5Var) {
        wm4 wm4Var = this.a;
        sz4 sz4Var = ((p05) pj5Var).a;
        wm4Var.getClass();
        try {
            ite.i(sz4Var, "CameraUpdate must not be null.");
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.c(R, (xk5) sz4Var.a);
            R.writeInt(500);
            tid.c(R, null);
            d8eVar.V(R, 7);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final fy5 d() {
        CameraPosition createFromParcel;
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel Q = d8eVar.Q(d8eVar.R(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i = tid.a;
            if (Q.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(Q);
            }
            CameraPosition cameraPosition = createFromParcel;
            Q.recycle();
            LatLng latLng = cameraPosition.a;
            return new fy5(new xj5(latLng.a, latLng.b), cameraPosition.b, (byte) 2);
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }

    public final float e() {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel Q = d8eVar.Q(d8eVar.R(), 2);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            i2d.h(e);
            return 0.0f;
        }
    }

    public final float f() {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel Q = d8eVar.Q(d8eVar.R(), 3);
            float readFloat = Q.readFloat();
            Q.recycle();
            return readFloat;
        } catch (RemoteException e) {
            i2d.h(e);
            return 0.0f;
        }
    }

    public final fk3 g() {
        Object f1dVar;
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            cf9 cf9Var = (cf9) wm4Var.c;
            if (cf9Var == null) {
                d8e d8eVar = (d8e) wm4Var.b;
                Parcel Q = d8eVar.Q(d8eVar.R(), 25);
                IBinder readStrongBinder = Q.readStrongBinder();
                if (readStrongBinder == null) {
                    f1dVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof iid) {
                        f1dVar = (iid) queryLocalInterface;
                    } else {
                        f1dVar = new f1d(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", (byte) 6);
                    }
                }
                Q.recycle();
                cf9Var = new cf9(f1dVar, (byte) 16);
                wm4Var.c = cf9Var;
            }
            ?? obj = new Object();
            obj.a = cf9Var;
            return obj;
        } catch (RemoteException e) {
            i2d.h(e);
            return null;
        }
    }

    public final void h(pj5 pj5Var) {
        wm4 wm4Var = this.a;
        sz4 sz4Var = ((p05) pj5Var).a;
        wm4Var.getClass();
        try {
            ite.i(sz4Var, "CameraUpdate must not be null.");
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.c(R, (xk5) sz4Var.a);
            d8eVar.V(R, 4);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void i(tj5 tj5Var) {
        ik6 ik6Var;
        wm4 wm4Var = this.a;
        if (tj5Var == null) {
            ik6Var = null;
        } else {
            ik6Var = ((t05) tj5Var).a;
        }
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            tid.b(R, ik6Var);
            Parcel Q = d8eVar.Q(R, 91);
            Q.readInt();
            Q.recycle();
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void j(int i) {
        wm4 wm4Var = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                wm4Var.e0(4);
                return;
            }
            wm4Var.e0(2);
            return;
        }
        wm4Var.e0(1);
    }

    public final void k(boolean z) {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            int i = tid.a;
            R.writeInt(z ? 1 : 0);
            d8eVar.V(R, 22);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void l(yj5 yj5Var) {
        wm4 wm4Var = this.a;
        wx4 wx4Var = new wx4(yj5Var, (byte) 7);
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            t6d t6dVar = new t6d(wx4Var, 0);
            Parcel R = d8eVar.R();
            tid.c(R, t6dVar);
            d8eVar.V(R, 96);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void m(a32 a32Var) {
        wm4 wm4Var = this.a;
        wx4 wx4Var = new wx4(this, a32Var);
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            t6d t6dVar = new t6d(wx4Var);
            Parcel R = d8eVar.R();
            tid.c(R, t6dVar);
            d8eVar.V(R, 30);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        wm4 wm4Var = this.a;
        wm4Var.getClass();
        try {
            d8e d8eVar = (d8e) wm4Var.b;
            Parcel R = d8eVar.R();
            R.writeInt(i);
            R.writeInt(i2);
            R.writeInt(i3);
            R.writeInt(i4);
            d8eVar.V(R, 39);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }
}
