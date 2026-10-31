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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public final class p0 extends android.support.v4.media.session.s {
    public static final int f12876z;
    public final xa.n f12877g;
    public final f0 h;
    public final n4.u f12878i;
    public final n0 f12879j;
    public final android.support.v4.media.session.q f12880k;
    public final boolean f12881l;
    public final b f12882m;
    public final n4.q f12883n;
    public final androidx.mediarouter.app.f f12884o;
    public final ComponentName f12885p;
    public final boolean f12886q;
    public volatile long f12887r;
    public n0 f12888s;
    public int f12889t;
    public final Bundle f12890u;
    public e9.n0 v;
    public e9.n0 f12891w;
    public q1 f12892x;
    public b2.b1 f12893y;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f12876z = i10;
    }

    public p0(m4.f0 r18, android.net.Uri r19, android.os.Handler r20, android.os.Bundle r21, boolean r22, e9.n0 r23, e9.n0 r24, m4.q1 r25, b2.b1 r26, android.os.Bundle r27) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.<init>(m4.f0, android.net.Uri, android.os.Handler, android.os.Bundle, boolean, e9.n0, e9.n0, m4.q1, b2.b1, android.os.Bundle):void");
    }

    public static void e0(n4.q qVar, ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            qVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long j10 = ((n4.o) obj).f13521b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    e2.a.d("MediaSessionCompat", a1.g.l(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        n4.l lVar = (n4.l) qVar.f13526a;
        MediaSession mediaSession = lVar.f13510a;
        lVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            n4.o oVar = (n4.o) obj2;
            MediaSession.QueueItem queueItem = oVar.f13522c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(oVar.f13520a.a(), oVar.f13521b);
                oVar.f13522c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void f0(n4.q qVar, n4.i iVar) {
        n4.l lVar = (n4.l) qVar.f13526a;
        lVar.f13515i = iVar;
        MediaSession mediaSession = lVar.f13510a;
        Bundle bundle = iVar.f13506a;
        if (iVar.f13507b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) n4.i.f13505c.get(str);
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
            iVar.f13507b = builder.build();
        }
        mediaSession.setMetadata(iVar.f13507b);
    }

    public static b2.p0 g0(String str, Uri uri, String str2, Bundle bundle) {
        b2.d0 d0Var = new b2.d0();
        e9.l0 l0Var = e9.n0.f6390b;
        x1 x1Var = x1.e;
        List list = Collections.EMPTY_LIST;
        x1 x1Var2 = x1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var2 = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(4);
        a0Var.f875b = uri;
        a0Var.f876c = str2;
        a0Var.d = bundle;
        return new b2.p0(str3, new b2.e0(d0Var), null, new b2.j0(i0Var), b2.s0.L, new b2.l0(a0Var));
    }

    public static ComponentName k0(Context context, String str) {
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
        l0(g0(null, null, str, bundle), true, false);
    }

    @Override
    public final void D(Uri uri, Bundle bundle) {
        l0(g0(null, uri, null, bundle), true, false);
    }

    @Override
    public final void E(n4.h hVar) {
        if (hVar == null) {
            return;
        }
        i0(20, new ag.m(19, this, hVar), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void F() {
        i0(11, new i0(this, 5), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void G(long j10) {
        i0(5, new h0(this, j10, 1), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void J(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        i0(13, new l0(this, f7), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void K(n4.x xVar) {
        L(xVar);
    }

    @Override
    public final void L(n4.x xVar) {
        b2.g1 c10 = o.c(xVar);
        if (c10 == null) {
            e2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + xVar);
            return;
        }
        j0(null, 40010, new i0(this, c10), ((n4.l) this.f12883n.f13526a).c());
    }

    @Override
    public final void M(int i10) {
        i0(15, new k0(this, i10, 0), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void P(int i10) {
        i0(14, new k0(this, i10, 1), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void S() {
        boolean n02 = this.h.f12754t.n0(9);
        n4.q qVar = this.f12883n;
        if (n02) {
            i0(9, new i0(this, 10), ((n4.l) qVar.f13526a).c(), true);
        } else {
            i0(8, new i0(this, 11), ((n4.l) qVar.f13526a).c(), true);
        }
    }

    @Override
    public final void V() {
        boolean n02 = this.h.f12754t.n0(7);
        n4.q qVar = this.f12883n;
        if (n02) {
            i0(7, new i0(this, 2), ((n4.l) qVar.f13526a).c(), true);
        } else {
            i0(6, new i0(this, 3), ((n4.l) qVar.f13526a).c(), true);
        }
    }

    @Override
    public final void Y(long j10) {
        if (j10 < 0) {
            return;
        }
        i0(10, new h0(this, j10, 0), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void b0() {
        i0(3, new i0(this, 8), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void c(n4.h hVar) {
        if (hVar != null) {
            i0(20, new ag.b0(this, hVar, -1, 2), ((n4.l) this.f12883n.f13526a).c(), false);
        }
    }

    @Override
    public final void d(n4.h hVar, int i10) {
        if (hVar != null) {
            if (i10 == -1 || i10 >= 0) {
                i0(20, new ag.b0(this, hVar, i10, 2), ((n4.l) this.f12883n.f13526a).c(), false);
            }
        }
    }

    @Override
    public final void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            u1 u1Var = this.h.f12744j;
            u1Var.getClass();
            String str2 = u1.f12962b;
            Bundle bundle2 = new Bundle();
            v1 v1Var = u1Var.f12964a;
            if (v1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = u1.f12963c;
            v1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(v1.f12966i, v1Var.f12976a);
            bundle3.putInt(v1.f12967j, 0);
            bundle3.putInt(v1.f12968k, v1Var.f12977b);
            bundle3.putString(v1.f12969l, v1Var.d);
            bundle3.putString(v1.f12970m, v1Var.e);
            bundle3.putBinder(v1.f12972o, v1Var.f12979f);
            bundle3.putParcelable(v1.f12971n, null);
            bundle3.putBundle(v1.f12973p, v1Var.f12980g);
            bundle3.putInt(v1.f12974q, v1Var.f12978c);
            MediaSession.Token token = v1Var.h;
            if (token != null) {
                bundle3.putParcelable(v1.f12975r, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        p1 p1Var = new p1(str, Bundle.EMPTY);
        j0(p1Var, 0, new androidx.car.app.utils.a(this, p1Var, bundle, resultReceiver), ((n4.l) this.f12883n.f13526a).c());
    }

    @Override
    public final void g(java.lang.String r7, android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.g(java.lang.String, android.os.Bundle):void");
    }

    @Override
    public final void h() {
        i0(12, new i0(this, 4), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    public final n4.w h0(n1 n1Var) {
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
        b2.y0 V = n1Var.V();
        if (n1Var.n0(16) && !n1Var.P0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (V == null && !e2.l0.c0(n1Var, this.f12886q)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (V != null) {
            i11 = 7;
        } else {
            int i15 = o.f12868a;
            if (n1Var.V() != null) {
                i10 = 7;
            } else {
                int h = n1Var.h();
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h == 4) {
                                i10 = 1;
                            } else {
                                throw new IllegalArgumentException(i0.a.i(h, "Unrecognized State: "));
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
        b2.b1 a2 = w7.y.a(this.f12893y, n1Var.s());
        long j13 = 128;
        for (int i16 = 0; i16 < a2.f1984a.f2347a.size(); i16++) {
            int a10 = a2.f1984a.a(i16);
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
        if (!this.f12891w.isEmpty() && e.c(2, this.v)) {
            j13 &= -17;
        }
        if (!this.f12891w.isEmpty() && e.c(3, this.v)) {
            j13 &= -33;
        }
        if (!z10) {
            j13 &= -257;
        }
        long j14 = j13;
        long j15 = -1;
        if (n1Var.n0(17)) {
            int m0 = n1Var.m0();
            int i17 = o.f12868a;
            j10 = m0 == -1 ? -1L : m0;
        } else {
            j10 = -1;
        }
        float f10 = n1Var.g().f2443a;
        if (n1Var.i0() && z10) {
            f7 = f10;
        } else {
            f7 = 0.0f;
        }
        if (V != null) {
            bundle = new Bundle(V.f2439c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(this.f12890u);
        bundle.putFloat("EXO_SPEED", f10);
        b2.p0 S0 = n1Var.S0();
        if (S0 != null) {
            String str2 = S0.f2181a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z10) {
            j11 = n1Var.M0();
        } else {
            j11 = -1;
        }
        if (z10) {
            j15 = n1Var.c0();
        }
        ArrayList arrayList = new ArrayList();
        long j16 = j15;
        long j17 = j11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i18 = 0; i18 < this.v.size(); i18++) {
            e eVar = (e) this.v.get(i18);
            p1 p1Var = eVar.f12728a;
            Bundle bundle2 = eVar.d;
            if (p1Var != null) {
                Bundle bundle3 = p1Var.f12898c;
                String str3 = p1Var.f12897b;
                if (eVar.f12731f && p1Var.f12896a == 0) {
                    q1 q1Var = this.f12892x;
                    if ((p1Var != null && q1Var.f12903a.contains(p1Var)) || (((i14 = eVar.f12729b) != -1 && a2.a(i14)) || e.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i19 = eVar.f12730c;
                        if (!TextUtils.isEmpty(str3)) {
                            if (!TextUtils.isEmpty("")) {
                                if (i19 != 0) {
                                    arrayList.add(new n4.v(str3, i19, bundle3));
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
        if (V != null) {
            int i20 = o.f12868a;
            int i21 = V.f2437a;
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
            str = V.getMessage();
            i12 = i13;
        } else {
            str = null;
            i12 = 0;
        }
        return new n4.w(i11, j17, j16, f7, j14, i12, str, elapsedRealtime, arrayList, j10, bundle);
    }

    @Override
    public final boolean i(android.content.Intent r13) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.i(android.content.Intent):boolean");
    }

    public final void i0(int i10, o0 o0Var, n4.r rVar, boolean z10) {
        f0 f0Var = this.h;
        if (f0Var.j()) {
            return;
        }
        if (rVar == null) {
            e2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
            return;
        }
        e2.l0.W(f0Var.f12746l, new ig.o0(this, i10, rVar, o0Var, z10));
    }

    public final void j0(p1 p1Var, int i10, o0 o0Var, n4.r rVar) {
        if (rVar == null) {
            StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = p1Var;
            if (p1Var == null) {
                obj = Integer.valueOf(i10);
            }
            sb2.append(obj);
            e2.a.b("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        e2.l0.W(this.h.f12746l, new i2.g1(this, p1Var, i10, rVar, o0Var, 2));
    }

    @Override
    public final void k() {
        i0(1, new i0(this, 12), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    public final void l0(b2.p0 p0Var, boolean z10, boolean z11) {
        i0(31, new a0(this, p0Var, z10, z11), ((n4.l) this.f12883n.f13526a).c(), false);
    }

    public final w m0(n4.r rVar) {
        w B = this.f12877g.B(rVar);
        if (B == null) {
            w wVar = new w(rVar, 0, 0, this.f12878i.b(rVar), new m0(rVar), Bundle.EMPTY);
            u m10 = this.h.m(wVar);
            this.f12877g.f(rVar, wVar, m10.f12956a, m10.f12957b);
            f0 f0Var = this.h;
            if (!f0Var.f12757x || !f0.k(wVar)) {
                f0Var.e.getClass();
            }
            B = wVar;
        }
        android.support.v4.media.session.q qVar = this.f12880k;
        long j10 = this.f12887r;
        qVar.removeMessages(1001, B);
        qVar.sendMessageDelayed(qVar.obtainMessage(1001, B), j10);
        return B;
    }

    @Override
    public final void n() {
        i0(1, new i0(this, 6), ((n4.l) this.f12883n.f13526a).c(), false);
    }

    public final void n0() {
        b bVar;
        int i10;
        e9.n0 n0Var = this.f12891w;
        q1 q1Var = this.f12892x;
        b2.b1 b1Var = this.f12893y;
        String str = e.h;
        ?? g0Var = new e9.g0(4);
        for (int i11 = 0; i11 < n0Var.size(); i11++) {
            e eVar = (e) n0Var.get(i11);
            p1 p1Var = eVar.f12728a;
            if ((p1Var != null && q1Var.f12903a.contains(p1Var)) || ((i10 = eVar.f12729b) != -1 && b1Var.a(i10))) {
                g0Var.c(eVar);
            } else {
                if (eVar.f12731f) {
                    eVar = new e(eVar.f12728a, eVar.f12729b, eVar.f12730c, new Bundle(eVar.d), false, eVar.e, eVar.f12732g);
                }
                g0Var.c(eVar);
            }
        }
        this.v = e.g(g0Var.f());
        boolean z10 = this.f12881l;
        Bundle bundle = this.f12890u;
        boolean z11 = true;
        if (!z10 || ((bVar = this.f12882m) != null && bVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !e.c(2, this.v));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !e.c(3, this.v));
            return;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.v.isEmpty() || e.c(2, this.v)) ? false : false);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
    }

    public final void o0() {
        Bundle bundle = this.f12890u;
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        n0();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        ((n4.l) this.f12883n.f13526a).f13510a.setExtras(bundle);
    }

    public final void p0(n1 n1Var) {
        e2.l0.W(this.h.f12746l, new j0(this, n1Var, 1));
    }

    @Override
    public final void q(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, true);
    }

    @Override
    public final void u(String str, Bundle bundle) {
        l0(g0(null, null, str, bundle), true, true);
    }

    @Override
    public final void v(Uri uri, Bundle bundle) {
        l0(g0(null, uri, null, bundle), true, true);
    }

    @Override
    public final void w() {
        i0(2, new i0(this, 7), ((n4.l) this.f12883n.f13526a).c(), true);
    }

    @Override
    public final void x(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, false);
    }
}
