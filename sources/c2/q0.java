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
public class q0 extends r0 implements i0 {
    public static final ArrayList F;
    public static final ArrayList G;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final e f2014r;
    public final MediaRouter f2015s;
    public final h0 v;
    public final MediaRouter.VolumeCallback f2016w;
    public final MediaRouter.RouteCategory f2017x;
    public int f2018y;

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

    public q0(Context context, e eVar) {
        super(context, new o5.i(new ComponentName("android", r0.class.getName()), 7));
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.f2014r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f2015s = mediaRouter;
        this.v = new h0(this);
        this.f2016w = k0.a(this);
        this.f2017x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131689645), false);
        B();
    }

    public static p0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof p0) {
            return (p0) tag;
        }
        return null;
    }

    public void A() {
        boolean z4 = this.C;
        h0 h0Var = this.v;
        MediaRouter mediaRouter = this.f2015s;
        if (z4) {
            mediaRouter.removeCallback(h0Var);
        }
        this.C = true;
        mediaRouter.addCallback(this.f2018y, h0Var, (this.B ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f2015s;
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

    public void C(p0 p0Var) {
        int i10;
        MediaRouter.UserRouteInfo userRouteInfo = p0Var.f2010b;
        b0 b0Var = p0Var.f2009a;
        userRouteInfo.setName(b0Var.d);
        userRouteInfo.setPlaybackType(b0Var.f1917l);
        userRouteInfo.setPlaybackStream(b0Var.f1918m);
        userRouteInfo.setVolume(b0Var.f1921p);
        userRouteInfo.setVolumeMax(b0Var.f1922q);
        if (b0Var.e() && !d0.g()) {
            i10 = 0;
        } else {
            i10 = b0Var.f1920o;
        }
        userRouteInfo.setVolumeHandling(i10);
        userRouteInfo.setDescription(b0Var.e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        p0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.f2009a.j(i10);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        p0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.f2009a.k(i10);
        }
    }

    @Override
    public final s d(String str) {
        int p10 = p(str);
        if (p10 >= 0) {
            return new n0(((o0) this.D.get(p10)).f2003a);
        }
        return null;
    }

    @Override
    public final void f(o oVar) {
        boolean z4;
        int i10 = 0;
        if (oVar != null) {
            oVar.a();
            ArrayList c3 = oVar.f2002b.c();
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
        if (this.f2018y == i10 && this.B == z4) {
            return;
        }
        this.f2018y = i10;
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
        Context context = this.f2024a;
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
        o0 o0Var = new o0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        m mVar = new m(format, str3);
        u(o0Var, mVar);
        o0Var.f2005c = mVar.b();
        this.D.add(o0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((o0) arrayList.get(i10)).f2003a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((o0) arrayList.get(i10)).f2004b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(b0 b0Var) {
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((p0) arrayList.get(i10)).f2009a == b0Var) {
                return i10;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f2015s.getDefaultRoute();
    }

    public boolean t(o0 o0Var) {
        return o0Var.f2003a.isConnecting();
    }

    public void u(o0 o0Var, m mVar) {
        boolean z4;
        MediaRouter.RouteInfo routeInfo = o0Var.f2003a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            mVar.a(F);
        }
        if ((supportedTypes & 2) != 0) {
            mVar.a(G);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = mVar.f1996a;
        Bundle bundle2 = mVar.f1996a;
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
        if (t(o0Var)) {
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

    public final void v(b0 b0Var) {
        t c3 = b0Var.c();
        MediaRouter mediaRouter = this.f2015s;
        if (c3 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f2017x);
            p0 p0Var = new p0(b0Var, createUserRoute);
            createUserRoute.setTag(p0Var);
            createUserRoute.setVolumeCallback(this.f2016w);
            C(p0Var);
            this.E.add(p0Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o10 = o(mediaRouter.getSelectedRoute(8388611));
        if (o10 >= 0 && ((o0) this.D.get(o10)).f2004b.equals(b0Var.f1910b)) {
            b0Var.l();
        }
    }

    public final void w(b0 b0Var) {
        int q10;
        if (b0Var.c() != this && (q10 = q(b0Var)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((p0) this.E.remove(q10)).f2010b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.f2015s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
            }
        }
    }

    public final void x(b0 b0Var) {
        if (b0Var.g()) {
            if (b0Var.c() != this) {
                int q10 = q(b0Var);
                if (q10 >= 0) {
                    z(((p0) this.E.get(q10)).f2010b);
                    return;
                }
                return;
            }
            int p10 = p(b0Var.f1910b);
            if (p10 >= 0) {
                z(((o0) this.D.get(p10)).f2003a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.D;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = ((o0) arrayList2.get(i10)).f2005c;
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
        this.f2015s.selectRoute(8388611, routeInfo);
    }
}
