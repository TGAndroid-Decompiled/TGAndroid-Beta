package m4;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import v7.q8;
public final class n0 implements j9.t, u {
    public b2.s0 f15286a;
    public String f15287b;
    public Uri f15288c;
    public long d;
    public final Object e;

    public n0(p0 p0Var) {
        this.e = p0Var;
        this.f15286a = b2.s0.L;
        this.f15287b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.c1 c1Var) {
        int i11;
        p0 p0Var = (p0) this.e;
        m1 m1Var = p0Var.f15303g.f15170t;
        if (m1Var.o0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (p0Var.f15314s != i11) {
            p0Var.f15314s = i11;
            ((n4.n) p0Var.f15308m.f15745b).f15728a.setFlags(i11 | 3);
        }
        p0Var.O(m1Var);
    }

    @Override
    public void e(int i10, o1 o1Var) {
        Bundle bundle = o1Var.f15300c;
        Bundle bundle2 = Bundle.EMPTY;
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        n4.s sVar = ((p0) this.e).f15308m;
        String str = o1Var.f15299b;
        sVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((n4.n) sVar.f15745b).f15728a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void f(int i10, r1 r1Var, boolean z10, boolean z11, int i11) {
        p0 p0Var = (p0) this.e;
        p0Var.O(p0Var.f15303g.f15170t);
    }

    @Override
    public void i(Throwable th2) {
        if (this != ((p0) ((n0) this.e).e).f15313r) {
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void k() {
        b2.f fVar;
        p0 p0Var = (p0) this.e;
        m1 m1Var = p0Var.f15303g.f15170t;
        m1Var.J().getClass();
        n4.s sVar = p0Var.f15308m;
        if (m1Var.o0(21)) {
            fVar = m1Var.H();
        } else {
            fVar = b2.f.f2117i;
        }
        ((n4.n) sVar.f15745b).f15728a.setPlaybackToLocal(fVar.b());
    }

    public void l(b2.p0 p0Var) {
        p0 p0Var2 = (p0) this.e;
        n4.s sVar = p0Var2.f15308m;
        r();
        if (p0Var == null) {
            ((n4.n) sVar.f15745b).f15728a.setRatingType(0);
        } else {
            ((n4.n) sVar.f15745b).f15728a.setRatingType(n.e(p0Var.d.f2352i));
        }
        p0Var2.O(p0Var2.f15303g.f15170t);
    }

    public void m(int r3, m4.m1 r4, m4.m1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n0.m(int, m4.m1, m4.m1):void");
    }

    public void n(b2.s0 s0Var) {
        p0 p0Var = (p0) this.e;
        n4.s sVar = p0Var.f15308m;
        if (!TextUtils.equals(((n4.f) ((n4.w) sVar.f15746c).f15753a).f15709a.getQueueTitle(), s0Var.f2347a)) {
            ((n4.n) sVar.f15745b).f15728a.setQueueTitle((p0Var.f15318x.a(17) && p0Var.f15303g.f15170t.s().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.s sVar = ((p0) this.e).f15308m;
        int i11 = n.f15285a;
        int i12 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    e2.a.l("LegacyConversions", "Unrecognized RepeatMode: " + i10 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    i12 = 2;
                }
            } else {
                i12 = 1;
            }
        }
        n4.n nVar = (n4.n) sVar.f15745b;
        if (nVar.f15734j != i12) {
            nVar.f15734j = i12;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f15731f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f15731f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                nVar.f15731f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p0 p0Var = (p0) ((n0) this.e).e;
        if (this != p0Var.f15313r) {
            return;
        }
        p0.E(p0Var.f15308m, n.b(this.f15286a, this.f15287b, this.f15288c, this.d, bitmap));
        e0 e0Var = p0Var.f15303g;
        e2.m0.W(e0Var.f15165o, new y(e0Var, 1));
    }

    public void p(boolean z10) {
        n4.s sVar = ((p0) this.e).f15308m;
        int i10 = n.f15285a;
        n4.n nVar = (n4.n) sVar.f15745b;
        if (nVar.f15735k != z10) {
            nVar.f15735k = z10 ? 1 : 0;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f15731f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f15731f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                nVar.f15731f.finishBroadcast();
            }
        }
    }

    public void q(b2.p1 p1Var) {
        s(p1Var);
        r();
    }

    public void r() {
        String str;
        Uri uri;
        long j10;
        Uri uri2;
        b2.s0 s0Var;
        Uri uri3;
        p0 p0Var = (p0) this.e;
        e0 e0Var = p0Var.f15303g;
        m1 m1Var = e0Var.f15170t;
        b2.p0 S0 = m1Var.S0();
        b2.s0 U0 = m1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!m1Var.o0(16) || !m1Var.P0()) && m1Var.o0(16)) {
            j11 = m1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f2281a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f2284f.f2203a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f15286a, U0) && Objects.equals(this.f15287b, str2) && Objects.equals(this.f15288c, uri) && this.d == j11) {
            return;
        }
        this.f15287b = str2;
        this.f15288c = uri;
        this.f15286a = U0;
        this.d = j11;
        j9.y o10 = e0Var.f15163m.o(U0);
        if (o10 != null) {
            p0Var.f15313r = null;
            if (o10.isDone()) {
                try {
                    bitmap = (Bitmap) q8.a(o10);
                } catch (CancellationException | ExecutionException e) {
                    e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j10 = j11;
                uri2 = uri;
                s0Var = U0;
                n0 n0Var = new n0(this, s0Var, str2, uri2, j10);
                str2 = str2;
                p0Var.f15313r = n0Var;
                Handler handler = e0Var.f15162l;
                Objects.requireNonNull(handler);
                o10.a(new j9.u(0, o10, n0Var), new i2.f0(handler, 1));
                p0.E(p0Var.f15308m, n.b(s0Var, str2, uri2, j10, bitmap));
            }
        }
        j10 = j11;
        uri2 = uri;
        s0Var = U0;
        p0.E(p0Var.f15308m, n.b(s0Var, str2, uri2, j10, bitmap));
    }

    public void s(b2.p1 p1Var) {
        p0 p0Var = (p0) this.e;
        e0 e0Var = p0Var.f15303g;
        m1 m1Var = e0Var.f15170t;
        if (p0Var.f15318x.a(17) && m1Var.s().a(17) && !p1Var.p()) {
            int i10 = n.f15285a;
            ArrayList arrayList = new ArrayList();
            b2.o1 o1Var = new b2.o1();
            for (int i11 = 0; i11 < p1Var.o(); i11++) {
                arrayList.add(p1Var.m(i11, o1Var, 0L).f2264c);
            }
            ArrayList arrayList2 = new ArrayList();
            androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(this, new AtomicInteger(0), arrayList, arrayList2, 20);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.p0) arrayList.get(i12)).d.f2354k;
                if (bArr == null) {
                    arrayList2.add(null);
                    bVar.run();
                } else {
                    j9.y u10 = e0Var.f15163m.u(bArr);
                    arrayList2.add(u10);
                    Handler handler = e0Var.f15162l;
                    Objects.requireNonNull(handler);
                    u10.a(bVar, new i2.f0(handler, 1));
                }
            }
            return;
        }
        p0.D(p0Var.f15308m, null);
    }

    public n0(n0 n0Var, b2.s0 s0Var, String str, Uri uri, long j10) {
        this.e = n0Var;
        this.f15286a = s0Var;
        this.f15287b = str;
        this.f15288c = uri;
        this.d = j10;
    }

    @Override
    public void g() {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void a(int i10, o oVar) {
    }

    @Override
    public void j(int i10, s1 s1Var) {
    }

    @Override
    public void d(int i10, int i11, int i12) {
    }

    @Override
    public void h(int i10, k1 k1Var, b2.c1 c1Var, boolean z10, boolean z11) {
    }
}
