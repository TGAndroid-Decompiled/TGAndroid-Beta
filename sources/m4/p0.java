package m4;

import ai.db;
import ai.ub;
import ai.v2;
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
import hg.b2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public final class p0 extends n4.l {
    public static final int f16661y;
    public final qi.e f16662f;
    public final f0 f16663g;
    public final n4.w h;
    public final n0 f16664i;
    public final ab.o0 f16665j;
    public final boolean f16666k;
    public final b f16667l;
    public final n4.s f16668m;
    public final androidx.mediarouter.app.f f16669n;
    public final ComponentName f16670o;
    public final boolean f16671p;
    public volatile long f16672q;
    public n0 f16673r;
    public int f16674s;
    public final Bundle f16675t;
    public e9.n0 f16676u;
    public e9.n0 v;
    public p1 f16677w;
    public b2.b1 f16678x;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f16661y = i10;
    }

    public p0(m4.f0 r14, android.net.Uri r15, android.os.Handler r16, android.os.Bundle r17, boolean r18, e9.n0 r19, e9.n0 r20, m4.p1 r21, b2.b1 r22, android.os.Bundle r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.<init>(m4.f0, android.net.Uri, android.os.Handler, android.os.Bundle, boolean, e9.n0, e9.n0, m4.p1, b2.b1, android.os.Bundle):void");
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
                long j10 = ((n4.q) obj).f17121b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    e2.a.d("MediaSessionCompat", a1.g.o(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        n4.n nVar = (n4.n) sVar.f17127b;
        MediaSession mediaSession = nVar.f17110a;
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
            MediaSession.QueueItem queueItem = qVar.f17122c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(qVar.f17120a.a(), qVar.f17121b);
                qVar.f17122c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(n4.s sVar, n4.i iVar) {
        n4.n nVar = (n4.n) sVar.f17127b;
        nVar.f17115i = iVar;
        MediaSession mediaSession = nVar.f17110a;
        Bundle bundle = iVar.f17102a;
        if (iVar.f17103b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) n4.i.f17101c.get(str);
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
            iVar.f17103b = builder.build();
        }
        mediaSession.setMetadata(iVar.f17103b);
    }

    public static b2.o0 F(String str, Uri uri, String str2, Bundle bundle) {
        b2.c0 c0Var = new b2.c0();
        e9.l0 l0Var = e9.n0.f8476b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.h0 h0Var = new b2.h0();
        b2.k0 k0Var = b2.k0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        androidx.biometric.e eVar = new androidx.biometric.e(3);
        eVar.f2817b = uri;
        eVar.f2818c = str2;
        eVar.d = bundle;
        return new b2.o0(str3, new b2.d0(c0Var), null, new b2.i0(h0Var), b2.r0.L, new b2.k0(eVar));
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
        H(10, new h0(this, j10, 0), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final void B() {
        H(3, new i0(this, 8), ((n4.n) this.f16668m.f17127b).c(), true);
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
        b2.y0 W = m1Var.W();
        if (m1Var.o0(16) && !m1Var.P0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (W == null && !e2.m0.c0(m1Var, this.f16671p)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (W != null) {
            i11 = 7;
        } else {
            int i15 = n.f16645a;
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
                                throw new IllegalArgumentException(i2.e.j(d, "Unrecognized State: "));
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
        b2.b1 a2 = w7.v.a(this.f16678x, m1Var.s());
        long j13 = 128;
        for (int i16 = 0; i16 < a2.f3702a.f4054a.size(); i16++) {
            int a10 = a2.f3702a.a(i16);
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
        if (!this.v.isEmpty() && d.c(2, this.f16676u)) {
            j13 &= -17;
        }
        if (!this.v.isEmpty() && d.c(3, this.f16676u)) {
            j13 &= -33;
        }
        if (!z10) {
            j13 &= -257;
        }
        long j14 = j13;
        long j15 = -1;
        if (m1Var.o0(17)) {
            int n02 = m1Var.n0();
            int i17 = n.f16645a;
            j10 = n02 == -1 ? -1L : n02;
        } else {
            j10 = -1;
        }
        float f10 = m1Var.h().f4154a;
        if (m1Var.j0() && z10) {
            f7 = f10;
        } else {
            f7 = 0.0f;
        }
        if (W != null) {
            bundle = new Bundle(W.f4151c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(this.f16675t);
        bundle.putFloat("EXO_SPEED", f10);
        b2.o0 S0 = m1Var.S0();
        if (S0 != null) {
            String str2 = S0.f3888a;
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
        for (int i18 = 0; i18 < this.f16676u.size(); i18++) {
            d dVar = (d) this.f16676u.get(i18);
            o1 o1Var = dVar.f16506a;
            Bundle bundle2 = dVar.d;
            if (o1Var != null) {
                Bundle bundle3 = o1Var.f16660c;
                String str3 = o1Var.f16659b;
                if (dVar.f16509f && o1Var.f16658a == 0) {
                    p1 p1Var = this.f16677w;
                    if ((o1Var != null && p1Var.f16680a.contains(o1Var)) || (((i14 = dVar.f16507b) != -1 && a2.a(i14)) || d.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i19 = dVar.f16508c;
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
            int i20 = n.f16645a;
            int i21 = W.f4149a;
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
        f0 f0Var = this.f16663g;
        if (f0Var.j()) {
            return;
        }
        if (tVar == null) {
            e2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
            return;
        }
        e2.m0.W(f0Var.f16528l, new db(this, i10, tVar, o0Var, z10));
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
        e2.m0.W(this.f16663g.f16528l, new ub(this, o1Var, i10, tVar, o0Var, 6));
    }

    public final void K(b2.o0 o0Var, boolean z10, boolean z11) {
        H(31, new a0(this, o0Var, z10, z11), ((n4.n) this.f16668m.f17127b).c(), false);
    }

    public final v L(n4.t tVar) {
        v q6 = this.f16662f.q(tVar);
        if (q6 == null) {
            v vVar = new v(tVar, 0, 0, this.h.b(tVar), new m0(tVar), Bundle.EMPTY);
            t m10 = this.f16663g.m(vVar);
            this.f16662f.b(tVar, vVar, m10.f16734a, m10.f16735b);
            f0 f0Var = this.f16663g;
            if (!f0Var.f16539x || !f0.k(vVar)) {
                f0Var.e.getClass();
            }
            q6 = vVar;
        }
        ab.o0 o0Var = this.f16665j;
        long j10 = this.f16672q;
        o0Var.removeMessages(1001, q6);
        o0Var.sendMessageDelayed(o0Var.obtainMessage(1001, q6), j10);
        return q6;
    }

    public final void M() {
        b bVar;
        int i10;
        e9.n0 n0Var = this.v;
        p1 p1Var = this.f16677w;
        b2.b1 b1Var = this.f16678x;
        String str = d.h;
        ?? g0Var = new e9.g0(4);
        for (int i11 = 0; i11 < n0Var.size(); i11++) {
            d dVar = (d) n0Var.get(i11);
            o1 o1Var = dVar.f16506a;
            if ((o1Var != null && p1Var.f16680a.contains(o1Var)) || ((i10 = dVar.f16507b) != -1 && b1Var.a(i10))) {
                g0Var.c(dVar);
            } else {
                if (dVar.f16509f) {
                    dVar = new d(dVar.f16506a, dVar.f16507b, dVar.f16508c, new Bundle(dVar.d), false, dVar.e, dVar.f16510g);
                }
                g0Var.c(dVar);
            }
        }
        this.f16676u = d.g(g0Var.f());
        boolean z10 = this.f16666k;
        Bundle bundle = this.f16675t;
        boolean z11 = true;
        if (!z10 || ((bVar = this.f16667l) != null && bVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !d.c(2, this.f16676u));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !d.c(3, this.f16676u));
            return;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.f16676u.isEmpty() || d.c(2, this.f16676u)) ? false : false);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
    }

    public final void N() {
        Bundle bundle = this.f16675t;
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        M();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        ((n4.n) this.f16668m.f17127b).f17110a.setExtras(bundle);
    }

    public final void O(m1 m1Var) {
        e2.m0.W(this.f16663g.f16528l, new j0(this, m1Var, 1));
    }

    @Override
    public final void b(n4.h hVar) {
        if (hVar != null) {
            H(20, new b2(this, hVar, -1, 3), ((n4.n) this.f16668m.f17127b).c(), false);
        }
    }

    @Override
    public final void c(n4.h hVar, int i10) {
        if (hVar != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new b2(this, hVar, i10, 3), ((n4.n) this.f16668m.f17127b).c(), false);
            }
        }
    }

    @Override
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            t1 t1Var = this.f16663g.f16526j;
            t1Var.getClass();
            String str2 = t1.f16739b;
            Bundle bundle2 = new Bundle();
            u1 u1Var = t1Var.f16741a;
            if (u1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = t1.f16740c;
            u1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(u1.f16745i, u1Var.f16755a);
            bundle3.putInt(u1.f16746j, 0);
            bundle3.putInt(u1.f16747k, u1Var.f16756b);
            bundle3.putString(u1.f16748l, u1Var.d);
            bundle3.putString(u1.f16749m, u1Var.e);
            bundle3.putBinder(u1.f16751o, u1Var.f16758f);
            bundle3.putParcelable(u1.f16750n, null);
            bundle3.putBundle(u1.f16752p, u1Var.f16759g);
            bundle3.putInt(u1.f16753q, u1Var.f16757c);
            MediaSession.Token token = u1Var.h;
            if (token != null) {
                bundle3.putParcelable(u1.f16754r, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        o1 o1Var = new o1(str, Bundle.EMPTY);
        I(o1Var, 0, new v2(this, o1Var, bundle, resultReceiver), ((n4.n) this.f16668m.f17127b).c());
    }

    @Override
    public final void e(java.lang.String r7, android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.e(java.lang.String, android.os.Bundle):void");
    }

    @Override
    public final void f() {
        H(12, new i0(this, 4), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final boolean g(android.content.Intent r13) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.g(android.content.Intent):boolean");
    }

    @Override
    public final void h() {
        H(1, new i0(this, 12), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final void i() {
        H(1, new i0(this, 6), ((n4.n) this.f16668m.f17127b).c(), false);
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
        H(2, new i0(this, 7), ((n4.n) this.f16668m.f17127b).c(), true);
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
        H(20, new ah.h0(27, this, hVar), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final void r() {
        H(11, new i0(this, 5), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final void s(long j10) {
        H(5, new h0(this, j10, 1), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final void t(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        H(13, new l0(this, f7), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final void u(n4.z zVar) {
        v(zVar);
    }

    @Override
    public final void v(n4.z zVar) {
        b2.g1 c10 = n.c(zVar);
        if (c10 == null) {
            e2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + zVar);
            return;
        }
        I(null, 40010, new i0(this, c10), ((n4.n) this.f16668m.f17127b).c());
    }

    @Override
    public final void w(int i10) {
        H(15, new k0(this, i10, 0), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final void x(int i10) {
        H(14, new k0(this, i10, 1), ((n4.n) this.f16668m.f17127b).c(), true);
    }

    @Override
    public final void y() {
        boolean o02 = this.f16663g.f16536t.o0(9);
        n4.s sVar = this.f16668m;
        if (o02) {
            H(9, new i0(this, 10), ((n4.n) sVar.f17127b).c(), true);
        } else {
            H(8, new i0(this, 11), ((n4.n) sVar.f17127b).c(), true);
        }
    }

    @Override
    public final void z() {
        boolean o02 = this.f16663g.f16536t.o0(7);
        n4.s sVar = this.f16668m;
        if (o02) {
            H(7, new i0(this, 2), ((n4.n) sVar.f17127b).c(), true);
        } else {
            H(6, new i0(this, 3), ((n4.n) sVar.f17127b).c(), true);
        }
    }
}
