package i3;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.c0;
import com.google.android.exoplayer2.upstream.f0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.z0;
import d5.g0;
import d5.p;
import h3.c1;
import h3.c2;
import h3.n;
import h3.p2;
import h3.r2;
import h3.s0;
import h3.s2;
import h3.t0;
import h3.t1;
import h3.t2;
import h3.u2;
import h3.v1;
import j3.q;
import j3.s;
import j4.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import l3.l;

public final class i implements b {
    public b6.a A;
    public b6.a B;
    public b6.a C;
    public t0 D;
    public t0 E;
    public t0 F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public boolean M;

    public final Context f10549a;

    public final h f10550b;

    public final PlaybackSession f10551c;

    public String f10555r;

    public PlaybackMetrics.Builder f10556s;
    public int v;

    public v1 f10559y;

    public final r2 f10552e = new r2();

    public final p2 f10553f = new p2();

    public final HashMap f10554n = new HashMap();
    public final HashMap h = new HashMap();
    public final long d = SystemClock.elapsedRealtime();

    public int f10557w = 0;

    public int f10558x = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f10549a = context.getApplicationContext();
        this.f10551c = playbackSession;
        h hVar = new h();
        this.f10550b = hVar;
        hVar.d = this;
    }

    @Override
    public final void a(v1 v1Var) {
        this.f10559y = v1Var;
    }

    @Override
    public final void b(x xVar) {
        this.H = xVar.f12704a;
    }

    @Override
    public final void c(c2 c2Var, g5.b bVar) {
        int i10;
        boolean z10;
        p pVar;
        p pVar2;
        p pVar3;
        int i11;
        b6.a aVar;
        int i12;
        int i13;
        int i14;
        t0 t0Var;
        int i15;
        int i16;
        l3.d dVar;
        int i17;
        if (((d5.g) bVar.f6389b).f4794a.size() == 0) {
            return;
        }
        for (int i18 = 0; i18 < ((d5.g) bVar.f6389b).f4794a.size(); i18++) {
            int iA = ((d5.g) bVar.f6389b).a(i18);
            a aVar2 = (a) ((SparseArray) bVar.f6390c).get(iA);
            aVar2.getClass();
            if (iA == 0) {
                h hVar = this.f10550b;
                synchronized (hVar) {
                    try {
                        hVar.d.getClass();
                        s2 s2Var = hVar.f10547e;
                        hVar.f10547e = aVar2.f10517b;
                        Iterator it = hVar.f10546c.values().iterator();
                        while (it.hasNext()) {
                            g gVar = (g) it.next();
                            if (!gVar.b(s2Var, hVar.f10547e) || gVar.a(aVar2)) {
                                it.remove();
                                if (gVar.f10540e) {
                                    if (gVar.f10537a.equals(hVar.f10548f)) {
                                        hVar.f10548f = null;
                                    }
                                    hVar.d.n(aVar2, gVar.f10537a);
                                }
                            }
                        }
                        hVar.d(aVar2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iA == 11) {
                this.f10550b.f(aVar2, this.v);
            } else {
                this.f10550b.e(aVar2);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (bVar.k(0)) {
            a aVar3 = (a) ((SparseArray) bVar.f6390c).get(0);
            aVar3.getClass();
            if (this.f10556s != null) {
                l(aVar3.f10517b, aVar3.d);
            }
        }
        if (bVar.k(2) && this.f10556s != null) {
            p8.x xVarListIterator = c2Var.u().f8211a.listIterator(0);
            loop2: while (true) {
                if (!xVarListIterator.hasNext()) {
                    dVar = null;
                    break;
                }
                t2 t2Var = (t2) xVarListIterator.next();
                for (int i19 = 0; i19 < t2Var.f8200a; i19++) {
                    if (t2Var.f8203e[i19] && (dVar = t2Var.f8201b.d[i19].E) != null) {
                        break loop2;
                    }
                }
            }
            if (dVar != null) {
                PlaybackMetrics.Builder builder = this.f10556s;
                int i20 = g0.f4795a;
                int i21 = 0;
                while (true) {
                    if (i21 >= dVar.d) {
                        i17 = 1;
                        break;
                    }
                    UUID uuid = dVar.f15390a[i21].f15387b;
                    if (uuid.equals(h3.h.d)) {
                        i17 = 3;
                        break;
                    } else if (uuid.equals(h3.h.f7869e)) {
                        i17 = 2;
                        break;
                    } else {
                        if (uuid.equals(h3.h.f7868c)) {
                            i17 = 6;
                            break;
                        }
                        i21++;
                    }
                }
                builder.setDrmType(i17);
            }
        }
        if (bVar.k(1011)) {
            this.L++;
        }
        v1 v1Var = this.f10559y;
        if (v1Var == null) {
            i11 = 1;
        } else {
            int i22 = v1Var.f8216a;
            Context context = this.f10549a;
            boolean z11 = this.H == 4;
            if (i22 == 1001) {
                pVar = new p(20, 0);
            } else {
                if (v1Var instanceof n) {
                    n nVar = (n) v1Var;
                    z10 = nVar.f8028c == 1;
                    i10 = nVar.h;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                Throwable cause = v1Var.getCause();
                cause.getClass();
                int i23 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof h0) {
                        pVar3 = new p(5, ((h0) cause).d);
                    } else if ((cause instanceof com.google.android.exoplayer2.upstream.g0) || (cause instanceof t1)) {
                        pVar = new p(z11 ? 10 : 11, 0);
                    } else {
                        boolean z12 = cause instanceof f0;
                        if (z12 || (cause instanceof z0)) {
                            if (d5.x.f(context).g() == 1) {
                                pVar = new p(3, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    pVar = new p(6, 0);
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    pVar = new p(7, 0);
                                } else {
                                    pVar = (z12 && ((f0) cause).f2985c == 1) ? new p(4, 0) : new p(8, 0);
                                }
                            }
                        } else if (i22 == 1002) {
                            pVar = new p(21, 0);
                        } else if (cause instanceof l3.e) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i24 = g0.f4795a;
                            if (i24 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int iR = g0.r(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (g0.q(iR)) {
                                    case 6002:
                                        i23 = 24;
                                        break;
                                    case 6003:
                                        i23 = 28;
                                        break;
                                    case 6004:
                                        i23 = 25;
                                        break;
                                    case 6005:
                                        i23 = 26;
                                        break;
                                }
                                pVar3 = new p(i23, iR);
                            } else if (i24 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                pVar = new p(27, 0);
                            } else if (i24 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                pVar = new p(24, 0);
                            } else if (i24 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                pVar = new p(29, 0);
                            } else if (cause3 instanceof l) {
                                pVar = new p(23, 0);
                            } else {
                                pVar = cause3 instanceof l3.a ? new p(28, 0) : new p(30, 0);
                            }
                        } else if ((cause instanceof c0) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            pVar = (g0.f4795a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new p(32, 0) : new p(31, 0);
                        } else {
                            pVar = new p(9, 0);
                        }
                    }
                    pVar = pVar3;
                } else if (z10 && (i10 == 0 || i10 == 1)) {
                    pVar = new p(35, 0);
                } else if (z10 && i10 == 3) {
                    pVar = new p(15, 0);
                } else if (z10 && i10 == 2) {
                    pVar = new p(23, 0);
                } else {
                    if (cause instanceof y3.p) {
                        pVar2 = new p(13, g0.r(((y3.p) cause).d));
                    } else if (cause instanceof y3.l) {
                        pVar = new p(14, g0.r(((y3.l) cause).f49494a));
                    } else if (cause instanceof OutOfMemoryError) {
                        pVar = new p(14, 0);
                    } else if (cause instanceof q) {
                        pVar2 = new p(17, ((q) cause).f12400a);
                    } else if (cause instanceof s) {
                        pVar2 = new p(18, ((s) cause).f12434a);
                    } else if (g0.f4795a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                        pVar = new p(22, 0);
                    } else {
                        int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                        switch (g0.q(errorCode)) {
                            case 6002:
                                i23 = 24;
                                break;
                            case 6003:
                                i23 = 28;
                                break;
                            case 6004:
                                i23 = 25;
                                break;
                            case 6005:
                                i23 = 26;
                                break;
                        }
                        pVar2 = new p(i23, errorCode);
                    }
                    pVar = pVar2;
                }
                this.f10551c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.d).setErrorCode(pVar.f4821a).setSubErrorCode(pVar.f4822b).setException(v1Var).build());
                i11 = 1;
                this.M = true;
                this.f10559y = null;
            }
            this.f10551c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.d).setErrorCode(pVar.f4821a).setSubErrorCode(pVar.f4822b).setException(v1Var).build());
            i11 = 1;
            this.M = true;
            this.f10559y = null;
        }
        if (bVar.k(2)) {
            u2 u2VarU = c2Var.u();
            boolean zA = u2VarU.a(2);
            boolean zA2 = u2VarU.a(i11);
            boolean zA3 = u2VarU.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    t0Var = null;
                } else {
                    t0Var = null;
                    if (!g0.a(this.D, null)) {
                        int i25 = this.D == null ? 1 : 0;
                        this.D = null;
                        i12 = 4;
                        o(1, jElapsedRealtime, null, i25);
                    }
                    if (!zA2 && !g0.a(this.E, t0Var)) {
                        if (this.E == null) {
                            i16 = 1;
                        } else {
                            i16 = 0;
                        }
                        this.E = t0Var;
                        o(0, jElapsedRealtime, t0Var, i16);
                    }
                    if (!zA3 && !g0.a(this.F, t0Var)) {
                        if (this.F == null) {
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                        this.F = t0Var;
                        o(2, jElapsedRealtime, t0Var, i15);
                    }
                    aVar = t0Var;
                }
                i12 = 4;
                if (!zA2) {
                    if (this.E == null) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    this.E = t0Var;
                    o(0, jElapsedRealtime, t0Var, i16);
                }
                if (!zA3) {
                    if (this.F == null) {
                        i15 = 1;
                    } else {
                        i15 = 0;
                    }
                    this.F = t0Var;
                    o(2, jElapsedRealtime, t0Var, i15);
                }
                aVar = t0Var;
            } else {
                aVar = 0;
                i12 = 4;
            }
        } else {
            aVar = 0;
            i12 = 4;
        }
        if (j(this.A)) {
            b6.a aVar4 = this.A;
            t0 t0Var2 = (t0) aVar4.d;
            if (t0Var2.H != -1) {
                int i26 = aVar4.f2034c;
                if (!g0.a(this.D, t0Var2)) {
                    int i27 = (this.D == null && i26 == 0) ? 1 : i26;
                    this.D = t0Var2;
                    o(1, jElapsedRealtime, t0Var2, i27);
                }
                this.A = aVar;
            }
        }
        if (j(this.B)) {
            b6.a aVar5 = this.B;
            t0 t0Var3 = (t0) aVar5.d;
            int i28 = aVar5.f2034c;
            if (!g0.a(this.E, t0Var3)) {
                int i29 = (this.E == null && i28 == 0) ? 1 : i28;
                this.E = t0Var3;
                o(0, jElapsedRealtime, t0Var3, i29);
            }
            this.B = aVar;
        }
        if (j(this.C)) {
            b6.a aVar6 = this.C;
            t0 t0Var4 = (t0) aVar6.d;
            int i30 = aVar6.f2034c;
            if (!g0.a(this.F, t0Var4)) {
                int i31 = (this.F == null && i30 == 0) ? 1 : i30;
                this.F = t0Var4;
                o(2, jElapsedRealtime, t0Var4, i31);
            }
            this.C = aVar;
        }
        switch (d5.x.f(this.f10549a).g()) {
            case 0:
                i13 = 0;
                break;
            case 1:
                i13 = 9;
                break;
            case 2:
                i13 = 2;
                break;
            case 3:
                i13 = 4;
                break;
            case 4:
                i13 = 5;
                break;
            case 5:
                i13 = 6;
                break;
            case 6:
            case 8:
            default:
                i13 = 1;
                break;
            case 7:
                i13 = 3;
                break;
            case 9:
                i13 = 8;
                break;
            case 10:
                i13 = 7;
                break;
        }
        if (i13 != this.f10558x) {
            this.f10558x = i13;
            this.f10551c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i13).setTimeSinceCreatedMillis(jElapsedRealtime - this.d).build());
        }
        if (c2Var.b() != 2) {
            this.G = false;
        }
        if (c2Var.v() == null) {
            this.I = false;
        } else if (bVar.k(10)) {
            this.I = true;
        }
        int iB = c2Var.b();
        if (this.G) {
            i14 = 5;
        } else if (this.I) {
            i14 = 13;
        } else if (iB == i12) {
            i14 = 11;
        } else if (iB == 2) {
            int i32 = this.f10557w;
            if (i32 == 0 || i32 == 2) {
                i14 = 2;
            } else if (c2Var.h()) {
                i14 = c2Var.z() != 0 ? 10 : 6;
            } else {
                i14 = 7;
            }
        } else if (iB != 3) {
            i14 = (iB != 1 || this.f10557w == 0) ? this.f10557w : 12;
        } else if (c2Var.h()) {
            i14 = c2Var.z() != 0 ? 9 : 3;
        } else {
            i14 = 4;
        }
        if (this.f10557w != i14) {
            this.f10557w = i14;
            this.M = true;
            this.f10551c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f10557w).setTimeSinceCreatedMillis(jElapsedRealtime - this.d).build());
        }
        if (bVar.k(1028)) {
            h hVar2 = this.f10550b;
            a aVar7 = (a) ((SparseArray) bVar.f6390c).get(1028);
            aVar7.getClass();
            hVar2.a(aVar7);
        }
    }

    @Override
    public final void d(e5.x xVar) {
        b6.a aVar = this.A;
        if (aVar != null) {
            t0 t0Var = (t0) aVar.d;
            if (t0Var.H == -1) {
                s0 s0VarA = t0Var.a();
                s0VarA.f8140t = xVar.f5308a;
                s0VarA.f8141u = xVar.f5309b;
                this.A = new b6.a(new t0(s0VarA), aVar.f2034c, (String) aVar.f2033b, 10);
            }
        }
    }

    @Override
    public final void e(int i10) {
        if (i10 == 1) {
            this.G = true;
        }
        this.v = i10;
    }

    @Override
    public final void g(a aVar, x xVar) {
        j4.c0 c0Var = aVar.d;
        if (c0Var == null) {
            return;
        }
        t0 t0Var = xVar.f12706c;
        t0Var.getClass();
        int i10 = xVar.d;
        s2 s2Var = aVar.f10517b;
        c0Var.getClass();
        b6.a aVar2 = new b6.a(t0Var, i10, this.f10550b.c(s2Var, c0Var), 10);
        int i11 = xVar.f12705b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.B = aVar2;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.C = aVar2;
                return;
            }
        }
        this.A = aVar2;
    }

    @Override
    public final void h(k3.f fVar) {
        this.J += fVar.f14423g;
        this.K += fVar.f14421e;
    }

    @Override
    public final void i(a aVar, int i10, long j10) {
        j4.c0 c0Var = aVar.d;
        if (c0Var != null) {
            String strC = this.f10550b.c(aVar.f10517b, c0Var);
            HashMap map = this.f10554n;
            Long l10 = (Long) map.get(strC);
            HashMap map2 = this.h;
            Long l11 = (Long) map2.get(strC);
            map.put(strC, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            map2.put(strC, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    public final boolean j(b6.a aVar) {
        String str;
        if (aVar == null) {
            return false;
        }
        String str2 = (String) aVar.f2033b;
        h hVar = this.f10550b;
        synchronized (hVar) {
            str = hVar.f10548f;
        }
        return str2.equals(str);
    }

    public final void k() {
        PlaybackMetrics.Builder builder = this.f10556s;
        if (builder != null && this.M) {
            builder.setAudioUnderrunCount(this.L);
            this.f10556s.setVideoFramesDropped(this.J);
            this.f10556s.setVideoFramesPlayed(this.K);
            Long l10 = (Long) this.h.get(this.f10555r);
            this.f10556s.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.f10554n.get(this.f10555r);
            this.f10556s.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f10556s.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f10551c.reportPlaybackMetrics(this.f10556s.build());
        }
        this.f10556s = null;
        this.f10555r = null;
        this.L = 0;
        this.J = 0;
        this.K = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.M = false;
    }

    public final void l(s2 s2Var, j4.c0 c0Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.f10556s;
        if (c0Var == null || (iB = s2Var.b(c0Var.f12503a)) == -1) {
            return;
        }
        p2 p2Var = this.f10553f;
        int i10 = 0;
        s2Var.f(iB, p2Var, false);
        int i11 = p2Var.f8069c;
        r2 r2Var = this.f10552e;
        s2Var.n(i11, r2Var);
        c1 c1Var = r2Var.f8114c.f7830b;
        if (c1Var != null) {
            int iC = g0.C(c1Var.f7795a);
            if (iC == 0) {
                i10 = 3;
            } else if (iC != 1) {
                i10 = iC != 2 ? 1 : 4;
            } else {
                i10 = 5;
            }
        }
        builder.setStreamType(i10);
        if (r2Var.f8122y != -9223372036854775807L && !r2Var.f8120w && !r2Var.f8118r && !r2Var.a()) {
            builder.setMediaDurationMillis(g0.S(r2Var.f8122y));
        }
        builder.setPlaybackType(r2Var.a() ? 2 : 1);
        this.M = true;
    }

    public final void m(a aVar, String str) {
        j4.c0 c0Var = aVar.d;
        if (c0Var == null || !c0Var.a()) {
            k();
            this.f10555r = str;
            this.f10556s = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.3");
            l(aVar.f10517b, c0Var);
        }
    }

    public final void n(a aVar, String str) {
        j4.c0 c0Var = aVar.d;
        if ((c0Var == null || !c0Var.a()) && str.equals(this.f10555r)) {
            k();
        }
        this.h.remove(str);
        this.f10554n.remove(str);
    }

    public final void o(int i10, long j10, t0 t0Var, int i11) {
        int i12;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.d);
        if (t0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    i12 = i11 != 3 ? 1 : 4;
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str = t0Var.A;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = t0Var.B;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = t0Var.f8190r;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = t0Var.f8189n;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = t0Var.G;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = t0Var.H;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = t0Var.O;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = t0Var.P;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = t0Var.f8186c;
            if (str4 != null) {
                int i18 = g0.f4795a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = t0Var.I;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.M = true;
        this.f10551c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override
    public final void f(a aVar) {
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
