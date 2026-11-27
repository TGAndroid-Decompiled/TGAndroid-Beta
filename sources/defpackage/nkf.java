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
public final class nkf implements Parcelable.Creator {
    public final byte a;

    public nkf(byte b) {
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
                int z3 = aye.z(parcel);
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
                                        aye.y(parcel, readInt);
                                    } else {
                                        z8 = aye.n(parcel, readInt);
                                    }
                                } else {
                                    z7 = aye.n(parcel, readInt);
                                }
                            } else {
                                z6 = aye.n(parcel, readInt);
                            }
                        } else {
                            z5 = aye.n(parcel, readInt);
                        }
                    } else {
                        z4 = aye.n(parcel, readInt);
                    }
                }
                aye.m(parcel, z3);
                return new lkf(z4, z5, z6, z7, z8);
            case 1:
                int z9 = aye.z(parcel);
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
                                        aye.y(parcel, readInt2);
                                    } else {
                                        i6 = aye.u(parcel, readInt2);
                                    }
                                } else {
                                    j = aye.w(parcel, readInt2);
                                }
                            } else {
                                i5 = aye.u(parcel, readInt2);
                            }
                        } else {
                            i4 = aye.u(parcel, readInt2);
                        }
                    } else {
                        i = aye.u(parcel, readInt2);
                    }
                }
                aye.m(parcel, z9);
                ?? obj = new Object();
                obj.a = i;
                obj.b = i4;
                obj.c = i5;
                obj.d = j;
                obj.e = i6;
                return obj;
            case 2:
                int z10 = aye.z(parcel);
                long j2 = Long.MAX_VALUE;
                int i7 = 0;
                boolean z11 = false;
                String str4 = null;
                srd srdVar = null;
                while (parcel.dataPosition() < z10) {
                    int readInt3 = parcel.readInt();
                    char c3 = (char) readInt3;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    if (c3 != 5) {
                                        aye.y(parcel, readInt3);
                                    } else {
                                        srdVar = (srd) aye.g(parcel, readInt3, srd.CREATOR);
                                    }
                                } else {
                                    str4 = aye.h(parcel, readInt3);
                                }
                            } else {
                                z11 = aye.n(parcel, readInt3);
                            }
                        } else {
                            i7 = aye.u(parcel, readInt3);
                        }
                    } else {
                        j2 = aye.w(parcel, readInt3);
                    }
                }
                aye.m(parcel, z10);
                return new oz5(j2, i7, z11, str4, srdVar);
            case 3:
                int z12 = aye.z(parcel);
                String str5 = null;
                CommonWalletObject commonWalletObject = null;
                while (parcel.dataPosition() < z12) {
                    int readInt4 = parcel.readInt();
                    char c4 = (char) readInt4;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                if (c4 != 4) {
                                    aye.y(parcel, readInt4);
                                } else {
                                    commonWalletObject = (CommonWalletObject) aye.g(parcel, readInt4, CommonWalletObject.CREATOR);
                                }
                            } else {
                                str5 = aye.h(parcel, readInt4);
                            }
                        } else {
                            str = aye.h(parcel, readInt4);
                        }
                    } else {
                        i3 = aye.u(parcel, readInt4);
                    }
                }
                aye.m(parcel, z12);
                return new gr7(i3, str, str5, commonWalletObject);
            case 4:
                int z13 = aye.z(parcel);
                while (parcel.dataPosition() < z13) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        aye.y(parcel, readInt5);
                    } else {
                        aye.n(parcel, readInt5);
                    }
                }
                aye.m(parcel, z13);
                return new Object();
            case 5:
                int z14 = aye.z(parcel);
                while (parcel.dataPosition() < z14) {
                    int readInt6 = parcel.readInt();
                    if (((char) readInt6) != 1) {
                        aye.y(parcel, readInt6);
                    } else {
                        z2 = aye.n(parcel, readInt6);
                    }
                }
                aye.m(parcel, z14);
                return new yjf(z2);
            case 6:
                int z15 = aye.z(parcel);
                int i8 = 1000;
                long j3 = 0;
                int i9 = 1;
                int i10 = 1;
                oad[] oadVarArr = null;
                while (parcel.dataPosition() < z15) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            i9 = aye.u(parcel, readInt7);
                            break;
                        case 2:
                            i10 = aye.u(parcel, readInt7);
                            break;
                        case 3:
                            j3 = aye.w(parcel, readInt7);
                            break;
                        case 4:
                            i8 = aye.u(parcel, readInt7);
                            break;
                        case 5:
                            oadVarArr = (oad[]) aye.k(parcel, readInt7, oad.CREATOR);
                            break;
                        case 6:
                            aye.n(parcel, readInt7);
                            break;
                        default:
                            aye.y(parcel, readInt7);
                            break;
                    }
                }
                aye.m(parcel, z15);
                return new LocationAvailability(i8, i9, i10, j3, oadVarArr);
            case 7:
                try {
                    return q44.a(parcel.readInt());
                } catch (p44 e) {
                    throw new IllegalArgumentException(e);
                }
            case 8:
                int z16 = aye.z(parcel);
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
                srd srdVar2 = null;
                long j8 = 600000;
                float f = 0.0f;
                long j9 = -1;
                while (parcel.dataPosition() < z16) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i11 = aye.u(parcel, readInt8);
                            break;
                        case 2:
                            j7 = aye.w(parcel, readInt8);
                            break;
                        case 3:
                            j8 = aye.w(parcel, readInt8);
                            break;
                        case 4:
                        default:
                            aye.y(parcel, readInt8);
                            break;
                        case 5:
                            j4 = aye.w(parcel, readInt8);
                            break;
                        case 6:
                            i12 = aye.u(parcel, readInt8);
                            break;
                        case 7:
                            f = aye.r(parcel, readInt8);
                            break;
                        case '\b':
                            j6 = aye.w(parcel, readInt8);
                            break;
                        case '\t':
                            z17 = aye.n(parcel, readInt8);
                            break;
                        case '\n':
                            j5 = aye.w(parcel, readInt8);
                            break;
                        case 11:
                            j9 = aye.w(parcel, readInt8);
                            break;
                        case '\f':
                            i13 = aye.u(parcel, readInt8);
                            break;
                        case '\r':
                            i14 = aye.u(parcel, readInt8);
                            break;
                        case 14:
                            str6 = aye.h(parcel, readInt8);
                            break;
                        case 15:
                            z18 = aye.n(parcel, readInt8);
                            break;
                        case 16:
                            workSource = (WorkSource) aye.g(parcel, readInt8, WorkSource.CREATOR);
                            break;
                        case 17:
                            srdVar2 = (srd) aye.g(parcel, readInt8, srd.CREATOR);
                            break;
                    }
                }
                aye.m(parcel, z16);
                return new LocationRequest(i11, j7, j8, j6, j4, j5, i12, f, z17, j9, i13, i14, str6, z18, workSource, srdVar2);
            case 9:
                int z19 = aye.z(parcel);
                String str7 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c5 = (char) readInt9;
                    if (c5 != 2) {
                        if (c5 != 3) {
                            if (c5 != 4) {
                                aye.y(parcel, readInt9);
                            } else {
                                str7 = aye.h(parcel, readInt9);
                            }
                        } else {
                            i2 = aye.u(parcel, readInt9);
                        }
                    } else {
                        str3 = aye.h(parcel, readInt9);
                    }
                }
                aye.m(parcel, z19);
                return new vm7(str3, i2, str7);
            case 10:
                int z20 = aye.z(parcel);
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
                            str8 = aye.h(parcel, readInt10);
                            break;
                        case 2:
                            str9 = aye.h(parcel, readInt10);
                            break;
                        case 3:
                            str10 = aye.h(parcel, readInt10);
                            break;
                        case 4:
                            str11 = aye.h(parcel, readInt10);
                            break;
                        case 5:
                            str12 = aye.h(parcel, readInt10);
                            break;
                        case 6:
                            i15 = aye.u(parcel, readInt10);
                            break;
                        case 7:
                            str13 = aye.h(parcel, readInt10);
                            break;
                        default:
                            aye.y(parcel, readInt10);
                            break;
                    }
                }
                aye.m(parcel, z20);
                return new x89(str8, str9, str10, str11, str12, i15, str13);
            case 11:
                int z21 = aye.z(parcel);
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 2) {
                        aye.y(parcel, readInt11);
                    } else {
                        str2 = aye.h(parcel, readInt11);
                    }
                }
                aye.m(parcel, z21);
                return new ra4(str2);
            case 12:
                int z22 = aye.z(parcel);
                List list = LocationResult.b;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 1) {
                        aye.y(parcel, readInt12);
                    } else {
                        list = aye.l(parcel, readInt12, Location.CREATOR);
                    }
                }
                aye.m(parcel, z22);
                return new LocationResult(list);
            case 13:
                int z23 = aye.z(parcel);
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
                            i16 = aye.u(parcel, readInt13);
                            break;
                        case 2:
                            z24 = aye.n(parcel, readInt13);
                            break;
                        case 3:
                            str14 = aye.h(parcel, readInt13);
                            break;
                        case 4:
                            str15 = aye.h(parcel, readInt13);
                            break;
                        case 5:
                            bArr = aye.b(parcel, readInt13);
                            break;
                        case 6:
                            z25 = aye.n(parcel, readInt13);
                            break;
                        default:
                            aye.y(parcel, readInt13);
                            break;
                    }
                }
                aye.m(parcel, z23);
                return new dgd(i16, z24, str14, str15, bArr, z25);
            case 14:
                int z26 = aye.z(parcel);
                int i17 = -1;
                long j10 = 0;
                int i18 = 0;
                boolean z27 = false;
                int i19 = 0;
                mme mmeVar = null;
                String str16 = null;
                lae laeVar = null;
                String str17 = null;
                while (parcel.dataPosition() < z26) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 1:
                            mmeVar = (mme) aye.g(parcel, readInt14, mme.CREATOR);
                            break;
                        case 2:
                            j10 = aye.w(parcel, readInt14);
                            break;
                        case 3:
                            i18 = aye.u(parcel, readInt14);
                            break;
                        case 4:
                            str16 = aye.h(parcel, readInt14);
                            break;
                        case 5:
                            laeVar = (lae) aye.g(parcel, readInt14, lae.CREATOR);
                            break;
                        case 6:
                            z27 = aye.n(parcel, readInt14);
                            break;
                        case 7:
                            i17 = aye.u(parcel, readInt14);
                            break;
                        case '\b':
                            i19 = aye.u(parcel, readInt14);
                            break;
                        case '\t':
                            str17 = aye.h(parcel, readInt14);
                            break;
                        default:
                            aye.y(parcel, readInt14);
                            break;
                    }
                }
                aye.m(parcel, z26);
                return new dmf(mmeVar, j10, i18, str16, laeVar, z27, i17, i19, str17);
            case 15:
                int z28 = aye.z(parcel);
                boolean z29 = false;
                while (parcel.dataPosition() < z28) {
                    int readInt15 = parcel.readInt();
                    char c6 = (char) readInt15;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                aye.y(parcel, readInt15);
                            } else {
                                z29 = aye.n(parcel, readInt15);
                            }
                        } else {
                            z = aye.n(parcel, readInt15);
                        }
                    } else {
                        arrayList = aye.l(parcel, readInt15, LocationRequest.CREATOR);
                    }
                }
                aye.m(parcel, z28);
                return new nd6(arrayList, z, z29);
            default:
                int z30 = aye.z(parcel);
                while (parcel.dataPosition() < z30) {
                    int readInt16 = parcel.readInt();
                    if (((char) readInt16) != 1) {
                        aye.y(parcel, readInt16);
                    } else {
                        pendingIntent = (PendingIntent) aye.g(parcel, readInt16, PendingIntent.CREATOR);
                    }
                }
                aye.m(parcel, z30);
                ?? obj2 = new Object();
                obj2.a = pendingIntent;
                return obj2;
        }
    }

    @Override
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lkf[i];
            case 1:
                return new lhf[i];
            case 2:
                return new oz5[i];
            case 3:
                return new gr7[i];
            case 4:
                return new xjf[i];
            case 5:
                return new yjf[i];
            case 6:
                return new LocationAvailability[i];
            case 7:
                return new q44[i];
            case 8:
                return new LocationRequest[i];
            case 9:
                return new vm7[i];
            case 10:
                return new x89[i];
            case 11:
                return new ra4[i];
            case 12:
                return new LocationResult[i];
            case 13:
                return new dgd[i];
            case 14:
                return new dmf[i];
            case 15:
                return new nd6[i];
            default:
                return new t18[i];
        }
    }
}
