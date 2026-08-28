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
    public static final ArrayList E;
    public static final ArrayList F;
    public boolean A;
    public boolean B;
    public final ArrayList C;
    public final ArrayList D;
    public final e f2208r;
    public final MediaRouter f2209s;
    public final g0 v;
    public final MediaRouter.VolumeCallback f2210w;
    public final MediaRouter.RouteCategory f2211x;
    public int f2212y;

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

    public p0(Context context, e eVar) {
        super(context, new android.support.v4.media.c(new ComponentName("android", q0.class.getName()), 5));
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.f2208r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f2209s = mediaRouter;
        this.v = new g0(this);
        this.f2210w = j0.a(this);
        this.f2211x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131701428), false);
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
        boolean z10 = this.B;
        g0 g0Var = this.v;
        MediaRouter mediaRouter = this.f2209s;
        if (z10) {
            mediaRouter.removeCallback(g0Var);
        }
        this.B = true;
        mediaRouter.addCallback(this.f2212y, g0Var, (this.A ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f2209s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i9 = 0; i9 < routeCount; i9++) {
            arrayList.add(mediaRouter.getRouteAt(i9));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z10 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z10) {
            y();
        }
    }

    public void C(o0 o0Var) {
        int i9;
        MediaRouter.UserRouteInfo userRouteInfo = o0Var.f2203b;
        a0 a0Var = o0Var.f2202a;
        userRouteInfo.setName(a0Var.d);
        userRouteInfo.setPlaybackType(a0Var.f2099l);
        userRouteInfo.setPlaybackStream(a0Var.f2100m);
        userRouteInfo.setVolume(a0Var.f2103p);
        userRouteInfo.setVolumeMax(a0Var.f2104q);
        if (a0Var.e() && !c0.g()) {
            i9 = 0;
        } else {
            i9 = a0Var.f2102o;
        }
        userRouteInfo.setVolumeHandling(i9);
        userRouteInfo.setDescription(a0Var.f2093e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i9) {
        o0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.f2202a.j(i9);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i9) {
        o0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.f2202a.k(i9);
        }
    }

    @Override
    public final r d(String str) {
        int p6 = p(str);
        if (p6 >= 0) {
            return new m0(((n0) this.C.get(p6)).f2197a);
        }
        return null;
    }

    @Override
    public final void f(o oVar) {
        boolean z10;
        int i9 = 0;
        if (oVar != null) {
            oVar.a();
            ArrayList c10 = oVar.f2201b.c();
            int size = c10.size();
            int i10 = 0;
            while (i9 < size) {
                String str = (String) c10.get(i9);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i10 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i10 |= 2;
                } else {
                    i10 |= 8388608;
                }
                i9++;
            }
            z10 = oVar.b();
            i9 = i10;
        } else {
            z10 = false;
        }
        if (this.f2212y == i9 && this.A == z10) {
            return;
        }
        this.f2212y = i9;
        this.A = z10;
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
        Context context = this.f2219a;
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
            int i9 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = format + "_" + i9;
                if (p(str2) < 0) {
                    break;
                }
                i9++;
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
        n0Var.f2199c = mVar.b();
        this.C.add(n0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((n0) arrayList.get(i9)).f2197a == routeInfo) {
                return i9;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((n0) arrayList.get(i9)).f2198b.equals(str)) {
                return i9;
            }
        }
        return -1;
    }

    public final int q(a0 a0Var) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((o0) arrayList.get(i9)).f2202a == a0Var) {
                return i9;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f2209s.getDefaultRoute();
    }

    public boolean t(n0 n0Var) {
        return n0Var.f2197a.isConnecting();
    }

    public void u(n0 n0Var, m mVar) {
        boolean z10;
        MediaRouter.RouteInfo routeInfo = n0Var.f2197a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            mVar.a(E);
        }
        if ((supportedTypes & 2) != 0) {
            mVar.a(F);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = mVar.f2192a;
        Bundle bundle2 = mVar.f2192a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        if ((supportedTypes & 8388608) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bundle2.putBoolean("isSystemRoute", z10);
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
        s c10 = a0Var.c();
        MediaRouter mediaRouter = this.f2209s;
        if (c10 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f2211x);
            o0 o0Var = new o0(a0Var, createUserRoute);
            createUserRoute.setTag(o0Var);
            createUserRoute.setVolumeCallback(this.f2210w);
            C(o0Var);
            this.D.add(o0Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o6 = o(mediaRouter.getSelectedRoute(8388611));
        if (o6 >= 0 && ((n0) this.C.get(o6)).f2198b.equals(a0Var.f2091b)) {
            a0Var.l();
        }
    }

    public final void w(a0 a0Var) {
        int q10;
        if (a0Var.c() != this && (q10 = q(a0Var)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((o0) this.D.remove(q10)).f2203b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.f2209s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e10) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e10);
            }
        }
    }

    public final void x(a0 a0Var) {
        if (a0Var.g()) {
            if (a0Var.c() != this) {
                int q10 = q(a0Var);
                if (q10 >= 0) {
                    z(((o0) this.D.get(q10)).f2203b);
                    return;
                }
                return;
            }
            int p6 = p(a0Var.f2091b);
            if (p6 >= 0) {
                z(((n0) this.C.get(p6)).f2197a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            n nVar = ((n0) arrayList2.get(i9)).f2199c;
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
        g(new t(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.f2209s.selectRoute(8388611, routeInfo);
    }
}
