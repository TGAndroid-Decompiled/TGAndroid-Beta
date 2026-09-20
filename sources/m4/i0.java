package m4;

import ai.i5;
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
import v7.m8;
public final class i0 implements i9.r, q {
    public b2.n0 f14794a;
    public String f14795b;
    public Uri f14796c;
    public long d;
    public final Object e;

    public i0(k0 k0Var) {
        this.e = k0Var;
        this.f14794a = b2.n0.K;
        this.f14795b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.x0 x0Var) {
        int i11;
        k0 k0Var = (k0) this.e;
        j1 j1Var = k0Var.f14806g.f14687t;
        if (j1Var.m0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (k0Var.f14815q != i11) {
            k0Var.f14815q = i11;
            ((n4.r) k0Var.f14809k.f15217a).f15199a.setFlags(i11 | 3);
        }
        k0Var.N(j1Var);
    }

    @Override
    public void d(int i10, l1 l1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.y yVar = ((k0) this.e).f14809k;
        String str = l1Var.f14833b;
        yVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            n4.r rVar = (n4.r) yVar.f15217a;
            if (Build.VERSION.SDK_INT < 23) {
                synchronized (rVar.d) {
                    for (int beginBroadcast = rVar.f15202f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((n4.f) rVar.f15202f.getBroadcastItem(beginBroadcast)).t0(str);
                        } catch (RemoteException | SecurityException e) {
                            Log.e("MediaSessionCompat", "Dead object in sendSessionEvent.", e);
                        }
                    }
                    rVar.f15202f.finishBroadcast();
                }
            }
            rVar.f15199a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void e(int i10, o1 o1Var, boolean z10, boolean z11, int i11) {
        k0 k0Var = (k0) this.e;
        k0Var.N(k0Var.f14806g.f14687t);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((k0) ((i0) this.e).e).f14814p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        k0 k0Var = (k0) this.e;
        k0Var.f14806g.f14687t.K().getClass();
        int e = k.e(eVar);
        n4.r rVar = (n4.r) k0Var.f14809k.f15217a;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.f15199a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        b2.e eVar;
        k0 k0Var = (k0) this.e;
        j1 j1Var = k0Var.f14806g.f14687t;
        j1Var.K().getClass();
        if (j1Var.m0(21)) {
            eVar = j1Var.I();
        } else {
            eVar = b2.e.h;
        }
        int e = k.e(eVar);
        n4.r rVar = (n4.r) k0Var.f14809k.f15217a;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.f15199a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        k0 k0Var2 = (k0) this.e;
        n4.y yVar = k0Var2.f14809k;
        r();
        if (k0Var == null) {
            ((n4.r) yVar.f15217a).e(0);
        } else {
            ((n4.r) yVar.f15217a).e(k.f(k0Var.d.f3147i));
        }
        k0Var2.N(k0Var2.f14806g.f14687t);
    }

    public void m(int r3, m4.j1 r4, m4.j1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.i0.m(int, m4.j1, m4.j1):void");
    }

    public void n(b2.n0 n0Var) {
        k0 k0Var = (k0) this.e;
        n4.y yVar = k0Var.f14809k;
        if (!TextUtils.equals(((n4.j) ((k2.u) yVar.f15218b).f13384b).f15181a.getQueueTitle(), n0Var.f3142a)) {
            ((n4.r) yVar.f15217a).f15199a.setQueueTitle((k0Var.v.a(17) && k0Var.f14806g.f14687t.t().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.y yVar = ((k0) this.e).f14809k;
        int i11 = k.f14803a;
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
        n4.r rVar = (n4.r) yVar.f15217a;
        if (rVar.f15206k != i12) {
            rVar.f15206k = i12;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f15202f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f15202f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                rVar.f15202f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        k0 k0Var = (k0) ((i0) this.e).e;
        if (this != k0Var.f14814p) {
            return;
        }
        k0.E(k0Var.f14809k, k.b(this.f14794a, this.f14795b, this.f14796c, this.d, bitmap));
        a0 a0Var = k0Var.f14806g;
        e2.d0.U(a0Var.f14682o, new u(a0Var, 1));
    }

    public void p(boolean z10) {
        n4.y yVar = ((k0) this.e).f14809k;
        int i10 = k.f14803a;
        n4.r rVar = (n4.r) yVar.f15217a;
        if (rVar.f15207l != z10) {
            rVar.f15207l = z10 ? 1 : 0;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f15202f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f15202f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                rVar.f15202f.finishBroadcast();
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
        k0 k0Var = (k0) this.e;
        a0 a0Var = k0Var.f14806g;
        j1 j1Var = a0Var.f14687t;
        b2.k0 P0 = j1Var.P0();
        b2.n0 R0 = j1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!j1Var.m0(16) || !j1Var.M0()) && j1Var.m0(16)) {
            j10 = j1Var.getDuration();
        }
        if (P0 != null) {
            str = P0.f3077a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (P0 != null && (uri4 = P0.f3080f.f3003a) != null) {
            uri = uri4;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f14794a, R0) && Objects.equals(this.f14795b, str2) && Objects.equals(this.f14796c, uri) && this.d == j10) {
            return;
        }
        this.f14795b = str2;
        this.f14796c = uri;
        this.f14794a = R0;
        this.d = j10;
        of.b bVar = a0Var.f14680m;
        bVar.getClass();
        byte[] bArr = R0.f3149k;
        if (bArr != null) {
            wVar = bVar.O(bArr);
        } else {
            Uri uri5 = R0.f3151m;
            if (uri5 != null) {
                lf.h hVar = (lf.h) bVar.f15683c;
                if (hVar != null && (uri2 = (Uri) hVar.f14216c) != null && uri2.equals(uri5)) {
                    wVar = (i9.w) ((lf.h) bVar.f15683c).d;
                    e2.d.h(wVar);
                } else {
                    g2.i iVar = (g2.i) bVar.f15682b;
                    i9.w a2 = ((i9.y) iVar.f9366a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    bVar.f15683c = new lf.h(uri5, a2);
                    wVar = a2;
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            k0Var.f14814p = null;
            if (wVar.isDone()) {
                try {
                    bitmap = (Bitmap) m8.a(wVar);
                } catch (CancellationException | ExecutionException e) {
                    e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j3 = j10;
                uri3 = uri;
                n0Var = R0;
                i0 i0Var = new i0(this, n0Var, str2, uri3, j3);
                str2 = str2;
                k0Var.f14814p = i0Var;
                Handler handler = a0Var.f14679l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, i0Var), new k2.c0(handler, 0));
                k0.E(k0Var.f14809k, k.b(n0Var, str2, uri3, j3, bitmap));
            }
        }
        j3 = j10;
        uri3 = uri;
        n0Var = R0;
        k0.E(k0Var.f14809k, k.b(n0Var, str2, uri3, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        k0 k0Var = (k0) this.e;
        a0 a0Var = k0Var.f14806g;
        j1 j1Var = a0Var.f14687t;
        if (k0Var.v.a(17) && j1Var.t().a(17) && !k1Var.p()) {
            int i10 = k.f14803a;
            ArrayList arrayList = new ArrayList();
            b2.j1 j1Var2 = new b2.j1();
            for (int i11 = 0; i11 < k1Var.o(); i11++) {
                arrayList.add(k1Var.m(i11, j1Var2, 0L).f3060c);
            }
            ArrayList arrayList2 = new ArrayList();
            i5 i5Var = new i5(this, new AtomicInteger(0), arrayList, arrayList2, 21);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.k0) arrayList.get(i12)).d.f3149k;
                if (bArr == null) {
                    arrayList2.add(null);
                    i5Var.run();
                } else {
                    i9.w O = a0Var.f14680m.O(bArr);
                    arrayList2.add(O);
                    Handler handler = a0Var.f14679l;
                    Objects.requireNonNull(handler);
                    O.a(i5Var, new k2.c0(handler, 0));
                }
            }
            return;
        }
        k0.D(k0Var.f14809k, null);
    }

    public i0(i0 i0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.e = i0Var;
        this.f14794a = n0Var;
        this.f14795b = str;
        this.f14796c = uri;
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
    public void i(int i10, p1 p1Var) {
    }

    @Override
    public void g(int i10, h1 h1Var, b2.x0 x0Var, boolean z10, boolean z11) {
    }
}
