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
public final class gu6 extends wv6 {
    public final bu6 E;
    public final g50 F;
    public ArrayList G;
    public final ArrayMap H;
    public final MediaRouter2 r;
    public final lj4 s;
    public final ArrayMap w;
    public final MediaRouter2$RouteCallback x;
    public final fu6 y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public gu6(Context context, lj4 lj4Var) {
        super(context, null);
        this.w = new ArrayMap();
        this.y = new fu6(this);
        this.E = new bu6(this);
        this.G = new ArrayList();
        this.H = new ArrayMap();
        this.r = MediaRouter2.getInstance(context);
        this.s = lj4Var;
        this.F = new g50(new Handler(Looper.getMainLooper()), (byte) 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.x = new eu6(this, (byte) 1);
        } else {
            this.x = new eu6(this, (byte) 0);
        }
    }

    public static Messenger n(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String p(vv6 vv6Var) {
        MediaRouter2.RoutingController routingController;
        if (!(vv6Var instanceof cu6) || (routingController = ((cu6) vv6Var).g) == null) {
            return null;
        }
        return routingController.getId();
    }

    @Override
    public final uv6 c(String str) {
        for (Map.Entry entry : this.w.entrySet()) {
            cu6 cu6Var = (cu6) entry.getValue();
            if (TextUtils.equals(str, cu6Var.f)) {
                return cu6Var;
            }
        }
        return null;
    }

    @Override
    public final vv6 d(String str) {
        return new du6((String) this.H.get(str), null);
    }

    @Override
    public final vv6 e(String str, String str2) {
        String str3 = (String) this.H.get(str);
        for (cu6 cu6Var : this.w.values()) {
            if (TextUtils.equals(str2, cu6Var.p())) {
                return new du6(str3, cu6Var);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new du6(str3, null);
    }

    @Override
    public final void f(bv6 bv6Var) {
        int i;
        boolean z;
        RouteDiscoveryPreference build;
        if (gw6.c == null) {
            i = 0;
        } else {
            i = gw6.c().B;
        }
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.x;
        bu6 bu6Var = this.E;
        fu6 fu6Var = this.y;
        if (i > 0) {
            iw6 iw6Var = gw6.c().u;
            if (iw6Var == null) {
                z = false;
            } else {
                z = iw6Var.d;
            }
            if (bv6Var == null) {
                bv6Var = new bv6(yv6.c, false);
            }
            bv6Var.a();
            ArrayList c = bv6Var.b.c();
            if (z) {
                if (!c.contains("android.media.intent.category.LIVE_AUDIO")) {
                    c.add("android.media.intent.category.LIVE_AUDIO");
                }
            } else {
                c.remove("android.media.intent.category.LIVE_AUDIO");
            }
            ?? obj = new Object();
            obj.f(c);
            yv6 g = obj.g();
            boolean b = bv6Var.b();
            if (g != null) {
                Bundle bundle = new Bundle();
                bundle.putBundle("selector", g.a);
                bundle.putBoolean("activeScan", b);
                MediaRouter2 mediaRouter2 = this.r;
                g.a();
                if (g.b.contains(null)) {
                    nd3.c();
                    build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
                } else {
                    boolean z2 = bundle.getBoolean("activeScan");
                    ArrayList arrayList = new ArrayList();
                    ArrayList c2 = g.c();
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
                g50 g50Var = this.F;
                mediaRouter2.registerRouteCallback(g50Var, mediaRouter2$RouteCallback, build);
                this.r.registerTransferCallback(g50Var, fu6Var);
                this.r.registerControllerCallback(g50Var, bu6Var);
                return;
            }
            u36.j("selector must not be null");
            return;
        }
        this.r.unregisterRouteCallback(mediaRouter2$RouteCallback);
        this.r.unregisterTransferCallback(fu6Var);
        this.r.unregisterControllerCallback(bu6Var);
    }

    public final MediaRoute2Info o(String str) {
        if (str != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                MediaRoute2Info f = u36.f(obj);
                if (TextUtils.equals(f.getId(), str)) {
                    return f;
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
            MediaRoute2Info f = u36.f(mediaRoute2Info);
            if (f != null && !arraySet.contains(f) && !f.isSystemRoute()) {
                arraySet.add(f);
                arrayList.add(f);
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
            MediaRoute2Info f2 = u36.f(obj);
            Bundle extras = f2.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                arrayMap.put(f2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + f2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.G;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            MediaRoute2Info f3 = u36.f(obj2);
            zu6 x = via.x(f3);
            if (f3 != null) {
                arrayList3.add(x);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                zu6 zu6Var = (zu6) obj3;
                if (zu6Var != null) {
                    if (!arrayList5.contains(zu6Var)) {
                        arrayList5.add(zu6Var);
                    } else {
                        u36.j("route descriptor already added");
                        return;
                    }
                } else {
                    u36.j("route must not be null");
                    return;
                }
            }
        }
        g(new bo4(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        yu6 yu6Var;
        int i;
        cu6 cu6Var = (cu6) this.w.get(routingController);
        if (cu6Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList h = via.h(selectedRoutes);
        int i2 = 0;
        zu6 x = via.x(u36.f(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(2131689663);
        zu6 zu6Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    zu6Var = new zu6(bundle);
                }
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (zu6Var == null) {
            yu6Var = new yu6(routingController.getId(), string);
            Bundle bundle2 = yu6Var.a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            yu6Var = new yu6(zu6Var);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = yu6Var.a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        yu6Var.c.clear();
        yu6Var.a(x.b());
        ArrayList arrayList = yu6Var.b;
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
                    u36.j("groupMemberId must not be empty");
                    return;
                }
            }
        }
        zu6 b = yu6Var.b();
        ArrayList h2 = via.h(routingController.getSelectableRoutes());
        ArrayList h3 = via.h(routingController.getDeselectableRoutes());
        bo4 bo4Var = (bo4) this.n;
        if (bo4Var == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<zu6> list = bo4Var.b;
        if (!list.isEmpty()) {
            for (zu6 zu6Var2 : list) {
                String d = zu6Var2.d();
                if (h.contains(d)) {
                    i = 3;
                } else {
                    i = 1;
                }
                arrayList2.add(new tv6(zu6Var2, i, h3.contains(d), h2.contains(d), true));
            }
        }
        cu6Var.o = b;
        cu6Var.l(b, arrayList2);
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
