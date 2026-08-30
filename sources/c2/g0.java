package c2;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class g0 extends MediaRouter.Callback {
    public final p0 f1942a;

    public g0(p0 p0Var) {
        this.f1942a = p0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        p0 p0Var = this.f1942a;
        if (p0Var.n(routeInfo)) {
            p0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        String str;
        p0 p0Var = this.f1942a;
        p0Var.getClass();
        if (p0.s(routeInfo) == null && (o10 = p0Var.o(routeInfo)) >= 0) {
            n0 n0Var = (n0) p0Var.D.get(o10);
            String str2 = n0Var.f1972b;
            CharSequence name = n0Var.f1971a.getName(p0Var.f2000a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            m mVar = new m(str2, str);
            p0Var.u(n0Var, mVar);
            n0Var.f1973c = mVar.b();
            p0Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.f1942a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i10;
        p0 p0Var = this.f1942a;
        int o10 = p0Var.o(routeInfo);
        if (o10 >= 0) {
            n0 n0Var = (n0) p0Var.D.get(o10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i10 = presentationDisplay.getDisplayId();
            } else {
                i10 = -1;
            }
            if (i10 != n0Var.f1973c.f1970a.getInt("presentationDisplayId", -1)) {
                n nVar = n0Var.f1973c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar != null) {
                    Bundle bundle = new Bundle(nVar.f1970a);
                    ArrayList c3 = nVar.c();
                    ArrayList b10 = nVar.b();
                    HashSet a2 = nVar.a();
                    bundle.putInt("presentationDisplayId", i10);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c3));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    n0Var.f1973c = new n(bundle);
                    p0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        p0 p0Var = this.f1942a;
        p0Var.getClass();
        if (p0.s(routeInfo) == null && (o10 = p0Var.o(routeInfo)) >= 0) {
            p0Var.D.remove(o10);
            p0Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        a0 a2;
        p0 p0Var = this.f1942a;
        if (routeInfo == p0Var.f1982s.getSelectedRoute(8388611)) {
            o0 s6 = p0.s(routeInfo);
            if (s6 != null) {
                s6.f1976a.l();
                return;
            }
            int o10 = p0Var.o(routeInfo);
            if (o10 >= 0) {
                e eVar = p0Var.f1981r;
                String str = ((n0) p0Var.D.get(o10)).f1972b;
                eVar.f1911a.removeMessages(262);
                z d = eVar.d(eVar.f1926s);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f1942a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f1942a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        p0 p0Var = this.f1942a;
        p0Var.getClass();
        if (p0.s(routeInfo) == null && (o10 = p0Var.o(routeInfo)) >= 0) {
            n0 n0Var = (n0) p0Var.D.get(o10);
            int volume = routeInfo.getVolume();
            if (volume != n0Var.f1973c.f1970a.getInt("volume")) {
                n nVar = n0Var.f1973c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar != null) {
                    Bundle bundle = new Bundle(nVar.f1970a);
                    ArrayList c3 = nVar.c();
                    ArrayList b10 = nVar.b();
                    HashSet a2 = nVar.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c3));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    n0Var.f1973c = new n(bundle);
                    p0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
