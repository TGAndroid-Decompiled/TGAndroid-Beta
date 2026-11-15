package n2;

import a8.ka;
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
import kg.j1;
public final class i0 implements o {
    public final Context f20766a;
    public final s0 f20767b;
    public final l0 f20768c;
    public final ia.d d;
    public final float f20769e;
    public h2.r f20770f;
    public h2.g0 f20771g;
    public b h;
    public e f20772i;
    public Looper f20773j;
    public Context f20774k;

    public i0(h0 h0Var) {
        ia.d dVar;
        Context context = h0Var.f20756a;
        this.f20766a = context;
        l0 l0Var = h0Var.f20757b;
        l0Var.getClass();
        this.f20768c = l0Var;
        this.f20767b = h0Var.f20758c;
        this.h = h0Var.d;
        if (context == null) {
            dVar = null;
        } else {
            dVar = new ia.d(this, 13);
        }
        this.d = dVar;
        this.f20769e = h0Var.f20759e;
        this.f20771g = h2.g0.f13448a;
    }

    public final g0 a(n nVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i7 = nVar.h;
            int i10 = nVar.f20824i;
            if (i10 != -1 && (context2 = this.f20766a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f20774k;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f20774k = context2.createDeviceContext(i10);
                }
                context = this.f20774k;
                i7 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(nVar.f20819b).setChannelMask(nVar.f20820c).setEncoding(nVar.f20818a).build();
            e2.e eVar = nVar.f20823g;
            if (nVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = eVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(nVar.f20822f).setSessionId(i7);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(nVar.f20821e);
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new g0(build2, nVar, this.d, this.f20769e, this.f20771g);
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
        e2.u uVar = iVar.f20760a;
        e2.e eVar = iVar.f20761b;
        f a10 = this.f20768c.a(eVar, uVar);
        j jVar = new j();
        String str = uVar.f10451s;
        int i7 = uVar.M;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(eVar, uVar) != null : i7 == 2) {
            i10 = 2;
        }
        jVar.f20775a = i10;
        jVar.f20776b = a10.f20729a;
        jVar.f20777c = a10.f20730b;
        jVar.d = a10.f20731c;
        return jVar.a();
    }

    public final n2.n c(n2.i r25) {
        throw new UnsupportedOperationException("Method not decompiled: n2.i0.c(n2.i):n2.n");
    }

    public final void d() {
        c3.d dVar;
        h2.r rVar = this.f20770f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f20772i;
        if (eVar != null) {
            Context context = eVar.f20719a;
            if (eVar.f20727k) {
                eVar.h = null;
                f2.h.d(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f20724g) != null) {
                    dVar.e();
                    eVar.f20724g = null;
                }
                context.unregisterReceiver(eVar.f20722e);
                d dVar2 = eVar.f20723f;
                if (dVar2 != null) {
                    dVar2.f20715a.unregisterContentObserver(dVar2);
                }
                eVar.f20727k = false;
            }
        }
    }

    public final void e(i iVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = iVar.f20762c;
        e2.e eVar = iVar.f20761b;
        f();
        e eVar2 = this.f20772i;
        if (eVar2 == null && (context = this.f20766a) != null) {
            e eVar3 = new e(context, new ki.e(this, 16), eVar, audioDeviceInfo);
            this.f20772i = eVar3;
            if (eVar3.f20727k) {
                b10 = eVar3.h;
                b10.getClass();
            } else {
                eVar3.f20727k = true;
                d dVar = eVar3.f20723f;
                if (dVar != null) {
                    dVar.f20715a.registerContentObserver(dVar.f20716b, false, dVar);
                }
                Context context2 = eVar3.f20719a;
                AudioManager d = f2.h.d(context2);
                c cVar = eVar3.d;
                Handler handler = eVar3.f20721c;
                d.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar3.f20724g == null) {
                    eVar3.f20724g = new c3.d(context2, new j1(eVar3, 17), Boolean.valueOf(h2.l0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar3.f20722e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar3.f20726j, eVar3.f20725i, eVar3.a());
                eVar3.h = b10;
            }
            this.h = b10;
        } else if (eVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar2.f20725i)) {
                eVar2.f20725i = audioDeviceInfo;
                Context context3 = eVar2.f20719a;
                e2.e eVar4 = eVar2.f20726j;
                List a10 = eVar2.a();
                s1 s1Var = b.f20704e;
                eVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar4, audioDeviceInfo, a10));
            }
            e eVar5 = this.f20772i;
            if (!Objects.equals(eVar, eVar5.f20726j)) {
                eVar5.f20726j = eVar;
                Context context4 = eVar5.f20719a;
                AudioDeviceInfo audioDeviceInfo2 = eVar5.f20725i;
                List a11 = eVar5.a();
                s1 s1Var2 = b.f20704e;
                eVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, audioDeviceInfo2, a11));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z10;
        String name;
        if (this.f20766a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f20773j;
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
            this.f20773j = myLooper;
            return;
        }
        throw new IllegalStateException(ka.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
