package g4;

import d5.f0;
import d5.y;
import d5.z;
import h7.p8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c extends p8 {

    public final z f6357a = new z();

    public final y f6358b = new y();

    public f0 f6359c;

    @Override
    public final z3.c b(z3.e eVar, ByteBuffer byteBuffer) {
        int i10;
        z3.b fVar;
        int i11;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        int iW;
        int iR;
        int iR2;
        long jS;
        boolean z13;
        long j12;
        long j13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i12;
        int i13;
        int iR3;
        char c10;
        long j14;
        boolean z18;
        f0 f0Var = this.f6359c;
        if (f0Var == null || eVar.f50191n != f0Var.d()) {
            f0 f0Var2 = new f0(eVar.d);
            this.f6359c = f0Var2;
            f0Var2.a(eVar.d - eVar.f50191n);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        z zVar = this.f6357a;
        zVar.A(iLimit, bArrArray);
        y yVar = this.f6358b;
        yVar.n(iLimit, bArrArray);
        yVar.s(39);
        long jI = (((long) yVar.i(1)) << 32) | ((long) yVar.i(32));
        yVar.s(20);
        int i14 = yVar.i(12);
        int i15 = yVar.i(8);
        zVar.D(14);
        if (i15 == 0) {
            i10 = 0;
            fVar = new f();
        } else if (i15 != 255) {
            long jS2 = -9223372036854775807L;
            if (i15 == 4) {
                int iR4 = zVar.r();
                ArrayList arrayList = new ArrayList(iR4);
                int i16 = 0;
                while (i16 < iR4) {
                    long jS3 = zVar.s();
                    boolean z19 = (zVar.r() & 128) != 0;
                    ArrayList arrayList2 = new ArrayList();
                    if (z19) {
                        i11 = iR4;
                        j10 = -9223372036854775807L;
                        j11 = -9223372036854775807L;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        iW = 0;
                        iR = 0;
                        iR2 = 0;
                    } else {
                        int iR5 = zVar.r();
                        boolean z20 = (iR5 & 128) != 0;
                        boolean z21 = (iR5 & 64) != 0;
                        boolean z22 = (iR5 & 32) != 0;
                        long jS4 = z21 ? zVar.s() : -9223372036854775807L;
                        if (!z21) {
                            int iR6 = zVar.r();
                            ArrayList arrayList3 = new ArrayList(iR6);
                            int i17 = 0;
                            while (i17 < iR6) {
                                arrayList3.add(new g(zVar.r(), zVar.s()));
                                i17++;
                                iR4 = iR4;
                            }
                            arrayList2 = arrayList3;
                        }
                        i11 = iR4;
                        if (z22) {
                            long jR = zVar.r();
                            z13 = (jR & 128) != 0;
                            jS = ((((jR & 1) << 32) | zVar.s()) * 1000) / 90;
                        } else {
                            jS = -9223372036854775807L;
                            z13 = false;
                        }
                        j11 = jS;
                        z12 = z13;
                        iW = zVar.w();
                        z10 = z20;
                        z11 = z21;
                        j10 = jS4;
                        iR = zVar.r();
                        iR2 = zVar.r();
                    }
                    arrayList.add(new h(jS3, z19, z10, z11, arrayList2, j10, z12, j11, iW, iR, iR2));
                    i16++;
                    iR4 = i11;
                }
                fVar = new i(arrayList);
            } else if (i15 == 5) {
                f0 f0Var3 = this.f6359c;
                long jS5 = zVar.s();
                boolean z23 = (zVar.r() & 128) != 0;
                List list = Collections.EMPTY_LIST;
                if (z23) {
                    j12 = -9223372036854775807L;
                    j13 = -9223372036854775807L;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                    z17 = false;
                    i12 = 0;
                    i13 = 0;
                    iR3 = 0;
                } else {
                    int iR7 = zVar.r();
                    boolean z24 = (iR7 & 128) != 0;
                    boolean z25 = (iR7 & 64) != 0;
                    boolean z26 = (iR7 & 32) != 0;
                    boolean z27 = (iR7 & 16) != 0;
                    long jA = (!z25 || z27) ? -9223372036854775807L : j.a(jI, zVar);
                    if (z25) {
                        c10 = ' ';
                        j14 = 90;
                    } else {
                        int iR8 = zVar.r();
                        c10 = ' ';
                        ArrayList arrayList4 = new ArrayList(iR8);
                        j14 = 90;
                        for (int i18 = 0; i18 < iR8; i18++) {
                            int iR9 = zVar.r();
                            long jA2 = !z27 ? j.a(jI, zVar) : -9223372036854775807L;
                            arrayList4.add(new d(iR9, jA2, f0Var3.b(jA2)));
                        }
                        list = arrayList4;
                    }
                    if (z26) {
                        long jR2 = zVar.r();
                        z18 = (jR2 & 128) != 0;
                        jS2 = ((((jR2 & 1) << c10) | zVar.s()) * 1000) / j14;
                    } else {
                        z18 = false;
                    }
                    int iW2 = zVar.w();
                    int iR10 = zVar.r();
                    z17 = z18;
                    iR3 = zVar.r();
                    z16 = z27;
                    i12 = iW2;
                    i13 = iR10;
                    j13 = jS2;
                    j12 = jA;
                    z14 = z24;
                    z15 = z25;
                }
                fVar = new e(jS5, z23, z14, z15, z16, j12, f0Var3.b(j12), list, z17, j13, i12, i13, iR3);
            } else if (i15 != 6) {
                fVar = null;
            } else {
                f0 f0Var4 = this.f6359c;
                long jA3 = j.a(jI, zVar);
                fVar = new j(jA3, f0Var4.b(jA3));
            }
            i10 = 0;
        } else {
            long jS6 = zVar.s();
            int i19 = i14 - 4;
            byte[] bArr = new byte[i19];
            i10 = 0;
            zVar.c(0, i19, bArr);
            fVar = new a(jS6, jI, bArr);
        }
        if (fVar == null) {
            return new z3.c(new z3.b[i10]);
        }
        z3.b[] bVarArr = new z3.b[1];
        bVarArr[i10] = fVar;
        return new z3.c(bVarArr);
    }
}
