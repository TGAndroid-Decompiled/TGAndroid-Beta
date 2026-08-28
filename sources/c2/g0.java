package c2;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class g0 extends MediaRouter.Callback {
    public final p0 f2168a;

    public g0(p0 p0Var) {
        this.f2168a = p0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        p0 p0Var = this.f2168a;
        if (p0Var.n(routeInfo)) {
            p0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o6;
        String str;
        p0 p0Var = this.f2168a;
        p0Var.getClass();
        if (p0.s(routeInfo) == null && (o6 = p0Var.o(routeInfo)) >= 0) {
            n0 n0Var = (n0) p0Var.C.get(o6);
            String str2 = n0Var.f2198b;
            CharSequence name = n0Var.f2197a.getName(p0Var.f2219a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            m mVar = new m(str2, str);
            p0Var.u(n0Var, mVar);
            n0Var.f2199c = mVar.b();
            p0Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i9) {
        this.f2168a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i9;
        p0 p0Var = this.f2168a;
        int o6 = p0Var.o(routeInfo);
        if (o6 >= 0) {
            n0 n0Var = (n0) p0Var.C.get(o6);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i9 = presentationDisplay.getDisplayId();
            } else {
                i9 = -1;
            }
            if (i9 != n0Var.f2199c.f2196a.getInt("presentationDisplayId", -1)) {
                n nVar = n0Var.f2199c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar != null) {
                    Bundle bundle = new Bundle(nVar.f2196a);
                    ArrayList c10 = nVar.c();
                    ArrayList b10 = nVar.b();
                    HashSet a2 = nVar.a();
                    bundle.putInt("presentationDisplayId", i9);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    n0Var.f2199c = new n(bundle);
                    p0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o6;
        p0 p0Var = this.f2168a;
        p0Var.getClass();
        if (p0.s(routeInfo) == null && (o6 = p0Var.o(routeInfo)) >= 0) {
            p0Var.C.remove(o6);
            p0Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i9, MediaRouter.RouteInfo routeInfo) {
        a0 a2;
        p0 p0Var = this.f2168a;
        if (routeInfo == p0Var.f2209s.getSelectedRoute(8388611)) {
            o0 s10 = p0.s(routeInfo);
            if (s10 != null) {
                s10.f2202a.l();
                return;
            }
            int o6 = p0Var.o(routeInfo);
            if (o6 >= 0) {
                e eVar = p0Var.f2208r;
                String str = ((n0) p0Var.C.get(o6)).f2198b;
                eVar.f2134a.removeMessages(262);
                z d = eVar.d(eVar.f2150s);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f2168a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i9, MediaRouter.RouteInfo routeInfo) {
        this.f2168a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o6;
        p0 p0Var = this.f2168a;
        p0Var.getClass();
        if (p0.s(routeInfo) == null && (o6 = p0Var.o(routeInfo)) >= 0) {
            n0 n0Var = (n0) p0Var.C.get(o6);
            int volume = routeInfo.getVolume();
            if (volume != n0Var.f2199c.f2196a.getInt("volume")) {
                n nVar = n0Var.f2199c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar != null) {
                    Bundle bundle = new Bundle(nVar.f2196a);
                    ArrayList c10 = nVar.c();
                    ArrayList b10 = nVar.b();
                    HashSet a2 = nVar.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    n0Var.f2199c = new n(bundle);
                    p0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
