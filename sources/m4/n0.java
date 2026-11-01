package m4;

import ag.d3;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.kf;
import org.telegram.messenger.lf;
import org.telegram.messenger.y20;
import org.telegram.messenger.zd;
import org.telegram.ui.Components.a8;
import v7.p8;
public final class n0 implements j9.t, v, lf {
    public Object f12864a;
    public Object f12865b;
    public Object f12866c;
    public long d;
    public final Object e;

    public n0(android.content.Context r23, org.telegram.ui.Components.yf0 r24, final org.telegram.ui.Components.a8 r25, boolean r26, int r27, org.telegram.ui.ActionBar.p6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n0.<init>(android.content.Context, org.telegram.ui.Components.yf0, org.telegram.ui.Components.a8, boolean, int, org.telegram.ui.ActionBar.p6):void");
    }

    @Override
    public void c(int i10, b2.b1 b1Var) {
        int i11;
        p0 p0Var = (p0) this.e;
        n1 n1Var = p0Var.h.f12755t;
        if (n1Var.n0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (p0Var.f12890t != i11) {
            p0Var.f12890t = i11;
            ((n4.l) p0Var.f12884n.f13527a).f13511a.setFlags(i11 | 3);
        }
        p0Var.p0(n1Var);
    }

    @Override
    public void e(int i10, p1 p1Var) {
        Bundle bundle = p1Var.f12899c;
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
        n4.q qVar = ((p0) this.e).f12884n;
        String str = p1Var.f12898b;
        qVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((n4.l) qVar.f13527a).f13511a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void f(int i10, s1 s1Var, boolean z10, boolean z11, int i11) {
        p0 p0Var = (p0) this.e;
        p0Var.p0(p0Var.h.f12755t);
    }

    @Override
    public void i(Throwable th2) {
        if (this != ((p0) ((n0) this.e).e).f12889s) {
            return;
        }
        e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void k(long j10, float f7) {
        File file = (File) this.f12865b;
        y20 y20Var = (y20) this.f12864a;
        if (!y20Var.W) {
            if (j10 < 0) {
                j10 = file.length();
            }
            long j11 = j10;
            if (!y20Var.Y && this.d == j11) {
                return;
            }
            this.d = j11;
            MediaController mediaController = (MediaController) this.e;
            kf kfVar = (kf) this.f12866c;
            String[] strArr = MediaController.U1;
            y20 y20Var2 = kfVar.f16624b;
            boolean z10 = y20Var2.X;
            if (z10) {
                y20Var2.X = false;
            }
            org.telegram.messenger.i0.g3(new zd(mediaController, false, false, kfVar, file, f7, 0L, z10, j11));
        }
    }

    public void l() {
        ((a8) this.f12866c).dismiss();
        this.d = System.currentTimeMillis();
    }

    public void m() {
        b2.f fVar;
        p0 p0Var = (p0) this.e;
        n1 n1Var = p0Var.h.f12755t;
        n1Var.J().getClass();
        n4.q qVar = p0Var.f12884n;
        if (n1Var.n0(21)) {
            fVar = n1Var.H();
        } else {
            fVar = b2.f.f2027i;
        }
        ((n4.l) qVar.f13527a).f13511a.setPlaybackToLocal(fVar.b());
    }

    public void n(b2.p0 p0Var) {
        p0 p0Var2 = (p0) this.e;
        n4.q qVar = p0Var2.f12884n;
        u();
        if (p0Var == null) {
            ((n4.l) qVar.f13527a).f13511a.setRatingType(0);
        } else {
            ((n4.l) qVar.f13527a).f13511a.setRatingType(o.e(p0Var.d.f2252i));
        }
        p0Var2.p0(p0Var2.h.f12755t);
    }

    public void o(int r3, m4.n1 r4, m4.n1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.n0.o(int, m4.n1, m4.n1):void");
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        p0 p0Var = (p0) ((n0) this.e).e;
        if (this != p0Var.f12889s) {
            return;
        }
        p0.f0(p0Var.f12884n, o.b((b2.s0) this.f12864a, (String) this.f12865b, (Uri) this.f12866c, this.d, bitmap));
        f0 f0Var = p0Var.h;
        e2.l0.W(f0Var.f12750o, new z(f0Var, 1));
    }

    public void p(b2.s0 s0Var) {
        p0 p0Var = (p0) this.e;
        n4.q qVar = p0Var.f12884n;
        if (!TextUtils.equals(((n4.f) ((n4.u) qVar.f13528b).f13535a).f13496a.getQueueTitle(), s0Var.f2247a)) {
            ((n4.l) qVar.f13527a).f13511a.setQueueTitle((p0Var.f12894y.a(17) && p0Var.h.f12755t.s().a(17)) ? null : null);
        }
    }

    public void q(int i10) {
        n4.q qVar = ((p0) this.e).f12884n;
        int i11 = o.f12869a;
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
        n4.l lVar = (n4.l) qVar.f13527a;
        if (lVar.f13517j != i12) {
            lVar.f13517j = i12;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f13514f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) lVar.f13514f.getBroadcastItem(beginBroadcast)).c(i12);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                lVar.f13514f.finishBroadcast();
            }
        }
    }

