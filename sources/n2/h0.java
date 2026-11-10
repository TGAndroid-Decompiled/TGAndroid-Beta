package n2;

import a8.ja;
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
import h9.t1;
import j$.util.Objects;
import java.util.List;
public final class h0 implements o {
    public final Context f20190a;
    public final r0 f20191b;
    public final k0 f20192c;
    public final gf.g d;
    public final float f20193e;
    public h2.r f20194f;
    public h2.g0 f20195g;
    public b h;
    public e f20196i;
    public Looper f20197j;
    public Context f20198k;

    public h0(g0 g0Var) {
        gf.g gVar;
        Context context = g0Var.f20186a;
        this.f20190a = context;
        k0 k0Var = g0Var.f20187b;
        k0Var.getClass();
        this.f20192c = k0Var;
        this.f20191b = g0Var.f20188c;
        this.h = g0Var.d;
        if (context == null) {
            gVar = null;
        } else {
            gVar = new gf.g(this, 18);
        }
        this.d = gVar;
        this.f20193e = g0Var.f20189e;
        this.f20195g = h2.g0.f14090a;
    }

    public final f0 a(n nVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i7 = nVar.h;
            int i10 = nVar.f20256i;
            if (i10 != -1 && (context2 = this.f20190a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f20198k;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f20198k = context2.createDeviceContext(i10);
                }
                context = this.f20198k;
                i7 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(nVar.f20251b).setChannelMask(nVar.f20252c).setEncoding(nVar.f20250a).build();
            e2.e eVar = nVar.f20255g;
            if (nVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = eVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(nVar.f20254f).setSessionId(i7);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(nVar.f20253e);
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new f0(build2, nVar, this.d, this.f20193e, this.f20195g);
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
        e2.u uVar = iVar.f20199a;
        e2.e eVar = iVar.f20200b;
        f a10 = this.f20192c.a(eVar, uVar);
        j jVar = new j();
        String str = uVar.f10620s;
        int i7 = uVar.M;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(eVar, uVar) != null : i7 == 2) {
            i10 = 2;
        }
        jVar.f20228a = i10;
        jVar.f20229b = a10.f20162a;
        jVar.f20230c = a10.f20163b;
        jVar.d = a10.f20164c;
        return jVar.a();
    }

    public final n2.n c(n2.i r25) {
        throw new UnsupportedOperationException("Method not decompiled: n2.h0.c(n2.i):n2.n");
    }

    public final void d() {
        c3.d dVar;
        h2.r rVar = this.f20194f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f20196i;
        if (eVar != null) {
            Context context = eVar.f20150a;
            if (eVar.f20158k) {
                eVar.h = null;
                f2.i.d(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f20155g) != null) {
                    dVar.e();
                    eVar.f20155g = null;
                }
                context.unregisterReceiver(eVar.f20153e);
                d dVar2 = eVar.f20154f;
                if (dVar2 != null) {
                    dVar2.f20146a.unregisterContentObserver(dVar2);
                }
                eVar.f20158k = false;
            }
        }
    }

    public final void e(i iVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = iVar.f20201c;
        e2.e eVar = iVar.f20200b;
        f();
        e eVar2 = this.f20196i;
        if (eVar2 == null && (context = this.f20190a) != null) {
            e eVar3 = new e(context, new l2.x(this, 20), eVar, audioDeviceInfo);
            this.f20196i = eVar3;
            if (eVar3.f20158k) {
                b10 = eVar3.h;
                b10.getClass();
            } else {
                eVar3.f20158k = true;
                d dVar = eVar3.f20154f;
                if (dVar != null) {
                    dVar.f20146a.registerContentObserver(dVar.f20147b, false, dVar);
                }
                Context context2 = eVar3.f20150a;
                AudioManager d = f2.i.d(context2);
                c cVar = eVar3.d;
                Handler handler = eVar3.f20152c;
                d.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar3.f20155g == null) {
                    eVar3.f20155g = new c3.d(context2, new l2.a0(eVar3, 10), Boolean.valueOf(h2.m0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar3.f20153e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar3.f20157j, eVar3.f20156i, eVar3.a());
                eVar3.h = b10;
            }
            this.h = b10;
        } else if (eVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar2.f20156i)) {
                eVar2.f20156i = audioDeviceInfo;
                Context context3 = eVar2.f20150a;
                e2.e eVar4 = eVar2.f20157j;
                List a10 = eVar2.a();
                t1 t1Var = b.f20135e;
                eVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar4, audioDeviceInfo, a10));
            }
            e eVar5 = this.f20196i;
            if (!Objects.equals(eVar, eVar5.f20157j)) {
                eVar5.f20157j = eVar;
                Context context4 = eVar5.f20150a;
                AudioDeviceInfo audioDeviceInfo2 = eVar5.f20156i;
                List a11 = eVar5.a();
                t1 t1Var2 = b.f20135e;
                eVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, audioDeviceInfo2, a11));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z9;
        String name;
        if (this.f20190a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f20197j;
        if (looper != null && looper != myLooper) {
            z9 = false;
        } else {
            z9 = true;
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
        if (z9) {
            this.f20197j = myLooper;
            return;
        }
        throw new IllegalStateException(ja.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
