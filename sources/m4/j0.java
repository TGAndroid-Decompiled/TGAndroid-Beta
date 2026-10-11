package m4;

import ai.i5;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import v7.j8;
public final class j0 implements i9.r, q {
    public b2.n0 f16178a;
    public String f16179b;
    public Uri f16180c;
    public long d;
    public final Object f16181e;

    public j0(l0 l0Var) {
        this.f16181e = l0Var;
        this.f16178a = b2.n0.K;
        this.f16179b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.x0 x0Var) {
        int i11;
        l0 l0Var = (l0) this.f16181e;
        g1 g1Var = l0Var.f16198g.f16058t;
        if (g1Var.m0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (l0Var.f16207q != i11) {
            l0Var.f16207q = i11;
            ((n4.r) l0Var.f16201k.f16694b).f16675a.setFlags(i11 | 3);
        }
        l0Var.N(g1Var);
    }

    @Override
    public void d(int i10, i1 i1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.x xVar = ((l0) this.f16181e).f16201k;
        String str = i1Var.f16176b;
        xVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((n4.r) xVar.f16694b).f16675a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void e(int i10, l1 l1Var, boolean z10, boolean z11, int i11) {
        l0 l0Var = (l0) this.f16181e;
        l0Var.N(l0Var.f16198g.f16058t);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((l0) ((j0) this.f16181e).f16181e).f16206p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        l0 l0Var = (l0) this.f16181e;
        l0Var.f16198g.f16058t.K().getClass();
        int e7 = k.e(eVar);
        n4.r rVar = (n4.r) l0Var.f16201k.f16694b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e7);
        rVar.f16675a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        b2.e eVar;
        l0 l0Var = (l0) this.f16181e;
        g1 g1Var = l0Var.f16198g.f16058t;
        g1Var.K().getClass();
        if (g1Var.m0(21)) {
            eVar = g1Var.I();
        } else {
            eVar = b2.e.h;
        }
        int e7 = k.e(eVar);
        n4.r rVar = (n4.r) l0Var.f16201k.f16694b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e7);
        rVar.f16675a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        l0 l0Var = (l0) this.f16181e;
        n4.x xVar = l0Var.f16201k;
        r();
        if (k0Var == null) {
            ((n4.r) xVar.f16694b).f16675a.setRatingType(0);
        } else {
            ((n4.r) xVar.f16694b).f16675a.setRatingType(k.f(k0Var.d.f3475i));
        }
        l0Var.N(l0Var.f16198g.f16058t);
    }

    public void m(int r3, m4.g1 r4, m4.g1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.j0.m(int, m4.g1, m4.g1):void");
    }

