package l4;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.view.View;
import b7.w0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.wearable.ConnectionConfiguration;
import j7.f5;
import java.util.ArrayList;
import q6.b0;
import q6.h0;
import q6.m;
import q6.m0;
import q6.n0;
import q6.o0;
import q6.p0;
import q6.q0;
import q6.t;
import q6.u;
import q6.v;
import q6.w;
import q6.x;
import q6.y;
import q6.z0;
public final class j implements Parcelable.Creator {
    public final int f11707a;

    public j(int i10) {
        this.f11707a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        boolean z4;
        w0 t6;
        w0 t9;
        switch (this.f11707a) {
            case 0:
                return new k(parcel.readLong(), parcel.readLong());
            case 1:
                int z10 = f5.z(parcel);
                l5.d dVar = null;
                l5.a aVar = null;
                String str = null;
                l5.c cVar = null;
                l5.b bVar = null;
                boolean z11 = false;
                int i10 = 0;
                boolean z12 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            dVar = (l5.d) f5.g(parcel, readInt, l5.d.CREATOR);
                            break;
                        case 2:
                            aVar = (l5.a) f5.g(parcel, readInt, l5.a.CREATOR);
                            break;
                        case 3:
                            str = f5.h(parcel, readInt);
                            break;
                        case 4:
                            z11 = f5.n(parcel, readInt);
                            break;
                        case 5:
                            i10 = f5.u(parcel, readInt);
                            break;
                        case 6:
                            cVar = (l5.c) f5.g(parcel, readInt, l5.c.CREATOR);
                            break;
                        case 7:
                            bVar = (l5.b) f5.g(parcel, readInt, l5.b.CREATOR);
                            break;
                        case '\b':
                            z12 = f5.n(parcel, readInt);
                            break;
                        default:
                            f5.y(parcel, readInt);
                            break;
                    }
                }
                f5.m(parcel, z10);
                return new l5.e(dVar, aVar, str, z11, i10, cVar, bVar, z12);
            case 2:
                int z13 = f5.z(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < z13) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 1) {
                        f5.y(parcel, readInt2);
                    } else {
                        pendingIntent = (PendingIntent) f5.g(parcel, readInt2, PendingIntent.CREATOR);
                    }
                }
                f5.m(parcel, z13);
                return new l5.f(pendingIntent);
            case 3:
                int z14 = f5.z(parcel);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                ArrayList arrayList = null;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            z15 = f5.n(parcel, readInt3);
                            break;
                        case 2:
                            str2 = f5.h(parcel, readInt3);
                            break;
                        case 3:
                            str3 = f5.h(parcel, readInt3);
                            break;
                        case 4:
                            z16 = f5.n(parcel, readInt3);
                            break;
                        case 5:
                            str4 = f5.h(parcel, readInt3);
                            break;
                        case 6:
                            arrayList = f5.j(parcel, readInt3);
                            break;
                        case 7:
                            z17 = f5.n(parcel, readInt3);
                            break;
                        default:
                            f5.y(parcel, readInt3);
                            break;
                    }
                }
                f5.m(parcel, z14);
                return new l5.a(z15, str2, str3, z16, str4, arrayList, z17);
            case 4:
                int z18 = f5.z(parcel);
                String str5 = null;
                boolean z19 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            f5.y(parcel, readInt4);
                        } else {
                            str5 = f5.h(parcel, readInt4);
                        }
                    } else {
                        z19 = f5.n(parcel, readInt4);
                    }
                }
                f5.m(parcel, z18);
                return new l5.b(str5, z19);
            case 5:
                int z20 = f5.z(parcel);
                byte[] bArr = null;
                String str6 = null;
                boolean z21 = false;
                while (parcel.dataPosition() < z20) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                f5.y(parcel, readInt5);
                            } else {
                                str6 = f5.h(parcel, readInt5);
                            }
                        } else {
                            bArr = f5.b(parcel, readInt5);
                        }
                    } else {
                        z21 = f5.n(parcel, readInt5);
                    }
                }
                f5.m(parcel, z20);
                return new l5.c(z21, bArr, str6);
            case 6:
                int z22 = f5.z(parcel);
                boolean z23 = false;
                while (parcel.dataPosition() < z22) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        f5.y(parcel, readInt6);
                    } else {
                        z23 = f5.n(parcel, readInt6);
                    }
                }
                f5.m(parcel, z22);
                return new l5.d(z23);
            case 7:
                int z24 = f5.z(parcel);
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                Uri uri = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                u uVar = null;
                while (parcel.dataPosition() < z24) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str7 = f5.h(parcel, readInt7);
                            break;
                        case 2:
                            str8 = f5.h(parcel, readInt7);
                            break;
                        case 3:
                            str9 = f5.h(parcel, readInt7);
                            break;
                        case 4:
                            str10 = f5.h(parcel, readInt7);
                            break;
                        case 5:
                            uri = (Uri) f5.g(parcel, readInt7, Uri.CREATOR);
                            break;
                        case 6:
                            str11 = f5.h(parcel, readInt7);
                            break;
                        case 7:
                            str12 = f5.h(parcel, readInt7);
                            break;
                        case '\b':
                            str13 = f5.h(parcel, readInt7);
                            break;
                        case '\t':
                            uVar = (u) f5.g(parcel, readInt7, u.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt7);
                            break;
                    }
                }
                f5.m(parcel, z24);
                return new l5.g(str7, str8, str9, str10, uri, str11, str12, str13, uVar);
            case 8:
                int z25 = f5.z(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                ArrayList arrayList2 = null;
                int i11 = 0;
                int i12 = 0;
                boolean z26 = false;
                boolean z27 = false;
                boolean z28 = false;
                int i13 = 0;
                while (parcel.dataPosition() < z25) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 2:
                            str14 = f5.h(parcel, readInt8);
                            break;
                        case 3:
                            str15 = f5.h(parcel, readInt8);
                            break;
                        case 4:
                            i11 = f5.u(parcel, readInt8);
                            break;
                        case 5:
                            i12 = f5.u(parcel, readInt8);
                            break;
                        case 6:
                            z26 = f5.n(parcel, readInt8);
                            break;
                        case 7:
                            z27 = f5.n(parcel, readInt8);
                            break;
                        case '\b':
                            str16 = f5.h(parcel, readInt8);
                            break;
                        case '\t':
                            z28 = f5.n(parcel, readInt8);
                            break;
                        case '\n':
                            str17 = f5.h(parcel, readInt8);
                            break;
                        case 11:
                            str18 = f5.h(parcel, readInt8);
                            break;
                        case '\f':
                            i13 = f5.u(parcel, readInt8);
                            break;
                        case '\r':
                            arrayList2 = f5.j(parcel, readInt8);
                            break;
                        default:
                            f5.y(parcel, readInt8);
                            break;
                    }
                }
                f5.m(parcel, z25);
                return new ConnectionConfiguration(str14, str15, i11, i12, z26, z27, str16, z28, str17, str18, i13, arrayList2);
            case 9:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                baseSavedState.f13260a = z4;
                return baseSavedState;
            case 10:
                return new m3.a(parcel);
            case 11:
                return new m3.b(parcel);
            case 12:
                return new h4.b(parcel);
            case 13:
                return new n4.b(parcel);
            case 14:
                return new o3.g(parcel);
            case 15:
                return new o3.f(parcel);
            case 16:
                int z29 = f5.z(parcel);
                Bundle bundle = null;
                int i14 = 0;
                int i15 = 0;
                while (parcel.dataPosition() < z29) {
                    int readInt9 = parcel.readInt();
                    char c11 = (char) readInt9;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                f5.y(parcel, readInt9);
                            } else {
                                bundle = f5.a(parcel, readInt9);
                            }
                        } else {
                            i15 = f5.u(parcel, readInt9);
                        }
                    } else {
                        i14 = f5.u(parcel, readInt9);
                    }
                }
                f5.m(parcel, z29);
                return new o5.a(i14, i15, bundle);
            case 17:
                int z30 = f5.z(parcel);
                String str19 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < z30) {
                    int readInt10 = parcel.readInt();
                    char c12 = (char) readInt10;
                    if (c12 != 2) {
                        if (c12 != 5) {
                            f5.y(parcel, readInt10);
                        } else {
                            googleSignInOptions = (GoogleSignInOptions) f5.g(parcel, readInt10, GoogleSignInOptions.CREATOR);
                        }
                    } else {
                        str19 = f5.h(parcel, readInt10);
                    }
                }
                f5.m(parcel, z30);
                return new SignInConfiguration(str19, googleSignInOptions);
            case 18:
                try {
                    return Transport.a(parcel.readString());
                } catch (o6.a e6) {
                    throw new RuntimeException(e6);
                }
            case 19:
                try {
                    return q6.c.a(parcel.readString());
                } catch (q6.b e10) {
                    throw new RuntimeException(e10);
                }
            case 20:
                int z31 = f5.z(parcel);
                boolean z32 = false;
                while (parcel.dataPosition() < z31) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        f5.y(parcel, readInt11);
                    } else {
                        z32 = f5.n(parcel, readInt11);
                    }
                }
                f5.m(parcel, z31);
                return new z0(z32);
            case 21:
                int z33 = f5.z(parcel);
                long j10 = 0;
                while (parcel.dataPosition() < z33) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        f5.y(parcel, readInt12);
                    } else {
                        j10 = f5.w(parcel, readInt12);
                    }
                }
                f5.m(parcel, z33);
                return new m0(j10);
            case 22:
                int z34 = f5.z(parcel);
                boolean z35 = false;
                while (parcel.dataPosition() < z34) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        f5.y(parcel, readInt13);
                    } else {
                        z35 = f5.n(parcel, readInt13);
                    }
                }
                f5.m(parcel, z34);
                return new n0(z35);
            case 23:
                int z36 = f5.z(parcel);
                boolean z37 = false;
                while (parcel.dataPosition() < z36) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        f5.y(parcel, readInt14);
                    } else {
                        z37 = f5.n(parcel, readInt14);
                    }
                }
                f5.m(parcel, z36);
                return new t(z37);
            case 24:
                int z38 = f5.z(parcel);
                String str20 = null;
                while (parcel.dataPosition() < z38) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        f5.y(parcel, readInt15);
                    } else {
                        str20 = f5.h(parcel, readInt15);
                    }
                }
                f5.m(parcel, z38);
                return new o0(str20);
            case 25:
                int z39 = f5.z(parcel);
                int i16 = 0;
                w0 w0Var = null;
                byte[] bArr2 = null;
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < z39) {
                    int readInt16 = parcel.readInt();
                    char c13 = (char) readInt16;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                if (c13 != 4) {
                                    f5.y(parcel, readInt16);
                                } else {
                                    i16 = f5.u(parcel, readInt16);
                                }
                            } else {
                                bArr4 = f5.b(parcel, readInt16);
                            }
                        } else {
                            bArr3 = f5.b(parcel, readInt16);
                        }
                    } else {
                        bArr2 = f5.b(parcel, readInt16);
                    }
                }
                f5.m(parcel, z39);
                if (bArr2 == null) {
                    t6 = null;
                } else {
                    t6 = w0.t(bArr2.length, bArr2);
                }
                if (bArr3 == null) {
                    t9 = null;
                } else {
                    t9 = w0.t(bArr3.length, bArr3);
                }
                if (bArr4 != null) {
                    w0Var = w0.t(bArr4.length, bArr4);
                }
                return new p0(t6, t9, w0Var, i16);
            case 26:
                int z40 = f5.z(parcel);
                byte[][] bArr5 = null;
                while (parcel.dataPosition() < z40) {
                    int readInt17 = parcel.readInt();
                    if (((char) readInt17) != 1) {
                        f5.y(parcel, readInt17);
                    } else {
                        bArr5 = f5.c(parcel, readInt17);
                    }
                }
                f5.m(parcel, z40);
                return new q0(bArr5);
            case 27:
                int z41 = f5.z(parcel);
                y yVar = null;
                b0 b0Var = null;
                byte[] bArr6 = null;
                ArrayList arrayList3 = null;
                Double d = null;
                ArrayList arrayList4 = null;
                m mVar = null;
                Integer num = null;
                h0 h0Var = null;
                String str21 = null;
                q6.f fVar = null;
                String str22 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < z41) {
                    int readInt18 = parcel.readInt();
                    switch ((char) readInt18) {
                        case 2:
                            yVar = (y) f5.g(parcel, readInt18, y.CREATOR);
                            break;
                        case 3:
                            b0Var = (b0) f5.g(parcel, readInt18, b0.CREATOR);
                            break;
                        case 4:
                            bArr6 = f5.b(parcel, readInt18);
                            break;
                        case 5:
                            arrayList3 = f5.l(parcel, readInt18, x.CREATOR);
                            break;
                        case 6:
                            int x10 = f5.x(parcel, readInt18);
                            if (x10 == 0) {
                                d = null;
                                break;
                            } else {
                                f5.A(parcel, x10, 8);
                                d = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        case 7:
                            arrayList4 = f5.l(parcel, readInt18, w.CREATOR);
                            break;
                        case '\b':
                            mVar = (m) f5.g(parcel, readInt18, m.CREATOR);
                            break;
                        case '\t':
                            num = f5.v(parcel, readInt18);
                            break;
                        case '\n':
                            h0Var = (h0) f5.g(parcel, readInt18, h0.CREATOR);
                            break;
                        case 11:
                            str21 = f5.h(parcel, readInt18);
                            break;
                        case '\f':
                            fVar = (q6.f) f5.g(parcel, readInt18, q6.f.CREATOR);
                            break;
                        case '\r':
                            str22 = f5.h(parcel, readInt18);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) f5.g(parcel, readInt18, ResultReceiver.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt18);
                            break;
                    }
                }
                f5.m(parcel, z41);
                return new v(yVar, b0Var, bArr6, arrayList3, d, arrayList4, mVar, num, h0Var, str21, fVar, str22, resultReceiver);
            case 28:
                int z42 = f5.z(parcel);
                String str23 = null;
                String str24 = null;
                byte[] bArr7 = null;
                q6.j jVar = null;
                q6.i iVar = null;
                q6.k kVar = null;
                q6.g gVar = null;
                String str25 = null;
                while (parcel.dataPosition() < z42) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            str23 = f5.h(parcel, readInt19);
                            break;
                        case 2:
                            str24 = f5.h(parcel, readInt19);
                            break;
                        case 3:
                            bArr7 = f5.b(parcel, readInt19);
                            break;
                        case 4:
                            jVar = (q6.j) f5.g(parcel, readInt19, q6.j.CREATOR);
                            break;
                        case 5:
                            iVar = (q6.i) f5.g(parcel, readInt19, q6.i.CREATOR);
                            break;
                        case 6:
                            kVar = (q6.k) f5.g(parcel, readInt19, q6.k.CREATOR);
                            break;
                        case 7:
                            gVar = (q6.g) f5.g(parcel, readInt19, q6.g.CREATOR);
                            break;
                        case '\b':
                            str25 = f5.h(parcel, readInt19);
                            break;
                        case '\t':
                            f5.h(parcel, readInt19);
                            break;
                        default:
                            f5.y(parcel, readInt19);
                            break;
                    }
                }
                f5.m(parcel, z42);
                return new u(str23, str24, bArr7, jVar, iVar, kVar, gVar, str25);
            default:
                int z43 = f5.z(parcel);
                String str26 = null;
                byte[] bArr8 = null;
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < z43) {
                    int readInt20 = parcel.readInt();
                    char c14 = (char) readInt20;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            if (c14 != 4) {
                                f5.y(parcel, readInt20);
                            } else {
                                arrayList5 = f5.l(parcel, readInt20, Transport.CREATOR);
                            }
                        } else {
                            bArr8 = f5.b(parcel, readInt20);
                        }
                    } else {
                        str26 = f5.h(parcel, readInt20);
                    }
                }
                f5.m(parcel, z43);
                return new w(str26, bArr8, arrayList5);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f11707a) {
            case 0:
                return new k[i10];
            case 1:
                return new l5.e[i10];
            case 2:
                return new l5.f[i10];
            case 3:
                return new l5.a[i10];
            case 4:
                return new l5.b[i10];
            case 5:
                return new l5.c[i10];
            case 6:
                return new l5.d[i10];
            case 7:
                return new l5.g[i10];
            case 8:
                return new ConnectionConfiguration[i10];
            case 9:
                return new m.n0[i10];
            case 10:
                return new m3.a[i10];
            case 11:
                return new m3.b[i10];
            case 12:
                return new m4.a[i10];
            case 13:
                return new n4.b[i10];
            case 14:
                return new o3.g[i10];
            case 15:
                return new o3.f[i10];
            case 16:
                return new o5.a[i10];
            case 17:
                return new SignInConfiguration[i10];
            case 18:
                return new Transport[i10];
            case 19:
                return new q6.c[i10];
            case 20:
                return new z0[i10];
            case 21:
                return new m0[i10];
            case 22:
                return new n0[i10];
            case 23:
                return new t[i10];
            case 24:
                return new o0[i10];
            case 25:
                return new p0[i10];
            case 26:
                return new q0[i10];
            case 27:
                return new v[i10];
            case 28:
                return new u[i10];
            default:
                return new w[i10];
        }
    }
}
