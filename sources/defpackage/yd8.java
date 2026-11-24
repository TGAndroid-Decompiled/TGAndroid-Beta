package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.Locale;
public class yd8 extends wv6 implements kw6 {
    public static final ArrayList J;
    public static final ArrayList K;
    public int E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public final wz4 r;
    public final MediaRouter s;
    public final jw6 w;
    public final MediaRouter.VolumeCallback x;
    public final MediaRouter.RouteCategory y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        J = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        K = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public yd8(Context context, wz4 wz4Var) {
        super(context, new ai4(new ComponentName("android", yd8.class.getName()), (byte) 15));
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.r = wz4Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.s = mediaRouter;
        this.w = new jw6(this);
        this.x = mw6.a(this);
        this.y = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131689667), false);
        B();
    }

    public static xd8 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof xd8) {
            return (xd8) tag;
        }
        return null;
    }

    public void A() {
        boolean z = this.G;
        jw6 jw6Var = this.w;
        MediaRouter mediaRouter = this.s;
        if (z) {
            mediaRouter.removeCallback(jw6Var);
        }
        this.G = true;
        mediaRouter.addCallback(this.E, jw6Var, (this.F ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            z |= n((MediaRouter.RouteInfo) obj);
        }
        if (z) {
            y();
        }
    }

    public void C(xd8 xd8Var) {
        int i;
        MediaRouter.UserRouteInfo userRouteInfo = xd8Var.b;
        ew6 ew6Var = xd8Var.a;
        userRouteInfo.setName(ew6Var.d);
        userRouteInfo.setPlaybackType(ew6Var.l);
        userRouteInfo.setPlaybackStream(ew6Var.m);
        userRouteInfo.setVolume(ew6Var.p);
        userRouteInfo.setVolumeMax(ew6Var.q);
        if (ew6Var.e() && !gw6.g()) {
            i = 0;
        } else {
            i = ew6Var.o;
        }
        userRouteInfo.setVolumeHandling(i);
        userRouteInfo.setDescription(ew6Var.e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i) {
        xd8 s = s(routeInfo);
        if (s != null) {
            s.a.j(i);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i) {
        xd8 s = s(routeInfo);
        if (s != null) {
            s.a.k(i);
        }
    }

    @Override
    public final vv6 d(String str) {
        int p = p(str);
        if (p >= 0) {
            return new vd8(((wd8) this.H.get(p)).a);
        }
        return null;
    }

    @Override
    public final void f(bv6 bv6Var) {
        boolean z;
        int i = 0;
        if (bv6Var != null) {
            bv6Var.a();
            ArrayList c = bv6Var.b.c();
            int size = c.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) c.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i2 |= 2;
                } else {
                    i2 |= 8388608;
                }
                i++;
            }
            z = bv6Var.b();
            i = i2;
        } else {
            z = false;
        }
        if (this.E == i && this.F == z) {
            return;
        }
        this.E = i;
        this.F = z;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String str;
        String format;
        String str2;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r = r();
        String str3 = "";
        Context context = this.a;
        if (r == routeInfo) {
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
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = format + "_" + i;
                if (p(str2) < 0) {
                    break;
                }
                i++;
            }
            format = str2;
        }
        wd8 wd8Var = new wd8(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        yu6 yu6Var = new yu6(format, str3);
        u(wd8Var, yu6Var);
        wd8Var.c = yu6Var.b();
        this.H.add(wd8Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((wd8) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((wd8) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int q(ew6 ew6Var) {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xd8) arrayList.get(i)).a == ew6Var) {
                return i;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.s.getDefaultRoute();
    }

    public boolean t(wd8 wd8Var) {
        return wd8Var.a.isConnecting();
    }

    public void u(wd8 wd8Var, yu6 yu6Var) {
        boolean z;
        MediaRouter.RouteInfo routeInfo = wd8Var.a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            yu6Var.a(J);
        }
        if ((supportedTypes & 2) != 0) {
            yu6Var.a(K);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = yu6Var.a;
        Bundle bundle2 = yu6Var.a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        if ((supportedTypes & 8388608) == 0) {
            z = true;
        } else {
            z = false;
        }
        bundle2.putBoolean("isSystemRoute", z);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (t(wd8Var)) {
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

    public final void v(ew6 ew6Var) {
        wv6 c = ew6Var.c();
        MediaRouter mediaRouter = this.s;
        if (c != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.y);
            xd8 xd8Var = new xd8(ew6Var, createUserRoute);
            createUserRoute.setTag(xd8Var);
            createUserRoute.setVolumeCallback(this.x);
            C(xd8Var);
            this.I.add(xd8Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o = o(mediaRouter.getSelectedRoute(8388611));
        if (o >= 0 && ((wd8) this.H.get(o)).b.equals(ew6Var.b)) {
            ew6Var.l();
        }
    }

    public final void w(ew6 ew6Var) {
        int q;
        if (ew6Var.c() != this && (q = q(ew6Var)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((xd8) this.I.remove(q)).b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
            }
        }
    }

    public final void x(ew6 ew6Var) {
        if (ew6Var.g()) {
            if (ew6Var.c() != this) {
                int q = q(ew6Var);
                if (q >= 0) {
                    z(((xd8) this.I.get(q)).b);
                    return;
                }
                return;
            }
            int p = p(ew6Var.b);
            if (p >= 0) {
                z(((wd8) this.H.get(p)).a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            zu6 zu6Var = ((wd8) arrayList2.get(i)).c;
            if (zu6Var != null) {
                if (!arrayList.contains(zu6Var)) {
                    arrayList.add(zu6Var);
                } else {
                    u36.j("route descriptor already added");
                    return;
                }
            } else {
                u36.j("route must not be null");
                return;
            }
        }
        g(new bo4(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.s.selectRoute(8388611, routeInfo);
    }
}
