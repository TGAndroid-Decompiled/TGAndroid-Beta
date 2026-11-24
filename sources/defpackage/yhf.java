package defpackage;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import java.util.ArrayList;
import java.util.List;
public final class yhf implements Parcelable.Creator {
    public final byte a;

    public yhf(byte b) {
        this.a = b;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        switch (this.a) {
            case 0:
                int z3 = jve.z(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                while (parcel.dataPosition() < z3) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c != 4) {
                                    if (c != 5) {
                                        jve.y(parcel, readInt);
                                    } else {
                                        z8 = jve.n(parcel, readInt);
                                    }
                                } else {
                                    z7 = jve.n(parcel, readInt);
                                }
                            } else {
                                z6 = jve.n(parcel, readInt);
                            }
                        } else {
                            z5 = jve.n(parcel, readInt);
                        }
                    } else {
                        z4 = jve.n(parcel, readInt);
                    }
                }
                jve.m(parcel, z3);
                return new whf(z4, z5, z6, z7, z8);
            case 1:
                int z9 = jve.z(parcel);
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < z9) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 != 2) {
                        if (c2 != 3) {
                            if (c2 != 4) {
                                if (c2 != 5) {
                                    if (c2 != 6) {
                                        jve.y(parcel, readInt2);
                                    } else {
                                        i6 = jve.u(parcel, readInt2);
                                    }
                                } else {
                                    j = jve.w(parcel, readInt2);
                                }
                            } else {
                                i5 = jve.u(parcel, readInt2);
                            }
                        } else {
                            i4 = jve.u(parcel, readInt2);
                        }
                    } else {
                        i = jve.u(parcel, readInt2);
                    }
                }
                jve.m(parcel, z9);
                ?? obj = new Object();
                obj.a = i;
                obj.b = i4;
                obj.c = i5;
                obj.d = j;
                obj.e = i6;
                return obj;
            case 2:
                int z10 = jve.z(parcel);
                long j2 = Long.MAX_VALUE;
                int i7 = 0;
                boolean z11 = false;
                String str4 = null;
                epd epdVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    if (c3 != 5) {
                                        jve.y(parcel, readInt3);
                                    } else {
                                        epdVar = (epd) jve.g(parcel, readInt3, epd.CREATOR);
                                    }
                                } else {
                                    str4 = jve.h(parcel, readInt3);
                                }
                            } else {
                                z11 = jve.n(parcel, readInt3);
                            }
                        } else {
                            i7 = jve.u(parcel, readInt3);
                        }
                    } else {
                        j2 = jve.w(parcel, readInt3);
                    }
                }
                jve.m(parcel, z10);
                return new jz5(j2, i7, z11, str4, epdVar);
            case 3:
                int z12 = jve.z(parcel);
                String str5 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                if (c4 != 4) {
                                    jve.y(parcel, readInt4);
                                } else {
                                    commonWalletObject = (CommonWalletObject) jve.g(parcel, readInt4, CommonWalletObject.CREATOR);
                                }
                            } else {
                                str5 = jve.h(parcel, readInt4);
                            }
                        } else {
                            str = jve.h(parcel, readInt4);
                        }
                    } else {
                        i3 = jve.u(parcel, readInt4);
                    }
                }
                jve.m(parcel, z12);
                return new jq7(i3, str, str5, commonWalletObject);
            case 4:
                int z13 = jve.z(parcel);
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        jve.y(parcel, readInt5);
                    } else {
                        jve.n(parcel, readInt5);
                    }
                }
                jve.m(parcel, z13);
                return new Object();
            case 5:
                int z14 = jve.z(parcel);
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        jve.y(parcel, readInt6);
                    } else {
                        z2 = jve.n(parcel, readInt6);
                    }
                }
                jve.m(parcel, z14);
                return new jhf(z2);
            case 6:
                int z15 = jve.z(parcel);
                int i8 = 1000;
                long j3 = 0;
                int i9 = 1;
                int i10 = 1;
                x7d[] x7dVarArr = null;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i9 = jve.u(parcel, readInt7);
                            break;
                        case 2:
                            i10 = jve.u(parcel, readInt7);
                            break;
                        case 3:
                            j3 = jve.w(parcel, readInt7);
                            break;
                        case 4:
                            i8 = jve.u(parcel, readInt7);
                            break;
                        case 5:
                            x7dVarArr = (x7d[]) jve.k(parcel, readInt7, x7d.CREATOR);
                            break;
                        case 6:
                            jve.n(parcel, readInt7);
                            break;
                        default:
                            jve.y(parcel, readInt7);
                            break;
                    }
                }
                jve.m(parcel, z15);
                return new LocationAvailability(i8, i9, i10, j3, x7dVarArr);
            case 7:
                try {
                    return f54.a(parcel.readInt());
                } catch (e54 e) {
                    throw new IllegalArgumentException(e);
                }
            case 8:
                int z16 = jve.z(parcel);
                long j4 = Long.MAX_VALUE;
                long j5 = Long.MAX_VALUE;
                WorkSource workSource = new WorkSource();
                long j6 = 0;
                int i11 = 102;
                long j7 = 3600000;
                int i12 = Integer.MAX_VALUE;
                boolean z17 = false;
                int i13 = 0;
                int i14 = 0;
                boolean z18 = false;
                String str6 = null;
                epd epdVar2 = null;
                long j8 = 600000;
                float f = 0.0f;
                long j9 = -1;
                while (parcel.dataPosition() < z16) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i11 = jve.u(parcel, readInt8);
                            break;
                        case 2:
                            j7 = jve.w(parcel, readInt8);
                            break;
                        case 3:
                            j8 = jve.w(parcel, readInt8);
                            break;
                        case 4:
                        default:
                            jve.y(parcel, readInt8);
                            break;
                        case 5:
                            j4 = jve.w(parcel, readInt8);
                            break;
                        case 6:
                            i12 = jve.u(parcel, readInt8);
                            break;
                        case 7:
                            f = jve.r(parcel, readInt8);
                            break;
                        case '\b':
                            j6 = jve.w(parcel, readInt8);
                            break;
                        case '\t':
                            z17 = jve.n(parcel, readInt8);
                            break;
                        case '\n':
                            j5 = jve.w(parcel, readInt8);
                            break;
                        case 11:
                            j9 = jve.w(parcel, readInt8);
                            break;
                        case '\f':
                            i13 = jve.u(parcel, readInt8);
                            break;
                        case '\r':
                            i14 = jve.u(parcel, readInt8);
                            break;
                        case 14:
                            str6 = jve.h(parcel, readInt8);
                            break;
                        case 15:
                            z18 = jve.n(parcel, readInt8);
                            break;
                        case 16:
                            workSource = (WorkSource) jve.g(parcel, readInt8, WorkSource.CREATOR);
                            break;
                        case 17:
                            epdVar2 = (epd) jve.g(parcel, readInt8, epd.CREATOR);
                            break;
                    }
                }
                jve.m(parcel, z16);
                return new LocationRequest(i11, j7, j8, j6, j4, j5, i12, f, z17, j9, i13, i14, str6, z18, workSource, epdVar2);
            case 9:
                int z19 = jve.z(parcel);
                String str7 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 != 2) {
                        if (c5 != 3) {
                            if (c5 != 4) {
                                jve.y(parcel, readInt9);
                            } else {
                                str7 = jve.h(parcel, readInt9);
                            }
                        } else {
                            i2 = jve.u(parcel, readInt9);
                        }
                    } else {
                        str3 = jve.h(parcel, readInt9);
                    }
                }
                jve.m(parcel, z19);
                return new zl7(str3, i2, str7);
            case 10:
                int z20 = jve.z(parcel);
                int i15 = 0;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < z20) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            str8 = jve.h(parcel, readInt10);
                            break;
                        case 2:
                            str9 = jve.h(parcel, readInt10);
                            break;
                        case 3:
                            str10 = jve.h(parcel, readInt10);
                            break;
                        case 4:
                            str11 = jve.h(parcel, readInt10);
                            break;
                        case 5:
                            str12 = jve.h(parcel, readInt10);
                            break;
                        case 6:
                            i15 = jve.u(parcel, readInt10);
                            break;
                        case 7:
                            str13 = jve.h(parcel, readInt10);
                            break;
                        default:
                            jve.y(parcel, readInt10);
                            break;
                    }
                }
                jve.m(parcel, z20);
                return new m79(str8, str9, str10, str11, str12, i15, str13);
            case 11:
                int z21 = jve.z(parcel);
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        jve.y(parcel, readInt11);
                    } else {
                        str2 = jve.h(parcel, readInt11);
                    }
                }
                jve.m(parcel, z21);
                return new va4(str2);
            case 12:
                int z22 = jve.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        jve.y(parcel, readInt12);
                    } else {
                        list = jve.l(parcel, readInt12, Location.CREATOR);
                    }
                }
                jve.m(parcel, z22);
                return new LocationResult(list);
            case 13:
                int z23 = jve.z(parcel);
                int i16 = 0;
                boolean z24 = false;
                boolean z25 = false;
                String str14 = null;
                String str15 = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < z23) {
                    int readInt13 = parcel.readInt();
                    switch ((char) readInt13) {
                        case 1:
                            i16 = jve.u(parcel, readInt13);
                            break;
                        case 2:
                            z24 = jve.n(parcel, readInt13);
                            break;
                        case 3:
                            str14 = jve.h(parcel, readInt13);
                            break;
                        case 4:
                            str15 = jve.h(parcel, readInt13);
                            break;
                        case 5:
                            bArr = jve.b(parcel, readInt13);
                            break;
                        case 6:
                            z25 = jve.n(parcel, readInt13);
                            break;
                        default:
                            jve.y(parcel, readInt13);
                            break;
                    }
                }
                jve.m(parcel, z23);
                return new mdd(i16, z24, str14, str15, bArr, z25);
            case 14:
                int z26 = jve.z(parcel);
                int i17 = -1;
                long j10 = 0;
                int i18 = 0;
                boolean z27 = false;
                int i19 = 0;
                wje wjeVar = null;
                String str16 = null;
                y7e y7eVar = null;
                String str17 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            wjeVar = (wje) jve.g(parcel, readInt14, wje.CREATOR);
                            break;
                        case 2:
                            j10 = jve.w(parcel, readInt14);
                            break;
                        case 3:
                            i18 = jve.u(parcel, readInt14);
                            break;
                        case 4:
                            str16 = jve.h(parcel, readInt14);
                            break;
                        case 5:
                            y7eVar = (y7e) jve.g(parcel, readInt14, y7e.CREATOR);
                            break;
                        case 6:
                            z27 = jve.n(parcel, readInt14);
                            break;
                        case 7:
                            i17 = jve.u(parcel, readInt14);
                            break;
                        case '\b':
                            i19 = jve.u(parcel, readInt14);
                            break;
                        case '\t':
                            str17 = jve.h(parcel, readInt14);
                            break;
                        default:
                            jve.y(parcel, readInt14);
                            break;
                    }
                }
                jve.m(parcel, z26);
                return new ojf(wjeVar, j10, i18, str16, y7eVar, z27, i17, i19, str17);
            case 15:
                int z28 = jve.z(parcel);
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt15 = parcel.readInt();
                    char c6 = (char) readInt15;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                jve.y(parcel, readInt15);
                            } else {
                                z29 = jve.n(parcel, readInt15);
                            }
                        } else {
                            z = jve.n(parcel, readInt15);
                        }
                    } else {
                        arrayList = jve.l(parcel, readInt15, LocationRequest.CREATOR);
                    }
                }
                jve.m(parcel, z28);
                return new id6(arrayList, z, z29);
            default:
                int z30 = jve.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        jve.y(parcel, readInt16);
                    } else {
                        pendingIntent = (PendingIntent) jve.g(parcel, readInt16, PendingIntent.CREATOR);
                    }
                }
                jve.m(parcel, z30);
                ?? obj2 = new Object();
                obj2.a = pendingIntent;
                return obj2;
        }
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new whf[i];
            case 1:
                return new wef[i];
            case 2:
                return new jz5[i];
            case 3:
                return new jq7[i];
            case 4:
                return new ihf[i];
            case 5:
                return new jhf[i];
            case 6:
                return new LocationAvailability[i];
            case 7:
                return new f54[i];
            case 8:
                return new LocationRequest[i];
            case 9:
                return new zl7[i];
            case 10:
                return new m79[i];
            case 11:
                return new va4[i];
            case 12:
                return new LocationResult[i];
            case 13:
                return new mdd[i];
            case 14:
                return new ojf[i];
            case 15:
                return new id6[i];
            default:
                return new p08[i];
        }
    }
}
