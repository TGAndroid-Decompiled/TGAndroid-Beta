package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
public final class lw6 extends yu6 {
    public static final int B;
    public kc8 A;
    public final mv6 g;
    public final ps h;
    public final ps i;
    public final tv6 j;
    public final lj9 k;
    public final spc l;
    public final c1 m;
    public final boolean n;
    public final ak o;
    public final lv6 p;
    public final zj q;
    public final ComponentName r;
    public final boolean s;
    public volatile int t;
    public spc u;
    public byte v;
    public final Bundle w;
    public mm5 x;
    public mm5 y;
    public q5a z;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        } else {
            i = 0;
        }
        B = i;
    }

    public lw6(defpackage.tv6 r14, android.net.Uri r15, android.os.Handler r16, android.os.Bundle r17, defpackage.w59 r18, defpackage.w59 r19, defpackage.q5a r20, defpackage.kc8 r21, android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw6.<init>(tv6, android.net.Uri, android.os.Handler, android.os.Bundle, w59, w59, q5a, kc8, android.os.Bundle):void");
    }

    public static br6 e0(String str, Uri uri, String str2, Bundle bundle) {
        pq6 pq6Var = new pq6();
        if (str == null) {
            str = "";
        }
        pq6Var.a = str;
        xl3 xl3Var = new xl3((byte) 16, false);
        xl3Var.b = uri;
        xl3Var.c = str2;
        xl3Var.d = bundle;
        pq6Var.i = new yq6(xl3Var);
        return pq6Var.a();
    }

    public static ComponentName i0(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        return null;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        k0(e0(null, null, str, bundle), true, false);
    }

    @Override
    public final void D(Uri uri, Bundle bundle) {
        k0(e0(null, uri, null, bundle), true, false);
    }

    @Override
    public final void E(kq6 kq6Var) {
        if (kq6Var == null) {
            return;
        }
        g0(20, new cw6(this, kq6Var, (byte) 1), ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void F() {
        g0(11, new xv6(this, (byte) 4), ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void G(long j) {
        g0(5, new wv6(this, j, (byte) 1), ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void J(final float f) {
        if (f <= 0.0f) {
            return;
        }
        g0(13, new kw6() {
            @Override
            public final void a(su6 su6Var) {
                tv6 tv6Var = lw6.this.j;
                tv6Var.t();
                tv6Var.t.c(f);
            }
        }, ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void K(hz8 hz8Var) {
        L(hz8Var);
    }

    @Override
    public final void L(hz8 hz8Var) {
        fz8 c = j06.c(hz8Var);
        if (c == null) {
            lad.f("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + hz8Var);
            return;
        }
        h0(null, 40010, new xv6(this, c), ((bv6) this.p.b).c());
    }

    @Override
    public final void M(int i) {
        g0(15, new zv6(this, i, (byte) 0), ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void P(int i) {
        g0(14, new zv6(this, i, (byte) 1), ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void S() {
        tv6 tv6Var = this.j;
        tv6Var.t();
        boolean m0 = tv6Var.t.m0(9);
        lv6 lv6Var = this.p;
        if (m0) {
            g0(9, new xv6(this, (byte) 10), ((bv6) lv6Var.b).c(), true);
        } else {
            g0(8, new xv6(this, (byte) 11), ((bv6) lv6Var.b).c(), true);
        }
    }

    @Override
    public final void V() {
        tv6 tv6Var = this.j;
        tv6Var.t();
        boolean m0 = tv6Var.t.m0(7);
        lv6 lv6Var = this.p;
        if (m0) {
            g0(7, new xv6(this, (byte) 2), ((bv6) lv6Var.b).c(), true);
        } else {
            g0(6, new xv6(this, (byte) 3), ((bv6) lv6Var.b).c(), true);
        }
    }

    @Override
    public final void Y(long j) {
        if (j < 0) {
            return;
        }
        g0(10, new wv6(this, j, (byte) 0), ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void b0() {
        g0(3, new xv6(this, (byte) 8), ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void c(kq6 kq6Var) {
        if (kq6Var != null) {
            g0(20, new yv6(this, kq6Var, -1), ((bv6) this.p.b).c(), false);
        }
    }

    @Override
    public final void d(kq6 kq6Var, int i) {
        if (kq6Var != null) {
            if (i == -1 || i >= 0) {
                g0(20, new yv6(this, kq6Var, i), ((bv6) this.p.b).c(), false);
            }
        }
    }

    @Override
    public final void e(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            s6a s6aVar = this.j.j;
            s6aVar.getClass();
            Bundle bundle2 = new Bundle();
            t6a t6aVar = s6aVar.a;
            bundle2.putInt(s6a.b, 0);
            String str2 = s6a.c;
            Bundle bundle3 = new Bundle();
            bundle3.putInt(t6a.f, t6aVar.a);
            bundle3.putInt(t6a.g, 0);
            bundle3.putInt(t6a.h, 1011001300);
            bundle3.putString(t6a.i, t6aVar.b);
            bundle3.putString(t6a.j, "");
            bundle3.putBinder(t6a.l, t6aVar.c);
            bundle3.putParcelable(t6a.k, null);
            bundle3.putBundle(t6a.m, t6aVar.d);
            bundle3.putInt(t6a.n, 10);
            MediaSession.Token token = t6aVar.e;
            if (token != null) {
                bundle3.putParcelable(t6a.o, token);
            }
            bundle2.putBundle(str2, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        final p5a p5aVar = new p5a(str, Bundle.EMPTY);
        h0(p5aVar, 0, new kw6(p5aVar, bundle, resultReceiver) {
            public final Bundle b;
            public final ResultReceiver c;

            {
                this.b = bundle;
                this.c = resultReceiver;
            }

            @Override
            public final void a(su6 su6Var) {
                tv6 tv6Var = lw6.this.j;
                if (this.b == null) {
                    Bundle bundle4 = Bundle.EMPTY;
                }
                am5 m = tv6Var.m(su6Var);
                ResultReceiver resultReceiver2 = this.c;
                if (resultReceiver2 != null) {
                    m.b(new oh6(m, resultReceiver2, (byte) 16), vn3.a);
                }
            }
        }, ((bv6) this.p.b).c());
    }

    public final dc8 f0(ad8 ad8Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        long j;
        float f;
        Bundle bundle;
        long j2;
        String str;
        int i3;
        int i4;
        int i5;
        long j3;
        j54 U = ad8Var.U();
        if (ad8Var.m0(16) && !ad8Var.P0()) {
            z = true;
        } else {
            z = false;
        }
        if (U == null && !g8c.d0(ad8Var, this.s)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Object obj = null;
        if (U != null) {
            i2 = 7;
        } else {
            int i6 = j06.a;
            if (ad8Var.U() != null) {
                i = 7;
            } else {
                int h = ad8Var.h();
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h == 4) {
                                i = 1;
                            } else {
                                w26.j(de9.k(h, "Unrecognized State: "));
                                return null;
                            }
                        } else {
                            if (!z2) {
                                i = 3;
                            }
                            i = 2;
                        }
                    } else {
                        if (!z2) {
                            i = 6;
                        }
                        i = 2;
                    }
                } else {
                    i = 0;
                }
            }
            i2 = i;
        }
        kc8 a = woe.a(this.A, ad8Var.q());
        long j4 = 128;
        int i7 = 0;
        while (i7 < a.a.a.size()) {
            int a2 = a.a.a(i7);
            Object obj2 = obj;
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 != 3) {
                        if (a2 != 31) {
                            switch (a2) {
                                case 5:
                                    j3 = 256;
                                    continue;
                                case 6:
                                case 7:
                                    j3 = 16;
                                    continue;
                                case 8:
                                case 9:
                                    j3 = 32;
                                    continue;
                                case 10:
                                    j3 = 4096;
                                    continue;
                                case 11:
                                    j3 = 8;
                                    continue;
                                case 12:
                                    j3 = 64;
                                    continue;
                                case 13:
                                    j3 = 4194304;
                                    continue;
                                case 14:
                                    j3 = 2621440;
                                    continue;
                                case 15:
                                    j3 = 262144;
                                    continue;
                                default:
                                    j3 = 0;
                                    continue;
                            }
                        } else {
                            j3 = 240640;
                        }
                    } else {
                        j3 = 1;
                    }
                } else {
                    j3 = 16384;
                }
            } else if (z2) {
                j3 = 516;
            } else {
                j3 = 514;
            }
            j4 |= j3;
            i7++;
            obj = obj2;
        }
        dc8 dc8Var = obj;
        if (!this.y.isEmpty() && hm2.b(2, this.x)) {
            j4 &= -17;
        }
        if (!this.y.isEmpty() && hm2.b(3, this.x)) {
            j4 &= -33;
        }
        if (!z) {
            j4 &= -257;
        }
        long j5 = j4;
        long j6 = -1;
        if (ad8Var.m0(17)) {
            int l0 = ad8Var.l0();
            int i8 = j06.a;
            j = l0 == -1 ? -1L : l0;
        } else {
            j = -1;
        }
        float f2 = ad8Var.g().a;
        if (ad8Var.j() && z) {
            f = f2;
        } else {
            f = 0.0f;
        }
        if (U != null) {
            bundle = new Bundle(U.c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(this.w);
        bundle.putFloat("EXO_SPEED", f2);
        br6 S0 = ad8Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z) {
            ad8Var.m();
            j6 = ad8Var.b0();
            j2 = j6;
        } else {
            j2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            hm2 hm2Var = (hm2) this.x.get(i9);
            p5a p5aVar = hm2Var.a;
            Bundle bundle2 = hm2Var.d;
            if (p5aVar != null) {
                Bundle bundle3 = p5aVar.c;
                String str3 = p5aVar.b;
                if (hm2Var.f && p5aVar.a == 0) {
                    q5a q5aVar = this.z;
                    if ((p5aVar != null && q5aVar.a.contains(p5aVar)) || (((i5 = hm2Var.b) != -1 && a.a(i5)) || hm2.i(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            w26.j("You must specify a name to build a CustomAction");
                            return dc8Var;
                        }
                        w26.j("You must specify an action to build a CustomAction");
                        return dc8Var;
                    }
                }
            }
        }
        if (U != null) {
            int i10 = j06.a;
            int i11 = U.a;
            if (i11 != -110) {
                if (i11 != -109) {
                    if (i11 != -6) {
                        if (i11 != -2) {
                            if (i11 != 1) {
                                switch (i11) {
                                    case -107:
                                        i4 = 9;
                                        break;
                                    case -106:
                                        i4 = 7;
                                        break;
                                    case -105:
                                        i4 = 6;
                                        break;
                                    case -104:
                                        i4 = 5;
                                        break;
                                    case -103:
                                        i4 = 4;
                                        break;
                                    case -102:
                                        i4 = 3;
                                        break;
                                    default:
                                        i4 = 0;
                                        break;
                                }
                            } else {
                                i4 = 10;
                            }
                        } else {
                            i4 = 1;
                        }
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 11;
                }
            } else {
                i4 = 8;
            }
            i3 = i4;
            str = U.getMessage();
        } else {
            str = dc8Var;
            i3 = 0;
        }
        return new dc8(i2, j2, j6, f, j5, i3, str, elapsedRealtime, arrayList, j, bundle);
    }

    @Override
    public final void g(java.lang.String r7, android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw6.g(java.lang.String, android.os.Bundle):void");
    }

    public final void g0(int i, kw6 kw6Var, mw6 mw6Var, boolean z) {
        if (this.j.i()) {
            return;
        }
        if (mw6Var == null) {
            lad.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
            return;
        }
        m0(new pj3(this, mw6Var, i, kw6Var, z));
    }

    @Override
    public final void h() {
        g0(12, new xv6(this, (byte) 5), ((bv6) this.p.b).c(), true);
    }

    public final void h0(final p5a p5aVar, final int i, final kw6 kw6Var, final mw6 mw6Var) {
        if (mw6Var == null) {
            StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = p5aVar;
            if (p5aVar == null) {
                obj = Integer.valueOf(i);
            }
            sb.append(obj);
            lad.b("MediaSessionLegacyStub", sb.toString());
            return;
        }
        m0(new Runnable() {
            @Override
            public final void run() {
                final lw6 lw6Var = lw6.this;
                final p5a p5aVar2 = p5aVar;
                final char c = i;
                final kw6 kw6Var2 = kw6Var;
                lw6Var.j0(mw6Var, new kw6() {
                    @Override
                    public final void a(su6 su6Var) {
                        kw6 kw6Var3 = kw6Var2;
                        mv6 mv6Var = lw6.this.g;
                        p5a p5aVar3 = p5aVar2;
                        if (p5aVar3 != null) {
                            if (!mv6Var.Z(su6Var, p5aVar3)) {
                                return;
                            }
                        } else if (!mv6Var.Y(su6Var, c)) {
                            return;
                        }
                        try {
                            kw6Var3.a(su6Var);
                        } catch (RemoteException e) {
                            lad.g("MediaSessionLegacyStub", "Exception in " + su6Var, e);
                        }
                    }
                });
            }
        });
    }

    @Override
    public final boolean i(android.content.Intent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw6.i(android.content.Intent):boolean");
    }

    public final void j0(mw6 mw6Var, kw6 kw6Var) {
        if (this.j.i()) {
            return;
        }
        if (!((bv6) this.p.b).a.isActive()) {
            lad.f("MediaSessionLegacyStub", "Ignore incoming command before initialization. pid=" + mw6Var.a.b);
            return;
        }
        su6 L = this.g.L(mw6Var);
        if (L != null) {
            c1 c1Var = this.m;
            long j = this.t;
            c1Var.removeMessages(1001, L);
            c1Var.sendMessageDelayed(c1Var.obtainMessage(1001, L), j);
            try {
                kw6Var.a(L);
            } catch (RemoteException e) {
                lad.g("MediaSessionLegacyStub", "Exception in " + L, e);
            }
        } else if (this.h.containsKey(mw6Var)) {
            List list = (List) this.i.get(mw6Var);
            list.getClass();
            list.add(kw6Var);
        } else {
            iw6 iw6Var = new iw6(mw6Var);
            su6 su6Var = new su6(mw6Var, 0, 0, this.k.D(mw6Var), iw6Var, Bundle.EMPTY);
            t56 l = this.j.l(su6Var);
            Future future = (Future) this.h.put(mw6Var, l);
            ArrayList arrayList = new ArrayList();
            arrayList.add(kw6Var);
            this.i.put(mw6Var, arrayList);
            l.b(new tq4(l, new xl3(this, mw6Var, iw6Var, su6Var), (byte) 0), new ge2(this, (byte) 4));
        }
    }

    @Override
    public final void k() {
        g0(1, new xv6(this, (byte) 12), ((bv6) this.p.b).c(), true);
    }

    public final void k0(final br6 br6Var, final boolean z, final boolean z2) {
        g0(31, new kw6() {
            @Override
            public final void a(su6 su6Var) {
                lw6 lw6Var = lw6.this;
                p7a o = lw6Var.j.o(su6Var, mm5.u(br6Var), -1, -9223372036854775807L);
                ?? obj = new Object();
                obj.d = lw6Var;
                obj.c = su6Var;
                obj.a = z;
                obj.b = z2;
                o.b(new tq4(o, (Object) obj, (byte) 0), new ge2(lw6Var, (byte) 4));
            }
        }, ((bv6) this.p.b).c(), false);
    }

    public final boolean l0() {
        tv6 tv6Var = this.j;
        tv6Var.t();
        ad8 ad8Var = tv6Var.t;
        if (this.A.a(17) && ad8Var.q().a(17)) {
            return true;
        }
        return false;
    }

    public final void m0(Runnable runnable) {
        g8c.X(this.j.l, runnable);
    }

    @Override
    public final void n() {
        g0(1, new xv6(this, (byte) 6), ((bv6) this.p.b).c(), false);
    }

    public final void n0() {
        int i = Build.VERSION.SDK_INT;
        tv6 tv6Var = this.j;
        lv6 lv6Var = this.p;
        if (i < 31) {
            ComponentName componentName = this.r;
            if (componentName == null) {
                ((bv6) lv6Var.b).a.setMediaButtonReceiver(null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", tv6Var.b);
                intent.setComponent(componentName);
                ((bv6) lv6Var.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(tv6Var.f, 0, intent, B));
            }
        }
        zj zjVar = this.q;
        if (zjVar != null) {
            tv6Var.f.unregisterReceiver(zjVar);
        }
        ak akVar = this.o;
        if (akVar != null && !akVar.f.getAndSet(true)) {
            akVar.c.execute(new yj(akVar, (byte) 0));
        }
        bv6 bv6Var = (bv6) lv6Var.b;
        MediaSession mediaSession = bv6Var.a;
        bv6Var.f.kill();
        if (i == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                lad.g("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        mediaSession.setCallback(null);
        bv6Var.b.a.clear();
        mediaSession.release();
        ((WeakReference) this.g.d).clear();
    }

    public final void o0() {
        ak akVar;
        int i;
        mm5 mm5Var = this.y;
        q5a q5aVar = this.z;
        kc8 kc8Var = this.A;
        String str = hm2.h;
        ?? em5Var = new em5(4);
        for (int i2 = 0; i2 < mm5Var.size(); i2++) {
            hm2 hm2Var = (hm2) mm5Var.get(i2);
            p5a p5aVar = hm2Var.a;
            if ((p5aVar != null && q5aVar.a.contains(p5aVar)) || ((i = hm2Var.b) != -1 && kc8Var.a(i))) {
                em5Var.c(hm2Var);
            } else {
                if (hm2Var.f) {
                    hm2Var = new hm2(hm2Var.a, hm2Var.b, hm2Var.c, new Bundle(hm2Var.d), false, hm2Var.e, hm2Var.g);
                }
                em5Var.c(hm2Var);
            }
        }
        this.x = hm2.f(em5Var.f());
        boolean z = this.n;
        Bundle bundle = this.w;
        boolean z2 = true;
        if (!z || ((akVar = this.o) != null && akVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !hm2.b(2, this.x));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !hm2.b(3, this.x));
            return;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.x.isEmpty() || hm2.b(2, this.x)) ? false : false);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
    }

    public final void p0() {
        Bundle bundle = this.w;
        boolean z = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z2 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        o0();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z2) {
            return;
        }
        ((bv6) this.p.b).a.setExtras(bundle);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, true);
    }

    public final void q0(ad8 ad8Var) {
        m0(new fw6(this, ad8Var, (byte) 1));
    }

    @Override
    public final void u(String str, Bundle bundle) {
        k0(e0(null, null, str, bundle), true, true);
    }

    @Override
    public final void v(Uri uri, Bundle bundle) {
        k0(e0(null, uri, null, bundle), true, true);
    }

    @Override
    public final void w() {
        g0(2, new xv6(this, (byte) 7), ((bv6) this.p.b).c(), true);
    }

    @Override
    public final void x(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, false);
    }
}
