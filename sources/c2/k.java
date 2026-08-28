package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class k extends MediaRouter2.TransferCallback {
    public final l f2184a;

    public k(l lVar) {
        this.f2184a = lVar;
    }

    @Override
    public final void onStop(MediaRouter2.RoutingController routingController) {
        r rVar = (r) this.f2184a.v.remove(routingController);
        if (rVar != null) {
            e eVar = (e) this.f2184a.f2188s.f6034b;
            if (rVar == eVar.f2137e) {
                a0 c10 = eVar.c();
                if (eVar.e() != c10) {
                    eVar.j(c10, 2);
                    return;
                }
                return;
            }
            int i9 = e.F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    @Override
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        a0 a0Var;
        this.f2184a.v.remove(routingController);
        if (routingController2 == this.f2184a.f2187r.getSystemController()) {
            e eVar = (e) this.f2184a.f2188s.f6034b;
            a0 c10 = eVar.c();
            if (eVar.e() != c10) {
                eVar.j(c10, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i9 = 0;
        String id2 = a9.b.h(selectedRoutes.get(0)).getId();
        this.f2184a.v.put(routingController2, new h(this.f2184a, routingController2, id2));
        e eVar2 = (e) this.f2184a.f2188s.f6034b;
        ArrayList arrayList = eVar2.f2141j;
        int size = arrayList.size();
        while (true) {
            if (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                a0Var = (a0) obj;
                if (a0Var.c() == eVar2.f2149r && TextUtils.equals(id2, a0Var.f2091b)) {
                    break;
                }
            } else {
                a0Var = null;
                break;
            }
        }
        if (a0Var == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(a0Var, 3);
        }
        this.f2184a.r(routingController2);
    }

    @Override
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
