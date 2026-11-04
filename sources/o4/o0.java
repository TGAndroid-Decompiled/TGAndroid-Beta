package o4;

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
import b8.xe;
import ci.ka;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import mi.d4;
public final class o0 extends android.support.v4.media.session.s {
    public static final int f20772z;
    public final ui.f f20773g;
    public final e0 h;
    public final p4.u f20774i;
    public final m0 f20775j;
    public final android.support.v4.media.session.q f20776k;
    public final boolean f20777l;
    public final b f20778m;
    public final p4.q f20779n;
    public final androidx.mediarouter.app.f f20780o;
    public final ComponentName f20781p;
    public final boolean f20782q;
    public volatile long f20783r;
    public m0 f20784s;
    public int f20785t;
    public final Bundle f20786u;
    public g9.i0 v;
    public g9.i0 f20787w;
    public o1 f20788x;
    public d2.a1 f20789y;

    static {
        int i3;
        if (Build.VERSION.SDK_INT >= 31) {
            i3 = 33554432;
        } else {
            i3 = 0;
        }
        f20772z = i3;
    }

    public o0(o4.e0 r18, android.net.Uri r19, android.os.Handler r20, android.os.Bundle r21, boolean r22, g9.i0 r23, g9.i0 r24, o4.o1 r25, d2.a1 r26, android.os.Bundle r27) {
        throw new UnsupportedOperationException("Method not decompiled: o4.o0.<init>(o4.e0, android.net.Uri, android.os.Handler, android.os.Bundle, boolean, g9.i0, g9.i0, o4.o1, d2.a1, android.os.Bundle):void");
    }

