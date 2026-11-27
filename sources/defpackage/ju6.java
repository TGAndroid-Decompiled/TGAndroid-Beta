package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class ju6 extends MediaRouter2$TransferCallback {
    public final ku6 a;

    public ju6(ku6 ku6Var) {
        this.a = ku6Var;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        ku6 ku6Var = this.a;
        aw6 aw6Var = (aw6) ku6Var.w.remove(routingController);
        if (aw6Var != null) {
            a05 a05Var = (a05) ku6Var.s.b;
            if (aw6Var == a05Var.e) {
                jw6 c = a05Var.c();
                if (a05Var.e() != c) {
                    a05Var.j(c, 2);
                    return;
                }
                return;
            }
            int i = a05.F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        jw6 jw6Var;
        ku6 ku6Var = this.a;
        ku6Var.w.remove(routingController);
        if (routingController2 == ku6Var.r.getSystemController()) {
            a05 a05Var = (a05) ku6Var.s.b;
            jw6 c = a05Var.c();
            if (a05Var.e() != c) {
                a05Var.j(c, 3);
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
        String id = tq6.c(selectedRoutes.get(0)).getId();
        ku6Var.w.put(routingController2, new gu6(ku6Var, routingController2, id));
        a05 a05Var2 = (a05) ku6Var.s.b;
        ArrayList arrayList = a05Var2.j;
        int size = arrayList.size();
        while (true) {
            if (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jw6Var = (jw6) obj;
                if (jw6Var.c() == a05Var2.r && TextUtils.equals(id, jw6Var.b)) {
                    break;
                }
            } else {
                jw6Var = null;
                break;
            }
        }
        if (jw6Var == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            a05Var2.j(jw6Var, 3);
        }
        ku6Var.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
