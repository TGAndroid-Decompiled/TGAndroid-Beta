package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class k extends MediaRouter2.TransferCallback {
    public final l f2126a;

    public k(l lVar) {
        this.f2126a = lVar;
    }

    @Override
    public final void onStop(MediaRouter2.RoutingController routingController) {
        s sVar = (s) this.f2126a.v.remove(routingController);
        if (sVar != null) {
            e eVar = (e) this.f2126a.f2130s.f9988a;
            if (sVar == eVar.f2079e) {
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
        this.f2126a.v.remove(routingController);
        if (routingController2 == this.f2126a.f2129r.getSystemController()) {
            e eVar = (e) this.f2126a.f2130s.f9988a;
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
        this.f2126a.v.put(routingController2, new h(this.f2126a, routingController2, id2));
        e eVar2 = (e) this.f2126a.f2130s.f9988a;
        ArrayList arrayList = eVar2.f2083j;
        int size = arrayList.size();
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a0Var = (a0) obj;
                if (a0Var.c() == eVar2.f2091r && TextUtils.equals(id2, a0Var.f2039b)) {
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
        this.f2126a.r(routingController2);
    }

    @Override
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
