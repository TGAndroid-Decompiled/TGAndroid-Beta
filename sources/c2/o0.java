package c2;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.Locale;

public class o0 extends p0 implements g0 {
    public static final ArrayList E;
    public static final ArrayList F;
    public boolean A;
    public boolean B;
    public final ArrayList C;
    public final ArrayList D;

    public final e f2317r;

    public final MediaRouter f2318s;
    public final f0 v;

    public final MediaRouter.VolumeCallback f2319w;

    public final MediaRouter.RouteCategory f2320x;

    public int f2321y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        E = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        F = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public o0(Context context, e eVar) {
        super(context, new k5.i(new ComponentName("android", p0.class.getName()), 5));
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.f2317r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f2318s = mediaRouter;
        this.v = new f0(this);
        this.f2319w = i0.a(this);
        this.f2320x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131701428), false);
        B();
    }

    public static n0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof n0) {
            return (n0) tag;
        }
        return null;
    }

    public void A() {
        boolean z10 = this.B;
        f0 f0Var = this.v;
        MediaRouter mediaRouter = this.f2318s;
        if (z10) {
            mediaRouter.removeCallback(f0Var);
        }
        this.B = true;
        mediaRouter.addCallback(this.f2321y, f0Var, (this.A ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f2318s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zN = false;
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            zN |= n((MediaRouter.RouteInfo) obj);
        }
        if (zN) {
            y();
        }
    }

    public void C(n0 n0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = n0Var.f2314b;
        z zVar = n0Var.f2313a;
        userRouteInfo.setName(zVar.d);
        userRouteInfo.setPlaybackType(zVar.f2399l);
        userRouteInfo.setPlaybackStream(zVar.f2400m);
        userRouteInfo.setVolume(zVar.f2403p);
        userRouteInfo.setVolumeMax(zVar.f2404q);
        userRouteInfo.setVolumeHandling((!zVar.e() || b0.g()) ? zVar.f2402o : 0);
        userRouteInfo.setDescription(zVar.f2393e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        n0 n0VarS = s(routeInfo);
        if (n0VarS != null) {
            n0VarS.f2313a.j(i10);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        n0 n0VarS = s(routeInfo);
        if (n0VarS != null) {
            n0VarS.f2313a.k(i10);
        }
    }

    @Override
    public final r d(String str) {
        int iP = p(str);
        if (iP >= 0) {
            return new l0(((m0) this.C.get(iP)).f2309a);
        }
        return null;
    }

    @Override
    public final void f(o oVar) {
        boolean zB;
        int i10 = 0;
        if (oVar != null) {
            oVar.a();
            ArrayList arrayListC = oVar.f2316b.c();
            int size = arrayListC.size();
            int i11 = 0;
            while (i10 < size) {
                String str = (String) arrayListC.get(i10);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i11 |= 1;
                } else {
                    i11 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i11 | 2 : i11 | 8388608;
                }
                i10++;
            }
            zB = oVar.b();
            i10 = i11;
        } else {
            zB = false;
        }
        if (this.f2321y == i10 && this.A == zB) {
            return;
        }
        this.f2321y = i10;
        this.A = zB;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String str;
        String str2;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo routeInfoR = r();
        Context context = this.f2339a;
        if (routeInfoR == routeInfo) {
            str = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            str = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (p(str) >= 0) {
            int i10 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = str + "_" + i10;
                if (p(str2) < 0) {
                    break;
                }
                i10++;
            }
            str = str2;
        }
        m0 m0Var = new m0(routeInfo, str);
        CharSequence name2 = routeInfo.getName(context);
        m mVar = new m(str, name2 != null ? name2.toString() : "");
        u(m0Var, mVar);
        m0Var.f2311c = mVar.b();
        this.C.add(m0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m0) arrayList.get(i10)).f2309a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m0) arrayList.get(i10)).f2310b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(z zVar) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n0) arrayList.get(i10)).f2313a == zVar) {
                return i10;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f2318s.getDefaultRoute();
    }

    public boolean t(m0 m0Var) {
        return m0Var.f2309a.isConnecting();
    }

    public void u(m0 m0Var, m mVar) {
        MediaRouter.RouteInfo routeInfo = m0Var.f2309a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            mVar.a(E);
        }
        if ((supportedTypes & 2) != 0) {
            mVar.a(F);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = mVar.f2306a;
        Bundle bundle2 = mVar.f2306a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        bundle2.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (t(m0Var)) {
            bundle2.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle2.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle2.putString("status", description.toString());
        }
    }

    public final void v(z zVar) {
        s sVarC = zVar.c();
        MediaRouter mediaRouter = this.f2318s;
        if (sVarC == this) {
            int iO = o(mediaRouter.getSelectedRoute(8388611));
            if (iO < 0 || !((m0) this.C.get(iO)).f2310b.equals(zVar.f2391b)) {
                return;
            }
            zVar.l();
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.f2320x);
        n0 n0Var = new n0(zVar, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(n0Var);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.f2319w);
        C(n0Var);
        this.D.add(n0Var);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    public final void w(z zVar) {
        int iQ;
        if (zVar.c() == this || (iQ = q(zVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((n0) this.D.remove(iQ)).f2314b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.f2318s.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e9) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e9);
        }
    }

    public final void x(z zVar) {
        if (zVar.g()) {
            if (zVar.c() != this) {
                int iQ = q(zVar);
                if (iQ >= 0) {
                    z(((n0) this.D.get(iQ)).f2314b);
                    return;
                }
                return;
            }
            int iP = p(zVar.f2391b);
            if (iP >= 0) {
                z(((m0) this.C.get(iP)).f2309a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = ((m0) arrayList2.get(i10)).f2311c;
            if (nVar == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(nVar)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(nVar);
        }
        g(new t(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.f2318s.selectRoute(8388611, routeInfo);
    }
}
