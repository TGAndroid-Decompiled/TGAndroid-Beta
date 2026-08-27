package h3;

import android.os.Bundle;
import hh.i5;
import org.telegram.ui.zf1;

public final class q2 implements f, org.telegram.ui.ActionBar.a2, d5.k, d5.l {

    public final int f8088a;

    public q2(int i10) {
        this.f8088a = i10;
    }

    @Override
    public g a(Bundle bundle) {
        switch (this.f8088a) {
            case 0:
                Bundle bundle2 = bundle.getBundle(r2.G);
                f1 f1Var = bundle2 != null ? (f1) f1.f7828x.a(bundle2) : f1.h;
                long j10 = bundle.getLong(r2.H, -9223372036854775807L);
                long j11 = bundle.getLong(r2.I, -9223372036854775807L);
                long j12 = bundle.getLong(r2.J, -9223372036854775807L);
                boolean z10 = bundle.getBoolean(r2.K, false);
                boolean z11 = bundle.getBoolean(r2.L, false);
                Bundle bundle3 = bundle.getBundle(r2.M);
                b1 b1Var = bundle3 != null ? (b1) b1.f7781w.a(bundle3) : null;
                boolean z12 = bundle.getBoolean(r2.N, false);
                long j13 = bundle.getLong(r2.O, 0L);
                long j14 = bundle.getLong(r2.P, -9223372036854775807L);
                int i10 = bundle.getInt(r2.Q, 0);
                int i11 = bundle.getInt(r2.R, 0);
                long j15 = bundle.getLong(r2.S, 0L);
                r2 r2Var = new r2();
                r2Var.b(r2.E, f1Var, null, j10, j11, j12, z10, z11, b1Var, j13, j14, i10, i11, j15);
                r2Var.f8120w = z12;
                return r2Var;
            default:
                ia.l lVar = j4.i1.f12582n;
                Bundle bundle4 = bundle.getBundle(t2.f8197f);
                bundle4.getClass();
                j4.i1 i1Var = (j4.i1) lVar.a(bundle4);
                int[] intArray = bundle.getIntArray(t2.h);
                int i12 = i1Var.f12583a;
                int[] iArr = new int[i12];
                if (intArray == null) {
                    intArray = iArr;
                }
                boolean[] booleanArray = bundle.getBooleanArray(t2.f8198n);
                boolean[] zArr = new boolean[i12];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new t2(i1Var, bundle.getBoolean(t2.f8199r, false), intArray, booleanArray);
        }
    }

    @Override
    public void e(Object obj, d5.g gVar) {
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f8088a) {
            case 2:
                i5.d2(new zf1(6, null));
                break;
            default:
                int i11 = i5.f9450m1;
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        i3.b bVar = (i3.b) obj;
        switch (this.f8088a) {
            case 8:
                bVar.getClass();
                break;
            case 9:
                bVar.getClass();
                break;
            case 10:
                bVar.getClass();
                break;
            case 11:
                bVar.getClass();
                break;
            case 12:
                bVar.getClass();
                break;
            case 13:
                bVar.getClass();
                break;
            case 14:
                bVar.getClass();
                break;
            case 15:
                bVar.getClass();
                break;
            case 16:
                bVar.getClass();
                break;
            case 17:
                bVar.getClass();
                break;
            case 18:
                bVar.getClass();
                break;
            case 19:
                bVar.getClass();
                break;
            case 20:
                bVar.getClass();
                break;
            case 21:
                bVar.getClass();
                break;
            case 22:
                bVar.getClass();
                break;
            case 23:
                bVar.getClass();
                break;
            case 24:
                bVar.getClass();
                break;
            case 25:
                bVar.getClass();
                break;
            case 26:
            default:
                bVar.getClass();
                break;
            case 27:
                bVar.getClass();
                break;
            case 28:
                bVar.getClass();
                break;
        }
    }

    public q2(i5 i5Var) {
        this.f8088a = 2;
    }

    public q2(i3.a aVar, int i10, int i11) {
        this.f8088a = 18;
    }

    public q2(i3.a aVar, int i10, int i11, byte b10) {
        this.f8088a = i11;
    }

    public q2(i3.a aVar, f1 f1Var, int i10) {
        this.f8088a = 19;
    }

    public q2(i3.a aVar, Object obj, int i10) {
        this.f8088a = i10;
    }

    public q2(i3.a aVar, Object obj, Object obj2, int i10) {
        this.f8088a = i10;
    }

    public q2(i3.a aVar, boolean z10) {
        this.f8088a = 10;
    }

    public q2(i3.a aVar, boolean z10, int i10, int i11) {
        this.f8088a = i11;
    }
}
