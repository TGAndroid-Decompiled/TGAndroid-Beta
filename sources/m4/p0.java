package m4;

import a8.ie;
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
import bi.db;
import bi.sb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public final class p0 extends n4.l {
    public static final int f18179y;
    public final com.google.firebase.messaging.q f18180f;
    public final f0 f18181g;
    public final n4.w h;
    public final n0 f18182i;
    public final androidx.mediarouter.app.c f18183j;
    public final boolean f18184k;
    public final b f18185l;
    public final n4.s f18186m;
    public final androidx.mediarouter.app.g f18187n;
    public final ComponentName f18188o;
    public final boolean f18189p;
    public volatile long f18190q;
    public n0 f18191r;
    public int f18192s;
    public final Bundle f18193t;
    public f9.i0 f18194u;
    public f9.i0 v;
    public q1 f18195w;
    public b2.c1 f18196x;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f18179y = i10;
    }

    public p0(m4.f0 r14, android.net.Uri r15, android.os.Handler r16, android.os.Bundle r17, boolean r18, f9.i0 r19, f9.i0 r20, m4.q1 r21, b2.c1 r22, android.os.Bundle r23) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.<init>(m4.f0, android.net.Uri, android.os.Handler, android.os.Bundle, boolean, f9.i0, f9.i0, m4.q1, b2.c1, android.os.Bundle):void");
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
                long j10 = ((n4.q) obj).f18690b;
                if (hashSet.contains(Long.valueOf(j10))) {
                    e2.a.d("MediaSessionCompat", a1.g.o(j10, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j10));
            }
        }
        n4.n nVar = (n4.n) sVar.f18696b;
        MediaSession mediaSession = nVar.f18679a;
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
            MediaSession.QueueItem queueItem = qVar.f18691c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(qVar.f18689a.a(), qVar.f18690b);
                qVar.f18691c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(n4.s sVar, n4.i iVar) {
        n4.n nVar = (n4.n) sVar.f18696b;
        nVar.f18684i = iVar;
        MediaSession mediaSession = nVar.f18679a;
        Bundle bundle = iVar.f18671a;
        if (iVar.f18672b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) n4.i.f18670c.get(str);
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
            iVar.f18672b = builder.build();
        }
        mediaSession.setMetadata(iVar.f18672b);
    }

    public static b2.p0 F(String str, Uri uri, String str2, Bundle bundle) {
        b2.d0 d0Var = new b2.d0();
        f9.g0 g0Var = f9.i0.f10287b;
        f9.s1 s1Var = f9.s1.e;
        List list = Collections.EMPTY_LIST;
        f9.s1 s1Var2 = f9.s1.e;
        b2.i0 i0Var = new b2.i0();
        b2.l0 l0Var = b2.l0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        a8.h0 h0Var = new a8.h0(8, false);
        h0Var.f511b = uri;
        h0Var.f512c = str2;
        h0Var.d = bundle;
        return new b2.p0(str3, new b2.e0(d0Var), null, new b2.j0(i0Var), b2.s0.L, new b2.l0(h0Var));
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
        H(10, new h0(this, j10, 0), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final void B() {
        H(3, new i0(this, 8), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    public final n4.z G(n1 n1Var) {
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
        b2.z0 W = n1Var.W();
        if (n1Var.o0(16) && !n1Var.P0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (W == null && !e2.n0.c0(n1Var, this.f18189p)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (W != null) {
            i11 = 7;
        } else {
            int i15 = o.f18171a;
            if (n1Var.W() != null) {
                i10 = 7;
            } else {
                int d = n1Var.d();
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            if (d == 4) {
                                i10 = 1;
                            } else {
                                throw new IllegalArgumentException(ic.a.i(d, "Unrecognized State: "));
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
        b2.c1 a2 = ie.a(this.f18196x, n1Var.s());
        long j13 = 128;
        for (int i16 = 0; i16 < a2.f3160a.f3510a.size(); i16++) {
            int a10 = a2.f3160a.a(i16);
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
        if (!this.v.isEmpty() && e.c(2, this.f18194u)) {
            j13 &= -17;
        }
        if (!this.v.isEmpty() && e.c(3, this.f18194u)) {
            j13 &= -33;
        }
        if (!z10) {
            j13 &= -257;
        }
        long j14 = j13;
        long j15 = -1;
        if (n1Var.o0(17)) {
            int n02 = n1Var.n0();
            int i17 = o.f18171a;
            j10 = n02 == -1 ? -1L : n02;
        } else {
            j10 = -1;
        }
        float f10 = n1Var.h().f3140a;
        if (n1Var.j0() && z10) {
            f7 = f10;
        } else {
            f7 = 0.0f;
        }
        if (W != null) {
            bundle = new Bundle(W.f3607c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(this.f18193t);
        bundle.putFloat("EXO_SPEED", f10);
        b2.p0 S0 = n1Var.S0();
        if (S0 != null) {
            String str2 = S0.f3344a;
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
            j15 = n1Var.d0();
        }
        ArrayList arrayList = new ArrayList();
        long j16 = j15;
        long j17 = j11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i18 = 0; i18 < this.f18194u.size(); i18++) {
            e eVar = (e) this.f18194u.get(i18);
            p1 p1Var = eVar.f18031a;
            Bundle bundle2 = eVar.d;
            if (p1Var != null) {
                Bundle bundle3 = p1Var.f18201c;
                String str3 = p1Var.f18200b;
                if (eVar.f18034f && p1Var.f18199a == 0) {
                    q1 q1Var = this.f18195w;
                    if ((p1Var != null && q1Var.f18206a.contains(p1Var)) || (((i14 = eVar.f18032b) != -1 && a2.a(i14)) || e.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i19 = eVar.f18033c;
                        if (!TextUtils.isEmpty(str3)) {
                            if (!TextUtils.isEmpty("")) {
                                if (i19 != 0) {
                                    arrayList.add(new n4.y(str3, i19, bundle3));
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
            int i20 = o.f18171a;
            int i21 = W.f3605a;
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
        return new n4.z(i11, j17, j16, f7, j14, i12, str, elapsedRealtime, arrayList, j10, bundle);
    }

    public final void H(int i10, o0 o0Var, n4.t tVar, boolean z10) {
        f0 f0Var = this.f18181g;
        if (f0Var.j()) {
            return;
        }
        if (tVar == null) {
            e2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
            return;
        }
        e2.n0.W(f0Var.f18049l, new db(this, i10, tVar, o0Var, z10));
    }

    public final void I(p1 p1Var, int i10, o0 o0Var, n4.t tVar) {
        if (tVar == null) {
            StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = p1Var;
            if (p1Var == null) {
                obj = Integer.valueOf(i10);
            }
            sb2.append(obj);
            e2.a.b("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        e2.n0.W(this.f18181g.f18049l, new sb(this, p1Var, i10, tVar, o0Var, 6));
    }

    public final void K(b2.p0 p0Var, boolean z10, boolean z11) {
        H(31, new a0(this, p0Var, z10, z11), ((n4.n) this.f18186m.f18696b).c(), false);
    }

    public final w L(n4.t tVar) {
        w l4 = this.f18180f.l(tVar);
        if (l4 == null) {
            w wVar = new w(tVar, 0, 0, this.h.b(tVar), new m0(tVar), Bundle.EMPTY);
            u m10 = this.f18181g.m(wVar);
            this.f18180f.b(tVar, wVar, m10.f18260a, m10.f18261b);
            f0 f0Var = this.f18181g;
            if (!f0Var.f18060x || !f0.k(wVar)) {
                f0Var.e.getClass();
            }
            l4 = wVar;
        }
        androidx.mediarouter.app.c cVar = this.f18183j;
        long j10 = this.f18190q;
        cVar.removeMessages(1001, l4);
        cVar.sendMessageDelayed(cVar.obtainMessage(1001, l4), j10);
        return l4;
    }

    public final void M() {
        b bVar;
        int i10;
        f9.i0 i0Var = this.v;
        q1 q1Var = this.f18195w;
        b2.c1 c1Var = this.f18196x;
        String str = e.h;
        ?? b0Var = new f9.b0(4);
        for (int i11 = 0; i11 < i0Var.size(); i11++) {
            e eVar = (e) i0Var.get(i11);
            p1 p1Var = eVar.f18031a;
            if ((p1Var != null && q1Var.f18206a.contains(p1Var)) || ((i10 = eVar.f18032b) != -1 && c1Var.a(i10))) {
                b0Var.c(eVar);
            } else {
                if (eVar.f18034f) {
                    eVar = new e(eVar.f18031a, eVar.f18032b, eVar.f18033c, new Bundle(eVar.d), false, eVar.e, eVar.f18035g);
                }
                b0Var.c(eVar);
            }
        }
        this.f18194u = e.g(b0Var.f());
        boolean z10 = this.f18184k;
        Bundle bundle = this.f18193t;
        boolean z11 = true;
        if (!z10 || ((bVar = this.f18185l) != null && bVar.e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !e.c(2, this.f18194u));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !e.c(3, this.f18194u));
            return;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.f18194u.isEmpty() || e.c(2, this.f18194u)) ? false : false);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
    }

    public final void N() {
        Bundle bundle = this.f18193t;
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z11 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        M();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z10 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z11) {
            return;
        }
        ((n4.n) this.f18186m.f18696b).f18679a.setExtras(bundle);
    }

    public final void O(n1 n1Var) {
        e2.n0.W(this.f18181g.f18049l, new j0(this, n1Var, 1));
    }

    @Override
    public final void b(n4.h hVar) {
        if (hVar != null) {
            H(20, new i2.z(this, hVar, -1, 3), ((n4.n) this.f18186m.f18696b).c(), false);
        }
    }

    @Override
    public final void c(n4.h hVar, int i10) {
        if (hVar != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new i2.z(this, hVar, i10, 3), ((n4.n) this.f18186m.f18696b).c(), false);
            }
        }
    }

    @Override
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            u1 u1Var = this.f18181g.f18047j;
            u1Var.getClass();
            String str2 = u1.f18265b;
            Bundle bundle2 = new Bundle();
            v1 v1Var = u1Var.f18267a;
            if (v1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = u1.f18266c;
            v1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(v1.f18271i, v1Var.f18281a);
            bundle3.putInt(v1.f18272j, 0);
            bundle3.putInt(v1.f18273k, v1Var.f18282b);
            bundle3.putString(v1.f18274l, v1Var.d);
            bundle3.putString(v1.f18275m, v1Var.e);
            bundle3.putBinder(v1.f18277o, v1Var.f18284f);
            bundle3.putParcelable(v1.f18276n, null);
            bundle3.putBundle(v1.f18278p, v1Var.f18285g);
            bundle3.putInt(v1.f18279q, v1Var.f18283c);
            MediaSession.Token token = v1Var.h;
            if (token != null) {
                bundle3.putParcelable(v1.f18280r, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        p1 p1Var = new p1(str, Bundle.EMPTY);
        I(p1Var, 0, new androidx.car.app.utils.a(this, p1Var, bundle, resultReceiver), ((n4.n) this.f18186m.f18696b).c());
    }

    @Override
    public final void e(java.lang.String r7, android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.e(java.lang.String, android.os.Bundle):void");
    }

    @Override
    public final void f() {
        H(12, new i0(this, 4), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final boolean g(android.content.Intent r13) {
        throw new UnsupportedOperationException("Method not decompiled: m4.p0.g(android.content.Intent):boolean");
    }

    @Override
    public final void h() {
        H(1, new i0(this, 12), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final void i() {
        H(1, new i0(this, 6), ((n4.n) this.f18186m.f18696b).c(), false);
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
        H(2, new i0(this, 7), ((n4.n) this.f18186m.f18696b).c(), true);
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
        H(20, new ai.f0(29, this, hVar), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final void r() {
        H(11, new i0(this, 5), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final void s(long j10) {
        H(5, new h0(this, j10, 1), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final void t(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        H(13, new l0(this, f7), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final void u(n4.a0 a0Var) {
        v(a0Var);
    }

    @Override
    public final void v(n4.a0 a0Var) {
        b2.h1 c10 = o.c(a0Var);
        if (c10 == null) {
            e2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + a0Var);
            return;
        }
        I(null, 40010, new i0(this, c10), ((n4.n) this.f18186m.f18696b).c());
    }

    @Override
    public final void w(int i10) {
        H(15, new k0(this, i10, 0), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final void x(int i10) {
        H(14, new k0(this, i10, 1), ((n4.n) this.f18186m.f18696b).c(), true);
    }

    @Override
    public final void y() {
        boolean o02 = this.f18181g.f18057t.o0(9);
        n4.s sVar = this.f18186m;
        if (o02) {
            H(9, new i0(this, 10), ((n4.n) sVar.f18696b).c(), true);
        } else {
            H(8, new i0(this, 11), ((n4.n) sVar.f18696b).c(), true);
        }
    }

    @Override
    public final void z() {
        boolean o02 = this.f18181g.f18057t.o0(7);
        n4.s sVar = this.f18186m;
        if (o02) {
            H(7, new i0(this, 2), ((n4.n) sVar.f18696b).c(), true);
        } else {
            H(6, new i0(this, 3), ((n4.n) sVar.f18696b).c(), true);
        }
    }
}
