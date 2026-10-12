package j2;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import b2.b2;
import b2.k0;
import b2.m1;
import b2.o1;
import b2.p1;
import b2.w;
import b2.x;
import b2.z0;
import e2.m0;
import fi.q3;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u2.c0;
import u2.g0;
public final class i implements b {
    public z0 E;
    public a5.a F;
    public a5.a G;
    public a5.a H;
    public x I;
    public x J;
    public x K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public final Context f12542a;
    public final h f12544c;
    public final PlaybackSession d;
    public String f12548s;
    public PlaybackMetrics.Builder v;
    public int f12549w;
    public final Executor f12543b = e2.a.e();
    public final o1 f12545f = new o1();
    public final m1 h = new m1();
    public final HashMap f12547r = new HashMap();
    public final HashMap f12546n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int f12550x = 0;
    public int f12551y = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f12542a = context.getApplicationContext();
        this.d = playbackSession;
        h hVar = new h();
        this.f12544c = hVar;
        hVar.d = this;
    }

    public static i o(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new i(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override
    public final void a(i2.e eVar) {
        this.O += eVar.f10944g;
        this.P += eVar.e;
    }

    @Override
    public final void b(c0 c0Var) {
        this.M = c0Var.f45877a;
    }

    @Override
    public final void c(b2 b2Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            x xVar = (x) aVar.d;
            if (xVar.A == -1) {
                w a2 = xVar.a();
                a2.f2472y = b2Var.f2083a;
                a2.f2473z = b2Var.f2084b;
                this.F = new a5.a(new x(a2), aVar.f279b, (String) aVar.f280c, 9);
            }
        }
    }

    @Override
    public final void d(b2.g1 r21, qf.b r22) {
        throw new UnsupportedOperationException("Method not decompiled: j2.i.d(b2.g1, qf.b):void");
    }

    @Override
    public final void e(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            x xVar = c0Var.f45879c;
            xVar.getClass();
            int i10 = c0Var.d;
            p1 p1Var = aVar.f12514b;
            g0Var.getClass();
            a5.a aVar2 = new a5.a(xVar, i10, this.f12544c.d(p1Var, g0Var), 9);
            int i11 = c0Var.f45878b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                        this.H = aVar2;
                        return;
                    }
                } else {
                    this.G = aVar2;
                    return;
                }
            }
            this.F = aVar2;
        }
    }

    @Override
    public final void f(a aVar, int i10, long j10) {
        long longValue;
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.f12544c.d(aVar.f12514b, g0Var);
            HashMap hashMap = this.f12547r;
            Long l4 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f12546n;
            Long l10 = (Long) hashMap2.get(d);
            long j11 = 0;
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            hashMap.put(d, Long.valueOf(longValue + j10));
            if (l10 != null) {
                j11 = l10.longValue();
            }
            hashMap2.put(d, Long.valueOf(j11 + i10));
        }
    }

    @Override
    public final void g(a aVar, int i10) {
        if (i10 == 1) {
            this.L = true;
        }
        this.f12549w = i10;
    }

    @Override
    public final void h(z0 z0Var) {
        this.E = z0Var;
    }

    public final boolean n(a5.a aVar) {
        String str;
        if (aVar != null) {
            String str2 = (String) aVar.f280c;
            h hVar = this.f12544c;
            synchronized (hVar) {
                str = hVar.f12540f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics.Builder builder = this.v;
        if (builder != null && this.R) {
            builder.setAudioUnderrunCount(this.Q);
            this.v.setVideoFramesDropped(this.O);
            this.v.setVideoFramesPlayed(this.P);
            Long l4 = (Long) this.f12546n.get(this.f12548s);
            PlaybackMetrics.Builder builder2 = this.v;
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l10 = (Long) this.f12547r.get(this.f12548s);
            PlaybackMetrics.Builder builder3 = this.v;
            if (l10 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l10.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.v;
            if (l10 != null && l10.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            this.f12543b.execute(new q3(24, this, this.v.build()));
        }
        this.v = null;
        this.f12548s = null;
        this.Q = 0;
        this.O = 0;
        this.P = 0;
        this.I = null;
        this.J = null;
        this.K = null;
        this.R = false;
    }

    public final LogSessionId q() {
        return this.d.getSessionId();
    }

    public final void r(p1 p1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.v;
        if (g0Var == null || (b10 = p1Var.b(g0Var.f45920a)) == -1) {
            return;
        }
        m1 m1Var = this.h;
        int i10 = 0;
        p1Var.f(b10, m1Var, false);
        int i11 = m1Var.f2213c;
        o1 o1Var = this.f12545f;
        p1Var.n(i11, o1Var);
        k0 k0Var = o1Var.f2260c.f2278b;
        int i12 = 2;
        if (k0Var != null) {
            int K = m0.K(k0Var.f2188a, k0Var.f2189b);
            if (K != 0) {
                if (K != 1) {
                    if (K != 2) {
                        i10 = 1;
                    } else {
                        i10 = 4;
                    }
                } else {
                    i10 = 5;
                }
            } else {
                i10 = 3;
            }
        }
        builder.setStreamType(i10);
        if (o1Var.f2267m != -9223372036854775807L && !o1Var.f2265k && !o1Var.f2263i && !o1Var.a()) {
            builder.setMediaDurationMillis(m0.h0(o1Var.f2267m));
        }
        if (!o1Var.a()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.R = true;
    }

    public final void s(a aVar, String str) {
        g0 g0Var = aVar.d;
        if (g0Var != null && g0Var.b()) {
            return;
        }
        p();
        this.f12548s = str;
        this.v = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
        r(aVar.f12514b, g0Var);
    }

    public final void t(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.f12548s)) {
            p();
        }
        this.f12546n.remove(str);
        this.f12547r.remove(str);
    }

    public final void u(int i10, long j10, x xVar, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.e);
        if (xVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 3;
                if (i11 != 2) {
                    if (i11 != 3) {
                        i12 = 1;
                    } else {
                        i12 = 4;
                    }
                }
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = xVar.f2518r;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = xVar.f2519s;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = xVar.f2511k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = xVar.f2510j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = xVar.f2525z;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = xVar.A;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = xVar.K;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = xVar.L;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = xVar.d;
            if (str5 != null) {
                String str6 = m0.f8372a;
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
            float f7 = xVar.D;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.R = true;
        this.f12543b.execute(new q3(21, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
