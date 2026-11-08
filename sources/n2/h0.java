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
    public final Context f20185a;
    public final r0 f20186b;
    public final k0 f20187c;
    public final gf.g d;
    public final float f20188e;
    public h2.r f20189f;
    public h2.g0 f20190g;
    public b h;
    public e f20191i;
    public Looper f20192j;
    public Context f20193k;

    public h0(g0 g0Var) {
        gf.g gVar;
        Context context = g0Var.f20181a;
        this.f20185a = context;
        k0 k0Var = g0Var.f20182b;
        k0Var.getClass();
        this.f20187c = k0Var;
        this.f20186b = g0Var.f20183c;
        this.h = g0Var.d;
        if (context == null) {
            gVar = null;
        } else {
            gVar = new gf.g(this, 18);
        }
        this.d = gVar;
        this.f20188e = g0Var.f20184e;
        this.f20190g = h2.g0.f14088a;
    }

    public final f0 a(n nVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i7 = nVar.h;
            int i10 = nVar.f20251i;
            if (i10 != -1 && (context2 = this.f20185a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f20193k;
                if (context3 == null || context3.getDeviceId() != i10) {
                    this.f20193k = context2.createDeviceContext(i10);
                }
                context = this.f20193k;
                i7 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(nVar.f20246b).setChannelMask(nVar.f20247c).setEncoding(nVar.f20245a).build();
            e2.e eVar = nVar.f20250g;
            if (nVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = eVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(nVar.f20249f).setSessionId(i7);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                sessionId.setOffloadedPlayback(nVar.f20248e);
            }
            if (i11 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new f0(build2, nVar, this.d, this.f20188e, this.f20190g);
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
        e2.u uVar = iVar.f20194a;
        e2.e eVar = iVar.f20195b;
        f a10 = this.f20187c.a(eVar, uVar);
        j jVar = new j();
        String str = uVar.f10615s;
        int i7 = uVar.M;
        int i10 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(eVar, uVar) != null : i7 == 2) {
            i10 = 2;
        }
        jVar.f20223a = i10;
        jVar.f20224b = a10.f20157a;
        jVar.f20225c = a10.f20158b;
        jVar.d = a10.f20159c;
        return jVar.a();
    }

    public final n2.n c(n2.i r25) {
        throw new UnsupportedOperationException("Method not decompiled: n2.h0.c(n2.i):n2.n");
    }

    public final void d() {
        c3.d dVar;
        h2.r rVar = this.f20189f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f20191i;
        if (eVar != null) {
            Context context = eVar.f20145a;
            if (eVar.f20153k) {
                eVar.h = null;
                f2.i.d(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f20150g) != null) {
                    dVar.e();
                    eVar.f20150g = null;
                }
                context.unregisterReceiver(eVar.f20148e);
                d dVar2 = eVar.f20149f;
                if (dVar2 != null) {
                    dVar2.f20141a.unregisterContentObserver(dVar2);
                }
                eVar.f20153k = false;
            }
        }
    }

    public final void e(i iVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = iVar.f20196c;
        e2.e eVar = iVar.f20195b;
        f();
        e eVar2 = this.f20191i;
        if (eVar2 == null && (context = this.f20185a) != null) {
            e eVar3 = new e(context, new l2.y(this, 20), eVar, audioDeviceInfo);
            this.f20191i = eVar3;
            if (eVar3.f20153k) {
                b10 = eVar3.h;
                b10.getClass();
            } else {
                eVar3.f20153k = true;
                d dVar = eVar3.f20149f;
                if (dVar != null) {
                    dVar.f20141a.registerContentObserver(dVar.f20142b, false, dVar);
                }
                Context context2 = eVar3.f20145a;
                AudioManager d = f2.i.d(context2);
                c cVar = eVar3.d;
                Handler handler = eVar3.f20147c;
                d.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar3.f20150g == null) {
                    eVar3.f20150g = new c3.d(context2, new l2.w(eVar3, 11), Boolean.valueOf(h2.m0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar3.f20148e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar3.f20152j, eVar3.f20151i, eVar3.a());
                eVar3.h = b10;
            }
            this.h = b10;
        } else if (eVar2 != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar2.f20151i)) {
                eVar2.f20151i = audioDeviceInfo;
                Context context3 = eVar2.f20145a;
                e2.e eVar4 = eVar2.f20152j;
                List a10 = eVar2.a();
                t1 t1Var = b.f20130e;
                eVar2.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar4, audioDeviceInfo, a10));
            }
            e eVar5 = this.f20191i;
            if (!Objects.equals(eVar, eVar5.f20152j)) {
                eVar5.f20152j = eVar;
                Context context4 = eVar5.f20145a;
                AudioDeviceInfo audioDeviceInfo2 = eVar5.f20151i;
                List a11 = eVar5.a();
                t1 t1Var2 = b.f20130e;
                eVar5.b(b.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, audioDeviceInfo2, a11));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z9;
        String name;
        if (this.f20185a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f20192j;
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
            this.f20192j = myLooper;
            return;
        }
        throw new IllegalStateException(ja.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
