package o4;

import ai.z3;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import b8.yd;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.b20;
import org.telegram.messenger.cf;
import org.telegram.messenger.df;
import org.telegram.messenger.ud;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.o2;
public final class m0 implements l9.t, u, df {
    public Object f20753a;
    public Object f20754b;
    public Object f20755c;
    public long d;
    public final Object f20756e;

    public m0(android.content.Context r23, org.telegram.ui.Components.xe0 r24, final org.telegram.ui.Components.d8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.e6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: o4.m0.<init>(android.content.Context, org.telegram.ui.Components.xe0, org.telegram.ui.Components.d8, boolean, int, org.telegram.ui.ActionBar.e6):void");
    }

    @Override
    public void a(int i3, d2.a1 a1Var) {
        int i10;
        o0 o0Var = (o0) this.f20756e;
        l1 l1Var = o0Var.h.f20636t;
        if (l1Var.m0(20)) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (o0Var.f20785t != i10) {
            o0Var.f20785t = i10;
            ((p4.l) o0Var.f20779n.f53181a).f53164a.setFlags(i10 | 3);
        }
        o0Var.p0(l1Var);
    }

    @Override
    public void d(int i3, n1 n1Var) {
        Bundle bundle = n1Var.f20765c;
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
        p4.q qVar = ((o0) this.f20756e).f20779n;
        String str = n1Var.f20764b;
        qVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((p4.l) qVar.f53181a).f53164a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((o0) ((m0) this.f20756e).f20756e).f20784s) {
            return;
        }
        g2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    @Override
    public void i(int i3, q1 q1Var, boolean z10, boolean z11, int i10) {
        o0 o0Var = (o0) this.f20756e;
        o0Var.p0(o0Var.h.f20636t);
    }

    public void k(long j10, float f10) {
        File file = (File) this.f20754b;
        b20 b20Var = (b20) this.f20753a;
        if (!b20Var.W) {
            if (j10 < 0) {
                j10 = file.length();
            }
            long j11 = j10;
            if (!b20Var.Y && this.d == j11) {
                return;
            }
            this.d = j11;
            MediaController mediaController = (MediaController) this.f20756e;
            cf cfVar = (cf) this.f20755c;
            String[] strArr = MediaController.W1;
            b20 b20Var2 = cfVar.f22015b;
            boolean z10 = b20Var2.X;
            if (z10) {
                b20Var2.X = false;
            }
            org.telegram.messenger.g0.h3(new ud(mediaController, false, false, cfVar, file, f10, 0L, z10, j11));
        }
    }

    public void l() {
        ((d8) this.f20755c).dismiss();
        this.d = System.currentTimeMillis();
    }

    public void m() {
        d2.f fVar;
        o0 o0Var = (o0) this.f20756e;
        l1 l1Var = o0Var.h.f20636t;
        l1Var.I().getClass();
        p4.q qVar = o0Var.f20779n;
        if (l1Var.m0(21)) {
            fVar = l1Var.G();
        } else {
            fVar = d2.f.f8079i;
        }
        ((p4.l) qVar.f53181a).f53164a.setPlaybackToLocal(fVar.b());
    }

    public void n(d2.n0 n0Var) {
        o0 o0Var = (o0) this.f20756e;
        p4.q qVar = o0Var.f20779n;
        u();
        if (n0Var == null) {
            ((p4.l) qVar.f53181a).f53164a.setRatingType(0);
        } else {
            ((p4.l) qVar.f53181a).f53164a.setRatingType(n.e(n0Var.d.f8313i));
        }
        o0Var.p0(o0Var.h.f20636t);
    }

    public void o(int r3, o4.l1 r4, o4.l1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: o4.m0.o(int, o4.l1, o4.l1):void");
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o0 o0Var = (o0) ((m0) this.f20756e).f20756e;
        if (this != o0Var.f20784s) {
            return;
        }
        o0.f0(o0Var.f20779n, n.b((d2.q0) this.f20753a, (String) this.f20754b, (Uri) this.f20755c, this.d, bitmap));
        e0 e0Var = o0Var.h;
        g2.n0.W(e0Var.f20631o, new y(e0Var, 1));
    }

    public void p(d2.q0 q0Var) {
        o0 o0Var = (o0) this.f20756e;
        p4.q qVar = o0Var.f20779n;
        if (!TextUtils.equals(((p4.f) ((p4.u) qVar.f53182b).f53189a).f53147a.getQueueTitle(), q0Var.f8307a)) {
            ((p4.l) qVar.f53181a).f53164a.setQueueTitle((o0Var.f20789y.a(17) && o0Var.h.f20636t.t().a(17)) ? null : null);
        }
    }

