package c2;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;

public final class f0 extends MediaRouter.Callback {

    public final o0 f2280a;

    public f0(o0 o0Var) {
        this.f2280a = o0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        o0 o0Var = this.f2280a;
        if (o0Var.n(routeInfo)) {
            o0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iO;
        o0 o0Var = this.f2280a;
        o0Var.getClass();
        if (o0.s(routeInfo) != null || (iO = o0Var.o(routeInfo)) < 0) {
            return;
        }
        m0 m0Var = (m0) o0Var.C.get(iO);
        String str = m0Var.f2310b;
        CharSequence name = m0Var.f2309a.getName(o0Var.f2339a);
        m mVar = new m(str, name != null ? name.toString() : "");
        o0Var.u(m0Var, mVar);
        m0Var.f2311c = mVar.b();
        o0Var.y();
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.f2280a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        o0 o0Var = this.f2280a;
        int iO = o0Var.o(routeInfo);
        if (iO >= 0) {
            m0 m0Var = (m0) o0Var.C.get(iO);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != m0Var.f2311c.f2312a.getInt("presentationDisplayId", -1)) {
                n nVar = m0Var.f2311c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(nVar.f2312a);
                ArrayList arrayListC = nVar.c();
                ArrayList arrayListB = nVar.b();
                HashSet hashSetA = nVar.a();
                bundle.putInt("presentationDisplayId", displayId);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                m0Var.f2311c = new n(bundle);
                o0Var.y();
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iO;
        o0 o0Var = this.f2280a;
        o0Var.getClass();
        if (o0.s(routeInfo) != null || (iO = o0Var.o(routeInfo)) < 0) {
            return;
        }
        o0Var.C.remove(iO);
        o0Var.y();
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        z zVarA;
        o0 o0Var = this.f2280a;
        if (routeInfo != o0Var.f2318s.getSelectedRoute(8388611)) {
            return;
        }
        n0 n0VarS = o0.s(routeInfo);
        if (n0VarS != null) {
            n0VarS.f2313a.l();
            return;
        }
        int iO = o0Var.o(routeInfo);
        if (iO >= 0) {
            m0 m0Var = (m0) o0Var.C.get(iO);
            e eVar = o0Var.f2317r;
            String str = m0Var.f2310b;
            eVar.f2251a.removeMessages(262);
            y yVarD = eVar.d(eVar.f2267s);
            if (yVarD == null || (zVarA = yVarD.a(str)) == null) {
                return;
            }
            zVarA.l();
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f2280a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f2280a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iO;
        o0 o0Var = this.f2280a;
        o0Var.getClass();
        if (o0.s(routeInfo) != null || (iO = o0Var.o(routeInfo)) < 0) {
            return;
        }
        m0 m0Var = (m0) o0Var.C.get(iO);
        int volume = routeInfo.getVolume();
        if (volume != m0Var.f2311c.f2312a.getInt("volume")) {
            n nVar = m0Var.f2311c;
            new ArrayList();
            new ArrayList();
            new HashSet();
            if (nVar == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(nVar.f2312a);
            ArrayList arrayListC = nVar.c();
            ArrayList arrayListB = nVar.b();
            HashSet hashSetA = nVar.a();
            bundle.putInt("volume", volume);
            bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
            bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListC));
            bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
            m0Var.f2311c = new n(bundle);
            o0Var.y();
        }
    }
}
