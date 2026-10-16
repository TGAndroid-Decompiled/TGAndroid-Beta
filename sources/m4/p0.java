package m4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import e9.x1;
import fi.l3;
import hg.b2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public final class p0 extends n4.l {
    public static final int f15301y;
    public final pi.e f15302f;
    public final e0 f15303g;
    public final n4.w h;
    public final n0 f15304i;
    public final ab.o0 f15305j;
    public final boolean f15306k;
    public final b f15307l;
    public final n4.s f15308m;
    public final androidx.mediarouter.app.f f15309n;
    public final ComponentName f15310o;
    public final boolean f15311p;
    public volatile long f15312q;
    public n0 f15313r;
    public int f15314s;
    public final Bundle f15315t;
    public e9.n0 f15316u;
    public e9.n0 v;
    public p1 f15317w;
    public b2.c1 f15318x;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f15301y = i10;
    }

    public p0(m4.e0 r14, android.net.Uri r15, android.os.Handler r16, android.os.Bundle r17, boolean r18, e9.n0 r19, e9.n0 r20, m4.p1 r21, b2.c1 r22, android.os.Bundle r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.<init>(m4.e0, android.net.Uri, android.os.Handler, android.os.Bundle, boolean, e9.n0, e9.n0, m4.p1, b2.c1, android.os.Bundle):void");
    }

    public static void D(n4.s sVar, ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            sVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long j10 = ((n4.q) obj).f15739b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    e2.a.d("MediaSessionCompat", a1.g.o(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        n4.n nVar = (n4.n) sVar.f15745b;
        MediaSession mediaSession = nVar.f15728a;
        nVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            n4.q qVar = (n4.q) obj2;
            MediaSession.QueueItem queueItem = qVar.f15740c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(qVar.f15738a.a(), qVar.f15739b);
                qVar.f15740c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(n4.s sVar, n4.i iVar) {
        n4.n nVar = (n4.n) sVar.f15745b;
        nVar.f15733i = iVar;
        MediaSession mediaSession = nVar.f15728a;
        Bundle bundle = iVar.f15720a;
        if (iVar.f15721b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) n4.i.f15719c.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                Object obj = bundle.get(str);
                                if (obj != null && !(obj instanceof CharSequence)) {
                                    if (obj instanceof Long) {
                                        builder.putLong(str, ((Long) obj).longValue());
                                    }
                                } else {
                                    builder.putText(str, (CharSequence) obj);
                                }
                            } else {
                                builder.putRating(str, (Rating) bundle.getParcelable(str));
                            }
                        } else {
                            builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                        }
                    } else {
                        builder.putText(str, bundle.getCharSequence(str));
                    }
                } else {
                    builder.putLong(str, bundle.getLong(str));
                }
            }
            iVar.f15721b = builder.build();
        }
        mediaSession.setMetadata(iVar.f15721b);
    }

    public static b2.p0 F(String str, Uri uri, String str2, Bundle bundle) {
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.f8595b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var2 = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        androidx.biometric.e eVar = new androidx.biometric.e(3);
        eVar.f1200b = uri;
        eVar.f1201c = str2;
        eVar.d = bundle;
        return new b2.p0(str3, new b2.e0(d0Var), null, new b2.j0(i0Var), b2.s0.L, new b2.l0(eVar));
    }

    public static ComponentName J(Context context, String str) {
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
    public final void A(long j10) {
        if (j10 < 0) {
            return;
        }
        H(10, new g0(this, j10, 0), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void B() {
        H(3, new h0(this, 8), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    public final n4.y G(m1 m1Var) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        long j10;
        float f7;
        Bundle bundle;
        long j11;
        String str;
        int i12;
        int i13;
        int i14;
        long j12;
        b2.z0 W = m1Var.W();
        if (m1Var.o0(16) && !m1Var.P0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (W == null && !e2.m0.c0(m1Var, this.f15311p)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (W != null) {
            i11 = 7;
        } else {
            int i15 = n.f15285a;
            if (m1Var.W() != null) {
                i10 = 7;
            } else {
                int d = m1Var.d();
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            if (d == 4) {
                                i10 = 1;
                            } else {
                                throw new IllegalArgumentException(i2.d.j(d, "Unrecognized State: "));
                            }
                        } else {
                            if (!z11) {
                                i10 = 3;
                            }
                            i10 = 2;
                        }
                    } else {
                        if (!z11) {
                            i10 = 6;
                        }
                        i10 = 2;
                    }
                } else {
                    i10 = 0;
                }
            }
            i11 = i10;
        }
        b2.c1 a2 = w7.v.a(this.f15318x, m1Var.s());
        long j13 = 128;
        for (int i16 = 0; i16 < a2.f2097a.f2447a.size(); i16++) {
            int a10 = a2.f2097a.a(i16);
            if (a10 != 1) {
                if (a10 != 2) {
                    if (a10 != 3) {
                        if (a10 != 31) {
                            switch (a10) {
                                case 5:
                                    j12 = 256;
                                    continue;
                                case 6:
                                case 7:
                                    j12 = 16;
                                    continue;
                                case 8:
                                case 9:
                                    j12 = 32;
                                    continue;
                                case 10:
                                    j12 = 4096;
                                    continue;
                                case 11:
                                    j12 = 8;
                                    continue;
                                case 12:
                                    j12 = 64;
                                    continue;
                                case 13:
                                    j12 = 4194304;
                                    continue;
                                case 14:
                                    j12 = 2621440;
                                    continue;
                                case 15:
                                    j12 = 262144;
                                    continue;
                                default:
                                    j12 = 0;
                                    continue;
                            }
                        } else {
                            j12 = 240640;
                        }
                    } else {
                        j12 = 1;
                    }
                } else {
                    j12 = 16384;
                }
            } else if (z11) {
                j12 = 516;
            } else {
                j12 = 514;
            }
            j13 |= j12;
        }
        if (!this.v.isEmpty() && d.c(2, this.f15316u)) {
            j13 &= -17;
        }
        if (!this.v.isEmpty() && d.c(3, this.f15316u)) {
            j13 &= -33;
        }
        if (!z10) {
            j13 &= -257;
        }
        long j14 = j13;
        long j15 = -1;
        if (m1Var.o0(17)) {
            int n02 = m1Var.n0();
            int i17 = n.f15285a;
            j10 = n02 == -1 ? -1L : n02;
        } else {
            j10 = -1;
        }
        float f10 = m1Var.h().f2077a;
        if (m1Var.j0() && z10) {
            f7 = f10;
        } else {
            f7 = 0.0f;
        }
        if (W != null) {
            bundle = new Bundle(W.f2544c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(this.f15315t);
        bundle.putFloat("EXO_SPEED", f10);
        b2.p0 S0 = m1Var.S0();
        if (S0 != null) {
            String str2 = S0.f2281a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z10) {
            j11 = m1Var.M0();
        } else {
            j11 = -1;
        }
        if (z10) {
            j15 = m1Var.d0();
        }
        ArrayList arrayList = new ArrayList();
        long j16 = j15;
        long j17 = j11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i18 = 0; i18 < this.f15316u.size(); i18++) {
            d dVar = (d) this.f15316u.get(i18);
            o1 o1Var = dVar.f15144a;
            Bundle bundle2 = dVar.d;
            if (o1Var != null) {
                Bundle bundle3 = o1Var.f15300c;
                String str3 = o1Var.f15299b;
                if (dVar.f15147f && o1Var.f15298a == 0) {
                    p1 p1Var = this.f15317w;
                    if ((o1Var != null && p1Var.f15320a.contains(o1Var)) || (((i14 = dVar.f15145b) != -1 && a2.a(i14)) || d.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i19 = dVar.f15146c;
                        if (!TextUtils.isEmpty(str3)) {
                            if (!TextUtils.isEmpty("")) {
                                if (i19 != 0) {
                                    arrayList.add(new n4.x(str3, i19, bundle3));
                                } else {
                                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                                }
                            } else {
                                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                            }
                        } else {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                    }
                }
            }
        }
        if (W != null) {
            int i20 = n.f15285a;
            int i21 = W.f2542a;
            if (i21 != -110) {
                if (i21 != -109) {
                    if (i21 != -6) {
                        if (i21 != -2) {
                            if (i21 != 1) {
                                switch (i21) {
                                    case -107:
                                        i13 = 9;
                                        break;
                                    case -106:
                                        i13 = 7;
                                        break;
                                    case -105:
                                        i13 = 6;
                                        break;
                                    case -104:
                                        i13 = 5;
                                        break;
                                    case -103:
                                        i13 = 4;
                                        break;
                                    case -102:
                                        i13 = 3;
                                        break;
                                    default:
                                        i13 = 0;
                                        break;
                                }
                            } else {
                                i13 = 10;
                            }
                        } else {
                            i13 = 1;
                        }
                    } else {
                        i13 = 2;
                    }
                } else {
                    i13 = 11;
                }
            } else {
                i13 = 8;
            }
            str = W.getMessage();
            i12 = i13;
        } else {
            str = null;
            i12 = 0;
        }
        return new n4.y(i11, j17, j16, f7, j14, i12, str, elapsedRealtime, arrayList, j10, bundle);
    }

    public final void H(int i10, o0 o0Var, n4.t tVar, boolean z10) {
        e0 e0Var = this.f15303g;
        if (e0Var.j()) {
            return;
        }
        if (tVar == null) {
            e2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
            return;
        }
        e2.m0.W(e0Var.f15162l, new k0(this, i10, tVar, o0Var, z10));
    }

    public final void I(o1 o1Var, int i10, o0 o0Var, n4.t tVar) {
        if (tVar == null) {
            StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = o1Var;
            if (o1Var == null) {
                obj = Integer.valueOf(i10);
            }
            sb2.append(obj);
            e2.a.b("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        e2.m0.W(this.f15303g.f15162l, new l3(this, o1Var, i10, tVar, o0Var, 5));
    }

    public final void K(b2.p0 p0Var, boolean z10, boolean z11) {
        H(31, new z(this, p0Var, z10, z11), ((n4.n) this.f15308m.f15745b).c(), false);
    }

    public final v L(n4.t tVar) {
        v n10 = this.f15302f.n(tVar);
        if (n10 == null) {
            v vVar = new v(tVar, 0, 0, this.h.b(tVar), new m0(tVar), Bundle.EMPTY);
            t m10 = this.f15303g.m(vVar);
            this.f15302f.a(tVar, vVar, m10.f15374a, m10.f15375b);
            e0 e0Var = this.f15303g;
            if (!e0Var.f15173x || !e0.k(vVar)) {
                e0Var.e.getClass();
            }
            n10 = vVar;
        }
        ab.o0 o0Var = this.f15305j;
        long j10 = this.f15312q;
        o0Var.removeMessages(1001, n10);
        o0Var.sendMessageDelayed(o0Var.obtainMessage(1001, n10), j10);
        return n10;
    }

    public final void M() {
        b bVar;
        int i10;
        e9.n0 n0Var = this.v;
        p1 p1Var = this.f15317w;
        b2.c1 c1Var = this.f15318x;
        String str = d.h;
        ?? g0Var = new e9.g0(4);
        for (int i11 = 0; i11 < n0Var.size(); i11++) {
            d dVar = (d) n0Var.get(i11);
            o1 o1Var = dVar.f15144a;
            if ((o1Var != null && p1Var.f15320a.contains(o1Var)) || ((i10 = dVar.f15145b) != -1 && c1Var.a(i10))) {
                g0Var.c(dVar);
            } else {
                if (dVar.f15147f) {
                    dVar = new d(dVar.f15144a, dVar.f15145b, dVar.f15146c, new Bundle(dVar.d), false, dVar.e, dVar.f15148g);
                }
                g0Var.c(dVar);
            }
        }
        this.f15316u = d.g(g0Var.f());
        boolean z10 = this.f15306k;
        Bundle bundle = this.f15315t;
        boolean z11 = true;
        if (!z10 || ((bVar = this.f15307l) != null && bVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !d.c(2, this.f15316u));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !d.c(3, this.f15316u));
            return;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.f15316u.isEmpty() || d.c(2, this.f15316u)) ? false : false);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
    }

    public final void N() {
        Bundle bundle = this.f15315t;
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        M();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        ((n4.n) this.f15308m.f15745b).f15728a.setExtras(bundle);
    }

    public final void O(m1 m1Var) {
        e2.m0.W(this.f15303g.f15162l, new i0(this, m1Var, 1));
    }

    @Override
    public final void b(n4.h hVar) {
        if (hVar != null) {
            H(20, new b2(this, hVar, -1, 3), ((n4.n) this.f15308m.f15745b).c(), false);
        }
    }

    @Override
    public final void c(n4.h hVar, int i10) {
        if (hVar != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new b2(this, hVar, i10, 3), ((n4.n) this.f15308m.f15745b).c(), false);
            }
        }
    }

    @Override
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            t1 t1Var = this.f15303g.f15160j;
            t1Var.getClass();
            String str2 = t1.f15379b;
            Bundle bundle2 = new Bundle();
            u1 u1Var = t1Var.f15381a;
            if (u1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = t1.f15380c;
            u1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(u1.f15385i, u1Var.f15395a);
            bundle3.putInt(u1.f15386j, 0);
            bundle3.putInt(u1.f15387k, u1Var.f15396b);
            bundle3.putString(u1.f15388l, u1Var.d);
            bundle3.putString(u1.f15389m, u1Var.e);
            bundle3.putBinder(u1.f15391o, u1Var.f15398f);
            bundle3.putParcelable(u1.f15390n, null);
            bundle3.putBundle(u1.f15392p, u1Var.f15399g);
            bundle3.putInt(u1.f15393q, u1Var.f15397c);
            MediaSession.Token token = u1Var.h;
            if (token != null) {
                bundle3.putParcelable(u1.f15394r, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        o1 o1Var = new o1(str, Bundle.EMPTY);
        I(o1Var, 0, new androidx.car.app.utils.a(this, o1Var, bundle, resultReceiver), ((n4.n) this.f15308m.f15745b).c());
    }

    @Override
    public final void e(java.lang.String r7, android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.e(java.lang.String, android.os.Bundle):void");
    }

    @Override
    public final void f() {
        H(12, new h0(this, 4), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final boolean g(android.content.Intent r13) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.g(android.content.Intent):boolean");
    }

    @Override
    public final void h() {
        H(1, new h0(this, 12), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void i() {
        H(1, new h0(this, 6), ((n4.n) this.f15308m.f15745b).c(), false);
    }

    @Override
    public final void j(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true, true);
    }

    @Override
    public final void k(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true, true);
    }

    @Override
    public final void l(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true, true);
    }

    @Override
    public final void m() {
        H(2, new h0(this, 7), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void n(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true, false);
    }

    @Override
    public final void o(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true, false);
    }

    @Override
    public final void p(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true, false);
    }

    @Override
    public final void q(n4.h hVar) {
        if (hVar == null) {
            return;
        }
        H(20, new ah.h0(26, this, hVar), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void r() {
        H(11, new h0(this, 5), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void s(long j10) {
        H(5, new g0(this, j10, 1), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void t(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        H(13, new l0(this, f7), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void u(n4.z zVar) {
        v(zVar);
    }

    @Override
    public final void v(n4.z zVar) {
        b2.h1 c10 = n.c(zVar);
        if (c10 == null) {
            e2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + zVar);
            return;
        }
        I(null, 40010, new h0(this, c10), ((n4.n) this.f15308m.f15745b).c());
    }

    @Override
    public final void w(int i10) {
        H(15, new j0(this, i10, 0), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void x(int i10) {
        H(14, new j0(this, i10, 1), ((n4.n) this.f15308m.f15745b).c(), true);
    }

    @Override
    public final void y() {
        boolean o02 = this.f15303g.f15170t.o0(9);
        n4.s sVar = this.f15308m;
        if (o02) {
            H(9, new h0(this, 10), ((n4.n) sVar.f15745b).c(), true);
        } else {
            H(8, new h0(this, 11), ((n4.n) sVar.f15745b).c(), true);
        }
    }

    @Override
    public final void z() {
        boolean o02 = this.f15303g.f15170t.o0(7);
        n4.s sVar = this.f15308m;
        if (o02) {
            H(7, new h0(this, 2), ((n4.n) sVar.f15745b).c(), true);
        } else {
            H(6, new h0(this, 3), ((n4.n) sVar.f15745b).c(), true);
        }
    }
}
