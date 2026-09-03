package c2;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class h0 extends MediaRouter.Callback {
    public final q0 f1982a;

    public h0(q0 q0Var) {
        this.f1982a = q0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        q0 q0Var = this.f1982a;
        if (q0Var.n(routeInfo)) {
            q0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        String str;
        q0 q0Var = this.f1982a;
        q0Var.getClass();
        if (q0.s(routeInfo) == null && (o10 = q0Var.o(routeInfo)) >= 0) {
            o0 o0Var = (o0) q0Var.D.get(o10);
            String str2 = o0Var.f2004b;
            CharSequence name = o0Var.f2003a.getName(q0Var.f2024a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            m mVar = new m(str2, str);
            q0Var.u(o0Var, mVar);
            o0Var.f2005c = mVar.b();
            q0Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.f1982a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i10;
        q0 q0Var = this.f1982a;
        int o10 = q0Var.o(routeInfo);
        if (o10 >= 0) {
            o0 o0Var = (o0) q0Var.D.get(o10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i10 = presentationDisplay.getDisplayId();
            } else {
                i10 = -1;
            }
            if (i10 != o0Var.f2005c.f1999a.getInt("presentationDisplayId", -1)) {
                n nVar = o0Var.f2005c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar != null) {
                    Bundle bundle = new Bundle(nVar.f1999a);
                    ArrayList c3 = nVar.c();
                    ArrayList b10 = nVar.b();
                    HashSet a2 = nVar.a();
                    bundle.putInt("presentationDisplayId", i10);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c3));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    o0Var.f2005c = new n(bundle);
                    q0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        q0 q0Var = this.f1982a;
        q0Var.getClass();
        if (q0.s(routeInfo) == null && (o10 = q0Var.o(routeInfo)) >= 0) {
            q0Var.D.remove(o10);
            q0Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        b0 a2;
        q0 q0Var = this.f1982a;
        if (routeInfo == q0Var.f2015s.getSelectedRoute(8388611)) {
            p0 s6 = q0.s(routeInfo);
            if (s6 != null) {
                s6.f2009a.l();
                return;
            }
            int o10 = q0Var.o(routeInfo);
            if (o10 >= 0) {
                e eVar = q0Var.f2014r;
                String str = ((o0) q0Var.D.get(o10)).f2004b;
                eVar.f1938a.removeMessages(262);
                a0 d = eVar.d(eVar.f1953s);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f1982a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f1982a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        q0 q0Var = this.f1982a;
        q0Var.getClass();
        if (q0.s(routeInfo) == null && (o10 = q0Var.o(routeInfo)) >= 0) {
            o0 o0Var = (o0) q0Var.D.get(o10);
            int volume = routeInfo.getVolume();
            if (volume != o0Var.f2005c.f1999a.getInt("volume")) {
                n nVar = o0Var.f2005c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (nVar != null) {
                    Bundle bundle = new Bundle(nVar.f1999a);
                    ArrayList c3 = nVar.c();
                    ArrayList b10 = nVar.b();
                    HashSet a2 = nVar.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c3));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    o0Var.f2005c = new n(bundle);
                    q0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
