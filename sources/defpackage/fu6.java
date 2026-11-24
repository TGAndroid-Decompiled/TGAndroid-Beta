package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class fu6 extends MediaRouter2$TransferCallback {
    public final gu6 a;

    public fu6(gu6 gu6Var) {
        this.a = gu6Var;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        gu6 gu6Var = this.a;
        vv6 vv6Var = (vv6) gu6Var.w.remove(routingController);
        if (vv6Var != null) {
            wz4 wz4Var = (wz4) gu6Var.s.a;
            if (vv6Var == wz4Var.e) {
                ew6 c = wz4Var.c();
                if (wz4Var.e() != c) {
                    wz4Var.j(c, 2);
                    return;
                }
                return;
            }
            int i = wz4.F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        ew6 ew6Var;
        gu6 gu6Var = this.a;
        gu6Var.w.remove(routingController);
        if (routingController2 == gu6Var.r.getSystemController()) {
            wz4 wz4Var = (wz4) gu6Var.s.a;
            ew6 c = wz4Var.c();
            if (wz4Var.e() != c) {
                wz4Var.j(c, 3);
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
        String id = u36.f(selectedRoutes.get(0)).getId();
        gu6Var.w.put(routingController2, new cu6(gu6Var, routingController2, id));
        wz4 wz4Var2 = (wz4) gu6Var.s.a;
        ArrayList arrayList = wz4Var2.j;
        int size = arrayList.size();
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ew6Var = (ew6) obj;
                if (ew6Var.c() == wz4Var2.r && TextUtils.equals(id, ew6Var.b)) {
                    break;
                }
            } else {
                ew6Var = null;
                break;
            }
        }
        if (ew6Var == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            wz4Var2.j(ew6Var, 3);
        }
        gu6Var.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
