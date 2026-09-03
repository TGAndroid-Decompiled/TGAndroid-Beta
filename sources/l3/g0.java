package l3;

import android.media.AudioAttributes;
import android.media.AudioTrack;
public final class g0 {
    public final j3.n0 f11252a;
    public final int f11253b;
    public final int f11254c;
    public final int d;
    public final int e;
    public final int f11255f;
    public final int f11256g;
    public final int h;
    public final k f11257i;
    public final boolean f11258j;

    public g0(j3.n0 n0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, k kVar, boolean z4) {
        this.f11252a = n0Var;
        this.f11253b = i10;
        this.f11254c = i11;
        this.d = i12;
        this.e = i13;
        this.f11255f = i14;
        this.f11256g = i15;
        this.h = i16;
        this.f11257i = kVar;
        this.f11258j = z4;
    }

    public static AudioAttributes c(d dVar, boolean z4) {
        if (z4) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) dVar.a().f9336b;
    }

    public final AudioTrack a(boolean z4, d dVar, int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.f11254c;
        try {
            AudioTrack b10 = b(z4, dVar, i10);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            if (i11 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            throw new s(state, this.e, this.f11255f, this.h, this.f11252a, z11, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            throw new s(0, this.e, this.f11255f, this.h, this.f11252a, z10, e);
        }
    }

    public final AudioTrack b(boolean z4, d dVar, int i10) {
        int i11;
        int i12 = h5.d0.f6924a;
        boolean z10 = false;
        int i13 = this.f11256g;
        int i14 = this.f11255f;
        int i15 = this.e;
        if (i12 >= 29) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c(dVar, z4)).setAudioFormat(k0.g(i15, i14, i13)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i10);
            if (this.f11254c == 1) {
                z10 = true;
            }
            return sessionId.setOffloadedPlayback(z10).build();
        } else if (i12 >= 21) {
            return new AudioTrack(c(dVar, z4), k0.g(i15, i14, i13), this.h, 1, i10);
        } else {
            int i16 = dVar.f11245c;
            if (i16 != 13) {
                switch (i16) {
                    case 2:
                        i11 = 0;
                        break;
                    case 3:
                        i11 = 8;
                        break;
                    case 4:
                        i11 = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        i11 = 5;
                        break;
                    case 6:
                        i11 = 2;
                        break;
                    default:
                        i11 = 3;
                        break;
                }
            } else {
                i11 = 1;
            }
            if (i10 == 0) {
                return new AudioTrack(i11, this.e, this.f11255f, this.f11256g, this.h, 1);
            }
            return new AudioTrack(i11, this.e, this.f11255f, this.f11256g, this.h, 1, i10);
        }
    }
}
