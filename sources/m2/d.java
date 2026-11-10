package m2;

import android.media.AudioDescriptor;
import android.os.SystemClock;
import e2.u;
import h2.o;
import n2.f0;
import n2.l0;
import n2.m0;
import n2.n;
import n2.n0;
import n2.q0;
import n2.v;
public final class d implements o {
    public final int f19532a;

    public d(int i7) {
        this.f19532a = i7;
    }

    public static AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override
    public void invoke(Object obj) {
        long j3;
        v vVar;
        switch (this.f19532a) {
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
            case 20:
            case 21:
            case 22:
            default:
                v vVar2 = ((l0) obj).f20238a.f20290n;
                if (vVar2 != null) {
                    vVar2.H0();
                    return;
                }
                return;
            case 23:
                m0 m0Var = (m0) obj;
                q0 q0Var = m0Var.f20249b;
                if (m0Var.equals(q0Var.f20286j) && q0Var.f20290n != null) {
                    n0 n0Var = q0Var.f20292p;
                    int i7 = n0Var.f20260b;
                    if (i7 != -1) {
                        long j10 = ((n) n0Var.f20262e).f20254f / i7;
                        f0 f0Var = q0Var.f20296t;
                        f0Var.getClass();
                        j3 = h2.m0.Y(f0Var.f20167a.getSampleRate(), j10);
                    } else {
                        j3 = -9223372036854775807L;
                    }
                    q0Var.f20290n.O1(h2.m0.h0(j3), ((n) q0Var.f20292p.f20262e).f20254f, SystemClock.elapsedRealtime() - q0Var.W);
                    return;
                }
                return;
            case 24:
                m0 m0Var2 = (m0) obj;
                m0Var2.getClass();
                q0.f20276c0.getAndDecrement();
                v vVar3 = m0Var2.f20249b.f20290n;
                if (vVar3 != 0) {
                    int i10 = m0Var2.f20248a.f20250a;
                    vVar3.i(new Object());
                    return;
                }
                return;
            case 25:
                m0 m0Var3 = (m0) obj;
                q0 q0Var2 = m0Var3.f20249b;
                if (m0Var3.equals(q0Var2.f20286j) && (vVar = q0Var2.f20290n) != null && q0Var2.O) {
                    vVar.t1();
                    return;
                }
                return;
            case 26:
                m0 m0Var4 = (m0) obj;
                q0 q0Var3 = m0Var4.f20249b;
                if (m0Var4.equals(q0Var3.f20286j) && q0Var3.M) {
                    q0Var3.N = true;
                    return;
                }
                return;
        }
    }

    public d(a aVar, float f10) {
        this.f19532a = 18;
    }

    public d(a aVar, int i7) {
        this.f19532a = 16;
    }

    public d(a aVar, int i7, byte b10) {
        this.f19532a = i7;
    }

    public d(a aVar, long j3) {
        this.f19532a = 9;
    }

    public d(a aVar, u uVar, l2.e eVar) {
        this.f19532a = 0;
    }

    public d(a aVar, e2.l0 l0Var, int i7) {
        this.f19532a = 17;
    }

    public d(a aVar, Object obj, int i7) {
        this.f19532a = i7;
    }

    public d(a aVar, boolean z9, int i7) {
        this.f19532a = i7;
    }
}
