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
import m.f3;
import v7.j8;
public final class k0 implements i9.r, q {
    public b2.n0 f15870a;
    public String f15871b;
    public Uri f15872c;
    public long d;
    public final Object f15873e;

    public k0(m0 m0Var) {
        this.f15873e = m0Var;
        this.f15870a = b2.n0.K;
        this.f15871b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.x0 x0Var) {
        int i11;
        m0 m0Var = (m0) this.f15873e;
        g1 g1Var = m0Var.f15906g.f15749t;
        if (g1Var.n0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (m0Var.f15915q != i11) {
            m0Var.f15915q = i11;
            ((n4.s) m0Var.f15909k.f16363b).f16344a.setFlags(i11 | 3);
        }
        m0Var.N(g1Var);
    }

    @Override
    public void d(int i10, i1 i1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.y yVar = ((m0) this.f15873e).f15909k;
        String str = i1Var.f15864b;
        yVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((n4.s) yVar.f16363b).f16344a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void e(int i10, l1 l1Var, boolean z10, boolean z11, int i11) {
        m0 m0Var = (m0) this.f15873e;
        m0Var.N(m0Var.f15906g.f15749t);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((m0) ((k0) this.f15873e).f15873e).f15914p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        m0 m0Var = (m0) this.f15873e;
        m0Var.f15906g.f15749t.K().getClass();
        int e7 = k.e(eVar);
        n4.s sVar = (n4.s) m0Var.f15909k.f16363b;
        sVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e7);
        sVar.f16344a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        b2.e eVar;
        m0 m0Var = (m0) this.f15873e;
        g1 g1Var = m0Var.f15906g.f15749t;
        g1Var.K().getClass();
        if (g1Var.n0(21)) {
            eVar = g1Var.I();
        } else {
            eVar = b2.e.h;
        }
        int e7 = k.e(eVar);
        n4.s sVar = (n4.s) m0Var.f15909k.f16363b;
        sVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e7);
        sVar.f16344a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        m0 m0Var = (m0) this.f15873e;
        n4.y yVar = m0Var.f15909k;
        r();
        if (k0Var == null) {
            ((n4.s) yVar.f16363b).f16344a.setRatingType(0);
        } else {
            ((n4.s) yVar.f16363b).f16344a.setRatingType(k.f(k0Var.d.f3473i));
        }
        m0Var.N(m0Var.f15906g.f15749t);
    }

    public void m(int r3, m4.g1 r4, m4.g1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.k0.m(int, m4.g1, m4.g1):void");
    }