    public static void e0(p4.q qVar, ArrayList arrayList) {
        int i3 = 0;
        if (arrayList != null) {
            qVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long j10 = ((p4.o) obj).f53176b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    g2.a.d("MediaSessionCompat", a1.g.p(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        p4.l lVar = (p4.l) qVar.f53181a;
        MediaSession mediaSession = lVar.f53164a;
        lVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            p4.o oVar = (p4.o) obj2;
            MediaSession.QueueItem queueItem = oVar.f53177c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(oVar.f53175a.a(), oVar.f53176b);
                oVar.f53177c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void f0(p4.q qVar, p4.i iVar) {
        p4.l lVar = (p4.l) qVar.f53181a;
        lVar.f53170i = iVar;
        MediaSession mediaSession = lVar.f53164a;
        Bundle bundle = iVar.f53160a;
        if (iVar.f53161b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) p4.i.f53159c.get(str);
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
            iVar.f53161b = builder.build();
        }
        mediaSession.setMetadata(iVar.f53161b);
    }

    public static d2.n0 g0(String str, Uri uri, String str2, Bundle bundle) {
        d2.b0 b0Var = new d2.b0();
        g9.g0 g0Var = g9.i0.f12083b;
        g9.s1 s1Var = g9.s1.f12146e;
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var2 = g9.s1.f12146e;
        d2.g0 g0Var2 = new d2.g0();
        d2.j0 j0Var = d2.j0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(13, false);
        a0Var.f1186b = uri;
        a0Var.f1187c = str2;
        a0Var.d = bundle;
        return new d2.n0(str3, new d2.c0(b0Var), null, new d2.h0(g0Var2), d2.q0.L, new d2.j0(a0Var));
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
    public final void E(p4.h hVar) {
        if (hVar == null) {
            return;
        }
        i0(20, new d4(3, this, hVar), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void F() {
        i0(11, new h0(this, 5), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void G(long j10) {
        i0(5, new g0(this, j10, 1), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void J(final float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        i0(13, new n0() {
            @Override
            public final void c(v vVar) {
                o0.this.h.f20636t.b(f10);
            }
        }, ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void K(p4.x xVar) {
        L(xVar);
    }

    @Override
    public final void L(p4.x xVar) {
        d2.f1 c2 = n.c(xVar);
        if (c2 == null) {
            g2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + xVar);
            return;
        }
        j0(null, 40010, new h0(this, c2), ((p4.l) this.f20779n.f53181a).c());
    }

    @Override
    public final void M(int i3) {
        i0(15, new j0(this, i3, 0), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void P(int i3) {
        i0(14, new j0(this, i3, 1), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void S() {
        boolean m0 = this.h.f20636t.m0(9);
        p4.q qVar = this.f20779n;
        if (m0) {
            i0(9, new h0(this, 10), ((p4.l) qVar.f53181a).c(), true);
        } else {
            i0(8, new h0(this, 11), ((p4.l) qVar.f53181a).c(), true);
        }
    }

    @Override
    public final void V() {
        boolean m0 = this.h.f20636t.m0(7);
        p4.q qVar = this.f20779n;
        if (m0) {
            i0(7, new h0(this, 2), ((p4.l) qVar.f53181a).c(), true);
        } else {
            i0(6, new h0(this, 3), ((p4.l) qVar.f53181a).c(), true);
        }
    }

    @Override
    public final void Y(long j10) {
        if (j10 < 0) {
            return;
        }
        i0(10, new g0(this, j10, 0), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void b0() {
        i0(3, new h0(this, 8), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void c(p4.h hVar) {
        if (hVar != null) {
            i0(20, new k2.y(this, hVar, -1, 3), ((p4.l) this.f20779n.f53181a).c(), false);
        }
    }

    @Override
    public final void d(p4.h hVar, int i3) {
        if (hVar != null) {
            if (i3 == -1 || i3 >= 0) {
                i0(20, new k2.y(this, hVar, i3, 3), ((p4.l) this.f20779n.f53181a).c(), false);
            }
        }
    }

    @Override
    public final void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            s1 s1Var = this.h.f20626j;
            s1Var.getClass();
            String str2 = s1.f20850b;
            Bundle bundle2 = new Bundle();
            t1 t1Var = s1Var.f20852a;
            if (t1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = s1.f20851c;
            t1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(t1.f20861i, t1Var.f20871a);
            bundle3.putInt(t1.f20862j, 0);
            bundle3.putInt(t1.f20863k, t1Var.f20872b);
            bundle3.putString(t1.f20864l, t1Var.d);
            bundle3.putString(t1.f20865m, t1Var.f20874e);
            bundle3.putBinder(t1.f20867o, t1Var.f20875f);
            bundle3.putParcelable(t1.f20866n, null);
            bundle3.putBundle(t1.f20868p, t1Var.f20876g);
            bundle3.putInt(t1.f20869q, t1Var.f20873c);
            MediaSession.Token token = t1Var.h;
            if (token != null) {
                bundle3.putParcelable(t1.f20870r, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        n1 n1Var = new n1(str, Bundle.EMPTY);
        j0(n1Var, 0, new aa.a(this, n1Var, bundle, resultReceiver), ((p4.l) this.f20779n.f53181a).c());
    }

    @Override
    public final void g(java.lang.String r7, android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: o4.o0.g(java.lang.String, android.os.Bundle):void");
    }

    @Override
    public final void h() {
        i0(12, new h0(this, 4), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    public final p4.w h0(l1 l1Var) {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        long j10;
        float f10;
        Bundle bundle;
        long j11;
        String str;
        int i11;
        int i12;
        int i13;
        long j12;
        d2.x0 U = l1Var.U();
        if (l1Var.m0(16) && !l1Var.P0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (U == null && !g2.n0.c0(l1Var, this.f20782q)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (U != null) {
            i10 = 7;
        } else {
            int i14 = n.f20759a;
            if (l1Var.U() != null) {
                i3 = 7;
            } else {
                int h = l1Var.h();
                if (h != 1) {
                    if (h != 2) {
                        if (h != 3) {
                            if (h == 4) {
                                i3 = 1;
                            } else {
                                throw new IllegalArgumentException(k2.p1.i(h, "Unrecognized State: "));
                            }
                        } else {
                            if (!z11) {
                                i3 = 3;
                            }
                            i3 = 2;
                        }
                    } else {
                        if (!z11) {
                            i3 = 6;
                        }
                        i3 = 2;
                    }
                } else {
                    i3 = 0;
                }
            }
            i10 = i3;
        }
        d2.a1 a10 = xe.a(this.f20789y, l1Var.t());
        long j13 = 128;
        for (int i15 = 0; i15 < a10.f8026a.f8412a.size(); i15++) {
            int a11 = a10.f8026a.a(i15);
            if (a11 != 1) {
                if (a11 != 2) {
                    if (a11 != 3) {
                        if (a11 != 31) {
                            switch (a11) {
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
        if (!this.f20787w.isEmpty() && d.c(2, this.v)) {
            j13 &= -17;
        }
        if (!this.f20787w.isEmpty() && d.c(3, this.v)) {
            j13 &= -33;
        }
        if (!z10) {
            j13 &= -257;
        }
        long j14 = j13;
        long j15 = -1;
        if (l1Var.m0(17)) {
            int l02 = l1Var.l0();
            int i16 = n.f20759a;
            j10 = l02 == -1 ? -1L : l02;
        } else {
            j10 = -1;
        }
        float f11 = l1Var.g().f8517a;
        if (l1Var.i0() && z10) {
            f10 = f11;
        } else {
            f10 = 0.0f;
        }
        if (U != null) {
            bundle = new Bundle(U.f8514c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(this.f20786u);
        bundle.putFloat("EXO_SPEED", f11);
        d2.n0 S0 = l1Var.S0();
        if (S0 != null) {
            String str2 = S0.f8240a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z10) {
            j11 = l1Var.N0();
        } else {
            j11 = -1;
        }
        if (z10) {
            j15 = l1Var.b0();
        }
        ArrayList arrayList = new ArrayList();
        long j16 = j15;
        long j17 = j11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i17 = 0; i17 < this.v.size(); i17++) {
            d dVar = (d) this.v.get(i17);
            n1 n1Var = dVar.f20610a;
            Bundle bundle2 = dVar.d;
            if (n1Var != null) {
                Bundle bundle3 = n1Var.f20765c;
                String str3 = n1Var.f20764b;
                if (dVar.f20614f && n1Var.f20763a == 0) {
                    o1 o1Var = this.f20788x;
                    if ((n1Var != null && o1Var.f20791a.contains(n1Var)) || (((i13 = dVar.f20611b) != -1 && a10.a(i13)) || d.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i18 = dVar.f20612c;
                        if (!TextUtils.isEmpty(str3)) {
                            if (!TextUtils.isEmpty("")) {
                                if (i18 != 0) {
                                    arrayList.add(new p4.v(str3, i18, bundle3));
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
        if (U != null) {
            int i19 = n.f20759a;
            int i20 = U.f8512a;
            if (i20 != -110) {
                if (i20 != -109) {
                    if (i20 != -6) {
                        if (i20 != -2) {
                            if (i20 != 1) {
                                switch (i20) {
                                    case -107:
                                        i12 = 9;
                                        break;
                                    case -106:
                                        i12 = 7;
                                        break;
                                    case -105:
                                        i12 = 6;
                                        break;
                                    case -104:
                                        i12 = 5;
                                        break;
                                    case -103:
                                        i12 = 4;
                                        break;
                                    case -102:
                                        i12 = 3;
                                        break;
                                    default:
                                        i12 = 0;
                                        break;
                                }
                            } else {
                                i12 = 10;
                            }
                        } else {
                            i12 = 1;
                        }
                    } else {
                        i12 = 2;
                    }
                } else {
                    i12 = 11;
                }
            } else {
                i12 = 8;
            }
            str = U.getMessage();
            i11 = i12;
        } else {
            str = null;
            i11 = 0;
        }
        return new p4.w(i10, j17, j16, f10, j14, i11, str, elapsedRealtime, arrayList, j10, bundle);
    }

    @Override
    public final boolean i(android.content.Intent r13) {
        throw new UnsupportedOperationException("Method not decompiled: o4.o0.i(android.content.Intent):boolean");
    }

    public final void i0(int i3, n0 n0Var, p4.r rVar, boolean z10) {
        e0 e0Var = this.h;
        if (e0Var.j()) {
            return;
        }
        if (rVar == null) {
            g2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i3);
            return;
        }
        g2.n0.W(e0Var.f20628l, new ka(this, i3, rVar, n0Var, z10));
    }

    public final void j0(n1 n1Var, int i3, n0 n0Var, p4.r rVar) {
        if (rVar == null) {
            StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = n1Var;
            if (n1Var == null) {
                obj = Integer.valueOf(i3);
            }
            sb2.append(obj);
            g2.a.b("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        g2.n0.W(this.h.f20628l, new ai.p1(this, n1Var, i3, rVar, n0Var, 8));
    }

    @Override
    public final void k() {
        i0(1, new h0(this, 12), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    public final void l0(d2.n0 n0Var, boolean z10, boolean z11) {
        i0(31, new z(this, n0Var, z10, z11), ((p4.l) this.f20779n.f53181a).c(), false);
    }

    public final v m0(p4.r rVar) {
        v o10 = this.f20773g.o(rVar);
        if (o10 == null) {
            v vVar = new v(rVar, 0, 0, this.f20774i.b(rVar), new l0(rVar), Bundle.EMPTY);
            t m10 = this.h.m(vVar);
            this.f20773g.a(rVar, vVar, m10.f20855a, m10.f20856b);
            e0 e0Var = this.h;
            if (!e0Var.f20639x || !e0.k(vVar)) {
                e0Var.f20622e.getClass();
            }
            o10 = vVar;
        }
        android.support.v4.media.session.q qVar = this.f20776k;
        long j10 = this.f20783r;
        qVar.removeMessages(1001, o10);
        qVar.sendMessageDelayed(qVar.obtainMessage(1001, o10), j10);
        return o10;
    }

    @Override
    public final void n() {
        i0(1, new h0(this, 6), ((p4.l) this.f20779n.f53181a).c(), false);
    }

    public final void n0() {
        b bVar;
        int i3;
        g9.i0 i0Var = this.f20787w;
        o1 o1Var = this.f20788x;
        d2.a1 a1Var = this.f20789y;
        String str = d.h;
        ?? b0Var = new g9.b0(4);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            d dVar = (d) i0Var.get(i10);
            n1 n1Var = dVar.f20610a;
            if ((n1Var != null && o1Var.f20791a.contains(n1Var)) || ((i3 = dVar.f20611b) != -1 && a1Var.a(i3))) {
                b0Var.c(dVar);
            } else {
                if (dVar.f20614f) {
                    dVar = new d(dVar.f20610a, dVar.f20611b, dVar.f20612c, new Bundle(dVar.d), false, dVar.f20613e, dVar.f20615g);
                }
                b0Var.c(dVar);
            }
        }
        this.v = d.g(b0Var.f());
        boolean z10 = this.f20777l;
        Bundle bundle = this.f20786u;
        boolean z11 = true;
        if (!z10 || ((bVar = this.f20778m) != null && bVar.f20584e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !d.c(2, this.v));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !d.c(3, this.v));
            return;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.v.isEmpty() || d.c(2, this.v)) ? false : false);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
    }

    public final void o0() {
        Bundle bundle = this.f20786u;
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        n0();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        ((p4.l) this.f20779n.f53181a).f53164a.setExtras(bundle);
    }

    public final void p0(l1 l1Var) {
        g2.n0.W(this.h.f20628l, new i0(this, l1Var, 1));
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
        i0(2, new h0(this, 7), ((p4.l) this.f20779n.f53181a).c(), true);
    }

    @Override
    public final void x(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, false);
    }
}
