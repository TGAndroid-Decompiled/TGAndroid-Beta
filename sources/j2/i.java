package j2;

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
import b2.h1;
import b2.j1;
import b2.k1;
import b2.r;
import b2.s;
import b2.u0;
import b2.x1;
import e2.d0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u2.b0;
import u2.f0;
public final class i implements b {
    public u0 E;
    public a5.a F;
    public a5.a G;
    public a5.a H;
    public s I;
    public s J;
    public s K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public final Context f13673a;
    public final h f13675c;
    public final PlaybackSession d;
    public String f13680s;
    public PlaybackMetrics.Builder v;
    public int f13681w;
    public final Executor f13674b = e2.a.g();
    public final j1 f13677f = new j1();
    public final h1 h = new h1();
    public final HashMap f13679r = new HashMap();
    public final HashMap f13678n = new HashMap();
    public final long f13676e = SystemClock.elapsedRealtime();
    public int f13682x = 0;
    public int f13683y = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f13673a = context.getApplicationContext();
        this.d = playbackSession;
        h hVar = new h();
        this.f13675c = hVar;
        hVar.d = this;
    }

    public static void i(i iVar, PlaybackErrorEvent playbackErrorEvent) {
        iVar.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public static void j(i iVar, PlaybackMetrics playbackMetrics) {
        iVar.d.reportPlaybackMetrics(playbackMetrics);
    }

    public static void k(i iVar, NetworkEvent networkEvent) {
        iVar.d.reportNetworkEvent(networkEvent);
    }

    public static void l(i iVar, TrackChangeEvent trackChangeEvent) {
        iVar.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public static void m(i iVar, PlaybackStateEvent playbackStateEvent) {
        iVar.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public static i o(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new i(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override
    public final void a(i2.g gVar) {
        this.O += gVar.f11649g;
        this.P += gVar.f11647e;
    }

    @Override
    public final void b(b0 b0Var) {
        this.M = b0Var.f47224a;
    }

    @Override
    public final void c(x1 x1Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            s sVar = (s) aVar.d;
            if (sVar.f3571z == -1) {
                r a2 = sVar.a();
                a2.f3512x = x1Var.f3611a;
                a2.f3513y = x1Var.f3612b;
                this.F = new a5.a(new s(a2), aVar.f299b, (String) aVar.f300c, 9);
            }
        }
    }

    @Override
    public final void d(b2.b1 r22, of.b r23) {
        throw new UnsupportedOperationException("Method not decompiled: j2.i.d(b2.b1, of.b):void");
    }

    @Override
    public final void e(a aVar, b0 b0Var) {
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            s sVar = b0Var.f47226c;
            sVar.getClass();
            int i10 = b0Var.d;
            k1 k1Var = aVar.f13641b;
            f0Var.getClass();
            a5.a aVar2 = new a5.a(sVar, i10, this.f13675c.d(k1Var, f0Var), 9);
            int i11 = b0Var.f47225b;
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
    public final void f(a aVar, int i10, long j3) {
        long longValue;
        f0 f0Var = aVar.d;
        if (f0Var != null) {
            String d = this.f13675c.d(aVar.f13641b, f0Var);
            HashMap hashMap = this.f13679r;
            Long l4 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f13678n;
            Long l10 = (Long) hashMap2.get(d);
            long j10 = 0;
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            hashMap.put(d, Long.valueOf(longValue + j3));
            if (l10 != null) {
                j10 = l10.longValue();
            }
            hashMap2.put(d, Long.valueOf(j10 + i10));
        }
    }

    @Override
    public final void g(a aVar, int i10) {
        if (i10 == 1) {
            this.L = true;
        }
        this.f13681w = i10;
    }

    @Override
    public final void h(u0 u0Var) {
        this.E = u0Var;
    }

    public final boolean n(a5.a aVar) {
        String str;
        if (aVar != null) {
            String str2 = (String) aVar.f300c;
            h hVar = this.f13675c;
            synchronized (hVar) {
                str = hVar.f13671f;
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
            Long l4 = (Long) this.f13678n.get(this.f13680s);
            PlaybackMetrics.Builder builder2 = this.v;
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l10 = (Long) this.f13679r.get(this.f13680s);
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
            this.f13674b.execute(new gg.x1(23, this, this.v.build()));
        }
        this.v = null;
        this.f13680s = null;
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

    public final void r(k1 k1Var, f0 f0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.v;
        if (f0Var == null || (b10 = k1Var.b(f0Var.f47270a)) == -1) {
            return;
        }
        h1 h1Var = this.h;
        int i10 = 0;
        k1Var.f(b10, h1Var, false);
        int i11 = h1Var.f3250c;
        j1 j1Var = this.f13677f;
        k1Var.n(i11, j1Var);
        b2.f0 f0Var2 = j1Var.f3302c.f3321b;
        int i12 = 2;
        if (f0Var2 != null) {
            int I = d0.I(f0Var2.f3226a, f0Var2.f3227b);
            if (I != 0) {
                if (I != 1) {
                    if (I != 2) {
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
        if (j1Var.f3310m != -9223372036854775807L && !j1Var.f3308k && !j1Var.f3306i && !j1Var.a()) {
            builder.setMediaDurationMillis(d0.e0(j1Var.f3310m));
        }
        if (!j1Var.a()) {
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
        this.f13680s = str;
        this.v = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.1");
        r(aVar.f13641b, f0Var);
    }

    public final void t(a aVar, String str) {
        f0 f0Var = aVar.d;
        if ((f0Var == null || !f0Var.b()) && str.equals(this.f13680s)) {
            p();
        }
        this.f13678n.remove(str);
        this.f13679r.remove(str);
    }

    public final void u(int i10, long j3, s sVar, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j3 - this.f13676e);
        if (sVar != null) {
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
            String str2 = sVar.f3563q;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = sVar.f3564r;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = sVar.f3557k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = sVar.f3556j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = sVar.f3570y;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = sVar.f3571z;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = sVar.J;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = sVar.K;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = sVar.d;
            if (str5 != null) {
                String str6 = d0.f8538a;
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
            float f7 = sVar.C;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.R = true;
        this.f13674b.execute(new gg.x1(20, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