    public void n(b2.n0 n0Var) {
        m0 m0Var = (m0) this.f15873e;
        n4.y yVar = m0Var.f15909k;
        if (!TextUtils.equals(((n4.j) ((n4.l) yVar.f16364c).f16326a).f16322a.getQueueTitle(), n0Var.f3467a)) {
            ((n4.s) yVar.f16363b).f16344a.setQueueTitle((m0Var.v.a(17) && m0Var.f15906g.f15749t.t().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.y yVar = ((m0) this.f15873e).f15909k;
        int i11 = k.f15869a;
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
        n4.s sVar = (n4.s) yVar.f16363b;
        if (sVar.f16351j != i12) {
            sVar.f16351j = i12;
            synchronized (sVar.d) {
                for (int beginBroadcast = sVar.f16348f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) sVar.f16348f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e7) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e7);
                    }
                }
                sVar.f16348f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        m0 m0Var = (m0) ((k0) this.f15873e).f15873e;
        if (this != m0Var.f15914p) {
            return;
        }
        m0.E(m0Var.f15909k, k.b(this.f15870a, this.f15871b, this.f15872c, this.d, bitmap));
        c0 c0Var = m0Var.f15906g;
        e2.d0.T(c0Var.f15744o, new u(c0Var, 1));
    }

    public void p(boolean z10) {
        n4.y yVar = ((m0) this.f15873e).f15909k;
        int i10 = k.f15869a;
        n4.s sVar = (n4.s) yVar.f16363b;
        if (sVar.f16352k != z10) {
            sVar.f16352k = z10 ? 1 : 0;
            synchronized (sVar.d) {
                for (int beginBroadcast = sVar.f16348f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) sVar.f16348f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e7) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e7);
                    }
                }
                sVar.f16348f.finishBroadcast();
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
        m0 m0Var = (m0) this.f15873e;
        c0 c0Var = m0Var.f15906g;
        g1 g1Var = c0Var.f15749t;
        b2.k0 P0 = g1Var.P0();
        b2.n0 R0 = g1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!g1Var.n0(16) || !g1Var.M0()) && g1Var.n0(16)) {
            j10 = g1Var.getDuration();
        }
        if (P0 != null) {
            str = P0.f3397a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (P0 != null && (uri4 = P0.f3401f.f3316a) != null) {
            uri = uri4;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f15870a, R0) && Objects.equals(this.f15871b, str2) && Objects.equals(this.f15872c, uri) && this.d == j10) {
            return;
        }
        this.f15871b = str2;
        this.f15872c = uri;
        this.f15870a = R0;
        this.d = j10;
        n4.y yVar = c0Var.f15742m;
        yVar.getClass();
        byte[] bArr = R0.f3475k;
        if (bArr != null) {
            wVar = yVar.g(bArr);
        } else {
            Uri uri5 = R0.f3477m;
            if (uri5 != null) {
                f3 f3Var = (f3) yVar.f16364c;
                if (f3Var != null && (uri2 = (Uri) f3Var.f15425c) != null && uri2.equals(uri5)) {
                    wVar = (i9.w) ((f3) yVar.f16364c).d;
                    e2.d.h(wVar);
                } else {
                    g2.i iVar = (g2.i) yVar.f16363b;
                    i9.w a2 = ((i9.y) iVar.f10249a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    yVar.f16364c = new f3(uri5, a2);
                    wVar = a2;
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            m0Var.f15914p = null;
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
                k0 k0Var = new k0(this, n0Var, str2, uri3, j3);
                str2 = str2;
                m0Var.f15914p = k0Var;
                Handler handler = c0Var.f15741l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, k0Var), new k2.a0(handler, 0));
                m0.E(m0Var.f15909k, k.b(n0Var, str2, uri3, j3, bitmap));
            }
        }
        j3 = j10;
        uri3 = uri;
        n0Var = R0;
        m0.E(m0Var.f15909k, k.b(n0Var, str2, uri3, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        m0 m0Var = (m0) this.f15873e;
        c0 c0Var = m0Var.f15906g;
        g1 g1Var = c0Var.f15749t;
        if (m0Var.v.a(17) && g1Var.t().a(17) && !k1Var.p()) {
            int i10 = k.f15869a;
            ArrayList arrayList = new ArrayList();
            b2.j1 j1Var = new b2.j1();
            for (int i11 = 0; i11 < k1Var.o(); i11++) {
                arrayList.add(k1Var.m(i11, j1Var, 0L).f3379c);
            }
            ArrayList arrayList2 = new ArrayList();
            i5 i5Var = new i5(this, new AtomicInteger(0), arrayList, arrayList2, 21);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.k0) arrayList.get(i12)).d.f3475k;
                if (bArr == null) {
                    arrayList2.add(null);
                    i5Var.run();
                } else {
                    i9.w g10 = c0Var.f15742m.g(bArr);
                    arrayList2.add(g10);
                    Handler handler = c0Var.f15741l;
                    Objects.requireNonNull(handler);
                    g10.a(i5Var, new k2.a0(handler, 0));
                }
            }
            return;
        }
        m0.D(m0Var.f15909k, null);
    }

    public k0(k0 k0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.f15873e = k0Var;
        this.f15870a = n0Var;
        this.f15871b = str;
        this.f15872c = uri;
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
