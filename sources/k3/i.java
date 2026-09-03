package k3;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import b4.e0;
import h5.d0;
import i5.y;
import j3.m0;
import j3.m2;
import j3.n0;
import j3.n2;
import j3.o2;
import j3.t1;
import j3.y0;
import java.util.HashMap;
import o4.r;
import o4.v;
public final class i implements b {
    public e0 B;
    public e0 C;
    public e0 D;
    public n0 E;
    public n0 F;
    public n0 G;
    public boolean H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Context f9704a;
    public final h f9705b;
    public final PlaybackSession f9706c;
    public String f9709r;
    public PlaybackMetrics.Builder f9710s;
    public int v;
    public t1 f9713y;
    public final n2 e = new n2();
    public final m2 f9707f = new m2();
    public final HashMap f9708n = new HashMap();
    public final HashMap h = new HashMap();
    public final long d = SystemClock.elapsedRealtime();
    public int f9711w = 0;
    public int f9712x = 0;

    public i(Context context, PlaybackSession playbackSession) {
        this.f9704a = context.getApplicationContext();
        this.f9706c = playbackSession;
        h hVar = new h();
        this.f9705b = hVar;
        hVar.d = this;
    }

    @Override
    public final void a(j3.a2 r23, f7.b r24) {
        throw new UnsupportedOperationException("Method not decompiled: k3.i.a(j3.a2, f7.b):void");
    }

    @Override
    public final void b(t1 t1Var) {
        this.f9713y = t1Var;
    }

    @Override
    public final void c(a aVar, r rVar) {
        v vVar = aVar.d;
        if (vVar != null) {
            n0 n0Var = rVar.f16386c;
            n0Var.getClass();
            int i10 = rVar.d;
            o2 o2Var = aVar.f9676b;
            vVar.getClass();
            e0 e0Var = new e0(n0Var, i10, this.f9705b.d(o2Var, vVar), 11);
            int i11 = rVar.f16385b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            return;
                        }
                        this.D = e0Var;
                        return;
                    }
                } else {
                    this.C = e0Var;
                    return;
                }
            }
            this.B = e0Var;
        }
    }

    @Override
    public final void d(n3.f fVar) {
        this.K += fVar.f14221g;
        this.L += fVar.e;
    }

    @Override
    public final void e(a aVar, int i10, long j10) {
        long longValue;
        v vVar = aVar.d;
        if (vVar != null) {
            String d = this.f9705b.d(aVar.f9676b, vVar);
            HashMap hashMap = this.f9708n;
            Long l10 = (Long) hashMap.get(d);
            HashMap hashMap2 = this.h;
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
            hashMap2.put(d, Long.valueOf(j11 + i10));
        }
    }

    @Override
    public final void f(r rVar) {
        this.I = rVar.f16384a;
    }

    @Override
    public final void g(y yVar) {
        e0 e0Var = this.B;
        if (e0Var != null) {
            n0 n0Var = (n0) e0Var.f1379c;
            if (n0Var.I == -1) {
                m0 a2 = n0Var.a();
                a2.f8671t = yVar.f7324a;
                a2.f8672u = yVar.f7325b;
                this.B = new e0(new n0(a2), e0Var.f1378b, (String) e0Var.d, 11);
            }
        }
    }

    @Override
    public final void h(a aVar, int i10) {
        if (i10 == 1) {
            this.H = true;
        }
        this.v = i10;
    }

    public final boolean i(e0 e0Var) {
        String str;
        if (e0Var != null) {
            String str2 = (String) e0Var.d;
            h hVar = this.f9705b;
            synchronized (hVar) {
                str = hVar.f9702f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j() {
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics.Builder builder = this.f9710s;
        if (builder != null && this.N) {
            builder.setAudioUnderrunCount(this.M);
            this.f9710s.setVideoFramesDropped(this.K);
            this.f9710s.setVideoFramesPlayed(this.L);
            Long l10 = (Long) this.h.get(this.f9709r);
            PlaybackMetrics.Builder builder2 = this.f9710s;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.f9708n.get(this.f9709r);
            PlaybackMetrics.Builder builder3 = this.f9710s;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f9710s;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
            this.f9706c.reportPlaybackMetrics(this.f9710s.build());
        }
        this.f9710s = null;
        this.f9709r = null;
        this.M = 0;
        this.K = 0;
        this.L = 0;
        this.E = null;
        this.F = null;
        this.G = null;
        this.N = false;
    }

    public final void k(o2 o2Var, v vVar) {
        int b10;
        PlaybackMetrics.Builder builder = this.f9710s;
        if (vVar == null || (b10 = o2Var.b(vVar.f16406a)) == -1) {
            return;
        }
        m2 m2Var = this.f9707f;
        int i10 = 0;
        o2Var.f(b10, m2Var, false);
        int i11 = m2Var.f8686c;
        n2 n2Var = this.e;
        o2Var.n(i11, n2Var);
        y0 y0Var = n2Var.f8733c.f8431b;
        int i12 = 2;
        if (y0Var != null) {
            int C = d0.C(y0Var.f8871a, y0Var.f8872b);
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
        if (n2Var.f8740y != -9223372036854775807L && !n2Var.f8738w && !n2Var.f8736r && !n2Var.a()) {
            builder.setMediaDurationMillis(d0.S(n2Var.f8740y));
        }
        if (!n2Var.a()) {
            i12 = 1;
        }
        builder.setPlaybackType(i12);
        this.N = true;
    }

    public final void l(a aVar, String str) {
        v vVar = aVar.d;
        if (vVar != null && vVar.a()) {
            return;
        }
        j();
        this.f9709r = str;
        this.f9710s = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.1");
        k(aVar.f9676b, vVar);
    }

    public final void m(a aVar, String str) {
        v vVar = aVar.d;
        if ((vVar == null || !vVar.a()) && str.equals(this.f9709r)) {
            j();
        }
        this.h.remove(str);
        this.f9708n.remove(str);
    }

    public final void n(int i10, long j10, n0 n0Var, int i11) {
        int i12;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.d);
        if (n0Var != null) {
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
            String str2 = n0Var.B;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = n0Var.C;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = n0Var.f8722r;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = n0Var.f8721n;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = n0Var.H;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = n0Var.I;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = n0Var.P;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = n0Var.Q;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = n0Var.f8719c;
            if (str5 != null) {
                int i18 = d0.f6924a;
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
            float f10 = n0Var.J;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.N = true;
        this.f9706c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @Override
    public final void onRenderedFirstFrame(a aVar) {
    }

    @Override
    public final void onSeekStarted(a aVar) {
    }
}
