package k2;

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
import e9.x1;
import j$.util.Objects;
import java.util.List;
import v7.u6;
public final class n0 implements p {
    public final Context f10710a;
    public final x0 f10711b;
    public final q0 f10712c;
    public final m0 d;
    public final float e;
    public e2.r f10713f;
    public e2.g0 f10714g;
    public b h;
    public e f10715i;
    public Looper f10716j;
    public Context f10717k;

    public n0(l0 l0Var) {
        m0 m0Var;
        Context context = l0Var.f10698a;
        this.f10710a = context;
        q0 q0Var = l0Var.f10699b;
        q0Var.getClass();
        this.f10712c = q0Var;
        this.f10711b = l0Var.f10700c;
        this.h = l0Var.d;
        if (context == null) {
            m0Var = null;
        } else {
            m0Var = new m0(this);
        }
        this.d = m0Var;
        this.e = l0Var.e;
        this.f10714g = e2.g0.f6143a;
    }

    public final j0 a(o oVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i10 = oVar.h;
            int i11 = oVar.f10723i;
            if (i11 != -1 && (context2 = this.f10710a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f10717k;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f10717k = context2.createDeviceContext(i11);
                }
                context = this.f10717k;
                i10 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(oVar.f10719b).setChannelMask(oVar.f10720c).setEncoding(oVar.f10718a).build();
            b2.f fVar = oVar.f10722g;
            if (oVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = fVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(oVar.f10721f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(oVar.e);
            }
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new j0(build2, oVar, this.d, this.e, this.f10714g);
            }
            try {
                build2.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException e) {
            e = e;
            throw new Exception(e);
        } catch (UnsupportedOperationException e7) {
            e = e7;
            throw new Exception(e);
        }
    }

    public final l b(j jVar) {
        e(jVar);
        b2.x xVar = jVar.f10668a;
        b2.f fVar = jVar.f10669b;
        g b10 = this.f10712c.b(fVar, xVar);
        k kVar = new k();
        String str = xVar.f2423s;
        int i10 = xVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, xVar) != null : i10 == 2) {
            i11 = 2;
        }
        kVar.f10691a = i11;
        kVar.f10692b = b10.f10658a;
        kVar.f10693c = b10.f10659b;
        kVar.d = b10.f10660c;
        return kVar.a();
    }

    public final k2.o c(k2.j r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.n0.c(k2.j):k2.o");
    }

    public final void d() {
        z2.d dVar;
        e2.r rVar = this.f10713f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f10715i;
        if (eVar != null) {
            Context context = eVar.f10637a;
            if (eVar.f10644k) {
                eVar.h = null;
                c2.h.e(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f10641g) != null) {
                    dVar.e();
                    eVar.f10641g = null;
                }
                context.unregisterReceiver(eVar.e);
                d dVar2 = eVar.f10640f;
                if (dVar2 != null) {
                    dVar2.f10627a.unregisterContentObserver(dVar2);
                }
                eVar.f10644k = false;
            }
        }
    }

    public final void e(j jVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = jVar.f10670c;
        b2.f fVar = jVar.f10669b;
        f();
        e eVar = this.f10715i;
        if (eVar == null && (context = this.f10710a) != null) {
            e eVar2 = new e(context, new ig.c0(this, 18), fVar, audioDeviceInfo);
            this.f10715i = eVar2;
            if (eVar2.f10644k) {
                b10 = eVar2.h;
                b10.getClass();
            } else {
                eVar2.f10644k = true;
                d dVar = eVar2.f10640f;
                if (dVar != null) {
                    dVar.f10627a.registerContentObserver(dVar.f10628b, false, dVar);
                }
                Context context2 = eVar2.f10637a;
                AudioManager e = c2.h.e(context2);
                c cVar = eVar2.d;
                Handler handler = eVar2.f10639c;
                e.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar2.f10641g == null) {
                    eVar2.f10641g = new z2.d(context2, new gg.c(eVar2, 19), Boolean.valueOf(e2.l0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar2.f10643j, eVar2.f10642i, eVar2.a());
                eVar2.h = b10;
            }
            this.h = b10;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar.f10642i)) {
                eVar.f10642i = audioDeviceInfo;
                Context context3 = eVar.f10637a;
                b2.f fVar2 = eVar.f10643j;
                List a2 = eVar.a();
                x1 x1Var = b.e;
                eVar.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
            }
            e eVar3 = this.f10715i;
            if (!Objects.equals(fVar, eVar3.f10643j)) {
                eVar3.f10643j = fVar;
                Context context4 = eVar3.f10637a;
                AudioDeviceInfo audioDeviceInfo2 = eVar3.f10642i;
                List a10 = eVar3.a();
                x1 x1Var2 = b.e;
                eVar3.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo2, a10));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z10;
        String name;
        if (this.f10710a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f10716j;
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
            this.f10716j = myLooper;
            return;
        }
        throw new IllegalStateException(u6.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
