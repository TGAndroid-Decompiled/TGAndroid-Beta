package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
public final class n0 implements Parcelable.Creator {
    public final int f3081a;

    public n0(int i7) {
        this.f3081a = i7;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3081a) {
            case 0:
                int z9 = wb.z(parcel);
                int i7 = 0;
                f fVar = null;
                while (parcel.dataPosition() < z9) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            wb.y(parcel, readInt);
                        } else {
                            fVar = (f) wb.g(parcel, readInt, f.CREATOR);
                        }
                    } else {
                        i7 = wb.u(parcel, readInt);
                    }
                }
                wb.m(parcel, z9);
                return new m0(i7, fVar);
            case 1:
                int z10 = wb.z(parcel);
                String str = null;
                long j3 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                wb.y(parcel, readInt2);
                            } else {
                                j3 = wb.w(parcel, readInt2);
                            }
                        } else {
                            str2 = wb.h(parcel, readInt2);
                        }
                    } else {
                        str = wb.h(parcel, readInt2);
                    }
                }
                wb.m(parcel, z10);
                return new o0(j3, str, str2);
            case 2:
                int z11 = wb.z(parcel);
                int i10 = 0;
                String str3 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            wb.y(parcel, readInt3);
                        } else {
                            str3 = wb.h(parcel, readInt3);
                        }
                    } else {
                        i10 = wb.u(parcel, readInt3);
                    }
                }
                wb.m(parcel, z11);
                return new p0(i10, str3);
            case 3:
                int z12 = wb.z(parcel);
                int i11 = 0;
                k kVar = null;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            wb.y(parcel, readInt4);
                        } else {
                            kVar = (k) wb.g(parcel, readInt4, k.CREATOR);
                        }
                    } else {
                        i11 = wb.u(parcel, readInt4);
                    }
                }
                wb.m(parcel, z12);
                return new q0(i11, kVar);
            case 4:
                int z13 = wb.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        wb.y(parcel, readInt5);
                    } else {
                        i12 = wb.u(parcel, readInt5);
                    }
                }
                wb.m(parcel, z13);
                return new r0(i12);
            case 5:
                int z14 = wb.z(parcel);
                int i13 = 0;
                byte[] bArr = null;
                int i14 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            if (c14 != 3) {
                                wb.y(parcel, readInt6);
                            } else {
                                bArr = wb.b(parcel, readInt6);
                            }
                        } else {
                            i14 = wb.u(parcel, readInt6);
                        }
                    } else {
                        i13 = wb.u(parcel, readInt6);
                    }
                }
                wb.m(parcel, z14);
                return new s0(i13, i14, bArr);
            case 6:
                int z15 = wb.z(parcel);
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            wb.y(parcel, readInt7);
                        } else {
                            i16 = wb.u(parcel, readInt7);
                        }
                    } else {
                        i15 = wb.u(parcel, readInt7);
                    }
                }
                wb.m(parcel, z15);
                return new t0(i15, i16);
            case 7:
                int z16 = wb.z(parcel);
                int i17 = 0;
                long j10 = 0;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z16) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            if (c16 != 4) {
                                wb.y(parcel, readInt8);
                            } else {
                                arrayList = wb.l(parcel, readInt8, o0.CREATOR);
                            }
                        } else {
                            j10 = wb.w(parcel, readInt8);
                        }
                    } else {
                        i17 = wb.u(parcel, readInt8);
                    }
                }
                wb.m(parcel, z16);
                return new u0(i17, j10, arrayList);
            case 8:
                int z17 = wb.z(parcel);
                byte b10 = 0;
                String str4 = null;
                byte b11 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt9 = parcel.readInt();
                    char c17 = (char) readInt9;
                    if (c17 != 2) {
                        if (c17 != 3) {
                            if (c17 != 4) {
                                wb.y(parcel, readInt9);
                            } else {
                                str4 = wb.h(parcel, readInt9);
                            }
                        } else {
                            b11 = wb.p(parcel, readInt9);
                        }
                    } else {
                        b10 = wb.p(parcel, readInt9);
                    }
                }
                wb.m(parcel, z17);
                return new v0(b10, b11, str4);
            case 9:
                int z18 = wb.z(parcel);
                int i18 = 0;
                byte b12 = 0;
                byte b13 = 0;
                byte b14 = 0;
                byte b15 = 0;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            i18 = wb.u(parcel, readInt10);
                            break;
                        case 3:
                            str5 = wb.h(parcel, readInt10);
                            break;
                        case 4:
                            str6 = wb.h(parcel, readInt10);
                            break;
                        case 5:
                            str7 = wb.h(parcel, readInt10);
                            break;
                        case 6:
                            str8 = wb.h(parcel, readInt10);
                            break;
                        case 7:
                            str9 = wb.h(parcel, readInt10);
                            break;
                        case '\b':
                            str10 = wb.h(parcel, readInt10);
                            break;
                        case '\t':
                            b12 = wb.p(parcel, readInt10);
                            break;
                        case '\n':
                            b13 = wb.p(parcel, readInt10);
                            break;
                        case 11:
                            b14 = wb.p(parcel, readInt10);
                            break;
                        case '\f':
                            b15 = wb.p(parcel, readInt10);
                            break;
                        case '\r':
                            str11 = wb.h(parcel, readInt10);
                            break;
                        default:
                            wb.y(parcel, readInt10);
                            break;
                    }
                }
                wb.m(parcel, z18);
                return new b1(i18, str5, str6, str7, str8, str9, str10, b12, b13, b14, b15, str11);
            case 10:
                int z19 = wb.z(parcel);
                String str12 = null;
                String str13 = null;
                a1 a1Var = null;
                String str14 = null;
                String str15 = null;
                Float f10 = null;
                e1 e1Var = null;
                while (parcel.dataPosition() < z19) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str12 = wb.h(parcel, readInt11);
                            break;
                        case 2:
                            str13 = wb.h(parcel, readInt11);
                            break;
                        case 3:
                            a1Var = (a1) wb.g(parcel, readInt11, a1.CREATOR);
                            break;
                        case 4:
                            str14 = wb.h(parcel, readInt11);
                            break;
                        case 5:
                            str15 = wb.h(parcel, readInt11);
                            break;
                        case 6:
                            f10 = wb.s(parcel, readInt11);
                            break;
                        case 7:
                            e1Var = (e1) wb.g(parcel, readInt11, e1.CREATOR);
                            break;
                        default:
                            wb.y(parcel, readInt11);
                            break;
                    }
                }
                wb.m(parcel, z19);
                return new c1(str12, str13, a1Var, str14, str15, f10, e1Var);
            case 11:
                int z20 = wb.z(parcel);
                int i19 = 0;
                ArrayList arrayList2 = null;
                a1 a1Var2 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            if (c18 != 3) {
                                wb.y(parcel, readInt12);
                            } else {
                                a1Var2 = (a1) wb.g(parcel, readInt12, a1.CREATOR);
                            }
                        } else {
                            arrayList2 = wb.l(parcel, readInt12, c1.CREATOR);
                        }
                    } else {
                        i19 = wb.u(parcel, readInt12);
                    }
                }
                wb.m(parcel, z20);
                return new d1(i19, arrayList2, a1Var2);
            default:
                int z21 = wb.z(parcel);
                boolean z22 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 != 1) {
                        if (c19 != 2) {
                            wb.y(parcel, readInt13);
                        } else {
                            arrayList3 = wb.j(parcel, readInt13);
                        }
                    } else {
                        z22 = wb.n(parcel, readInt13);
                    }
                }
                wb.m(parcel, z21);
                return new e1(arrayList3, z22);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f3081a) {
            case 0:
                return new m0[i7];
            case 1:
                return new o0[i7];
            case 2:
                return new p0[i7];
            case 3:
                return new q0[i7];
            case 4:
                return new r0[i7];
            case 5:
                return new s0[i7];
            case 6:
                return new t0[i7];
            case 7:
                return new u0[i7];
            case 8:
                return new v0[i7];
            case 9:
                return new b1[i7];
            case 10:
                return new c1[i7];
            case 11:
                return new d1[i7];
            default:
                return new e1[i7];
        }
    }
}
