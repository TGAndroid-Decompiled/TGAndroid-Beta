package l2;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import b8.kg;
import d2.a2;
import d2.i0;
import d2.k1;
import d2.m1;
import d2.n1;
import d2.u;
import d2.v;
import d2.x0;
import g2.n0;
import java.util.HashMap;
import java.util.concurrent.Executor;
import w2.c0;
import w2.g0;
public final class i implements b {
    public x0 F;
    public kg G;
    public kg H;
    public kg I;
    public v J;
    public v K;
    public v L;
    public boolean M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public final Context f17714a;
    public final h f17716c;
    public final PlaybackSession d;
    public String f17721s;
    public PlaybackMetrics.Builder f17722w;
    public int f17723x;
    public final Executor f17715b = g2.a.e();
    public final m1 f17718f = new m1();
    public final k1 h = new k1();
    public final HashMap f17720r = new HashMap();
    public final HashMap f17719n = new HashMap();
    public final long f17717e = SystemClock.elapsedRealtime();
    public int f17724y = 0;
    public int E = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f17714a = context.getApplicationContext();
        this.d = playbackSession;
        h hVar = new h();
        this.f17716c = hVar;
        hVar.d = this;
    }

    public static i i(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new i(context, mediaMetricsManager.createPlaybackSession());
    }

    @Override
    public final void A(a aVar, int i3) {
        if (i3 == 1) {
            this.M = true;
        }
        this.f17723x = i3;
    }

    @Override
    public final void D(a aVar, c0 c0Var) {
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            v vVar = c0Var.f57039c;
            vVar.getClass();
            int i3 = c0Var.d;
            n1 n1Var = aVar.f17680b;
            g0Var.getClass();
            kg kgVar = new kg(vVar, i3, this.f17716c.d(n1Var, g0Var));
            int i10 = c0Var.f57038b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        this.I = kgVar;
                        return;
                    }
                } else {
                    this.H = kgVar;
                    return;
                }
            }
            this.G = kgVar;
        }
    }

    @Override
    public final void b(d2.e1 r23, tf.b r24) {
        throw new UnsupportedOperationException("Method not decompiled: l2.i.b(d2.e1, tf.b):void");
    }

    @Override
    public final void d(c0 c0Var) {
        this.N = c0Var.f57037a;
    }

    public final boolean h(kg kgVar) {
        String str;
        if (kgVar != null) {
            String str2 = (String) kgVar.d;
            h hVar = this.f17716c;
            synchronized (hVar) {
                str = hVar.f17712f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void j(x0 x0Var) {
        this.F = x0Var;
    }

    public final void k() {
        long longValue;
        long longValue2;
        int i3;
        PlaybackMetrics.Builder builder = this.f17722w;
        if (builder != null && this.S) {
            builder.setAudioUnderrunCount(this.R);
            this.f17722w.setVideoFramesDropped(this.P);
            this.f17722w.setVideoFramesPlayed(this.Q);
            Long l10 = (Long) this.f17719n.get(this.f17721s);
            PlaybackMetrics.Builder builder2 = this.f17722w;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f17720r.get(this.f17721s);
            PlaybackMetrics.Builder builder3 = this.f17722w;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f17722w;
            if (l11 != null && l11.longValue() > 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            builder4.setStreamSource(i3);
            this.f17715b.execute(new ii.e(20, this, this.f17722w.build()));
        }
        this.f17722w = null;
        this.f17721s = null;
        this.R = 0;
        this.P = 0;
        this.Q = 0;
        this.J = null;
        this.K = null;
        this.L = null;
        this.S = false;
    }

    public final LogSessionId l() {
        return this.d.getSessionId();
    }

    public final void m(n1 n1Var, g0 g0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.f17722w;
        if (g0Var == null || (b10 = n1Var.b(g0Var.f57081a)) == -1) {
            return;
        }
        k1 k1Var = this.h;
        int i3 = 0;
        n1Var.f(b10, k1Var, false);
        int i10 = k1Var.f8163c;
        m1 m1Var = this.f17718f;
        n1Var.n(i10, m1Var);
        i0 i0Var = m1Var.f8210c.f8241b;
        int i11 = 2;
        if (i0Var != null) {
            int K = n0.K(i0Var.f8139a, i0Var.f8140b);
            if (K != 0) {
                if (K != 1) {
                    if (K != 2) {
                        i3 = 1;
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 5;
                }
            } else {
                i3 = 3;
            }
        }
        builder.setStreamType(i3);
        if (m1Var.f8218m != -9223372036854775807L && !m1Var.f8216k && !m1Var.f8214i && !m1Var.a()) {
            builder.setMediaDurationMillis(n0.h0(m1Var.f8218m));
        }
        if (!m1Var.a()) {
            i11 = 1;
        }
        builder.setPlaybackType(i11);
        this.S = true;
    }

    public final void n(a aVar, String str) {
        g0 g0Var = aVar.d;
        if (g0Var != null && g0Var.b()) {
            return;
        }
        k();
        this.f17721s = str;
        this.f17722w = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
        m(aVar.f17680b, g0Var);
    }

    public final void o(a aVar, String str) {
        g0 g0Var = aVar.d;
        if ((g0Var == null || !g0Var.b()) && str.equals(this.f17721s)) {
            k();
        }
        this.f17719n.remove(str);
        this.f17720r.remove(str);
    }

    public final void p(int i3, long j10, v vVar, int i10) {
        int i11;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i3).setTimeSinceCreatedMillis(j10 - this.f17717e);
        if (vVar != null) {
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
            String str2 = vVar.f8488r;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = vVar.f8489s;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = vVar.f8481k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i12 = vVar.f8480j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = vVar.f8495z;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = vVar.A;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = vVar.K;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = vVar.L;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str5 = vVar.d;
            if (str5 != null) {
                String str6 = n0.f11873a;
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
            float f10 = vVar.D;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.S = true;
        this.f17715b.execute(new ii.e(17, this, timeSinceCreatedMillis.build()));
    }

    @Override
    public final void t(k2.d dVar) {
        this.P += dVar.f16468g;
        this.Q += dVar.f16466e;
    }

    @Override
    public final void x(a2 a2Var) {
        kg kgVar = this.G;
        if (kgVar != null) {
            v vVar = (v) kgVar.f2723c;
            if (vVar.A == -1) {
                u a10 = vVar.a();
                a10.f8437y = a2Var.f8030a;
                a10.f8438z = a2Var.f8031b;
                this.G = new kg(new v(a10), kgVar.f2722b, (String) kgVar.d);
            }
        }
    }

    @Override
    public final void z(a aVar, int i3, long j10) {
        long longValue;
        g0 g0Var = aVar.d;
        if (g0Var != null) {
            String d = this.f17716c.d(aVar.f17680b, g0Var);
            HashMap hashMap = this.f17720r;
            Long l10 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.f17719n;
            Long l11 = (Long) hashMap2.get(d);
            long j11 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap.put(d, Long.valueOf(longValue + j10));
            if (l11 != null) {
                j11 = l11.longValue();
            }
            hashMap2.put(d, Long.valueOf(j11 + i3));
        }
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
