package m2;

import a8.xa;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import e2.g0;
import e2.i1;
import e2.k1;
import e2.l1;
import e2.t;
import e2.u;
import e2.v0;
import e2.x1;
import h2.l0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kg.t1;
import x2.b0;
import x2.f0;
public final class h implements b {
    public v0 F;
    public xa G;
    public xa H;
    public xa I;
    public u J;
    public u K;
    public u L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context f20144a;
    public final g f20146c;
    public final PlaybackSession d;
    public String f20151s;
    public PlaybackMetrics.Builder f20152w;
    public int f20153x;
    public final Executor f20145b = h2.a.e();
    public final k1 f20148f = new k1();
    public final i1 h = new i1();
    public final HashMap f20150r = new HashMap();
    public final HashMap f20149n = new HashMap();
    public final long f20147e = SystemClock.elapsedRealtime();
    public int f20154y = 0;
    public int E = 0;

    public h(Context context, PlaybackSession playbackSession) {
        this.f20144a = context.getApplicationContext();
        this.d = playbackSession;
        g gVar = new g();
        this.f20146c = gVar;
        gVar.d = this;
    }

    public static h g(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new h(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override
    public final void A(e2.c1 r23, ji.j r24) {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.A(e2.c1, ji.j):void");
    }

    @Override
    public final void C(a aVar, int i7) {
        if (i7 == 1) {
            this.M = true;
        }
        this.f20153x = i7;
    }

    @Override
    public final void G(v0 v0Var) {
        this.F = v0Var;
    }

    public final boolean f(xa xaVar) {
        String str;
        if (xaVar != null) {
            String str2 = (String) xaVar.d;
            g gVar = this.f20146c;
            synchronized (gVar) {
                str = gVar.f20142f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h() {
        long longValue;
        long longValue2;
        int i7;
        PlaybackMetrics.Builder builder = this.f20152w;
        if (builder != null && this.S) {
            builder.setAudioUnderrunCount(this.R);
            this.f20152w.setVideoFramesDropped(this.P);
            this.f20152w.setVideoFramesPlayed(this.Q);
            Long l10 = (Long) this.f20149n.get(this.f20151s);
            PlaybackMetrics.Builder builder2 = this.f20152w;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f20150r.get(this.f20151s);
            PlaybackMetrics.Builder builder3 = this.f20152w;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f20152w;
            if (l11 != null && l11.longValue() > 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            builder4.setStreamSource(i7);
            this.f20145b.execute(new t1(18, this, this.f20152w.build()));
        }
        this.f20152w = null;
        this.f20151s = null;
        this.R = 0;
        this.P = 0;
        this.Q = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.S = false;
    }

    public final LogSessionId i() {
        return this.d.getSessionId();
    }

    public final void j(l1 l1Var, f0 f0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.f20152w;
        if (f0Var == null || (b10 = l1Var.b(f0Var.f59523a)) == -1) {
            return;
        }
        i1 i1Var = this.h;
        int i7 = 0;
        l1Var.f(b10, i1Var, false);
        int i10 = i1Var.f10118c;
        k1 k1Var = this.f20148f;
        l1Var.n(i10, k1Var);
        g0 g0Var = k1Var.f10162c.f10186b;
        int i11 = 2;
        if (g0Var != null) {
            int K = l0.K(g0Var.f10095a, g0Var.f10096b);
            if (K != 0) {
                if (K != 1) {
                    if (K != 2) {
                        i7 = 1;
                    } else {
                        i7 = 4;
                    }
                } else {
                    i7 = 5;
                }
            } else {
                i7 = 3;
            }
        }
        builder.setStreamType(i7);
        if (k1Var.f10170m != -9223372036854775807L && !k1Var.f10168k && !k1Var.f10166i && !k1Var.a()) {
            builder.setMediaDurationMillis(l0.h0(k1Var.f10170m));
        }
        if (!k1Var.a()) {
            i11 = 1;
        }
        builder.setPlaybackType(i11);
        this.S = true;
    }

    @Override
    public final void k(b0 b0Var) {
        this.N = b0Var.f59496a;
    }

    public final void l(a aVar, String str) {
        f0 f0Var = aVar.d;
        if (f0Var != null && f0Var.b()) {
            return;
        }
        h();
        this.f20151s = str;
        this.f20152w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
        j(aVar.f20113b, f0Var);
    }

    public final void m(a aVar, String str) {
        f0 f0Var = aVar.d;
        if ((f0Var == null || !f0Var.b()) && str.equals(this.f20151s)) {
            h();
        }
        this.f20149n.remove(str);
        this.f20150r.remove(str);
    }

    public final void n(int i7, long j3, u uVar, int i10) {
        int i11;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i7).setTimeSinceCreatedMillis(j3 - this.f20147e);
        if (uVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    if (i10 != 3) {
                        i11 = 1;
                    } else {
                        i11 = 4;
                    }
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str2 = uVar.f10450r;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = uVar.f10451s;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = uVar.f10443k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i12 = uVar.f10442j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = uVar.f10457z;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = uVar.A;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = uVar.K;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = uVar.L;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str5 = uVar.d;
            if (str5 != null) {
                String str6 = l0.f13471a;
                String[] split = str5.split("-", -1);
                String str7 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str7, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = uVar.D;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.S = true;
        this.f20145b.execute(new t1(15, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void p(a aVar, int i7, long j3) {
        long longValue;
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            String d = this.f20146c.d(aVar.f20113b, f0Var);
            HashMap hashMap = this.f20150r;
            Long l10 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f20149n;
            Long l11 = (Long) hashMap2.get(d);
            long j10 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap.put(d, Long.valueOf(longValue + j3));
            if (l11 != null) {
                j10 = l11.longValue();
            }
            hashMap2.put(d, Long.valueOf(j10 + i7));
        }
    }

    @Override
    public final void r(a aVar, b0 b0Var) {
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            u uVar = b0Var.f59498c;
            uVar.getClass();
            int i7 = b0Var.d;
            l1 l1Var = aVar.f20113b;
            f0Var.getClass();
            xa xaVar = new xa(uVar, i7, this.f20146c.d(l1Var, f0Var));
            int i10 = b0Var.f59497b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        this.I = xaVar;
                        return;
                    }
                } else {
                    this.H = xaVar;
                    return;
                }
            }
            this.G = xaVar;
        }
    }

    @Override
    public final void w(x1 x1Var) {
        xa xaVar = this.G;
        if (xaVar != null) {
            u uVar = (u) xaVar.f714c;
            if (uVar.A == -1) {
                t a10 = uVar.a();
                a10.f10405y = x1Var.f10485a;
                a10.f10406z = x1Var.f10486b;
                this.G = new xa(new u(a10), xaVar.f713b, (String) xaVar.d);
            }
        }
    }

    @Override
    public final void z(l2.d dVar) {
        this.P += dVar.f18915g;
        this.Q += dVar.f18913e;
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
