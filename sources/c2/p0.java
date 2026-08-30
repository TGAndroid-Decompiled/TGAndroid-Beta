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
public class p0 extends q0 implements h0 {
    public static final ArrayList F;
    public static final ArrayList G;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final e f1981r;
    public final MediaRouter f1982s;
    public final g0 v;
    public final MediaRouter.VolumeCallback f1983w;
    public final MediaRouter.RouteCategory f1984x;
    public int f1985y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        F = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        G = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public p0(Context context, e eVar) {
        super(context, new o5.i(new ComponentName("android", q0.class.getName()), 7));
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.f1981r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f1982s = mediaRouter;
        this.v = new g0(this);
        this.f1983w = j0.a(this);
        this.f1984x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131701442), false);
        B();
    }

    public static o0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof o0) {
            return (o0) tag;
        }
        return null;
    }

    public void A() {
        boolean z4 = this.C;
        g0 g0Var = this.v;
        MediaRouter mediaRouter = this.f1982s;
        if (z4) {
            mediaRouter.removeCallback(g0Var);
        }
        this.C = true;
        mediaRouter.addCallback(this.f1985y, g0Var, (this.B ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f1982s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z4 = false;
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z4 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z4) {
            y();
        }
    }

    public void C(o0 o0Var) {
        int i10;
        MediaRouter.UserRouteInfo userRouteInfo = o0Var.f1977b;
        a0 a0Var = o0Var.f1976a;
        userRouteInfo.setName(a0Var.d);
        userRouteInfo.setPlaybackType(a0Var.f1884l);
        userRouteInfo.setPlaybackStream(a0Var.f1885m);
        userRouteInfo.setVolume(a0Var.f1888p);
        userRouteInfo.setVolumeMax(a0Var.f1889q);
        if (a0Var.e() && !c0.g()) {
            i10 = 0;
        } else {
            i10 = a0Var.f1887o;
        }
        userRouteInfo.setVolumeHandling(i10);
        userRouteInfo.setDescription(a0Var.e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        o0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.f1976a.j(i10);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        o0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.f1976a.k(i10);
        }
    }

    @Override
    public final s d(String str) {
        int p10 = p(str);
        if (p10 >= 0) {
            return new m0(((n0) this.D.get(p10)).f1971a);
        }
        return null;
    }

    @Override
    public final void f(o oVar) {
        boolean z4;
        int i10 = 0;
        if (oVar != null) {
            oVar.a();
            ArrayList c3 = oVar.f1975b.c();
            int size = c3.size();
            int i11 = 0;
            while (i10 < size) {
                String str = (String) c3.get(i10);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i11 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i11 |= 2;
                } else {
                    i11 |= 8388608;
                }
                i10++;
            }
            z4 = oVar.b();
            i10 = i11;
        } else {
            z4 = false;
        }
        if (this.f1985y == i10 && this.B == z4) {
            return;
        }
        this.f1985y = i10;
        this.B = z4;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String str;
        String format;
        String str2;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r10 = r();
        String str3 = "";
        Context context = this.f2000a;
        if (r10 == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            if (name == null) {
                str = "";
            } else {
                str = name.toString();
            }
            format = String.format(locale, "ROUTE_%08x", Integer.valueOf(str.hashCode()));
        }
        if (p(format) >= 0) {
            int i10 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = format + "_" + i10;
                if (p(str2) < 0) {
                    break;
                }
                i10++;
            }
            format = str2;
        }
        n0 n0Var = new n0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        m mVar = new m(format, str3);
        u(n0Var, mVar);
        n0Var.f1973c = mVar.b();
        this.D.add(n0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n0) arrayList.get(i10)).f1971a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n0) arrayList.get(i10)).f1972b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(a0 a0Var) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((o0) arrayList.get(i10)).f1976a == a0Var) {
                return i10;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f1982s.getDefaultRoute();
    }

    public boolean t(n0 n0Var) {
        return n0Var.f1971a.isConnecting();
    }

    public void u(n0 n0Var, m mVar) {
        boolean z4;
        MediaRouter.RouteInfo routeInfo = n0Var.f1971a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            mVar.a(F);
        }
        if ((supportedTypes & 2) != 0) {
            mVar.a(G);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = mVar.f1966a;
        Bundle bundle2 = mVar.f1966a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        if ((supportedTypes & 8388608) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        bundle2.putBoolean("isSystemRoute", z4);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (t(n0Var)) {
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

    public final void v(a0 a0Var) {
        t c3 = a0Var.c();
        MediaRouter mediaRouter = this.f1982s;
        if (c3 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f1984x);
            o0 o0Var = new o0(a0Var, createUserRoute);
            createUserRoute.setTag(o0Var);
            createUserRoute.setVolumeCallback(this.f1983w);
            C(o0Var);
            this.E.add(o0Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o10 = o(mediaRouter.getSelectedRoute(8388611));
        if (o10 >= 0 && ((n0) this.D.get(o10)).f1972b.equals(a0Var.f1877b)) {
            a0Var.l();
        }
    }

    public final void w(a0 a0Var) {
        int q10;
        if (a0Var.c() != this && (q10 = q(a0Var)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((o0) this.E.remove(q10)).f1977b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.f1982s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
            }
        }
    }

    public final void x(a0 a0Var) {
        if (a0Var.g()) {
            if (a0Var.c() != this) {
                int q10 = q(a0Var);
                if (q10 >= 0) {
                    z(((o0) this.E.get(q10)).f1977b);
                    return;
                }
                return;
            }
            int p10 = p(a0Var.f1877b);
            if (p10 >= 0) {
                z(((n0) this.D.get(p10)).f1971a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.D;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = ((n0) arrayList2.get(i10)).f1973c;
            if (nVar != null) {
                if (!arrayList.contains(nVar)) {
                    arrayList.add(nVar);
                } else {
                    throw new IllegalArgumentException("route descriptor already added");
                }
            } else {
                throw new IllegalArgumentException("route must not be null");
            }
        }
        g(new u(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.f1982s.selectRoute(8388611, routeInfo);
    }
}
