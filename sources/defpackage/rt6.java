package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.Executor;
public final class rt6 implements uk {
    public u64 F;
    public kq G;
    public kq H;
    public kq I;
    public go4 J;
    public go4 K;
    public go4 L;
    public boolean M;
    public byte N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context a;
    public final gd3 c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public byte x;
    public final Executor b = pe0.a();
    public final aqb f = new aqb();
    public final ypb h = new ypb();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public byte y = 0;
    public byte E = 0;

    public rt6(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        gd3 gd3Var = new gd3();
        this.c = gd3Var;
        gd3Var.d = this;
    }

    public static rt6 b(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new rt6(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean a(kq kqVar) {
        String str;
        if (kqVar != null) {
            String str2 = (String) kqVar.d;
            gd3 gd3Var = this.c;
            synchronized (gd3Var) {
                str = gd3Var.f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics.Builder builder = this.w;
        if (builder != null && this.S) {
            builder.setAudioUnderrunCount(this.R);
            this.w.setVideoFramesDropped(this.P);
            this.w.setVideoFramesPlayed(this.Q);
            Long l = (Long) this.n.get(this.s);
            PlaybackMetrics.Builder builder2 = this.w;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.r.get(this.s);
            PlaybackMetrics.Builder builder3 = this.w;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.w;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            final PlaybackMetrics build = this.w.build();
            this.b.execute(new Runnable() {
                @Override
                public final void run() {
                    rt6.this.e(build);
                }
            });
        }
        this.w = null;
        this.s = null;
        this.R = 0;
        this.P = 0;
        this.Q = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.S = false;
    }

    public final LogSessionId d() {
        return this.d.getSessionId();
    }

    public final void e(PlaybackMetrics playbackMetrics) {
        this.d.reportPlaybackMetrics(playbackMetrics);
    }

    public final void f(NetworkEvent networkEvent) {
        this.d.reportNetworkEvent(networkEvent);
    }

    public final void g(PlaybackErrorEvent playbackErrorEvent) {
        this.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final void h(PlaybackStateEvent playbackStateEvent) {
        this.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    @Override
    public final void i(ft6 ft6Var) {
        this.N = ft6Var.a;
    }

    @Override
    public final void j(ia3 ia3Var) {
        this.P += ia3Var.g;
        this.Q += ia3Var.e;
    }

    @Override
    public final void k(tk tkVar, int i, long j) {
        long longValue;
        rz6 rz6Var = tkVar.d;
        if (rz6Var != null) {
            String d = this.c.d(tkVar.b, rz6Var);
            HashMap hashMap = this.r;
            Long l = (Long) hashMap.get(d);
            HashMap hashMap2 = this.n;
            Long l2 = (Long) hashMap2.get(d);
            long j2 = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap.put(d, Long.valueOf(longValue + j));
            if (l2 != null) {
                j2 = l2.longValue();
            }
            hashMap2.put(d, Long.valueOf(j2 + i));
        }
    }

    public final void l(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void m(bqb bqbVar, rz6 rz6Var) {
        int b;
        PlaybackMetrics.Builder builder = this.w;
        if (rz6Var == null || (b = bqbVar.b(rz6Var.a)) == -1) {
            return;
        }
        ypb ypbVar = this.h;
        int i = 0;
        bqbVar.f(b, ypbVar, false);
        int i2 = ypbVar.c;
        aqb aqbVar = this.f;
        bqbVar.n(i2, aqbVar);
        xs6 xs6Var = aqbVar.b.b;
        int i3 = 2;
        if (xs6Var != null) {
            int M = hac.M(xs6Var.a, xs6Var.b);
            if (M != 0) {
                if (M != 1) {
                    if (M != 2) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 3;
            }
        }
        builder.setStreamType(i);
        if (aqbVar.l != -9223372036854775807L && !aqbVar.j && !aqbVar.h && !aqbVar.a()) {
            builder.setMediaDurationMillis(hac.i0(aqbVar.l));
        }
        if (!aqbVar.a()) {
            i3 = 1;
        }
        builder.setPlaybackType(i3);
        this.S = true;
    }

    @Override
    public final void n(jec jecVar) {
        kq kqVar = this.G;
        if (kqVar != null) {
            go4 go4Var = (go4) kqVar.c;
            if (go4Var.B == -1) {
                fo4 a = go4Var.a();
                a.z = jecVar.a;
                a.A = jecVar.b;
                this.G = new kq(new go4(a), kqVar.b, (String) kqVar.d);
            }
        }
    }

    public final void o(tk tkVar, String str) {
        rz6 rz6Var = tkVar.d;
        if (rz6Var != null && rz6Var.c()) {
            return;
        }
        c();
        this.s = str;
        this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
        m(tkVar.b, rz6Var);
    }

    public final void p(tk tkVar, String str) {
        rz6 rz6Var = tkVar.d;
        if ((rz6Var == null || !rz6Var.c()) && str.equals(this.s)) {
            c();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void q(int i, long j, go4 go4Var, int i2) {
        int i3;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (go4Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        i3 = 1;
                    } else {
                        i3 = 4;
                    }
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = go4Var.s;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = go4Var.t;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = go4Var.l;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = go4Var.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = go4Var.A;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = go4Var.B;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = go4Var.N;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = go4Var.P;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = go4Var.d;
            if (str5 != null) {
                String str6 = hac.a;
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
            float f = go4Var.F;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.S = true;
        final TrackChangeEvent build = timeSinceCreatedMillis.build();
        this.b.execute(new Runnable() {
            @Override
            public final void run() {
                rt6.this.l(build);
            }
        });
    }

    @Override
    public final void s(u64 u64Var) {
        this.F = u64Var;
    }

    @Override
    public final void u(tk tkVar, ft6 ft6Var) {
        rz6 rz6Var = tkVar.d;
        if (rz6Var != null) {
            go4 go4Var = ft6Var.c;
            go4Var.getClass();
            int i = ft6Var.d;
            bqb bqbVar = tkVar.b;
            rz6Var.getClass();
            kq kqVar = new kq(go4Var, i, this.c.d(bqbVar, rz6Var));
            int i2 = ft6Var.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        this.I = kqVar;
                        return;
                    }
                } else {
                    this.H = kqVar;
                    return;
                }
            }
            this.G = kqVar;
        }
    }

    @Override
    public final void w(tk tkVar, int i) {
        if (i == 1) {
            this.M = true;
        }
        this.x = i;
    }

    @Override
    public final void y(defpackage.h74 r24, defpackage.hi2 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rt6.y(h74, hi2):void");
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }
}
