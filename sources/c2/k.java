package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class k extends MediaRouter2.TransferCallback {
    public final l f1958a;

    public k(l lVar) {
        this.f1958a = lVar;
    }

    @Override
    public final void onStop(MediaRouter2.RoutingController routingController) {
        s sVar = (s) this.f1958a.v.remove(routingController);
        if (sVar != null) {
            e eVar = (e) this.f1958a.f1962s.f46b;
            if (sVar == eVar.e) {
                a0 c3 = eVar.c();
                if (eVar.e() != c3) {
                    eVar.j(c3, 2);
                    return;
                }
                return;
            }
            int i10 = e.F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    @Override
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        a0 a0Var;
        this.f1958a.v.remove(routingController);
        if (routingController2 == this.f1958a.f1961r.getSystemController()) {
            e eVar = (e) this.f1958a.f1962s.f46b;
            a0 c3 = eVar.c();
            if (eVar.e() != c3) {
                eVar.j(c3, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i10 = 0;
        String id2 = androidx.emoji2.text.w.d(selectedRoutes.get(0)).getId();
        this.f1958a.v.put(routingController2, new h(this.f1958a, routingController2, id2));
        e eVar2 = (e) this.f1958a.f1962s.f46b;
        ArrayList arrayList = eVar2.f1917j;
        int size = arrayList.size();
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a0Var = (a0) obj;
                if (a0Var.c() == eVar2.f1925r && TextUtils.equals(id2, a0Var.f1877b)) {
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
        this.f1958a.r(routingController2);
    }

    @Override
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
