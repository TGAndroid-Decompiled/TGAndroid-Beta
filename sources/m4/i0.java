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
import v7.l8;
public final class i0 implements i9.r, q {
    public b2.n0 f15983a;
    public String f15984b;
    public Uri f15985c;
    public long d;
    public final Object f15986e;

    public i0(k0 k0Var) {
        this.f15986e = k0Var;
        this.f15983a = b2.n0.K;
        this.f15984b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.x0 x0Var) {
        int i11;
        k0 k0Var = (k0) this.f15986e;
        j1 j1Var = k0Var.f15997g.f15870t;
        if (j1Var.m0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (k0Var.f16006q != i11) {
            k0Var.f16006q = i11;
            ((n4.r) k0Var.f16000k.f16523b).f16503a.setFlags(i11 | 3);
        }
        k0Var.N(j1Var);
    }

    @Override
    public void d(int i10, l1 l1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.y yVar = ((k0) this.f15986e).f16000k;
        String str = l1Var.f16026b;
        yVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            n4.r rVar = (n4.r) yVar.f16523b;
            if (Build.VERSION.SDK_INT < 23) {
                synchronized (rVar.d) {
                    for (int beginBroadcast = rVar.f16507f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((n4.f) rVar.f16507f.getBroadcastItem(beginBroadcast)).t0(str);
                        } catch (RemoteException | SecurityException e7) {
                            Log.e("MediaSessionCompat", "Dead object in sendSessionEvent.", e7);
                        }
                    }
                    rVar.f16507f.finishBroadcast();
                }
            }
            rVar.f16503a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void e(int i10, o1 o1Var, boolean z10, boolean z11, int i11) {
        k0 k0Var = (k0) this.f15986e;
        k0Var.N(k0Var.f15997g.f15870t);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((k0) ((i0) this.f15986e).f15986e).f16005p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        k0 k0Var = (k0) this.f15986e;
        k0Var.f15997g.f15870t.K().getClass();
        int e7 = k.e(eVar);
        n4.r rVar = (n4.r) k0Var.f16000k.f16523b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e7);
        rVar.f16503a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        b2.e eVar;
        k0 k0Var = (k0) this.f15986e;
        j1 j1Var = k0Var.f15997g.f15870t;
        j1Var.K().getClass();
        if (j1Var.m0(21)) {
            eVar = j1Var.I();
        } else {
            eVar = b2.e.h;
        }
        int e7 = k.e(eVar);
        n4.r rVar = (n4.r) k0Var.f16000k.f16523b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e7);
        rVar.f16503a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        k0 k0Var2 = (k0) this.f15986e;
        n4.y yVar = k0Var2.f16000k;
        r();
        if (k0Var == null) {
            ((n4.r) yVar.f16523b).e(0);
        } else {
            ((n4.r) yVar.f16523b).e(k.f(k0Var.d.f2229i));
        }
        k0Var2.N(k0Var2.f15997g.f15870t);
    }

    public void m(int r3, m4.j1 r4, m4.j1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.i0.m(int, m4.j1, m4.j1):void");
    }

    public void n(b2.n0 n0Var) {
        k0 k0Var = (k0) this.f15986e;
        n4.y yVar = k0Var.f16000k;
        if (!TextUtils.equals(((n4.j) ((k2.g0) yVar.f16524c).f14604b).f16482a.getQueueTitle(), n0Var.f2223a)) {
            ((n4.r) yVar.f16523b).f16503a.setQueueTitle((k0Var.v.a(17) && k0Var.f15997g.f15870t.t().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.y yVar = ((k0) this.f15986e).f16000k;
        int i11 = k.f15994a;
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
        n4.r rVar = (n4.r) yVar.f16523b;
        if (rVar.f16511k != i12) {
            rVar.f16511k = i12;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f16507f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f16507f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e7) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e7);
                    }
                }
                rVar.f16507f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        k0 k0Var = (k0) ((i0) this.f15986e).f15986e;
        if (this != k0Var.f16005p) {
            return;
        }
        k0.E(k0Var.f16000k, k.b(this.f15983a, this.f15984b, this.f15985c, this.d, bitmap));
        a0 a0Var = k0Var.f15997g;
        e2.d0.U(a0Var.f15865o, new u(a0Var, 1));
    }

    public void p(boolean z10) {
        n4.y yVar = ((k0) this.f15986e).f16000k;
        int i10 = k.f15994a;
        n4.r rVar = (n4.r) yVar.f16523b;
        if (rVar.f16512l != z10) {
            rVar.f16512l = z10 ? 1 : 0;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f16507f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f16507f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e7) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e7);
                    }
                }
                rVar.f16507f.finishBroadcast();
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
        k0 k0Var = (k0) this.f15986e;
        a0 a0Var = k0Var.f15997g;
        j1 j1Var = a0Var.f15870t;
        b2.k0 P0 = j1Var.P0();
        b2.n0 R0 = j1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!j1Var.m0(16) || !j1Var.M0()) && j1Var.m0(16)) {
            j10 = j1Var.getDuration();
        }
        if (P0 != null) {
            str = P0.f2153a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (P0 != null && (uri4 = P0.f2157f.f2072a) != null) {
            uri = uri4;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f15983a, R0) && Objects.equals(this.f15984b, str2) && Objects.equals(this.f15985c, uri) && this.d == j10) {
            return;
        }
        this.f15984b = str2;
        this.f15985c = uri;
        this.f15983a = R0;
        this.d = j10;
        n4.y yVar = a0Var.f15863m;
        yVar.getClass();
        byte[] bArr = R0.f2231k;
        if (bArr != null) {
            wVar = yVar.B(bArr);
        } else {
            Uri uri5 = R0.f2233m;
            if (uri5 != null) {
                m2.t tVar = (m2.t) yVar.f16524c;
                if (tVar != null && (uri2 = (Uri) tVar.f15845c) != null && uri2.equals(uri5)) {
                    wVar = (i9.w) ((m2.t) yVar.f16524c).d;
                    e2.d.h(wVar);
                } else {
                    g2.i iVar = (g2.i) yVar.f16523b;
                    i9.w a2 = ((i9.y) iVar.f10342a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    yVar.f16524c = new m2.t(uri5, a2);
                    wVar = a2;
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            k0Var.f16005p = null;
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
                k0Var.f16005p = i0Var;
                Handler handler = a0Var.f15862l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, i0Var), new k2.a0(handler, 0));
                k0.E(k0Var.f16000k, k.b(n0Var, str2, uri3, j3, bitmap));
            }
        }
        j3 = j10;
        uri3 = uri;
        n0Var = R0;
        k0.E(k0Var.f16000k, k.b(n0Var, str2, uri3, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        k0 k0Var = (k0) this.f15986e;
        a0 a0Var = k0Var.f15997g;
        j1 j1Var = a0Var.f15870t;
        if (k0Var.v.a(17) && j1Var.t().a(17) && !k1Var.p()) {
            int i10 = k.f15994a;
            ArrayList arrayList = new ArrayList();
            b2.j1 j1Var2 = new b2.j1();
            for (int i11 = 0; i11 < k1Var.o(); i11++) {
                arrayList.add(k1Var.m(i11, j1Var2, 0L).f2135c);
            }
            ArrayList arrayList2 = new ArrayList();
            androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(this, new AtomicInteger(0), arrayList, arrayList2, 22);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.k0) arrayList.get(i12)).d.f2231k;
                if (bArr == null) {
                    arrayList2.add(null);
                    bVar.run();
                } else {
                    i9.w B = a0Var.f15863m.B(bArr);
                    arrayList2.add(B);
                    Handler handler = a0Var.f15862l;
                    Objects.requireNonNull(handler);
                    B.a(bVar, new k2.a0(handler, 0));
                }
            }
            return;
        }
        k0.D(k0Var.f16000k, null);
    }

    public i0(i0 i0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.f15986e = i0Var;
        this.f15983a = n0Var;
        this.f15984b = str;
        this.f15985c = uri;
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
