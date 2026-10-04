package m4;

import ai.h5;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import ii.n4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import v7.l8;
public final class i0 implements i9.r, q {
    public b2.n0 f16182a;
    public String f16183b;
    public Uri f16184c;
    public long d;
    public final Object f16185e;

    public i0(k0 k0Var) {
        this.f16185e = k0Var;
        this.f16182a = b2.n0.K;
        this.f16183b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.x0 x0Var) {
        int i11;
        k0 k0Var = (k0) this.f16185e;
        e1 e1Var = k0Var.f16213g.f16057t;
        if (e1Var.m0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (k0Var.f16222q != i11) {
            k0Var.f16222q = i11;
            ((n4.r) k0Var.f16216k.f16644b).f16624a.setFlags(i11 | 3);
        }
        k0Var.N(e1Var);
    }

    @Override
    public void d(int i10, g1 g1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.y yVar = ((k0) this.f16185e).f16216k;
        String str = g1Var.f16176b;
        yVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            n4.r rVar = (n4.r) yVar.f16644b;
            if (Build.VERSION.SDK_INT < 23) {
                synchronized (rVar.d) {
                    for (int beginBroadcast = rVar.f16628f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((n4.f) rVar.f16628f.getBroadcastItem(beginBroadcast)).t0(str);
                        } catch (RemoteException | SecurityException e7) {
                            Log.e("MediaSessionCompat", "Dead object in sendSessionEvent.", e7);
                        }
                    }
                    rVar.f16628f.finishBroadcast();
                }
            }
            rVar.f16624a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void e(int i10, j1 j1Var, boolean z10, boolean z11, int i11) {
        k0 k0Var = (k0) this.f16185e;
        k0Var.N(k0Var.f16213g.f16057t);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((k0) ((i0) this.f16185e).f16185e).f16221p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        k0 k0Var = (k0) this.f16185e;
        k0Var.f16213g.f16057t.K().getClass();
        int e7 = k.e(eVar);
        n4.r rVar = (n4.r) k0Var.f16216k.f16644b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e7);
        rVar.f16624a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        b2.e eVar;
        k0 k0Var = (k0) this.f16185e;
        e1 e1Var = k0Var.f16213g.f16057t;
        e1Var.K().getClass();
        if (e1Var.m0(21)) {
            eVar = e1Var.I();
        } else {
            eVar = b2.e.h;
        }
        int e7 = k.e(eVar);
        n4.r rVar = (n4.r) k0Var.f16216k.f16644b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e7);
        rVar.f16624a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        k0 k0Var2 = (k0) this.f16185e;
        n4.y yVar = k0Var2.f16216k;
        r();
        if (k0Var == null) {
            ((n4.r) yVar.f16644b).e(0);
        } else {
            ((n4.r) yVar.f16644b).e(k.f(k0Var.d.f3396i));
        }
        k0Var2.N(k0Var2.f16213g.f16057t);
    }

    public void m(int r3, m4.e1 r4, m4.e1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.i0.m(int, m4.e1, m4.e1):void");
    }

    public void n(b2.n0 n0Var) {
        k0 k0Var = (k0) this.f16185e;
        n4.y yVar = k0Var.f16216k;
        if (!TextUtils.equals(((n4.j) ((n4) yVar.f16645c).f12544b).f16603a.getQueueTitle(), n0Var.f3390a)) {
            ((n4.r) yVar.f16644b).f16624a.setQueueTitle((k0Var.v.a(17) && k0Var.f16213g.f16057t.t().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.y yVar = ((k0) this.f16185e).f16216k;
        int i11 = k.f16210a;
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
        n4.r rVar = (n4.r) yVar.f16644b;
        if (rVar.f16632k != i12) {
            rVar.f16632k = i12;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f16628f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f16628f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e7) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e7);
                    }
                }
                rVar.f16628f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        k0 k0Var = (k0) ((i0) this.f16185e).f16185e;
        if (this != k0Var.f16221p) {
            return;
        }
        k0.E(k0Var.f16216k, k.b(this.f16182a, this.f16183b, this.f16184c, this.d, bitmap));
        a0 a0Var = k0Var.f16213g;
        e2.d0.U(a0Var.f16052o, new u(a0Var, 1));
    }

    public void p(boolean z10) {
        n4.y yVar = ((k0) this.f16185e).f16216k;
        int i10 = k.f16210a;
        n4.r rVar = (n4.r) yVar.f16644b;
        if (rVar.f16633l != z10) {
            rVar.f16633l = z10 ? 1 : 0;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f16628f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f16628f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e7) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e7);
                    }
                }
                rVar.f16628f.finishBroadcast();
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
        k0 k0Var = (k0) this.f16185e;
        a0 a0Var = k0Var.f16213g;
        e1 e1Var = a0Var.f16057t;
        b2.k0 P0 = e1Var.P0();
        b2.n0 R0 = e1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!e1Var.m0(16) || !e1Var.M0()) && e1Var.m0(16)) {
            j10 = e1Var.getDuration();
        }
        if (P0 != null) {
            str = P0.f3320a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (P0 != null && (uri4 = P0.f3324f.f3239a) != null) {
            uri = uri4;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f16182a, R0) && Objects.equals(this.f16183b, str2) && Objects.equals(this.f16184c, uri) && this.d == j10) {
            return;
        }
        this.f16183b = str2;
        this.f16184c = uri;
        this.f16182a = R0;
        this.d = j10;
        n4.y yVar = a0Var.f16050m;
        yVar.getClass();
        byte[] bArr = R0.f3398k;
        if (bArr != null) {
            wVar = yVar.s(bArr);
        } else {
            Uri uri5 = R0.f3400m;
            if (uri5 != null) {
                la.h hVar = (la.h) yVar.f16645c;
                if (hVar != null && (uri2 = (Uri) hVar.f15400c) != null && uri2.equals(uri5)) {
                    wVar = (i9.w) ((la.h) yVar.f16645c).d;
                    e2.d.h(wVar);
                } else {
                    g2.i iVar = (g2.i) yVar.f16644b;
                    i9.w a2 = ((i9.y) iVar.f10178a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    yVar.f16645c = new la.h(uri5, a2);
                    wVar = a2;
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            k0Var.f16221p = null;
            if (wVar.isDone()) {
                try {
                    bitmap = (Bitmap) l8.a(wVar);
                } catch (CancellationException | ExecutionException e7) {
                    e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + e7.getMessage());
                }
            } else {
                j3 = j10;
                uri3 = uri;
                n0Var = R0;
                i0 i0Var = new i0(this, n0Var, str2, uri3, j3);
                str2 = str2;
                k0Var.f16221p = i0Var;
                Handler handler = a0Var.f16049l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, i0Var), new k2.c0(handler, 0));
                k0.E(k0Var.f16216k, k.b(n0Var, str2, uri3, j3, bitmap));
            }
        }
        j3 = j10;
        uri3 = uri;
        n0Var = R0;
        k0.E(k0Var.f16216k, k.b(n0Var, str2, uri3, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        k0 k0Var = (k0) this.f16185e;
        a0 a0Var = k0Var.f16213g;
        e1 e1Var = a0Var.f16057t;
        if (k0Var.v.a(17) && e1Var.t().a(17) && !k1Var.p()) {
            int i10 = k.f16210a;
            ArrayList arrayList = new ArrayList();
            b2.j1 j1Var = new b2.j1();
            for (int i11 = 0; i11 < k1Var.o(); i11++) {
                arrayList.add(k1Var.m(i11, j1Var, 0L).f3302c);
            }
            ArrayList arrayList2 = new ArrayList();
            h5 h5Var = new h5(this, new AtomicInteger(0), arrayList, arrayList2, 22);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.k0) arrayList.get(i12)).d.f3398k;
                if (bArr == null) {
                    arrayList2.add(null);
                    h5Var.run();
                } else {
                    i9.w s10 = a0Var.f16050m.s(bArr);
                    arrayList2.add(s10);
                    Handler handler = a0Var.f16049l;
                    Objects.requireNonNull(handler);
                    s10.a(h5Var, new k2.c0(handler, 0));
                }
            }
            return;
        }
        k0.D(k0Var.f16216k, null);
    }

    public i0(i0 i0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.f16185e = i0Var;
        this.f16182a = n0Var;
        this.f16183b = str;
        this.f16184c = uri;
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
    public void i(int i10, k1 k1Var) {
    }

    @Override
    public void g(int i10, c1 c1Var, b2.x0 x0Var, boolean z10, boolean z11) {
    }
}
