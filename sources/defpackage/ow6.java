package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class ow6 extends MediaRouter.Callback {
    public final kf8 a;

    public ow6(kf8 kf8Var) {
        this.a = kf8Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        kf8 kf8Var = this.a;
        if (kf8Var.n(routeInfo)) {
            kf8Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        String str;
        kf8 kf8Var = this.a;
        kf8Var.getClass();
        if (kf8.s(routeInfo) == null && (o = kf8Var.o(routeInfo)) >= 0) {
            if8 if8Var = (if8) kf8Var.H.get(o);
            String str2 = if8Var.b;
            CharSequence name = if8Var.a.getName(kf8Var.a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            dv6 dv6Var = new dv6(str2, str);
            kf8Var.u(if8Var, dv6Var);
            if8Var.c = dv6Var.b();
            kf8Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        kf8 kf8Var = this.a;
        int o = kf8Var.o(routeInfo);
        if (o >= 0) {
            if8 if8Var = (if8) kf8Var.H.get(o);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i = presentationDisplay.getDisplayId();
            } else {
                i = -1;
            }
            if (i != if8Var.c.a.getInt("presentationDisplayId", -1)) {
                ev6 ev6Var = if8Var.c;
                if (ev6Var != null) {
                    Bundle bundle = new Bundle(ev6Var.a);
                    ArrayList c = ev6Var.c();
                    ArrayList b = ev6Var.b();
                    HashSet a = ev6Var.a();
                    bundle.putInt("presentationDisplayId", i);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                    if8Var.c = new ev6(bundle);
                    kf8Var.y();
                    return;
                }
                lq5.j("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        kf8 kf8Var = this.a;
        kf8Var.getClass();
        if (kf8.s(routeInfo) == null && (o = kf8Var.o(routeInfo)) >= 0) {
            kf8Var.H.remove(o);
            kf8Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        jw6 a;
        kf8 kf8Var = this.a;
        if (routeInfo == kf8Var.s.getSelectedRoute(8388611)) {
            jf8 s = kf8.s(routeInfo);
            if (s != null) {
                s.a.l();
                return;
            }
            int o = kf8Var.o(routeInfo);
            if (o >= 0) {
                a05 a05Var = kf8Var.r;
                String str = ((if8) kf8Var.H.get(o)).b;
                a05Var.a.removeMessages(262);
                iw6 d = a05Var.d(a05Var.s);
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
        kf8 kf8Var = this.a;
        kf8Var.getClass();
        if (kf8.s(routeInfo) == null && (o = kf8Var.o(routeInfo)) >= 0) {
            if8 if8Var = (if8) kf8Var.H.get(o);
            int volume = routeInfo.getVolume();
            if (volume != if8Var.c.a.getInt("volume")) {
                ev6 ev6Var = if8Var.c;
                if (ev6Var != null) {
                    Bundle bundle = new Bundle(ev6Var.a);
                    ArrayList c = ev6Var.c();
                    ArrayList b = ev6Var.b();
                    HashSet a = ev6Var.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                    if8Var.c = new ev6(bundle);
                    kf8Var.y();
                    return;
                }
                lq5.j("descriptor must not be null");
            }
        }
    }
}
