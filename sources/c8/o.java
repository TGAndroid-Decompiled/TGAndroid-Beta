package c8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.r;
import f2.j0;
import h7.q8;
import java.util.ArrayList;
import p8.z;

public final class o implements Parcelable.Creator {

    public final int f2561a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2561a) {
            case 0:
                int iZ = q8.z(parcel);
                int iU = 0;
                String strH = null;
                int iU2 = 0;
                int iU3 = 0;
                int iU4 = 0;
                int iU5 = 0;
                int iU6 = 0;
                boolean zN = false;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            iU = q8.u(parcel, i10);
                            break;
                        case 3:
                            iU2 = q8.u(parcel, i10);
                            break;
                        case 4:
                            iU3 = q8.u(parcel, i10);
                            break;
                        case 5:
                            iU4 = q8.u(parcel, i10);
                            break;
                        case 6:
                            iU5 = q8.u(parcel, i10);
                            break;
                        case 7:
                            iU6 = q8.u(parcel, i10);
                            break;
                        case '\b':
                            zN = q8.n(parcel, i10);
                            break;
                        case '\t':
                            strH = q8.h(parcel, i10);
                            break;
                        default:
                            q8.y(parcel, i10);
                            break;
                    }
                }
                q8.m(parcel, iZ);
                b bVar = new b();
                bVar.f2503a = iU;
                bVar.f2504b = iU2;
                bVar.f2505c = iU3;
                bVar.d = iU4;
                bVar.f2506e = iU5;
                bVar.f2507f = iU6;
                bVar.h = zN;
                bVar.f2508n = strH;
                return bVar;
            case 1:
                int iZ2 = q8.z(parcel);
                h hVar = null;
                String strH2 = null;
                String strH3 = null;
                i[] iVarArr = null;
                f[] fVarArr = null;
                String[] strArrI = null;
                a[] aVarArr = null;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            hVar = (h) q8.g(parcel, i11, h.CREATOR);
                            break;
                        case 3:
                            strH2 = q8.h(parcel, i11);
                            break;
                        case 4:
                            strH3 = q8.h(parcel, i11);
                            break;
                        case 5:
                            iVarArr = (i[]) q8.k(parcel, i11, i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (f[]) q8.k(parcel, i11, f.CREATOR);
                            break;
                        case 7:
                            strArrI = q8.i(parcel, i11);
                            break;
                        case '\b':
                            aVarArr = (a[]) q8.k(parcel, i11, a.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i11);
                            break;
                    }
                }
                q8.m(parcel, iZ2);
                d dVar = new d();
                dVar.f2514a = hVar;
                dVar.f2515b = strH2;
                dVar.f2516c = strH3;
                dVar.d = iVarArr;
                dVar.f2517e = fVarArr;
                dVar.f2518f = strArrI;
                dVar.h = aVarArr;
                return dVar;
            case 2:
                int iZ3 = q8.z(parcel);
                String strH4 = null;
                String strH5 = null;
                String strH6 = null;
                String strH7 = null;
                String strH8 = null;
                b bVar2 = null;
                b bVar3 = null;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            strH4 = q8.h(parcel, i12);
                            break;
                        case 3:
                            strH5 = q8.h(parcel, i12);
                            break;
                        case 4:
                            strH6 = q8.h(parcel, i12);
                            break;
                        case 5:
                            strH7 = q8.h(parcel, i12);
                            break;
                        case 6:
                            strH8 = q8.h(parcel, i12);
                            break;
                        case 7:
                            bVar2 = (b) q8.g(parcel, i12, b.CREATOR);
                            break;
                        case '\b':
                            bVar3 = (b) q8.g(parcel, i12, b.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i12);
                            break;
                    }
                }
                q8.m(parcel, iZ3);
                c cVar = new c();
                cVar.f2509a = strH4;
                cVar.f2510b = strH5;
                cVar.f2511c = strH6;
                cVar.d = strH7;
                cVar.f2512e = strH8;
                cVar.f2513f = bVar2;
                cVar.h = bVar3;
                return cVar;
            case 3:
                int iZ4 = q8.z(parcel);
                int iU7 = 0;
                String strH9 = null;
                String strH10 = null;
                String strH11 = null;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    char c10 = (char) i13;
                    if (c10 == 2) {
                        iU7 = q8.u(parcel, i13);
                    } else if (c10 == 3) {
                        strH9 = q8.h(parcel, i13);
                    } else if (c10 == 4) {
                        strH10 = q8.h(parcel, i13);
                    } else if (c10 != 5) {
                        q8.y(parcel, i13);
                    } else {
                        strH11 = q8.h(parcel, i13);
                    }
                }
                q8.m(parcel, iZ4);
                f fVar = new f();
                fVar.f2530a = iU7;
                fVar.f2531b = strH9;
                fVar.f2532c = strH10;
                fVar.d = strH11;
                return fVar;
            case 4:
                int iZ5 = q8.z(parcel);
                String strH12 = null;
                String strH13 = null;
                String strH14 = null;
                String strH15 = null;
                String strH16 = null;
                String strH17 = null;
                String strH18 = null;
                String strH19 = null;
                String strH20 = null;
                String strH21 = null;
                String strH22 = null;
                String strH23 = null;
                String strH24 = null;
                String strH25 = null;
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    String str = strH24;
                    switch ((char) i14) {
                        case 2:
                            strH12 = q8.h(parcel, i14);
                            break;
                        case 3:
                            strH13 = q8.h(parcel, i14);
                            break;
                        case 4:
                            strH14 = q8.h(parcel, i14);
                            break;
                        case 5:
                            strH15 = q8.h(parcel, i14);
                            break;
                        case 6:
                            strH16 = q8.h(parcel, i14);
                            break;
                        case 7:
                            strH17 = q8.h(parcel, i14);
                            break;
                        case '\b':
                            strH18 = q8.h(parcel, i14);
                            break;
                        case '\t':
                            strH19 = q8.h(parcel, i14);
                            break;
                        case '\n':
                            strH20 = q8.h(parcel, i14);
                            break;
                        case 11:
                            strH21 = q8.h(parcel, i14);
                            break;
                        case '\f':
                            strH22 = q8.h(parcel, i14);
                            break;
                        case '\r':
                            strH23 = q8.h(parcel, i14);
                            break;
                        case 14:
                            strH24 = q8.h(parcel, i14);
                            continue;
                        case 15:
                            strH25 = q8.h(parcel, i14);
                            break;
                        default:
                            q8.y(parcel, i14);
                            break;
                    }
                    strH24 = str;
                }
                q8.m(parcel, iZ5);
                e eVar = new e();
                eVar.f2519a = strH12;
                eVar.f2520b = strH13;
                eVar.f2521c = strH14;
                eVar.d = strH15;
                eVar.f2522e = strH16;
                eVar.f2523f = strH17;
                eVar.h = strH18;
                eVar.f2524n = strH19;
                eVar.f2525r = strH20;
                eVar.f2526s = strH21;
                eVar.v = strH22;
                eVar.f2527w = strH23;
                eVar.f2528x = strH24;
                eVar.f2529y = strH25;
                return eVar;
            case 5:
                int iZ6 = q8.z(parcel);
                String strH26 = null;
                String strH27 = null;
                String strH28 = null;
                String strH29 = null;
                String strH30 = null;
                String strH31 = null;
                String strH32 = null;
                while (parcel.dataPosition() < iZ6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            strH26 = q8.h(parcel, i15);
                            break;
                        case 3:
                            strH27 = q8.h(parcel, i15);
                            break;
                        case 4:
                            strH28 = q8.h(parcel, i15);
                            break;
                        case 5:
                            strH29 = q8.h(parcel, i15);
                            break;
                        case 6:
                            strH30 = q8.h(parcel, i15);
                            break;
                        case 7:
                            strH31 = q8.h(parcel, i15);
                            break;
                        case '\b':
                            strH32 = q8.h(parcel, i15);
                            break;
                        default:
                            q8.y(parcel, i15);
                            break;
                    }
                }
                q8.m(parcel, iZ6);
                h hVar2 = new h();
                hVar2.f2535a = strH26;
                hVar2.f2536b = strH27;
                hVar2.f2537c = strH28;
                hVar2.d = strH29;
                hVar2.f2538e = strH30;
                hVar2.f2539f = strH31;
                hVar2.h = strH32;
                return hVar2;
            case 6:
                int iZ7 = q8.z(parcel);
                double dQ = 0.0d;
                double dQ2 = 0.0d;
                while (parcel.dataPosition() < iZ7) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 2) {
                        dQ = q8.q(parcel, i16);
                    } else if (c11 != 3) {
                        q8.y(parcel, i16);
                    } else {
                        dQ2 = q8.q(parcel, i16);
                    }
                }
                q8.m(parcel, iZ7);
                g gVar = new g();
                gVar.f2533a = dQ;
                gVar.f2534b = dQ2;
                return gVar;
            case 7:
                int iZ8 = q8.z(parcel);
                String strH33 = null;
                String strH34 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 2) {
                        strH33 = q8.h(parcel, i17);
                    } else if (c12 != 3) {
                        q8.y(parcel, i17);
                    } else {
                        strH34 = q8.h(parcel, i17);
                    }
                }
                q8.m(parcel, iZ8);
                j jVar = new j();
                jVar.f2542a = strH33;
                jVar.f2543b = strH34;
                return jVar;
            case 8:
                int iZ9 = q8.z(parcel);
                int iU8 = 0;
                String strH35 = null;
                while (parcel.dataPosition() < iZ9) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 2) {
                        iU8 = q8.u(parcel, i18);
                    } else if (c13 != 3) {
                        q8.y(parcel, i18);
                    } else {
                        strH35 = q8.h(parcel, i18);
                    }
                }
                q8.m(parcel, iZ9);
                i iVar = new i();
                iVar.f2540a = iU8;
                iVar.f2541b = strH35;
                return iVar;
            case 9:
                int iZ10 = q8.z(parcel);
                String strH36 = null;
                String strH37 = null;
                int iU9 = 0;
                while (parcel.dataPosition() < iZ10) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 2) {
                        strH36 = q8.h(parcel, i19);
                    } else if (c14 == 3) {
                        strH37 = q8.h(parcel, i19);
                    } else if (c14 != 4) {
                        q8.y(parcel, i19);
                    } else {
                        iU9 = q8.u(parcel, i19);
                    }
                }
                q8.m(parcel, iZ10);
                l lVar = new l();
                lVar.f2546a = strH36;
                lVar.f2547b = strH37;
                lVar.f2548c = iU9;
                return lVar;
            case 10:
                int iZ11 = q8.z(parcel);
                String strH38 = null;
                String strH39 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 2) {
                        strH38 = q8.h(parcel, i20);
                    } else if (c15 != 3) {
                        q8.y(parcel, i20);
                    } else {
                        strH39 = q8.h(parcel, i20);
                    }
                }
                q8.m(parcel, iZ11);
                k kVar = new k();
                kVar.f2544a = strH38;
                kVar.f2545b = strH39;
                return kVar;
            case 11:
                int iZ12 = q8.z(parcel);
                Bundle bundleA = null;
                while (parcel.dataPosition() < iZ12) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        q8.y(parcel, i21);
                    } else {
                        bundleA = q8.a(parcel, i21);
                    }
                }
                q8.m(parcel, iZ12);
                return new r(bundleA);
            case 12:
                return new d4.b(parcel);
            case 13:
                return new d4.c(parcel);
            case 14:
                return new e4.a(parcel);
            case 15:
                return new e4.b(parcel);
            case 16:
                return new e4.c(parcel);
            case 17:
                return new e4.d(parcel);
            case 18:
                return new e4.e(parcel);
            case 19:
                return new e4.f(parcel);
            case 20:
                return new e4.k(parcel);
            case 21:
                return new e4.l(parcel);
            case 22:
                return new e4.m(parcel);
            case 23:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new e4.n(string, string2, z.v(strArrCreateStringArray));
            case 24:
                return new e4.o(parcel);
            case 25:
                j0 j0Var = new j0();
                j0Var.f5707a = parcel.readInt();
                j0Var.f5708b = parcel.readInt();
                j0Var.f5709c = parcel.readInt() == 1;
                return j0Var;
            case 26:
                return new f4.a(parcel);
            case 27:
                return new f4.b(parcel);
            case 28:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, f4.c.class.getClassLoader());
                return new f4.d(arrayList);
            default:
                return new f4.c(parcel.readLong(), parcel.readLong(), parcel.readInt());
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f2561a) {
            case 0:
                return new b[i10];
            case 1:
                return new d[i10];
            case 2:
                return new c[i10];
            case 3:
                return new f[i10];
            case 4:
                return new e[i10];
            case 5:
                return new h[i10];
            case 6:
                return new g[i10];
            case 7:
                return new j[i10];
            case 8:
                return new i[i10];
            case 9:
                return new l[i10];
            case 10:
                return new k[i10];
            case 11:
                return new r[i10];
            case 12:
                return new d4.b[i10];
            case 13:
                return new d4.c[i10];
            case 14:
                return new e4.a[i10];
            case 15:
                return new e4.b[i10];
            case 16:
                return new e4.c[i10];
            case 17:
                return new e4.d[i10];
            case 18:
                return new e4.e[i10];
            case 19:
                return new e4.f[i10];
            case 20:
                return new e4.k[i10];
            case 21:
                return new e4.l[i10];
            case 22:
                return new e4.m[i10];
            case 23:
                return new e4.n[i10];
            case 24:
                return new e4.o[i10];
            case 25:
                return new j0[i10];
            case 26:
                return new f4.a[i10];
            case 27:
                return new f4.b[i10];
            case 28:
                return new f4.d[i10];
            default:
                return new f4.c[i10];
        }
    }
}
