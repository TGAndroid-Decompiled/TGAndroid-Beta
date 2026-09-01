package c2;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
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
public final class l extends t {
    public final f B;
    public ArrayList C;
    public final ArrayMap D;
    public final MediaRouter2 f2129r;
    public final ja.c f2130s;
    public final ArrayMap v;
    public final MediaRouter2.RouteCallback f2131w;
    public final k f2132x;
    public final g f2133y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public l(Context context, ja.c cVar) {
        super(context, null);
        this.v = new ArrayMap();
        this.f2132x = new k(this);
        this.f2133y = new g(this);
        this.C = new ArrayList();
        this.D = new ArrayMap();
        this.f2129r = MediaRouter2.getInstance(context);
        this.f2130s = cVar;
        this.B = new f(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f2131w = new j(this, 1);
        } else {
            this.f2131w = new j(this, 0);
        }
    }

    public static Messenger n(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String p(s sVar) {
        MediaRouter2.RoutingController routingController;
        if (!(sVar instanceof h) || (routingController = ((h) sVar).f2112g) == null) {
            return null;
        }
        return routingController.getId();
    }

    @Override
    public final r c(String str) {
        for (Map.Entry entry : this.v.entrySet()) {
            h hVar = (h) entry.getValue();
            if (TextUtils.equals(str, hVar.f2111f)) {
                return hVar;
            }
        }
        return null;
    }

    @Override
    public final s d(String str) {
        return new i((String) this.D.get(str), null);
    }

    @Override
    public final s e(String str, String str2) {
        String str3 = (String) this.D.get(str);
        for (h hVar : this.v.values()) {
            if (TextUtils.equals(str2, hVar.p())) {
                return new i(str3, hVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new i(str3, null);
    }

    @Override
    public final void f(o oVar) {
        int i10;
        boolean z4;
        ArrayList<String> arrayList;
        v vVar;
        RouteDiscoveryPreference build;
        if (c0.f2069c == null) {
            i10 = 0;
        } else {
            i10 = c0.c().B;
        }
        g gVar = this.f2133y;
        k kVar = this.f2132x;
        if (i10 > 0) {
            f0 f0Var = c0.c().f2094u;
            if (f0Var == null) {
                z4 = false;
            } else {
                z4 = f0Var.d;
            }
            if (oVar == null) {
                oVar = new o(v.f2183c, false);
            }
            oVar.a();
            ArrayList c3 = oVar.f2143b.c();
            if (z4) {
                if (!c3.contains("android.media.intent.category.LIVE_AUDIO")) {
                    c3.add("android.media.intent.category.LIVE_AUDIO");
                }
            } else {
                c3.remove("android.media.intent.category.LIVE_AUDIO");
            }
            if (!c3.isEmpty()) {
                int size = c3.size();
                arrayList = null;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = c3.get(i11);
                    i11++;
                    String str = (String) obj;
                    if (str != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                vVar = v.f2183c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                vVar = new v(bundle, arrayList);
            }
            boolean b10 = oVar.b();
            if (vVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("selector", vVar.f2184a);
                bundle2.putBoolean("activeScan", b10);
                MediaRouter2 mediaRouter2 = this.f2129r;
                MediaRouter2.RouteCallback routeCallback = this.f2131w;
                vVar.a();
                if (vVar.f2185b.contains(null)) {
                    build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
                } else {
                    boolean z10 = bundle2.getBoolean("activeScan");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList c10 = vVar.c();
                    int size2 = c10.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = c10.get(i12);
                        i12++;
                        String str2 = (String) obj2;
                        str2.getClass();
                        char c11 = 65535;
                        switch (str2.hashCode()) {
                            case -2065577523:
                                if (str2.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 956939050:
                                if (str2.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case 975975375:
                                if (str2.equals("android.media.intent.category.LIVE_VIDEO")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c11) {
                            case 0:
                                str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                                break;
                            case 1:
                                str2 = "android.media.route.feature.LIVE_AUDIO";
                                break;
                            case 2:
                                str2 = "android.media.route.feature.LIVE_VIDEO";
                                break;
                        }
                        arrayList2.add(str2);
                    }
                    build = new RouteDiscoveryPreference.Builder(arrayList2, z10).build();
                }
                f fVar = this.B;
                mediaRouter2.registerRouteCallback(fVar, routeCallback, build);
                this.f2129r.registerTransferCallback(fVar, kVar);
                this.f2129r.registerControllerCallback(fVar, gVar);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        this.f2129r.unregisterRouteCallback(this.f2131w);
        this.f2129r.unregisterTransferCallback(kVar);
        this.f2129r.unregisterControllerCallback(gVar);
    }

    public final MediaRoute2Info o(String str) {
        if (str != null) {
            ArrayList arrayList = this.C;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                MediaRoute2Info d = androidx.emoji2.text.w.d(obj);
                if (TextUtils.equals(d.getId(), str)) {
                    return d;
                }
            }
            return null;
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.f2129r.getRoutes()) {
            MediaRoute2Info d = androidx.emoji2.text.w.d(mediaRoute2Info);
            if (d != null && !arraySet.contains(d) && !d.isSystemRoute()) {
                arraySet.add(d);
                arrayList.add(d);
            }
        }
        if (arrayList.equals(this.C)) {
            return;
        }
        this.C = arrayList;
        ArrayMap arrayMap = this.D;
        arrayMap.clear();
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            MediaRoute2Info d10 = androidx.emoji2.text.w.d(obj);
            Bundle extras = d10.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                arrayMap.put(d10.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + d10);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.C;
        int size2 = arrayList4.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList4.get(i12);
            i12++;
            MediaRoute2Info d11 = androidx.emoji2.text.w.d(obj2);
            n v = g0.f.v(d11);
            if (d11 != null) {
                arrayList3.add(v);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                n nVar = (n) obj3;
                if (nVar != null) {
                    if (!arrayList5.contains(nVar)) {
                        arrayList5.add(nVar);
                    } else {
                        throw new IllegalArgumentException("route descriptor already added");
                    }
                } else {
                    throw new IllegalArgumentException("route must not be null");
                }
            }
        }
        g(new u(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        m mVar;
        int i10;
        h hVar = (h) this.v.get(routingController);
        if (hVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList h = g0.f.h(selectedRoutes);
        int i11 = 0;
        n v = g0.f.v(androidx.emoji2.text.w.d(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f2172a.getString(2131689643);
        n nVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    nVar = new n(bundle);
                }
            } catch (Exception e6) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e6);
            }
        }
        if (nVar == null) {
            mVar = new m(routingController.getId(), string);
            Bundle bundle2 = mVar.f2134a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            mVar = new m(nVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = mVar.f2134a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        mVar.f2136c.clear();
        mVar.a(v.b());
        ArrayList arrayList = mVar.f2135b;
        arrayList.clear();
        if (!h.isEmpty()) {
            int size = h.size();
            while (i11 < size) {
                Object obj = h.get(i11);
                i11++;
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                } else {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
            }
        }
        n b10 = mVar.b();
        ArrayList h9 = g0.f.h(routingController.getSelectableRoutes());
        ArrayList h10 = g0.f.h(routingController.getDeselectableRoutes());
        u uVar = (u) this.f2177n;
        if (uVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<n> list = (List) uVar.f2180c;
        if (!list.isEmpty()) {
            for (n nVar2 : list) {
                String d = nVar2.d();
                if (h.contains(d)) {
                    i10 = 3;
                } else {
                    i10 = 1;
                }
                arrayList2.add(new q(nVar2, i10, h10.contains(d), h9.contains(d), true));
            }
        }
        hVar.f2119o = b10;
        hVar.l(b10, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info o10 = o(str);
        if (o10 == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
            return;
        }
        this.f2129r.transferTo(o10);
    }
}
