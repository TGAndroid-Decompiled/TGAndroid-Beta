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
public final class xff implements Parcelable.Creator {
    public final byte a;

    public xff(byte b) {
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
                int z3 = gte.z(parcel);
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
                                        gte.y(parcel, readInt);
                                    } else {
                                        z8 = gte.n(parcel, readInt);
                                    }
                                } else {
                                    z7 = gte.n(parcel, readInt);
                                }
                            } else {
                                z6 = gte.n(parcel, readInt);
                            }
                        } else {
                            z5 = gte.n(parcel, readInt);
                        }
                    } else {
                        z4 = gte.n(parcel, readInt);
                    }
                }
                gte.m(parcel, z3);
                return new vff(z4, z5, z6, z7, z8);
            case 1:
                int z9 = gte.z(parcel);
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
                                        gte.y(parcel, readInt2);
                                    } else {
                                        i6 = gte.u(parcel, readInt2);
                                    }
                                } else {
                                    j = gte.w(parcel, readInt2);
                                }
                            } else {
                                i5 = gte.u(parcel, readInt2);
                            }
                        } else {
                            i4 = gte.u(parcel, readInt2);
                        }
                    } else {
                        i = gte.u(parcel, readInt2);
                    }
                }
                gte.m(parcel, z9);
                ?? obj = new Object();
                obj.a = i;
                obj.b = i4;
                obj.c = i5;
                obj.d = j;
                obj.e = i6;
                return obj;
            case 2:
                int z10 = gte.z(parcel);
                long j2 = Long.MAX_VALUE;
                int i7 = 0;
                boolean z11 = false;
                String str4 = null;
                bnd bndVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    if (c3 != 5) {
                                        gte.y(parcel, readInt3);
                                    } else {
                                        bndVar = (bnd) gte.g(parcel, readInt3, bnd.CREATOR);
                                    }
                                } else {
                                    str4 = gte.h(parcel, readInt3);
                                }
                            } else {
                                z11 = gte.n(parcel, readInt3);
                            }
                        } else {
                            i7 = gte.u(parcel, readInt3);
                        }
                    } else {
                        j2 = gte.w(parcel, readInt3);
                    }
                }
                gte.m(parcel, z10);
                return new jx5(j2, i7, z11, str4, bndVar);
            case 3:
                int z12 = gte.z(parcel);
                String str5 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                if (c4 != 4) {
                                    gte.y(parcel, readInt4);
                                } else {
                                    commonWalletObject = (CommonWalletObject) gte.g(parcel, readInt4, CommonWalletObject.CREATOR);
                                }
                            } else {
                                str5 = gte.h(parcel, readInt4);
                            }
                        } else {
                            str = gte.h(parcel, readInt4);
                        }
                    } else {
                        i3 = gte.u(parcel, readInt4);
                    }
                }
                gte.m(parcel, z12);
                return new go7(i3, str, str5, commonWalletObject);
            case 4:
                int z13 = gte.z(parcel);
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        gte.y(parcel, readInt5);
                    } else {
                        gte.n(parcel, readInt5);
                    }
                }
                gte.m(parcel, z13);
                return new Object();
            case 5:
                int z14 = gte.z(parcel);
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        gte.y(parcel, readInt6);
                    } else {
                        z2 = gte.n(parcel, readInt6);
                    }
                }
                gte.m(parcel, z14);
                return new iff(z2);
            case 6:
                int z15 = gte.z(parcel);
                int i8 = 1000;
                long j3 = 0;
                int i9 = 1;
                int i10 = 1;
                v5d[] v5dVarArr = null;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i9 = gte.u(parcel, readInt7);
                            break;
                        case 2:
                            i10 = gte.u(parcel, readInt7);
                            break;
                        case 3:
                            j3 = gte.w(parcel, readInt7);
                            break;
                        case 4:
                            i8 = gte.u(parcel, readInt7);
                            break;
                        case 5:
                            v5dVarArr = (v5d[]) gte.k(parcel, readInt7, v5d.CREATOR);
                            break;
                        case 6:
                            gte.n(parcel, readInt7);
                            break;
                        default:
                            gte.y(parcel, readInt7);
                            break;
                    }
                }
                gte.m(parcel, z15);
                return new LocationAvailability(i8, i9, i10, j3, v5dVarArr);
            case 7:
                try {
                    return v34.a(parcel.readInt());
                } catch (u34 e) {
                    throw new IllegalArgumentException(e);
                }
            case 8:
                int z16 = gte.z(parcel);
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
                bnd bndVar2 = null;
                long j8 = 600000;
                float f = 0.0f;
                long j9 = -1;
                while (parcel.dataPosition() < z16) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i11 = gte.u(parcel, readInt8);
                            break;
                        case 2:
                            j7 = gte.w(parcel, readInt8);
                            break;
                        case 3:
                            j8 = gte.w(parcel, readInt8);
                            break;
                        case 4:
                        default:
                            gte.y(parcel, readInt8);
                            break;
                        case 5:
                            j4 = gte.w(parcel, readInt8);
                            break;
                        case 6:
                            i12 = gte.u(parcel, readInt8);
                            break;
                        case 7:
                            f = gte.r(parcel, readInt8);
                            break;
                        case '\b':
                            j6 = gte.w(parcel, readInt8);
                            break;
                        case '\t':
                            z17 = gte.n(parcel, readInt8);
                            break;
                        case '\n':
                            j5 = gte.w(parcel, readInt8);
                            break;
                        case 11:
                            j9 = gte.w(parcel, readInt8);
                            break;
                        case '\f':
                            i13 = gte.u(parcel, readInt8);
                            break;
                        case '\r':
                            i14 = gte.u(parcel, readInt8);
                            break;
                        case 14:
                            str6 = gte.h(parcel, readInt8);
                            break;
                        case 15:
                            z18 = gte.n(parcel, readInt8);
                            break;
                        case 16:
                            workSource = (WorkSource) gte.g(parcel, readInt8, WorkSource.CREATOR);
                            break;
                        case 17:
                            bndVar2 = (bnd) gte.g(parcel, readInt8, bnd.CREATOR);
                            break;
                    }
                }
                gte.m(parcel, z16);
                return new LocationRequest(i11, j7, j8, j6, j4, j5, i12, f, z17, j9, i13, i14, str6, z18, workSource, bndVar2);
            case 9:
                int z19 = gte.z(parcel);
                String str7 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 != 2) {
                        if (c5 != 3) {
                            if (c5 != 4) {
                                gte.y(parcel, readInt9);
                            } else {
                                str7 = gte.h(parcel, readInt9);
                            }
                        } else {
                            i2 = gte.u(parcel, readInt9);
                        }
                    } else {
                        str3 = gte.h(parcel, readInt9);
                    }
                }
                gte.m(parcel, z19);
                return new wj7(str3, i2, str7);
            case 10:
                int z20 = gte.z(parcel);
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
                            str8 = gte.h(parcel, readInt10);
                            break;
                        case 2:
                            str9 = gte.h(parcel, readInt10);
                            break;
                        case 3:
                            str10 = gte.h(parcel, readInt10);
                            break;
                        case 4:
                            str11 = gte.h(parcel, readInt10);
                            break;
                        case 5:
                            str12 = gte.h(parcel, readInt10);
                            break;
                        case 6:
                            i15 = gte.u(parcel, readInt10);
                            break;
                        case 7:
                            str13 = gte.h(parcel, readInt10);
                            break;
                        default:
                            gte.y(parcel, readInt10);
                            break;
                    }
                }
                gte.m(parcel, z20);
                return new k59(str8, str9, str10, str11, str12, i15, str13);
            case 11:
                int z21 = gte.z(parcel);
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        gte.y(parcel, readInt11);
                    } else {
                        str2 = gte.h(parcel, readInt11);
                    }
                }
                gte.m(parcel, z21);
                return new v84(str2);
            case 12:
                int z22 = gte.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        gte.y(parcel, readInt12);
                    } else {
                        list = gte.l(parcel, readInt12, Location.CREATOR);
                    }
                }
                gte.m(parcel, z22);
                return new LocationResult(list);
            case 13:
                int z23 = gte.z(parcel);
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
                            i16 = gte.u(parcel, readInt13);
                            break;
                        case 2:
                            z24 = gte.n(parcel, readInt13);
                            break;
                        case 3:
                            str14 = gte.h(parcel, readInt13);
                            break;
                        case 4:
                            str15 = gte.h(parcel, readInt13);
                            break;
                        case 5:
                            bArr = gte.b(parcel, readInt13);
                            break;
                        case 6:
                            z25 = gte.n(parcel, readInt13);
                            break;
                        default:
                            gte.y(parcel, readInt13);
                            break;
                    }
                }
                gte.m(parcel, z23);
                return new kbd(i16, z24, str14, str15, bArr, z25);
            case 14:
                int z26 = gte.z(parcel);
                int i17 = -1;
                long j10 = 0;
                int i18 = 0;
                boolean z27 = false;
                int i19 = 0;
                vhe vheVar = null;
                String str16 = null;
                v5e v5eVar = null;
                String str17 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            vheVar = (vhe) gte.g(parcel, readInt14, vhe.CREATOR);
                            break;
                        case 2:
                            j10 = gte.w(parcel, readInt14);
                            break;
                        case 3:
                            i18 = gte.u(parcel, readInt14);
                            break;
                        case 4:
                            str16 = gte.h(parcel, readInt14);
                            break;
                        case 5:
                            v5eVar = (v5e) gte.g(parcel, readInt14, v5e.CREATOR);
                            break;
                        case 6:
                            z27 = gte.n(parcel, readInt14);
                            break;
                        case 7:
                            i17 = gte.u(parcel, readInt14);
                            break;
                        case '\b':
                            i19 = gte.u(parcel, readInt14);
                            break;
                        case '\t':
                            str17 = gte.h(parcel, readInt14);
                            break;
                        default:
                            gte.y(parcel, readInt14);
                            break;
                    }
                }
                gte.m(parcel, z26);
                return new nhf(vheVar, j10, i18, str16, v5eVar, z27, i17, i19, str17);
            case 15:
                int z28 = gte.z(parcel);
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt15 = parcel.readInt();
                    char c6 = (char) readInt15;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                gte.y(parcel, readInt15);
                            } else {
                                z29 = gte.n(parcel, readInt15);
                            }
                        } else {
                            z = gte.n(parcel, readInt15);
                        }
                    } else {
                        arrayList = gte.l(parcel, readInt15, LocationRequest.CREATOR);
                    }
                }
                gte.m(parcel, z28);
                return new jb6(arrayList, z, z29);
            default:
                int z30 = gte.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        gte.y(parcel, readInt16);
                    } else {
                        pendingIntent = (PendingIntent) gte.g(parcel, readInt16, PendingIntent.CREATOR);
                    }
                }
                gte.m(parcel, z30);
                ?? obj2 = new Object();
                obj2.a = pendingIntent;
                return obj2;
        }
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vff[i];
            case 1:
                return new vcf[i];
            case 2:
                return new jx5[i];
            case 3:
                return new go7[i];
            case 4:
                return new hff[i];
            case 5:
                return new iff[i];
            case 6:
                return new LocationAvailability[i];
            case 7:
                return new v34[i];
            case 8:
                return new LocationRequest[i];
            case 9:
                return new wj7[i];
            case 10:
                return new k59[i];
            case 11:
                return new v84[i];
            case 12:
                return new LocationResult[i];
            case 13:
                return new kbd[i];
            case 14:
                return new nhf[i];
            case 15:
                return new jb6[i];
            default:
                return new ny7[i];
        }
    }
}
