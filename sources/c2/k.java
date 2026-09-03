package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class k extends MediaRouter2.TransferCallback {
    public final l f1988a;

    public k(l lVar) {
        this.f1988a = lVar;
    }

    @Override
    public final void onStop(MediaRouter2.RoutingController routingController) {
        s sVar = (s) this.f1988a.v.remove(routingController);
        if (sVar != null) {
            e eVar = (e) this.f1988a.f1990s.f1772b;
            if (sVar == eVar.e) {
                b0 c3 = eVar.c();
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
        b0 b0Var;
        this.f1988a.v.remove(routingController);
        if (routingController2 == this.f1988a.f1989r.getSystemController()) {
            e eVar = (e) this.f1988a.f1990s.f1772b;
            b0 c3 = eVar.c();
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
        String id2 = af.a.d(selectedRoutes.get(0)).getId();
        this.f1988a.v.put(routingController2, new h(this.f1988a, routingController2, id2));
        e eVar2 = (e) this.f1988a.f1990s.f1772b;
        ArrayList arrayList = eVar2.f1944j;
        int size = arrayList.size();
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                b0Var = (b0) obj;
                if (b0Var.c() == eVar2.f1952r && TextUtils.equals(id2, b0Var.f1910b)) {
                    break;
                }
            } else {
                b0Var = null;
                break;
            }
        }
        if (b0Var == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(b0Var, 3);
        }
        this.f1988a.r(routingController2);
    }

    @Override
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
