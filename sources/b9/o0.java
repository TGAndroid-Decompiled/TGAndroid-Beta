package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.ac;
import java.util.ArrayList;
public final class o0 implements Parcelable.Creator {
    public final int f3058a;

    public o0(int i7) {
        this.f3058a = i7;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3058a) {
            case 0:
                int z10 = ac.z(parcel);
                int i7 = 0;
                f fVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            ac.y(parcel, readInt);
                        } else {
                            fVar = (f) ac.g(parcel, readInt, f.CREATOR);
                        }
                    } else {
                        i7 = ac.u(parcel, readInt);
                    }
                }
                ac.m(parcel, z10);
                return new n0(i7, fVar);
            case 1:
                int z11 = ac.z(parcel);
                String str = null;
                long j3 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                ac.y(parcel, readInt2);
                            } else {
                                j3 = ac.w(parcel, readInt2);
                            }
                        } else {
                            str2 = ac.h(parcel, readInt2);
                        }
                    } else {
                        str = ac.h(parcel, readInt2);
                    }
                }
                ac.m(parcel, z11);
                return new p0(j3, str, str2);
            case 2:
                int z12 = ac.z(parcel);
                int i10 = 0;
                String str3 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            ac.y(parcel, readInt3);
                        } else {
                            str3 = ac.h(parcel, readInt3);
                        }
                    } else {
                        i10 = ac.u(parcel, readInt3);
                    }
                }
                ac.m(parcel, z12);
                return new q0(i10, str3);
            case 3:
                int z13 = ac.z(parcel);
                int i11 = 0;
                k kVar = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            ac.y(parcel, readInt4);
                        } else {
                            kVar = (k) ac.g(parcel, readInt4, k.CREATOR);
                        }
                    } else {
                        i11 = ac.u(parcel, readInt4);
                    }
                }
                ac.m(parcel, z13);
                return new r0(i11, kVar);
            case 4:
                int z14 = ac.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        ac.y(parcel, readInt5);
                    } else {
                        i12 = ac.u(parcel, readInt5);
                    }
                }
                ac.m(parcel, z14);
                return new s0(i12);
            case 5:
                int z15 = ac.z(parcel);
                int i13 = 0;
                byte[] bArr = null;
                int i14 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            if (c14 != 3) {
                                ac.y(parcel, readInt6);
                            } else {
                                bArr = ac.b(parcel, readInt6);
                            }
                        } else {
                            i14 = ac.u(parcel, readInt6);
                        }
                    } else {
                        i13 = ac.u(parcel, readInt6);
                    }
                }
                ac.m(parcel, z15);
                return new t0(i13, i14, bArr);
            case 6:
                int z16 = ac.z(parcel);
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            ac.y(parcel, readInt7);
                        } else {
                            i16 = ac.u(parcel, readInt7);
                        }
                    } else {
                        i15 = ac.u(parcel, readInt7);
                    }
                }
                ac.m(parcel, z16);
                return new u0(i15, i16);
            case 7:
                int z17 = ac.z(parcel);
                int i17 = 0;
                long j10 = 0;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            if (c16 != 4) {
                                ac.y(parcel, readInt8);
                            } else {
                                arrayList = ac.l(parcel, readInt8, p0.CREATOR);
                            }
                        } else {
                            j10 = ac.w(parcel, readInt8);
                        }
                    } else {
                        i17 = ac.u(parcel, readInt8);
                    }
                }
                ac.m(parcel, z17);
                return new v0(i17, j10, arrayList);
            case 8:
                int z18 = ac.z(parcel);
                byte b10 = 0;
                String str4 = null;
                byte b11 = 0;
                while (parcel.dataPosition() < z18) {
                    int readInt9 = parcel.readInt();
                    char c17 = (char) readInt9;
                    if (c17 != 2) {
                        if (c17 != 3) {
                            if (c17 != 4) {
                                ac.y(parcel, readInt9);
                            } else {
                                str4 = ac.h(parcel, readInt9);
                            }
                        } else {
                            b11 = ac.p(parcel, readInt9);
                        }
                    } else {
                        b10 = ac.p(parcel, readInt9);
                    }
                }
                ac.m(parcel, z18);
                return new w0(b10, b11, str4);
            case 9:
                int z19 = ac.z(parcel);
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
                while (parcel.dataPosition() < z19) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            i18 = ac.u(parcel, readInt10);
                            break;
                        case 3:
                            str5 = ac.h(parcel, readInt10);
                            break;
                        case 4:
                            str6 = ac.h(parcel, readInt10);
                            break;
                        case 5:
                            str7 = ac.h(parcel, readInt10);
                            break;
                        case 6:
                            str8 = ac.h(parcel, readInt10);
                            break;
                        case 7:
                            str9 = ac.h(parcel, readInt10);
                            break;
                        case '\b':
                            str10 = ac.h(parcel, readInt10);
                            break;
                        case '\t':
                            b12 = ac.p(parcel, readInt10);
                            break;
                        case '\n':
                            b13 = ac.p(parcel, readInt10);
                            break;
                        case 11:
                            b14 = ac.p(parcel, readInt10);
                            break;
                        case '\f':
                            b15 = ac.p(parcel, readInt10);
                            break;
                        case '\r':
                            str11 = ac.h(parcel, readInt10);
                            break;
                        default:
                            ac.y(parcel, readInt10);
                            break;
                    }
                }
                ac.m(parcel, z19);
                return new c1(i18, str5, str6, str7, str8, str9, str10, b12, b13, b14, b15, str11);
            case 10:
                int z20 = ac.z(parcel);
                String str12 = null;
                String str13 = null;
                b1 b1Var = null;
                String str14 = null;
                String str15 = null;
                Float f10 = null;
                f1 f1Var = null;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str12 = ac.h(parcel, readInt11);
                            break;
                        case 2:
                            str13 = ac.h(parcel, readInt11);
                            break;
                        case 3:
                            b1Var = (b1) ac.g(parcel, readInt11, b1.CREATOR);
                            break;
                        case 4:
                            str14 = ac.h(parcel, readInt11);
                            break;
                        case 5:
                            str15 = ac.h(parcel, readInt11);
                            break;
                        case 6:
                            f10 = ac.s(parcel, readInt11);
                            break;
                        case 7:
                            f1Var = (f1) ac.g(parcel, readInt11, f1.CREATOR);
                            break;
                        default:
                            ac.y(parcel, readInt11);
                            break;
                    }
                }
                ac.m(parcel, z20);
                return new d1(str12, str13, b1Var, str14, str15, f10, f1Var);
            case 11:
                int z21 = ac.z(parcel);
                int i19 = 0;
                ArrayList arrayList2 = null;
                b1 b1Var2 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            if (c18 != 3) {
                                ac.y(parcel, readInt12);
                            } else {
                                b1Var2 = (b1) ac.g(parcel, readInt12, b1.CREATOR);
                            }
                        } else {
                            arrayList2 = ac.l(parcel, readInt12, d1.CREATOR);
                        }
                    } else {
                        i19 = ac.u(parcel, readInt12);
                    }
                }
                ac.m(parcel, z21);
                return new e1(i19, arrayList2, b1Var2);
            default:
                int z22 = ac.z(parcel);
                boolean z23 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 != 1) {
                        if (c19 != 2) {
                            ac.y(parcel, readInt13);
                        } else {
                            arrayList3 = ac.j(parcel, readInt13);
                        }
                    } else {
                        z23 = ac.n(parcel, readInt13);
                    }
                }
                ac.m(parcel, z22);
                return new f1(arrayList3, z23);
        }
    }

    @Override
    public final Object[] newArray(int i7) {
        switch (this.f3058a) {
            case 0:
                return new n0[i7];
            case 1:
                return new p0[i7];
            case 2:
                return new q0[i7];
            case 3:
                return new r0[i7];
            case 4:
                return new s0[i7];
            case 5:
                return new t0[i7];
            case 6:
                return new u0[i7];
            case 7:
                return new v0[i7];
            case 8:
                return new w0[i7];
            case 9:
                return new c1[i7];
            case 10:
                return new d1[i7];
            case 11:
                return new e1[i7];
            default:
                return new f1[i7];
        }
    }
}
