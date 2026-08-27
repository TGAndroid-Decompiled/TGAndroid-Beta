package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.q8;
import java.util.ArrayList;

public final class o0 implements Parcelable.Creator {

    public final int f12816a;

    public o0(int i10) {
        this.f12816a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12816a) {
            case 0:
                int iZ = q8.z(parcel);
                int iU = 0;
                f fVar = null;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 2) {
                        iU = q8.u(parcel, i10);
                    } else if (c10 != 3) {
                        q8.y(parcel, i10);
                    } else {
                        fVar = (f) q8.g(parcel, i10, f.CREATOR);
                    }
                }
                q8.m(parcel, iZ);
                return new n0(iU, fVar);
            case 1:
                int iZ2 = q8.z(parcel);
                String strH = null;
                long jW = 0;
                String strH2 = null;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 2) {
                        strH = q8.h(parcel, i11);
                    } else if (c11 == 3) {
                        strH2 = q8.h(parcel, i11);
                    } else if (c11 != 4) {
                        q8.y(parcel, i11);
                    } else {
                        jW = q8.w(parcel, i11);
                    }
                }
                q8.m(parcel, iZ2);
                return new p0(jW, strH, strH2);
            case 2:
                int iZ3 = q8.z(parcel);
                int iU2 = 0;
                String strH3 = null;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 2) {
                        iU2 = q8.u(parcel, i12);
                    } else if (c12 != 3) {
                        q8.y(parcel, i12);
                    } else {
                        strH3 = q8.h(parcel, i12);
                    }
                }
                q8.m(parcel, iZ3);
                return new q0(iU2, strH3);
            case 3:
                int iZ4 = q8.z(parcel);
                int iU3 = 0;
                m mVar = null;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    char c13 = (char) i13;
                    if (c13 == 2) {
                        iU3 = q8.u(parcel, i13);
                    } else if (c13 != 3) {
                        q8.y(parcel, i13);
                    } else {
                        mVar = (m) q8.g(parcel, i13, m.CREATOR);
                    }
                }
                q8.m(parcel, iZ4);
                return new r0(iU3, mVar);
            case 4:
                int iZ5 = q8.z(parcel);
                int iU4 = 0;
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 2) {
                        q8.y(parcel, i14);
                    } else {
                        iU4 = q8.u(parcel, i14);
                    }
                }
                q8.m(parcel, iZ5);
                return new s0(iU4);
            case 5:
                int iZ6 = q8.z(parcel);
                int iU5 = 0;
                byte[] bArrB = null;
                int iU6 = 0;
                while (parcel.dataPosition() < iZ6) {
                    int i15 = parcel.readInt();
                    char c14 = (char) i15;
                    if (c14 == 1) {
                        iU5 = q8.u(parcel, i15);
                    } else if (c14 == 2) {
                        iU6 = q8.u(parcel, i15);
                    } else if (c14 != 3) {
                        q8.y(parcel, i15);
                    } else {
                        bArrB = q8.b(parcel, i15);
                    }
                }
                q8.m(parcel, iZ6);
                return new t0(iU5, iU6, bArrB);
            case 6:
                int iZ7 = q8.z(parcel);
                int iU7 = 0;
                int iU8 = 0;
                while (parcel.dataPosition() < iZ7) {
                    int i16 = parcel.readInt();
                    char c15 = (char) i16;
                    if (c15 == 2) {
                        iU7 = q8.u(parcel, i16);
                    } else if (c15 != 3) {
                        q8.y(parcel, i16);
                    } else {
                        iU8 = q8.u(parcel, i16);
                    }
                }
                q8.m(parcel, iZ7);
                return new u0(iU7, iU8);
            case 7:
                int iZ8 = q8.z(parcel);
                int iU9 = 0;
                long jW2 = 0;
                ArrayList arrayListL = null;
                while (parcel.dataPosition() < iZ8) {
                    int i17 = parcel.readInt();
                    char c16 = (char) i17;
                    if (c16 == 2) {
                        iU9 = q8.u(parcel, i17);
                    } else if (c16 == 3) {
                        jW2 = q8.w(parcel, i17);
                    } else if (c16 != 4) {
                        q8.y(parcel, i17);
                    } else {
                        arrayListL = q8.l(parcel, i17, p0.CREATOR);
                    }
                }
                q8.m(parcel, iZ8);
                return new v0(iU9, jW2, arrayListL);
            case 8:
                int iZ9 = q8.z(parcel);
                byte bP = 0;
                String strH4 = null;
                byte bP2 = 0;
                while (parcel.dataPosition() < iZ9) {
                    int i18 = parcel.readInt();
                    char c17 = (char) i18;
                    if (c17 == 2) {
                        bP = q8.p(parcel, i18);
                    } else if (c17 == 3) {
                        bP2 = q8.p(parcel, i18);
                    } else if (c17 != 4) {
                        q8.y(parcel, i18);
                    } else {
                        strH4 = q8.h(parcel, i18);
                    }
                }
                q8.m(parcel, iZ9);
                return new w0(bP, bP2, strH4);
            case 9:
                int iZ10 = q8.z(parcel);
                String strH5 = null;
                String strH6 = null;
                String strH7 = null;
                String strH8 = null;
                String strH9 = null;
                String strH10 = null;
                String strH11 = null;
                int iU10 = 0;
                byte bP3 = 0;
                byte bP4 = 0;
                byte bP5 = 0;
                byte bP6 = 0;
                while (parcel.dataPosition() < iZ10) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            iU10 = q8.u(parcel, i19);
                            break;
                        case 3:
                            strH5 = q8.h(parcel, i19);
                            break;
                        case 4:
                            strH6 = q8.h(parcel, i19);
                            break;
                        case 5:
                            strH7 = q8.h(parcel, i19);
                            break;
                        case 6:
                            strH8 = q8.h(parcel, i19);
                            break;
                        case 7:
                            strH9 = q8.h(parcel, i19);
                            break;
                        case '\b':
                            strH10 = q8.h(parcel, i19);
                            break;
                        case '\t':
                            bP3 = q8.p(parcel, i19);
                            break;
                        case '\n':
                            bP4 = q8.p(parcel, i19);
                            break;
                        case 11:
                            bP5 = q8.p(parcel, i19);
                            break;
                        case '\f':
                            bP6 = q8.p(parcel, i19);
                            break;
                        case '\r':
                            strH11 = q8.h(parcel, i19);
                            break;
                        default:
                            q8.y(parcel, i19);
                            break;
                    }
                }
                q8.m(parcel, iZ10);
                return new c1(iU10, strH5, strH6, strH7, strH8, strH9, strH10, bP3, bP4, bP5, bP6, strH11);
            case 10:
                int iZ11 = q8.z(parcel);
                String strH12 = null;
                String strH13 = null;
                b1 b1Var = null;
                String strH14 = null;
                String strH15 = null;
                Float fS = null;
                f1 f1Var = null;
                while (parcel.dataPosition() < iZ11) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strH12 = q8.h(parcel, i20);
                            break;
                        case 2:
                            strH13 = q8.h(parcel, i20);
                            break;
                        case 3:
                            b1Var = (b1) q8.g(parcel, i20, b1.CREATOR);
                            break;
                        case 4:
                            strH14 = q8.h(parcel, i20);
                            break;
                        case 5:
                            strH15 = q8.h(parcel, i20);
                            break;
                        case 6:
                            fS = q8.s(parcel, i20);
                            break;
                        case 7:
                            f1Var = (f1) q8.g(parcel, i20, f1.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i20);
                            break;
                    }
                }
                q8.m(parcel, iZ11);
                return new d1(strH12, strH13, b1Var, strH14, strH15, fS, f1Var);
            case 11:
                int iZ12 = q8.z(parcel);
                int iU11 = 0;
                ArrayList arrayListL2 = null;
                b1 b1Var2 = null;
                while (parcel.dataPosition() < iZ12) {
                    int i21 = parcel.readInt();
                    char c18 = (char) i21;
                    if (c18 == 1) {
                        iU11 = q8.u(parcel, i21);
                    } else if (c18 == 2) {
                        arrayListL2 = q8.l(parcel, i21, d1.CREATOR);
                    } else if (c18 != 3) {
                        q8.y(parcel, i21);
                    } else {
                        b1Var2 = (b1) q8.g(parcel, i21, b1.CREATOR);
                    }
                }
                q8.m(parcel, iZ12);
                return new e1(iU11, arrayListL2, b1Var2);
            default:
                int iZ13 = q8.z(parcel);
                boolean zN = false;
                ArrayList arrayListJ = null;
                while (parcel.dataPosition() < iZ13) {
                    int i22 = parcel.readInt();
                    char c19 = (char) i22;
                    if (c19 == 1) {
                        zN = q8.n(parcel, i22);
                    } else if (c19 != 2) {
                        q8.y(parcel, i22);
                    } else {
                        arrayListJ = q8.j(parcel, i22);
                    }
                }
                q8.m(parcel, iZ13);
                return new f1(arrayListJ, zN);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f12816a) {
            case 0:
                return new n0[i10];
            case 1:
                return new p0[i10];
            case 2:
                return new q0[i10];
            case 3:
                return new r0[i10];
            case 4:
                return new s0[i10];
            case 5:
                return new t0[i10];
            case 6:
                return new u0[i10];
            case 7:
                return new v0[i10];
            case 8:
                return new w0[i10];
            case 9:
                return new c1[i10];
            case 10:
                return new d1[i10];
            case 11:
                return new e1[i10];
            default:
                return new f1[i10];
        }
    }
}