    public void r(boolean z10) {
        n4.q qVar = ((p0) this.e).f12884n;
        int i10 = o.f12869a;
        n4.l lVar = (n4.l) qVar.f13527a;
        if (lVar.f13518k != z10) {
            lVar.f13518k = z10 ? 1 : 0;
            synchronized (lVar.d) {
                for (int beginBroadcast = lVar.f13514f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.b) lVar.f13514f.getBroadcastItem(beginBroadcast)).i(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        e2.a.d("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                lVar.f13514f.finishBroadcast();
            }
        }
    }

    public void s(b2.o1 o1Var) {
        v(o1Var);
        u();
    }

    public void t(int i10) {
        org.telegram.ui.ActionBar.b1 b1Var = (org.telegram.ui.ActionBar.b1) this.f12865b;
        if (System.currentTimeMillis() - this.d < 200) {
            org.telegram.messenger.i0.g3(new d3(this, i10, 26));
        } else if (i10 == 0) {
            b1Var.setVisibility(8);
        } else {
            b1Var.setVisibility(0);
        }
    }

    public void u() {
        String str;
        Uri uri;
        long j10;
        Uri uri2;
        b2.s0 s0Var;
        Uri uri3;
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.h;
        n1 n1Var = f0Var.f12755t;
        b2.p0 S0 = n1Var.S0();
        b2.s0 U0 = n1Var.U0();
        long j11 = -9223372036854775807L;
        if ((!n1Var.n0(16) || !n1Var.P0()) && n1Var.n0(16)) {
            j11 = n1Var.getDuration();
        }
        if (S0 != null) {
            str = S0.f2181a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (S0 != null && (uri3 = S0.f2184f.f2100a) != null) {
            uri = uri3;
        } else {
            uri = null;
        }
        if (Objects.equals((b2.s0) this.f12864a, U0) && Objects.equals((String) this.f12865b, str2) && Objects.equals((Uri) this.f12866c, uri) && this.d == j11) {
            return;
        }
        this.f12865b = str2;
        this.f12866c = uri;
        this.f12864a = U0;
        this.d = j11;
        j9.y a2 = f0Var.f12748m.a(U0);
        if (a2 != null) {
            p0Var.f12889s = null;
            if (a2.isDone()) {
                try {
                    bitmap = (Bitmap) p8.a(a2);
                } catch (CancellationException | ExecutionException e) {
                    e2.a.l("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j10 = j11;
                uri2 = uri;
                s0Var = U0;
                n0 n0Var = new n0(this, s0Var, str2, uri2, j10);
                str2 = str2;
                p0Var.f12889s = n0Var;
                Handler handler = f0Var.f12747l;
                Objects.requireNonNull(handler);
                a2.a(new j9.u(0, a2, n0Var), new i2.g0(handler, 1));
                p0.f0(p0Var.f12884n, o.b(s0Var, str2, uri2, j10, bitmap));
            }
        }
        j10 = j11;
        uri2 = uri;
        s0Var = U0;
        p0.f0(p0Var.f12884n, o.b(s0Var, str2, uri2, j10, bitmap));
    }

    public void v(b2.o1 o1Var) {
        p0 p0Var = (p0) this.e;
        f0 f0Var = p0Var.h;
        n1 n1Var = f0Var.f12755t;
        if (p0Var.f12894y.a(17) && n1Var.s().a(17) && !o1Var.p()) {
            int i10 = o.f12869a;
            ArrayList arrayList = new ArrayList();
            b2.n1 n1Var2 = new b2.n1();
            for (int i11 = 0; i11 < o1Var.o(); i11++) {
                arrayList.add(o1Var.m(i11, n1Var2, 0L).f2139c);
            }
            ArrayList arrayList2 = new ArrayList();
            ag.q0 q0Var = new ag.q0(this, new AtomicInteger(0), arrayList, arrayList2, 10);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.p0) arrayList.get(i12)).d.f2254k;
                if (bArr == null) {
                    arrayList2.add(null);
                    q0Var.run();
                } else {
                    j9.y w9 = f0Var.f12748m.w(bArr);
                    arrayList2.add(w9);
                    Handler handler = f0Var.f12747l;
                    Objects.requireNonNull(handler);
                    w9.a(q0Var, new i2.g0(handler, 1));
                }
            }
            return;
        }
        p0.e0(p0Var.f12884n, null);
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

    public n0(p0 p0Var) {
        this.e = p0Var;
        this.f12864a = b2.s0.L;
        this.f12865b = "";
        this.d = -9223372036854775807L;
    }

    public n0(n0 n0Var, b2.s0 s0Var, String str, Uri uri, long j10) {
        this.e = n0Var;
        this.f12864a = s0Var;
        this.f12865b = str;
        this.f12866c = uri;
        this.d = j10;
    }

    public n0(MediaController mediaController, y20 y20Var, File file, kf kfVar) {
        this.e = mediaController;
        this.f12864a = y20Var;
        this.f12865b = file;
        this.f12866c = kfVar;
        this.d = 0L;
    }

    @Override
    public void d(int i10, int i11, int i12) {
    }

    @Override
    public void h(int i10, l1 l1Var, b2.b1 b1Var, boolean z10, boolean z11) {
    }
}
