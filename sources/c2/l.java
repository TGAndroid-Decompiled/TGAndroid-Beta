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
public final class l extends s {
    public final f A;
    public ArrayList B;
    public final ArrayMap C;
    public final MediaRouter2 f2187r;
    public final fa.c f2188s;
    public final ArrayMap v;
    public final MediaRouter2.RouteCallback f2189w;
    public final k f2190x;
    public final g f2191y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public l(Context context, fa.c cVar) {
        super(context, null);
        this.v = new ArrayMap();
        this.f2190x = new k(this);
        this.f2191y = new g(this);
        this.B = new ArrayList();
        this.C = new ArrayMap();
        this.f2187r = MediaRouter2.getInstance(context);
        this.f2188s = cVar;
        this.A = new f(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f2189w = new j(this, 1);
        } else {
            this.f2189w = new j(this, 0);
        }
    }

    public static Messenger n(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String p(r rVar) {
        MediaRouter2.RoutingController routingController;
        if (!(rVar instanceof h) || (routingController = ((h) rVar).f2170g) == null) {
            return null;
        }
        return routingController.getId();
    }

    @Override
    public final q c(String str) {
        for (Map.Entry entry : this.v.entrySet()) {
            h hVar = (h) entry.getValue();
            if (TextUtils.equals(str, hVar.f2169f)) {
                return hVar;
            }
        }
        return null;
    }

    @Override
    public final r d(String str) {
        return new i((String) this.C.get(str), null);
    }

    @Override
    public final r e(String str, String str2) {
        String str3 = (String) this.C.get(str);
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
        int i9;
        boolean z10;
        ArrayList<String> arrayList;
        v vVar;
        RouteDiscoveryPreference build;
        if (c0.f2126c == null) {
            i9 = 0;
        } else {
            i9 = c0.c().B;
        }
        g gVar = this.f2191y;
        k kVar = this.f2190x;
        if (i9 > 0) {
            f0 f0Var = c0.c().f2152u;
            if (f0Var == null) {
                z10 = false;
            } else {
                z10 = f0Var.d;
            }
            if (oVar == null) {
                oVar = new o(v.f2236c, false);
            }
            oVar.a();
            ArrayList c10 = oVar.f2201b.c();
            if (z10) {
                if (!c10.contains("android.media.intent.category.LIVE_AUDIO")) {
                    c10.add("android.media.intent.category.LIVE_AUDIO");
                }
            } else {
                c10.remove("android.media.intent.category.LIVE_AUDIO");
            }
            if (!c10.isEmpty()) {
                int size = c10.size();
                arrayList = null;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = c10.get(i10);
                    i10++;
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
                vVar = v.f2236c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                vVar = new v(bundle, arrayList);
            }
            boolean b10 = oVar.b();
            if (vVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("selector", vVar.f2237a);
                bundle2.putBoolean("activeScan", b10);
                MediaRouter2 mediaRouter2 = this.f2187r;
                MediaRouter2.RouteCallback routeCallback = this.f2189w;
                vVar.a();
                if (vVar.f2238b.contains(null)) {
                    build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
                } else {
                    boolean z11 = bundle2.getBoolean("activeScan");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList c11 = vVar.c();
                    int size2 = c11.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = c11.get(i11);
                        i11++;
                        String str2 = (String) obj2;
                        str2.getClass();
                        char c12 = 65535;
                        switch (str2.hashCode()) {
                            case -2065577523:
                                if (str2.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                            case 956939050:
                                if (str2.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case 975975375:
                                if (str2.equals("android.media.intent.category.LIVE_VIDEO")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c12) {
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
                    build = new RouteDiscoveryPreference.Builder(arrayList2, z11).build();
                }
                f fVar = this.A;
                mediaRouter2.registerRouteCallback(fVar, routeCallback, build);
                this.f2187r.registerTransferCallback(fVar, kVar);
                this.f2187r.registerControllerCallback(fVar, gVar);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        this.f2187r.unregisterRouteCallback(this.f2189w);
        this.f2187r.unregisterTransferCallback(kVar);
        this.f2187r.unregisterControllerCallback(gVar);
    }

    public final MediaRoute2Info o(String str) {
        if (str != null) {
            ArrayList arrayList = this.B;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                MediaRoute2Info h = a9.b.h(obj);
                if (TextUtils.equals(h.getId(), str)) {
                    return h;
                }
            }
            return null;
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.f2187r.getRoutes()) {
            MediaRoute2Info h = a9.b.h(mediaRoute2Info);
            if (h != null && !arraySet.contains(h) && !h.isSystemRoute()) {
                arraySet.add(h);
                arrayList.add(h);
            }
        }
        if (arrayList.equals(this.B)) {
            return;
        }
        this.B = arrayList;
        ArrayMap arrayMap = this.C;
        arrayMap.clear();
        ArrayList arrayList2 = this.B;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            MediaRoute2Info h10 = a9.b.h(obj);
            Bundle extras = h10.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                arrayMap.put(h10.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + h10);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.B;
        int size2 = arrayList4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            MediaRoute2Info h11 = a9.b.h(obj2);
            n v = g0.f.v(h11);
            if (h11 != null) {
                arrayList3.add(v);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i9 < size3) {
                Object obj3 = arrayList3.get(i9);
                i9++;
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
        g(new t(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        m mVar;
        int i9;
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
        int i10 = 0;
        n v = g0.f.v(a9.b.h(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f2219a.getString(2131701424);
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
            } catch (Exception e10) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e10);
            }
        }
        if (nVar == null) {
            mVar = new m(routingController.getId(), string);
            Bundle bundle2 = mVar.f2192a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            mVar = new m(nVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = mVar.f2192a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        mVar.f2194c.clear();
        mVar.a(v.b());
        ArrayList arrayList = mVar.f2193b;
        arrayList.clear();
        if (!h.isEmpty()) {
            int size = h.size();
            while (i10 < size) {
                Object obj = h.get(i10);
                i10++;
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
        ArrayList h10 = g0.f.h(routingController.getSelectableRoutes());
        ArrayList h11 = g0.f.h(routingController.getDeselectableRoutes());
        t tVar = (t) this.f2224n;
        if (tVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<n> list = (List) tVar.f2234c;
        if (!list.isEmpty()) {
            for (n nVar2 : list) {
                String d = nVar2.d();
                if (h.contains(d)) {
                    i9 = 3;
                } else {
                    i9 = 1;
                }
                arrayList2.add(new p(nVar2, i9, h11.contains(d), h10.contains(d), true));
            }
        }
        hVar.f2177o = b10;
        hVar.l(b10, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info o6 = o(str);
        if (o6 == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
            return;
        }
        this.f2187r.transferTo(o6);
    }
}
