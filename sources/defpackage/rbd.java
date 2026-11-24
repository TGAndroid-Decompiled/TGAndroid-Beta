package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
public final class rbd extends zv6 {
    public static final ce6 b = new ce6("MediaRouterCallback", null);
    public final mad a;

    public rbd(mad madVar) {
        ite.h(madVar);
        this.a = madVar;
    }

    @Override
    public final void d(ew6 ew6Var) {
        try {
            mad madVar = this.a;
            String str = ew6Var.c;
            Bundle bundle = ew6Var.s;
            Parcel R = madVar.R();
            R.writeString(str);
            kid.c(R, bundle);
            madVar.V(R, 1);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteAdded", mad.class.getSimpleName());
        }
    }

    @Override
    public final void e(ew6 ew6Var) {
        try {
            mad madVar = this.a;
            String str = ew6Var.c;
            Bundle bundle = ew6Var.s;
            Parcel R = madVar.R();
            R.writeString(str);
            kid.c(R, bundle);
            madVar.V(R, 2);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteChanged", mad.class.getSimpleName());
        }
    }

    @Override
    public final void f(ew6 ew6Var) {
        try {
            mad madVar = this.a;
            String str = ew6Var.c;
            Bundle bundle = ew6Var.s;
            Parcel R = madVar.R();
            R.writeString(str);
            kid.c(R, bundle);
            madVar.V(R, 3);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteRemoved", mad.class.getSimpleName());
        }
    }

    @Override
    public final void h(gw6 gw6Var, ew6 ew6Var, int i) {
        CastDevice b2;
        String str;
        CastDevice b3;
        mad madVar = this.a;
        Integer valueOf = Integer.valueOf(i);
        String str2 = ew6Var.c;
        ce6 ce6Var = b;
        Log.i(ce6Var.a, ce6Var.d("onRouteSelected with reason = %d, routeId = %s", valueOf, str2));
        if (ew6Var.l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (b2 = CastDevice.b(ew6Var.s)) != null) {
                    String str3 = b2.a;
                    if (str3.startsWith("__cast_nearby__")) {
                        str3 = str3.substring(16);
                    }
                    gw6.b();
                    ArrayList arrayList = gw6.c().j;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ew6 ew6Var2 = (ew6) obj;
                        str = ew6Var2.c;
                        if (str != null && !str.endsWith("-groupRoute") && (b3 = CastDevice.b(ew6Var2.s)) != null) {
                            String str4 = b3.a;
                            if (str4.startsWith("__cast_nearby__")) {
                                str4 = str4.substring(16);
                            }
                            if (TextUtils.equals(str4, str3)) {
                                ce6Var.b("routeId is changed from %s to %s", str2, str);
                                break;
                            }
                        }
                    }
                }
            } catch (RemoteException e) {
                ce6Var.a(e, "Unable to call %s on %s.", "onRouteSelected", mad.class.getSimpleName());
                return;
            }
        }
        str = str2;
        Parcel T = madVar.T(madVar.R(), 7);
        int readInt = T.readInt();
        T.recycle();
        Bundle bundle = ew6Var.s;
        if (readInt >= 220400000) {
            Parcel R = madVar.R();
            R.writeString(str);
            R.writeString(str2);
            kid.c(R, bundle);
            madVar.V(R, 8);
            return;
        }
        Parcel R2 = madVar.R();
        R2.writeString(str);
        kid.c(R2, bundle);
        madVar.V(R2, 4);
    }

    @Override
    public final void j(gw6 gw6Var, ew6 ew6Var, int i) {
        Integer valueOf = Integer.valueOf(i);
        String str = ew6Var.c;
        ce6 ce6Var = b;
        Log.i(ce6Var.a, ce6Var.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (ew6Var.l != 1) {
            ce6Var.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            mad madVar = this.a;
            Bundle bundle = ew6Var.s;
            Parcel R = madVar.R();
            R.writeString(str);
            kid.c(R, bundle);
            R.writeInt(i);
            madVar.V(R, 6);
        } catch (RemoteException e) {
            ce6Var.a(e, "Unable to call %s on %s.", "onRouteUnselected", mad.class.getSimpleName());
        }
    }
}
