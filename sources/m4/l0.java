package m4;

import ai.q5;
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
import gg.d2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public final class l0 extends n4.p {
    public static final int f14605w;
    public final ni.f f14606f;
    public final a0 f14607g;
    public final n4.d0 h;
    public final j0 f14608i;
    public final androidx.mediarouter.app.c f14609j;
    public final n4.y f14610k;
    public final androidx.mediarouter.app.g f14611l;
    public final ComponentName f14612m;
    public final boolean f14613n = true;
    public volatile long f14614o;
    public j0 f14615p;
    public int f14616q;
    public final Bundle f14617r;
    public e9.i0 f14618s;
    public e9.i0 f14619t;
    public i1 f14620u;
    public b2.x0 v;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = 33554432;
        } else {
            i10 = 0;
        }
        f14605w = i10;
    }

    public l0(m4.a0 r10, android.net.Uri r11, android.os.Handler r12, android.os.Bundle r13, e9.i0 r14, e9.i0 r15, m4.i1 r16, b2.x0 r17, android.os.Bundle r18) {
        throw new UnsupportedOperationException("Method not decompiled: m4.l0.<init>(m4.a0, android.net.Uri, android.os.Handler, android.os.Bundle, e9.i0, e9.i0, m4.i1, b2.x0, android.os.Bundle):void");
    }

    public static void D(n4.y yVar, ArrayList arrayList) {
        int i10 = 0;
        if (arrayList != null) {
            yVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                long j3 = ((n4.v) obj).f14962b;
                if (hashSet.contains(Long.valueOf(j3))) {
                    Log.e("MediaSessionCompat", a4.a.p(j3, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j3));
            }
        }
        n4.r rVar = (n4.r) yVar.f14969b;
        MediaSession mediaSession = rVar.f14950a;
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
            n4.v vVar = (n4.v) obj2;
            MediaSession.QueueItem queueItem = vVar.f14963c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(vVar.f14961a.a(), vVar.f14962b);
                vVar.f14963c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(n4.y yVar, n4.m mVar) {
        n4.r rVar = (n4.r) yVar.f14969b;
        rVar.f14955i = mVar;
        MediaSession mediaSession = rVar.f14950a;
        Bundle bundle = mVar.f14942a;
        if (mVar.f14943b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) n4.m.f14941c.get(str);
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
            mVar.f14943b = builder.build();
        }
        mediaSession.setMetadata(mVar.f14943b);
    }

    public static b2.k0 F(String str, Uri uri, String str2, Bundle bundle) {
        b2.y yVar = new b2.y();
        e9.g0 g0Var = e9.i0.f8067b;
        e9.a1 a1Var = e9.a1.e;
        List list = Collections.EMPTY_LIST;
        e9.a1 a1Var2 = e9.a1.e;
        b2.d0 d0Var = new b2.d0();
        b2.g0 g0Var2 = b2.g0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        aa.a aVar = new aa.a(4);
        aVar.f360c = uri;
        aVar.f359b = str2;
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
        H(10, new c0(this, j3, 0), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final void B() {
        H(3, new b0(this, 6), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    public final n4.h0 G(f1 f1Var) {
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
        b2.u0 W = f1Var.W();
        int i13 = 1;
        if (f1Var.m0(16) && !f1Var.M0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (W == null && !e2.d0.a0(f1Var, this.f14613n)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (W != null) {
            i11 = 7;
        } else {
            int i14 = k.f14581a;
            if (f1Var.W() != null) {
                i10 = 7;
            } else {
                int d = f1Var.d();
                if (d != 1) {
                    if (d != 2) {
                        if (d != 3) {
                            if (d == 4) {
                                i10 = 1;
                            } else {
                                throw new IllegalArgumentException(hg.c.i(d, "Unrecognized State: "));
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
        b2.x0 a2 = w7.t.a(this.v, f1Var.t());
        long j12 = 128;
        for (int i15 = 0; i15 < a2.f3341a.f3194a.size(); i15++) {
            int a10 = a2.f3341a.a(i15);
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
        boolean isEmpty = this.f14619t.isEmpty();
        Bundle bundle2 = this.f14617r;
        if (!isEmpty && !bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            j12 &= -17;
        }
        if (!this.f14619t.isEmpty() && !bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            j12 &= -33;
        }
        if (!z10) {
            j12 &= -257;
        }
        long j13 = j12;
        long j14 = -1;
        if (f1Var.m0(17)) {
            int l02 = f1Var.l0();
            int i16 = k.f14581a;
            j3 = l02 == -1 ? -1L : l02;
        } else {
            j3 = -1;
        }
        float f10 = f1Var.h().f3328a;
        if (f1Var.i0() && z10) {
            f7 = f10;
        } else {
            f7 = 0.0f;
        }
        if (W != null) {
            bundle = new Bundle(W.f3326c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(bundle2);
        bundle.putFloat("EXO_SPEED", f10);
        b2.k0 P0 = f1Var.P0();
        if (P0 != null) {
            String str2 = P0.f3069a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z10) {
            j10 = f1Var.J0();
        } else {
            j10 = -1;
        }
        if (z10) {
            j14 = f1Var.c0();
        }
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14618s.size() <= 0) {
            if (W != null) {
                int i17 = k.f14581a;
                int i18 = W.f3324a;
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
            return new n4.h0(i11, j10, j14, f7, j13, i12, str, elapsedRealtime, arrayList, j3, bundle);
        }
        this.f14618s.get(0).getClass();
        throw new ClassCastException();
    }

    public final void H(int i10, k0 k0Var, n4.a0 a0Var, boolean z10) {
        a0 a0Var2 = this.f14607g;
        if (a0Var2.j()) {
            return;
        }
        if (a0Var == null) {
            e2.a.d("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i10);
            return;
        }
        e2.d0.U(a0Var2.f14446l, new e0(this, i10, a0Var, k0Var, z10));
    }

    public final void I(h1 h1Var, int i10, k0 k0Var, n4.a0 a0Var) {
        if (a0Var == null) {
            StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = h1Var;
            if (h1Var == null) {
                obj = Integer.valueOf(i10);
            }
            sb2.append(obj);
            e2.a.d("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        e2.d0.U(this.f14607g.f14446l, new l3(this, h1Var, i10, a0Var, k0Var, 5));
    }

    public final void K(b2.k0 k0Var, boolean z10) {
        H(31, new com.google.firebase.messaging.i(this, k0Var, z10, 2), ((n4.r) this.f14610k.f14969b).c(), false);
    }

    public final r L(n4.a0 a0Var) {
        r t10 = this.f14606f.t(a0Var);
        if (t10 == null) {
            r rVar = new r(a0Var, 0, 0, this.h.b(a0Var), new i0(a0Var), Bundle.EMPTY);
            p m10 = this.f14607g.m(rVar);
            this.f14606f.b(a0Var, rVar, m10.f14658a, m10.f14659b);
            a0 a0Var2 = this.f14607g;
            if (!a0Var2.f14457x || !a0.k(rVar)) {
                a0Var2.e.getClass();
            }
            t10 = rVar;
        }
        androidx.mediarouter.app.c cVar = this.f14609j;
        long j3 = this.f14614o;
        cVar.removeMessages(1001, t10);
        cVar.sendMessageDelayed(cVar.obtainMessage(1001, t10), j3);
        return t10;
    }

    public final void M() {
        e9.i0 i0Var = this.f14619t;
        int i10 = a.f14437a;
        e9.q.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (i0Var.size() <= 0) {
            e9.a1 a2 = a.a(e9.i0.t(0, objArr));
            this.f14618s = a2;
            if (a2.size() <= 0) {
                Bundle bundle = this.f14617r;
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                e9.i0 i0Var2 = this.f14618s;
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

    public final void N(f1 f1Var) {
        e2.d0.U(this.f14607g.f14446l, new f0(this, f1Var, 1));
    }

    @Override
    public final void b(n4.l lVar) {
        if (lVar != null) {
            H(20, new d2(this, lVar, -1, 3), ((n4.r) this.f14610k.f14969b).c(), false);
        }
    }

    @Override
    public final void c(n4.l lVar, int i10) {
        if (lVar != null) {
            if (i10 == -1 || i10 >= 0) {
                H(20, new d2(this, lVar, i10, 3), ((n4.r) this.f14610k.f14969b).c(), false);
            }
        }
    }

    @Override
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            m1 m1Var = this.f14607g.f14444j;
            m1Var.getClass();
            String str2 = m1.f14629b;
            Bundle bundle2 = new Bundle();
            n1 n1Var = m1Var.f14631a;
            if (n1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = m1.f14630c;
            n1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(n1.f14638i, n1Var.f14648a);
            bundle3.putInt(n1.f14639j, 0);
            bundle3.putInt(n1.f14640k, n1Var.f14649b);
            bundle3.putString(n1.f14641l, n1Var.d);
            bundle3.putString(n1.f14642m, n1Var.e);
            bundle3.putBinder(n1.f14644o, n1Var.f14651f);
            bundle3.putParcelable(n1.f14643n, null);
            bundle3.putBundle(n1.f14645p, n1Var.f14652g);
            bundle3.putInt(n1.f14646q, n1Var.f14650c);
            MediaSession.Token token = n1Var.h;
            if (token != null) {
                bundle3.putParcelable(n1.f14647r, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        h1 h1Var = new h1(str, Bundle.EMPTY);
        I(h1Var, 0, new q5(this, h1Var, bundle, resultReceiver), ((n4.r) this.f14610k.f14969b).c());
    }

    @Override
    public final void e(String str, Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        h1 h1Var = new h1(str, Bundle.EMPTY);
        I(h1Var, 0, new ah.b(this, h1Var, bundle), ((n4.r) this.f14610k.f14969b).c());
    }

    @Override
    public final void f() {
        H(12, new b0(this, 0), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final boolean g(android.content.Intent r13) {
        throw new UnsupportedOperationException("Method not decompiled: m4.l0.g(android.content.Intent):boolean");
    }

    @Override
    public final void h() {
        H(1, new b0(this, 11), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final void i() {
        H(1, new b0(this, 10), ((n4.r) this.f14610k.f14969b).c(), false);
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
        H(2, new b0(this, 5), ((n4.r) this.f14610k.f14969b).c(), true);
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
        H(20, new ah.b(24, this, lVar), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final void r() {
        H(11, new b0(this, 4), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final void s(long j3) {
        H(5, new c0(this, j3, 1), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final void t(float f7) {
        if (f7 <= 0.0f) {
            return;
        }
        H(13, new h0(this, f7), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final void u(n4.i0 i0Var) {
        v(i0Var);
    }

    @Override
    public final void v(n4.i0 i0Var) {
        b2.c1 c10 = k.c(i0Var);
        if (c10 == null) {
            e2.a.n("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + i0Var);
            return;
        }
        I(null, 40010, new b0(this, c10), ((n4.r) this.f14610k.f14969b).c());
    }

    @Override
    public final void w(int i10) {
        H(15, new d0(this, i10, 0), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final void x(int i10) {
        H(14, new d0(this, i10, 1), ((n4.r) this.f14610k.f14969b).c(), true);
    }

    @Override
    public final void y() {
        boolean m0 = this.f14607g.f14454t.m0(9);
        n4.y yVar = this.f14610k;
        if (m0) {
            H(9, new b0(this, 8), ((n4.r) yVar.f14969b).c(), true);
        } else {
            H(8, new b0(this, 9), ((n4.r) yVar.f14969b).c(), true);
        }
    }

    @Override
    public final void z() {
        boolean m0 = this.f14607g.f14454t.m0(7);
        n4.y yVar = this.f14610k;
        if (m0) {
            H(7, new b0(this, 2), ((n4.r) yVar.f14969b).c(), true);
        } else {
            H(6, new b0(this, 3), ((n4.r) yVar.f14969b).c(), true);
        }
    }
}
