package m2;

import a8.wa;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import e2.i1;
import e2.k1;
import e2.l1;
import e2.t;
import e2.u;
import e2.v0;
import e2.x1;
import h2.m0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import li.j3;
import x2.c0;
import x2.g0;
public final class h implements b {
    public v0 E;
    public wa F;
    public wa G;
    public wa H;
    public u I;
    public u J;
    public u K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public final Context f19545a;
    public final g f19547c;
    public final PlaybackSession d;
    public String f19552s;
    public PlaybackMetrics.Builder f19553w;
    public int f19554x;
    public final Executor f19546b = h2.a.e();
    public final k1 f19549f = new k1();
    public final i1 h = new i1();
    public final HashMap f19551r = new HashMap();
    public final HashMap f19550n = new HashMap();
    public final long f19548e = SystemClock.elapsedRealtime();
    public int f19555y = 0;
    public int D = 0;

    public h(Context context, PlaybackSession playbackSession) {
        this.f19545a = context.getApplicationContext();
        this.d = playbackSession;
        g gVar = new g();
        this.f19547c = gVar;
        gVar.d = this;
    }

    public static h i(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new h(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override
    public final void A(a aVar, int i7) {
        if (i7 == 1) {
            this.L = true;
        }
        this.f19554x = i7;
    }

    @Override
    public final void E(e2.c1 r21, wf.b r22) {
        throw new UnsupportedOperationException("Method not decompiled: m2.h.E(e2.c1, wf.b):void");
    }

    @Override
    public final void G(v0 v0Var) {
        this.E = v0Var;
    }

    @Override
    public final void b(c0 c0Var) {
        this.M = c0Var.f58211a;
    }

    @Override
    public final void d(a aVar, int i7, long j3) {
        long longValue;
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.f19547c.d(aVar.f19516b, g0Var);
            HashMap hashMap = this.f19551r;
            Long l10 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f19550n;
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

    public final boolean h(wa waVar) {
        String str;
        if (waVar != null) {
            String str2 = (String) waVar.d;
            g gVar = this.f19547c;
            synchronized (gVar) {
                str = gVar.f19543f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j() {
        long longValue;
        long longValue2;
        int i7;
        PlaybackMetrics.Builder builder = this.f19553w;
        if (builder != null && this.R) {
            builder.setAudioUnderrunCount(this.Q);
            this.f19553w.setVideoFramesDropped(this.O);
            this.f19553w.setVideoFramesPlayed(this.P);
            Long l10 = (Long) this.f19550n.get(this.f19552s);
            PlaybackMetrics.Builder builder2 = this.f19553w;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f19551r.get(this.f19552s);
            PlaybackMetrics.Builder builder3 = this.f19553w;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f19553w;
            if (l11 != null && l11.longValue() > 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            builder4.setStreamSource(i7);
            this.f19546b.execute(new j3(7, this, this.f19553w.build()));
        }
        this.f19553w = null;
        this.f19552s = null;
        this.Q = 0;
        this.O = 0;
        this.P = 0;
        this.I = null;
        this.J = null;
        this.K = null;
        this.R = false;
    }

    public final LogSessionId k() {
        return this.d.getSessionId();
    }

    public final void l(l1 l1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.f19553w;
        if (g0Var == null || (b10 = l1Var.b(g0Var.f58235a)) == -1) {
            return;
        }
        i1 i1Var = this.h;
        int i7 = 0;
        l1Var.f(b10, i1Var, false);
        int i10 = i1Var.f10282c;
        k1 k1Var = this.f19549f;
        l1Var.n(i10, k1Var);
        e2.g0 g0Var2 = k1Var.f10326c.f10350b;
        int i11 = 2;
        if (g0Var2 != null) {
            int K = m0.K(g0Var2.f10259a, g0Var2.f10260b);
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
        if (k1Var.f10334m != -9223372036854775807L && !k1Var.f10332k && !k1Var.f10330i && !k1Var.a()) {
            builder.setMediaDurationMillis(m0.h0(k1Var.f10334m));
        }
        if (!k1Var.a()) {
            i11 = 1;
        }
        builder.setPlaybackType(i11);
        this.R = true;
    }

    public final void m(a aVar, String str) {
        g0 g0Var = aVar.d;
        if (g0Var != null && g0Var.b()) {
            return;
        }
        j();
        this.f19552s = str;
        this.f19553w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
        l(aVar.f19516b, g0Var);
    }

    public final void n(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.f19552s)) {
            j();
        }
        this.f19550n.remove(str);
        this.f19551r.remove(str);
    }

    public final void o(int i7, long j3, u uVar, int i10) {
        int i11;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i7).setTimeSinceCreatedMillis(j3 - this.f19548e);
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
            String str2 = uVar.f10614r;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = uVar.f10615s;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = uVar.f10607k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i12 = uVar.f10606j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = uVar.f10621z;
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
                String str6 = m0.f14112a;
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
        this.R = true;
        this.f19546b.execute(new j3(4, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void r(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            u uVar = c0Var.f58213c;
            uVar.getClass();
            int i7 = c0Var.d;
            l1 l1Var = aVar.f19516b;
            g0Var.getClass();
            wa waVar = new wa(uVar, i7, this.f19547c.d(l1Var, g0Var));
            int i10 = c0Var.f58212b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        this.H = waVar;
                        return;
                    }
                } else {
                    this.G = waVar;
                    return;
                }
            }
            this.F = waVar;
        }
    }

    @Override
    public final void w(x1 x1Var) {
        wa waVar = this.F;
        if (waVar != null) {
            u uVar = (u) waVar.f701c;
            if (uVar.A == -1) {
                t a10 = uVar.a();
                a10.f10569y = x1Var.f10649a;
                a10.f10570z = x1Var.f10650b;
                this.F = new wa(new u(a10), waVar.f700b, (String) waVar.d);
            }
        }
    }

    @Override
    public final void z(l2.d dVar) {
        this.O += dVar.f17778g;
        this.P += dVar.f17776e;
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
