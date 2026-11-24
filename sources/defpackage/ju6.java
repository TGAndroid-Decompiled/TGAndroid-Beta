package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class ju6 extends MediaRouter.Callback {
    public final vb8 a;

    public ju6(vb8 vb8Var) {
        this.a = vb8Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        vb8 vb8Var = this.a;
        if (vb8Var.n(routeInfo)) {
            vb8Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        String str;
        vb8 vb8Var = this.a;
        vb8Var.getClass();
        if (vb8.s(routeInfo) == null && (o = vb8Var.o(routeInfo)) >= 0) {
            tb8 tb8Var = (tb8) vb8Var.H.get(o);
            String str2 = tb8Var.b;
            CharSequence name = tb8Var.a.getName(vb8Var.a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            ys6 ys6Var = new ys6(str2, str);
            vb8Var.u(tb8Var, ys6Var);
            tb8Var.c = ys6Var.b();
            vb8Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        vb8 vb8Var = this.a;
        int o = vb8Var.o(routeInfo);
        if (o >= 0) {
            tb8 tb8Var = (tb8) vb8Var.H.get(o);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i = presentationDisplay.getDisplayId();
            } else {
                i = -1;
            }
            if (i != tb8Var.c.a.getInt("presentationDisplayId", -1)) {
                zs6 zs6Var = tb8Var.c;
                if (zs6Var != null) {
                    Bundle bundle = new Bundle(zs6Var.a);
                    ArrayList c = zs6Var.c();
                    ArrayList b = zs6Var.b();
                    HashSet a = zs6Var.a();
                    bundle.putInt("presentationDisplayId", i);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                    tb8Var.c = new zs6(bundle);
                    vb8Var.y();
                    return;
                }
                w26.j("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        vb8 vb8Var = this.a;
        vb8Var.getClass();
        if (vb8.s(routeInfo) == null && (o = vb8Var.o(routeInfo)) >= 0) {
            vb8Var.H.remove(o);
            vb8Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        eu6 a;
        vb8 vb8Var = this.a;
        if (routeInfo == vb8Var.s.getSelectedRoute(8388611)) {
            ub8 s = vb8.s(routeInfo);
            if (s != null) {
                s.a.l();
                return;
            }
            int o = vb8Var.o(routeInfo);
            if (o >= 0) {
                ux4 ux4Var = vb8Var.r;
                String str = ((tb8) vb8Var.H.get(o)).b;
                ux4Var.a.removeMessages(262);
                du6 d = ux4Var.d(ux4Var.s);
                if (d != null && (a = d.a(str)) != null) {
                    a.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        vb8 vb8Var = this.a;
        vb8Var.getClass();
        if (vb8.s(routeInfo) == null && (o = vb8Var.o(routeInfo)) >= 0) {
            tb8 tb8Var = (tb8) vb8Var.H.get(o);
            int volume = routeInfo.getVolume();
            if (volume != tb8Var.c.a.getInt("volume")) {
                zs6 zs6Var = tb8Var.c;
                if (zs6Var != null) {
                    Bundle bundle = new Bundle(zs6Var.a);
                    ArrayList c = zs6Var.c();
                    ArrayList b = zs6Var.b();
                    HashSet a = zs6Var.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                    tb8Var.c = new zs6(bundle);
                    vb8Var.y();
                    return;
                }
                w26.j("descriptor must not be null");
            }
        }
    }
}
