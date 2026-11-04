package m2;

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
import b8.ac;
import g9.s1;
import j$.util.Objects;
import java.util.List;
public final class j0 implements o {
    public final Context f18896a;
    public final t0 f18897b;
    public final m0 f18898c;
    public final hi.d d;
    public final float f18899e;
    public g2.s f18900f;
    public g2.h0 f18901g;
    public b h;
    public e f18902i;
    public Looper f18903j;
    public Context f18904k;

    public j0(i0 i0Var) {
        hi.d dVar;
        Context context = i0Var.f18889a;
        this.f18896a = context;
        m0 m0Var = i0Var.f18890b;
        m0Var.getClass();
        this.f18898c = m0Var;
        this.f18897b = i0Var.f18891c;
        this.h = i0Var.d;
        if (context == null) {
            dVar = null;
        } else {
            dVar = new hi.d(this, 11);
        }
        this.d = dVar;
        this.f18899e = i0Var.f18892e;
        this.f18901g = g2.h0.f11849a;
    }

    public final h0 a(n nVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i3 = nVar.h;
            int i10 = nVar.f18950i;
            if (i10 != -1 && (context2 = this.f18896a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f18904k;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f18904k = context2.createDeviceContext(i10);
                }
                context = this.f18904k;
                i3 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(nVar.f18945b).setChannelMask(nVar.f18946c).setEncoding(nVar.f18944a).build();
            d2.f fVar = nVar.f18949g;
            if (nVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = fVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(nVar.f18948f).setSessionId(i3);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(nVar.f18947e);
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new h0(build2, nVar, this.d, this.f18899e, this.f18901g);
            }
            try {
                build2.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new Exception(e);
        } catch (UnsupportedOperationException e11) {
            e = e11;
            throw new Exception(e);
        }
    }

    public final k b(i iVar) {
        e(iVar);
        d2.v vVar = iVar.f18883a;
        d2.f fVar = iVar.f18884b;
        f b10 = this.f18898c.b(fVar, vVar);
        j jVar = new j();
        String str = vVar.f8489s;
        int i3 = vVar.M;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, vVar) != null : i3 == 2) {
            i10 = 2;
        }
        jVar.f18893a = i10;
        jVar.f18894b = b10.f18855a;
        jVar.f18895c = b10.f18856b;
        jVar.d = b10.f18857c;
        return jVar.a();
    }

    public final m2.n c(m2.i r25) {
        throw new UnsupportedOperationException("Method not decompiled: m2.j0.c(m2.i):m2.n");
    }

    public final void d() {
        b3.d dVar;
        g2.s sVar = this.f18900f;
        if (sVar != null) {
            sVar.d();
        }
        e eVar = this.f18902i;
        if (eVar != null) {
            Context context = eVar.f18845a;
            if (eVar.f18853k) {
                eVar.h = null;
                e2.h.e(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f18850g) != null) {
                    dVar.e();
                    eVar.f18850g = null;
                }
                context.unregisterReceiver(eVar.f18848e);
                d dVar2 = eVar.f18849f;
                if (dVar2 != null) {
                    dVar2.f18839a.unregisterContentObserver(dVar2);
                }
                eVar.f18853k = false;
            }
        }
    }

    public final void e(i iVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = iVar.f18885c;
        d2.f fVar = iVar.f18884b;
        f();
        e eVar = this.f18902i;
        if (eVar == null && (context = this.f18896a) != null) {
            e eVar2 = new e(context, new l5.b(this, 5), fVar, audioDeviceInfo);
            this.f18902i = eVar2;
            if (eVar2.f18853k) {
                b10 = eVar2.h;
                b10.getClass();
            } else {
                eVar2.f18853k = true;
                d dVar = eVar2.f18849f;
                if (dVar != null) {
                    dVar.f18839a.registerContentObserver(dVar.f18840b, false, dVar);
                }
                Context context2 = eVar2.f18845a;
                AudioManager e10 = e2.h.e(context2);
                c cVar = eVar2.d;
                Handler handler = eVar2.f18847c;
                e10.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar2.f18850g == null) {
                    eVar2.f18850g = new b3.d(context2, new lg.n(eVar2, 7), Boolean.valueOf(g2.n0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar2.f18848e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar2.f18852j, eVar2.f18851i, eVar2.a());
                eVar2.h = b10;
            }
            this.h = b10;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar.f18851i)) {
                eVar.f18851i = audioDeviceInfo;
                Context context3 = eVar.f18845a;
                d2.f fVar2 = eVar.f18852j;
                List a10 = eVar.a();
                s1 s1Var = b.f18817e;
                eVar.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a10));
            }
            e eVar3 = this.f18902i;
            if (!Objects.equals(fVar, eVar3.f18852j)) {
                eVar3.f18852j = fVar;
                Context context4 = eVar3.f18845a;
                AudioDeviceInfo audioDeviceInfo2 = eVar3.f18851i;
                List a11 = eVar3.a();
                s1 s1Var2 = b.f18817e;
                eVar3.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar, audioDeviceInfo2, a11));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z10;
        String name;
        if (this.f18896a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f18903j;
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
            this.f18903j = myLooper;
            return;
        }
        throw new IllegalStateException(ac.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