    public void q(int i3) {
        p4.q qVar = ((o0) this.f20756e).f20779n;
        int i10 = n.f20759a;
        int i11 = 0;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    g2.a.l("LegacyConversions", "Unrecognized RepeatMode: " + i3 + " was converted to `PlaybackStateCompat.REPEAT_MODE_NONE`");
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 1;
            }
        }
        p4.l lVar = (p4.l) qVar.f53181a;
        if (lVar.f53171j != i11) {
            lVar.f53171j = i11;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f53168f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((p4.b) lVar.f53168f.getBroadcastItem(beginBroadcast)).c(i11);
                    } catch (RemoteException | SecurityException e10) {
                        g2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e10);
                    }
                }
                lVar.f53168f.finishBroadcast();
            }
        }
    }

    public void r(boolean z10) {
        p4.q qVar = ((o0) this.f20756e).f20779n;
        int i3 = n.f20759a;
        p4.l lVar = (p4.l) qVar.f53181a;
        if (lVar.f53172k != z10) {
            lVar.f53172k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f53168f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((p4.b) lVar.f53168f.getBroadcastItem(beginBroadcast)).i(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e10) {
                        g2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e10);
                    }
                }
                lVar.f53168f.finishBroadcast();
            }
        }
    }

    public void s(d2.n1 n1Var) {
        v(n1Var);
        u();
    }

    public void t(int i3) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) this.f20754b;
        if (System.currentTimeMillis() - this.d < 200) {
            org.telegram.messenger.g0.h3(new o2(this, i3, 1));
        } else if (i3 == 0) {
            y0Var.setVisibility(8);
        } else {
            y0Var.setVisibility(0);
        }
    }

    public void u() {
        String str;
        Uri uri;
        long j10;
        Uri uri2;
        d2.q0 q0Var;
        Uri uri3;
        o0 o0Var = (o0) this.f20756e;
        e0 e0Var = o0Var.h;
        l1 l1Var = e0Var.f20636t;
        d2.n0 S0 = l1Var.S0();
        d2.q0 U0 = l1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!l1Var.m0(16) || !l1Var.P0()) && l1Var.m0(16)) {
            j11 = l1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f8240a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f8244f.f8152a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((d2.q0) this.f20753a, U0) && Objects.equals((String) this.f20754b, str2) && Objects.equals((Uri) this.f20755c, uri) && this.d == j11) {
            return;
        }
        this.f20754b = str2;
        this.f20755c = uri;
        this.f20753a = U0;
        this.d = j11;
        l9.y L = e0Var.f20629m.L(U0);
        if (L != null) {
            o0Var.f20784s = null;
            if (L.isDone()) {
                try {
                    bitmap = (Bitmap) yd.a(L);
                } catch (CancellationException | ExecutionException e10) {
                    g2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e10.getMessage());
                }
            } else {
                j10 = j11;
                uri2 = uri;
                q0Var = U0;
                m0 m0Var = new m0(this, q0Var, str2, uri2, j10);
                str2 = str2;
                o0Var.f20784s = m0Var;
                Handler handler = e0Var.f20628l;
                Objects.requireNonNull(handler);
                L.b(new l9.u(0, L, m0Var), new k2.g0(handler, 1));
                o0.f0(o0Var.f20779n, n.b(q0Var, str2, uri2, j10, bitmap));
            }
        }
        j10 = j11;
        uri2 = uri;
        q0Var = U0;
        o0.f0(o0Var.f20779n, n.b(q0Var, str2, uri2, j10, bitmap));
    }

    public void v(d2.n1 n1Var) {
        o0 o0Var = (o0) this.f20756e;
        e0 e0Var = o0Var.h;
        l1 l1Var = e0Var.f20636t;
        if (o0Var.f20789y.a(17) && l1Var.t().a(17) && !n1Var.p()) {
            int i3 = n.f20759a;
            ArrayList arrayList = new ArrayList();
            d2.m1 m1Var = new d2.m1();
            for (int i10 = 0; i10 < n1Var.o(); i10++) {
                arrayList.add(n1Var.m(i10, m1Var, 0L).f8210c);
            }
            ArrayList arrayList2 = new ArrayList();
            z3 z3Var = new z3(this, new AtomicInteger(0), arrayList, arrayList2, 27);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                byte[] bArr = ((d2.n0) arrayList.get(i11)).d.f8315k;
                if (bArr == null) {
                    arrayList2.add(null);
                    z3Var.run();
                } else {
                    l9.y u10 = e0Var.f20629m.u(bArr);
                    arrayList2.add(u10);
                    Handler handler = e0Var.f20628l;
                    Objects.requireNonNull(handler);
                    u10.b(z3Var, new k2.g0(handler, 1));
                }
            }
            return;
        }
        o0.e0(o0Var.f20779n, null);
    }

    @Override
    public void g() {
    }

    @Override
    public void b(int i3) {
    }

    @Override
    public void e(int i3, r1 r1Var) {
    }

    @Override
    public void j(int i3, o oVar) {
    }

    public m0(o0 o0Var) {
        this.f20756e = o0Var;
        this.f20753a = d2.q0.L;
        this.f20754b = "";
        this.d = -9223372036854775807L;
    }

    public m0(m0 m0Var, d2.q0 q0Var, String str, Uri uri, long j10) {
        this.f20756e = m0Var;
        this.f20753a = q0Var;
        this.f20754b = str;
        this.f20755c = uri;
        this.d = j10;
    }

    public m0(MediaController mediaController, b20 b20Var, File file, cf cfVar) {
        this.f20756e = mediaController;
        this.f20753a = b20Var;
        this.f20754b = file;
        this.f20755c = cfVar;
        this.d = 0L;
    }

    @Override
    public void c(int i3, int i10, int i11) {
    }

    @Override
    public void f(int i3, j1 j1Var, d2.a1 a1Var, boolean z10, boolean z11) {
    }
}
