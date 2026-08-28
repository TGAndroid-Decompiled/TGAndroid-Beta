package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.o8;
import java.util.ArrayList;
public final class p0 implements Parcelable.Creator {
    public final int f11021a;

    public p0(int i9) {
        this.f11021a = i9;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11021a) {
            case 0:
                int z10 = o8.z(parcel);
                int i9 = 0;
                f fVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            o8.y(parcel, readInt);
                        } else {
                            fVar = (f) o8.g(parcel, readInt, f.CREATOR);
                        }
                    } else {
                        i9 = o8.u(parcel, readInt);
                    }
                }
                o8.m(parcel, z10);
                return new o0(i9, fVar);
            case 1:
                int z11 = o8.z(parcel);
                String str = null;
                long j10 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c11 = (char) readInt2;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                o8.y(parcel, readInt2);
                            } else {
                                j10 = o8.w(parcel, readInt2);
                            }
                        } else {
                            str2 = o8.h(parcel, readInt2);
                        }
                    } else {
                        str = o8.h(parcel, readInt2);
                    }
                }
                o8.m(parcel, z11);
                return new q0(j10, str, str2);
            case 2:
                int z12 = o8.z(parcel);
                int i10 = 0;
                String str3 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c12 = (char) readInt3;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            o8.y(parcel, readInt3);
                        } else {
                            str3 = o8.h(parcel, readInt3);
                        }
                    } else {
                        i10 = o8.u(parcel, readInt3);
                    }
                }
                o8.m(parcel, z12);
                return new r0(i10, str3);
            case 3:
                int z13 = o8.z(parcel);
                int i11 = 0;
                m mVar = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c13 = (char) readInt4;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            o8.y(parcel, readInt4);
                        } else {
                            mVar = (m) o8.g(parcel, readInt4, m.CREATOR);
                        }
                    } else {
                        i11 = o8.u(parcel, readInt4);
                    }
                }
                o8.m(parcel, z13);
                return new s0(i11, mVar);
            case 4:
                int z14 = o8.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        o8.y(parcel, readInt5);
                    } else {
                        i12 = o8.u(parcel, readInt5);
                    }
                }
                o8.m(parcel, z14);
                return new t0(i12);
            case 5:
                int z15 = o8.z(parcel);
                int i13 = 0;
                byte[] bArr = null;
                int i14 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    char c14 = (char) readInt6;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            if (c14 != 3) {
                                o8.y(parcel, readInt6);
                            } else {
                                bArr = o8.b(parcel, readInt6);
                            }
                        } else {
                            i14 = o8.u(parcel, readInt6);
                        }
                    } else {
                        i13 = o8.u(parcel, readInt6);
                    }
                }
                o8.m(parcel, z15);
                return new u0(i13, i14, bArr);
            case 6:
                int z16 = o8.z(parcel);
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c15 = (char) readInt7;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            o8.y(parcel, readInt7);
                        } else {
                            i16 = o8.u(parcel, readInt7);
                        }
                    } else {
                        i15 = o8.u(parcel, readInt7);
                    }
                }
                o8.m(parcel, z16);
                return new v0(i15, i16);
            case 7:
                int z17 = o8.z(parcel);
                int i17 = 0;
                long j11 = 0;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    char c16 = (char) readInt8;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            if (c16 != 4) {
                                o8.y(parcel, readInt8);
                            } else {
                                arrayList = o8.l(parcel, readInt8, q0.CREATOR);
                            }
                        } else {
                            j11 = o8.w(parcel, readInt8);
                        }
                    } else {
                        i17 = o8.u(parcel, readInt8);
                    }
                }
                o8.m(parcel, z17);
                return new w0(i17, j11, arrayList);
            case 8:
                int z18 = o8.z(parcel);
                byte b10 = 0;
                String str4 = null;
                byte b11 = 0;
                while (parcel.dataPosition() < z18) {
                    int readInt9 = parcel.readInt();
                    char c17 = (char) readInt9;
                    if (c17 != 2) {
                        if (c17 != 3) {
                            if (c17 != 4) {
                                o8.y(parcel, readInt9);
                            } else {
                                str4 = o8.h(parcel, readInt9);
                            }
                        } else {
                            b11 = o8.p(parcel, readInt9);
                        }
                    } else {
                        b10 = o8.p(parcel, readInt9);
                    }
                }
                o8.m(parcel, z18);
                return new x0(b10, b11, str4);
            case 9:
                int z19 = o8.z(parcel);
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i18 = 0;
                byte b12 = 0;
                byte b13 = 0;
                byte b14 = 0;
                byte b15 = 0;
                while (parcel.dataPosition() < z19) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            i18 = o8.u(parcel, readInt10);
                            break;
                        case 3:
                            str5 = o8.h(parcel, readInt10);
                            break;
                        case 4:
                            str6 = o8.h(parcel, readInt10);
                            break;
                        case 5:
                            str7 = o8.h(parcel, readInt10);
                            break;
                        case 6:
                            str8 = o8.h(parcel, readInt10);
                            break;
                        case 7:
                            str9 = o8.h(parcel, readInt10);
                            break;
                        case '\b':
                            str10 = o8.h(parcel, readInt10);
                            break;
                        case '\t':
                            b12 = o8.p(parcel, readInt10);
                            break;
                        case '\n':
                            b13 = o8.p(parcel, readInt10);
                            break;
                        case 11:
                            b14 = o8.p(parcel, readInt10);
                            break;
                        case '\f':
                            b15 = o8.p(parcel, readInt10);
                            break;
                        case '\r':
                            str11 = o8.h(parcel, readInt10);
                            break;
                        default:
                            o8.y(parcel, readInt10);
                            break;
                    }
                }
                o8.m(parcel, z19);
                return new d1(i18, str5, str6, str7, str8, str9, str10, b12, b13, b14, b15, str11);
            case 10:
                int z20 = o8.z(parcel);
                String str12 = null;
                String str13 = null;
                c1 c1Var = null;
                String str14 = null;
                String str15 = null;
                Float f10 = null;
                g1 g1Var = null;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str12 = o8.h(parcel, readInt11);
                            break;
                        case 2:
                            str13 = o8.h(parcel, readInt11);
                            break;
                        case 3:
                            c1Var = (c1) o8.g(parcel, readInt11, c1.CREATOR);
                            break;
                        case 4:
                            str14 = o8.h(parcel, readInt11);
                            break;
                        case 5:
                            str15 = o8.h(parcel, readInt11);
                            break;
                        case 6:
                            f10 = o8.s(parcel, readInt11);
                            break;
                        case 7:
                            g1Var = (g1) o8.g(parcel, readInt11, g1.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt11);
                            break;
                    }
                }
                o8.m(parcel, z20);
                return new e1(str12, str13, c1Var, str14, str15, f10, g1Var);
            case 11:
                int z21 = o8.z(parcel);
                int i19 = 0;
                ArrayList arrayList2 = null;
                c1 c1Var2 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt12 = parcel.readInt();
                    char c18 = (char) readInt12;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            if (c18 != 3) {
                                o8.y(parcel, readInt12);
                            } else {
                                c1Var2 = (c1) o8.g(parcel, readInt12, c1.CREATOR);
                            }
                        } else {
                            arrayList2 = o8.l(parcel, readInt12, e1.CREATOR);
                        }
                    } else {
                        i19 = o8.u(parcel, readInt12);
                    }
                }
                o8.m(parcel, z21);
                return new f1(i19, arrayList2, c1Var2);
            default:
                int z22 = o8.z(parcel);
                boolean z23 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt13 = parcel.readInt();
                    char c19 = (char) readInt13;
                    if (c19 != 1) {
                        if (c19 != 2) {
                            o8.y(parcel, readInt13);
                        } else {
                            arrayList3 = o8.j(parcel, readInt13);
                        }
                    } else {
                        z23 = o8.n(parcel, readInt13);
                    }
                }
                o8.m(parcel, z22);
                return new g1(arrayList3, z23);
        }
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f11021a) {
            case 0:
                return new o0[i9];
            case 1:
                return new q0[i9];
            case 2:
                return new r0[i9];
            case 3:
                return new s0[i9];
            case 4:
                return new t0[i9];
            case 5:
                return new u0[i9];
            case 6:
                return new v0[i9];
            case 7:
                return new w0[i9];
            case 8:
                return new x0[i9];
            case 9:
                return new d1[i9];
            case 10:
                return new e1[i9];
            case 11:
                return new f1[i9];
            default:
                return new g1[i9];
        }
    }
}
