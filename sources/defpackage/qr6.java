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
public final class qr6 implements uj {
    public j54 F;
    public kp G;
    public kp H;
    public kp I;
    public fm4 J;
    public fm4 K;
    public fm4 L;
    public boolean M;
    public byte N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context a;
    public final ub3 c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public byte x;
    public final Executor b = pd0.a();
    public final znb f = new znb();
    public final xnb h = new xnb();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public byte y = 0;
    public byte E = 0;

    public qr6(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        ub3 ub3Var = new ub3();
        this.c = ub3Var;
        ub3Var.d = this;
    }

    public static qr6 b(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new qr6(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean a(kp kpVar) {
        String str;
        if (kpVar != null) {
            String str2 = (String) kpVar.d;
            ub3 ub3Var = this.c;
            synchronized (ub3Var) {
                str = ub3Var.f;
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
                    qr6.this.e(build);
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
    public final void i(fr6 fr6Var) {
        this.N = fr6Var.a;
    }

    @Override
    public final void j(w83 w83Var) {
        this.P += w83Var.g;
        this.Q += w83Var.e;
    }

    @Override
    public final void k(defpackage.y54 r24, defpackage.lv6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr6.k(y54, lv6):void");
    }

    public final void l(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void m(aob aobVar, rx6 rx6Var) {
        int b;
        PlaybackMetrics.Builder builder = this.w;
        if (rx6Var == null || (b = aobVar.b(rx6Var.a)) == -1) {
            return;
        }
        xnb xnbVar = this.h;
        int i = 0;
        aobVar.f(b, xnbVar, false);
        int i2 = xnbVar.c;
        znb znbVar = this.f;
        aobVar.n(i2, znbVar);
        xq6 xq6Var = znbVar.b.b;
        int i3 = 2;
        if (xq6Var != null) {
            int M = g8c.M(xq6Var.a, xq6Var.b);
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
        if (znbVar.l != -9223372036854775807L && !znbVar.j && !znbVar.h && !znbVar.a()) {
            builder.setMediaDurationMillis(g8c.i0(znbVar.l));
        }
        if (!znbVar.a()) {
            i3 = 1;
        }
        builder.setPlaybackType(i3);
        this.S = true;
    }

    @Override
    public final void n(tj tjVar, int i, long j) {
        long longValue;
        rx6 rx6Var = tjVar.d;
        if (rx6Var != null) {
            String d = this.c.d(tjVar.b, rx6Var);
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

    public final void o(tj tjVar, String str) {
        rx6 rx6Var = tjVar.d;
        if (rx6Var != null && rx6Var.c()) {
            return;
        }
        c();
        this.s = str;
        this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
        m(tjVar.b, rx6Var);
    }

    public final void p(tj tjVar, String str) {
        rx6 rx6Var = tjVar.d;
        if ((rx6Var == null || !rx6Var.c()) && str.equals(this.s)) {
            c();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void q(int i, long j, fm4 fm4Var, int i2) {
        int i3;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (fm4Var != null) {
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
            String str2 = fm4Var.s;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = fm4Var.t;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = fm4Var.l;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = fm4Var.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = fm4Var.A;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = fm4Var.B;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = fm4Var.N;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = fm4Var.P;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = fm4Var.d;
            if (str5 != null) {
                String str6 = g8c.a;
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
            float f = fm4Var.F;
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
                qr6.this.l(build);
            }
        });
    }

    @Override
    public final void s(icc iccVar) {
        kp kpVar = this.G;
        if (kpVar != null) {
            fm4 fm4Var = (fm4) kpVar.c;
            if (fm4Var.B == -1) {
                em4 a = fm4Var.a();
                a.z = iccVar.a;
                a.A = iccVar.b;
                this.G = new kp(new fm4(a), kpVar.b, (String) kpVar.d);
            }
        }
    }

    @Override
    public final void u(j54 j54Var) {
        this.F = j54Var;
    }

    @Override
    public final void w(tj tjVar, fr6 fr6Var) {
        rx6 rx6Var = tjVar.d;
        if (rx6Var != null) {
            fm4 fm4Var = fr6Var.c;
            fm4Var.getClass();
            int i = fr6Var.d;
            aob aobVar = tjVar.b;
            rx6Var.getClass();
            kp kpVar = new kp(fm4Var, i, this.c.d(aobVar, rx6Var));
            int i2 = fr6Var.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        this.I = kpVar;
                        return;
                    }
                } else {
                    this.H = kpVar;
                    return;
                }
            }
            this.G = kpVar;
        }
    }

    @Override
    public final void y(tj tjVar, int i) {
        if (i == 1) {
            this.M = true;
        }
        this.x = i;
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
    }
}
