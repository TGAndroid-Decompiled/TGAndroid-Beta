package h5;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wearable.ConnectionConfiguration;
import h7.q8;
import java.util.ArrayList;
import m.o0;
import n5.b0;
import n5.c0;
import n6.a1;
import n6.m0;
import n6.u;

public final class h implements Parcelable.Creator {

    public final int f8287a;

    public h(int i10) {
        this.f8287a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8287a) {
            case 0:
                int iZ = q8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        q8.y(parcel, i10);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(parcel, i10, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, iZ);
                return new f(pendingIntent);
            case 1:
                int iZ2 = q8.z(parcel);
                String strH = null;
                String strH2 = null;
                String strH3 = null;
                ArrayList arrayListJ = null;
                boolean zN = false;
                boolean zN2 = false;
                boolean zN3 = false;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            zN = q8.n(parcel, i11);
                            break;
                        case 2:
                            strH = q8.h(parcel, i11);
                            break;
                        case 3:
                            strH2 = q8.h(parcel, i11);
                            break;
                        case 4:
                            zN2 = q8.n(parcel, i11);
                            break;
                        case 5:
                            strH3 = q8.h(parcel, i11);
                            break;
                        case 6:
                            arrayListJ = q8.j(parcel, i11);
                            break;
                        case 7:
                            zN3 = q8.n(parcel, i11);
                            break;
                        default:
                            q8.y(parcel, i11);
                            break;
                    }
                }
                q8.m(parcel, iZ2);
                return new a(zN, strH, strH2, zN2, strH3, arrayListJ, zN3);
            case 2:
                int iZ3 = q8.z(parcel);
                String strH4 = null;
                boolean zN4 = false;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 1) {
                        zN4 = q8.n(parcel, i12);
                    } else if (c10 != 2) {
                        q8.y(parcel, i12);
                    } else {
                        strH4 = q8.h(parcel, i12);
                    }
                }
                q8.m(parcel, iZ3);
                return new b(strH4, zN4);
            case 3:
                int iZ4 = q8.z(parcel);
                byte[] bArrB = null;
                String strH5 = null;
                boolean zN5 = false;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        zN5 = q8.n(parcel, i13);
                    } else if (c11 == 2) {
                        bArrB = q8.b(parcel, i13);
                    } else if (c11 != 3) {
                        q8.y(parcel, i13);
                    } else {
                        strH5 = q8.h(parcel, i13);
                    }
                }
                q8.m(parcel, iZ4);
                return new c(zN5, bArrB, strH5);
            case 4:
                int iZ5 = q8.z(parcel);
                boolean zN6 = false;
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        q8.y(parcel, i14);
                    } else {
                        zN6 = q8.n(parcel, i14);
                    }
                }
                q8.m(parcel, iZ5);
                return new d(zN6);
            case 5:
                int iZ6 = q8.z(parcel);
                String strH6 = null;
                String strH7 = null;
                String strH8 = null;
                String strH9 = null;
                Uri uri = null;
                String strH10 = null;
                String strH11 = null;
                String strH12 = null;
                u uVar = null;
                while (parcel.dataPosition() < iZ6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            strH6 = q8.h(parcel, i15);
                            break;
                        case 2:
                            strH7 = q8.h(parcel, i15);
                            break;
                        case 3:
                            strH8 = q8.h(parcel, i15);
                            break;
                        case 4:
                            strH9 = q8.h(parcel, i15);
                            break;
                        case 5:
                            uri = (Uri) q8.g(parcel, i15, Uri.CREATOR);
                            break;
                        case 6:
                            strH10 = q8.h(parcel, i15);
                            break;
                        case 7:
                            strH11 = q8.h(parcel, i15);
                            break;
                        case '\b':
                            strH12 = q8.h(parcel, i15);
                            break;
                        case '\t':
                            uVar = (u) q8.g(parcel, i15, u.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i15);
                            break;
                    }
                }
                q8.m(parcel, iZ6);
                return new g(strH6, strH7, strH8, strH9, uri, strH10, strH11, strH12, uVar);
            case 6:
                int iZ7 = q8.z(parcel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                String strH13 = null;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String strH14 = null;
                String strH15 = null;
                h8.f fVar = null;
                String strH16 = null;
                String strH17 = null;
                String strH18 = null;
                String strH19 = null;
                String strH20 = null;
                String strH21 = null;
                String strH22 = null;
                int iU = 0;
                boolean zN7 = false;
                while (parcel.dataPosition() < iZ7) {
                    int i16 = parcel.readInt();
                    String str = strH15;
                    switch ((char) i16) {
                        case 2:
                            strH13 = q8.h(parcel, i16);
                            break;
                        case 3:
                            strH16 = q8.h(parcel, i16);
                            break;
                        case 4:
                            strH17 = q8.h(parcel, i16);
                            break;
                        case 5:
                            strH18 = q8.h(parcel, i16);
                            break;
                        case 6:
                            strH19 = q8.h(parcel, i16);
                            break;
                        case 7:
                            strH20 = q8.h(parcel, i16);
                            break;
                        case '\b':
                            strH21 = q8.h(parcel, i16);
                            break;
                        case '\t':
                            strH14 = q8.h(parcel, i16);
                            break;
                        case '\n':
                            iU = q8.u(parcel, i16);
                            break;
                        case 11:
                            arrayList = q8.l(parcel, i16, h8.h.CREATOR);
                            break;
                        case '\f':
                            fVar = (h8.f) q8.g(parcel, i16, h8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList2 = q8.l(parcel, i16, LatLng.CREATOR);
                            break;
                        case 14:
                            strH15 = q8.h(parcel, i16);
                            continue;
                        case 15:
                            strH22 = q8.h(parcel, i16);
                            break;
                        case 16:
                            arrayList3 = q8.l(parcel, i16, h8.b.CREATOR);
                            break;
                        case 17:
                            zN7 = q8.n(parcel, i16);
                            break;
                        case 18:
                            arrayList4 = q8.l(parcel, i16, h8.g.CREATOR);
                            break;
                        case 19:
                            arrayList5 = q8.l(parcel, i16, h8.e.CREATOR);
                            break;
                        case 20:
                            arrayList6 = q8.l(parcel, i16, h8.g.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i16);
                            break;
                    }
                    strH15 = str;
                }
                q8.m(parcel, iZ7);
                CommonWalletObject commonWalletObject = new CommonWalletObject();
                commonWalletObject.f4387a = strH13;
                commonWalletObject.f4388b = strH16;
                commonWalletObject.f4389c = strH17;
                commonWalletObject.d = strH18;
                commonWalletObject.f4390e = strH19;
                commonWalletObject.f4391f = strH20;
                commonWalletObject.h = strH21;
                commonWalletObject.f4392n = strH14;
                commonWalletObject.f4393r = iU;
                commonWalletObject.f4394s = arrayList;
                commonWalletObject.v = fVar;
                commonWalletObject.f4395w = arrayList2;
                commonWalletObject.f4396x = strH15;
                commonWalletObject.f4397y = strH22;
                commonWalletObject.A = arrayList3;
                commonWalletObject.B = zN7;
                commonWalletObject.C = arrayList4;
                commonWalletObject.D = arrayList5;
                commonWalletObject.E = arrayList6;
                return commonWalletObject;
            case 7:
                int iZ8 = q8.z(parcel);
                String strH23 = null;
                String strH24 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 2) {
                        strH23 = q8.h(parcel, i17);
                    } else if (c12 != 3) {
                        q8.y(parcel, i17);
                    } else {
                        strH24 = q8.h(parcel, i17);
                    }
                }
                q8.m(parcel, iZ8);
                h8.a aVar = new h8.a();
                aVar.f8594a = strH23;
                aVar.f8595b = strH24;
                return aVar;
            case 8:
                int iZ9 = q8.z(parcel);
                ArrayList arrayList7 = new ArrayList();
                String strH25 = null;
                String strH26 = null;
                while (parcel.dataPosition() < iZ9) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 2) {
                        strH25 = q8.h(parcel, i18);
                    } else if (c13 == 3) {
                        strH26 = q8.h(parcel, i18);
                    } else if (c13 != 4) {
                        q8.y(parcel, i18);
                    } else {
                        arrayList7 = q8.l(parcel, i18, h8.a.CREATOR);
                    }
                }
                q8.m(parcel, iZ9);
                h8.b bVar = new h8.b();
                bVar.f8596a = strH25;
                bVar.f8597b = strH26;
                bVar.f8598c = arrayList7;
                return bVar;
            case 9:
                int iZ10 = q8.z(parcel);
                int iU2 = 0;
                String strH27 = null;
                long jW = 0;
                int iU3 = -1;
                double dQ = 0.0d;
                String strH28 = null;
                while (parcel.dataPosition() < iZ10) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            iU2 = q8.u(parcel, i19);
                            break;
                        case 3:
                            strH27 = q8.h(parcel, i19);
                            break;
                        case 4:
                            dQ = q8.q(parcel, i19);
                            break;
                        case 5:
                            strH28 = q8.h(parcel, i19);
                            break;
                        case 6:
                            jW = q8.w(parcel, i19);
                            break;
                        case 7:
                            iU3 = q8.u(parcel, i19);
                            break;
                        default:
                            q8.y(parcel, i19);
                            break;
                    }
                }
                q8.m(parcel, iZ10);
                h8.d dVar = new h8.d();
                dVar.f8602a = iU2;
                dVar.f8603b = strH27;
                dVar.f8604c = dQ;
                dVar.d = strH28;
                dVar.f8605e = jW;
                dVar.f8606f = iU3;
                return dVar;
            case 10:
                int iZ11 = q8.z(parcel);
                String strH29 = null;
                h8.d dVar2 = null;
                h8.f fVar2 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i20 = parcel.readInt();
                    char c14 = (char) i20;
                    if (c14 == 2) {
                        strH29 = q8.h(parcel, i20);
                    } else if (c14 == 3) {
                        dVar2 = (h8.d) q8.g(parcel, i20, h8.d.CREATOR);
                    } else if (c14 != 5) {
                        q8.y(parcel, i20);
                    } else {
                        fVar2 = (h8.f) q8.g(parcel, i20, h8.f.CREATOR);
                    }
                }
                q8.m(parcel, iZ11);
                h8.c cVar = new h8.c();
                cVar.f8599a = strH29;
                cVar.f8600b = dVar2;
                cVar.f8601c = fVar2;
                return cVar;
            case 11:
                int iZ12 = q8.z(parcel);
                String strH30 = null;
                String strH31 = null;
                while (parcel.dataPosition() < iZ12) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 2) {
                        strH30 = q8.h(parcel, i21);
                    } else if (c15 != 3) {
                        q8.y(parcel, i21);
                    } else {
                        strH31 = q8.h(parcel, i21);
                    }
                }
                q8.m(parcel, iZ12);
                h8.e eVar = new h8.e();
                eVar.f8607a = strH30;
                eVar.f8608b = strH31;
                return eVar;
            case 12:
                int iZ13 = q8.z(parcel);
                long jW2 = 0;
                long jW3 = 0;
                while (parcel.dataPosition() < iZ13) {
                    int i22 = parcel.readInt();
                    char c16 = (char) i22;
                    if (c16 == 2) {
                        jW2 = q8.w(parcel, i22);
                    } else if (c16 != 3) {
                        q8.y(parcel, i22);
                    } else {
                        jW3 = q8.w(parcel, i22);
                    }
                }
                q8.m(parcel, iZ13);
                h8.f fVar3 = new h8.f();
                fVar3.f8609a = jW2;
                fVar3.f8610b = jW3;
                return fVar3;
            case 13:
                int iZ14 = q8.z(parcel);
                String strH32 = null;
                String strH33 = null;
                while (parcel.dataPosition() < iZ14) {
                    int i23 = parcel.readInt();
                    char c17 = (char) i23;
                    if (c17 == 2) {
                        strH32 = q8.h(parcel, i23);
                    } else if (c17 != 3) {
                        q8.y(parcel, i23);
                    } else {
                        strH33 = q8.h(parcel, i23);
                    }
                }
                q8.m(parcel, iZ14);
                h8.g gVar = new h8.g();
                gVar.f8611a = strH32;
                gVar.f8612b = strH33;
                return gVar;
            case 14:
                int iZ15 = q8.z(parcel);
                String strH34 = null;
                String strH35 = null;
                h8.f fVar4 = null;
                h8.g gVar2 = null;
                h8.g gVar3 = null;
                while (parcel.dataPosition() < iZ15) {
                    int i24 = parcel.readInt();
                    char c18 = (char) i24;
                    if (c18 == 2) {
                        strH34 = q8.h(parcel, i24);
                    } else if (c18 == 3) {
                        strH35 = q8.h(parcel, i24);
                    } else if (c18 == 4) {
                        fVar4 = (h8.f) q8.g(parcel, i24, h8.f.CREATOR);
                    } else if (c18 == 5) {
                        gVar2 = (h8.g) q8.g(parcel, i24, h8.g.CREATOR);
                    } else if (c18 != 6) {
                        q8.y(parcel, i24);
                    } else {
                        gVar3 = (h8.g) q8.g(parcel, i24, h8.g.CREATOR);
                    }
                }
                q8.m(parcel, iZ15);
                h8.h hVar = new h8.h();
                hVar.f8613a = strH34;
                hVar.f8614b = strH35;
                hVar.f8615c = fVar4;
                hVar.d = gVar2;
                hVar.f8616e = gVar3;
                return hVar;
            case 15:
                return new i4.b(parcel);
            case 16:
                int iZ16 = q8.z(parcel);
                String strH36 = null;
                String strH37 = null;
                String strH38 = null;
                String strH39 = null;
                String strH40 = null;
                ArrayList arrayListJ2 = null;
                int iU4 = 0;
                int iU5 = 0;
                boolean zN8 = false;
                boolean zN9 = false;
                boolean zN10 = false;
                int iU6 = 0;
                while (parcel.dataPosition() < iZ16) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            strH36 = q8.h(parcel, i25);
                            break;
                        case 3:
                            strH37 = q8.h(parcel, i25);
                            break;
                        case 4:
                            iU4 = q8.u(parcel, i25);
                            break;
                        case 5:
                            iU5 = q8.u(parcel, i25);
                            break;
                        case 6:
                            zN8 = q8.n(parcel, i25);
                            break;
                        case 7:
                            zN9 = q8.n(parcel, i25);
                            break;
                        case '\b':
                            strH38 = q8.h(parcel, i25);
                            break;
                        case '\t':
                            zN10 = q8.n(parcel, i25);
                            break;
                        case '\n':
                            strH39 = q8.h(parcel, i25);
                            break;
                        case 11:
                            strH40 = q8.h(parcel, i25);
                            break;
                        case '\f':
                            iU6 = q8.u(parcel, i25);
                            break;
                        case '\r':
                            arrayListJ2 = q8.j(parcel, i25);
                            break;
                        default:
                            q8.y(parcel, i25);
                            break;
                    }
                }
                q8.m(parcel, iZ16);
                return new ConnectionConfiguration(strH36, strH37, iU4, iU5, zN8, zN9, strH38, zN10, strH39, strH40, iU6, arrayListJ2);
            case 17:
                int iZ17 = q8.z(parcel);
                Bundle bundleA = null;
                int iU7 = 0;
                int iU8 = 0;
                while (parcel.dataPosition() < iZ17) {
                    int i26 = parcel.readInt();
                    char c19 = (char) i26;
                    if (c19 == 1) {
                        iU7 = q8.u(parcel, i26);
                    } else if (c19 == 2) {
                        iU8 = q8.u(parcel, i26);
                    } else if (c19 != 3) {
                        q8.y(parcel, i26);
                    } else {
                        bundleA = q8.a(parcel, i26);
                    }
                }
                q8.m(parcel, iZ17);
                return new k5.a(iU7, iU8, bundleA);
            case 18:
                int iZ18 = q8.z(parcel);
                String strH41 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iZ18) {
                    int i27 = parcel.readInt();
                    char c20 = (char) i27;
                    if (c20 == 2) {
                        strH41 = q8.h(parcel, i27);
                    } else if (c20 != 5) {
                        q8.y(parcel, i27);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) q8.g(parcel, i27, GoogleSignInOptions.CREATOR);
                    }
                }
                q8.m(parcel, iZ18);
                return new SignInConfiguration(strH41, googleSignInOptions);
            case 19:
                return new ParcelImpl(parcel);
            case 20:
                return new l3.d(parcel);
            case 21:
                return new l3.c(parcel);
            case 22:
                try {
                    return Transport.a(parcel.readString());
                } catch (l6.a e9) {
                    throw new RuntimeException(e9);
                }
            case 23:
                o0 o0Var = new o0(parcel);
                o0Var.f17397a = parcel.readByte() != 0;
                return o0Var;
            case 24:
                int iZ19 = q8.z(parcel);
                boolean zN11 = false;
                while (parcel.dataPosition() < iZ19) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 2) {
                        q8.y(parcel, i28);
                    } else {
                        zN11 = q8.n(parcel, i28);
                    }
                }
                q8.m(parcel, iZ19);
                return new b0(zN11);
            case 25:
                int iZ20 = q8.z(parcel);
                int iU9 = 0;
                while (parcel.dataPosition() < iZ20) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 2) {
                        q8.y(parcel, i29);
                    } else {
                        iU9 = q8.u(parcel, i29);
                    }
                }
                q8.m(parcel, iZ20);
                return new c0(iU9);
            case 26:
                int iZ21 = q8.z(parcel);
                String strH42 = null;
                ArrayList arrayListJ3 = null;
                m5.i iVar = null;
                o5.a aVar2 = null;
                ArrayList arrayListJ4 = null;
                b0 b0Var = null;
                c0 c0Var = null;
                double dQ2 = 0.0d;
                boolean zN12 = false;
                boolean zN13 = false;
                boolean zN14 = false;
                boolean zN15 = false;
                boolean zN16 = false;
                boolean zN17 = false;
                boolean zN18 = false;
                boolean zN19 = false;
                while (parcel.dataPosition() < iZ21) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            strH42 = q8.h(parcel, i30);
                            break;
                        case 3:
                            arrayListJ3 = q8.j(parcel, i30);
                            break;
                        case 4:
                            zN12 = q8.n(parcel, i30);
                            break;
                        case 5:
                            iVar = (m5.i) q8.g(parcel, i30, m5.i.CREATOR);
                            break;
                        case 6:
                            zN13 = q8.n(parcel, i30);
                            break;
                        case 7:
                            aVar2 = (o5.a) q8.g(parcel, i30, o5.a.CREATOR);
                            break;
                        case '\b':
                            zN14 = q8.n(parcel, i30);
                            break;
                        case '\t':
                            dQ2 = q8.q(parcel, i30);
                            break;
                        case '\n':
                            zN15 = q8.n(parcel, i30);
                            break;
                        case 11:
                            zN16 = q8.n(parcel, i30);
                            break;
                        case '\f':
                            zN17 = q8.n(parcel, i30);
                            break;
                        case '\r':
                            arrayListJ4 = q8.j(parcel, i30);
                            break;
                        case 14:
                            zN18 = q8.n(parcel, i30);
                            break;
                        case 15:
                            q8.u(parcel, i30);
                            break;
                        case 16:
                            zN19 = q8.n(parcel, i30);
                            break;
                        case 17:
                            b0Var = (b0) q8.g(parcel, i30, b0.CREATOR);
                            break;
                        case 18:
                            c0Var = (c0) q8.g(parcel, i30, c0.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i30);
                            break;
                    }
                }
                q8.m(parcel, iZ21);
                return new n5.b(strH42, arrayListJ3, zN12, iVar, zN13, aVar2, zN14, dQ2, zN15, zN16, zN17, arrayListJ4, zN18, zN19, b0Var, c0Var);
            case 27:
                try {
                    return n6.c.a(parcel.readString());
                } catch (n6.b e10) {
                    throw new RuntimeException(e10);
                }
            case 28:
                int iZ22 = q8.z(parcel);
                boolean zN20 = false;
                while (parcel.dataPosition() < iZ22) {
                    int i31 = parcel.readInt();
                    if (((char) i31) != 1) {
                        q8.y(parcel, i31);
                    } else {
                        zN20 = q8.n(parcel, i31);
                    }
                }
                q8.m(parcel, iZ22);
                return new a1(zN20);
            default:
                int iZ23 = q8.z(parcel);
                long jW4 = 0;
                while (parcel.dataPosition() < iZ23) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        q8.y(parcel, i32);
                    } else {
                        jW4 = q8.w(parcel, i32);
                    }
                }
                q8.m(parcel, iZ23);
                return new m0(jW4);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f8287a) {
            case 0:
                return new f[i10];
            case 1:
                return new a[i10];
            case 2:
                return new b[i10];
            case 3:
                return new c[i10];
            case 4:
                return new d[i10];
            case 5:
                return new g[i10];
            case 6:
                return new CommonWalletObject[i10];
            case 7:
                return new h8.a[i10];
            case 8:
                return new h8.b[i10];
            case 9:
                return new h8.d[i10];
            case 10:
                return new h8.c[i10];
            case 11:
                return new h8.e[i10];
            case 12:
                return new h8.f[i10];
            case 13:
                return new h8.g[i10];
            case 14:
                return new h8.h[i10];
            case 15:
                return new i4.b[i10];
            case 16:
                return new ConnectionConfiguration[i10];
            case 17:
                return new k5.a[i10];
            case 18:
                return new SignInConfiguration[i10];
            case 19:
                return new ParcelImpl[i10];
            case 20:
                return new l3.d[i10];
            case 21:
                return new l3.c[i10];
            case 22:
                return new Transport[i10];
            case 23:
                return new o0[i10];
            case 24:
                return new b0[i10];
            case 25:
                return new c0[i10];
            case 26:
                return new n5.b[i10];
            case 27:
                return new n6.c[i10];
            case 28:
                return new a1[i10];
            default:
                return new m0[i10];
        }
    }
}
