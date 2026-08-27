package f4;

import android.app.PendingIntent;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import g4.i;
import g4.j;
import g8.k;
import g8.l;
import g8.m;
import g8.n;
import g8.q;
import g8.r;
import g8.s;
import h7.q8;
import h8.g;
import h8.h;
import java.util.ArrayList;

public final class e implements Parcelable.Creator {

    public final int f5880a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5880a) {
            case 0:
                return new f(parcel);
            case 1:
                int iZ = q8.z(parcel);
                PointF[] pointFArr = null;
                int iU = 0;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 2) {
                        pointFArr = (PointF[]) q8.k(parcel, i10, PointF.CREATOR);
                    } else if (c10 != 3) {
                        q8.y(parcel, i10);
                    } else {
                        iU = q8.u(parcel, i10);
                    }
                }
                q8.m(parcel, iZ);
                return new f8.a(pointFArr, iU);
            case 2:
                int iZ2 = q8.z(parcel);
                LandmarkParcel[] landmarkParcelArr = null;
                f8.a[] aVarArr = null;
                int iU2 = 0;
                int iU3 = 0;
                float fR = 0.0f;
                float fR2 = 0.0f;
                float fR3 = 0.0f;
                float fR4 = 0.0f;
                float fR5 = Float.MAX_VALUE;
                float fR6 = Float.MAX_VALUE;
                float fR7 = Float.MAX_VALUE;
                float fR8 = 0.0f;
                float fR9 = 0.0f;
                float fR10 = 0.0f;
                float fR11 = -1.0f;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iU2 = q8.u(parcel, i11);
                            break;
                        case 2:
                            iU3 = q8.u(parcel, i11);
                            break;
                        case 3:
                            fR = q8.r(parcel, i11);
                            break;
                        case 4:
                            fR2 = q8.r(parcel, i11);
                            break;
                        case 5:
                            fR3 = q8.r(parcel, i11);
                            break;
                        case 6:
                            fR4 = q8.r(parcel, i11);
                            break;
                        case 7:
                            fR5 = q8.r(parcel, i11);
                            break;
                        case '\b':
                            fR6 = q8.r(parcel, i11);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) q8.k(parcel, i11, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            fR8 = q8.r(parcel, i11);
                            break;
                        case 11:
                            fR9 = q8.r(parcel, i11);
                            break;
                        case '\f':
                            fR10 = q8.r(parcel, i11);
                            break;
                        case '\r':
                            aVarArr = (f8.a[]) q8.k(parcel, i11, f8.a.CREATOR);
                            break;
                        case 14:
                            fR7 = q8.r(parcel, i11);
                            break;
                        case 15:
                            fR11 = q8.r(parcel, i11);
                            break;
                        default:
                            q8.y(parcel, i11);
                            break;
                    }
                }
                q8.m(parcel, iZ2);
                return new FaceParcel(iU2, iU3, fR, fR2, fR3, fR4, fR5, fR6, fR7, landmarkParcelArr, fR8, fR9, fR10, aVarArr, fR11);
            case 3:
                int iZ3 = q8.z(parcel);
                int iU4 = 0;
                int iU5 = 0;
                int iU6 = 0;
                boolean zN = false;
                boolean zN2 = false;
                float fR12 = -1.0f;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            iU4 = q8.u(parcel, i12);
                            break;
                        case 3:
                            iU5 = q8.u(parcel, i12);
                            break;
                        case 4:
                            iU6 = q8.u(parcel, i12);
                            break;
                        case 5:
                            zN = q8.n(parcel, i12);
                            break;
                        case 6:
                            zN2 = q8.n(parcel, i12);
                            break;
                        case 7:
                            fR12 = q8.r(parcel, i12);
                            break;
                        default:
                            q8.y(parcel, i12);
                            break;
                    }
                }
                q8.m(parcel, iZ3);
                f8.b bVar = new f8.b();
                bVar.f5909a = iU4;
                bVar.f5910b = iU5;
                bVar.f5911c = iU6;
                bVar.d = zN;
                bVar.f5912e = zN2;
                bVar.f5913f = fR12;
                return bVar;
            case 4:
                int iZ4 = q8.z(parcel);
                int iU7 = 0;
                int iU8 = 0;
                float fR13 = 0.0f;
                float fR14 = 0.0f;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iU7 = q8.u(parcel, i13);
                    } else if (c11 == 2) {
                        fR13 = q8.r(parcel, i13);
                    } else if (c11 == 3) {
                        fR14 = q8.r(parcel, i13);
                    } else if (c11 != 4) {
                        q8.y(parcel, i13);
                    } else {
                        iU8 = q8.u(parcel, i13);
                    }
                }
                q8.m(parcel, iZ4);
                return new LandmarkParcel(iU7, fR13, fR14, iU8);
            case 5:
                return new g4.a(parcel);
            case 6:
                return new g4.e(parcel);
            case 7:
                return new g4.f();
            case 8:
                return new i(parcel);
            case 9:
                return new j(parcel.readLong(), parcel.readLong());
            case 10:
                int iZ5 = q8.z(parcel);
                String strH = null;
                g8.b bVar2 = null;
                UserAddress userAddress = null;
                k kVar = null;
                String strH2 = null;
                Bundle bundleA = null;
                String strH3 = null;
                Bundle bundleA2 = null;
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            strH = q8.h(parcel, i14);
                            break;
                        case 2:
                            bVar2 = (g8.b) q8.g(parcel, i14, g8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) q8.g(parcel, i14, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar = (k) q8.g(parcel, i14, k.CREATOR);
                            break;
                        case 5:
                            strH2 = q8.h(parcel, i14);
                            break;
                        case 6:
                            bundleA = q8.a(parcel, i14);
                            break;
                        case 7:
                            strH3 = q8.h(parcel, i14);
                            break;
                        case '\b':
                            bundleA2 = q8.a(parcel, i14);
                            break;
                        default:
                            q8.y(parcel, i14);
                            break;
                    }
                }
                q8.m(parcel, iZ5);
                g8.i iVar = new g8.i();
                iVar.f6745a = strH;
                iVar.f6746b = bVar2;
                iVar.f6747c = userAddress;
                iVar.d = kVar;
                iVar.f6748e = strH2;
                iVar.f6749f = bundleA;
                iVar.h = strH3;
                iVar.f6750n = bundleA2;
                return iVar;
            case 11:
                int iZ6 = q8.z(parcel);
                boolean zN3 = false;
                g8.c cVar = null;
                m mVar = null;
                ArrayList arrayListE = null;
                l lVar = null;
                n nVar = null;
                String strH4 = null;
                Bundle bundleA3 = null;
                boolean zN4 = false;
                boolean zN5 = false;
                boolean zN6 = true;
                while (parcel.dataPosition() < iZ6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            zN3 = q8.n(parcel, i15);
                            break;
                        case 2:
                            zN4 = q8.n(parcel, i15);
                            break;
                        case 3:
                            cVar = (g8.c) q8.g(parcel, i15, g8.c.CREATOR);
                            break;
                        case 4:
                            zN5 = q8.n(parcel, i15);
                            break;
                        case 5:
                            mVar = (m) q8.g(parcel, i15, m.CREATOR);
                            break;
                        case 6:
                            arrayListE = q8.e(parcel, i15);
                            break;
                        case 7:
                            lVar = (l) q8.g(parcel, i15, l.CREATOR);
                            break;
                        case '\b':
                            nVar = (n) q8.g(parcel, i15, n.CREATOR);
                            break;
                        case '\t':
                            zN6 = q8.n(parcel, i15);
                            break;
                        case '\n':
                            strH4 = q8.h(parcel, i15);
                            break;
                        case 11:
                            bundleA3 = q8.a(parcel, i15);
                            break;
                        default:
                            q8.y(parcel, i15);
                            break;
                    }
                }
                q8.m(parcel, iZ6);
                g8.j jVar = new g8.j();
                jVar.f6751a = zN3;
                jVar.f6752b = zN4;
                jVar.f6753c = cVar;
                jVar.d = zN5;
                jVar.f6754e = mVar;
                jVar.f6755f = arrayListE;
                jVar.h = lVar;
                jVar.f6756n = nVar;
                jVar.f6757r = zN6;
                jVar.f6758s = strH4;
                jVar.v = bundleA3;
                return jVar;
            case 12:
                int iZ7 = q8.z(parcel);
                int iU9 = 0;
                String strH5 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i16 = parcel.readInt();
                    char c12 = (char) i16;
                    if (c12 == 2) {
                        iU9 = q8.u(parcel, i16);
                    } else if (c12 != 3) {
                        q8.y(parcel, i16);
                    } else {
                        strH5 = q8.h(parcel, i16);
                    }
                }
                q8.m(parcel, iZ7);
                k kVar2 = new k();
                kVar2.f6759a = iU9;
                kVar2.f6760b = strH5;
                return kVar2;
            case 13:
                int iZ8 = q8.z(parcel);
                int iU10 = 0;
                Bundle bundleA4 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i17 = parcel.readInt();
                    char c13 = (char) i17;
                    if (c13 == 2) {
                        iU10 = q8.u(parcel, i17);
                    } else if (c13 != 3) {
                        q8.y(parcel, i17);
                    } else {
                        bundleA4 = q8.a(parcel, i17);
                    }
                }
                q8.m(parcel, iZ8);
                l lVar2 = new l();
                new Bundle();
                lVar2.f6761a = iU10;
                lVar2.f6762b = bundleA4;
                return lVar2;
            case 14:
                int iZ9 = q8.z(parcel);
                String strH6 = null;
                String strH7 = null;
                int iU11 = 0;
                int iU12 = 0;
                while (parcel.dataPosition() < iZ9) {
                    int i18 = parcel.readInt();
                    char c14 = (char) i18;
                    if (c14 == 2) {
                        strH6 = q8.h(parcel, i18);
                    } else if (c14 == 3) {
                        strH7 = q8.h(parcel, i18);
                    } else if (c14 == 4) {
                        iU11 = q8.u(parcel, i18);
                    } else if (c14 != 5) {
                        q8.y(parcel, i18);
                    } else {
                        iU12 = q8.u(parcel, i18);
                    }
                }
                q8.m(parcel, iZ9);
                return new r(iU11, iU12, strH6, strH7);
            case 15:
                int iZ10 = q8.z(parcel);
                ArrayList arrayListJ = null;
                while (parcel.dataPosition() < iZ10) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        q8.y(parcel, i19);
                    } else {
                        arrayListJ = q8.j(parcel, i19);
                    }
                }
                q8.m(parcel, iZ10);
                m mVar2 = new m();
                mVar2.f6763a = arrayListJ;
                return mVar2;
            case 16:
                int iZ11 = q8.z(parcel);
                int iU13 = 0;
                String strH8 = null;
                String strH9 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        iU13 = q8.u(parcel, i20);
                    } else if (c15 == 2) {
                        strH8 = q8.h(parcel, i20);
                    } else if (c15 != 3) {
                        q8.y(parcel, i20);
                    } else {
                        strH9 = q8.h(parcel, i20);
                    }
                }
                q8.m(parcel, iZ11);
                n nVar2 = new n();
                nVar2.f6764a = iU13;
                nVar2.f6765b = strH8;
                nVar2.f6766c = strH9;
                return nVar2;
            case 17:
                int iZ12 = q8.z(parcel);
                String strH10 = null;
                Bundle bundleA5 = null;
                while (parcel.dataPosition() < iZ12) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 2) {
                        strH10 = q8.h(parcel, i21);
                    } else if (c16 != 3) {
                        q8.y(parcel, i21);
                    } else {
                        bundleA5 = q8.a(parcel, i21);
                    }
                }
                q8.m(parcel, iZ12);
                s sVar = new s();
                sVar.f6782a = strH10;
                sVar.f6783b = bundleA5;
                return sVar;
            case 18:
                int iZ13 = q8.z(parcel);
                String strH11 = null;
                String strH12 = null;
                String strH13 = null;
                String strH14 = null;
                String strH15 = null;
                String strH16 = null;
                String strH17 = null;
                String strH18 = null;
                String strH19 = null;
                String strH20 = null;
                boolean zN7 = false;
                while (parcel.dataPosition() < iZ13) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            strH11 = q8.h(parcel, i22);
                            break;
                        case 3:
                            strH12 = q8.h(parcel, i22);
                            break;
                        case 4:
                            strH13 = q8.h(parcel, i22);
                            break;
                        case 5:
                            strH14 = q8.h(parcel, i22);
                            break;
                        case 6:
                            strH15 = q8.h(parcel, i22);
                            break;
                        case 7:
                            strH16 = q8.h(parcel, i22);
                            break;
                        case '\b':
                            strH17 = q8.h(parcel, i22);
                            break;
                        case '\t':
                            strH18 = q8.h(parcel, i22);
                            break;
                        case '\n':
                            strH19 = q8.h(parcel, i22);
                            break;
                        case 11:
                            zN7 = q8.n(parcel, i22);
                            break;
                        case '\f':
                            strH20 = q8.h(parcel, i22);
                            break;
                        default:
                            q8.y(parcel, i22);
                            break;
                    }
                }
                q8.m(parcel, iZ13);
                q qVar = new q();
                qVar.f6771a = strH11;
                qVar.f6772b = strH12;
                qVar.f6773c = strH13;
                qVar.d = strH14;
                qVar.f6774e = strH15;
                qVar.f6775f = strH16;
                qVar.h = strH17;
                qVar.f6776n = strH18;
                qVar.f6777r = strH19;
                qVar.f6778s = zN7;
                qVar.v = strH20;
                return qVar;
            case 19:
                int iZ14 = q8.z(parcel);
                String strH21 = null;
                String strH22 = null;
                String strH23 = null;
                UserAddress userAddress2 = null;
                int iU14 = 0;
                while (parcel.dataPosition() < iZ14) {
                    int i23 = parcel.readInt();
                    char c17 = (char) i23;
                    if (c17 == 1) {
                        strH21 = q8.h(parcel, i23);
                    } else if (c17 == 2) {
                        strH22 = q8.h(parcel, i23);
                    } else if (c17 == 3) {
                        strH23 = q8.h(parcel, i23);
                    } else if (c17 == 4) {
                        iU14 = q8.u(parcel, i23);
                    } else if (c17 != 5) {
                        q8.y(parcel, i23);
                    } else {
                        userAddress2 = (UserAddress) q8.g(parcel, i23, UserAddress.CREATOR);
                    }
                }
                q8.m(parcel, iZ14);
                g8.b bVar3 = new g8.b();
                bVar3.f6715a = strH21;
                bVar3.f6716b = strH22;
                bVar3.f6717c = strH23;
                bVar3.d = iU14;
                bVar3.f6718e = userAddress2;
                return bVar3;
            case 20:
                int iZ15 = q8.z(parcel);
                ArrayList arrayListE2 = null;
                boolean zN8 = false;
                int iU15 = 0;
                boolean zN9 = true;
                while (parcel.dataPosition() < iZ15) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 1) {
                        arrayListE2 = q8.e(parcel, i24);
                    } else if (c18 == 2) {
                        zN9 = q8.n(parcel, i24);
                    } else if (c18 == 3) {
                        zN8 = q8.n(parcel, i24);
                    } else if (c18 != 4) {
                        q8.y(parcel, i24);
                    } else {
                        iU15 = q8.u(parcel, i24);
                    }
                }
                q8.m(parcel, iZ15);
                g8.c cVar2 = new g8.c();
                cVar2.f6719a = arrayListE2;
                cVar2.f6720b = zN9;
                cVar2.f6721c = zN8;
                cVar2.d = iU15;
                return cVar2;
            case 21:
                int iZ16 = q8.z(parcel);
                String strH24 = null;
                String strH25 = null;
                r rVar = null;
                String strH26 = null;
                q qVar2 = null;
                q qVar3 = null;
                String[] strArrI = null;
                UserAddress userAddress3 = null;
                UserAddress userAddress4 = null;
                g8.d[] dVarArr = null;
                k kVar3 = null;
                while (parcel.dataPosition() < iZ16) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            strH24 = q8.h(parcel, i25);
                            break;
                        case 3:
                            strH25 = q8.h(parcel, i25);
                            break;
                        case 4:
                            rVar = (r) q8.g(parcel, i25, r.CREATOR);
                            break;
                        case 5:
                            strH26 = q8.h(parcel, i25);
                            break;
                        case 6:
                            qVar2 = (q) q8.g(parcel, i25, q.CREATOR);
                            break;
                        case 7:
                            qVar3 = (q) q8.g(parcel, i25, q.CREATOR);
                            break;
                        case '\b':
                            strArrI = q8.i(parcel, i25);
                            break;
                        case '\t':
                            userAddress3 = (UserAddress) q8.g(parcel, i25, UserAddress.CREATOR);
                            break;
                        case '\n':
                            userAddress4 = (UserAddress) q8.g(parcel, i25, UserAddress.CREATOR);
                            break;
                        case 11:
                            dVarArr = (g8.d[]) q8.k(parcel, i25, g8.d.CREATOR);
                            break;
                        case '\f':
                            kVar3 = (k) q8.g(parcel, i25, k.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i25);
                            break;
                    }
                }
                q8.m(parcel, iZ16);
                FullWallet fullWallet = new FullWallet();
                fullWallet.f4371a = strH24;
                fullWallet.f4372b = strH25;
                fullWallet.f4373c = rVar;
                fullWallet.d = strH26;
                fullWallet.f4374e = qVar2;
                fullWallet.f4375f = qVar3;
                fullWallet.h = strArrI;
                fullWallet.f4376n = userAddress3;
                fullWallet.f4377r = userAddress4;
                fullWallet.f4378s = dVarArr;
                fullWallet.v = kVar3;
                return fullWallet;
            case 22:
                int iZ17 = q8.z(parcel);
                String strH27 = null;
                String strH28 = null;
                int iU16 = 0;
                while (parcel.dataPosition() < iZ17) {
                    int i26 = parcel.readInt();
                    char c19 = (char) i26;
                    if (c19 == 2) {
                        strH27 = q8.h(parcel, i26);
                    } else if (c19 == 3) {
                        strH28 = q8.h(parcel, i26);
                    } else if (c19 != 4) {
                        q8.y(parcel, i26);
                    } else {
                        iU16 = q8.u(parcel, i26);
                    }
                }
                q8.m(parcel, iZ17);
                g8.d dVar = new g8.d();
                dVar.f6722a = strH27;
                dVar.f6723b = strH28;
                dVar.f6724c = iU16;
                return dVar;
            case 23:
                int iZ18 = q8.z(parcel);
                ArrayList arrayListE3 = null;
                String strH29 = null;
                String strH30 = null;
                ArrayList arrayListE4 = null;
                String strH31 = null;
                boolean zN10 = false;
                while (parcel.dataPosition() < iZ18) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 2:
                            arrayListE3 = q8.e(parcel, i27);
                            break;
                        case 3:
                        default:
                            q8.y(parcel, i27);
                            break;
                        case 4:
                            strH29 = q8.h(parcel, i27);
                            break;
                        case 5:
                            strH30 = q8.h(parcel, i27);
                            break;
                        case 6:
                            arrayListE4 = q8.e(parcel, i27);
                            break;
                        case 7:
                            zN10 = q8.n(parcel, i27);
                            break;
                        case '\b':
                            strH31 = q8.h(parcel, i27);
                            break;
                    }
                }
                q8.m(parcel, iZ18);
                g8.e eVar = new g8.e();
                eVar.f6725a = arrayListE3;
                eVar.f6726b = strH29;
                eVar.f6727c = strH30;
                eVar.d = arrayListE4;
                eVar.f6728e = zN10;
                eVar.f6729f = strH31;
                return eVar;
            case 24:
                int iZ19 = q8.z(parcel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                String strH32 = null;
                ArrayList arrayListL = arrayList2;
                ArrayList arrayListL2 = arrayList3;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String strH33 = null;
                h8.f fVar = null;
                String strH34 = null;
                String strH35 = null;
                String strH36 = null;
                String strH37 = null;
                String strH38 = null;
                String strH39 = null;
                String strH40 = null;
                String strH41 = null;
                String strH42 = null;
                h8.c cVar3 = null;
                String strH43 = null;
                int iU17 = 0;
                boolean zN11 = false;
                while (parcel.dataPosition() < iZ19) {
                    int i28 = parcel.readInt();
                    h8.f fVar2 = fVar;
                    switch ((char) i28) {
                        case 2:
                            strH32 = q8.h(parcel, i28);
                            break;
                        case 3:
                            strH36 = q8.h(parcel, i28);
                            break;
                        case 4:
                            strH37 = q8.h(parcel, i28);
                            break;
                        case 5:
                            strH38 = q8.h(parcel, i28);
                            break;
                        case 6:
                            strH39 = q8.h(parcel, i28);
                            break;
                        case 7:
                            strH40 = q8.h(parcel, i28);
                            break;
                        case '\b':
                            strH41 = q8.h(parcel, i28);
                            break;
                        case '\t':
                            strH33 = q8.h(parcel, i28);
                            break;
                        case '\n':
                            strH35 = q8.h(parcel, i28);
                            break;
                        case 11:
                            strH34 = q8.h(parcel, i28);
                            break;
                        case '\f':
                            iU17 = q8.u(parcel, i28);
                            break;
                        case '\r':
                            arrayList = q8.l(parcel, i28, h.CREATOR);
                            break;
                        case 14:
                            fVar = (h8.f) q8.g(parcel, i28, h8.f.CREATOR);
                            continue;
                        case 15:
                            arrayListL = q8.l(parcel, i28, LatLng.CREATOR);
                            break;
                        case 16:
                            strH43 = q8.h(parcel, i28);
                            break;
                        case 17:
                            strH42 = q8.h(parcel, i28);
                            break;
                        case 18:
                            arrayListL2 = q8.l(parcel, i28, h8.b.CREATOR);
                            break;
                        case 19:
                            zN11 = q8.n(parcel, i28);
                            break;
                        case 20:
                            arrayList4 = q8.l(parcel, i28, g.CREATOR);
                            break;
                        case 21:
                            arrayList5 = q8.l(parcel, i28, h8.e.CREATOR);
                            break;
                        case 22:
                            arrayList6 = q8.l(parcel, i28, g.CREATOR);
                            break;
                        case 23:
                            cVar3 = (h8.c) q8.g(parcel, i28, h8.c.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i28);
                            break;
                    }
                    fVar = fVar2;
                }
                q8.m(parcel, iZ19);
                g8.f fVar3 = new g8.f();
                fVar3.f6730a = strH32;
                fVar3.f6731b = strH36;
                fVar3.f6732c = strH37;
                fVar3.d = strH38;
                fVar3.f6733e = strH39;
                fVar3.f6734f = strH40;
                fVar3.h = strH41;
                fVar3.f6735n = strH33;
                fVar3.f6736r = strH35;
                fVar3.f6737s = strH34;
                fVar3.v = iU17;
                fVar3.f6738w = arrayList;
                fVar3.f6739x = fVar;
                fVar3.f6740y = arrayListL;
                fVar3.A = strH43;
                fVar3.B = strH42;
                fVar3.C = arrayListL2;
                fVar3.D = zN11;
                fVar3.E = arrayList4;
                fVar3.F = arrayList5;
                fVar3.G = arrayList6;
                fVar3.H = cVar3;
                return fVar3;
            case 25:
                int iZ20 = q8.z(parcel);
                String strH44 = null;
                String strH45 = null;
                String[] strArrI2 = null;
                String strH46 = null;
                q qVar4 = null;
                q qVar5 = null;
                g8.f[] fVarArr = null;
                g8.g[] gVarArr = null;
                UserAddress userAddress5 = null;
                UserAddress userAddress6 = null;
                g8.d[] dVarArr2 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 2:
                            strH44 = q8.h(parcel, i29);
                            break;
                        case 3:
                            strH45 = q8.h(parcel, i29);
                            break;
                        case 4:
                            strArrI2 = q8.i(parcel, i29);
                            break;
                        case 5:
                            strH46 = q8.h(parcel, i29);
                            break;
                        case 6:
                            qVar4 = (q) q8.g(parcel, i29, q.CREATOR);
                            break;
                        case 7:
                            qVar5 = (q) q8.g(parcel, i29, q.CREATOR);
                            break;
                        case '\b':
                            fVarArr = (g8.f[]) q8.k(parcel, i29, g8.f.CREATOR);
                            break;
                        case '\t':
                            gVarArr = (g8.g[]) q8.k(parcel, i29, g8.g.CREATOR);
                            break;
                        case '\n':
                            userAddress5 = (UserAddress) q8.g(parcel, i29, UserAddress.CREATOR);
                            break;
                        case 11:
                            userAddress6 = (UserAddress) q8.g(parcel, i29, UserAddress.CREATOR);
                            break;
                        case '\f':
                            dVarArr2 = (g8.d[]) q8.k(parcel, i29, g8.d.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i29);
                            break;
                    }
                }
                q8.m(parcel, iZ20);
                MaskedWallet maskedWallet = new MaskedWallet();
                maskedWallet.f4379a = strH44;
                maskedWallet.f4380b = strH45;
                maskedWallet.f4381c = strArrI2;
                maskedWallet.d = strH46;
                maskedWallet.f4382e = qVar4;
                maskedWallet.f4383f = qVar5;
                maskedWallet.h = fVarArr;
                maskedWallet.f4384n = gVarArr;
                maskedWallet.f4385r = userAddress5;
                maskedWallet.f4386s = userAddress6;
                maskedWallet.v = dVarArr2;
                return maskedWallet;
            case 26:
                int iZ21 = q8.z(parcel);
                int iU18 = 0;
                String strH47 = null;
                String strH48 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < iZ21) {
                    int i30 = parcel.readInt();
                    char c20 = (char) i30;
                    if (c20 == 1) {
                        iU18 = q8.u(parcel, i30);
                    } else if (c20 == 2) {
                        strH47 = q8.h(parcel, i30);
                    } else if (c20 == 3) {
                        strH48 = q8.h(parcel, i30);
                    } else if (c20 != 4) {
                        q8.y(parcel, i30);
                    } else {
                        commonWalletObject = (CommonWalletObject) q8.g(parcel, i30, CommonWalletObject.CREATOR);
                    }
                }
                q8.m(parcel, iZ21);
                return new g8.g(iU18, strH47, strH48, commonWalletObject);
            case 27:
                int iZ22 = q8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iZ22) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        q8.y(parcel, i31);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(parcel, i31, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, iZ22);
                g8.h hVar = new g8.h();
                hVar.f6744a = pendingIntent;
                return hVar;
            case 28:
                return new h4.a(parcel);
            default:
                int iZ23 = q8.z(parcel);
                h5.d dVar2 = null;
                h5.a aVar = null;
                String strH49 = null;
                h5.c cVar4 = null;
                h5.b bVar4 = null;
                boolean zN12 = false;
                int iU19 = 0;
                boolean zN13 = false;
                while (parcel.dataPosition() < iZ23) {
                    int i32 = parcel.readInt();
                    switch ((char) i32) {
                        case 1:
                            dVar2 = (h5.d) q8.g(parcel, i32, h5.d.CREATOR);
                            break;
                        case 2:
                            aVar = (h5.a) q8.g(parcel, i32, h5.a.CREATOR);
                            break;
                        case 3:
                            strH49 = q8.h(parcel, i32);
                            break;
                        case 4:
                            zN12 = q8.n(parcel, i32);
                            break;
                        case 5:
                            iU19 = q8.u(parcel, i32);
                            break;
                        case 6:
                            cVar4 = (h5.c) q8.g(parcel, i32, h5.c.CREATOR);
                            break;
                        case 7:
                            bVar4 = (h5.b) q8.g(parcel, i32, h5.b.CREATOR);
                            break;
                        case '\b':
                            zN13 = q8.n(parcel, i32);
                            break;
                        default:
                            q8.y(parcel, i32);
                            break;
                    }
                }
                q8.m(parcel, iZ23);
                return new h5.e(dVar2, aVar, strH49, zN12, iU19, cVar4, bVar4, zN13);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f5880a) {
            case 0:
                return new f[i10];
            case 1:
                return new f8.a[i10];
            case 2:
                return new FaceParcel[i10];
            case 3:
                return new f8.b[i10];
            case 4:
                return new LandmarkParcel[i10];
            case 5:
                return new g4.a[i10];
            case 6:
                return new g4.e[i10];
            case 7:
                return new g4.f[i10];
            case 8:
                return new i[i10];
            case 9:
                return new j[i10];
            case 10:
                return new g8.i[i10];
            case 11:
                return new g8.j[i10];
            case 12:
                return new k[i10];
            case 13:
                return new l[i10];
            case 14:
                return new r[i10];
            case 15:
                return new m[i10];
            case 16:
                return new n[i10];
            case 17:
                return new s[i10];
            case 18:
                return new q[i10];
            case 19:
                return new g8.b[i10];
            case 20:
                return new g8.c[i10];
            case 21:
                return new FullWallet[i10];
            case 22:
                return new g8.d[i10];
            case 23:
                return new g8.e[i10];
            case 24:
                return new g8.f[i10];
            case 25:
                return new MaskedWallet[i10];
            case 26:
                return new g8.g[i10];
            case 27:
                return new g8.h[i10];
            case 28:
                return new h4.a[i10];
            default:
                return new h5.e[i10];
        }
    }
}
