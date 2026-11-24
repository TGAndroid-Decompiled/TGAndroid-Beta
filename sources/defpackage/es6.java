package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class es6 extends MediaRouter2$TransferCallback {
    public final fs6 a;

    public es6(fs6 fs6Var) {
        this.a = fs6Var;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        fs6 fs6Var = this.a;
        vt6 vt6Var = (vt6) fs6Var.w.remove(routingController);
        if (vt6Var != null) {
            ux4 ux4Var = (ux4) fs6Var.s.a;
            if (vt6Var == ux4Var.e) {
                eu6 c = ux4Var.c();
                if (ux4Var.e() != c) {
                    ux4Var.j(c, 2);
                    return;
                }
                return;
            }
            int i = ux4.F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        eu6 eu6Var;
        fs6 fs6Var = this.a;
        fs6Var.w.remove(routingController);
        if (routingController2 == fs6Var.r.getSystemController()) {
            ux4 ux4Var = (ux4) fs6Var.s.a;
            eu6 c = ux4Var.c();
            if (ux4Var.e() != c) {
                ux4Var.j(c, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i = 0;
        String id = w26.e(selectedRoutes.get(0)).getId();
        fs6Var.w.put(routingController2, new bs6(fs6Var, routingController2, id));
        ux4 ux4Var2 = (ux4) fs6Var.s.a;
        ArrayList arrayList = ux4Var2.j;
        int size = arrayList.size();
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                eu6Var = (eu6) obj;
                if (eu6Var.c() == ux4Var2.r && TextUtils.equals(id, eu6Var.b)) {
                    break;
                }
            } else {
                eu6Var = null;
                break;
            }
        }
        if (eu6Var == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            ux4Var2.j(eu6Var, 3);
        }
        fs6Var.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
