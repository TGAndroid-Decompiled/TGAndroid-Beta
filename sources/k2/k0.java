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
    public final Context f14716a;
    public final u0 f14717b;
    public final n0 f14718c;
    public final a6.i d;
    public final float e;
    public e2.r f14719f;
    public e2.g0 f14720g;
    public b h;
    public e f14721i;
    public Looper f14722j;
    public Context f14723k;

    public k0(j0 j0Var) {
        a6.i iVar;
        Context context = j0Var.f14710a;
        this.f14716a = context;
        n0 n0Var = j0Var.f14711b;
        n0Var.getClass();
        this.f14718c = n0Var;
        this.f14717b = j0Var.f14712c;
        this.h = j0Var.d;
        if (context == null) {
            iVar = null;
        } else {
            iVar = new a6.i(this, 28);
        }
        this.d = iVar;
        this.e = j0Var.e;
        this.f14720g = e2.g0.f8231a;
    }

    public final i0 a(o oVar) {
        Context context;
        AudioAttributes b10;
        Context context2;
        try {
            int i10 = oVar.h;
            int i11 = oVar.f14766i;
            if (i11 != -1 && (context2 = this.f14716a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.f14723k;
                if (context3 == null || context3.getDeviceId() != i11) {
                    this.f14723k = context2.createDeviceContext(i11);
                }
                context = this.f14723k;
                i10 = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(oVar.f14762b).setChannelMask(oVar.f14763c).setEncoding(oVar.f14761a).build();
            b2.f fVar = oVar.f14765g;
            if (oVar.d) {
                b10 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                b10 = fVar.b();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(b10).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(oVar.f14764f).setSessionId(i10);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29) {
                sessionId.setOffloadedPlayback(oVar.e);
            }
            if (i12 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new i0(build2, oVar, this.d, this.e, this.f14720g);
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
        b2.w wVar = jVar.f14705a;
        b2.f fVar = jVar.f14706b;
        g b10 = this.f14718c.b(fVar, wVar);
        k kVar = new k();
        String str = wVar.f4131s;
        int i10 = wVar.M;
        int i11 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(fVar, wVar) != null : i10 == 2) {
            i11 = 2;
        }
        kVar.f14713a = i11;
        kVar.f14714b = b10.f14678a;
        kVar.f14715c = b10.f14679b;
        kVar.d = b10.f14680c;
        return kVar.a();
    }

    public final k2.o c(k2.j r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.k0.c(k2.j):k2.o");
    }

    public final void d() {
        z2.d dVar;
        e2.r rVar = this.f14719f;
        if (rVar != null) {
            rVar.d();
        }
        e eVar = this.f14721i;
        if (eVar != null) {
            Context context = eVar.f14667a;
            if (eVar.f14674k) {
                eVar.h = null;
                c2.i.e(context).unregisterAudioDeviceCallback(eVar.d);
                if (Build.VERSION.SDK_INT >= 32 && (dVar = eVar.f14671g) != null) {
                    dVar.e();
                    eVar.f14671g = null;
                }
                context.unregisterReceiver(eVar.e);
                d dVar2 = eVar.f14670f;
                if (dVar2 != null) {
                    dVar2.f14661a.unregisterContentObserver(dVar2);
                }
                eVar.f14674k = false;
            }
        }
    }

    public final void e(j jVar) {
        Context context;
        b b10;
        AudioDeviceInfo audioDeviceInfo = jVar.f14707c;
        b2.f fVar = jVar.f14706b;
        f();
        e eVar = this.f14721i;
        if (eVar == null && (context = this.f14716a) != null) {
            e eVar2 = new e(context, new j5.b(this, 1), fVar, audioDeviceInfo);
            this.f14721i = eVar2;
            if (eVar2.f14674k) {
                b10 = eVar2.h;
                b10.getClass();
            } else {
                eVar2.f14674k = true;
                d dVar = eVar2.f14670f;
                if (dVar != null) {
                    dVar.f14661a.registerContentObserver(dVar.f14662b, false, dVar);
                }
                Context context2 = eVar2.f14667a;
                AudioManager e = c2.i.e(context2);
                c cVar = eVar2.d;
                Handler handler = eVar2.f14669c;
                e.registerAudioDeviceCallback(cVar, handler);
                if (Build.VERSION.SDK_INT >= 32 && eVar2.f14671g == null) {
                    eVar2.f14671g = new z2.d(context2, new bc(eVar2, 26), Boolean.valueOf(e2.m0.P(context2)));
                }
                b10 = b.b(context2, context2.registerReceiver(eVar2.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), eVar2.f14673j, eVar2.f14672i, eVar2.a());
                eVar2.h = b10;
            }
            this.h = b10;
        } else if (eVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals(eVar.f14672i)) {
                eVar.f14672i = audioDeviceInfo;
                Context context3 = eVar.f14667a;
                b2.f fVar2 = eVar.f14673j;
                List a2 = eVar.a();
                x1 x1Var = b.e;
                eVar.b(b.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
            }
            e eVar3 = this.f14721i;
            if (!Objects.equals(fVar, eVar3.f14673j)) {
                eVar3.f14673j = fVar;
                Context context4 = eVar3.f14667a;
                AudioDeviceInfo audioDeviceInfo2 = eVar3.f14672i;
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
        if (this.f14716a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f14722j;
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
            this.f14722j = myLooper;
            return;
        }
        throw new IllegalStateException(v6.a("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
    }
}
