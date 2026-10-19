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
    public b2.r0 f16646a;
    public String f16647b;
    public Uri f16648c;
    public long d;
    public final Object e;

    public n0(p0 p0Var) {
        this.e = p0Var;
        this.f16646a = b2.r0.L;
        this.f16647b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.b1 b1Var) {
        int i11;
        p0 p0Var = (p0) this.e;
        m1 m1Var = p0Var.f16663g.f16536t;
        if (m1Var.o0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (p0Var.f16674s != i11) {
            p0Var.f16674s = i11;
            ((n4.n) p0Var.f16668m.f17127b).f17110a.setFlags(i11 | 3);
        }
        p0Var.O(m1Var);
    }

    @Override
    public void e(int i10, o1 o1Var) {
        Bundle bundle = o1Var.f16660c;
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
        n4.s sVar = ((p0) this.e).f16668m;
        String str = o1Var.f16659b;
        sVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((n4.n) sVar.f17127b).f17110a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void f(int i10, r1 r1Var, boolean z10, boolean z11, int i11) {
        p0 p0Var = (p0) this.e;
        p0Var.O(p0Var.f16663g.f16536t);
    }

    @Override
    public void i(Throwable th2) {
        if (this != ((p0) ((n0) this.e).e).f16673r) {
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void k() {
        b2.f fVar;
        p0 p0Var = (p0) this.e;
        m1 m1Var = p0Var.f16663g.f16536t;
        m1Var.J().getClass();
        n4.s sVar = p0Var.f16668m;
        if (m1Var.o0(21)) {
            fVar = m1Var.H();
        } else {
            fVar = b2.f.f3739i;
        }
        ((n4.n) sVar.f17127b).f17110a.setPlaybackToLocal(fVar.b());
    }

    public void l(b2.o0 o0Var) {
        p0 p0Var = (p0) this.e;
        n4.s sVar = p0Var.f16668m;
        r();
        if (o0Var == null) {
            ((n4.n) sVar.f17127b).f17110a.setRatingType(0);
        } else {
            ((n4.n) sVar.f17127b).f17110a.setRatingType(n.e(o0Var.d.f3959i));
        }
        p0Var.O(p0Var.f16663g.f16536t);
    }

    public void m(int r3, m4.m1 r4, m4.m1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n0.m(int, m4.m1, m4.m1):void");
    }

    public void n(b2.r0 r0Var) {
        p0 p0Var = (p0) this.e;
        n4.s sVar = p0Var.f16668m;
        if (!TextUtils.equals(((n4.f) ((n4.w) sVar.f17128c).f17135a).f17091a.getQueueTitle(), r0Var.f3954a)) {
            ((n4.n) sVar.f17127b).f17110a.setQueueTitle((p0Var.f16678x.a(17) && p0Var.f16663g.f16536t.s().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.s sVar = ((p0) this.e).f16668m;
        int i11 = n.f16645a;
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
        n4.n nVar = (n4.n) sVar.f17127b;
        if (nVar.f17116j != i12) {
            nVar.f17116j = i12;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f17113f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f17113f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                nVar.f17113f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p0 p0Var = (p0) ((n0) this.e).e;
        if (this != p0Var.f16673r) {
            return;
        }
        p0.E(p0Var.f16668m, n.b(this.f16646a, this.f16647b, this.f16648c, this.d, bitmap));
        f0 f0Var = p0Var.f16663g;
        e2.m0.W(f0Var.f16531o, new y(f0Var, 1));
    }

    public void p(boolean z10) {
        n4.s sVar = ((p0) this.e).f16668m;
        int i10 = n.f16645a;
        n4.n nVar = (n4.n) sVar.f17127b;
        if (nVar.f17117k != z10) {
            nVar.f17117k = z10 ? 1 : 0;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f17113f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f17113f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                nVar.f17113f.finishBroadcast();
            }
        }
    }

    public void q(b2.o1 o1Var) {
        s(o1Var);
        r();
    }

    public void r() {
        String str;
        Uri uri;
        long j10;
        Uri uri2;
        b2.r0 r0Var;
        Uri uri3;
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.f16663g;
        m1 m1Var = f0Var.f16536t;
        b2.o0 S0 = m1Var.S0();
        b2.r0 U0 = m1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!m1Var.o0(16) || !m1Var.P0()) && m1Var.o0(16)) {
            j11 = m1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f3888a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f3891f.f3810a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f16646a, U0) && Objects.equals(this.f16647b, str2) && Objects.equals(this.f16648c, uri) && this.d == j11) {
            return;
        }
        this.f16647b = str2;
        this.f16648c = uri;
        this.f16646a = U0;
        this.d = j11;
        j9.y g10 = f0Var.f16529m.g(U0);
        if (g10 != null) {
            p0Var.f16673r = null;
            if (g10.isDone()) {
                try {
                    bitmap = (Bitmap) q8.a(g10);
                } catch (CancellationException | ExecutionException e) {
                    e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j10 = j11;
                uri2 = uri;
                r0Var = U0;
                n0 n0Var = new n0(this, r0Var, str2, uri2, j10);
                str2 = str2;
                p0Var.f16673r = n0Var;
                Handler handler = f0Var.f16528l;
                Objects.requireNonNull(handler);
                g10.a(new j9.u(0, g10, n0Var), new i2.g0(handler, 1));
                p0.E(p0Var.f16668m, n.b(r0Var, str2, uri2, j10, bitmap));
            }
        }
        j10 = j11;
        uri2 = uri;
        r0Var = U0;
        p0.E(p0Var.f16668m, n.b(r0Var, str2, uri2, j10, bitmap));
    }

    public void s(b2.o1 o1Var) {
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.f16663g;
        m1 m1Var = f0Var.f16536t;
        if (p0Var.f16678x.a(17) && m1Var.s().a(17) && !o1Var.p()) {
            int i10 = n.f16645a;
            ArrayList arrayList = new ArrayList();
            b2.n1 n1Var = new b2.n1();
            for (int i11 = 0; i11 < o1Var.o(); i11++) {
                arrayList.add(o1Var.m(i11, n1Var, 0L).f3871c);
            }
            ArrayList arrayList2 = new ArrayList();
            ai.y0 y0Var = new ai.y0(this, new AtomicInteger(0), arrayList, arrayList2, 26);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.o0) arrayList.get(i12)).d.f3961k;
                if (bArr == null) {
                    arrayList2.add(null);
                    y0Var.run();
                } else {
                    j9.y u10 = f0Var.f16529m.u(bArr);
                    arrayList2.add(u10);
                    Handler handler = f0Var.f16528l;
                    Objects.requireNonNull(handler);
                    u10.a(y0Var, new i2.g0(handler, 1));
                }
            }
            return;
        }
        p0.D(p0Var.f16668m, null);
    }

    public n0(n0 n0Var, b2.r0 r0Var, String str, Uri uri, long j10) {
        this.e = n0Var;
        this.f16646a = r0Var;
        this.f16647b = str;
        this.f16648c = uri;
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
    public void h(int i10, k1 k1Var, b2.b1 b1Var, boolean z10, boolean z11) {
    }
}
