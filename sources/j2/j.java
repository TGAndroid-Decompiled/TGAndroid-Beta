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
import b2.l1;
import b2.n1;
import b2.o1;
import b2.w;
import b2.x;
import b2.y0;
import e2.l0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u2.c0;
import u2.g0;
public final class j implements b {
    public y0 E;
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
    public final Context f9368a;
    public final i f9370c;
    public final PlaybackSession d;
    public String f9374s;
    public PlaybackMetrics.Builder f9375w;
    public int f9376x;
    public final Executor f9369b = e2.a.e();
    public final n1 f9371f = new n1();
    public final l1 h = new l1();
    public final HashMap f9373r = new HashMap();
    public final HashMap f9372n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int f9377y = 0;
    public int D = 0;

    public j(Context context, PlaybackSession playbackSession) {
        this.f9368a = context.getApplicationContext();
        this.d = playbackSession;
        i iVar = new i();
        this.f9370c = iVar;
        iVar.d = this;
    }

    public static j h(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new j(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override
    public final void B(a aVar, int i10) {
        if (i10 == 1) {
            this.L = true;
        }
        this.f9376x = i10;
    }

    @Override
    public final void E(y0 y0Var) {
        this.E = y0Var;
    }

    @Override
    public final void b(i2.d dVar) {
        this.O += dVar.f7827g;
        this.P += dVar.e;
    }

    public final boolean g(a5.a aVar) {
        String str;
        if (aVar != null) {
            String str2 = (String) aVar.f282c;
            i iVar = this.f9370c;
            synchronized (iVar) {
                str = iVar.f9366f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics.Builder builder = this.f9375w;
        if (builder != null && this.R) {
            builder.setAudioUnderrunCount(this.Q);
            this.f9375w.setVideoFramesDropped(this.O);
            this.f9375w.setVideoFramesPlayed(this.P);
            Long l4 = (Long) this.f9372n.get(this.f9374s);
            PlaybackMetrics.Builder builder2 = this.f9375w;
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l10 = (Long) this.f9373r.get(this.f9374s);
            PlaybackMetrics.Builder builder3 = this.f9375w;
            if (l10 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l10.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f9375w;
            if (l10 != null && l10.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            this.f9369b.execute(new d1.e(22, this, this.f9375w.build()));
        }
        this.f9375w = null;
        this.f9374s = null;
        this.Q = 0;
        this.O = 0;
        this.P = 0;
        this.I = null;
        this.J = null;
        this.K = null;
        this.R = false;
    }

    @Override
    public final void j(c0 c0Var) {
        this.M = c0Var.f49835a;
    }

    public final LogSessionId k() {
        return this.d.getSessionId();
    }

    @Override
    public final void l(b2 b2Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            x xVar = (x) aVar.d;
            if (xVar.A == -1) {
                w a2 = xVar.a();
                a2.f2376y = b2Var.f1987a;
                a2.f2377z = b2Var.f1988b;
                this.F = new a5.a(new x(a2), aVar.f281b, (String) aVar.f282c, 10);
            }
        }
    }

    public final void m(o1 o1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.f9375w;
        if (g0Var == null || (b10 = o1Var.b(g0Var.f49875a)) == -1) {
            return;
        }
        l1 l1Var = this.h;
        int i10 = 0;
        o1Var.f(b10, l1Var, false);
        int i11 = l1Var.f2109c;
        n1 n1Var = this.f9371f;
        o1Var.n(i11, n1Var);
        k0 k0Var = n1Var.f2139c.f2182b;
        int i12 = 2;
        if (k0Var != null) {
            int K = l0.K(k0Var.f2091a, k0Var.f2092b);
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
        if (n1Var.f2146m != -9223372036854775807L && !n1Var.f2144k && !n1Var.f2142i && !n1Var.a()) {
            builder.setMediaDurationMillis(l0.h0(n1Var.f2146m));
        }
        if (!n1Var.a()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.R = true;
    }

    @Override
    public final void n(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            x xVar = c0Var.f49837c;
            xVar.getClass();
            int i10 = c0Var.d;
            o1 o1Var = aVar.f9336b;
            g0Var.getClass();
            a5.a aVar2 = new a5.a(xVar, i10, this.f9370c.d(o1Var, g0Var), 10);
            int i11 = c0Var.f49836b;
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

    public final void o(a aVar, String str) {
        g0 g0Var = aVar.d;
        if (g0Var != null && g0Var.b()) {
            return;
        }
        i();
        this.f9374s = str;
        this.f9375w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
        m(aVar.f9336b, g0Var);
    }

    public final void p(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.f9374s)) {
            i();
        }
        this.f9372n.remove(str);
        this.f9373r.remove(str);
    }

    public final void q(int i10, long j10, x xVar, int i11) {
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
            String str2 = xVar.f2422r;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = xVar.f2423s;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = xVar.f2415k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = xVar.f2414j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = xVar.f2429z;
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
                String str6 = l0.f6165a;
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
        this.f9369b.execute(new d1.e(19, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void r(b2.f1 r22, hf.b r23) {
        throw new UnsupportedOperationException("Method not decompiled: j2.j.r(b2.f1, hf.b):void");
    }

    @Override
    public final void t(a aVar, int i10, long j10) {
        long longValue;
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.f9370c.d(aVar.f9336b, g0Var);
            HashMap hashMap = this.f9373r;
            Long l4 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f9372n;
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
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
