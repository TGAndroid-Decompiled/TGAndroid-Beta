package j2;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import b2.f0;
import b2.h1;
import b2.j1;
import b2.k1;
import b2.r;
import b2.s;
import b2.u0;
import b2.x1;
import e2.d0;
import fg.s1;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u2.c0;
import u2.g0;
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
    public final Context f11480a;
    public final g f11482c;
    public final PlaybackSession d;
    public String f11486s;
    public PlaybackMetrics.Builder v;
    public int f11487w;
    public final Executor f11481b = e2.a.g();
    public final j1 f11483f = new j1();
    public final h1 h = new h1();
    public final HashMap f11485r = new HashMap();
    public final HashMap f11484n = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int f11488x = 0;
    public int f11489y = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f11480a = context.getApplicationContext();
        this.d = playbackSession;
        g gVar = new g();
        this.f11482c = gVar;
        gVar.d = this;
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
        this.O += gVar.f10208g;
        this.P += gVar.e;
    }

    @Override
    public final void b(c0 c0Var) {
        this.M = c0Var.f42282a;
    }

    @Override
    public final void c(x1 x1Var) {
        a5.a aVar = this.F;
        if (aVar != null) {
            s sVar = (s) aVar.d;
            if (sVar.f2009z == -1) {
                r a2 = sVar.a();
                a2.f1952x = x1Var.f2045a;
                a2.f1953y = x1Var.f2046b;
                this.F = new a5.a(new s(a2), aVar.f275b, (String) aVar.f276c, 9);
            }
        }
    }

    @Override
    public final void d(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            s sVar = c0Var.f42284c;
            sVar.getClass();
            int i10 = c0Var.d;
            k1 k1Var = aVar.f11452b;
            g0Var.getClass();
            a5.a aVar2 = new a5.a(sVar, i10, this.f11482c.d(k1Var, g0Var), 9);
            int i11 = c0Var.f42283b;
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
    public final void e(b2.b1 r21, n4.y r22) {
        throw new UnsupportedOperationException("Method not decompiled: j2.i.e(b2.b1, n4.y):void");
    }

    @Override
    public final void f(a aVar, int i10, long j3) {
        long longValue;
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.f11482c.d(aVar.f11452b, g0Var);
            HashMap hashMap = this.f11485r;
            Long l4 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f11484n;
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
        this.f11487w = i10;
    }

    @Override
    public final void h(u0 u0Var) {
        this.E = u0Var;
    }

    public final boolean n(a5.a aVar) {
        String str;
        if (aVar != null) {
            String str2 = (String) aVar.f276c;
            g gVar = this.f11482c;
            synchronized (gVar) {
                str = gVar.f11477f;
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
            Long l4 = (Long) this.f11484n.get(this.f11486s);
            PlaybackMetrics.Builder builder2 = this.v;
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l10 = (Long) this.f11485r.get(this.f11486s);
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
            this.f11481b.execute(new s1(24, this, this.v.build()));
        }
        this.v = null;
        this.f11486s = null;
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

    public final void r(k1 k1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.v;
        if (g0Var == null || (b10 = k1Var.b(g0Var.f42324a)) == -1) {
            return;
        }
        h1 h1Var = this.h;
        int i10 = 0;
        k1Var.f(b10, h1Var, false);
        int i11 = h1Var.f1707c;
        j1 j1Var = this.f11483f;
        k1Var.n(i11, j1Var);
        f0 f0Var = j1Var.f1753c.f1771b;
        int i12 = 2;
        if (f0Var != null) {
            int I = d0.I(f0Var.f1686a, f0Var.f1687b);
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
        if (j1Var.f1760m != -9223372036854775807L && !j1Var.f1758k && !j1Var.f1756i && !j1Var.a()) {
            builder.setMediaDurationMillis(d0.e0(j1Var.f1760m));
        }
        if (!j1Var.a()) {
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
        this.f11486s = str;
        this.v = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.1");
        r(aVar.f11452b, g0Var);
    }

    public final void t(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.f11486s)) {
            p();
        }
        this.f11484n.remove(str);
        this.f11485r.remove(str);
    }

    public final void u(int i10, long j3, s sVar, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j3 - this.e);
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
            String str2 = sVar.f2001q;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = sVar.f2002r;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = sVar.f1995k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = sVar.f1994j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = sVar.f2008y;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = sVar.f2009z;
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
                String str6 = d0.f7188a;
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
        this.f11481b.execute(new s1(21, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
