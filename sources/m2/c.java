package m2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import h2.l0;
import h2.o;
import n2.g0;
import n2.n;
import n2.n0;
import n2.o0;
import n2.r0;
public final class c implements o {
    public final int f20120a;

    public c() {
        this.f20120a = 29;
    }

    public static AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public void invoke(Object obj) {
        long j3;
        switch (this.f20120a) {
            case 0:
                ((b) obj).getClass();
                return;
            case 1:
                ((b) obj).getClass();
                return;
            case 2:
                ((b) obj).getClass();
                return;
            case 3:
                ((b) obj).getClass();
                return;
            case 4:
                ((b) obj).getClass();
                return;
            case 5:
                ((b) obj).getClass();
                return;
            case 6:
                ((b) obj).getClass();
                return;
            case 7:
                ((b) obj).getClass();
                return;
            case 8:
                ((b) obj).getClass();
                return;
            case 9:
                ((b) obj).getClass();
                return;
            case 10:
                ((b) obj).getClass();
                return;
            case 11:
                ((b) obj).getClass();
                return;
            case 12:
                ((b) obj).getClass();
                return;
            case 13:
                ((b) obj).getClass();
                return;
            case 14:
                ((b) obj).getClass();
                return;
            case 15:
                ((b) obj).getClass();
                return;
            case 16:
                ((b) obj).getClass();
                return;
            case 17:
                ((b) obj).getClass();
                return;
            case 18:
                ((b) obj).getClass();
                return;
            case 19:
                ((b) obj).getClass();
                return;
            case 20:
                ((b) obj).getClass();
                return;
            case 21:
                ((b) obj).getClass();
                return;
            case 22:
                ((b) obj).getClass();
                return;
            case 23:
                ((b) obj).getClass();
                return;
            case 24:
                ((b) obj).getClass();
                return;
            default:
                n0 n0Var = (n0) obj;
                r0 r0Var = n0Var.f20828b;
                if (n0Var.equals(r0Var.f20859j) && r0Var.f20863n != null) {
                    o0 o0Var = r0Var.f20865p;
                    int i7 = o0Var.f20830b;
                    if (i7 != -1) {
                        long j10 = ((n) o0Var.f20832e).f20822f / i7;
                        g0 g0Var = r0Var.f20869t;
                        g0Var.getClass();
                        j3 = l0.Y(g0Var.f20739a.getSampleRate(), j10);
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    r0Var.f20863n.w0(l0.h0(j3), ((n) r0Var.f20865p.f20832e).f20822f, SystemClock.elapsedRealtime() - r0Var.W);
                    return;
                }
                return;
        }
    }

    public c(a aVar, float f10) {
        this.f20120a = 24;
    }

    public c(a aVar, int i7) {
        this.f20120a = i7;
    }

    public c(a aVar, int i7, int i10) {
        this.f20120a = i10;
    }

    public c(a aVar, long j3) {
        this.f20120a = 15;
    }

    public c(a aVar, e2.l0 l0Var, int i7) {
        this.f20120a = 23;
    }

    public c(a aVar, Object obj, int i7) {
        this.f20120a = i7;
    }

    public c(a aVar, Object obj, Object obj2, int i7) {
        this.f20120a = i7;
    }

    public c(a aVar, boolean z10, int i7) {
        this.f20120a = i7;
    }
}
