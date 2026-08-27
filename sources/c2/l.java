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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class l extends s {
    public final f A;
    public ArrayList B;
    public final ArrayMap C;

    public final MediaRouter2 f2300r;

    public final ae.b f2301s;
    public final ArrayMap v;

    public final MediaRouter2.RouteCallback f2302w;

    public final k f2303x;

    public final g f2304y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public l(Context context, ae.b bVar) {
        super(context, null);
        this.v = new ArrayMap();
        this.f2303x = new k(this);
        this.f2304y = new g(this);
        this.B = new ArrayList();
        this.C = new ArrayMap();
        this.f2300r = MediaRouter2.getInstance(context);
        this.f2301s = bVar;
        this.A = new f(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f2302w = new j(this, 1);
        } else {
            this.f2302w = new j(this, 0);
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
        if ((rVar instanceof h) && (routingController = ((h) rVar).f2283g) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override
    public final q c(String str) {
        Iterator it = this.v.entrySet().iterator();
        while (it.hasNext()) {
            h hVar = (h) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, hVar.f2282f)) {
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
        ArrayList<String> arrayList;
        u uVar;
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        int i10 = b0.f2236c == null ? 0 : b0.c().B;
        g gVar = this.f2304y;
        k kVar = this.f2303x;
        if (i10 <= 0) {
            this.f2300r.unregisterRouteCallback(this.f2302w);
            this.f2300r.unregisterTransferCallback(kVar);
            this.f2300r.unregisterControllerCallback(gVar);
            return;
        }
        e0 e0Var = b0.c().f2269u;
        boolean z10 = e0Var == null ? false : e0Var.d;
        if (oVar == null) {
            oVar = new o(u.f2348c, false);
        }
        oVar.a();
        ArrayList arrayListC = oVar.f2316b.c();
        if (!z10) {
            arrayListC.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListC.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListC.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (arrayListC.isEmpty()) {
            arrayList = null;
        } else {
            int size = arrayListC.size();
            arrayList = null;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListC.get(i11);
                i11++;
                String str = (String) obj;
                if (str == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null) {
            uVar = u.f2348c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            uVar = new u(bundle, arrayList);
        }
        boolean zB = oVar.b();
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", uVar.f2349a);
        bundle2.putBoolean("activeScan", zB);
        MediaRouter2 mediaRouter2 = this.f2300r;
        MediaRouter2.RouteCallback routeCallback = this.f2302w;
        uVar.a();
        if (uVar.f2350b.contains(null)) {
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        } else {
            boolean z11 = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayListC2 = uVar.c();
            int size2 = arrayListC2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayListC2.get(i12);
                i12++;
                String str2 = (String) obj2;
                str2.getClass();
                switch (str2) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str2 = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str2 = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str2);
            }
            routeDiscoveryPreferenceBuild = new RouteDiscoveryPreference.Builder(arrayList2, z11).build();
        }
        f fVar = this.A;
        mediaRouter2.registerRouteCallback(fVar, routeCallback, routeDiscoveryPreferenceBuild);
        this.f2300r.registerTransferCallback(fVar, kVar);
        this.f2300r.registerControllerCallback(fVar, gVar);
    }

    public final MediaRoute2Info o(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            MediaRoute2Info mediaRoute2InfoD = a9.m.d(obj);
            if (TextUtils.equals(mediaRoute2InfoD.getId(), str)) {
                return mediaRoute2InfoD;
            }
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.f2300r.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoD = a9.m.d(it.next());
            if (mediaRoute2InfoD != null && !arraySet.contains(mediaRoute2InfoD) && !mediaRoute2InfoD.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoD);
                arrayList.add(mediaRoute2InfoD);
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
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            MediaRoute2Info mediaRoute2InfoD2 = a9.m.d(obj);
            Bundle extras = mediaRoute2InfoD2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2InfoD2);
            } else {
                arrayMap.put(mediaRoute2InfoD2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.B;
        int size2 = arrayList4.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList4.get(i12);
            i12++;
            MediaRoute2Info mediaRoute2InfoD3 = a9.m.d(obj2);
            n nVarV = g0.f.v(mediaRoute2InfoD3);
            if (mediaRoute2InfoD3 != null) {
                arrayList3.add(nVarV);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                n nVar = (n) obj3;
                if (nVar == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList5.contains(nVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList5.add(nVar);
            }
        }
        g(new t(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        m mVar;
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
        ArrayList arrayListH = g0.f.h(selectedRoutes);
        int i10 = 0;
        n nVarV = g0.f.v(a9.m.d(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f2339a.getString(2131701424);
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
            } catch (Exception e9) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e9);
            }
        }
        if (nVar == null) {
            mVar = new m(routingController.getId(), string);
            Bundle bundle2 = mVar.f2306a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            mVar = new m(nVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = mVar.f2306a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        mVar.f2308c.clear();
        mVar.a(nVarV.b());
        ArrayList arrayList = mVar.f2307b;
        arrayList.clear();
        if (!arrayListH.isEmpty()) {
            int size = arrayListH.size();
            while (i10 < size) {
                Object obj = arrayListH.get(i10);
                i10++;
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        n nVarB = mVar.b();
        ArrayList arrayListH2 = g0.f.h(routingController.getSelectableRoutes());
        ArrayList arrayListH3 = g0.f.h(routingController.getDeselectableRoutes());
        t tVar = (t) this.f2344n;
        if (tVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<n> list = (List) tVar.f2347c;
        if (!list.isEmpty()) {
            for (n nVar2 : list) {
                String strD = nVar2.d();
                arrayList2.add(new p(nVar2, arrayListH.contains(strD) ? 3 : 1, arrayListH3.contains(strD), arrayListH2.contains(strD), true));
            }
        }
        hVar.f2290o = nVarB;
        hVar.l(nVarB, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info mediaRoute2InfoO = o(str);
        if (mediaRoute2InfoO != null) {
            this.f2300r.transferTo(mediaRoute2InfoO);
            return;
        }
        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
    }
}