    public void n(b2.n0 n0Var) {
        l0 l0Var = (l0) this.f16181e;
        n4.x xVar = l0Var.f16201k;
        if (!TextUtils.equals(((n4.j) ((m2.t) xVar.f16695c).f16033b).f16654a.getQueueTitle(), n0Var.f3469a)) {
            ((n4.r) xVar.f16694b).f16675a.setQueueTitle((l0Var.v.a(17) && l0Var.f16198g.f16058t.t().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.x xVar = ((l0) this.f16181e).f16201k;
        int i11 = k.f16184a;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    e2.a.n("LegacyConversions", "Unrecognized RepeatMode: " + i10 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    i12 = 2;
                }
            } else {
                i12 = 1;
            }
        }
        n4.r rVar = (n4.r) xVar.f16694b;
        if (rVar.f16682j != i12) {
            rVar.f16682j = i12;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f16679f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f16679f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e7) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e7);
                    }
                }
                rVar.f16679f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        l0 l0Var = (l0) ((j0) this.f16181e).f16181e;
        if (this != l0Var.f16206p) {
            return;
        }
        l0.E(l0Var.f16201k, k.b(this.f16178a, this.f16179b, this.f16180c, this.d, bitmap));
        b0 b0Var = l0Var.f16198g;
        e2.d0.T(b0Var.f16053o, new u(b0Var, 1));
    }

    public void p(boolean z10) {
        n4.x xVar = ((l0) this.f16181e).f16201k;
        int i10 = k.f16184a;
        n4.r rVar = (n4.r) xVar.f16694b;
        if (rVar.f16683k != z10) {
            rVar.f16683k = z10 ? 1 : 0;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f16679f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f16679f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e7) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e7);
                    }
                }
                rVar.f16679f.finishBroadcast();
            }
        }
    }

    public void q(b2.k1 k1Var) {
        s(k1Var);
        r();
    }

    public void r() {
        String str;
        Uri uri;
        i9.w wVar;
        Uri uri2;
        long j3;
        Uri uri3;
        b2.n0 n0Var;
        Uri uri4;
        l0 l0Var = (l0) this.f16181e;
        b0 b0Var = l0Var.f16198g;
        g1 g1Var = b0Var.f16058t;
        b2.k0 P0 = g1Var.P0();
        b2.n0 R0 = g1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!g1Var.m0(16) || !g1Var.M0()) && g1Var.m0(16)) {
            j10 = g1Var.getDuration();
        }
        if (P0 != null) {
            str = P0.f3399a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (P0 != null && (uri4 = P0.f3403f.f3318a) != null) {
            uri = uri4;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f16178a, R0) && Objects.equals(this.f16179b, str2) && Objects.equals(this.f16180c, uri) && this.d == j10) {
            return;
        }
        this.f16179b = str2;
        this.f16180c = uri;
        this.f16178a = R0;
        this.d = j10;
        n4.x xVar = b0Var.f16051m;
        xVar.getClass();
        byte[] bArr = R0.f3477k;
        if (bArr != null) {
            wVar = xVar.g(bArr);
        } else {
            Uri uri5 = R0.f3479m;
            if (uri5 != null) {
                la.h hVar = (la.h) xVar.f16695c;
                if (hVar != null && (uri2 = (Uri) hVar.f15502c) != null && uri2.equals(uri5)) {
                    wVar = (i9.w) ((la.h) xVar.f16695c).d;
                    e2.d.h(wVar);
                } else {
                    g2.i iVar = (g2.i) xVar.f16694b;
                    i9.w a2 = ((i9.y) iVar.f10250a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    xVar.f16695c = new la.h(uri5, a2);
                    wVar = a2;
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            l0Var.f16206p = null;
            if (wVar.isDone()) {
                try {
                    bitmap = (Bitmap) j8.a(wVar);
                } catch (CancellationException | ExecutionException e7) {
                    e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + e7.getMessage());
                }
            } else {
                j3 = j10;
                uri3 = uri;
                n0Var = R0;
                j0 j0Var = new j0(this, n0Var, str2, uri3, j3);
                str2 = str2;
                l0Var.f16206p = j0Var;
                Handler handler = b0Var.f16050l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, j0Var), new k2.a0(handler, 0));
                l0.E(l0Var.f16201k, k.b(n0Var, str2, uri3, j3, bitmap));
            }
        }
        j3 = j10;
        uri3 = uri;
        n0Var = R0;
        l0.E(l0Var.f16201k, k.b(n0Var, str2, uri3, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        l0 l0Var = (l0) this.f16181e;
        b0 b0Var = l0Var.f16198g;
        g1 g1Var = b0Var.f16058t;
        if (l0Var.v.a(17) && g1Var.t().a(17) && !k1Var.p()) {
            int i10 = k.f16184a;
            ArrayList arrayList = new ArrayList();
            b2.j1 j1Var = new b2.j1();
            for (int i11 = 0; i11 < k1Var.o(); i11++) {
                arrayList.add(k1Var.m(i11, j1Var, 0L).f3381c);
            }
            ArrayList arrayList2 = new ArrayList();
            i5 i5Var = new i5(this, new AtomicInteger(0), arrayList, arrayList2, 22);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.k0) arrayList.get(i12)).d.f3477k;
                if (bArr == null) {
                    arrayList2.add(null);
                    i5Var.run();
                } else {
                    i9.w g10 = b0Var.f16051m.g(bArr);
                    arrayList2.add(g10);
                    Handler handler = b0Var.f16050l;
                    Objects.requireNonNull(handler);
                    g10.a(i5Var, new k2.a0(handler, 0));
                }
            }
            return;
        }
        l0.D(l0Var.f16201k, null);
    }

    public j0(j0 j0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.f16181e = j0Var;
        this.f16178a = n0Var;
        this.f16179b = str;
        this.f16180c = uri;
        this.d = j3;
    }

    @Override
    public void f() {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void a(int i10, l lVar) {
    }

    @Override
    public void i(int i10, m1 m1Var) {
    }

    @Override
    public void g(int i10, e1 e1Var, b2.x0 x0Var, boolean z10, boolean z11) {
    }
}
