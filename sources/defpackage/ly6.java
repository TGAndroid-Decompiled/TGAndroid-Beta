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
public final class ly6 extends yw6 {
    public static final int B;
    public ne8 A;
    public final mx6 g;
    public final qt h;
    public final qt i;
    public final tx6 j;
    public final nl9 k;
    public final trc l;
    public final c1 m;
    public final boolean n;
    public final al o;
    public final lx6 p;
    public final zk q;
    public final ComponentName r;
    public final boolean s;
    public volatile int t;
    public trc u;
    public byte v;
    public final Bundle w;
    public mo5 x;
    public mo5 y;
    public s7a z;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 33554432;
        } else {
            i = 0;
        }
        B = i;
    }

    public ly6(defpackage.tx6 r14, android.net.Uri r15, android.os.Handler r16, android.os.Bundle r17, defpackage.y79 r18, defpackage.y79 r19, defpackage.s7a r20, defpackage.ne8 r21, android.os.Bundle r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly6.<init>(tx6, android.net.Uri, android.os.Handler, android.os.Bundle, y79, y79, s7a, ne8, android.os.Bundle):void");
    }

    public static bt6 e0(String str, Uri uri, String str2, Bundle bundle) {
        ps6 ps6Var = new ps6();
        if (str == null) {
            str = "";
        }
        ps6Var.a = str;
        in3 in3Var = new in3((byte) 16, false);
        in3Var.b = uri;
        in3Var.c = str2;
        in3Var.d = bundle;
        ps6Var.i = new ys6(in3Var);
        return ps6Var.a();
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
    public final void E(ks6 ks6Var) {
        if (ks6Var == null) {
            return;
        }
        g0(20, new cy6(this, ks6Var, (byte) 1), ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void F() {
        g0(11, new xx6(this, (byte) 4), ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void G(long j) {
        g0(5, new wx6(this, j, (byte) 1), ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void J(final float f) {
        if (f <= 0.0f) {
            return;
        }
        g0(13, new ky6() {
            @Override
            public final void a(sw6 sw6Var) {
                tx6 tx6Var = ly6.this.j;
                tx6Var.t();
                tx6Var.t.d(f);
            }
        }, ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void K(i19 i19Var) {
        L(i19Var);
    }

    @Override
    public final void L(i19 i19Var) {
        g19 c = j26.c(i19Var);
        if (c == null) {
            ncd.f("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + i19Var);
            return;
        }
        h0(null, 40010, new xx6(this, c), ((bx6) this.p.b).c());
    }

    @Override
    public final void M(int i) {
        g0(15, new zx6(this, i, (byte) 0), ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void P(int i) {
        g0(14, new zx6(this, i, (byte) 1), ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void S() {
        tx6 tx6Var = this.j;
        tx6Var.t();
        boolean m0 = tx6Var.t.m0(9);
        lx6 lx6Var = this.p;
        if (m0) {
            g0(9, new xx6(this, (byte) 10), ((bx6) lx6Var.b).c(), true);
        } else {
            g0(8, new xx6(this, (byte) 11), ((bx6) lx6Var.b).c(), true);
        }
    }

    @Override
    public final void V() {
        tx6 tx6Var = this.j;
        tx6Var.t();
        boolean m0 = tx6Var.t.m0(7);
        lx6 lx6Var = this.p;
        if (m0) {
            g0(7, new xx6(this, (byte) 2), ((bx6) lx6Var.b).c(), true);
        } else {
            g0(6, new xx6(this, (byte) 3), ((bx6) lx6Var.b).c(), true);
        }
    }

    @Override
    public final void Y(long j) {
        if (j < 0) {
            return;
        }
        g0(10, new wx6(this, j, (byte) 0), ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void b0() {
        g0(3, new xx6(this, (byte) 8), ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void c(ks6 ks6Var) {
        if (ks6Var != null) {
            g0(20, new yx6(this, ks6Var, -1), ((bx6) this.p.b).c(), false);
        }
    }

    @Override
    public final void d(ks6 ks6Var, int i) {
        if (ks6Var != null) {
            if (i == -1 || i >= 0) {
                g0(20, new yx6(this, ks6Var, i), ((bx6) this.p.b).c(), false);
            }
        }
    }

    @Override
    public final void e(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            u8a u8aVar = this.j.j;
            u8aVar.getClass();
            Bundle bundle2 = new Bundle();
            v8a v8aVar = u8aVar.a;
            bundle2.putInt(u8a.b, 0);
            String str2 = u8a.c;
            Bundle bundle3 = new Bundle();
            bundle3.putInt(v8a.f, v8aVar.a);
            bundle3.putInt(v8a.g, 0);
            bundle3.putInt(v8a.h, 1011001300);
            bundle3.putString(v8a.i, v8aVar.b);
            bundle3.putString(v8a.j, "");
            bundle3.putBinder(v8a.l, v8aVar.c);
            bundle3.putParcelable(v8a.k, null);
            bundle3.putBundle(v8a.m, v8aVar.d);
            bundle3.putInt(v8a.n, 10);
            MediaSession.Token token = v8aVar.e;
            if (token != null) {
                bundle3.putParcelable(v8a.o, token);
            }
            bundle2.putBundle(str2, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        final r7a r7aVar = new r7a(str, Bundle.EMPTY);
        h0(r7aVar, 0, new ky6(r7aVar, bundle, resultReceiver) {
            public final Bundle b;
            public final ResultReceiver c;

            {
                this.b = bundle;
                this.c = resultReceiver;
            }

            @Override
            public final void a(sw6 sw6Var) {
                tx6 tx6Var = ly6.this.j;
                if (this.b == null) {
                    Bundle bundle4 = Bundle.EMPTY;
                }
                ao5 m = tx6Var.m(sw6Var);
                ResultReceiver resultReceiver2 = this.c;
                if (resultReceiver2 != null) {
                    m.b(new lj6(m, resultReceiver2, (byte) 17), fp3.a);
                }
            }
        }, ((bx6) this.p.b).c());
    }

    public final ge8 f0(cf8 cf8Var) {
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
        u64 U = cf8Var.U();
        if (cf8Var.m0(16) && !cf8Var.P0()) {
            z = true;
        } else {
            z = false;
        }
        if (U == null && !hac.d0(cf8Var, this.s)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Object obj = null;
        if (U != null) {
            i2 = 7;
        } else {
            int i6 = j26.a;
            if (cf8Var.U() != null) {
                i = 7;
            } else {
                int h = cf8Var.h();
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h == 4) {
                                i = 1;
                            } else {
                                u36.j(hg9.j(h, "Unrecognized State: "));
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
        ne8 a = zqe.a(this.A, cf8Var.q());
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
        ge8 ge8Var = obj;
        if (!this.y.isEmpty() && un2.b(2, this.x)) {
            j4 &= -17;
        }
        if (!this.y.isEmpty() && un2.b(3, this.x)) {
            j4 &= -33;
        }
        if (!z) {
            j4 &= -257;
        }
        long j5 = j4;
        long j6 = -1;
        if (cf8Var.m0(17)) {
            int l0 = cf8Var.l0();
            int i8 = j26.a;
            j = l0 == -1 ? -1L : l0;
        } else {
            j = -1;
        }
        float f2 = cf8Var.g().a;
        if (cf8Var.i() && z) {
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
        bt6 S0 = cf8Var.S0();
        if (S0 != null) {
            String str2 = S0.a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z) {
            cf8Var.k();
            j6 = cf8Var.b0();
            j2 = j6;
        } else {
            j2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < this.x.size(); i9++) {
            un2 un2Var = (un2) this.x.get(i9);
            r7a r7aVar = un2Var.a;
            Bundle bundle2 = un2Var.d;
            if (r7aVar != null) {
                Bundle bundle3 = r7aVar.c;
                String str3 = r7aVar.b;
                if (un2Var.f && r7aVar.a == 0) {
                    s7a s7aVar = this.z;
                    if ((r7aVar != null && s7aVar.a.contains(r7aVar)) || (((i5 = un2Var.b) != -1 && a.a(i5)) || un2.i(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            u36.j("You must specify a name to build a CustomAction");
                            return ge8Var;
                        }
                        u36.j("You must specify an action to build a CustomAction");
                        return ge8Var;
                    }
                }
            }
        }
        if (U != null) {
            int i10 = j26.a;
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
            str = ge8Var;
            i3 = 0;
        }
        return new ge8(i2, j2, j6, f, j5, i3, str, elapsedRealtime, arrayList, j, bundle);
    }

    @Override
    public final void g(java.lang.String r7, android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly6.g(java.lang.String, android.os.Bundle):void");
    }

    public final void g0(int i, ky6 ky6Var, my6 my6Var, boolean z) {
        if (this.j.i()) {
            return;
        }
        if (my6Var == null) {
            ncd.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i);
            return;
        }
        m0(new al3(this, my6Var, i, ky6Var, z));
    }

    @Override
    public final void h() {
        g0(12, new xx6(this, (byte) 5), ((bx6) this.p.b).c(), true);
    }

    public final void h0(final r7a r7aVar, final int i, final ky6 ky6Var, final my6 my6Var) {
        if (my6Var == null) {
            StringBuilder sb = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = r7aVar;
            if (r7aVar == null) {
                obj = Integer.valueOf(i);
            }
            sb.append(obj);
            ncd.b("MediaSessionLegacyStub", sb.toString());
            return;
        }
        m0(new Runnable() {
            @Override
            public final void run() {
                final ly6 ly6Var = ly6.this;
                final r7a r7aVar2 = r7aVar;
                final char c = i;
                final ky6 ky6Var2 = ky6Var;
                ly6Var.j0(my6Var, new ky6() {
                    @Override
                    public final void a(sw6 sw6Var) {
                        ky6 ky6Var3 = ky6Var2;
                        mx6 mx6Var = ly6.this.g;
                        r7a r7aVar3 = r7aVar2;
                        if (r7aVar3 != null) {
                            if (!mx6Var.c0(sw6Var, r7aVar3)) {
                                return;
                            }
                        } else if (!mx6Var.a0(sw6Var, c)) {
                            return;
                        }
                        try {
                            ky6Var3.a(sw6Var);
                        } catch (RemoteException e) {
                            ncd.g("MediaSessionLegacyStub", "Exception in " + sw6Var, e);
                        }
                    }
                });
            }
        });
    }

    @Override
    public final boolean i(android.content.Intent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly6.i(android.content.Intent):boolean");
    }

    public final void j0(my6 my6Var, ky6 ky6Var) {
        if (this.j.i()) {
            return;
        }
        if (!((bx6) this.p.b).a.isActive()) {
            ncd.f("MediaSessionLegacyStub", "Ignore incoming command before initialization. pid=" + my6Var.a.b);
            return;
        }
        sw6 N = this.g.N(my6Var);
        if (N != null) {
            c1 c1Var = this.m;
            long j = this.t;
            c1Var.removeMessages(1001, N);
            c1Var.sendMessageDelayed(c1Var.obtainMessage(1001, N), j);
            try {
                ky6Var.a(N);
            } catch (RemoteException e) {
                ncd.g("MediaSessionLegacyStub", "Exception in " + N, e);
            }
        } else if (this.h.containsKey(my6Var)) {
            List list = (List) this.i.get(my6Var);
            list.getClass();
            list.add(ky6Var);
        } else {
            iy6 iy6Var = new iy6(my6Var);
            sw6 sw6Var = new sw6(my6Var, 0, 0, this.k.E0(my6Var), iy6Var, Bundle.EMPTY);
            t76 l = this.j.l(sw6Var);
            Future future = (Future) this.h.put(my6Var, l);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ky6Var);
            this.i.put(my6Var, arrayList);
            l.b(new us4(l, new in3(this, my6Var, iy6Var, sw6Var), (byte) 0), new rf2(this, (byte) 4));
        }
    }

    @Override
    public final void k() {
        g0(1, new xx6(this, (byte) 12), ((bx6) this.p.b).c(), true);
    }

    public final void k0(final bt6 bt6Var, final boolean z, final boolean z2) {
        g0(31, new ky6() {
            @Override
            public final void a(sw6 sw6Var) {
                ly6 ly6Var = ly6.this;
                q9a o = ly6Var.j.o(sw6Var, mo5.u(bt6Var), -1, -9223372036854775807L);
                ?? obj = new Object();
                obj.d = ly6Var;
                obj.c = sw6Var;
                obj.a = z;
                obj.b = z2;
                o.b(new us4(o, (Object) obj, (byte) 0), new rf2(ly6Var, (byte) 4));
            }
        }, ((bx6) this.p.b).c(), false);
    }

    public final boolean l0() {
        tx6 tx6Var = this.j;
        tx6Var.t();
        cf8 cf8Var = tx6Var.t;
        if (this.A.a(17) && cf8Var.q().a(17)) {
            return true;
        }
        return false;
    }

    public final void m0(Runnable runnable) {
        hac.X(this.j.l, runnable);
    }

    @Override
    public final void n() {
        g0(1, new xx6(this, (byte) 6), ((bx6) this.p.b).c(), false);
    }

    public final void n0() {
        int i = Build.VERSION.SDK_INT;
        tx6 tx6Var = this.j;
        lx6 lx6Var = this.p;
        if (i < 31) {
            ComponentName componentName = this.r;
            if (componentName == null) {
                ((bx6) lx6Var.b).a.setMediaButtonReceiver(null);
            } else {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON", tx6Var.b);
                intent.setComponent(componentName);
                ((bx6) lx6Var.b).a.setMediaButtonReceiver(PendingIntent.getBroadcast(tx6Var.f, 0, intent, B));
            }
        }
        zk zkVar = this.q;
        if (zkVar != null) {
            tx6Var.f.unregisterReceiver(zkVar);
        }
        al alVar = this.o;
        if (alVar != null && !alVar.f.getAndSet(true)) {
            alVar.c.execute(new yk(alVar, (byte) 0));
        }
        bx6 bx6Var = (bx6) lx6Var.b;
        MediaSession mediaSession = bx6Var.a;
        bx6Var.f.kill();
        if (i == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                ncd.g("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        mediaSession.setCallback(null);
        bx6Var.b.a.clear();
        mediaSession.release();
        ((WeakReference) this.g.d).clear();
    }

    public final void o0() {
        al alVar;
        int i;
        mo5 mo5Var = this.y;
        s7a s7aVar = this.z;
        ne8 ne8Var = this.A;
        String str = un2.h;
        ?? eo5Var = new eo5(4);
        for (int i2 = 0; i2 < mo5Var.size(); i2++) {
            un2 un2Var = (un2) mo5Var.get(i2);
            r7a r7aVar = un2Var.a;
            if ((r7aVar != null && s7aVar.a.contains(r7aVar)) || ((i = un2Var.b) != -1 && ne8Var.a(i))) {
                eo5Var.c(un2Var);
            } else {
                if (un2Var.f) {
                    un2Var = new un2(un2Var.a, un2Var.b, un2Var.c, new Bundle(un2Var.d), false, un2Var.e, un2Var.g);
                }
                eo5Var.c(un2Var);
            }
        }
        this.x = un2.f(eo5Var.f());
        boolean z = this.n;
        Bundle bundle = this.w;
        boolean z2 = true;
        if (!z || ((alVar = this.o) != null && alVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !un2.b(2, this.x));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !un2.b(3, this.x));
            return;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.x.isEmpty() || un2.b(2, this.x)) ? false : false);
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
        ((bx6) this.p.b).a.setExtras(bundle);
    }

    @Override
    public final void q(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, true);
    }

    public final void q0(cf8 cf8Var) {
        m0(new fy6(this, cf8Var, (byte) 1));
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
        g0(2, new xx6(this, (byte) 7), ((bx6) this.p.b).c(), true);
    }

    @Override
    public final void x(String str, Bundle bundle) {
        k0(e0(str, null, null, bundle), true, false);
    }
}
