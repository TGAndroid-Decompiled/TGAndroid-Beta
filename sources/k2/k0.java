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
import ei.bc;
import j$.util.Objects;
import java.util.List;
import v7.v6;
public final class k0 implements q {
    public final Context f14764a;
    public final u0 f14765b;
    public final n0 f14766c;
    public final a6.i d;
    public final float e;
    public e2.r f14767f;
    public e2.g0 f14768g;
    public b h;
    public e f14769i;
    public Looper f14770j;
    public Context f14771k;

    public k0(j0 j0Var) {
        a6.i iVar;
        Context context = j0Var.f14756a;
        this.f14764a = context;
        n0 n0Var = j0Var.f14757b;
        n0Var.getClass();
        this.f14766c = n0Var;
        this.f14765b = j0Var.f14758c;
        this.h = j0Var.d;
        if (context == null) {
            iVar = null;
        } else {
            iVar = new a6.i(this, 28);
        }
        this.d = iVar;
        this.e = j0Var.e;
        this.f14768g = e2.g0.f8236a;
    }

    public final i0 a(p pVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i10 = pVar.h;
            int i11 = pVar.f14818i;
            if (i11 != -1 && (context2 = this.f14764a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f14771k;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f14771k = context2.createDeviceContext(i11);
                }
                context = this.f14771k;
                i10 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(pVar.f14814b).setChannelMask(pVar.f14815c).setEncoding(pVar.f14813a).build();
            b2.f fVar = pVar.f14817g;
            if (pVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = fVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(pVar.f14816f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(pVar.e);
            }
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new i0(build2, pVar, this.d, this.e, this.f14768g);
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

    public final m b(k kVar) {
        e(kVar);
        b2.w wVar = kVar.f14759a;
        b2.f fVar = kVar.f14760b;
        h b10 = this.f14766c.b(fVar, wVar);
        l lVar = new l();
        String str = wVar.f4135s;
        int i10 = wVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, wVar) != null : i10 == 2) {
            i11 = 2;
        }
        lVar.f14772a = i11;
        lVar.f14773b = b10.f14730a;
        lVar.f14774c = b10.f14731b;
        lVar.d = b10.f14732c;
        return lVar.a();
    }

    public final k2.p c(k2.k r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.k0.c(k2.k):k2.p");
    }

    public final void d() {
        z2.e eVar;
        e2.r rVar = this.f14767f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar2 = this.f14769i;
        if (eVar2 != null) {
            Context context = eVar2.f14715a;
            if (eVar2.f14722k) {
                eVar2.h = null;
                c2.i.e(context).unregisterAudioDeviceCallback(eVar2.d);
                if (Build.VERSION.SDK_INT >= 32 && (eVar = eVar2.f14719g) != null) {
                    eVar.e();
                    eVar2.f14719g = null;
                }
                context.unregisterReceiver(eVar2.e);
                d dVar = eVar2.f14718f;
                if (dVar != null) {
                    dVar.f14704a.unregisterContentObserver(dVar);
                }
                eVar2.f14722k = false;
            }
        }
    }

    public final void e(k kVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = kVar.f14761c;
        b2.f fVar = kVar.f14760b;
        f();
        e eVar = this.f14769i;
        if (eVar == null && (context = this.f14764a) != null) {
            e eVar2 = new e(context, new j5.b(this, 1), fVar, audioDeviceInfo);
            this.f14769i = eVar2;
            if (eVar2.f14722k) {
                b10 = eVar2.h;
                b10.getClass();
            } else {
                eVar2.f14722k = true;
                d dVar = eVar2.f14718f;
                if (dVar != null) {
                    dVar.f14704a.registerContentObserver(dVar.f14705b, false, dVar);
                }
                Context context2 = eVar2.f14715a;
                AudioManager e = c2.i.e(context2);
                c cVar = eVar2.d;
                Handler handler = eVar2.f14717c;
                e.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar2.f14719g == null) {
                    eVar2.f14719g = new z2.e(context2, new bc(eVar2, 26), Boolean.valueOf(e2.m0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar2.f14721j, eVar2.f14720i, eVar2.a());
                eVar2.h = b10;
            }
            this.h = b10;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar.f14720i)) {
                eVar.f14720i = audioDeviceInfo;
                Context context3 = eVar.f14715a;
                b2.f fVar2 = eVar.f14721j;
                List a2 = eVar.a();
                x1 x1Var = b.e;
                eVar.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
            }
            e eVar3 = this.f14769i;
            if (!Objects.equals(fVar, eVar3.f14721j)) {
                eVar3.f14721j = fVar;
                Context context4 = eVar3.f14715a;
                AudioDeviceInfo audioDeviceInfo2 = eVar3.f14720i;
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
        if (this.f14764a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f14770j;
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
            this.f14770j = myLooper;
            return;
        }
        throw new IllegalStateException(v6.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
