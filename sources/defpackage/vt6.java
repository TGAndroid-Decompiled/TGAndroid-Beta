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
public final class vt6 implements vj {
    public e64 F;
    public lp G;
    public lp H;
    public lp I;
    public ko4 J;
    public ko4 K;
    public ko4 L;
    public boolean M;
    public byte N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context a;
    public final nc3 c;
    public final PlaybackSession d;
    public String s;
    public PlaybackMetrics.Builder w;
    public byte x;
    public final Executor b = rd0.a();
    public final zrb f = new zrb();
    public final xrb h = new xrb();
    public final HashMap r = new HashMap();
    public final HashMap n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public byte y = 0;
    public byte E = 0;

    public vt6(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        nc3 nc3Var = new nc3();
        this.c = nc3Var;
        nc3Var.d = this;
    }

    public static vt6 b(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new vt6(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean a(lp lpVar) {
        String str;
        if (lpVar != null) {
            String str2 = (String) lpVar.d;
            nc3 nc3Var = this.c;
            synchronized (nc3Var) {
                str = nc3Var.f;
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
                    vt6.this.e(build);
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
    public final void i(jt6 jt6Var) {
        this.N = jt6Var.a;
    }

    @Override
    public final void j(p93 p93Var) {
        this.P += p93Var.g;
        this.Q += p93Var.e;
    }

    @Override
    public final void k(defpackage.s64 r24, defpackage.qx6 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt6.k(s64, qx6):void");
    }

    public final void l(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void m(asb asbVar, vz6 vz6Var) {
        int b;
        PlaybackMetrics.Builder builder = this.w;
        if (vz6Var == null || (b = asbVar.b(vz6Var.a)) == -1) {
            return;
        }
        xrb xrbVar = this.h;
        int i = 0;
        asbVar.f(b, xrbVar, false);
        int i2 = xrbVar.c;
        zrb zrbVar = this.f;
        asbVar.n(i2, zrbVar);
        bt6 bt6Var = zrbVar.b.b;
        int i3 = 2;
        if (bt6Var != null) {
            int M = gcc.M(bt6Var.a, bt6Var.b);
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
        if (zrbVar.l != -9223372036854775807L && !zrbVar.j && !zrbVar.h && !zrbVar.a()) {
            builder.setMediaDurationMillis(gcc.i0(zrbVar.l));
        }
        if (!zrbVar.a()) {
            i3 = 1;
        }
        builder.setPlaybackType(i3);
        this.S = true;
    }

    @Override
    public final void n(uj ujVar, int i, long j) {
        long longValue;
        vz6 vz6Var = ujVar.d;
        if (vz6Var != null) {
            String d = this.c.d(ujVar.b, vz6Var);
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

    public final void o(uj ujVar, String str) {
        vz6 vz6Var = ujVar.d;
        if (vz6Var != null && vz6Var.c()) {
            return;
        }
        c();
        this.s = str;
        this.w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.1");
        m(ujVar.b, vz6Var);
    }

    public final void p(uj ujVar, String str) {
        vz6 vz6Var = ujVar.d;
        if ((vz6Var == null || !vz6Var.c()) && str.equals(this.s)) {
            c();
        }
        this.n.remove(str);
        this.r.remove(str);
    }

    public final void q(int i, long j, ko4 ko4Var, int i2) {
        int i3;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (ko4Var != null) {
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
            String str2 = ko4Var.s;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = ko4Var.t;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = ko4Var.l;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = ko4Var.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = ko4Var.A;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = ko4Var.B;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = ko4Var.N;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = ko4Var.P;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = ko4Var.d;
            if (str5 != null) {
                String str6 = gcc.a;
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
            float f = ko4Var.F;
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
                vt6.this.l(build);
            }
        });
    }

    @Override
    public final void s(ggc ggcVar) {
        lp lpVar = this.G;
        if (lpVar != null) {
            ko4 ko4Var = (ko4) lpVar.c;
            if (ko4Var.B == -1) {
                jo4 a = ko4Var.a();
                a.z = ggcVar.a;
                a.A = ggcVar.b;
                this.G = new lp(new ko4(a), lpVar.b, (String) lpVar.d);
            }
        }
    }

    @Override
    public final void u(e64 e64Var) {
        this.F = e64Var;
    }

    @Override
    public final void w(uj ujVar, jt6 jt6Var) {
        vz6 vz6Var = ujVar.d;
        if (vz6Var != null) {
            ko4 ko4Var = jt6Var.c;
            ko4Var.getClass();
            int i = jt6Var.d;
            asb asbVar = ujVar.b;
            vz6Var.getClass();
            lp lpVar = new lp(ko4Var, i, this.c.d(asbVar, vz6Var));
            int i2 = jt6Var.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        this.I = lpVar;
                        return;
                    }
                } else {
                    this.H = lpVar;
                    return;
                }
            }
            this.G = lpVar;
        }
    }

    @Override
    public final void y(uj ujVar, int i) {
        if (i == 1) {
            this.M = true;
        }
        this.x = i;
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
    }
}
