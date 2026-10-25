package k2;

import a8.zb;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import f9.s1;
import j$.util.Objects;
import java.util.List;
import jg.e1;
public final class l0 implements q {
    public final Context f16204a;
    public final v0 f16205b;
    public final o0 f16206c;
    public final jg.s0 d;
    public final float e;
    public e2.r f16207f;
    public e2.g0 f16208g;
    public b h;
    public f f16209i;
    public Looper f16210j;
    public Context f16211k;

    public l0(k0 k0Var) {
        jg.s0 s0Var;
        Context context = k0Var.f16198a;
        this.f16204a = context;
        o0 o0Var = k0Var.f16199b;
        o0Var.getClass();
        this.f16206c = o0Var;
        this.f16205b = k0Var.f16200c;
        this.h = k0Var.d;
        if (context == null) {
            s0Var = null;
        } else {
            s0Var = new jg.s0(this, 1);
        }
        this.d = s0Var;
        this.e = k0Var.e;
        this.f16208g = e2.g0.f9664a;
    }

    public final j0 a(p pVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i10 = pVar.h;
            int i11 = pVar.f16254i;
            if (i11 != -1 && (context2 = this.f16204a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f16211k;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f16211k = context2.createDeviceContext(i11);
                }
                context = this.f16211k;
                i10 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(pVar.f16250b).setChannelMask(pVar.f16251c).setEncoding(pVar.f16249a).build();
            b2.f fVar = pVar.f16253g;
            if (pVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = fVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(pVar.f16252f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(pVar.e);
            }
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new j0(build2, pVar, this.d, this.e, this.f16208g);
            }
            try {
                build2.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new Exception(e);
        } catch (UnsupportedOperationException e10) {
            e = e10;
            throw new Exception(e);
        }
    }

    public final m b(k kVar) {
        e(kVar);
        b2.x xVar = kVar.f16193a;
        b2.f fVar = kVar.f16194b;
        h b10 = this.f16206c.b(fVar, xVar);
        l lVar = new l();
        String str = xVar.f3586s;
        int i10 = xVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, xVar) != null : i10 == 2) {
            i11 = 2;
        }
        lVar.f16201a = i11;
        lVar.f16202b = b10.f16166a;
        lVar.f16203c = b10.f16167b;
        lVar.d = b10.f16168c;
        return lVar.a();
    }

    public final k2.p c(k2.k r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.l0.c(k2.k):k2.p");
    }

    public final void d() {
        z2.d dVar;
        e2.r rVar = this.f16207f;
        if (rVar != null) {
            rVar.d();
        }
        f fVar = this.f16209i;
        if (fVar != null) {
            Context context = fVar.f16153a;
            if (fVar.f16160k) {
                fVar.h = null;
                c2.j.e(context).unregisterAudioDeviceCallback(fVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = fVar.f16157g) != null) {
                    dVar.e();
                    fVar.f16157g = null;
                }
                context.unregisterReceiver(fVar.e);
                e eVar = fVar.f16156f;
                if (eVar != null) {
                    eVar.f16147a.unregisterContentObserver(eVar);
                }
                fVar.f16160k = false;
            }
        }
    }

    public final void e(k kVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = kVar.f16195c;
        b2.f fVar = kVar.f16194b;
        f();
        f fVar2 = this.f16209i;
        if (fVar2 == null && (context = this.f16204a) != null) {
            f fVar3 = new f(context, new e1(this, 4), fVar, audioDeviceInfo);
            this.f16209i = fVar3;
            if (fVar3.f16160k) {
                b10 = fVar3.h;
                b10.getClass();
            } else {
                fVar3.f16160k = true;
                e eVar = fVar3.f16156f;
                if (eVar != null) {
                    eVar.f16147a.registerContentObserver(eVar.f16148b, false, eVar);
                }
                Context context2 = fVar3.f16153a;
                AudioManager e = c2.j.e(context2);
                d dVar = fVar3.d;
                Handler handler = fVar3.f16155c;
                e.registerAudioDeviceCallback(dVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && fVar3.f16157g == null) {
                    fVar3.f16157g = new z2.d(context2, new c(fVar3, 0), Boolean.valueOf(e2.n0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(fVar3.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), fVar3.f16159j, fVar3.f16158i, fVar3.a());
                fVar3.h = b10;
            }
            this.h = b10;
        } else if (fVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(fVar2.f16158i)) {
                fVar2.f16158i = audioDeviceInfo;
                Context context3 = fVar2.f16153a;
                b2.f fVar4 = fVar2.f16159j;
                List a2 = fVar2.a();
                s1 s1Var = b.e;
                fVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar4, audioDeviceInfo, a2));
            }
            f fVar5 = this.f16209i;
            if (!Objects.equals(fVar, fVar5.f16159j)) {
                fVar5.f16159j = fVar;
                Context context4 = fVar5.f16153a;
                AudioDeviceInfo audioDeviceInfo2 = fVar5.f16158i;
                List a10 = fVar5.a();
                s1 s1Var2 = b.e;
                fVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo2, a10));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z10;
        String name;
        if (this.f16204a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f16210j;
        if (looper != null && looper != myLooper) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str = "null";
        if (looper == null) {
            name = "null";
        } else {
            name = looper.getThread().getName();
        }
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        if (z10) {
            this.f16210j = myLooper;
            return;
        }
        throw new IllegalStateException(zb.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
