package j8;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import h7.q8;
import java.util.ArrayList;

public final class c implements Parcelable.Creator {

    public final int f12754a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f12754a) {
            case 0:
                int iZ = q8.z(parcel);
                String strH = null;
                ArrayList arrayListL = null;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 2) {
                        strH = q8.h(parcel, i10);
                    } else if (c10 != 3) {
                        q8.y(parcel, i10);
                    } else {
                        arrayListL = q8.l(parcel, i10, m0.CREATOR);
                    }
                }
                q8.m(parcel, iZ);
                return new b(strH, arrayListL);
            case 1:
                int iZ2 = q8.z(parcel);
                f fVar = null;
                int iU = 0;
                int iU2 = 0;
                int iU3 = 0;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    char c11 = (char) i11;
                    if (c11 == 2) {
                        fVar = (f) q8.g(parcel, i11, f.CREATOR);
                    } else if (c11 == 3) {
                        iU = q8.u(parcel, i11);
                    } else if (c11 == 4) {
                        iU2 = q8.u(parcel, i11);
                    } else if (c11 != 5) {
                        q8.y(parcel, i11);
                    } else {
                        iU3 = q8.u(parcel, i11);
                    }
                }
                q8.m(parcel, iZ2);
                return new e(fVar, iU, iU2, iU3);
            case 2:
                int iZ3 = q8.z(parcel);
                String strH2 = null;
                String strH3 = null;
                String strH4 = null;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    char c12 = (char) i12;
                    if (c12 == 2) {
                        strH2 = q8.h(parcel, i12);
                    } else if (c12 == 3) {
                        strH3 = q8.h(parcel, i12);
                    } else if (c12 != 4) {
                        q8.y(parcel, i12);
                    } else {
                        strH4 = q8.h(parcel, i12);
                    }
                }
                q8.m(parcel, iZ3);
                return new f(strH2, strH3, strH4);
            case 3:
                int iZ4 = q8.z(parcel);
                int iU4 = 0;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 2) {
                        q8.y(parcel, i13);
                    } else {
                        iU4 = q8.u(parcel, i13);
                    }
                }
                q8.m(parcel, iZ4);
                return new g(iU4);
            case 4:
                int iZ5 = q8.z(parcel);
                int iU5 = 0;
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 2) {
                        q8.y(parcel, i14);
                    } else {
                        iU5 = q8.u(parcel, i14);
                    }
                }
                q8.m(parcel, iZ5);
                return new h(iU5);
            case 5:
                int iZ6 = q8.z(parcel);
                int iU6 = 0;
                while (parcel.dataPosition() < iZ6) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        q8.y(parcel, i15);
                    } else {
                        iU6 = q8.u(parcel, i15);
                    }
                }
                q8.m(parcel, iZ6);
                return new i(iU6);
            case 6:
                int iZ7 = q8.z(parcel);
                int iU7 = 0;
                boolean zN = false;
                boolean zN2 = false;
                boolean zN3 = false;
                boolean zN4 = false;
                while (parcel.dataPosition() < iZ7) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        iU7 = q8.u(parcel, i16);
                    } else if (c13 == 2) {
                        zN = q8.n(parcel, i16);
                    } else if (c13 == 3) {
                        zN2 = q8.n(parcel, i16);
                    } else if (c13 == 4) {
                        zN3 = q8.n(parcel, i16);
                    } else if (c13 != 5) {
                        q8.y(parcel, i16);
                    } else {
                        zN4 = q8.n(parcel, i16);
                    }
                }
                q8.m(parcel, iZ7);
                return new j(iU7, zN, zN2, zN3, zN4);
            case 7:
                int iZ8 = q8.z(parcel);
                String strH5 = null;
                String strH6 = null;
                while (parcel.dataPosition() < iZ8) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 2) {
                        strH5 = q8.h(parcel, i17);
                    } else if (c14 != 3) {
                        q8.y(parcel, i17);
                    } else {
                        strH6 = q8.h(parcel, i17);
                    }
                }
                q8.m(parcel, iZ8);
                return new DataItemAssetParcelable(strH5, strH6);
            case 8:
                int iZ9 = q8.z(parcel);
                Uri uri = null;
                Bundle bundleA = null;
                byte[] bArrB = null;
                while (parcel.dataPosition() < iZ9) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 2) {
                        uri = (Uri) q8.g(parcel, i18, Uri.CREATOR);
                    } else if (c15 == 4) {
                        bundleA = q8.a(parcel, i18);
                    } else if (c15 != 5) {
                        q8.y(parcel, i18);
                    } else {
                        bArrB = q8.b(parcel, i18);
                    }
                }
                q8.m(parcel, iZ9);
                return new m(uri, bundleA, bArrB);
            case 9:
                int iZ10 = q8.z(parcel);
                int iU8 = 0;
                int iU9 = 0;
                while (parcel.dataPosition() < iZ10) {
                    int i19 = parcel.readInt();
                    char c16 = (char) i19;
                    if (c16 == 2) {
                        iU8 = q8.u(parcel, i19);
                    } else if (c16 != 3) {
                        q8.y(parcel, i19);
                    } else {
                        iU9 = q8.u(parcel, i19);
                    }
                }
                q8.m(parcel, iZ10);
                return new n(iU8, iU9);
            case 10:
                int iZ11 = q8.z(parcel);
                int iU10 = 0;
                ArrayList arrayListL2 = null;
                while (parcel.dataPosition() < iZ11) {
                    int i20 = parcel.readInt();
                    char c17 = (char) i20;
                    if (c17 == 2) {
                        iU10 = q8.u(parcel, i20);
                    } else if (c17 != 3) {
                        q8.y(parcel, i20);
                    } else {
                        arrayListL2 = q8.l(parcel, i20, b.CREATOR);
                    }
                }
                q8.m(parcel, iZ11);
                return new o(iU10, arrayListL2);
            case 11:
                int iZ12 = q8.z(parcel);
                int iU11 = 0;
                b bVar = null;
                while (parcel.dataPosition() < iZ12) {
                    int i21 = parcel.readInt();
                    char c18 = (char) i21;
                    if (c18 == 2) {
                        iU11 = q8.u(parcel, i21);
                    } else if (c18 != 3) {
                        q8.y(parcel, i21);
                    } else {
                        bVar = (b) q8.g(parcel, i21, b.CREATOR);
                    }
                }
                q8.m(parcel, iZ12);
                return new p(iU11, bVar);
            case 12:
                int iZ13 = q8.z(parcel);
                int iU12 = 0;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iZ13) {
                    int i22 = parcel.readInt();
                    char c19 = (char) i22;
                    if (c19 == 2) {
                        iU12 = q8.u(parcel, i22);
                    } else if (c19 != 3) {
                        q8.y(parcel, i22);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) q8.g(parcel, i22, ParcelFileDescriptor.CREATOR);
                    }
                }
                q8.m(parcel, iZ13);
                return new q(iU12, parcelFileDescriptor);
            case 13:
                int iZ14 = q8.z(parcel);
                int iU13 = 0;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                while (parcel.dataPosition() < iZ14) {
                    int i23 = parcel.readInt();
                    char c20 = (char) i23;
                    if (c20 == 2) {
                        iU13 = q8.u(parcel, i23);
                    } else if (c20 != 3) {
                        q8.y(parcel, i23);
                    } else {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) q8.g(parcel, i23, ParcelFileDescriptor.CREATOR);
                    }
                }
                q8.m(parcel, iZ14);
                return new r(iU13, parcelFileDescriptor2);
            case 14:
                int iZ15 = q8.z(parcel);
                int iU14 = 0;
                boolean zN5 = false;
                while (parcel.dataPosition() < iZ15) {
                    int i24 = parcel.readInt();
                    char c21 = (char) i24;
                    if (c21 == 2) {
                        iU14 = q8.u(parcel, i24);
                    } else if (c21 != 3) {
                        q8.y(parcel, i24);
                    } else {
                        zN5 = q8.n(parcel, i24);
                    }
                }
                q8.m(parcel, iZ15);
                return new s(iU14, zN5);
            case 15:
                int iZ16 = q8.z(parcel);
                int iU15 = 0;
                boolean zN6 = false;
                boolean zN7 = false;
                while (parcel.dataPosition() < iZ16) {
                    int i25 = parcel.readInt();
                    char c22 = (char) i25;
                    if (c22 == 2) {
                        iU15 = q8.u(parcel, i25);
                    } else if (c22 == 3) {
                        zN6 = q8.n(parcel, i25);
                    } else if (c22 != 4) {
                        q8.y(parcel, i25);
                    } else {
                        zN7 = q8.n(parcel, i25);
                    }
                }
                q8.m(parcel, iZ16);
                return new t(iU15, zN6, zN7);
            case 16:
                int iZ17 = q8.z(parcel);
                int iU16 = 0;
                boolean zN8 = false;
                while (parcel.dataPosition() < iZ17) {
                    int i26 = parcel.readInt();
                    char c23 = (char) i26;
                    if (c23 == 2) {
                        iU16 = q8.u(parcel, i26);
                    } else if (c23 != 3) {
                        q8.y(parcel, i26);
                    } else {
                        zN8 = q8.n(parcel, i26);
                    }
                }
                q8.m(parcel, iZ17);
                return new u(iU16, zN8);
            case 17:
                int iZ18 = q8.z(parcel);
                int iU17 = 0;
                String strH7 = null;
                while (parcel.dataPosition() < iZ18) {
                    int i27 = parcel.readInt();
                    char c24 = (char) i27;
                    if (c24 == 2) {
                        iU17 = q8.u(parcel, i27);
                    } else if (c24 != 3) {
                        q8.y(parcel, i27);
                    } else {
                        strH7 = q8.h(parcel, i27);
                    }
                }
                q8.m(parcel, iZ18);
                return new v(iU17, strH7);
            case 18:
                int iZ19 = q8.z(parcel);
                int iU18 = 0;
                ConnectionConfiguration connectionConfiguration = null;
                while (parcel.dataPosition() < iZ19) {
                    int i28 = parcel.readInt();
                    char c25 = (char) i28;
                    if (c25 == 2) {
                        iU18 = q8.u(parcel, i28);
                    } else if (c25 != 3) {
                        q8.y(parcel, i28);
                    } else {
                        connectionConfiguration = (ConnectionConfiguration) q8.g(parcel, i28, ConnectionConfiguration.CREATOR);
                    }
                }
                q8.m(parcel, iZ19);
                return new w(iU18, connectionConfiguration);
            case 19:
                int iZ20 = q8.z(parcel);
                int iU19 = 0;
                ConnectionConfiguration[] connectionConfigurationArr = null;
                while (parcel.dataPosition() < iZ20) {
                    int i29 = parcel.readInt();
                    char c26 = (char) i29;
                    if (c26 == 2) {
                        iU19 = q8.u(parcel, i29);
                    } else if (c26 != 3) {
                        q8.y(parcel, i29);
                    } else {
                        connectionConfigurationArr = (ConnectionConfiguration[]) q8.k(parcel, i29, ConnectionConfiguration.CREATOR);
                    }
                }
                q8.m(parcel, iZ20);
                return new x(iU19, connectionConfigurationArr);
            case 20:
                int iZ21 = q8.z(parcel);
                int iU20 = 0;
                ArrayList arrayListL3 = null;
                while (parcel.dataPosition() < iZ21) {
                    int i30 = parcel.readInt();
                    char c27 = (char) i30;
                    if (c27 == 2) {
                        iU20 = q8.u(parcel, i30);
                    } else if (c27 != 3) {
                        q8.y(parcel, i30);
                    } else {
                        arrayListL3 = q8.l(parcel, i30, m0.CREATOR);
                    }
                }
                q8.m(parcel, iZ21);
                return new y(iU20, arrayListL3);
            case 21:
                int iZ22 = q8.z(parcel);
                int iU21 = 0;
                m mVar = null;
                while (parcel.dataPosition() < iZ22) {
                    int i31 = parcel.readInt();
                    char c28 = (char) i31;
                    if (c28 == 2) {
                        iU21 = q8.u(parcel, i31);
                    } else if (c28 != 3) {
                        q8.y(parcel, i31);
                    } else {
                        mVar = (m) q8.g(parcel, i31, m.CREATOR);
                    }
                }
                q8.m(parcel, iZ22);
                return new z(iU21, mVar);
            case 22:
                int iZ23 = q8.z(parcel);
                int iU22 = 0;
                String strH8 = null;
                while (parcel.dataPosition() < iZ23) {
                    int i32 = parcel.readInt();
                    char c29 = (char) i32;
                    if (c29 == 2) {
                        iU22 = q8.u(parcel, i32);
                    } else if (c29 != 3) {
                        q8.y(parcel, i32);
                    } else {
                        strH8 = q8.h(parcel, i32);
                    }
                }
                q8.m(parcel, iZ23);
                return new a0(iU22, strH8);
            case 23:
                int iZ24 = q8.z(parcel);
                int iU23 = 0;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                while (parcel.dataPosition() < iZ24) {
                    int i33 = parcel.readInt();
                    char c30 = (char) i33;
                    if (c30 == 2) {
                        iU23 = q8.u(parcel, i33);
                    } else if (c30 != 3) {
                        q8.y(parcel, i33);
                    } else {
                        parcelFileDescriptor3 = (ParcelFileDescriptor) q8.g(parcel, i33, ParcelFileDescriptor.CREATOR);
                    }
                }
                q8.m(parcel, iZ24);
                return new b0(iU23, parcelFileDescriptor3);
            case 24:
                int iZ25 = q8.z(parcel);
                int iU24 = 0;
                m0 m0Var = null;
                while (parcel.dataPosition() < iZ25) {
                    int i34 = parcel.readInt();
                    char c31 = (char) i34;
                    if (c31 == 2) {
                        iU24 = q8.u(parcel, i34);
                    } else if (c31 != 3) {
                        q8.y(parcel, i34);
                    } else {
                        m0Var = (m0) q8.g(parcel, i34, m0.CREATOR);
                    }
                }
                q8.m(parcel, iZ25);
                return new c0(iU24, m0Var);
            case 25:
                int iZ26 = q8.z(parcel);
                int iU25 = 0;
                String strH9 = null;
                while (parcel.dataPosition() < iZ26) {
                    int i35 = parcel.readInt();
                    char c32 = (char) i35;
                    if (c32 == 2) {
                        iU25 = q8.u(parcel, i35);
                    } else if (c32 != 3) {
                        q8.y(parcel, i35);
                    } else {
                        strH9 = q8.h(parcel, i35);
                    }
                }
                q8.m(parcel, iZ26);
                return new d0(iU25, strH9);
            case 26:
                int iZ27 = q8.z(parcel);
                String strH10 = null;
                int iU26 = 0;
                int iU27 = 0;
                while (parcel.dataPosition() < iZ27) {
                    int i36 = parcel.readInt();
                    char c33 = (char) i36;
                    if (c33 == 1) {
                        strH10 = q8.h(parcel, i36);
                    } else if (c33 == 2) {
                        iU26 = q8.u(parcel, i36);
                    } else if (c33 != 3) {
                        q8.y(parcel, i36);
                    } else {
                        iU27 = q8.u(parcel, i36);
                    }
                }
                q8.m(parcel, iZ27);
                return new b1(strH10, iU26, iU27);
            case 27:
                int iZ28 = q8.z(parcel);
                int iU28 = 0;
                String strH11 = null;
                byte[] bArrB2 = null;
                String strH12 = null;
                while (parcel.dataPosition() < iZ28) {
                    int i37 = parcel.readInt();
                    char c34 = (char) i37;
                    if (c34 == 2) {
                        iU28 = q8.u(parcel, i37);
                    } else if (c34 == 3) {
                        strH11 = q8.h(parcel, i37);
                    } else if (c34 == 4) {
                        bArrB2 = q8.b(parcel, i37);
                    } else if (c34 != 5) {
                        q8.y(parcel, i37);
                    } else {
                        strH12 = q8.h(parcel, i37);
                    }
                }
                q8.m(parcel, iZ28);
                return new l0(iU28, strH11, strH12, bArrB2);
            case 28:
                int iZ29 = q8.z(parcel);
                int iU29 = 0;
                while (parcel.dataPosition() < iZ29) {
                    int i38 = parcel.readInt();
                    if (((char) i38) != 2) {
                        q8.y(parcel, i38);
                    } else {
                        iU29 = q8.u(parcel, i38);
                    }
                }
                q8.m(parcel, iZ29);
                return new g0(iU29);
            default:
                int iZ30 = q8.z(parcel);
                String strH13 = null;
                String strH14 = null;
                int iU30 = 0;
                boolean zN9 = false;
                while (parcel.dataPosition() < iZ30) {
                    int i39 = parcel.readInt();
                    char c35 = (char) i39;
                    if (c35 == 2) {
                        strH13 = q8.h(parcel, i39);
                    } else if (c35 == 3) {
                        strH14 = q8.h(parcel, i39);
                    } else if (c35 == 4) {
                        iU30 = q8.u(parcel, i39);
                    } else if (c35 != 5) {
                        q8.y(parcel, i39);
                    } else {
                        zN9 = q8.n(parcel, i39);
                    }
                }
                q8.m(parcel, iZ30);
                return new m0(iU30, strH13, strH14, zN9);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f12754a) {
            case 0:
                return new b[i10];
            case 1:
                return new e[i10];
            case 2:
                return new f[i10];
            case 3:
                return new g[i10];
            case 4:
                return new h[i10];
            case 5:
                return new i[i10];
            case 6:
                return new j[i10];
            case 7:
                return new DataItemAssetParcelable[i10];
            case 8:
                return new m[i10];
            case 9:
                return new n[i10];
            case 10:
                return new o[i10];
            case 11:
                return new p[i10];
            case 12:
                return new q[i10];
            case 13:
                return new r[i10];
            case 14:
                return new s[i10];
            case 15:
                return new t[i10];
            case 16:
                return new u[i10];
            case 17:
                return new v[i10];
            case 18:
                return new w[i10];
            case 19:
                return new x[i10];
            case 20:
                return new y[i10];
            case 21:
                return new z[i10];
            case 22:
                return new a0[i10];
            case 23:
                return new b0[i10];
            case 24:
                return new c0[i10];
            case 25:
                return new d0[i10];
            case 26:
                return new b1[i10];
            case 27:
                return new l0[i10];
            case 28:
                return new g0[i10];
            default:
                return new m0[i10];
        }
    }
}
