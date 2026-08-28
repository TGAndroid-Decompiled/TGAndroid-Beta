package j3;

import android.media.AudioAttributes;
import android.media.AudioTrack;
public final class e0 {
    public final h3.t0 f13230a;
    public final int f13231b;
    public final int f13232c;
    public final int d;
    public final int f13233e;
    public final int f13234f;
    public final int f13235g;
    public final int h;
    public final j[] f13236i;

    public e0(h3.t0 t0Var, int i9, int i10, int i11, int i12, int i13, int i14, int i15, j[] jVarArr) {
        this.f13230a = t0Var;
        this.f13231b = i9;
        this.f13232c = i10;
        this.d = i11;
        this.f13233e = i12;
        this.f13234f = i13;
        this.f13235g = i14;
        this.h = i15;
        this.f13236i = jVarArr;
    }

    public static AudioAttributes c(e eVar, boolean z10) {
        if (z10) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) eVar.a().f281b;
    }

    public final AudioTrack a(boolean z10, e eVar, int i9) {
        boolean z11;
        boolean z12;
        int i10 = this.f13232c;
        try {
            AudioTrack b10 = b(z10, eVar, i9);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            if (i10 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            throw new p(state, this.f13233e, this.f13234f, this.h, this.f13230a, z12, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            if (i10 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            throw new p(0, this.f13233e, this.f13234f, this.h, this.f13230a, z11, e10);
        }
    }

    public final AudioTrack b(boolean z10, e eVar, int i9) {
        int i10 = d5.f0.f4349a;
        int i11 = this.f13235g;
        int i12 = this.f13234f;
        int i13 = this.f13233e;
        if (i10 >= 29) {
            boolean z11 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c(eVar, z10)).setAudioFormat(i0.f(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i9);
            if (this.f13232c != 1) {
                z11 = false;
            }
            return sessionId.setOffloadedPlayback(z11).build();
        } else if (i10 >= 21) {
            return new AudioTrack(c(eVar, z10), i0.f(i13, i12, i11), this.h, 1, i9);
        } else {
            int y10 = d5.f0.y(eVar.f13227c);
            if (i9 == 0) {
                return new AudioTrack(y10, this.f13233e, this.f13234f, this.f13235g, this.h, 1);
            }
            return new AudioTrack(y10, this.f13233e, this.f13234f, this.f13235g, this.h, 1, i9);
        }
    }
}
