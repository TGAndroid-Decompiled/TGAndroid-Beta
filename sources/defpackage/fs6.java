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
public final class fs6 extends wt6 {
    public final as6 E;
    public final g40 F;
    public ArrayList G;
    public final ArrayMap H;
    public final MediaRouter2 r;
    public final gi3 s;
    public final ArrayMap w;
    public final MediaRouter2$RouteCallback x;
    public final es6 y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public fs6(Context context, gi3 gi3Var) {
        super(context, null);
        this.w = new ArrayMap();
        this.y = new es6(this);
        this.E = new as6(this);
        this.G = new ArrayList();
        this.H = new ArrayMap();
        this.r = MediaRouter2.getInstance(context);
        this.s = gi3Var;
        this.F = new g40(new Handler(Looper.getMainLooper()), (byte) 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.x = new ds6(this, (byte) 1);
        } else {
            this.x = new ds6(this, (byte) 0);
        }
    }

    public static Messenger n(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String p(vt6 vt6Var) {
        MediaRouter2.RoutingController routingController;
        if (!(vt6Var instanceof bs6) || (routingController = ((bs6) vt6Var).g) == null) {
            return null;
        }
        return routingController.getId();
    }

    @Override
    public final ut6 c(String str) {
        for (Map.Entry entry : this.w.entrySet()) {
            bs6 bs6Var = (bs6) entry.getValue();
            if (TextUtils.equals(str, bs6Var.f)) {
                return bs6Var;
            }
        }
        return null;
    }

    @Override
    public final vt6 d(String str) {
        return new cs6((String) this.H.get(str), null);
    }

    @Override
    public final vt6 e(String str, String str2) {
        String str3 = (String) this.H.get(str);
        for (bs6 bs6Var : this.w.values()) {
            if (TextUtils.equals(str2, bs6Var.p())) {
                return new cs6(str3, bs6Var);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new cs6(str3, null);
    }

    @Override
    public final void f(bt6 bt6Var) {
        int i;
        boolean z;
        RouteDiscoveryPreference build;
        if (gu6.c == null) {
            i = 0;
        } else {
            i = gu6.c().B;
        }
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.x;
        as6 as6Var = this.E;
        es6 es6Var = this.y;
        if (i > 0) {
            iu6 iu6Var = gu6.c().u;
            if (iu6Var == null) {
                z = false;
            } else {
                z = iu6Var.d;
            }
            if (bt6Var == null) {
                bt6Var = new bt6(yt6.c, false);
            }
            bt6Var.a();
            ArrayList c = bt6Var.b.c();
            if (z) {
                if (!c.contains("android.media.intent.category.LIVE_AUDIO")) {
                    c.add("android.media.intent.category.LIVE_AUDIO");
                }
            } else {
                c.remove("android.media.intent.category.LIVE_AUDIO");
            }
            ?? obj = new Object();
            obj.a(c);
            yt6 b = obj.b();
            boolean b2 = bt6Var.b();
            if (b != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("selector", b.a);
                bundle.putBoolean("activeScan", b2);
                MediaRouter2 mediaRouter2 = this.r;
                b.a();
                if (b.b.contains(null)) {
                    bc3.c();
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
                g40 g40Var = this.F;
                mediaRouter2.registerRouteCallback(g40Var, mediaRouter2$RouteCallback, build);
                this.r.registerTransferCallback(g40Var, es6Var);
                this.r.registerControllerCallback(g40Var, as6Var);
                return;
            }
            w26.j("selector must not be null");
            return;
        }
        this.r.unregisterRouteCallback(mediaRouter2$RouteCallback);
        this.r.unregisterTransferCallback(es6Var);
        this.r.unregisterControllerCallback(as6Var);
    }

    public final MediaRoute2Info o(String str) {
        if (str != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                MediaRoute2Info e = w26.e(obj);
                if (TextUtils.equals(e.getId(), str)) {
                    return e;
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
            MediaRoute2Info e = w26.e(mediaRoute2Info);
            if (e != null && !arraySet.contains(e) && !e.isSystemRoute()) {
                arraySet.add(e);
                arrayList.add(e);
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
            MediaRoute2Info e2 = w26.e(obj);
            Bundle extras = e2.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                arrayMap.put(e2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + e2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.G;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            MediaRoute2Info e3 = w26.e(obj2);
            zs6 x = tga.x(e3);
            if (e3 != null) {
                arrayList3.add(x);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                zs6 zs6Var = (zs6) obj3;
                if (zs6Var != null) {
                    if (!arrayList5.contains(zs6Var)) {
                        arrayList5.add(zs6Var);
                    } else {
                        w26.j("route descriptor already added");
                        return;
                    }
                } else {
                    w26.j("route must not be null");
                    return;
                }
            }
        }
        g(new am4(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        ys6 ys6Var;
        int i;
        bs6 bs6Var = (bs6) this.w.get(routingController);
        if (bs6Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList h = tga.h(selectedRoutes);
        int i2 = 0;
        zs6 x = tga.x(w26.e(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(2131689663);
        zs6 zs6Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    zs6Var = new zs6(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (zs6Var == null) {
            ys6Var = new ys6(routingController.getId(), string);
            Bundle bundle2 = ys6Var.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            ys6Var = new ys6(zs6Var);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = ys6Var.a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        ys6Var.c.clear();
        ys6Var.a(x.b());
        ArrayList arrayList = ys6Var.b;
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
                    w26.j("groupMemberId must not be empty");
                    return;
                }
            }
        }
        zs6 b = ys6Var.b();
        ArrayList h2 = tga.h(routingController.getSelectableRoutes());
        ArrayList h3 = tga.h(routingController.getDeselectableRoutes());
        am4 am4Var = (am4) this.n;
        if (am4Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<zs6> list = am4Var.b;
        if (!list.isEmpty()) {
            for (zs6 zs6Var2 : list) {
                String d = zs6Var2.d();
                if (h.contains(d)) {
                    i = 3;
                } else {
                    i = 1;
                }
                arrayList2.add(new tt6(zs6Var2, i, h3.contains(d), h2.contains(d), true));
            }
        }
        bs6Var.o = b;
        bs6Var.l(b, arrayList2);
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
