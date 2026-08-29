package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class p0 implements Parcelable.Creator {
    public final int f13544a;

    public p0(int i10) {
        this.f13544a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f13544a) {
            case 0:
                int A = ce.b.A(parcel);
                int i10 = 0;
                f fVar = null;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 2) {
                        if (c3 != 3) {
                            ce.b.z(parcel, readInt);
                        } else {
                            fVar = (f) ce.b.h(parcel, readInt, f.CREATOR);
                        }
                    } else {
                        i10 = ce.b.v(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new o0(i10, fVar);
            case 1:
                int A2 = ce.b.A(parcel);
                String str = null;
                long j10 = 0;
                String str2 = null;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 != 2) {
                        if (c6 != 3) {
                            if (c6 != 4) {
                                ce.b.z(parcel, readInt2);
                            } else {
                                j10 = ce.b.x(parcel, readInt2);
                            }
                        } else {
                            str2 = ce.b.i(parcel, readInt2);
                        }
                    } else {
                        str = ce.b.i(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                return new q0(j10, str, str2);
            case 2:
                int A3 = ce.b.A(parcel);
                int i11 = 0;
                String str3 = null;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            ce.b.z(parcel, readInt3);
                        } else {
                            str3 = ce.b.i(parcel, readInt3);
                        }
                    } else {
                        i11 = ce.b.v(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                return new r0(i11, str3);
            case 3:
                int A4 = ce.b.A(parcel);
                int i12 = 0;
                m mVar = null;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            ce.b.z(parcel, readInt4);
                        } else {
                            mVar = (m) ce.b.h(parcel, readInt4, m.CREATOR);
                        }
                    } else {
                        i12 = ce.b.v(parcel, readInt4);
                    }
                }
                ce.b.n(parcel, A4);
                return new s0(i12, mVar);
            case 4:
                int A5 = ce.b.A(parcel);
                int i13 = 0;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        ce.b.z(parcel, readInt5);
                    } else {
                        i13 = ce.b.v(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A5);
                return new t0(i13);
            case 5:
                int A6 = ce.b.A(parcel);
                int i14 = 0;
                byte[] bArr = null;
                int i15 = 0;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                ce.b.z(parcel, readInt6);
                            } else {
                                bArr = ce.b.c(parcel, readInt6);
                            }
                        } else {
                            i15 = ce.b.v(parcel, readInt6);
                        }
                    } else {
                        i14 = ce.b.v(parcel, readInt6);
                    }
                }
                ce.b.n(parcel, A6);
                return new u0(i14, i15, bArr);
            case 6:
                int A7 = ce.b.A(parcel);
                int i16 = 0;
                int i17 = 0;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            ce.b.z(parcel, readInt7);
                        } else {
                            i17 = ce.b.v(parcel, readInt7);
                        }
                    } else {
                        i16 = ce.b.v(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A7);
                return new v0(i16, i17);
            case 7:
                int A8 = ce.b.A(parcel);
                int i18 = 0;
                long j11 = 0;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    char c14 = (char) readInt8;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            if (c14 != 4) {
                                ce.b.z(parcel, readInt8);
                            } else {
                                arrayList = ce.b.m(parcel, readInt8, q0.CREATOR);
                            }
                        } else {
                            j11 = ce.b.x(parcel, readInt8);
                        }
                    } else {
                        i18 = ce.b.v(parcel, readInt8);
                    }
                }
                ce.b.n(parcel, A8);
                return new w0(i18, j11, arrayList);
            case 8:
                int A9 = ce.b.A(parcel);
                byte b10 = 0;
                String str4 = null;
                byte b11 = 0;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    char c15 = (char) readInt9;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            if (c15 != 4) {
                                ce.b.z(parcel, readInt9);
                            } else {
                                str4 = ce.b.i(parcel, readInt9);
                            }
                        } else {
                            b11 = ce.b.q(parcel, readInt9);
                        }
                    } else {
                        b10 = ce.b.q(parcel, readInt9);
                    }
                }
                ce.b.n(parcel, A9);
                return new x0(b10, b11, str4);
            case 9:
                int A10 = ce.b.A(parcel);
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i19 = 0;
                byte b12 = 0;
                byte b13 = 0;
                byte b14 = 0;
                byte b15 = 0;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            i19 = ce.b.v(parcel, readInt10);
                            break;
                        case 3:
                            str5 = ce.b.i(parcel, readInt10);
                            break;
                        case 4:
                            str6 = ce.b.i(parcel, readInt10);
                            break;
                        case 5:
                            str7 = ce.b.i(parcel, readInt10);
                            break;
                        case 6:
                            str8 = ce.b.i(parcel, readInt10);
                            break;
                        case 7:
                            str9 = ce.b.i(parcel, readInt10);
                            break;
                        case '\b':
                            str10 = ce.b.i(parcel, readInt10);
                            break;
                        case '\t':
                            b12 = ce.b.q(parcel, readInt10);
                            break;
                        case '\n':
                            b13 = ce.b.q(parcel, readInt10);
                            break;
                        case 11:
                            b14 = ce.b.q(parcel, readInt10);
                            break;
                        case '\f':
                            b15 = ce.b.q(parcel, readInt10);
                            break;
                        case '\r':
                            str11 = ce.b.i(parcel, readInt10);
                            break;
                        default:
                            ce.b.z(parcel, readInt10);
                            break;
                    }
                }
                ce.b.n(parcel, A10);
                return new d1(i19, str5, str6, str7, str8, str9, str10, b12, b13, b14, b15, str11);
            case 10:
                int A11 = ce.b.A(parcel);
                String str12 = null;
                String str13 = null;
                c1 c1Var = null;
                String str14 = null;
                String str15 = null;
                Float f9 = null;
                g1 g1Var = null;
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str12 = ce.b.i(parcel, readInt11);
                            break;
                        case 2:
                            str13 = ce.b.i(parcel, readInt11);
                            break;
                        case 3:
                            c1Var = (c1) ce.b.h(parcel, readInt11, c1.CREATOR);
                            break;
                        case 4:
                            str14 = ce.b.i(parcel, readInt11);
                            break;
                        case 5:
                            str15 = ce.b.i(parcel, readInt11);
                            break;
                        case 6:
                            f9 = ce.b.t(parcel, readInt11);
                            break;
                        case 7:
                            g1Var = (g1) ce.b.h(parcel, readInt11, g1.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt11);
                            break;
                    }
                }
                ce.b.n(parcel, A11);
                return new e1(str12, str13, c1Var, str14, str15, f9, g1Var);
            case 11:
                int A12 = ce.b.A(parcel);
                int i20 = 0;
                ArrayList arrayList2 = null;
                c1 c1Var2 = null;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 != 1) {
                        if (c16 != 2) {
                            if (c16 != 3) {
                                ce.b.z(parcel, readInt12);
                            } else {
                                c1Var2 = (c1) ce.b.h(parcel, readInt12, c1.CREATOR);
                            }
                        } else {
                            arrayList2 = ce.b.m(parcel, readInt12, e1.CREATOR);
                        }
                    } else {
                        i20 = ce.b.v(parcel, readInt12);
                    }
                }
                ce.b.n(parcel, A12);
                return new f1(i20, arrayList2, c1Var2);
            default:
                int A13 = ce.b.A(parcel);
                boolean z10 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    char c17 = (char) readInt13;
                    if (c17 != 1) {
                        if (c17 != 2) {
                            ce.b.z(parcel, readInt13);
                        } else {
                            arrayList3 = ce.b.k(parcel, readInt13);
                        }
                    } else {
                        z10 = ce.b.o(parcel, readInt13);
                    }
                }
                ce.b.n(parcel, A13);
                return new g1(arrayList3, z10);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f13544a) {
            case 0:
                return new o0[i10];
            case 1:
                return new q0[i10];
            case 2:
                return new r0[i10];
            case 3:
                return new s0[i10];
            case 4:
                return new t0[i10];
            case 5:
                return new u0[i10];
            case 6:
                return new v0[i10];
            case 7:
                return new w0[i10];
            case 8:
                return new x0[i10];
            case 9:
                return new d1[i10];
            case 10:
                return new e1[i10];
            case 11:
                return new f1[i10];
            default:
                return new g1[i10];
        }
    }
}
