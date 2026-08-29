package k3;

import ag.j2;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import f5.d0;
import g5.y;
import j3.c1;
import j3.p2;
import j3.q2;
import j3.r2;
import j3.s0;
import j3.t0;
import j3.v1;
import java.util.HashMap;
import l4.c0;
import l4.x;
public final class i implements b {
    public j2 A;
    public j2 B;
    public j2 C;
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
    public final Context f13432a;
    public final h f13433b;
    public final PlaybackSession f13434c;
    public String f13438r;
    public PlaybackMetrics.Builder f13439s;
    public int v;
    public v1 f13442y;
    public final q2 f13435e = new q2();
    public final p2 f13436f = new p2();
    public final HashMap f13437n = new HashMap();
    public final HashMap h = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int f13440w = 0;
    public int f13441x = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f13432a = context.getApplicationContext();
        this.f13434c = playbackSession;
        h hVar = new h();
        this.f13433b = hVar;
        hVar.d = this;
    }

    @Override
    public final void a(v1 v1Var) {
        this.f13442y = v1Var;
    }

    @Override
    public final void b(a aVar, x xVar) {
        c0 c0Var = aVar.d;
        if (c0Var != null) {
            t0 t0Var = xVar.f14466c;
            t0Var.getClass();
            int i10 = xVar.d;
            r2 r2Var = aVar.f13400b;
            c0Var.getClass();
            j2 j2Var = new j2(t0Var, i10, this.f13433b.c(r2Var, c0Var));
            int i11 = xVar.f14465b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                        this.C = j2Var;
                        return;
                    }
                } else {
                    this.B = j2Var;
                    return;
                }
            }
            this.A = j2Var;
        }
    }

    @Override
    public final void d(y yVar) {
        j2 j2Var = this.A;
        if (j2Var != null) {
            t0 t0Var = (t0) j2Var.f559c;
            if (t0Var.H == -1) {
                s0 a2 = t0Var.a();
                a2.f10747t = yVar.f7106a;
                a2.f10748u = yVar.f7107b;
                this.A = new j2(new t0(a2), j2Var.f558b, (String) j2Var.d);
            }
        }
    }

    @Override
    public final void e(int i10) {
        if (i10 == 1) {
            this.G = true;
        }
        this.v = i10;
    }

    @Override
    public final void f(m3.f fVar) {
        this.J += fVar.f16822g;
        this.K += fVar.f16820e;
    }

    @Override
    public final void g(j3.c2 r23, g9.l r24) {
        throw new UnsupportedOperationException("Method not decompiled: k3.i.g(j3.c2, g9.l):void");
    }

    @Override
    public final void h(x xVar) {
        this.H = xVar.f14464a;
    }

    @Override
    public final void i(int i10, long j10, a aVar) {
        long longValue;
        c0 c0Var = aVar.d;
        if (c0Var != null) {
            String c3 = this.f13433b.c(aVar.f13400b, c0Var);
            HashMap hashMap = this.f13437n;
            Long l10 = (Long) hashMap.get(c3);
            HashMap hashMap2 = this.h;
            Long l11 = (Long) hashMap2.get(c3);
            long j11 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap.put(c3, Long.valueOf(longValue + j10));
            if (l11 != null) {
                j11 = l11.longValue();
            }
            hashMap2.put(c3, Long.valueOf(j11 + i10));
        }
    }

    public final boolean j(j2 j2Var) {
        String str;
        if (j2Var != null) {
            String str2 = (String) j2Var.d;
            h hVar = this.f13433b;
            synchronized (hVar) {
                str = hVar.f13431f;
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
        int i10;
        PlaybackMetrics.Builder builder = this.f13439s;
        if (builder != null && this.M) {
            builder.setAudioUnderrunCount(this.L);
            this.f13439s.setVideoFramesDropped(this.J);
            this.f13439s.setVideoFramesPlayed(this.K);
            Long l10 = (Long) this.h.get(this.f13438r);
            PlaybackMetrics.Builder builder2 = this.f13439s;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f13437n.get(this.f13438r);
            PlaybackMetrics.Builder builder3 = this.f13439s;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f13439s;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            this.f13434c.reportPlaybackMetrics(this.f13439s.build());
        }
        this.f13439s = null;
        this.f13438r = null;
        this.L = 0;
        this.J = 0;
        this.K = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.M = false;
    }

    public final void l(r2 r2Var, c0 c0Var) {
        int b10;
        PlaybackMetrics.Builder builder = this.f13439s;
        if (c0Var == null || (b10 = r2Var.b(c0Var.f14262a)) == -1) {
            return;
        }
        p2 p2Var = this.f13436f;
        int i10 = 0;
        r2Var.f(b10, p2Var, false);
        int i11 = p2Var.f10676c;
        q2 q2Var = this.f13435e;
        r2Var.n(i11, q2Var);
        c1 c1Var = q2Var.f10697c.f10437b;
        int i12 = 2;
        if (c1Var != null) {
            int C = d0.C(c1Var.f10401a, c1Var.f10402b);
            if (C != 0) {
                if (C != 1) {
                    if (C != 2) {
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
        if (q2Var.f10705y != -9223372036854775807L && !q2Var.f10703w && !q2Var.f10701r && !q2Var.a()) {
            builder.setMediaDurationMillis(d0.S(q2Var.f10705y));
        }
        if (!q2Var.a()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.M = true;
    }

    public final void m(a aVar, String str) {
        c0 c0Var = aVar.d;
        if (c0Var != null && c0Var.a()) {
            return;
        }
        k();
        this.f13438r = str;
        this.f13439s = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.3");
        l(aVar.f13400b, c0Var);
    }

    public final void n(a aVar, String str) {
        c0 c0Var = aVar.d;
        if ((c0Var == null || !c0Var.a()) && str.equals(this.f13438r)) {
            k();
        }
        this.h.remove(str);
        this.f13437n.remove(str);
    }

    public final void o(int i10, long j10, t0 t0Var, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.d);
        if (t0Var != null) {
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
            String str2 = t0Var.A;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = t0Var.B;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = t0Var.f10803r;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = t0Var.f10802n;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = t0Var.G;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = t0Var.H;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = t0Var.O;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = t0Var.P;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = t0Var.f10799c;
            if (str5 != null) {
                int i18 = d0.f6579a;
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
            float f9 = t0Var.I;
            if (f9 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f9);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.M = true;
        this.f13434c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override
    public final void c(a aVar) {
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
