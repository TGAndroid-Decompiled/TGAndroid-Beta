package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class n0 implements Parcelable.Creator {
    public final int f228a;

    public n0(int i3) {
        this.f228a = i3;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f228a) {
            case 0:
                int z10 = g6.e.z(parcel);
                int i3 = 0;
                f fVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    char c2 = (char) readInt;
                    if (c2 != 2) {
                        if (c2 != 3) {
                            g6.e.y(parcel, readInt);
                        } else {
                            fVar = (f) g6.e.g(parcel, readInt, f.CREATOR);
                        }
                    } else {
                        i3 = g6.e.u(parcel, readInt);
                    }
                }
                g6.e.m(parcel, z10);
                return new m0(i3, fVar);
            case 1:
                int z11 = g6.e.z(parcel);
                String str = null;
                long j10 = 0;
                String str2 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                g6.e.y(parcel, readInt2);
                            } else {
                                j10 = g6.e.w(parcel, readInt2);
                            }
                        } else {
                            str2 = g6.e.h(parcel, readInt2);
                        }
                    } else {
                        str = g6.e.h(parcel, readInt2);
                    }
                }
                g6.e.m(parcel, z11);
                return new o0(j10, str, str2);
            case 2:
                int z12 = g6.e.z(parcel);
                int i10 = 0;
                String str3 = null;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            g6.e.y(parcel, readInt3);
                        } else {
                            str3 = g6.e.h(parcel, readInt3);
                        }
                    } else {
                        i10 = g6.e.u(parcel, readInt3);
                    }
                }
                g6.e.m(parcel, z12);
                return new p0(i10, str3);
            case 3:
                int z13 = g6.e.z(parcel);
                int i11 = 0;
                k kVar = null;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            g6.e.y(parcel, readInt4);
                        } else {
                            kVar = (k) g6.e.g(parcel, readInt4, k.CREATOR);
                        }
                    } else {
                        i11 = g6.e.u(parcel, readInt4);
                    }
                }
                g6.e.m(parcel, z13);
                return new q0(i11, kVar);
            case 4:
                int z14 = g6.e.z(parcel);
                int i12 = 0;
                while (parcel.dataPosition() < z14) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        g6.e.y(parcel, readInt5);
                    } else {
                        i12 = g6.e.u(parcel, readInt5);
                    }
                }
                g6.e.m(parcel, z14);
                return new r0(i12);
            case 5:
                int z15 = g6.e.z(parcel);
                int i13 = 0;
                byte[] bArr = null;
                int i14 = 0;
                while (parcel.dataPosition() < z15) {
                    int readInt6 = parcel.readInt();
                    char c13 = (char) readInt6;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                g6.e.y(parcel, readInt6);
                            } else {
                                bArr = g6.e.b(parcel, readInt6);
                            }
                        } else {
                            i14 = g6.e.u(parcel, readInt6);
                        }
                    } else {
                        i13 = g6.e.u(parcel, readInt6);
                    }
                }
                g6.e.m(parcel, z15);
                return new s0(i13, i14, bArr);
            case 6:
                int z16 = g6.e.z(parcel);
                int i15 = 0;
                int i16 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt7 = parcel.readInt();
                    char c14 = (char) readInt7;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            g6.e.y(parcel, readInt7);
                        } else {
                            i16 = g6.e.u(parcel, readInt7);
                        }
                    } else {
                        i15 = g6.e.u(parcel, readInt7);
                    }
                }
                g6.e.m(parcel, z16);
                return new t0(i15, i16);
            case 7:
                int z17 = g6.e.z(parcel);
                int i17 = 0;
                long j11 = 0;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < z17) {
                    int readInt8 = parcel.readInt();
                    char c15 = (char) readInt8;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            if (c15 != 4) {
                                g6.e.y(parcel, readInt8);
                            } else {
                                arrayList = g6.e.l(parcel, readInt8, o0.CREATOR);
                            }
                        } else {
                            j11 = g6.e.w(parcel, readInt8);
                        }
                    } else {
                        i17 = g6.e.u(parcel, readInt8);
                    }
                }
                g6.e.m(parcel, z17);
                return new u0(i17, j11, arrayList);
            case 8:
                int z18 = g6.e.z(parcel);
                byte b10 = 0;
                String str4 = null;
                byte b11 = 0;
                while (parcel.dataPosition() < z18) {
                    int readInt9 = parcel.readInt();
                    char c16 = (char) readInt9;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            if (c16 != 4) {
                                g6.e.y(parcel, readInt9);
                            } else {
                                str4 = g6.e.h(parcel, readInt9);
                            }
                        } else {
                            b11 = g6.e.p(parcel, readInt9);
                        }
                    } else {
                        b10 = g6.e.p(parcel, readInt9);
                    }
                }
                g6.e.m(parcel, z18);
                return new v0(b10, b11, str4);
            case 9:
                int z19 = g6.e.z(parcel);
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
                            i18 = g6.e.u(parcel, readInt10);
                            break;
                        case 3:
                            str5 = g6.e.h(parcel, readInt10);
                            break;
                        case 4:
                            str6 = g6.e.h(parcel, readInt10);
                            break;
                        case 5:
                            str7 = g6.e.h(parcel, readInt10);
                            break;
                        case 6:
                            str8 = g6.e.h(parcel, readInt10);
                            break;
                        case 7:
                            str9 = g6.e.h(parcel, readInt10);
                            break;
                        case '\b':
                            str10 = g6.e.h(parcel, readInt10);
                            break;
                        case '\t':
                            b12 = g6.e.p(parcel, readInt10);
                            break;
                        case '\n':
                            b13 = g6.e.p(parcel, readInt10);
                            break;
                        case 11:
                            b14 = g6.e.p(parcel, readInt10);
                            break;
                        case '\f':
                            b15 = g6.e.p(parcel, readInt10);
                            break;
                        case '\r':
                            str11 = g6.e.h(parcel, readInt10);
                            break;
                        default:
                            g6.e.y(parcel, readInt10);
                            break;
                    }
                }
                g6.e.m(parcel, z19);
                return new b1(i18, str5, str6, str7, str8, str9, str10, b12, b13, b14, b15, str11);
            case 10:
                int z20 = g6.e.z(parcel);
                String str12 = null;
                String str13 = null;
                a1 a1Var = null;
                String str14 = null;
                String str15 = null;
                Float f10 = null;
                e1 e1Var = null;
                while (parcel.dataPosition() < z20) {
                    int readInt11 = parcel.readInt();
                    switch ((char) readInt11) {
                        case 1:
                            str12 = g6.e.h(parcel, readInt11);
                            break;
                        case 2:
                            str13 = g6.e.h(parcel, readInt11);
                            break;
                        case 3:
                            a1Var = (a1) g6.e.g(parcel, readInt11, a1.CREATOR);
                            break;
                        case 4:
                            str14 = g6.e.h(parcel, readInt11);
                            break;
                        case 5:
                            str15 = g6.e.h(parcel, readInt11);
                            break;
                        case 6:
                            f10 = g6.e.s(parcel, readInt11);
                            break;
                        case 7:
                            e1Var = (e1) g6.e.g(parcel, readInt11, e1.CREATOR);
                            break;
                        default:
                            g6.e.y(parcel, readInt11);
                            break;
                    }
                }
                g6.e.m(parcel, z20);
                return new c1(str12, str13, a1Var, str14, str15, f10, e1Var);
            case 11:
                int z21 = g6.e.z(parcel);
                int i19 = 0;
                ArrayList arrayList2 = null;
                a1 a1Var2 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt12 = parcel.readInt();
                    char c17 = (char) readInt12;
                    if (c17 != 1) {
                        if (c17 != 2) {
                            if (c17 != 3) {
                                g6.e.y(parcel, readInt12);
                            } else {
                                a1Var2 = (a1) g6.e.g(parcel, readInt12, a1.CREATOR);
                            }
                        } else {
                            arrayList2 = g6.e.l(parcel, readInt12, c1.CREATOR);
                        }
                    } else {
                        i19 = g6.e.u(parcel, readInt12);
                    }
                }
                g6.e.m(parcel, z21);
                return new d1(i19, arrayList2, a1Var2);
            default:
                int z22 = g6.e.z(parcel);
                boolean z23 = false;
                ArrayList arrayList3 = null;
                while (parcel.dataPosition() < z22) {
                    int readInt13 = parcel.readInt();
                    char c18 = (char) readInt13;
                    if (c18 != 1) {
                        if (c18 != 2) {
                            g6.e.y(parcel, readInt13);
                        } else {
                            arrayList3 = g6.e.j(parcel, readInt13);
                        }
                    } else {
                        z23 = g6.e.n(parcel, readInt13);
                    }
                }
                g6.e.m(parcel, z22);
                return new e1(arrayList3, z23);
        }
    }

    @Override
    public final Object[] newArray(int i3) {
        switch (this.f228a) {
            case 0:
                return new m0[i3];
            case 1:
                return new o0[i3];
            case 2:
                return new p0[i3];
            case 3:
                return new q0[i3];
            case 4:
                return new r0[i3];
            case 5:
                return new s0[i3];
            case 6:
                return new t0[i3];
            case 7:
                return new u0[i3];
            case 8:
                return new v0[i3];
            case 9:
                return new b1[i3];
            case 10:
                return new c1[i3];
            case 11:
                return new d1[i3];
            default:
                return new e1[i3];
        }
    }
}
