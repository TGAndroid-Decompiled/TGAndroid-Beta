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
import m.e3;
import v7.l8;
public final class j0 implements i9.r, q {
    public b2.n0 f14579a;
    public String f14580b;
    public Uri f14581c;
    public long d;
    public final Object e;

    public j0(l0 l0Var) {
        this.e = l0Var;
        this.f14579a = b2.n0.K;
        this.f14580b = "";
        this.d = -9223372036854775807L;
    }

    @Override
    public void c(int i10, b2.x0 x0Var) {
        int i11;
        l0 l0Var = (l0) this.e;
        k1 k1Var = l0Var.f14596g.f14466t;
        if (k1Var.m0(20)) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (l0Var.f14605q != i11) {
            l0Var.f14605q = i11;
            ((n4.r) l0Var.f14599k.f14994b).f14975a.setFlags(i11 | 3);
        }
        l0Var.N(k1Var);
    }

    @Override
    public void d(int i10, m1 m1Var) {
        Bundle bundle = Bundle.EMPTY;
        n4.y yVar = ((l0) this.e).f14599k;
        String str = m1Var.f14618b;
        yVar.getClass();
        if (!TextUtils.isEmpty(str)) {
            n4.r rVar = (n4.r) yVar.f14994b;
            if (Build.VERSION.SDK_INT < 23) {
                synchronized (rVar.d) {
                    for (int beginBroadcast = rVar.f14978f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            ((n4.f) rVar.f14978f.getBroadcastItem(beginBroadcast)).t0(str);
                        } catch (RemoteException | SecurityException e) {
                            Log.e("MediaSessionCompat", "Dead object in sendSessionEvent.", e);
                        }
                    }
                    rVar.f14978f.finishBroadcast();
                }
            }
            rVar.f14975a.sendSessionEvent(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    @Override
    public void e(int i10, p1 p1Var, boolean z10, boolean z11, int i11) {
        l0 l0Var = (l0) this.e;
        l0Var.N(l0Var.f14596g.f14466t);
    }

    @Override
    public void h(Throwable th2) {
        if (this != ((l0) ((j0) this.e).e).f14604p) {
            return;
        }
        e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + th2.getMessage());
    }

    public void j(b2.e eVar) {
        l0 l0Var = (l0) this.e;
        l0Var.f14596g.f14466t.K().getClass();
        int e = k.e(eVar);
        n4.r rVar = (n4.r) l0Var.f14599k.f14994b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.f14975a.setPlaybackToLocal(builder.build());
    }

    public void k() {
        b2.e eVar;
        l0 l0Var = (l0) this.e;
        k1 k1Var = l0Var.f14596g.f14466t;
        k1Var.K().getClass();
        if (k1Var.m0(21)) {
            eVar = k1Var.I();
        } else {
            eVar = b2.e.h;
        }
        int e = k.e(eVar);
        n4.r rVar = (n4.r) l0Var.f14599k.f14994b;
        rVar.getClass();
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(e);
        rVar.f14975a.setPlaybackToLocal(builder.build());
    }

    public void l(b2.k0 k0Var) {
        l0 l0Var = (l0) this.e;
        n4.y yVar = l0Var.f14599k;
        r();
        if (k0Var == null) {
            ((n4.r) yVar.f14994b).e(0);
        } else {
            ((n4.r) yVar.f14994b).e(k.f(k0Var.d.f3142i));
        }
        l0Var.N(l0Var.f14596g.f14466t);
    }

    public void m(int r3, m4.k1 r4, m4.k1 r5) {
        throw new UnsupportedOperationException("Method not decompiled: m4.j0.m(int, m4.k1, m4.k1):void");
    }

    public void n(b2.n0 n0Var) {
        l0 l0Var = (l0) this.e;
        n4.y yVar = l0Var.f14599k;
        if (!TextUtils.equals(((n4.j) ((k2.u) yVar.f14995c).f13382b).f14957a.getQueueTitle(), n0Var.f3137a)) {
            ((n4.r) yVar.f14994b).f14975a.setQueueTitle((l0Var.v.a(17) && l0Var.f14596g.f14466t.t().a(17)) ? null : null);
        }
    }

    public void o(int i10) {
        n4.y yVar = ((l0) this.e).f14599k;
        int i11 = k.f14587a;
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
        n4.r rVar = (n4.r) yVar.f14994b;
        if (rVar.f14982k != i12) {
            rVar.f14982k = i12;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f14978f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f14978f.getBroadcastItem(beginBroadcast)).onRepeatModeChanged(i12);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setRepeatMode.", e);
                    }
                }
                rVar.f14978f.finishBroadcast();
            }
        }
    }

    @Override
    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        l0 l0Var = (l0) ((j0) this.e).e;
        if (this != l0Var.f14604p) {
            return;
        }
        l0.E(l0Var.f14599k, k.b(this.f14579a, this.f14580b, this.f14581c, this.d, bitmap));
        a0 a0Var = l0Var.f14596g;
        e2.d0.U(a0Var.f14461o, new u(a0Var, 1));
    }

    public void p(boolean z10) {
        n4.y yVar = ((l0) this.e).f14599k;
        int i10 = k.f14587a;
        n4.r rVar = (n4.r) yVar.f14994b;
        if (rVar.f14983l != z10) {
            rVar.f14983l = z10 ? 1 : 0;
            synchronized (rVar.d) {
                for (int beginBroadcast = rVar.f14978f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((n4.f) rVar.f14978f.getBroadcastItem(beginBroadcast)).h(z10 ? 1 : 0);
                    } catch (RemoteException | SecurityException e) {
                        Log.e("MediaSessionCompat", "Dead object in setShuffleMode.", e);
                    }
                }
                rVar.f14978f.finishBroadcast();
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
        a0 a0Var = l0Var.f14596g;
        k1 k1Var = a0Var.f14466t;
        b2.k0 P0 = k1Var.P0();
        b2.n0 R0 = k1Var.R0();
        long j10 = -9223372036854775807L;
        if ((!k1Var.m0(16) || !k1Var.M0()) && k1Var.m0(16)) {
            j10 = k1Var.getDuration();
        }
        if (P0 != null) {
            str = P0.f3072a;
        } else {
            str = "";
        }
        String str2 = str;
        Bitmap bitmap = null;
        if (P0 != null && (uri4 = P0.f3075f.f2998a) != null) {
            uri = uri4;
        } else {
            uri = null;
        }
        if (Objects.equals(this.f14579a, R0) && Objects.equals(this.f14580b, str2) && Objects.equals(this.f14581c, uri) && this.d == j10) {
            return;
        }
        this.f14580b = str2;
        this.f14581c = uri;
        this.f14579a = R0;
        this.d = j10;
        n4.y yVar = a0Var.f14459m;
        yVar.getClass();
        byte[] bArr = R0.f3144k;
        if (bArr != null) {
            wVar = yVar.n(bArr);
        } else {
            Uri uri5 = R0.f3146m;
            if (uri5 != null) {
                e3 e3Var = (e3) yVar.f14995c;
                if (e3Var != null && (uri2 = (Uri) e3Var.f14166c) != null && uri2.equals(uri5)) {
                    wVar = (i9.w) ((e3) yVar.f14995c).d;
                    e2.d.h(wVar);
                } else {
                    g2.i iVar = (g2.i) yVar.f14994b;
                    i9.w a2 = ((i9.y) iVar.f9361a).a(new com.google.firebase.messaging.h(2, iVar, uri5));
                    yVar.f14995c = new e3(uri5, a2);
                    wVar = a2;
                }
            } else {
                wVar = null;
            }
        }
        if (wVar != null) {
            l0Var.f14604p = null;
            if (wVar.isDone()) {
                try {
                    bitmap = (Bitmap) l8.a(wVar);
                } catch (CancellationException | ExecutionException e) {
                    e2.a.n("MediaSessionLegacyStub", "Failed to load bitmap: " + e.getMessage());
                }
            } else {
                j3 = j10;
                uri3 = uri;
                n0Var = R0;
                j0 j0Var = new j0(this, n0Var, str2, uri3, j3);
                str2 = str2;
                l0Var.f14604p = j0Var;
                Handler handler = a0Var.f14458l;
                Objects.requireNonNull(handler);
                wVar.a(new i9.s(0, wVar, j0Var), new k2.d0(handler, 0));
                l0.E(l0Var.f14599k, k.b(n0Var, str2, uri3, j3, bitmap));
            }
        }
        j3 = j10;
        uri3 = uri;
        n0Var = R0;
        l0.E(l0Var.f14599k, k.b(n0Var, str2, uri3, j3, bitmap));
    }

    public void s(b2.k1 k1Var) {
        l0 l0Var = (l0) this.e;
        a0 a0Var = l0Var.f14596g;
        k1 k1Var2 = a0Var.f14466t;
        if (l0Var.v.a(17) && k1Var2.t().a(17) && !k1Var.p()) {
            int i10 = k.f14587a;
            ArrayList arrayList = new ArrayList();
            b2.j1 j1Var = new b2.j1();
            for (int i11 = 0; i11 < k1Var.o(); i11++) {
                arrayList.add(k1Var.m(i11, j1Var, 0L).f3055c);
            }
            ArrayList arrayList2 = new ArrayList();
            i5 i5Var = new i5(this, new AtomicInteger(0), arrayList, arrayList2, 21);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                byte[] bArr = ((b2.k0) arrayList.get(i12)).d.f3144k;
                if (bArr == null) {
                    arrayList2.add(null);
                    i5Var.run();
                } else {
                    i9.w n10 = a0Var.f14459m.n(bArr);
                    arrayList2.add(n10);
                    Handler handler = a0Var.f14458l;
                    Objects.requireNonNull(handler);
                    n10.a(i5Var, new k2.d0(handler, 0));
                }
            }
            return;
        }
        l0.D(l0Var.f14599k, null);
    }

    public j0(j0 j0Var, b2.n0 n0Var, String str, Uri uri, long j3) {
        this.e = j0Var;
        this.f14579a = n0Var;
        this.f14580b = str;
        this.f14581c = uri;
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
    public void i(int i10, q1 q1Var) {
    }

    @Override
    public void g(int i10, i1 i1Var, b2.x0 x0Var, boolean z10, boolean z11) {
    }
}
