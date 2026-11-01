package j2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import b2.p0;
import b2.x;
import com.google.android.gms.tasks.OnFailureListener;
import e2.l0;
import e2.o;
import jg.v2;
import k2.j0;
import k2.s0;
import k2.w0;
import k2.z;
public final class e implements o, OnFailureListener {
    public final int f9347a;

    public e(int i10) {
        this.f9347a = i10;
    }

    public static AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public void invoke(Object obj) {
        long j10;
        z zVar;
        switch (this.f9347a) {
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
            case 23:
            case 24:
            case 25:
            default:
                s0 s0Var = (s0) obj;
                w0 w0Var = s0Var.f10763b;
                if (s0Var.equals(w0Var.f10793j) && w0Var.M) {
                    w0Var.N = true;
                    return;
                }
                return;
            case 26:
                s0 s0Var2 = (s0) obj;
                w0 w0Var2 = s0Var2.f10763b;
                if (s0Var2.equals(w0Var2.f10793j) && w0Var2.f10797n != null) {
                    ji.a aVar = w0Var2.f10799p;
                    int i10 = aVar.f10423b;
                    if (i10 != -1) {
                        long j11 = ((k2.o) aVar.e).f10721f / i10;
                        j0 j0Var = w0Var2.f10803t;
                        j0Var.getClass();
                        j10 = l0.Y(j0Var.f10675a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    w0Var2.f10797n.i0(l0.h0(j10), ((k2.o) w0Var2.f10799p.e).f10721f, SystemClock.elapsedRealtime() - w0Var2.W);
                    return;
                }
                return;
            case 27:
                s0 s0Var3 = (s0) obj;
                s0Var3.getClass();
                w0.f10784c0.getAndDecrement();
                z zVar2 = s0Var3.f10763b.f10797n;
                if (zVar2 != 0) {
                    int i11 = s0Var3.f10762a.f10718a;
                    zVar2.e0(new Object());
                    return;
                }
                return;
            case 28:
                s0 s0Var4 = (s0) obj;
                w0 w0Var3 = s0Var4.f10763b;
                if (s0Var4.equals(w0Var3.f10793j) && (zVar = w0Var3.f10797n) != null && w0Var3.O) {
                    zVar.f0();
                    return;
                }
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = v2.f10308r0;
    }

    public e(a aVar, float f7) {
        this.f9347a = 21;
    }

    public e(a aVar, int i10) {
        this.f9347a = i10;
    }

    public e(a aVar, int i10, int i11) {
        this.f9347a = i11;
    }

    public e(a aVar, long j10) {
        this.f9347a = 12;
    }

    public e(a aVar, x xVar, i2.e eVar) {
        this.f9347a = 3;
    }

    public e(a aVar, p0 p0Var, int i10) {
        this.f9347a = 20;
    }

    public e(a aVar, Object obj, int i10) {
        this.f9347a = i10;
    }

    public e(a aVar, boolean z10, int i10) {
        this.f9347a = i10;
    }
}
