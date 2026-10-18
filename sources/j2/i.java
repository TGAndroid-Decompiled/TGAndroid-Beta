package j2;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import b2.a2;
import b2.j0;
import b2.l1;
import b2.n1;
import b2.o1;
import b2.v;
import b2.w;
import b2.y0;
import e2.m0;
import hi.t;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u2.b0;
import u2.f0;
public final class i implements b {
    public y0 E;
    public a5.a F;
    public a5.a G;
    public a5.a H;
    public w I;
    public w J;
    public w K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public final Context f13958a;
    public final h f13960c;
    public final PlaybackSession d;
    public String f13964s;
    public PlaybackMetrics.Builder v;
    public int f13965w;
    public final Executor f13959b = e2.a.e();
    public final n1 f13961f = new n1();
    public final l1 h = new l1();
    public final HashMap f13963r = new HashMap();
    public final HashMap f13962n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int f13966x = 0;
    public int f13967y = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f13958a = context.getApplicationContext();
        this.d = playbackSession;
        h hVar = new h();
        this.f13960c = hVar;
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
        this.O += eVar.f12345g;
        this.P += eVar.e;
    }

    @Override
    public final void b(b0 b0Var) {
        this.M = b0Var.f47304a;
    }

    @Override
    public final void c(a2 a2Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            w wVar = (w) aVar.d;
            if (wVar.A == -1) {
                v a2 = wVar.a();
                a2.f4085y = a2Var.f3697a;
                a2.f4086z = a2Var.f3698b;
                this.F = new a5.a(new w(a2), aVar.f280b, (String) aVar.f281c, 9);
            }
        }
    }

    @Override
    public final void d(b2.f1 r22, qf.b r23) {
        throw new UnsupportedOperationException("Method not decompiled: j2.i.d(b2.f1, qf.b):void");
    }

    @Override
    public final void e(a aVar, b0 b0Var) {
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            w wVar = b0Var.f47306c;
            wVar.getClass();
            int i10 = b0Var.d;
            o1 o1Var = aVar.f13930b;
            f0Var.getClass();
            a5.a aVar2 = new a5.a(wVar, i10, this.f13960c.d(o1Var, f0Var), 9);
            int i11 = b0Var.f47305b;
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
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            String d = this.f13960c.d(aVar.f13930b, f0Var);
            HashMap hashMap = this.f13963r;
            Long l4 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f13962n;
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
        this.f13965w = i10;
    }

    @Override
    public final void h(y0 y0Var) {
        this.E = y0Var;
    }

    public final boolean n(a5.a aVar) {
        String str;
        if (aVar != null) {
            String str2 = (String) aVar.f281c;
            h hVar = this.f13960c;
            synchronized (hVar) {
                str = hVar.f13956f;
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
            Long l4 = (Long) this.f13962n.get(this.f13964s);
            PlaybackMetrics.Builder builder2 = this.v;
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l10 = (Long) this.f13963r.get(this.f13964s);
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
            this.f13959b.execute(new t(13, this, this.v.build()));
        }
        this.v = null;
        this.f13964s = null;
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

    public final void r(o1 o1Var, f0 f0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.v;
        if (f0Var == null || (b10 = o1Var.b(f0Var.f47347a)) == -1) {
            return;
        }
        l1 l1Var = this.h;
        int i10 = 0;
        o1Var.f(b10, l1Var, false);
        int i11 = l1Var.f3826c;
        n1 n1Var = this.f13961f;
        o1Var.n(i11, n1Var);
        j0 j0Var = n1Var.f3873c.f3891b;
        int i12 = 2;
        if (j0Var != null) {
            int K = m0.K(j0Var.f3801a, j0Var.f3802b);
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
        if (n1Var.f3880m != -9223372036854775807L && !n1Var.f3878k && !n1Var.f3876i && !n1Var.a()) {
            builder.setMediaDurationMillis(m0.h0(n1Var.f3880m));
        }
        if (!n1Var.a()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.R = true;
    }

    public final void s(a aVar, String str) {
        f0 f0Var = aVar.d;
        if (f0Var != null && f0Var.b()) {
            return;
        }
        p();
        this.f13964s = str;
        this.v = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
        r(aVar.f13930b, f0Var);
    }

    public final void t(a aVar, String str) {
        f0 f0Var = aVar.d;
        if ((f0Var == null || !f0Var.b()) && str.equals(this.f13964s)) {
            p();
        }
        this.f13962n.remove(str);
        this.f13963r.remove(str);
    }

    public final void u(int i10, long j10, w wVar, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.e);
        if (wVar != null) {
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
            String str2 = wVar.f4131r;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = wVar.f4132s;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = wVar.f4124k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = wVar.f4123j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = wVar.f4138z;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = wVar.A;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = wVar.K;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = wVar.L;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = wVar.d;
            if (str5 != null) {
                String str6 = m0.f8255a;
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
            float f7 = wVar.D;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.R = true;
        this.f13959b.execute(new t(10, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
