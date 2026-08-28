package i3;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import d5.f0;
import e5.z;
import h3.c1;
import h3.p2;
import h3.q2;
import h3.r2;
import h3.s0;
import h3.t0;
import h3.v1;
import j4.d0;
import j4.y;
import java.util.HashMap;
public final class j implements b {
    public a6.a A;
    public a6.a B;
    public a6.a C;
    public t0 D;
    public t0 E;
    public t0 F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final Context f10909a;
    public final h f10910b;
    public final PlaybackSession f10911c;
    public String f10915r;
    public PlaybackMetrics.Builder f10916s;
    public int v;
    public v1 f10919y;
    public final q2 f10912e = new q2();
    public final p2 f10913f = new p2();
    public final HashMap f10914n = new HashMap();
    public final HashMap h = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int f10917w = 0;
    public int f10918x = 0;

    public j(Context context, PlaybackSession playbackSession) {
        this.f10909a = context.getApplicationContext();
        this.f10911c = playbackSession;
        h hVar = new h();
        this.f10910b = hVar;
        hVar.d = this;
    }

    @Override
    public final void a(v1 v1Var) {
        this.f10919y = v1Var;
    }

    @Override
    public final void b(y yVar) {
        this.H = yVar.f13609a;
    }

    @Override
    public final void c(h3.c2 r23, g5.b r24) {
        throw new UnsupportedOperationException("Method not decompiled: i3.j.c(h3.c2, g5.b):void");
    }

    @Override
    public final void d(z zVar) {
        a6.a aVar = this.A;
        if (aVar != null) {
            t0 t0Var = (t0) aVar.d;
            if (t0Var.H == -1) {
                s0 a2 = t0Var.a();
                a2.f9710t = zVar.f4954a;
                a2.f9711u = zVar.f4955b;
                this.A = new a6.a(new t0(a2), aVar.f102c, (String) aVar.f101b, 11);
            }
        }
    }

    @Override
    public final void e(int i9) {
        if (i9 == 1) {
            this.G = true;
        }
        this.v = i9;
    }

    @Override
    public final void g(a aVar, y yVar) {
        d0 d0Var = aVar.d;
        if (d0Var != null) {
            t0 t0Var = yVar.f13611c;
            t0Var.getClass();
            int i9 = yVar.d;
            r2 r2Var = aVar.f10876b;
            d0Var.getClass();
            a6.a aVar2 = new a6.a(t0Var, i9, this.f10910b.c(r2Var, d0Var), 11);
            int i10 = yVar.f13610b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        this.C = aVar2;
                        return;
                    }
                } else {
                    this.B = aVar2;
                    return;
                }
            }
            this.A = aVar2;
        }
    }

    @Override
    public final void h(k3.f fVar) {
        this.J += fVar.f14602g;
        this.K += fVar.f14600e;
    }

    @Override
    public final void i(a aVar, int i9, long j10) {
        long longValue;
        d0 d0Var = aVar.d;
        if (d0Var != null) {
            String c10 = this.f10910b.c(aVar.f10876b, d0Var);
            HashMap hashMap = this.f10914n;
            Long l10 = (Long) hashMap.get(c10);
            HashMap hashMap2 = this.h;
            Long l11 = (Long) hashMap2.get(c10);
            long j11 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap.put(c10, Long.valueOf(longValue + j10));
            if (l11 != null) {
                j11 = l11.longValue();
            }
            hashMap2.put(c10, Long.valueOf(j11 + i9));
        }
    }

    public final boolean j(a6.a aVar) {
        String str;
        if (aVar != null) {
            String str2 = (String) aVar.f101b;
            h hVar = this.f10910b;
            synchronized (hVar) {
                str = hVar.f10907f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void k() {
        long longValue;
        long longValue2;
        int i9;
        PlaybackMetrics.Builder builder = this.f10916s;
        if (builder != null && this.M) {
            builder.setAudioUnderrunCount(this.L);
            this.f10916s.setVideoFramesDropped(this.J);
            this.f10916s.setVideoFramesPlayed(this.K);
            Long l10 = (Long) this.h.get(this.f10915r);
            PlaybackMetrics.Builder builder2 = this.f10916s;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f10914n.get(this.f10915r);
            PlaybackMetrics.Builder builder3 = this.f10916s;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f10916s;
            if (l11 != null && l11.longValue() > 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            builder4.setStreamSource(i9);
            this.f10911c.reportPlaybackMetrics(this.f10916s.build());
        }
        this.f10916s = null;
        this.f10915r = null;
        this.L = 0;
        this.J = 0;
        this.K = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.M = false;
    }

    public final void l(r2 r2Var, d0 d0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.f10916s;
        if (d0Var == null || (b10 = r2Var.b(d0Var.f13426a)) == -1) {
            return;
        }
        p2 p2Var = this.f10913f;
        int i9 = 0;
        r2Var.f(b10, p2Var, false);
        int i10 = p2Var.f9639c;
        q2 q2Var = this.f10912e;
        r2Var.n(i10, q2Var);
        c1 c1Var = q2Var.f9660c.f9399b;
        int i11 = 2;
        if (c1Var != null) {
            int C = f0.C(c1Var.f9362a, c1Var.f9363b);
            if (C != 0) {
                if (C != 1) {
                    if (C != 2) {
                        i9 = 1;
                    } else {
                        i9 = 4;
                    }
                } else {
                    i9 = 5;
                }
            } else {
                i9 = 3;
            }
        }
        builder.setStreamType(i9);
        if (q2Var.f9668y != -9223372036854775807L && !q2Var.f9666w && !q2Var.f9664r && !q2Var.a()) {
            builder.setMediaDurationMillis(f0.S(q2Var.f9668y));
        }
        if (!q2Var.a()) {
            i11 = 1;
        }
        builder.setPlaybackType(i11);
        this.M = true;
    }

    public final void m(a aVar, String str) {
        d0 d0Var = aVar.d;
        if (d0Var != null && d0Var.a()) {
            return;
        }
        k();
        this.f10915r = str;
        this.f10916s = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.3");
        l(aVar.f10876b, d0Var);
    }

    public final void n(a aVar, String str) {
        d0 d0Var = aVar.d;
        if ((d0Var == null || !d0Var.a()) && str.equals(this.f10915r)) {
            k();
        }
        this.h.remove(str);
        this.f10914n.remove(str);
    }

    public final void o(int i9, long j10, t0 t0Var, int i10) {
        int i11;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i9).setTimeSinceCreatedMillis(j10 - this.d);
        if (t0Var != null) {
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
            String str2 = t0Var.A;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = t0Var.B;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = t0Var.f9766r;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i12 = t0Var.f9765n;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = t0Var.G;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = t0Var.H;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = t0Var.O;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = t0Var.P;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str5 = t0Var.f9762c;
            if (str5 != null) {
                int i17 = f0.f4349a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = t0Var.I;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.M = true;
        this.f10911c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override
    public final void f(a aVar) {
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
