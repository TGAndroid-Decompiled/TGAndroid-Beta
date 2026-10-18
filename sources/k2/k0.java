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
public final class k0 implements p {
    public final Context f14723a;
    public final u0 f14724b;
    public final n0 f14725c;
    public final a6.i d;
    public final float e;
    public e2.r f14726f;
    public e2.g0 f14727g;
    public b h;
    public e f14728i;
    public Looper f14729j;
    public Context f14730k;

    public k0(j0 j0Var) {
        a6.i iVar;
        Context context = j0Var.f14717a;
        this.f14723a = context;
        n0 n0Var = j0Var.f14718b;
        n0Var.getClass();
        this.f14725c = n0Var;
        this.f14724b = j0Var.f14719c;
        this.h = j0Var.d;
        if (context == null) {
            iVar = null;
        } else {
            iVar = new a6.i(this, 28);
        }
        this.d = iVar;
        this.e = j0Var.e;
        this.f14727g = e2.g0.f8232a;
    }

    public final i0 a(o oVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i10 = oVar.h;
            int i11 = oVar.f14773i;
            if (i11 != -1 && (context2 = this.f14723a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f14730k;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f14730k = context2.createDeviceContext(i11);
                }
                context = this.f14730k;
                i10 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(oVar.f14769b).setChannelMask(oVar.f14770c).setEncoding(oVar.f14768a).build();
            b2.f fVar = oVar.f14772g;
            if (oVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = fVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(oVar.f14771f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(oVar.e);
            }
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new i0(build2, oVar, this.d, this.e, this.f14727g);
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
        b2.w wVar = jVar.f14712a;
        b2.f fVar = jVar.f14713b;
        g b10 = this.f14725c.b(fVar, wVar);
        k kVar = new k();
        String str = wVar.f4132s;
        int i10 = wVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, wVar) != null : i10 == 2) {
            i11 = 2;
        }
        kVar.f14720a = i11;
        kVar.f14721b = b10.f14685a;
        kVar.f14722c = b10.f14686b;
        kVar.d = b10.f14687c;
        return kVar.a();
    }

    public final k2.o c(k2.j r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.k0.c(k2.j):k2.o");
    }

    public final void d() {
        z2.d dVar;
        e2.r rVar = this.f14726f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f14728i;
        if (eVar != null) {
            Context context = eVar.f14674a;
            if (eVar.f14681k) {
                eVar.h = null;
                c2.i.e(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f14678g) != null) {
                    dVar.e();
                    eVar.f14678g = null;
                }
                context.unregisterReceiver(eVar.e);
                d dVar2 = eVar.f14677f;
                if (dVar2 != null) {
                    dVar2.f14668a.unregisterContentObserver(dVar2);
                }
                eVar.f14681k = false;
            }
        }
    }

    public final void e(j jVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = jVar.f14714c;
        b2.f fVar = jVar.f14713b;
        f();
        e eVar = this.f14728i;
        if (eVar == null && (context = this.f14723a) != null) {
            e eVar2 = new e(context, new j5.b(this, 1), fVar, audioDeviceInfo);
            this.f14728i = eVar2;
            if (eVar2.f14681k) {
                b10 = eVar2.h;
                b10.getClass();
            } else {
                eVar2.f14681k = true;
                d dVar = eVar2.f14677f;
                if (dVar != null) {
                    dVar.f14668a.registerContentObserver(dVar.f14669b, false, dVar);
                }
                Context context2 = eVar2.f14674a;
                AudioManager e = c2.i.e(context2);
                c cVar = eVar2.d;
                Handler handler = eVar2.f14676c;
                e.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar2.f14678g == null) {
                    eVar2.f14678g = new z2.d(context2, new bc(eVar2, 26), Boolean.valueOf(e2.m0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar2.f14680j, eVar2.f14679i, eVar2.a());
                eVar2.h = b10;
            }
            this.h = b10;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar.f14679i)) {
                eVar.f14679i = audioDeviceInfo;
                Context context3 = eVar.f14674a;
                b2.f fVar2 = eVar.f14680j;
                List a2 = eVar.a();
                x1 x1Var = b.e;
                eVar.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
            }
            e eVar3 = this.f14728i;
            if (!Objects.equals(fVar, eVar3.f14680j)) {
                eVar3.f14680j = fVar;
                Context context4 = eVar3.f14674a;
                AudioDeviceInfo audioDeviceInfo2 = eVar3.f14679i;
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
        if (this.f14723a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f14729j;
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
            this.f14729j = myLooper;
            return;
        }
        throw new IllegalStateException(v6.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
