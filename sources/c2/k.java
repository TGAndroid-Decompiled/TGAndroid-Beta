package c2;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class k extends MediaRouter2.TransferCallback {

    public final l f2299a;

    public k(l lVar) {
        this.f2299a = lVar;
    }

    @Override
    public final void onStop(MediaRouter2.RoutingController routingController) {
        r rVar = (r) this.f2299a.v.remove(routingController);
        if (rVar == null) {
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
            return;
        }
        e eVar = (e) this.f2299a.f2301s.f245b;
        if (rVar != eVar.f2254e) {
            int i10 = e.F;
            return;
        }
        z zVarC = eVar.c();
        if (eVar.e() != zVarC) {
            eVar.j(zVarC, 2);
        }
    }

    @Override
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        z zVar;
        this.f2299a.v.remove(routingController);
        if (routingController2 == this.f2299a.f2300r.getSystemController()) {
            e eVar = (e) this.f2299a.f2301s.f245b;
            z zVarC = eVar.c();
            if (eVar.e() != zVarC) {
                eVar.j(zVarC, 3);
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
        String id2 = a9.m.d(selectedRoutes.get(0)).getId();
        this.f2299a.v.put(routingController2, new h(this.f2299a, routingController2, id2));
        e eVar2 = (e) this.f2299a.f2301s.f245b;
        ArrayList arrayList = eVar2.f2258j;
        int size = arrayList.size();
        while (true) {
            if (i10 >= size) {
                zVar = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            zVar = (z) obj;
            if (zVar.c() == eVar2.f2266r && TextUtils.equals(id2, zVar.f2391b)) {
                break;
            }
        }
        if (zVar == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(zVar, 3);
        }
        this.f2299a.r(routingController2);
    }

    @Override
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
