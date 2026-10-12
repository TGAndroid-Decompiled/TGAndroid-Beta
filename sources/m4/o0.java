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
public final class o0 implements j9.t, v {
    public b2.s0 f15556a;
    public String f15557b;
    public Uri f15558c;
    public long d;
    public final Object e;

    public o0(q0 q0Var) {
        this.e = q0Var;
        this.f15556a = b2.s0.L;
        this.f15557b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.c1 c1Var) {
        int i11;
        q0 q0Var = (q0) this.e;
        n1 n1Var = q0Var.f15573g.f15440t;
        if (n1Var.o0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (q0Var.f15584s != i11) {
            q0Var.f15584s = i11;
            ((n4.n) q0Var.f15578m.f16031b).f16014a.setFlags(i11 | 3);
        }
        q0Var.O(n1Var);
    }

    @Override
    public void e(int i10, p1 p1Var) {
        Bundle bundle = p1Var.f15570c;
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
        n4.s sVar = ((q0) this.e).f15578m;
        String str = p1Var.f15569b;
        sVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((n4.n) sVar.f16031b).f16014a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void f(int i10, s1 s1Var, boolean z10, boolean z11, int i11) {
        q0 q0Var = (q0) this.e;
        q0Var.O(q0Var.f15573g.f15440t);
    }

    @Override
    public void i(Throwable th2) {
        if (this != ((q0) ((o0) this.e).e).f15583r) {
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void k() {
        b2.f fVar;
        q0 q0Var = (q0) this.e;
        n1 n1Var = q0Var.f15573g.f15440t;
        n1Var.J().getClass();
        n4.s sVar = q0Var.f15578m;
        if (n1Var.o0(21)) {
            fVar = n1Var.H();
        } else {
            fVar = b2.f.f2113i;
        }
        ((n4.n) sVar.f16031b).f16014a.setPlaybackToLocal(fVar.b());
    }

    public void l(b2.p0 p0Var) {
        q0 q0Var = (q0) this.e;
        n4.s sVar = q0Var.f15578m;
        r();
        if (p0Var == null) {
            ((n4.n) sVar.f16031b).f16014a.setRatingType(0);
        } else {
            ((n4.n) sVar.f16031b).f16014a.setRatingType(o.e(p0Var.d.f2348i));
        }
        q0Var.O(q0Var.f15573g.f15440t);
    }

    public void m(int r3, m4.n1 r4, m4.n1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.o0.m(int, m4.n1, m4.n1):void");
    }

    public void n(b2.s0 s0Var) {
        q0 q0Var = (q0) this.e;
        n4.s sVar = q0Var.f15578m;
        if (!TextUtils.equals(((n4.f) ((n4.w) sVar.f16032c).f16039a).f15995a.getQueueTitle(), s0Var.f2343a)) {
            ((n4.n) sVar.f16031b).f16014a.setQueueTitle((q0Var.f15588x.a(17) && q0Var.f15573g.f15440t.s().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.s sVar = ((q0) this.e).f15578m;
        int i11 = o.f15555a;
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
        n4.n nVar = (n4.n) sVar.f16031b;
        if (nVar.f16020j != i12) {
            nVar.f16020j = i12;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f16017f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f16017f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                nVar.f16017f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        q0 q0Var = (q0) ((o0) this.e).e;
        if (this != q0Var.f15583r) {
            return;
        }
        q0.E(q0Var.f15578m, o.b(this.f15556a, this.f15557b, this.f15558c, this.d, bitmap));
        f0 f0Var = q0Var.f15573g;
        e2.m0.W(f0Var.f15435o, new z(f0Var, 1));
    }

    public void p(boolean z10) {
        n4.s sVar = ((q0) this.e).f15578m;
        int i10 = o.f15555a;
        n4.n nVar = (n4.n) sVar.f16031b;
        if (nVar.f16021k != z10) {
            nVar.f16021k = z10 ? 1 : 0;
            synchronized (nVar.d) {
                for (int beginBroadcast = nVar.f16017f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) nVar.f16017f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                nVar.f16017f.finishBroadcast();
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
        q0 q0Var = (q0) this.e;
        f0 f0Var = q0Var.f15573g;
        n1 n1Var = f0Var.f15440t;
        b2.p0 S0 = n1Var.S0();
        b2.s0 U0 = n1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!n1Var.o0(16) || !n1Var.P0()) && n1Var.o0(16)) {
            j11 = n1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f2277a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f2280f.f2199a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f15556a, U0) && Objects.equals(this.f15557b, str2) && Objects.equals(this.f15558c, uri) && this.d == j11) {
            return;
        }
        this.f15557b = str2;
        this.f15558c = uri;
        this.f15556a = U0;
        this.d = j11;
        j9.y d = f0Var.f15433m.d(U0);
        if (d != null) {
            q0Var.f15583r = null;
            if (d.isDone()) {
                try {
                    bitmap = (Bitmap) q8.a(d);
                } catch (CancellationException | ExecutionException e) {
                    e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j10 = j11;
                uri2 = uri;
                s0Var = U0;
                o0 o0Var = new o0(this, s0Var, str2, uri2, j10);
                str2 = str2;
                q0Var.f15583r = o0Var;
                Handler handler = f0Var.f15432l;
                Objects.requireNonNull(handler);
                d.a(new j9.u(0, d, o0Var), new i2.f0(handler, 1));
                q0.E(q0Var.f15578m, o.b(s0Var, str2, uri2, j10, bitmap));
            }
        }
        j10 = j11;
        uri2 = uri;
        s0Var = U0;
        q0.E(q0Var.f15578m, o.b(s0Var, str2, uri2, j10, bitmap));
    }

    public void s(b2.p1 p1Var) {
        q0 q0Var = (q0) this.e;
        f0 f0Var = q0Var.f15573g;
        n1 n1Var = f0Var.f15440t;
        if (q0Var.f15588x.a(17) && n1Var.s().a(17) && !p1Var.p()) {
            int i10 = o.f15555a;
            ArrayList arrayList = new ArrayList();
            b2.o1 o1Var = new b2.o1();
            for (int i11 = 0; i11 < p1Var.o(); i11++) {
                arrayList.add(p1Var.m(i11, o1Var, 0L).f2260c);
            }
            ArrayList arrayList2 = new ArrayList();
            androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(this, new AtomicInteger(0), arrayList, arrayList2, 21);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.p0) arrayList.get(i12)).d.f2350k;
                if (bArr == null) {
                    arrayList2.add(null);
                    bVar.run();
                } else {
                    j9.y q6 = f0Var.f15433m.q(bArr);
                    arrayList2.add(q6);
                    Handler handler = f0Var.f15432l;
                    Objects.requireNonNull(handler);
                    q6.a(bVar, new i2.f0(handler, 1));
                }
            }
            return;
        }
        q0.D(q0Var.f15578m, null);
    }

    public o0(o0 o0Var, b2.s0 s0Var, String str, Uri uri, long j10) {
        this.e = o0Var;
        this.f15556a = s0Var;
        this.f15557b = str;
        this.f15558c = uri;
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
