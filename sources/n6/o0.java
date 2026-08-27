package n6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import h7.q8;
import java.util.ArrayList;

public final class o0 implements Parcelable.Creator {

    public final int f18387a;

    public o0(int i10) {
        this.f18387a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18387a) {
            case 0:
                int iZ = q8.z(parcel);
                boolean zN = false;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        q8.y(parcel, i10);
                    } else {
                        zN = q8.n(parcel, i10);
                    }
                }
                q8.m(parcel, iZ);
                return new n0(zN);
            case 1:
                int iZ2 = q8.z(parcel);
                boolean zN2 = false;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        q8.y(parcel, i11);
                    } else {
                        zN2 = q8.n(parcel, i11);
                    }
                }
                q8.m(parcel, iZ2);
                return new t(zN2);
            case 2:
                int iZ3 = q8.z(parcel);
                String strH = null;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        q8.y(parcel, i12);
                    } else {
                        strH = q8.h(parcel, i12);
                    }
                }
                q8.m(parcel, iZ3);
                return new p0(strH);
            case 3:
                int iZ4 = q8.z(parcel);
                int iU = 0;
                byte[] bArrB = null;
                byte[] bArrB2 = null;
                byte[] bArrB3 = null;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 1) {
                        bArrB = q8.b(parcel, i13);
                    } else if (c10 == 2) {
                        bArrB2 = q8.b(parcel, i13);
                    } else if (c10 == 3) {
                        bArrB3 = q8.b(parcel, i13);
                    } else if (c10 != 4) {
                        q8.y(parcel, i13);
                    } else {
                        iU = q8.u(parcel, i13);
                    }
                }
                q8.m(parcel, iZ4);
                return new q0(bArrB == null ? null : y6.s0.t(bArrB.length, bArrB), bArrB2 == null ? null : y6.s0.t(bArrB2.length, bArrB2), bArrB3 != null ? y6.s0.t(bArrB3.length, bArrB3) : null, iU);
            case 4:
                int iZ5 = q8.z(parcel);
                byte[][] bArrC = null;
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        q8.y(parcel, i14);
                    } else {
                        bArrC = q8.c(parcel, i14);
                    }
                }
                q8.m(parcel, iZ5);
                return new r0(bArrC);
            case 5:
                int iZ6 = q8.z(parcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArrB4 = null;
                ArrayList arrayListL = null;
                Double dValueOf = null;
                ArrayList arrayListL2 = null;
                m mVar = null;
                Integer numV = null;
                h0 h0Var = null;
                String strH2 = null;
                f fVar = null;
                String strH3 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iZ6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            yVar = (y) q8.g(parcel, i15, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) q8.g(parcel, i15, b0.CREATOR);
                            break;
                        case 4:
                            bArrB4 = q8.b(parcel, i15);
                            break;
                        case 5:
                            arrayListL = q8.l(parcel, i15, x.CREATOR);
                            break;
                        case 6:
                            int iX = q8.x(parcel, i15);
                            if (iX != 0) {
                                q8.A(parcel, iX, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        case 7:
                            arrayListL2 = q8.l(parcel, i15, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) q8.g(parcel, i15, m.CREATOR);
                            break;
                        case '\t':
                            numV = q8.v(parcel, i15);
                            break;
                        case '\n':
                            h0Var = (h0) q8.g(parcel, i15, h0.CREATOR);
                            break;
                        case 11:
                            strH2 = q8.h(parcel, i15);
                            break;
                        case '\f':
                            fVar = (f) q8.g(parcel, i15, f.CREATOR);
                            break;
                        case '\r':
                            strH3 = q8.h(parcel, i15);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) q8.g(parcel, i15, ResultReceiver.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i15);
                            break;
                    }
                }
                q8.m(parcel, iZ6);
                return new v(yVar, b0Var, bArrB4, arrayListL, dValueOf, arrayListL2, mVar, numV, h0Var, strH2, fVar, strH3, resultReceiver);
            case 6:
                int iZ7 = q8.z(parcel);
                String strH4 = null;
                String strH5 = null;
                byte[] bArrB5 = null;
                j jVar = null;
                i iVar = null;
                k kVar = null;
                g gVar = null;
                String strH6 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            strH4 = q8.h(parcel, i16);
                            break;
                        case 2:
                            strH5 = q8.h(parcel, i16);
                            break;
                        case 3:
                            bArrB5 = q8.b(parcel, i16);
                            break;
                        case 4:
                            jVar = (j) q8.g(parcel, i16, j.CREATOR);
                            break;
                        case 5:
                            iVar = (i) q8.g(parcel, i16, i.CREATOR);
                            break;
                        case 6:
                            kVar = (k) q8.g(parcel, i16, k.CREATOR);
                            break;
                        case 7:
                            gVar = (g) q8.g(parcel, i16, g.CREATOR);
                            break;
                        case '\b':
                            strH6 = q8.h(parcel, i16);
                            break;
                        case '\t':
                            q8.h(parcel, i16);
                            break;
                        default:
                            q8.y(parcel, i16);
                            break;
                    }
                }
                q8.m(parcel, iZ7);
                return new u(strH4, strH5, bArrB5, jVar, iVar, kVar, gVar, strH6);
            case 7:
                int iZ8 = q8.z(parcel);
                String strH7 = null;
                byte[] bArrB6 = null;
                ArrayList arrayListL3 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 2) {
                        strH7 = q8.h(parcel, i17);
                    } else if (c11 == 3) {
                        bArrB6 = q8.b(parcel, i17);
                    } else if (c11 != 4) {
                        q8.y(parcel, i17);
                    } else {
                        arrayListL3 = q8.l(parcel, i17, Transport.CREATOR);
                    }
                }
                q8.m(parcel, iZ8);
                return new w(strH7, bArrB6, arrayListL3);
            case 8:
                int iZ9 = q8.z(parcel);
                String strH8 = null;
                Integer numV2 = null;
                while (parcel.dataPosition() < iZ9) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 2) {
                        strH8 = q8.h(parcel, i18);
                    } else if (c12 != 3) {
                        q8.y(parcel, i18);
                    } else {
                        numV2 = q8.v(parcel, i18);
                    }
                }
                q8.m(parcel, iZ9);
                return new x(strH8, numV2.intValue());
            case 9:
                int iZ10 = q8.z(parcel);
                String strH9 = null;
                String strH10 = null;
                String strH11 = null;
                while (parcel.dataPosition() < iZ10) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 2) {
                        strH9 = q8.h(parcel, i19);
                    } else if (c13 == 3) {
                        strH10 = q8.h(parcel, i19);
                    } else if (c13 != 4) {
                        q8.y(parcel, i19);
                    } else {
                        strH11 = q8.h(parcel, i19);
                    }
                }
                q8.m(parcel, iZ10);
                return new y(strH9, strH10, strH11);
            case 10:
                try {
                    return a0.a(parcel.readString());
                } catch (z e9) {
                    throw new RuntimeException(e9);
                }
            case 11:
                int iZ11 = q8.z(parcel);
                byte[] bArrB7 = null;
                String strH12 = null;
                String strH13 = null;
                String strH14 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 2) {
                        bArrB7 = q8.b(parcel, i20);
                    } else if (c14 == 3) {
                        strH12 = q8.h(parcel, i20);
                    } else if (c14 == 4) {
                        strH13 = q8.h(parcel, i20);
                    } else if (c14 != 5) {
                        q8.y(parcel, i20);
                    } else {
                        strH14 = q8.h(parcel, i20);
                    }
                }
                q8.m(parcel, iZ11);
                return new b0(strH12, bArrB7, strH13, strH14);
            case 12:
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                try {
                    return e0.a(string);
                } catch (d0 e10) {
                    throw new RuntimeException(e10);
                }
            case 13:
                int iZ12 = q8.z(parcel);
                String strH15 = null;
                while (parcel.dataPosition() < iZ12) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        q8.y(parcel, i21);
                    } else {
                        strH15 = q8.h(parcel, i21);
                    }
                }
                q8.m(parcel, iZ12);
                return new s0(strH15);
            case 14:
                try {
                    return f0.a(parcel.readString());
                } catch (g0 e11) {
                    throw new RuntimeException(e11);
                }
            case 15:
                int iZ13 = q8.z(parcel);
                String strH16 = null;
                String strH17 = null;
                while (parcel.dataPosition() < iZ13) {
                    int i22 = parcel.readInt();
                    char c15 = (char) i22;
                    if (c15 == 2) {
                        strH16 = q8.h(parcel, i22);
                    } else if (c15 != 3) {
                        q8.y(parcel, i22);
                    } else {
                        strH17 = q8.h(parcel, i22);
                    }
                }
                q8.m(parcel, iZ13);
                return new h0(strH16, strH17);
            case 16:
                try {
                    return e.a(parcel.readString());
                } catch (d e12) {
                    throw new RuntimeException(e12);
                }
            case 17:
                int iZ14 = q8.z(parcel);
                boolean zN3 = false;
                while (parcel.dataPosition() < iZ14) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        q8.y(parcel, i23);
                    } else {
                        zN3 = q8.n(parcel, i23);
                    }
                }
                q8.m(parcel, iZ14);
                return new i0(zN3);
            case 18:
                try {
                    return j0.a(parcel.readString());
                } catch (t0 e13) {
                    throw new RuntimeException(e13);
                }
            case 19:
                int iZ15 = q8.z(parcel);
                ArrayList arrayListL4 = null;
                while (parcel.dataPosition() < iZ15) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        q8.y(parcel, i24);
                    } else {
                        arrayListL4 = q8.l(parcel, i24, l0.CREATOR);
                    }
                }
                q8.m(parcel, iZ15);
                return new k0(arrayListL4);
            case 20:
                int iZ16 = q8.z(parcel);
                int iU2 = 0;
                short s10 = 0;
                short s11 = 0;
                while (parcel.dataPosition() < iZ16) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        iU2 = q8.u(parcel, i25);
                    } else if (c16 == 2) {
                        q8.B(parcel, i25, 4);
                        s10 = (short) parcel.readInt();
                    } else if (c16 != 3) {
                        q8.y(parcel, i25);
                    } else {
                        q8.B(parcel, i25, 4);
                        s11 = (short) parcel.readInt();
                    }
                }
                q8.m(parcel, iZ16);
                return new l0(iU2, s10, s11);
            case 21:
                int iZ17 = q8.z(parcel);
                k0 k0Var = null;
                u0 u0Var = null;
                h hVar = null;
                v0 v0Var = null;
                String strH18 = null;
                while (parcel.dataPosition() < iZ17) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 1) {
                        k0Var = (k0) q8.g(parcel, i26, k0.CREATOR);
                    } else if (c17 == 2) {
                        u0Var = (u0) q8.g(parcel, i26, u0.CREATOR);
                    } else if (c17 == 3) {
                        hVar = (h) q8.g(parcel, i26, h.CREATOR);
                    } else if (c17 == 4) {
                        v0Var = (v0) q8.g(parcel, i26, v0.CREATOR);
                    } else if (c17 != 5) {
                        q8.y(parcel, i26);
                    } else {
                        strH18 = q8.h(parcel, i26);
                    }
                }
                q8.m(parcel, iZ17);
                return new g(k0Var, u0Var, hVar, v0Var, strH18);
            case 22:
                int iZ18 = q8.z(parcel);
                s sVar = null;
                y0 y0Var = null;
                i0 i0Var = null;
                a1 a1Var = null;
                m0 m0Var = null;
                n0 n0Var = null;
                z0 z0Var = null;
                p0 p0Var = null;
                t tVar = null;
                r0 r0Var = null;
                s0 s0Var = null;
                q0 q0Var = null;
                while (parcel.dataPosition() < iZ18) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 2:
                            sVar = (s) q8.g(parcel, i27, s.CREATOR);
                            break;
                        case 3:
                            y0Var = (y0) q8.g(parcel, i27, y0.CREATOR);
                            break;
                        case 4:
                            i0Var = (i0) q8.g(parcel, i27, i0.CREATOR);
                            break;
                        case 5:
                            a1Var = (a1) q8.g(parcel, i27, a1.CREATOR);
                            break;
                        case 6:
                            m0Var = (m0) q8.g(parcel, i27, m0.CREATOR);
                            break;
                        case 7:
                            n0Var = (n0) q8.g(parcel, i27, n0.CREATOR);
                            break;
                        case '\b':
                            z0Var = (z0) q8.g(parcel, i27, z0.CREATOR);
                            break;
                        case '\t':
                            p0Var = (p0) q8.g(parcel, i27, p0.CREATOR);
                            break;
                        case '\n':
                            tVar = (t) q8.g(parcel, i27, t.CREATOR);
                            break;
                        case 11:
                            r0Var = (r0) q8.g(parcel, i27, r0.CREATOR);
                            break;
                        case '\f':
                            s0Var = (s0) q8.g(parcel, i27, s0.CREATOR);
                            break;
                        case '\r':
                            q0Var = (q0) q8.g(parcel, i27, q0.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i27);
                            break;
                    }
                }
                q8.m(parcel, iZ18);
                return new f(sVar, y0Var, i0Var, a1Var, m0Var, n0Var, z0Var, p0Var, tVar, r0Var, s0Var, q0Var);
            case 23:
                int iZ19 = q8.z(parcel);
                boolean zN4 = false;
                while (parcel.dataPosition() < iZ19) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        q8.y(parcel, i28);
                    } else {
                        zN4 = q8.n(parcel, i28);
                    }
                }
                q8.m(parcel, iZ19);
                return new h(zN4);
            case 24:
                int iZ20 = q8.z(parcel);
                byte[] bArrB8 = null;
                byte[] bArrB9 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i29 = parcel.readInt();
                    char c18 = (char) i29;
                    if (c18 == 1) {
                        bArrB8 = q8.b(parcel, i29);
                    } else if (c18 != 2) {
                        q8.y(parcel, i29);
                    } else {
                        bArrB9 = q8.b(parcel, i29);
                    }
                }
                q8.m(parcel, iZ20);
                return new u0(bArrB8 == null ? null : y6.s0.t(bArrB8.length, bArrB8), bArrB9 != null ? y6.s0.t(bArrB9.length, bArrB9) : null);
            case 25:
                int iZ21 = q8.z(parcel);
                boolean zN5 = false;
                byte[] bArrB10 = null;
                while (parcel.dataPosition() < iZ21) {
                    int i30 = parcel.readInt();
                    char c19 = (char) i30;
                    if (c19 == 1) {
                        zN5 = q8.n(parcel, i30);
                    } else if (c19 != 2) {
                        q8.y(parcel, i30);
                    } else {
                        bArrB10 = q8.b(parcel, i30);
                    }
                }
                q8.m(parcel, iZ21);
                return new v0(zN5, bArrB10 != null ? y6.s0.t(bArrB10.length, bArrB10) : null);
            case 26:
                int iZ22 = q8.z(parcel);
                byte[] bArrB11 = null;
                byte[] bArrB12 = null;
                byte[] bArrB13 = null;
                byte[] bArrB14 = null;
                byte[] bArrB15 = null;
                while (parcel.dataPosition() < iZ22) {
                    int i31 = parcel.readInt();
                    char c20 = (char) i31;
                    if (c20 == 2) {
                        bArrB11 = q8.b(parcel, i31);
                    } else if (c20 == 3) {
                        bArrB12 = q8.b(parcel, i31);
                    } else if (c20 == 4) {
                        bArrB13 = q8.b(parcel, i31);
                    } else if (c20 == 5) {
                        bArrB14 = q8.b(parcel, i31);
                    } else if (c20 != 6) {
                        q8.y(parcel, i31);
                    } else {
                        bArrB15 = q8.b(parcel, i31);
                    }
                }
                q8.m(parcel, iZ22);
                return new i(bArrB11, bArrB12, bArrB13, bArrB14, bArrB15);
            case 27:
                int iZ23 = q8.z(parcel);
                byte[] bArrB16 = null;
                byte[] bArrB17 = null;
                byte[] bArrB18 = null;
                String[] strArrI = null;
                while (parcel.dataPosition() < iZ23) {
                    int i32 = parcel.readInt();
                    char c21 = (char) i32;
                    if (c21 == 2) {
                        bArrB16 = q8.b(parcel, i32);
                    } else if (c21 == 3) {
                        bArrB17 = q8.b(parcel, i32);
                    } else if (c21 == 4) {
                        bArrB18 = q8.b(parcel, i32);
                    } else if (c21 != 5) {
                        q8.y(parcel, i32);
                    } else {
                        strArrI = q8.i(parcel, i32);
                    }
                }
                q8.m(parcel, iZ23);
                return new j(bArrB16, bArrB17, bArrB18, strArrI);
            case 28:
                int iZ24 = q8.z(parcel);
                int iU3 = 0;
                String strH19 = null;
                int iU4 = 0;
                while (parcel.dataPosition() < iZ24) {
                    int i33 = parcel.readInt();
                    char c22 = (char) i33;
                    if (c22 == 2) {
                        iU3 = q8.u(parcel, i33);
                    } else if (c22 == 3) {
                        strH19 = q8.h(parcel, i33);
                    } else if (c22 != 4) {
                        q8.y(parcel, i33);
                    } else {
                        iU4 = q8.u(parcel, i33);
                    }
                }
                q8.m(parcel, iZ24);
                return new k(iU3, iU4, strH19);
            default:
                int iZ25 = q8.z(parcel);
                String strH20 = null;
                Boolean boolO = null;
                String strH21 = null;
                String strH22 = null;
                while (parcel.dataPosition() < iZ25) {
                    int i34 = parcel.readInt();
                    char c23 = (char) i34;
                    if (c23 == 2) {
                        strH20 = q8.h(parcel, i34);
                    } else if (c23 == 3) {
                        boolO = q8.o(parcel, i34);
                    } else if (c23 == 4) {
                        strH21 = q8.h(parcel, i34);
                    } else if (c23 != 5) {
                        q8.y(parcel, i34);
                    } else {
                        strH22 = q8.h(parcel, i34);
                    }
                }
                q8.m(parcel, iZ25);
                return new m(strH20, boolO, strH21, strH22);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f18387a) {
            case 0:
                return new n0[i10];
            case 1:
                return new t[i10];
            case 2:
                return new p0[i10];
            case 3:
                return new q0[i10];
            case 4:
                return new r0[i10];
            case 5:
                return new v[i10];
            case 6:
                return new u[i10];
            case 7:
                return new w[i10];
            case 8:
                return new x[i10];
            case 9:
                return new y[i10];
            case 10:
                return new a0[i10];
            case 11:
                return new b0[i10];
            case 12:
                return new e0[i10];
            case 13:
                return new s0[i10];
            case 14:
                return new f0[i10];
            case 15:
                return new h0[i10];
            case 16:
                return new e[i10];
            case 17:
                return new i0[i10];
            case 18:
                return new j0[i10];
            case 19:
                return new k0[i10];
            case 20:
                return new l0[i10];
            case 21:
                return new g[i10];
            case 22:
                return new f[i10];
            case 23:
                return new h[i10];
            case 24:
                return new u0[i10];
            case 25:
                return new v0[i10];
            case 26:
                return new i[i10];
            case 27:
                return new j[i10];
            case 28:
                return new k[i10];
            default:
                return new m[i10];
        }
    }
}
