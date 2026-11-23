package n2;

import a8.bb;
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
import h9.s1;
import j$.util.Objects;
import java.util.List;
import kg.f1;
public final class j0 implements o {
    public final Context f21227a;
    public final t0 f21228b;
    public final m0 f21229c;
    public final hi.u0 d;
    public final float f21230e;
    public h2.r f21231f;
    public h2.g0 f21232g;
    public b h;
    public e f21233i;
    public Looper f21234j;
    public Context f21235k;

    public j0(i0 i0Var) {
        hi.u0 u0Var;
        Context context = i0Var.f21220a;
        this.f21227a = context;
        m0 m0Var = i0Var.f21221b;
        m0Var.getClass();
        this.f21229c = m0Var;
        this.f21228b = i0Var.f21222c;
        this.h = i0Var.d;
        if (context == null) {
            u0Var = null;
        } else {
            u0Var = new hi.u0(this, 17);
        }
        this.d = u0Var;
        this.f21230e = i0Var.f21223e;
        this.f21232g = h2.g0.f13755a;
    }

    public final h0 a(n nVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i7 = nVar.h;
            int i10 = nVar.f21281i;
            if (i10 != -1 && (context2 = this.f21227a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f21235k;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f21235k = context2.createDeviceContext(i10);
                }
                context = this.f21235k;
                i7 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(nVar.f21276b).setChannelMask(nVar.f21277c).setEncoding(nVar.f21275a).build();
            e2.e eVar = nVar.f21280g;
            if (nVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = eVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(nVar.f21279f).setSessionId(i7);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(nVar.f21278e);
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new h0(build2, nVar, this.d, this.f21230e, this.f21232g);
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
        e2.u uVar = iVar.f21214a;
        e2.e eVar = iVar.f21215b;
        f a10 = this.f21229c.a(eVar, uVar);
        j jVar = new j();
        String str = uVar.f10759s;
        int i7 = uVar.M;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(eVar, uVar) != null : i7 == 2) {
            i10 = 2;
        }
        jVar.f21224a = i10;
        jVar.f21225b = a10.f21186a;
        jVar.f21226c = a10.f21187b;
        jVar.d = a10.f21188c;
        return jVar.a();
    }

    public final n2.n c(n2.i r25) {
        throw new UnsupportedOperationException("Method not decompiled: n2.j0.c(n2.i):n2.n");
    }

    public final void d() {
        c3.d dVar;
        h2.r rVar = this.f21231f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f21233i;
        if (eVar != null) {
            Context context = eVar.f21176a;
            if (eVar.f21184k) {
                eVar.h = null;
                f2.i.d(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f21181g) != null) {
                    dVar.e();
                    eVar.f21181g = null;
                }
                context.unregisterReceiver(eVar.f21179e);
                d dVar2 = eVar.f21180f;
                if (dVar2 != null) {
                    dVar2.f21170a.unregisterContentObserver(dVar2);
                }
                eVar.f21184k = false;
            }
        }
    }

    public final void e(i iVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = iVar.f21216c;
        e2.e eVar = iVar.f21215b;
        f();
        e eVar2 = this.f21233i;
        if (eVar2 == null && (context = this.f21227a) != null) {
            e eVar3 = new e(context, new f1(this, 20), eVar, audioDeviceInfo);
            this.f21233i = eVar3;
            if (eVar3.f21184k) {
                b10 = eVar3.h;
                b10.getClass();
            } else {
                eVar3.f21184k = true;
                d dVar = eVar3.f21180f;
                if (dVar != null) {
                    dVar.f21170a.registerContentObserver(dVar.f21171b, false, dVar);
                }
                Context context2 = eVar3.f21176a;
                AudioManager d = f2.i.d(context2);
                c cVar = eVar3.d;
                Handler handler = eVar3.f21178c;
                d.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar3.f21181g == null) {
                    eVar3.f21181g = new c3.d(context2, new kg.i0(eVar3, 21), Boolean.valueOf(h2.l0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar3.f21179e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar3.f21183j, eVar3.f21182i, eVar3.a());
                eVar3.h = b10;
            }
            this.h = b10;
        } else if (eVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar2.f21182i)) {
                eVar2.f21182i = audioDeviceInfo;
                Context context3 = eVar2.f21176a;
                e2.e eVar4 = eVar2.f21183j;
                List a10 = eVar2.a();
                s1 s1Var = b.f21152e;
                eVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar4, audioDeviceInfo, a10));
            }
            e eVar5 = this.f21233i;
            if (!Objects.equals(eVar, eVar5.f21183j)) {
                eVar5.f21183j = eVar;
                Context context4 = eVar5.f21176a;
                AudioDeviceInfo audioDeviceInfo2 = eVar5.f21182i;
                List a11 = eVar5.a();
                s1 s1Var2 = b.f21152e;
                eVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, audioDeviceInfo2, a11));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z10;
        String name;
        if (this.f21227a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f21234j;
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
            this.f21234j = myLooper;
            return;
        }
        throw new IllegalStateException(bb.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
