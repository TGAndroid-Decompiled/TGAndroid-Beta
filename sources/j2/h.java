package j2;

import a8.ng;
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
import e2.n0;
import hi.u2;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u2.c0;
import u2.g0;
public final class h implements b {
    public z0 E;
    public ng F;
    public ng G;
    public ng H;
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
    public final Context f15214a;
    public final g f15216c;
    public final PlaybackSession d;
    public String f15220s;
    public PlaybackMetrics.Builder v;
    public int f15221w;
    public final Executor f15215b = e2.a.e();
    public final o1 f15217f = new o1();
    public final m1 h = new m1();
    public final HashMap f15219r = new HashMap();
    public final HashMap f15218n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int f15222x = 0;
    public int f15223y = 0;

    public h(Context context, PlaybackSession playbackSession) {
        this.f15214a = context.getApplicationContext();
        this.d = playbackSession;
        g gVar = new g();
        this.f15216c = gVar;
        gVar.d = this;
    }

    public static h o(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new h(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override
    public final void a(i2.e eVar) {
        this.O += eVar.f13517g;
        this.P += eVar.e;
    }

    @Override
    public final void b(c0 c0Var) {
        this.M = c0Var.f49254a;
    }

    @Override
    public final void c(b2 b2Var) {
        ng ngVar = this.F;
        if (ngVar != null) {
            x xVar = (x) ngVar.f640c;
            if (xVar.A == -1) {
                w a2 = xVar.a();
                a2.f3539y = b2Var.f3150a;
                a2.f3540z = b2Var.f3151b;
                this.F = new ng(new x(a2), ngVar.f639b, (String) ngVar.d);
            }
        }
    }

    @Override
    public final void d(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            x xVar = c0Var.f49256c;
            xVar.getClass();
            int i10 = c0Var.d;
            p1 p1Var = aVar.f15187b;
            g0Var.getClass();
            ng ngVar = new ng(xVar, i10, this.f15216c.d(p1Var, g0Var));
            int i11 = c0Var.f49255b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                        this.H = ngVar;
                        return;
                    }
                } else {
                    this.G = ngVar;
                    return;
                }
            }
            this.F = ngVar;
        }
    }

    @Override
    public final void e(b2.g1 r23, n4.s r24) {
        throw new UnsupportedOperationException("Method not decompiled: j2.h.e(b2.g1, n4.s):void");
    }

    @Override
    public final void f(a aVar, int i10, long j10) {
        long longValue;
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.f15216c.d(aVar.f15187b, g0Var);
            HashMap hashMap = this.f15219r;
            Long l4 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f15218n;
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
        this.f15221w = i10;
    }

    @Override
    public final void h(z0 z0Var) {
        this.E = z0Var;
    }

    public final boolean n(ng ngVar) {
        String str;
        if (ngVar != null) {
            String str2 = (String) ngVar.d;
            g gVar = this.f15216c;
            synchronized (gVar) {
                str = gVar.f15212f;
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
            Long l4 = (Long) this.f15218n.get(this.f15220s);
            PlaybackMetrics.Builder builder2 = this.v;
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l10 = (Long) this.f15219r.get(this.f15220s);
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
            this.f15215b.execute(new u2(18, this, this.v.build()));
        }
        this.v = null;
        this.f15220s = null;
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
        if (g0Var == null || (b10 = p1Var.b(g0Var.f49294a)) == -1) {
            return;
        }
        m1 m1Var = this.h;
        int i10 = 0;
        p1Var.f(b10, m1Var, false);
        int i11 = m1Var.f3280c;
        o1 o1Var = this.f15217f;
        p1Var.n(i11, o1Var);
        k0 k0Var = o1Var.f3327c.f3345b;
        int i12 = 2;
        if (k0Var != null) {
            int K = n0.K(k0Var.f3255a, k0Var.f3256b);
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
        if (o1Var.f3334m != -9223372036854775807L && !o1Var.f3332k && !o1Var.f3330i && !o1Var.a()) {
            builder.setMediaDurationMillis(n0.h0(o1Var.f3334m));
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
        this.f15220s = str;
        this.v = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
        r(aVar.f15187b, g0Var);
    }

    public final void t(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.f15220s)) {
            p();
        }
        this.f15218n.remove(str);
        this.f15219r.remove(str);
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
            String str2 = xVar.f3585r;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = xVar.f3586s;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = xVar.f3578k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = xVar.f3577j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = xVar.f3592z;
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
                String str6 = n0.f9692a;
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
        this.f15215b.execute(new u2(15, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
