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
    public static final ArrayList E;
    public static final ArrayList F;
    public boolean A;
    public boolean B;
    public final ArrayList C;
    public final ArrayList D;
    public final e f2886r;
    public final MediaRouter f2887s;
    public final h0 v;
    public final MediaRouter.VolumeCallback f2888w;
    public final MediaRouter.RouteCategory f2889x;
    public int f2890y;

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

    public q0(Context context, e eVar) {
        super(context, new m5.i(new ComponentName("android", r0.class.getName()), 7));
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.f2886r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f2887s = mediaRouter;
        this.v = new h0(this);
        this.f2888w = k0.a(this);
        this.f2889x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131701430), false);
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
        boolean z10 = this.B;
        h0 h0Var = this.v;
        MediaRouter mediaRouter = this.f2887s;
        if (z10) {
            mediaRouter.removeCallback(h0Var);
        }
        this.B = true;
        mediaRouter.addCallback(this.f2890y, h0Var, (this.A ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f2887s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z10) {
            y();
        }
    }

    public void C(p0 p0Var) {
        int i10;
        MediaRouter.UserRouteInfo userRouteInfo = p0Var.f2881b;
        b0 b0Var = p0Var.f2880a;
        userRouteInfo.setName(b0Var.d);
        userRouteInfo.setPlaybackType(b0Var.f2780l);
        userRouteInfo.setPlaybackStream(b0Var.f2781m);
        userRouteInfo.setVolume(b0Var.f2784p);
        userRouteInfo.setVolumeMax(b0Var.f2785q);
        if (b0Var.e() && !d0.g()) {
            i10 = 0;
        } else {
            i10 = b0Var.f2783o;
        }
        userRouteInfo.setVolumeHandling(i10);
        userRouteInfo.setDescription(b0Var.f2774e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        p0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.f2880a.j(i10);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        p0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.f2880a.k(i10);
        }
    }

    @Override
    public final s d(String str) {
        int p10 = p(str);
        if (p10 >= 0) {
            return new n0(((o0) this.C.get(p10)).f2873a);
        }
        return null;
    }

    @Override
    public final void f(o oVar) {
        boolean z10;
        int i10 = 0;
        if (oVar != null) {
            oVar.a();
            ArrayList c3 = oVar.f2872b.c();
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
            z10 = oVar.b();
            i10 = i11;
        } else {
            z10 = false;
        }
        if (this.f2890y == i10 && this.A == z10) {
            return;
        }
        this.f2890y = i10;
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
        MediaRouter.RouteInfo r6 = r();
        String str3 = "";
        Context context = this.f2897a;
        if (r6 == routeInfo) {
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
        o0Var.f2875c = mVar.b();
        this.C.add(o0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((o0) arrayList.get(i10)).f2873a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((o0) arrayList.get(i10)).f2874b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(b0 b0Var) {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((p0) arrayList.get(i10)).f2880a == b0Var) {
                return i10;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f2887s.getDefaultRoute();
    }

    public boolean t(o0 o0Var) {
        return o0Var.f2873a.isConnecting();
    }

    public void u(o0 o0Var, m mVar) {
        boolean z10;
        MediaRouter.RouteInfo routeInfo = o0Var.f2873a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            mVar.a(E);
        }
        if ((supportedTypes & 2) != 0) {
            mVar.a(F);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = mVar.f2866a;
        Bundle bundle2 = mVar.f2866a;
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
        MediaRouter mediaRouter = this.f2887s;
        if (c3 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f2889x);
            p0 p0Var = new p0(b0Var, createUserRoute);
            createUserRoute.setTag(p0Var);
            createUserRoute.setVolumeCallback(this.f2888w);
            C(p0Var);
            this.D.add(p0Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o10 = o(mediaRouter.getSelectedRoute(8388611));
        if (o10 >= 0 && ((o0) this.C.get(o10)).f2874b.equals(b0Var.f2772b)) {
            b0Var.l();
        }
    }

    public final void w(b0 b0Var) {
        int q6;
        if (b0Var.c() != this && (q6 = q(b0Var)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((p0) this.D.remove(q6)).f2881b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.f2887s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e10) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e10);
            }
        }
    }

    public final void x(b0 b0Var) {
        if (b0Var.g()) {
            if (b0Var.c() != this) {
                int q6 = q(b0Var);
                if (q6 >= 0) {
                    z(((p0) this.D.get(q6)).f2881b);
                    return;
                }
                return;
            }
            int p10 = p(b0Var.f2772b);
            if (p10 >= 0) {
                z(((o0) this.C.get(p10)).f2873a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.C;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = ((o0) arrayList2.get(i10)).f2875c;
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
        this.f2887s.selectRoute(8388611, routeInfo);
    }
}
