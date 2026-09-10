package m4;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
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
import m.e3;
import v7.o8;
public final class j0 implements i9.r, q {
    public b2.n0 f13381a;
    public String f13382b;
    public Uri f13383c;
    public long d;
    public final Object e;

    public j0(l0 l0Var) {
        this.e = l0Var;
        this.f13381a = b2.n0.K;
        this.f13382b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.x0 x0Var) {
        int i11;
        l0 l0Var = (l0) this.e;
        l1 l1Var = l0Var.f13430g.f13307t;
        if (l1Var.m0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (l0Var.f13439q != i11) {
            l0Var.f13439q = i11;
            ((n4.r) l0Var.f13433k.f13824b).f13805a.setFlags(i11 | 3);
        }
        l0Var.N(l1Var);
    }

    @Override
    public void d(int i10, n1 n1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.y yVar = ((l0) this.e).f13433k;
        String str = n1Var.f13459b;
        yVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            n4.r rVar = (n4.r) yVar.f13824b;
            if (Build.VERSION.SDK_INT < 23) {
                synchronized (rVar.d) {
                    for (int beginBroadcast = rVar.f13808f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((n4.f) rVar.f13808f.getBroadcastItem(beginBroadcast)).t0(str);
                        } catch (RemoteException | SecurityException e) {
                            Log.e("MediaSessionCompat", "Dead object in sendSessionEvent.", e);
                        }
                    }
                    rVar.f13808f.finishBroadcast();
                }
            }
            rVar.f13805a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void e(int i10, q1 q1Var, boolean z10, boolean z11, int i11) {
        l0 l0Var = (l0) this.e;
        l0Var.N(l0Var.f13430g.f13307t);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((l0) ((j0) this.e).e).f13438p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        l0 l0Var = (l0) this.e;
        l0Var.f13430g.f13307t.K().getClass();
        int e = k.e(eVar);
        n4.r rVar = (n4.r) l0Var.f13433k.f13824b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.f13805a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        b2.e eVar;
        l0 l0Var = (l0) this.e;
        l1 l1Var = l0Var.f13430g.f13307t;
        l1Var.K().getClass();
        if (l1Var.m0(21)) {
            eVar = l1Var.I();
        } else {
            eVar = b2.e.h;
        }
        int e = k.e(eVar);
        n4.r rVar = (n4.r) l0Var.f13433k.f13824b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.f13805a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        l0 l0Var = (l0) this.e;
        n4.y yVar = l0Var.f13433k;
        r();
        if (k0Var == null) {
            ((n4.r) yVar.f13824b).e(0);
        } else {
            ((n4.r) yVar.f13824b).e(k.f(k0Var.d.f1840i));
        }
        l0Var.N(l0Var.f13430g.f13307t);
    }

    public void m(int r3, m4.l1 r4, m4.l1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.j0.m(int, m4.l1, m4.l1):void");
    }

    public void n(b2.n0 n0Var) {
        l0 l0Var = (l0) this.e;
        n4.y yVar = l0Var.f13433k;
        if (!TextUtils.equals(((n4.j) ((l2.h) yVar.f13825c).f12721b).f13787a.getQueueTitle(), n0Var.f1835a)) {
            ((n4.r) yVar.f13824b).f13805a.setQueueTitle((l0Var.v.a(17) && l0Var.f13430g.f13307t.t().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.y yVar = ((l0) this.e).f13433k;
        int i11 = k.f13417a;
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
        n4.r rVar = (n4.r) yVar.f13824b;
        if (rVar.f13812k != i12) {
            rVar.f13812k = i12;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f13808f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f13808f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                rVar.f13808f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        l0 l0Var = (l0) ((j0) this.e).e;
        if (this != l0Var.f13438p) {
            return;
        }
        l0.E(l0Var.f13433k, k.b(this.f13381a, this.f13382b, this.f13383c, this.d, bitmap));
        b0 b0Var = l0Var.f13430g;
        e2.d0.U(b0Var.f13302o, new u(b0Var, 1));
    }

    public void p(boolean z10) {
        n4.y yVar = ((l0) this.e).f13433k;
        int i10 = k.f13417a;
        n4.r rVar = (n4.r) yVar.f13824b;
        if (rVar.f13813l != z10) {
            rVar.f13813l = z10 ? 1 : 0;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f13808f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f13808f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                rVar.f13808f.finishBroadcast();
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
        l0 l0Var = (l0) this.e;
        b0 b0Var = l0Var.f13430g;
        l1 l1Var = b0Var.f13307t;
        b2.k0 P0 = l1Var.P0();
        b2.n0 R0 = l1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!l1Var.m0(16) || !l1Var.M0()) && l1Var.m0(16)) {
            j10 = l1Var.getDuration();
        }
        if (P0 != null) {
            str = P0.f1770a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (P0 != null && (uri4 = P0.f1773f.f1696a) != null) {
            uri = uri4;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f13381a, R0) && Objects.equals(this.f13382b, str2) && Objects.equals(this.f13383c, uri) && this.d == j10) {
            return;
        }
        this.f13382b = str2;
        this.f13383c = uri;
        this.f13381a = R0;
        this.d = j10;
        of.b bVar = b0Var.f13300m;
        bVar.getClass();
        byte[] bArr = R0.f1842k;
        if (bArr != null) {
            wVar = bVar.H(bArr);
        } else {
            Uri uri5 = R0.f1844m;
            if (uri5 != null) {
                e3 e3Var = (e3) bVar.f14295c;
                if (e3Var != null && (uri2 = (Uri) e3Var.f13002c) != null && uri2.equals(uri5)) {
                    wVar = (i9.w) ((e3) bVar.f14295c).d;
                    e2.d.h(wVar);
                } else {
                    g2.i iVar = (g2.i) bVar.f14294b;
                    i9.w a2 = ((i9.y) iVar.f8494a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    bVar.f14295c = new e3(uri5, a2);
                    wVar = a2;
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            l0Var.f13438p = null;
            if (wVar.isDone()) {
                try {
                    bitmap = (Bitmap) o8.a(wVar);
                } catch (CancellationException | ExecutionException e) {
                    e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j3 = j10;
                uri3 = uri;
                n0Var = R0;
                j0 j0Var = new j0(this, n0Var, str2, uri3, j3);
                str2 = str2;
                l0Var.f13438p = j0Var;
                Handler handler = b0Var.f13299l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, j0Var), new k2.b0(handler, 0));
                l0.E(l0Var.f13433k, k.b(n0Var, str2, uri3, j3, bitmap));
            }
        }
        j3 = j10;
        uri3 = uri;
        n0Var = R0;
        l0.E(l0Var.f13433k, k.b(n0Var, str2, uri3, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        l0 l0Var = (l0) this.e;
        b0 b0Var = l0Var.f13430g;
        l1 l1Var = b0Var.f13307t;
        if (l0Var.v.a(17) && l1Var.t().a(17) && !k1Var.p()) {
            int i10 = k.f13417a;
            ArrayList arrayList = new ArrayList();
            b2.j1 j1Var = new b2.j1();
            for (int i11 = 0; i11 < k1Var.o(); i11++) {
                arrayList.add(k1Var.m(i11, j1Var, 0L).f1753c);
            }
            ArrayList arrayList2 = new ArrayList();
            androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(this, new AtomicInteger(0), arrayList, arrayList2, 18);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.k0) arrayList.get(i12)).d.f1842k;
                if (bArr == null) {
                    arrayList2.add(null);
                    bVar.run();
                } else {
                    i9.w H = b0Var.f13300m.H(bArr);
                    arrayList2.add(H);
                    Handler handler = b0Var.f13299l;
                    Objects.requireNonNull(handler);
                    H.a(bVar, new k2.b0(handler, 0));
                }
            }
            return;
        }
        l0.D(l0Var.f13433k, null);
    }

    public j0(j0 j0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.e = j0Var;
        this.f13381a = n0Var;
        this.f13382b = str;
        this.f13383c = uri;
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
    public void i(int i10, r1 r1Var) {
    }

    @Override
    public void g(int i10, j1 j1Var, b2.x0 x0Var, boolean z10, boolean z11) {
    }
}
