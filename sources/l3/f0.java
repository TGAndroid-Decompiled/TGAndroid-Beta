package l3;

import android.media.AudioAttributes;
import android.media.AudioTrack;
public final class f0 {
    public final j3.t0 f14084a;
    public final int f14085b;
    public final int f14086c;
    public final int d;
    public final int f14087e;
    public final int f14088f;
    public final int f14089g;
    public final int h;
    public final j[] f14090i;

    public f0(j3.t0 t0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, j[] jVarArr) {
        this.f14084a = t0Var;
        this.f14085b = i10;
        this.f14086c = i11;
        this.d = i12;
        this.f14087e = i13;
        this.f14088f = i14;
        this.f14089g = i15;
        this.h = i16;
        this.f14090i = jVarArr;
    }

    public static AudioAttributes c(e eVar, boolean z10) {
        if (z10) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) eVar.a().f7981b;
    }

    public final AudioTrack a(boolean z10, e eVar, int i10) {
        boolean z11;
        boolean z12;
        int i11 = this.f14086c;
        try {
            AudioTrack b10 = b(z10, eVar, i10);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            if (i11 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            throw new q(state, this.f14087e, this.f14088f, this.h, this.f14084a, z12, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            if (i11 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            throw new q(0, this.f14087e, this.f14088f, this.h, this.f14084a, z11, e10);
        }
    }

    public final AudioTrack b(boolean z10, e eVar, int i10) {
        int i11 = f5.d0.f6579a;
        int i12 = this.f14089g;
        int i13 = this.f14088f;
        int i14 = this.f14087e;
        if (i11 >= 29) {
            boolean z11 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c(eVar, z10)).setAudioFormat(k0.f(i14, i13, i12)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i10);
            if (this.f14086c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        } else if (i11 >= 21) {
            return new AudioTrack(c(eVar, z10), k0.f(i14, i13, i12), this.h, 1, i10);
        } else {
            int y8 = f5.d0.y(eVar.f14079c);
            if (i10 == 0) {
                return new AudioTrack(y8, this.f14087e, this.f14088f, this.f14089g, this.h, 1);
            }
            return new AudioTrack(y8, this.f14087e, this.f14088f, this.f14089g, this.h, 1, i10);
        }
    }
}
