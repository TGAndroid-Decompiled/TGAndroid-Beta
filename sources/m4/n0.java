package m4;

import a8.qd;
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
public final class n0 implements k9.t, v {
    public b2.s0 f18166a;
    public String f18167b;
    public Uri f18168c;
    public long d;
    public final Object e;

    public n0(p0 p0Var) {
        this.e = p0Var;
        this.f18166a = b2.s0.L;
        this.f18167b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.c1 c1Var) {
        int i11;
        p0 p0Var = (p0) this.e;
        n1 n1Var = p0Var.f18181g.f18057t;
        if (n1Var.o0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (p0Var.f18192s != i11) {
            p0Var.f18192s = i11;
            ((n4.n) p0Var.f18186m.f18696b).f18679a.setFlags(i11 | 3);
        }
        p0Var.O(n1Var);
    }

    @Override
    public void e(int i10, p1 p1Var) {
        Bundle bundle = p1Var.f18201c;
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
        n4.s sVar = ((p0) this.e).f18186m;
        String str = p1Var.f18200b;
        sVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((n4.n) sVar.f18696b).f18679a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void f(int i10, s1 s1Var, boolean z10, boolean z11, int i11) {
        p0 p0Var = (p0) this.e;
        p0Var.O(p0Var.f18181g.f18057t);
    }

    @Override
    public void i(Throwable th2) {
        if (this != ((p0) ((n0) this.e).e).f18191r) {
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void k() {
        b2.f fVar;
        p0 p0Var = (p0) this.e;
        n1 n1Var = p0Var.f18181g.f18057t;
        n1Var.J().getClass();
        n4.s sVar = p0Var.f18186m;
        if (n1Var.o0(21)) {
            fVar = n1Var.H();
        } else {
            fVar = b2.f.f3180i;
        }
        ((n4.n) sVar.f18696b).f18679a.setPlaybackToLocal(fVar.b());
    }

    public void l(b2.p0 p0Var) {
        p0 p0Var2 = (p0) this.e;
        n4.s sVar = p0Var2.f18186m;
        r();
        if (p0Var == null) {
            ((n4.n) sVar.f18696b).f18679a.setRatingType(0);
        } else {
            ((n4.n) sVar.f18696b).f18679a.setRatingType(o.e(p0Var.d.f3415i));
        }
        p0Var2.O(p0Var2.f18181g.f18057t);
    }

    public void m(int r3, m4.n1 r4, m4.n1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n0.m(int, m4.n1, m4.n1):void");
    }

    public void n(b2.s0 s0Var) {
        p0 p0Var = (p0) this.e;
        n4.s sVar = p0Var.f18186m;
        if (!TextUtils.equals(((n4.f) ((n4.w) sVar.f18697c).f18704a).f18660a.getQueueTitle(), s0Var.f3410a)) {
            ((n4.n) sVar.f18696b).f18679a.setQueueTitle((p0Var.f18196x.a(17) && p0Var.f18181g.f18057t.s().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.s sVar = ((p0) this.e).f18186m;
        int i11 = o.f18171a;
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
        n4.n nVar = (n4.n) sVar.f18696b;
        if (nVar.f18685j != i12) {
            nVar.f18685j = i12;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f18682f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f18682f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                nVar.f18682f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p0 p0Var = (p0) ((n0) this.e).e;
        if (this != p0Var.f18191r) {
            return;
        }
        p0.E(p0Var.f18186m, o.b(this.f18166a, this.f18167b, this.f18168c, this.d, bitmap));
        f0 f0Var = p0Var.f18181g;
        e2.n0.W(f0Var.f18052o, new z(f0Var, 1));
    }

    public void p(boolean z10) {
        n4.s sVar = ((p0) this.e).f18186m;
        int i10 = o.f18171a;
        n4.n nVar = (n4.n) sVar.f18696b;
        if (nVar.f18686k != z10) {
            nVar.f18686k = z10 ? 1 : 0;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f18682f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f18682f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                nVar.f18682f.finishBroadcast();
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
        f0 f0Var = p0Var.f18181g;
        n1 n1Var = f0Var.f18057t;
        b2.p0 S0 = n1Var.S0();
        b2.s0 U0 = n1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!n1Var.o0(16) || !n1Var.P0()) && n1Var.o0(16)) {
            j11 = n1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f3344a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f3347f.f3266a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f18166a, U0) && Objects.equals(this.f18167b, str2) && Objects.equals(this.f18168c, uri) && this.d == j11) {
            return;
        }
        this.f18167b = str2;
        this.f18168c = uri;
        this.f18166a = U0;
        this.d = j11;
        k9.y t10 = f0Var.f18050m.t(U0);
        if (t10 != null) {
            p0Var.f18191r = null;
            if (t10.isDone()) {
                try {
                    bitmap = (Bitmap) qd.a(t10);
                } catch (CancellationException | ExecutionException e) {
                    e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j10 = j11;
                uri2 = uri;
                s0Var = U0;
                n0 n0Var = new n0(this, s0Var, str2, uri2, j10);
                str2 = str2;
                p0Var.f18191r = n0Var;
                Handler handler = f0Var.f18049l;
                Objects.requireNonNull(handler);
                t10.a(new k9.u(0, t10, n0Var), new i2.h0(handler, 1));
                p0.E(p0Var.f18186m, o.b(s0Var, str2, uri2, j10, bitmap));
            }
        }
        j10 = j11;
        uri2 = uri;
        s0Var = U0;
        p0.E(p0Var.f18186m, o.b(s0Var, str2, uri2, j10, bitmap));
    }

    public void s(b2.p1 p1Var) {
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.f18181g;
        n1 n1Var = f0Var.f18057t;
        if (p0Var.f18196x.a(17) && n1Var.s().a(17) && !p1Var.p()) {
            int i10 = o.f18171a;
            ArrayList arrayList = new ArrayList();
            b2.o1 o1Var = new b2.o1();
            for (int i11 = 0; i11 < p1Var.o(); i11++) {
                arrayList.add(p1Var.m(i11, o1Var, 0L).f3327c);
            }
            ArrayList arrayList2 = new ArrayList();
            ai.e0 e0Var = new ai.e0(this, new AtomicInteger(0), arrayList, arrayList2, 29);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.p0) arrayList.get(i12)).d.f3417k;
                if (bArr == null) {
                    arrayList2.add(null);
                    e0Var.run();
                } else {
                    k9.y H = f0Var.f18050m.H(bArr);
                    arrayList2.add(H);
                    Handler handler = f0Var.f18049l;
                    Objects.requireNonNull(handler);
                    H.a(e0Var, new i2.h0(handler, 1));
                }
            }
            return;
        }
        p0.D(p0Var.f18186m, null);
    }

    public n0(n0 n0Var, b2.s0 s0Var, String str, Uri uri, long j10) {
        this.e = n0Var;
        this.f18166a = s0Var;
        this.f18167b = str;
        this.f18168c = uri;
        this.d = j10;
    }

    @Override
    public void g() {
    }

    @Override
    public void b(int i10) {
    }

    @Override
    public void a(int i10, p pVar) {
    }

    @Override
    public void j(int i10, t1 t1Var) {
    }

    @Override
    public void d(int i10, int i11, int i12) {
    }

    @Override
    public void h(int i10, l1 l1Var, b2.c1 c1Var, boolean z10, boolean z11) {
    }
}
