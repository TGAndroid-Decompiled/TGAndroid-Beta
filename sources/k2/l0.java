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
    public final Context f16203a;
    public final v0 f16204b;
    public final o0 f16205c;
    public final jg.s0 d;
    public final float e;
    public e2.r f16206f;
    public e2.g0 f16207g;
    public b h;
    public f f16208i;
    public Looper f16209j;
    public Context f16210k;

    public l0(k0 k0Var) {
        jg.s0 s0Var;
        Context context = k0Var.f16197a;
        this.f16203a = context;
        o0 o0Var = k0Var.f16198b;
        o0Var.getClass();
        this.f16205c = o0Var;
        this.f16204b = k0Var.f16199c;
        this.h = k0Var.d;
        if (context == null) {
            s0Var = null;
        } else {
            s0Var = new jg.s0(this, 1);
        }
        this.d = s0Var;
        this.e = k0Var.e;
        this.f16207g = e2.g0.f9663a;
    }

    public final j0 a(p pVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i10 = pVar.h;
            int i11 = pVar.f16253i;
            if (i11 != -1 && (context2 = this.f16203a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f16210k;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f16210k = context2.createDeviceContext(i11);
                }
                context = this.f16210k;
                i10 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(pVar.f16249b).setChannelMask(pVar.f16250c).setEncoding(pVar.f16248a).build();
            b2.f fVar = pVar.f16252g;
            if (pVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = fVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(pVar.f16251f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(pVar.e);
            }
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new j0(build2, pVar, this.d, this.e, this.f16207g);
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
        b2.x xVar = kVar.f16192a;
        b2.f fVar = kVar.f16193b;
        h b10 = this.f16205c.b(fVar, xVar);
        l lVar = new l();
        String str = xVar.f3586s;
        int i10 = xVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, xVar) != null : i10 == 2) {
            i11 = 2;
        }
        lVar.f16200a = i11;
        lVar.f16201b = b10.f16165a;
        lVar.f16202c = b10.f16166b;
        lVar.d = b10.f16167c;
        return lVar.a();
    }

    public final k2.p c(k2.k r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.l0.c(k2.k):k2.p");
    }

    public final void d() {
        z2.d dVar;
        e2.r rVar = this.f16206f;
        if (rVar != null) {
            rVar.d();
        }
        f fVar = this.f16208i;
        if (fVar != null) {
            Context context = fVar.f16152a;
            if (fVar.f16159k) {
                fVar.h = null;
                c2.j.e(context).unregisterAudioDeviceCallback(fVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = fVar.f16156g) != null) {
                    dVar.e();
                    fVar.f16156g = null;
                }
                context.unregisterReceiver(fVar.e);
                e eVar = fVar.f16155f;
                if (eVar != null) {
                    eVar.f16146a.unregisterContentObserver(eVar);
                }
                fVar.f16159k = false;
            }
        }
    }

    public final void e(k kVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = kVar.f16194c;
        b2.f fVar = kVar.f16193b;
        f();
        f fVar2 = this.f16208i;
        if (fVar2 == null && (context = this.f16203a) != null) {
            f fVar3 = new f(context, new e1(this, 4), fVar, audioDeviceInfo);
            this.f16208i = fVar3;
            if (fVar3.f16159k) {
                b10 = fVar3.h;
                b10.getClass();
            } else {
                fVar3.f16159k = true;
                e eVar = fVar3.f16155f;
                if (eVar != null) {
                    eVar.f16146a.registerContentObserver(eVar.f16147b, false, eVar);
                }
                Context context2 = fVar3.f16152a;
                AudioManager e = c2.j.e(context2);
                d dVar = fVar3.d;
                Handler handler = fVar3.f16154c;
                e.registerAudioDeviceCallback(dVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && fVar3.f16156g == null) {
                    fVar3.f16156g = new z2.d(context2, new c(fVar3, 0), Boolean.valueOf(e2.n0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(fVar3.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), fVar3.f16158j, fVar3.f16157i, fVar3.a());
                fVar3.h = b10;
            }
            this.h = b10;
        } else if (fVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(fVar2.f16157i)) {
                fVar2.f16157i = audioDeviceInfo;
                Context context3 = fVar2.f16152a;
                b2.f fVar4 = fVar2.f16158j;
                List a2 = fVar2.a();
                s1 s1Var = b.e;
                fVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar4, audioDeviceInfo, a2));
            }
            f fVar5 = this.f16208i;
            if (!Objects.equals(fVar, fVar5.f16158j)) {
                fVar5.f16158j = fVar;
                Context context4 = fVar5.f16152a;
                AudioDeviceInfo audioDeviceInfo2 = fVar5.f16157i;
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
        if (this.f16203a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f16209j;
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
            this.f16209j = myLooper;
            return;
        }
        throw new IllegalStateException(zb.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
