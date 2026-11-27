package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class ku6 extends bw6 {
    public final fu6 E;
    public final i40 F;
    public ArrayList G;
    public final ArrayMap H;
    public final MediaRouter2 r;
    public final kj4 s;
    public final ArrayMap w;
    public final MediaRouter2$RouteCallback x;
    public final ju6 y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public ku6(Context context, kj4 kj4Var) {
        super(context, null);
        this.w = new ArrayMap();
        this.y = new ju6(this);
        this.E = new fu6(this);
        this.G = new ArrayList();
        this.H = new ArrayMap();
        this.r = MediaRouter2.getInstance(context);
        this.s = kj4Var;
        this.F = new i40(new Handler(Looper.getMainLooper()), (byte) 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.x = new iu6(this, (byte) 1);
        } else {
            this.x = new iu6(this, (byte) 0);
        }
    }

    public static Messenger n(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String p(aw6 aw6Var) {
        MediaRouter2.RoutingController routingController;
        if (!(aw6Var instanceof gu6) || (routingController = ((gu6) aw6Var).g) == null) {
            return null;
        }
        return routingController.getId();
    }

    @Override
    public final zv6 c(String str) {
        for (Map.Entry entry : this.w.entrySet()) {
            gu6 gu6Var = (gu6) entry.getValue();
            if (TextUtils.equals(str, gu6Var.f)) {
                return gu6Var;
            }
        }
        return null;
    }

    @Override
    public final aw6 d(String str) {
        return new hu6((String) this.H.get(str), null);
    }

    @Override
    public final aw6 e(String str, String str2) {
        String str3 = (String) this.H.get(str);
        for (gu6 gu6Var : this.w.values()) {
            if (TextUtils.equals(str2, gu6Var.p())) {
                return new hu6(str3, gu6Var);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new hu6(str3, null);
    }

    @Override
    public final void f(gv6 gv6Var) {
        int i;
        boolean z;
        RouteDiscoveryPreference build;
        if (lw6.c == null) {
            i = 0;
        } else {
            i = lw6.c().B;
        }
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.x;
        fu6 fu6Var = this.E;
        ju6 ju6Var = this.y;
        if (i > 0) {
            nw6 nw6Var = lw6.c().u;
            if (nw6Var == null) {
                z = false;
            } else {
                z = nw6Var.d;
            }
            if (gv6Var == null) {
                gv6Var = new gv6(dw6.c, false);
            }
            gv6Var.a();
            ArrayList c = gv6Var.b.c();
            if (z) {
                if (!c.contains("android.media.intent.category.LIVE_AUDIO")) {
                    c.add("android.media.intent.category.LIVE_AUDIO");
                }
            } else {
                c.remove("android.media.intent.category.LIVE_AUDIO");
            }
            ?? obj = new Object();
            obj.a(c);
            dw6 b = obj.b();
            boolean b2 = gv6Var.b();
            if (b != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("selector", b.a);
                bundle.putBoolean("activeScan", b2);
                MediaRouter2 mediaRouter2 = this.r;
                b.a();
                if (b.b.contains(null)) {
                    uc3.c();
                    build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
                } else {
                    boolean z2 = bundle.getBoolean("activeScan");
                    ArrayList arrayList = new ArrayList();
                    ArrayList c2 = b.c();
                    int size = c2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = c2.get(i2);
                        i2++;
                        String str = (String) obj2;
                        str.getClass();
                        char c3 = 65535;
                        switch (str.hashCode()) {
                            case -2065577523:
                                if (str.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 956939050:
                                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 975975375:
                                if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c3) {
                            case 0:
                                str = "android.media.route.feature.REMOTE_PLAYBACK";
                                break;
                            case 1:
                                str = "android.media.route.feature.LIVE_AUDIO";
                                break;
                            case 2:
                                str = "android.media.route.feature.LIVE_VIDEO";
                                break;
                        }
                        arrayList.add(str);
                    }
                    build = new RouteDiscoveryPreference.Builder(arrayList, z2).build();
                }
                i40 i40Var = this.F;
                mediaRouter2.registerRouteCallback(i40Var, mediaRouter2$RouteCallback, build);
                this.r.registerTransferCallback(i40Var, ju6Var);
                this.r.registerControllerCallback(i40Var, fu6Var);
                return;
            }
            lq5.j("selector must not be null");
            return;
        }
        this.r.unregisterRouteCallback(mediaRouter2$RouteCallback);
        this.r.unregisterTransferCallback(ju6Var);
        this.r.unregisterControllerCallback(fu6Var);
    }

    public final MediaRoute2Info o(String str) {
        if (str != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                MediaRoute2Info c = tq6.c(obj);
                if (TextUtils.equals(c.getId(), str)) {
                    return c;
                }
            }
            return null;
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.r.getRoutes()) {
            MediaRoute2Info c = tq6.c(mediaRoute2Info);
            if (c != null && !arraySet.contains(c) && !c.isSystemRoute()) {
                arraySet.add(c);
                arrayList.add(c);
            }
        }
        if (arrayList.equals(this.G)) {
            return;
        }
        this.G = arrayList;
        ArrayMap arrayMap = this.H;
        arrayMap.clear();
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            MediaRoute2Info c2 = tq6.c(obj);
            Bundle extras = c2.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                arrayMap.put(c2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + c2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.G;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            MediaRoute2Info c3 = tq6.c(obj2);
            ev6 x = mka.x(c3);
            if (c3 != null) {
                arrayList3.add(x);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ev6 ev6Var = (ev6) obj3;
                if (ev6Var != null) {
                    if (!arrayList5.contains(ev6Var)) {
                        arrayList5.add(ev6Var);
                    } else {
                        lq5.j("route descriptor already added");
                        return;
                    }
                } else {
                    lq5.j("route must not be null");
                    return;
                }
            }
        }
        g(new fo4(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        dv6 dv6Var;
        int i;
        gu6 gu6Var = (gu6) this.w.get(routingController);
        if (gu6Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList h = mka.h(selectedRoutes);
        int i2 = 0;
        ev6 x = mka.x(tq6.c(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(2131689663);
        ev6 ev6Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    ev6Var = new ev6(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (ev6Var == null) {
            dv6Var = new dv6(routingController.getId(), string);
            Bundle bundle2 = dv6Var.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            dv6Var = new dv6(ev6Var);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = dv6Var.a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        dv6Var.c.clear();
        dv6Var.a(x.b());
        ArrayList arrayList = dv6Var.b;
        arrayList.clear();
        if (!h.isEmpty()) {
            int size = h.size();
            while (i2 < size) {
                Object obj = h.get(i2);
                i2++;
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                } else {
                    lq5.j("groupMemberId must not be empty");
                    return;
                }
            }
        }
        ev6 b = dv6Var.b();
        ArrayList h2 = mka.h(routingController.getSelectableRoutes());
        ArrayList h3 = mka.h(routingController.getDeselectableRoutes());
        fo4 fo4Var = (fo4) this.n;
        if (fo4Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<ev6> list = fo4Var.b;
        if (!list.isEmpty()) {
            for (ev6 ev6Var2 : list) {
                String d = ev6Var2.d();
                if (h.contains(d)) {
                    i = 3;
                } else {
                    i = 1;
                }
                arrayList2.add(new yv6(ev6Var2, i, h3.contains(d), h2.contains(d), true));
            }
        }
        gu6Var.o = b;
        gu6Var.l(b, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info o = o(str);
        if (o == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
            return;
        }
        this.r.transferTo(o);
    }
}
