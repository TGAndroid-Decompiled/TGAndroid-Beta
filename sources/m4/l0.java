package m4;

import ai.r5;
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
import android.util.Log;
import ei.l3;
import gg.c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public final class l0 extends n4.p {
    public static final int f16160w;
    public final pi.f f16161f;
    public final b0 f16162g;
    public final n4.c0 h;
    public final j0 f16163i;
    public final androidx.mediarouter.app.c f16164j;
    public final n4.x f16165k;
    public final androidx.mediarouter.app.g f16166l;
    public final ComponentName f16167m;
    public final boolean f16168n = true;
    public volatile long f16169o;
    public j0 f16170p;
    public int f16171q;
    public final Bundle f16172r;
    public e9.i0 f16173s;
    public e9.i0 f16174t;
    public j1 f16175u;
    public b2.x0 v;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f16160w = i10;
    }

    public l0(m4.b0 r10, android.net.Uri r11, android.os.Handler r12, android.os.Bundle r13, e9.i0 r14, e9.i0 r15, m4.j1 r16, b2.x0 r17, android.os.Bundle r18) {
        throw new UnsupportedOperationException("Method not decompiled: m4.l0.<init>(m4.b0, android.net.Uri, android.os.Handler, android.os.Bundle, e9.i0, e9.i0, m4.j1, b2.x0, android.os.Bundle):void");
    }

    public static void D(n4.x xVar, ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            xVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long j3 = ((n4.u) obj).f16651b;
                if (hashSet.contains(Long.valueOf(j3))) {
                    Log.e("MediaSessionCompat", a1.g.p(j3, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j3));
            }
        }
        n4.r rVar = (n4.r) xVar.f16658b;
        MediaSession mediaSession = rVar.f16639a;
        rVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            n4.u uVar = (n4.u) obj2;
            MediaSession.QueueItem queueItem = uVar.f16652c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(uVar.f16650a.a(), uVar.f16651b);
                uVar.f16652c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(n4.x xVar, n4.m mVar) {
        n4.r rVar = (n4.r) xVar.f16658b;
        rVar.f16645i = mVar;
        MediaSession mediaSession = rVar.f16639a;
        Bundle bundle = mVar.f16630a;
        if (mVar.f16631b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) n4.m.f16629c.get(str);
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
                        builder.putText(str, bundle.getString(str));
                    }
                } else {
                    builder.putLong(str, bundle.getLong(str));
                }
            }
            mVar.f16631b = builder.build();
        }
        mediaSession.setMetadata(mVar.f16631b);
    }

    public static b2.k0 F(String str, Uri uri, String str2, Bundle bundle) {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8751b;
        e9.a1 a1Var = e9.a1.f8714e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.f8714e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var2 = b2.g0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        aa.a aVar = new aa.a(4);
        aVar.f385c = uri;
        aVar.f384b = str2;
        aVar.d = bundle;
        return new b2.k0(str3, new b2.z(yVar), null, new b2.e0(d0Var), b2.n0.K, new b2.g0(aVar));
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
    public final void A(long j3) {
        if (j3 < 0) {
            return;
        }
        H(10, new d0(this, j3, 0), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void B() {
        H(3, new c0(this, 6), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    public final n4.f0 G(g1 g1Var) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        long j3;
        float f7;
        Bundle bundle;
        long j10;
        String str;
        int i12;
        long j11;
        b2.u0 W = g1Var.W();
        int i13 = 1;
        if (g1Var.m0(16) && !g1Var.M0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (W == null && !e2.d0.Z(g1Var, this.f16168n)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (W != null) {
            i11 = 7;
        } else {
            int i14 = k.f16148a;
            if (g1Var.W() != null) {
                i10 = 7;
            } else {
                int d = g1Var.d();
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            if (d == 4) {
                                i10 = 1;
                            } else {
                                throw new IllegalArgumentException(hg.c.h(d, "Unrecognized State: "));
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
        b2.x0 a2 = w7.s.a(this.v, g1Var.t());
        long j12 = 128;
        for (int i15 = 0; i15 < a2.f3686a.f3532a.size(); i15++) {
            int a10 = a2.f3686a.a(i15);
            if (a10 != 1) {
                if (a10 != 2) {
                    if (a10 != 3) {
                        if (a10 != 31) {
                            switch (a10) {
                                case 5:
                                    j11 = 256;
                                    continue;
                                case 6:
                                case 7:
                                    j11 = 16;
                                    continue;
                                case 8:
                                case 9:
                                    j11 = 32;
                                    continue;
                                case 10:
                                    j11 = 4096;
                                    continue;
                                case 11:
                                    j11 = 8;
                                    continue;
                                case 12:
                                    j11 = 64;
                                    continue;
                                case 13:
                                    j11 = 4194304;
                                    continue;
                                case 14:
                                    j11 = 2621440;
                                    continue;
                                case 15:
                                    j11 = 262144;
                                    continue;
                                default:
                                    j11 = 0;
                                    continue;
                            }
                        } else {
                            j11 = 240640;
                        }
                    } else {
                        j11 = 1;
                    }
                } else {
                    j11 = 16384;
                }
            } else if (z11) {
                j11 = 516;
            } else {
                j11 = 514;
            }
            j12 |= j11;
        }
        boolean isEmpty = this.f16174t.isEmpty();
        Bundle bundle2 = this.f16172r;
        if (!isEmpty && !bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            j12 &= -17;
        }
        if (!this.f16174t.isEmpty() && !bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            j12 &= -33;
        }
        if (!z10) {
            j12 &= -257;
        }
        long j13 = j12;
        long j14 = -1;
        if (g1Var.m0(17)) {
            int l02 = g1Var.l0();
            int i16 = k.f16148a;
            j3 = l02 == -1 ? -1L : l02;
        } else {
            j3 = -1;
        }
        float f10 = g1Var.h().f3673a;
        if (g1Var.i0() && z10) {
            f7 = f10;
        } else {
            f7 = 0.0f;
        }
        if (W != null) {
            bundle = new Bundle(W.f3670c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(bundle2);
        bundle.putFloat("EXO_SPEED", f10);
        b2.k0 P0 = g1Var.P0();
        if (P0 != null) {
            String str2 = P0.f3399a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z10) {
            j10 = g1Var.J0();
        } else {
            j10 = -1;
        }
        if (z10) {
            j14 = g1Var.c0();
        }
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f16173s.size() <= 0) {
            if (W != null) {
                int i17 = k.f16148a;
                int i18 = W.f3668a;
                if (i18 != -110) {
                    if (i18 != -109) {
                        if (i18 != -6) {
                            if (i18 != -2) {
                                if (i18 != 1) {
                                    switch (i18) {
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
            return new n4.f0(i11, j10, j14, f7, j13, i12, str, elapsedRealtime, arrayList, j3, bundle);
        }
        this.f16173s.get(0).getClass();
        throw new ClassCastException();
    }

    public final void H(int i10, k0 k0Var, n4.z zVar, boolean z10) {
        b0 b0Var = this.f16162g;
        if (b0Var.j()) {
            return;
        }
        if (zVar == null) {
            e2.a.d("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
            return;
        }
        e2.d0.T(b0Var.f16014l, new f0(this, i10, zVar, k0Var, z10));
    }

    public final void I(i1 i1Var, int i10, k0 k0Var, n4.z zVar) {
        if (zVar == null) {
            StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = i1Var;
            if (i1Var == null) {
                obj = Integer.valueOf(i10);
            }
            sb2.append(obj);
            e2.a.d("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        e2.d0.T(this.f16162g.f16014l, new l3(this, i1Var, i10, zVar, k0Var, 5));
    }

    public final void K(b2.k0 k0Var, boolean z10) {
        H(31, new com.google.firebase.messaging.i(this, k0Var, z10, 2), ((n4.r) this.f16165k.f16658b).c(), false);
    }

    public final r L(n4.z zVar) {
        r t10 = this.f16161f.t(zVar);
        if (t10 == null) {
            r rVar = new r(zVar, 0, 0, this.h.b(zVar), new i0(zVar), Bundle.EMPTY);
            p m10 = this.f16162g.m(rVar);
            this.f16161f.b(zVar, rVar, m10.f16235a, m10.f16236b);
            b0 b0Var = this.f16162g;
            if (!b0Var.f16025x || !b0.k(rVar)) {
                b0Var.f16008e.getClass();
            }
            t10 = rVar;
        }
        androidx.mediarouter.app.c cVar = this.f16164j;
        long j3 = this.f16169o;
        cVar.removeMessages(1001, t10);
        cVar.sendMessageDelayed(cVar.obtainMessage(1001, t10), j3);
        return t10;
    }

    public final void M() {
        e9.i0 i0Var = this.f16174t;
        int i10 = a.f16001a;
        e9.q.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (i0Var.size() <= 0) {
            e9.a1 a2 = a.a(e9.i0.t(0, objArr));
            this.f16173s = a2;
            if (a2.size() <= 0) {
                Bundle bundle = this.f16172r;
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                e9.i0 i0Var2 = this.f16173s;
                if (i0Var2.size() <= 0) {
                    bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
                    return;
                } else {
                    i0Var2.get(0).getClass();
                    throw new ClassCastException();
                }
            }
            a2.get(0);
            throw new ClassCastException();
        }
        i0Var.get(0).getClass();
        throw new ClassCastException();
    }

    public final void N(g1 g1Var) {
        e2.d0.T(this.f16162g.f16014l, new g0(this, g1Var, 1));
    }

    @Override
    public final void b(n4.l lVar) {
        if (lVar != null) {
            H(20, new c2(this, lVar, -1, 3), ((n4.r) this.f16165k.f16658b).c(), false);
        }
    }

    @Override
    public final void c(n4.l lVar, int i10) {
        if (lVar != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new c2(this, lVar, i10, 3), ((n4.r) this.f16165k.f16658b).c(), false);
            }
        }
    }

    @Override
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            n1 n1Var = this.f16162g.f16012j;
            n1Var.getClass();
            String str2 = n1.f16210b;
            Bundle bundle2 = new Bundle();
            o1 o1Var = n1Var.f16212a;
            if (o1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = n1.f16211c;
            o1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(o1.f16217i, o1Var.f16227a);
            bundle3.putInt(o1.f16218j, 0);
            bundle3.putInt(o1.f16219k, o1Var.f16228b);
            bundle3.putString(o1.f16220l, o1Var.d);
            bundle3.putString(o1.f16221m, o1Var.f16230e);
            bundle3.putBinder(o1.f16223o, o1Var.f16231f);
            bundle3.putParcelable(o1.f16222n, null);
            bundle3.putBundle(o1.f16224p, o1Var.f16232g);
            bundle3.putInt(o1.f16225q, o1Var.f16229c);
            MediaSession.Token token = o1Var.h;
            if (token != null) {
                bundle3.putParcelable(o1.f16226r, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        i1 i1Var = new i1(str, Bundle.EMPTY);
        I(i1Var, 0, new r5(this, i1Var, bundle, resultReceiver), ((n4.r) this.f16165k.f16658b).c());
    }

    @Override
    public final void e(String str, Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        i1 i1Var = new i1(str, Bundle.EMPTY);
        I(i1Var, 0, new ah.b(this, i1Var, bundle), ((n4.r) this.f16165k.f16658b).c());
    }

    @Override
    public final void f() {
        H(12, new c0(this, 0), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final boolean g(android.content.Intent r13) {
        throw new UnsupportedOperationException("Method not decompiled: m4.l0.g(android.content.Intent):boolean");
    }

    @Override
    public final void h() {
        H(1, new c0(this, 11), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void i() {
        H(1, new c0(this, 10), ((n4.r) this.f16165k.f16658b).c(), false);
    }

    @Override
    public final void j(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true);
    }

    @Override
    public final void k(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true);
    }

    @Override
    public final void l(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true);
    }

    @Override
    public final void m() {
        H(2, new c0(this, 5), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void n(String str, Bundle bundle) {
        K(F(str, null, null, bundle), false);
    }

    @Override
    public final void o(String str, Bundle bundle) {
        K(F(null, null, str, bundle), false);
    }

    @Override
    public final void p(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), false);
    }

    @Override
    public final void q(n4.l lVar) {
        if (lVar == null) {
            return;
        }
        H(20, new ah.b(26, this, lVar), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void r() {
        H(11, new c0(this, 4), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void s(long j3) {
        H(5, new d0(this, j3, 1), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void t(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        H(13, new h0(this, f7), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void u(n4.g0 g0Var) {
        v(g0Var);
    }

    @Override
    public final void v(n4.g0 g0Var) {
        b2.c1 c10 = k.c(g0Var);
        if (c10 == null) {
            e2.a.n("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + g0Var);
            return;
        }
        I(null, 40010, new c0(this, c10), ((n4.r) this.f16165k.f16658b).c());
    }

    @Override
    public final void w(int i10) {
        H(15, new e0(this, i10, 0), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void x(int i10) {
        H(14, new e0(this, i10, 1), ((n4.r) this.f16165k.f16658b).c(), true);
    }

    @Override
    public final void y() {
        boolean m0 = this.f16162g.f16022t.m0(9);
        n4.x xVar = this.f16165k;
        if (m0) {
            H(9, new c0(this, 8), ((n4.r) xVar.f16658b).c(), true);
        } else {
            H(8, new c0(this, 9), ((n4.r) xVar.f16658b).c(), true);
        }
    }

    @Override
    public final void z() {
        boolean m0 = this.f16162g.f16022t.m0(7);
        n4.x xVar = this.f16165k;
        if (m0) {
            H(7, new c0(this, 2), ((n4.r) xVar.f16658b).c(), true);
        } else {
            H(6, new c0(this, 3), ((n4.r) xVar.f16658b).c(), true);
        }
    }
}
