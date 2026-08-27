package j3;

import android.media.AudioAttributes;
import android.media.AudioTrack;

public final class f0 {

    public final h3.t0 f12328a;

    public final int f12329b;

    public final int f12330c;
    public final int d;

    public final int f12331e;

    public final int f12332f;

    public final int f12333g;
    public final int h;

    public final j[] f12334i;

    public f0(h3.t0 t0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, j[] jVarArr) {
        this.f12328a = t0Var;
        this.f12329b = i10;
        this.f12330c = i11;
        this.d = i12;
        this.f12331e = i13;
        this.f12332f = i14;
        this.f12333g = i15;
        this.h = i16;
        this.f12334i = jVarArr;
    }

    public static AudioAttributes c(e eVar, boolean z10) {
        return z10 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) eVar.a().f181b;
    }

    public final AudioTrack a(boolean z10, e eVar, int i10) {
        int i11 = this.f12330c;
        try {
            AudioTrack audioTrackB = b(z10, eVar, i10);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new q(state, this.f12331e, this.f12332f, this.h, this.f12328a, i11 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e9) {
            throw new q(0, this.f12331e, this.f12332f, this.h, this.f12328a, i11 == 1, e9);
        }
    }

    public final AudioTrack b(boolean z10, e eVar, int i10) {
        int i11 = d5.g0.f4795a;
        int i12 = this.f12333g;
        int i13 = this.f12332f;
        int i14 = this.f12331e;
        if (i11 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(eVar, z10)).setAudioFormat(j0.f(i14, i13, i12)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i10).setOffloadedPlayback(this.f12330c == 1).build();
        }
        if (i11 >= 21) {
            return new AudioTrack(c(eVar, z10), j0.f(i14, i13, i12), this.h, 1, i10);
        }
        int iY = d5.g0.y(eVar.f12323c);
        if (i10 == 0) {
            return new AudioTrack(iY, this.f12331e, this.f12332f, this.f12333g, this.h, 1);
        }
        return new AudioTrack(iY, this.f12331e, this.f12332f, this.f12333g, this.h, 1, i10);
    }
}
