package f8;

import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import j7.f5;
import j8.r;
import java.util.ArrayList;
import s8.v;
public final class o implements Parcelable.Creator {
    public final int f6221a;

    public o(int i10) {
        this.f6221a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6221a) {
            case 0:
                int z4 = f5.z(parcel);
                int i10 = 0;
                String str = null;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 2) {
                        if (c3 != 3) {
                            f5.y(parcel, readInt);
                        } else {
                            str = f5.h(parcel, readInt);
                        }
                    } else {
                        i10 = f5.u(parcel, readInt);
                    }
                }
                f5.m(parcel, z4);
                ?? obj = new Object();
                obj.f6200a = i10;
                obj.f6201b = str;
                return obj;
            case 1:
                int z10 = f5.z(parcel);
                String str2 = null;
                String str3 = null;
                int i11 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                f5.y(parcel, readInt2);
                            } else {
                                i11 = f5.u(parcel, readInt2);
                            }
                        } else {
                            str3 = f5.h(parcel, readInt2);
                        }
                    } else {
                        str2 = f5.h(parcel, readInt2);
                    }
                }
                f5.m(parcel, z10);
                ?? obj2 = new Object();
                obj2.f6206a = str2;
                obj2.f6207b = str3;
                obj2.f6208c = i11;
                return obj2;
            case 2:
                int z11 = f5.z(parcel);
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < z11) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            f5.y(parcel, readInt3);
                        } else {
                            str5 = f5.h(parcel, readInt3);
                        }
                    } else {
                        str4 = f5.h(parcel, readInt3);
                    }
                }
                f5.m(parcel, z11);
                ?? obj3 = new Object();
                obj3.f6204a = str4;
                obj3.f6205b = str5;
                return obj3;
            case 3:
                return new g4.a(parcel);
            case 4:
                return new h4.a(parcel);
            case 5:
                return new h4.b(parcel);
            case 6:
                return new i4.b(parcel);
            case 7:
                return new i4.c(parcel);
            case 8:
                int z12 = f5.z(parcel);
                PointF[] pointFArr = null;
                int i12 = 0;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    char c12 = (char) readInt4;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            f5.y(parcel, readInt4);
                        } else {
                            i12 = f5.u(parcel, readInt4);
                        }
                    } else {
                        pointFArr = (PointF[]) f5.k(parcel, readInt4, PointF.CREATOR);
                    }
                }
                f5.m(parcel, z12);
                return new i8.a(pointFArr, i12);
            case 9:
                int z13 = f5.z(parcel);
                LandmarkParcel[] landmarkParcelArr = null;
                i8.a[] aVarArr = null;
                int i13 = 0;
                int i14 = 0;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                float f13 = 0.0f;
                float f14 = Float.MAX_VALUE;
                float f15 = Float.MAX_VALUE;
                float f16 = Float.MAX_VALUE;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = -1.0f;
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            i13 = f5.u(parcel, readInt5);
                            break;
                        case 2:
                            i14 = f5.u(parcel, readInt5);
                            break;
                        case 3:
                            f10 = f5.r(parcel, readInt5);
                            break;
                        case 4:
                            f11 = f5.r(parcel, readInt5);
                            break;
                        case 5:
                            f12 = f5.r(parcel, readInt5);
                            break;
                        case 6:
                            f13 = f5.r(parcel, readInt5);
                            break;
                        case 7:
                            f14 = f5.r(parcel, readInt5);
                            break;
                        case '\b':
                            f15 = f5.r(parcel, readInt5);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) f5.k(parcel, readInt5, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f17 = f5.r(parcel, readInt5);
                            break;
                        case 11:
                            f18 = f5.r(parcel, readInt5);
                            break;
                        case '\f':
                            f19 = f5.r(parcel, readInt5);
                            break;
                        case '\r':
                            aVarArr = (i8.a[]) f5.k(parcel, readInt5, i8.a.CREATOR);
                            break;
                        case 14:
                            f16 = f5.r(parcel, readInt5);
                            break;
                        case 15:
                            f20 = f5.r(parcel, readInt5);
                            break;
                        default:
                            f5.y(parcel, readInt5);
                            break;
                    }
                }
                f5.m(parcel, z13);
                return new FaceParcel(i13, i14, f10, f11, f12, f13, f14, f15, f16, landmarkParcelArr, f17, f18, f19, aVarArr, f20);
            case 10:
                int z14 = f5.z(parcel);
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                boolean z15 = false;
                boolean z16 = false;
                float f21 = -1.0f;
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            i15 = f5.u(parcel, readInt6);
                            break;
                        case 3:
                            i16 = f5.u(parcel, readInt6);
                            break;
                        case 4:
                            i17 = f5.u(parcel, readInt6);
                            break;
                        case 5:
                            z15 = f5.n(parcel, readInt6);
                            break;
                        case 6:
                            z16 = f5.n(parcel, readInt6);
                            break;
                        case 7:
                            f21 = f5.r(parcel, readInt6);
                            break;
                        default:
                            f5.y(parcel, readInt6);
                            break;
                    }
                }
                f5.m(parcel, z14);
                ?? obj4 = new Object();
                obj4.f7925a = i15;
                obj4.f7926b = i16;
                obj4.f7927c = i17;
                obj4.d = z15;
                obj4.f7928e = z16;
                obj4.f7929f = f21;
                return obj4;
            case 11:
                int z17 = f5.z(parcel);
                int i18 = 0;
                int i19 = 0;
                float f22 = 0.0f;
                float f23 = 0.0f;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c13 = (char) readInt7;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                if (c13 != 4) {
                                    f5.y(parcel, readInt7);
                                } else {
                                    i19 = f5.u(parcel, readInt7);
                                }
                            } else {
                                f23 = f5.r(parcel, readInt7);
                            }
                        } else {
                            f22 = f5.r(parcel, readInt7);
                        }
                    } else {
                        i18 = f5.u(parcel, readInt7);
                    }
                }
                f5.m(parcel, z17);
                return new LandmarkParcel(i18, f22, f23, i19);
            case 12:
                return new j4.a(parcel);
            case 13:
                return new j4.b(parcel);
            case 14:
                return new j4.c(parcel);
            case 15:
                return new j4.d(parcel);
            case 16:
                return new j4.e(parcel);
            case 17:
                return new j4.f(parcel);
            case 18:
                return new j4.k(parcel);
            case 19:
                return new j4.l(parcel);
            case 20:
                return new j4.m(parcel);
            case 21:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new j4.n(readString, readString2, v.u(createStringArray));
            case 22:
                return new j4.o(parcel);
            case 23:
                int z18 = f5.z(parcel);
                String str6 = null;
                j8.b bVar = null;
                UserAddress userAddress = null;
                j8.k kVar = null;
                String str7 = null;
                Bundle bundle = null;
                String str8 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            str6 = f5.h(parcel, readInt8);
                            break;
                        case 2:
                            bVar = (j8.b) f5.g(parcel, readInt8, j8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) f5.g(parcel, readInt8, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar = (j8.k) f5.g(parcel, readInt8, j8.k.CREATOR);
                            break;
                        case 5:
                            str7 = f5.h(parcel, readInt8);
                            break;
                        case 6:
                            bundle = f5.a(parcel, readInt8);
                            break;
                        case 7:
                            str8 = f5.h(parcel, readInt8);
                            break;
                        case '\b':
                            bundle2 = f5.a(parcel, readInt8);
                            break;
                        default:
                            f5.y(parcel, readInt8);
                            break;
                    }
                }
                f5.m(parcel, z18);
                ?? obj5 = new Object();
                obj5.f9899a = str6;
                obj5.f9900b = bVar;
                obj5.f9901c = userAddress;
                obj5.d = kVar;
                obj5.f9902e = str7;
                obj5.f9903f = bundle;
                obj5.h = str8;
                obj5.f9904n = bundle2;
                return obj5;
            case 24:
                int z19 = f5.z(parcel);
                boolean z20 = false;
                j8.c cVar = null;
                j8.m mVar = null;
                ArrayList arrayList = null;
                j8.l lVar = null;
                j8.n nVar = null;
                String str9 = null;
                Bundle bundle3 = null;
                boolean z21 = false;
                boolean z22 = false;
                boolean z23 = true;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 1:
                            z20 = f5.n(parcel, readInt9);
                            break;
                        case 2:
                            z21 = f5.n(parcel, readInt9);
                            break;
                        case 3:
                            cVar = (j8.c) f5.g(parcel, readInt9, j8.c.CREATOR);
                            break;
                        case 4:
                            z22 = f5.n(parcel, readInt9);
                            break;
                        case 5:
                            mVar = (j8.m) f5.g(parcel, readInt9, j8.m.CREATOR);
                            break;
                        case 6:
                            arrayList = f5.e(parcel, readInt9);
                            break;
                        case 7:
                            lVar = (j8.l) f5.g(parcel, readInt9, j8.l.CREATOR);
                            break;
                        case '\b':
                            nVar = (j8.n) f5.g(parcel, readInt9, j8.n.CREATOR);
                            break;
                        case '\t':
                            z23 = f5.n(parcel, readInt9);
                            break;
                        case '\n':
                            str9 = f5.h(parcel, readInt9);
                            break;
                        case 11:
                            bundle3 = f5.a(parcel, readInt9);
                            break;
                        default:
                            f5.y(parcel, readInt9);
                            break;
                    }
                }
                f5.m(parcel, z19);
                ?? obj6 = new Object();
                obj6.f9905a = z20;
                obj6.f9906b = z21;
                obj6.f9907c = cVar;
                obj6.d = z22;
                obj6.f9908e = mVar;
                obj6.f9909f = arrayList;
                obj6.h = lVar;
                obj6.f9910n = nVar;
                obj6.f9911r = z23;
                obj6.f9912s = str9;
                obj6.v = bundle3;
                return obj6;
            case 25:
                int z24 = f5.z(parcel);
                int i20 = 0;
                String str10 = null;
                while (parcel.dataPosition() < z24) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            f5.y(parcel, readInt10);
                        } else {
                            str10 = f5.h(parcel, readInt10);
                        }
                    } else {
                        i20 = f5.u(parcel, readInt10);
                    }
                }
                f5.m(parcel, z24);
                ?? obj7 = new Object();
                obj7.f9913a = i20;
                obj7.f9914b = str10;
                return obj7;
            case 26:
                int z25 = f5.z(parcel);
                int i21 = 0;
                Bundle bundle4 = null;
                while (parcel.dataPosition() < z25) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            f5.y(parcel, readInt11);
                        } else {
                            bundle4 = f5.a(parcel, readInt11);
                        }
                    } else {
                        i21 = f5.u(parcel, readInt11);
                    }
                }
                f5.m(parcel, z25);
                ?? obj8 = new Object();
                new Bundle();
                obj8.f9915a = i21;
                obj8.f9916b = bundle4;
                return obj8;
            case 27:
                int z26 = f5.z(parcel);
                String str11 = null;
                String str12 = null;
                int i22 = 0;
                int i23 = 0;
                while (parcel.dataPosition() < z26) {
                    int readInt12 = parcel.readInt();
                    char c16 = (char) readInt12;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            if (c16 != 4) {
                                if (c16 != 5) {
                                    f5.y(parcel, readInt12);
                                } else {
                                    i23 = f5.u(parcel, readInt12);
                                }
                            } else {
                                i22 = f5.u(parcel, readInt12);
                            }
                        } else {
                            str12 = f5.h(parcel, readInt12);
                        }
                    } else {
                        str11 = f5.h(parcel, readInt12);
                    }
                }
                f5.m(parcel, z26);
                return new r(i22, i23, str11, str12);
            case 28:
                int z27 = f5.z(parcel);
                ArrayList arrayList2 = null;
                while (parcel.dataPosition() < z27) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        f5.y(parcel, readInt13);
                    } else {
                        arrayList2 = f5.j(parcel, readInt13);
                    }
                }
                f5.m(parcel, z27);
                ?? obj9 = new Object();
                obj9.f9917a = arrayList2;
                return obj9;
            default:
                int z28 = f5.z(parcel);
                int i24 = 0;
                String str13 = null;
                String str14 = null;
                while (parcel.dataPosition() < z28) {
                    int readInt14 = parcel.readInt();
                    char c17 = (char) readInt14;
                    if (c17 != 1) {
                        if (c17 != 2) {
                            if (c17 != 3) {
                                f5.y(parcel, readInt14);
                            } else {
                                str14 = f5.h(parcel, readInt14);
                            }
                        } else {
                            str13 = f5.h(parcel, readInt14);
                        }
                    } else {
                        i24 = f5.u(parcel, readInt14);
                    }
                }
                f5.m(parcel, z28);
                ?? obj10 = new Object();
                obj10.f9918a = i24;
                obj10.f9919b = str13;
                obj10.f9920c = str14;
                return obj10;
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f6221a) {
            case 0:
                return new i[i10];
            case 1:
                return new l[i10];
            case 2:
                return new k[i10];
            case 3:
                return new g4.a[i10];
            case 4:
                return new h4.a[i10];
            case 5:
                return new h4.b[i10];
            case 6:
                return new i4.b[i10];
            case 7:
                return new i4.c[i10];
            case 8:
                return new i8.a[i10];
            case 9:
                return new FaceParcel[i10];
            case 10:
                return new i8.b[i10];
            case 11:
                return new LandmarkParcel[i10];
            case 12:
                return new j4.a[i10];
            case 13:
                return new j4.b[i10];
            case 14:
                return new j4.c[i10];
            case 15:
                return new j4.d[i10];
            case 16:
                return new j4.e[i10];
            case 17:
                return new j4.f[i10];
            case 18:
                return new j4.k[i10];
            case 19:
                return new j4.l[i10];
            case 20:
                return new j4.m[i10];
            case 21:
                return new j4.n[i10];
            case 22:
                return new j4.o[i10];
            case 23:
                return new j8.i[i10];
            case 24:
                return new j8.j[i10];
            case 25:
                return new j8.k[i10];
            case 26:
                return new j8.l[i10];
            case 27:
                return new r[i10];
            case 28:
                return new j8.m[i10];
            default:
                return new j8.n[i10];
        }
    }
}
