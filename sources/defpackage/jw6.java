package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class jw6 extends MediaRouter.Callback {
    public final yd8 a;

    public jw6(yd8 yd8Var) {
        this.a = yd8Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        yd8 yd8Var = this.a;
        if (yd8Var.n(routeInfo)) {
            yd8Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        String str;
        yd8 yd8Var = this.a;
        yd8Var.getClass();
        if (yd8.s(routeInfo) == null && (o = yd8Var.o(routeInfo)) >= 0) {
            wd8 wd8Var = (wd8) yd8Var.H.get(o);
            String str2 = wd8Var.b;
            CharSequence name = wd8Var.a.getName(yd8Var.a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            yu6 yu6Var = new yu6(str2, str);
            yd8Var.u(wd8Var, yu6Var);
            wd8Var.c = yu6Var.b();
            yd8Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i;
        yd8 yd8Var = this.a;
        int o = yd8Var.o(routeInfo);
        if (o >= 0) {
            wd8 wd8Var = (wd8) yd8Var.H.get(o);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i = presentationDisplay.getDisplayId();
            } else {
                i = -1;
            }
            if (i != wd8Var.c.a.getInt("presentationDisplayId", -1)) {
                zu6 zu6Var = wd8Var.c;
                if (zu6Var != null) {
                    Bundle bundle = new Bundle(zu6Var.a);
                    ArrayList c = zu6Var.c();
                    ArrayList b = zu6Var.b();
                    HashSet a = zu6Var.a();
                    bundle.putInt("presentationDisplayId", i);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                    wd8Var.c = new zu6(bundle);
                    yd8Var.y();
                    return;
                }
                u36.j("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o;
        yd8 yd8Var = this.a;
        yd8Var.getClass();
        if (yd8.s(routeInfo) == null && (o = yd8Var.o(routeInfo)) >= 0) {
            yd8Var.H.remove(o);
            yd8Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        ew6 a;
        yd8 yd8Var = this.a;
        if (routeInfo == yd8Var.s.getSelectedRoute(8388611)) {
            xd8 s = yd8.s(routeInfo);
            if (s != null) {
                s.a.l();
                return;
            }
            int o = yd8Var.o(routeInfo);
            if (o >= 0) {
                wz4 wz4Var = yd8Var.r;
                String str = ((wd8) yd8Var.H.get(o)).b;
                wz4Var.a.removeMessages(262);
                dw6 d = wz4Var.d(wz4Var.s);
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
        yd8 yd8Var = this.a;
        yd8Var.getClass();
        if (yd8.s(routeInfo) == null && (o = yd8Var.o(routeInfo)) >= 0) {
            wd8 wd8Var = (wd8) yd8Var.H.get(o);
            int volume = routeInfo.getVolume();
            if (volume != wd8Var.c.a.getInt("volume")) {
                zu6 zu6Var = wd8Var.c;
                if (zu6Var != null) {
                    Bundle bundle = new Bundle(zu6Var.a);
                    ArrayList c = zu6Var.c();
                    ArrayList b = zu6Var.b();
                    HashSet a = zu6Var.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                    wd8Var.c = new zu6(bundle);
                    yd8Var.y();
                    return;
                }
                u36.j("descriptor must not be null");
            }
        }
    }
}
