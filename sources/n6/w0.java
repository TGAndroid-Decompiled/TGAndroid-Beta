package n6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.widget.RemoteViews;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import h7.q8;
import java.util.ArrayList;

public final class w0 implements Parcelable.Creator {

    public final int f18433a;

    public w0(int i10) {
        this.f18433a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f18433a) {
            case 0:
                try {
                    return o.a(parcel.readInt());
                } catch (n e9) {
                    throw new RuntimeException(e9);
                }
            case 1:
                int iZ = q8.z(parcel);
                byte[] bArrB = null;
                byte[] bArrB2 = null;
                byte[] bArrB3 = null;
                long jW = 0;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 1) {
                        jW = q8.w(parcel, i10);
                    } else if (c10 == 2) {
                        bArrB = q8.b(parcel, i10);
                    } else if (c10 == 3) {
                        bArrB2 = q8.b(parcel, i10);
                    } else if (c10 != 4) {
                        q8.y(parcel, i10);
                    } else {
                        bArrB3 = q8.b(parcel, i10);
                    }
                }
                q8.m(parcel, iZ);
                return new x0(jW, bArrB, bArrB2, bArrB3);
            case 2:
                int iZ2 = q8.z(parcel);
                ArrayList arrayListL = null;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        q8.y(parcel, i11);
                    } else {
                        arrayListL = q8.l(parcel, i11, x0.CREATOR);
                    }
                }
                q8.m(parcel, iZ2);
                return new y0(arrayListL);
            case 3:
                int iZ3 = q8.z(parcel);
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        q8.y(parcel, i12);
                    } else {
                        q8.n(parcel, i12);
                    }
                }
                q8.m(parcel, iZ3);
                return new z0();
            case 4:
                try {
                    return r.a(parcel.readInt());
                } catch (q e10) {
                    throw new IllegalArgumentException(e10);
                }
            case 5:
                int iZ4 = q8.z(parcel);
                String strH = null;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        q8.y(parcel, i13);
                    } else {
                        strH = q8.h(parcel, i13);
                    }
                }
                q8.m(parcel, iZ4);
                return new s(strH);
            case 6:
                int iZ5 = q8.z(parcel);
                String strH2 = null;
                String strH3 = null;
                IBinder iBinderT = null;
                o5.f fVar = null;
                boolean zN = false;
                boolean zN2 = false;
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strH2 = q8.h(parcel, i14);
                            break;
                        case 3:
                            strH3 = q8.h(parcel, i14);
                            break;
                        case 4:
                            iBinderT = q8.t(parcel, i14);
                            break;
                        case 5:
                            fVar = (o5.f) q8.g(parcel, i14, o5.f.CREATOR);
                            break;
                        case 6:
                            zN = q8.n(parcel, i14);
                            break;
                        case 7:
                            zN2 = q8.n(parcel, i14);
                            break;
                        default:
                            q8.y(parcel, i14);
                            break;
                    }
                }
                q8.m(parcel, iZ5);
                return new o5.a(strH2, strH3, iBinderT, fVar, zN, zN2);
            case 7:
                int iZ6 = q8.z(parcel);
                ArrayList arrayListJ = null;
                int[] iArrD = null;
                String strH4 = null;
                IBinder iBinderT2 = null;
                long jW2 = 0;
                int iU = 0;
                int iU2 = 0;
                int iU3 = 0;
                int iU4 = 0;
                int iU5 = 0;
                int iU6 = 0;
                int iU7 = 0;
                int iU8 = 0;
                int iU9 = 0;
                int iU10 = 0;
                int iU11 = 0;
                int iU12 = 0;
                int iU13 = 0;
                int iU14 = 0;
                int iU15 = 0;
                int iU16 = 0;
                int iU17 = 0;
                int iU18 = 0;
                int iU19 = 0;
                int iU20 = 0;
                int iU21 = 0;
                int iU22 = 0;
                int iU23 = 0;
                int iU24 = 0;
                int iU25 = 0;
                int iU26 = 0;
                int iU27 = 0;
                boolean zN3 = false;
                boolean zN4 = false;
                while (parcel.dataPosition() < iZ6) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            arrayListJ = q8.j(parcel, i15);
                            break;
                        case 3:
                            iArrD = q8.d(parcel, i15);
                            break;
                        case 4:
                            jW2 = q8.w(parcel, i15);
                            break;
                        case 5:
                            strH4 = q8.h(parcel, i15);
                            break;
                        case 6:
                            iU = q8.u(parcel, i15);
                            break;
                        case 7:
                            iU2 = q8.u(parcel, i15);
                            break;
                        case '\b':
                            iU3 = q8.u(parcel, i15);
                            break;
                        case '\t':
                            iU4 = q8.u(parcel, i15);
                            break;
                        case '\n':
                            iU5 = q8.u(parcel, i15);
                            break;
                        case 11:
                            iU6 = q8.u(parcel, i15);
                            break;
                        case '\f':
                            iU7 = q8.u(parcel, i15);
                            break;
                        case '\r':
                            iU8 = q8.u(parcel, i15);
                            break;
                        case 14:
                            iU9 = q8.u(parcel, i15);
                            break;
                        case 15:
                            iU10 = q8.u(parcel, i15);
                            break;
                        case 16:
                            iU11 = q8.u(parcel, i15);
                            break;
                        case 17:
                            iU12 = q8.u(parcel, i15);
                            break;
                        case 18:
                            iU13 = q8.u(parcel, i15);
                            break;
                        case 19:
                            iU14 = q8.u(parcel, i15);
                            break;
                        case 20:
                            iU15 = q8.u(parcel, i15);
                            break;
                        case 21:
                            iU16 = q8.u(parcel, i15);
                            break;
                        case 22:
                            iU17 = q8.u(parcel, i15);
                            break;
                        case 23:
                            iU18 = q8.u(parcel, i15);
                            break;
                        case 24:
                            iU19 = q8.u(parcel, i15);
                            break;
                        case 25:
                            iU20 = q8.u(parcel, i15);
                            break;
                        case 26:
                            iU21 = q8.u(parcel, i15);
                            break;
                        case 27:
                            iU22 = q8.u(parcel, i15);
                            break;
                        case 28:
                            iU23 = q8.u(parcel, i15);
                            break;
                        case 29:
                            iU24 = q8.u(parcel, i15);
                            break;
                        case 30:
                            iU25 = q8.u(parcel, i15);
                            break;
                        case 31:
                            iU26 = q8.u(parcel, i15);
                            break;
                        case ' ':
                            iU27 = q8.u(parcel, i15);
                            break;
                        case '!':
                            iBinderT2 = q8.t(parcel, i15);
                            break;
                        case '\"':
                            zN3 = q8.n(parcel, i15);
                            break;
                        case '#':
                            zN4 = q8.n(parcel, i15);
                            break;
                        default:
                            q8.y(parcel, i15);
                            break;
                    }
                }
                q8.m(parcel, iZ6);
                return new o5.f(arrayListJ, iArrD, jW2, strH4, iU, iU2, iU3, iU4, iU5, iU6, iU7, iU8, iU9, iU10, iU11, iU12, iU13, iU14, iU15, iU16, iU17, iU18, iU19, iU20, iU21, iU22, iU23, iU24, iU25, iU26, iU27, iBinderT2, zN3, zN4);
            case 8:
                int iZ7 = q8.z(parcel);
                int iU28 = 0;
                int iU29 = 0;
                int iU30 = 0;
                while (parcel.dataPosition() < iZ7) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 2) {
                        iU28 = q8.u(parcel, i16);
                    } else if (c11 == 3) {
                        iU29 = q8.u(parcel, i16);
                    } else if (c11 != 4) {
                        q8.y(parcel, i16);
                    } else {
                        iU30 = q8.u(parcel, i16);
                    }
                }
                q8.m(parcel, iZ7);
                return new o5.b(iU28, iU29, iU30);
            case 9:
                int iZ8 = q8.z(parcel);
                String strH5 = null;
                String strH6 = null;
                int iU31 = 0;
                while (parcel.dataPosition() < iZ8) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 2) {
                        strH5 = q8.h(parcel, i17);
                    } else if (c12 == 3) {
                        iU31 = q8.u(parcel, i17);
                    } else if (c12 != 4) {
                        q8.y(parcel, i17);
                    } else {
                        strH6 = q8.h(parcel, i17);
                    }
                }
                q8.m(parcel, iZ8);
                return new o5.d(strH5, iU31, strH6);
            case 10:
                int iZ9 = q8.z(parcel);
                byte[] bArrB4 = null;
                while (parcel.dataPosition() < iZ9) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 2) {
                        q8.y(parcel, i18);
                    } else {
                        bArrB4 = q8.b(parcel, i18);
                    }
                }
                q8.m(parcel, iZ9);
                return new p7.d(bArrB4);
            case 11:
                int iZ10 = q8.z(parcel);
                byte[] bArrB5 = null;
                while (parcel.dataPosition() < iZ10) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        q8.y(parcel, i19);
                    } else {
                        bArrB5 = q8.b(parcel, i19);
                    }
                }
                q8.m(parcel, iZ10);
                return new p7.e(bArrB5);
            case 12:
                int iZ11 = q8.z(parcel);
                byte[] bArrB6 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 1) {
                        q8.y(parcel, i20);
                    } else {
                        bArrB6 = q8.b(parcel, i20);
                    }
                }
                q8.m(parcel, iZ11);
                return new p7.f(bArrB6);
            case 13:
                int iZ12 = q8.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < iZ12) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        q8.y(parcel, i21);
                    } else {
                        pendingIntent = (PendingIntent) q8.g(parcel, i21, PendingIntent.CREATOR);
                    }
                }
                q8.m(parcel, iZ12);
                return new p7.g(pendingIntent);
            case 14:
                int iZ13 = q8.z(parcel);
                String[] strArrI = null;
                int[] iArrD2 = null;
                RemoteViews remoteViews = null;
                byte[] bArrB7 = null;
                while (parcel.dataPosition() < iZ13) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 1) {
                        strArrI = q8.i(parcel, i22);
                    } else if (c13 == 2) {
                        iArrD2 = q8.d(parcel, i22);
                    } else if (c13 == 3) {
                        remoteViews = (RemoteViews) q8.g(parcel, i22, RemoteViews.CREATOR);
                    } else if (c13 != 4) {
                        q8.y(parcel, i22);
                    } else {
                        bArrB7 = q8.b(parcel, i22);
                    }
                }
                q8.m(parcel, iZ13);
                p7.h hVar = new p7.h();
                hVar.f45515a = strArrI;
                hVar.f45516b = iArrD2;
                hVar.f45517c = remoteViews;
                hVar.d = bArrB7;
                return hVar;
            case 15:
                int iZ14 = q8.z(parcel);
                String strH7 = null;
                String strH8 = null;
                String strH9 = null;
                String strH10 = null;
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
                boolean zN5 = false;
                while (parcel.dataPosition() < iZ14) {
                    int i23 = parcel.readInt();
                    boolean z10 = zN5;
                    switch ((char) i23) {
                        case 2:
                            strH7 = q8.h(parcel, i23);
                            break;
                        case 3:
                            strH8 = q8.h(parcel, i23);
                            break;
                        case 4:
                            strH9 = q8.h(parcel, i23);
                            break;
                        case 5:
                            strH10 = q8.h(parcel, i23);
                            break;
                        case 6:
                            strH11 = q8.h(parcel, i23);
                            break;
                        case 7:
                            strH12 = q8.h(parcel, i23);
                            break;
                        case '\b':
                            strH13 = q8.h(parcel, i23);
                            break;
                        case '\t':
                            strH14 = q8.h(parcel, i23);
                            break;
                        case '\n':
                            strH15 = q8.h(parcel, i23);
                            break;
                        case 11:
                            strH16 = q8.h(parcel, i23);
                            break;
                        case '\f':
                            strH17 = q8.h(parcel, i23);
                            break;
                        case '\r':
                            strH18 = q8.h(parcel, i23);
                            break;
                        case 14:
                            zN5 = q8.n(parcel, i23);
                            continue;
                        case 15:
                            strH20 = q8.h(parcel, i23);
                            break;
                        case 16:
                            strH19 = q8.h(parcel, i23);
                            break;
                        default:
                            q8.y(parcel, i23);
                            break;
                    }
                    zN5 = z10;
                }
                q8.m(parcel, iZ14);
                UserAddress userAddress = new UserAddress();
                userAddress.f3412a = strH7;
                userAddress.f3413b = strH8;
                userAddress.f3414c = strH9;
                userAddress.d = strH10;
                userAddress.f3415e = strH11;
                userAddress.f3416f = strH12;
                userAddress.h = strH13;
                userAddress.f3417n = strH14;
                userAddress.f3418r = strH15;
                userAddress.f3419s = strH16;
                userAddress.v = strH17;
                userAddress.f3420w = strH18;
                userAddress.f3421x = zN5;
                userAddress.f3422y = strH20;
                userAddress.A = strH19;
                return userAddress;
            case 16:
                int iZ15 = q8.z(parcel);
                int iU32 = 0;
                boolean zN6 = false;
                boolean zN7 = false;
                while (parcel.dataPosition() < iZ15) {
                    int i24 = parcel.readInt();
                    char c14 = (char) i24;
                    if (c14 == 2) {
                        iU32 = q8.u(parcel, i24);
                    } else if (c14 == 3) {
                        zN6 = q8.n(parcel, i24);
                    } else if (c14 != 4) {
                        q8.y(parcel, i24);
                    } else {
                        zN7 = q8.n(parcel, i24);
                    }
                }
                q8.m(parcel, iZ15);
                return new r5.y(iU32, zN6, zN7);
            case 17:
                int iZ16 = q8.z(parcel);
                double dQ = 0.0d;
                m5.d dVar = null;
                m5.y yVar = null;
                boolean zN8 = false;
                int iU33 = 0;
                int iU34 = 0;
                double dQ2 = 0.0d;
                while (parcel.dataPosition() < iZ16) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            dQ = q8.q(parcel, i25);
                            break;
                        case 3:
                            zN8 = q8.n(parcel, i25);
                            break;
                        case 4:
                            iU33 = q8.u(parcel, i25);
                            break;
                        case 5:
                            dVar = (m5.d) q8.g(parcel, i25, m5.d.CREATOR);
                            break;
                        case 6:
                            iU34 = q8.u(parcel, i25);
                            break;
                        case 7:
                            yVar = (m5.y) q8.g(parcel, i25, m5.y.CREATOR);
                            break;
                        case '\b':
                            dQ2 = q8.q(parcel, i25);
                            break;
                        default:
                            q8.y(parcel, i25);
                            break;
                    }
                }
                q8.m(parcel, iZ16);
                r5.d dVar2 = new r5.d();
                dVar2.f46772a = dQ;
                dVar2.f46773b = zN8;
                dVar2.f46774c = iU33;
                dVar2.d = dVar;
                dVar2.f46775e = iU34;
                dVar2.f46776f = yVar;
                dVar2.h = dQ2;
                return dVar2;
            case 18:
                int iZ17 = q8.z(parcel);
                String strH21 = null;
                while (parcel.dataPosition() < iZ17) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 2) {
                        q8.y(parcel, i26);
                    } else {
                        strH21 = q8.h(parcel, i26);
                    }
                }
                q8.m(parcel, iZ17);
                return new r5.c(strH21);
            case 19:
                int iZ18 = q8.z(parcel);
                boolean zN9 = false;
                while (parcel.dataPosition() < iZ18) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        q8.y(parcel, i27);
                    } else {
                        zN9 = q8.n(parcel, i27);
                    }
                }
                q8.m(parcel, iZ18);
                return new r6.a(zN9);
            case 20:
                int iZ19 = q8.z(parcel);
                while (parcel.dataPosition() < iZ19) {
                    q8.y(parcel, parcel.readInt());
                }
                q8.m(parcel, iZ19);
                return new r6.b();
            case 21:
                int iZ20 = q8.z(parcel);
                boolean zN10 = false;
                while (parcel.dataPosition() < iZ20) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        q8.y(parcel, i28);
                    } else {
                        zN10 = q8.n(parcel, i28);
                    }
                }
                q8.m(parcel, iZ20);
                return new r6.c(zN10);
            case 22:
                int iZ21 = q8.z(parcel);
                boolean zN11 = false;
                while (parcel.dataPosition() < iZ21) {
                    int i29 = parcel.readInt();
                    if (((char) i29) != 1) {
                        q8.y(parcel, i29);
                    } else {
                        zN11 = q8.n(parcel, i29);
                    }
                }
                q8.m(parcel, iZ21);
                return new r6.d(zN11);
            case 23:
                int iZ22 = q8.z(parcel);
                PendingIntent pendingIntent2 = null;
                r6.g gVar = null;
                while (parcel.dataPosition() < iZ22) {
                    int i30 = parcel.readInt();
                    char c15 = (char) i30;
                    if (c15 == 1) {
                        pendingIntent2 = (PendingIntent) q8.g(parcel, i30, PendingIntent.CREATOR);
                    } else if (c15 != 2) {
                        q8.y(parcel, i30);
                    } else {
                        gVar = (r6.g) q8.g(parcel, i30, r6.g.CREATOR);
                    }
                }
                q8.m(parcel, iZ22);
                return new r6.e(pendingIntent2, gVar);
            case 24:
                int iZ23 = q8.z(parcel);
                String strH22 = null;
                Bundle bundleA = null;
                Bundle bundleA2 = null;
                String strH23 = null;
                String strH24 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iZ23) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 1:
                            strH22 = q8.h(parcel, i31);
                            break;
                        case 2:
                            bundleA = q8.a(parcel, i31);
                            break;
                        case 3:
                            bundleA2 = q8.a(parcel, i31);
                            break;
                        case 4:
                            strH23 = q8.h(parcel, i31);
                            break;
                        case 5:
                            strH24 = q8.h(parcel, i31);
                            break;
                        case 6:
                            resultReceiver = (ResultReceiver) q8.g(parcel, i31, ResultReceiver.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i31);
                            break;
                    }
                }
                q8.m(parcel, iZ23);
                return new r6.f(strH22, bundleA, bundleA2, strH23, strH24, resultReceiver);
            case 25:
                int iZ24 = q8.z(parcel);
                String strH25 = null;
                Bundle bundleA3 = null;
                while (parcel.dataPosition() < iZ24) {
                    int i32 = parcel.readInt();
                    char c16 = (char) i32;
                    if (c16 == 1) {
                        strH25 = q8.h(parcel, i32);
                    } else if (c16 != 2) {
                        q8.y(parcel, i32);
                    } else {
                        bundleA3 = q8.a(parcel, i32);
                    }
                }
                q8.m(parcel, iZ24);
                return new r6.g(strH25, bundleA3);
            case 26:
                int iZ25 = q8.z(parcel);
                String strH26 = "";
                String strH27 = strH26;
                String strH28 = strH27;
                Bundle bundleA4 = null;
                Bundle bundleA5 = null;
                String strH29 = null;
                while (parcel.dataPosition() < iZ25) {
                    int i33 = parcel.readInt();
                    switch ((char) i33) {
                        case 1:
                            strH26 = q8.h(parcel, i33);
                            break;
                        case 2:
                            bundleA4 = q8.a(parcel, i33);
                            break;
                        case 3:
                            bundleA5 = q8.a(parcel, i33);
                            break;
                        case 4:
                            strH29 = q8.h(parcel, i33);
                            break;
                        case 5:
                            strH27 = q8.h(parcel, i33);
                            break;
                        case 6:
                            strH28 = q8.h(parcel, i33);
                            break;
                        default:
                            q8.y(parcel, i33);
                            break;
                    }
                }
                q8.m(parcel, iZ25);
                return new r6.h(strH26, bundleA4, bundleA5, strH29, strH27, strH28);
            case 27:
                int iZ26 = q8.z(parcel);
                Bundle bundleA6 = null;
                while (parcel.dataPosition() < iZ26) {
                    int i34 = parcel.readInt();
                    if (((char) i34) != 1) {
                        q8.y(parcel, i34);
                    } else {
                        bundleA6 = q8.a(parcel, i34);
                    }
                }
                q8.m(parcel, iZ26);
                return new r6.i(bundleA6);
            case 28:
                int iZ27 = q8.z(parcel);
                Bundle bundleA7 = null;
                while (parcel.dataPosition() < iZ27) {
                    int i35 = parcel.readInt();
                    if (((char) i35) != 1) {
                        q8.y(parcel, i35);
                    } else {
                        bundleA7 = q8.a(parcel, i35);
                    }
                }
                q8.m(parcel, iZ27);
                return new r6.j(bundleA7);
            default:
                int iZ28 = q8.z(parcel);
                ArrayList arrayListL2 = null;
                Bundle bundleA8 = null;
                String strH30 = null;
                ResultReceiver resultReceiver2 = null;
                while (parcel.dataPosition() < iZ28) {
                    int i36 = parcel.readInt();
                    char c17 = (char) i36;
                    if (c17 == 1) {
                        arrayListL2 = q8.l(parcel, i36, r6.h.CREATOR);
                    } else if (c17 == 2) {
                        bundleA8 = q8.a(parcel, i36);
                    } else if (c17 == 3) {
                        strH30 = q8.h(parcel, i36);
                    } else if (c17 != 4) {
                        q8.y(parcel, i36);
                    } else {
                        resultReceiver2 = (ResultReceiver) q8.g(parcel, i36, ResultReceiver.CREATOR);
                    }
                }
                q8.m(parcel, iZ28);
                return new GetCredentialRequest(arrayListL2, bundleA8, strH30, resultReceiver2);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f18433a) {
            case 0:
                return new o[i10];
            case 1:
                return new x0[i10];
            case 2:
                return new y0[i10];
            case 3:
                return new z0[i10];
            case 4:
                return new r[i10];
            case 5:
                return new s[i10];
            case 6:
                return new o5.a[i10];
            case 7:
                return new o5.f[i10];
            case 8:
                return new o5.b[i10];
            case 9:
                return new o5.d[i10];
            case 10:
                return new p7.d[i10];
            case 11:
                return new p7.e[i10];
            case 12:
                return new p7.f[i10];
            case 13:
                return new p7.g[i10];
            case 14:
                return new p7.h[i10];
            case 15:
                return new UserAddress[i10];
            case 16:
                return new r5.y[i10];
            case 17:
                return new r5.d[i10];
            case 18:
                return new r5.c[i10];
            case 19:
                return new r6.a[i10];
            case 20:
                return new r6.b[i10];
            case 21:
                return new r6.c[i10];
            case 22:
                return new r6.d[i10];
            case 23:
                return new r6.e[i10];
            case 24:
                return new r6.f[i10];
            case 25:
                return new r6.g[i10];
            case 26:
                return new r6.h[i10];
            case 27:
                return new r6.i[i10];
            case 28:
                return new r6.j[i10];
            default:
                return new GetCredentialRequest[i10];
        }
    }
}
