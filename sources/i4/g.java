package i4;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;
import m.o0;
import o6.a1;
import o6.u;
public final class g implements Parcelable.Creator {
    public final int f8234a;

    public g(int i10) {
        this.f8234a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        boolean z10;
        switch (this.f8234a) {
            case 0:
                return new j(parcel);
            case 1:
                return new k(parcel.readLong(), parcel.readLong());
            case 2:
                int A = ce.b.A(parcel);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                String str = null;
                ArrayList arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                String str2 = null;
                String str3 = null;
                i8.f fVar = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                int i10 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    String str11 = str3;
                    switch ((char) readInt) {
                        case 2:
                            str = ce.b.i(parcel, readInt);
                            break;
                        case 3:
                            str4 = ce.b.i(parcel, readInt);
                            break;
                        case 4:
                            str5 = ce.b.i(parcel, readInt);
                            break;
                        case 5:
                            str6 = ce.b.i(parcel, readInt);
                            break;
                        case 6:
                            str7 = ce.b.i(parcel, readInt);
                            break;
                        case 7:
                            str8 = ce.b.i(parcel, readInt);
                            break;
                        case '\b':
                            str9 = ce.b.i(parcel, readInt);
                            break;
                        case '\t':
                            str2 = ce.b.i(parcel, readInt);
                            break;
                        case '\n':
                            i10 = ce.b.v(parcel, readInt);
                            break;
                        case 11:
                            arrayList = ce.b.m(parcel, readInt, i8.h.CREATOR);
                            break;
                        case '\f':
                            fVar = (i8.f) ce.b.h(parcel, readInt, i8.f.CREATOR);
                            break;
                        case '\r':
                            arrayList2 = ce.b.m(parcel, readInt, LatLng.CREATOR);
                            break;
                        case 14:
                            str3 = ce.b.i(parcel, readInt);
                            continue;
                        case 15:
                            str10 = ce.b.i(parcel, readInt);
                            break;
                        case 16:
                            arrayList4 = ce.b.m(parcel, readInt, i8.b.CREATOR);
                            break;
                        case 17:
                            z11 = ce.b.o(parcel, readInt);
                            break;
                        case 18:
                            arrayList5 = ce.b.m(parcel, readInt, i8.g.CREATOR);
                            break;
                        case 19:
                            arrayList6 = ce.b.m(parcel, readInt, i8.e.CREATOR);
                            break;
                        case 20:
                            arrayList7 = ce.b.m(parcel, readInt, i8.g.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt);
                            break;
                    }
                    str3 = str11;
                }
                ce.b.n(parcel, A);
                ?? obj = new Object();
                obj.f4959a = str;
                obj.f4960b = str4;
                obj.f4961c = str5;
                obj.d = str6;
                obj.f4962e = str7;
                obj.f4963f = str8;
                obj.h = str9;
                obj.f4964n = str2;
                obj.f4965r = i10;
                obj.f4966s = arrayList;
                obj.v = fVar;
                obj.f4967w = arrayList2;
                obj.f4968x = str3;
                obj.f4969y = str10;
                obj.A = arrayList4;
                obj.B = z11;
                obj.C = arrayList5;
                obj.D = arrayList6;
                obj.E = arrayList7;
                return obj;
            case 3:
                int A2 = ce.b.A(parcel);
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 != 2) {
                        if (c3 != 3) {
                            ce.b.z(parcel, readInt2);
                        } else {
                            str13 = ce.b.i(parcel, readInt2);
                        }
                    } else {
                        str12 = ce.b.i(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                ?? obj2 = new Object();
                obj2.f8558a = str12;
                obj2.f8559b = str13;
                return obj2;
            case 4:
                int A3 = ce.b.A(parcel);
                ArrayList arrayList8 = new ArrayList();
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    char c6 = (char) readInt3;
                    if (c6 != 2) {
                        if (c6 != 3) {
                            if (c6 != 4) {
                                ce.b.z(parcel, readInt3);
                            } else {
                                arrayList8 = ce.b.m(parcel, readInt3, i8.a.CREATOR);
                            }
                        } else {
                            str15 = ce.b.i(parcel, readInt3);
                        }
                    } else {
                        str14 = ce.b.i(parcel, readInt3);
                    }
                }
                ce.b.n(parcel, A3);
                ?? obj3 = new Object();
                obj3.f8560a = str14;
                obj3.f8561b = str15;
                obj3.f8562c = arrayList8;
                return obj3;
            case 5:
                int A4 = ce.b.A(parcel);
                int i11 = 0;
                String str16 = null;
                long j10 = 0;
                int i12 = -1;
                double d = 0.0d;
                String str17 = null;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            i11 = ce.b.v(parcel, readInt4);
                            break;
                        case 3:
                            str16 = ce.b.i(parcel, readInt4);
                            break;
                        case 4:
                            d = ce.b.r(parcel, readInt4);
                            break;
                        case 5:
                            str17 = ce.b.i(parcel, readInt4);
                            break;
                        case 6:
                            j10 = ce.b.x(parcel, readInt4);
                            break;
                        case 7:
                            i12 = ce.b.v(parcel, readInt4);
                            break;
                        default:
                            ce.b.z(parcel, readInt4);
                            break;
                    }
                }
                ce.b.n(parcel, A4);
                ?? obj4 = new Object();
                obj4.f8566a = i11;
                obj4.f8567b = str16;
                obj4.f8568c = d;
                obj4.d = str17;
                obj4.f8569e = j10;
                obj4.f8570f = i12;
                return obj4;
            case 6:
                int A5 = ce.b.A(parcel);
                String str18 = null;
                i8.d dVar = null;
                i8.f fVar2 = null;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    char c10 = (char) readInt5;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 5) {
                                ce.b.z(parcel, readInt5);
                            } else {
                                fVar2 = (i8.f) ce.b.h(parcel, readInt5, i8.f.CREATOR);
                            }
                        } else {
                            dVar = (i8.d) ce.b.h(parcel, readInt5, i8.d.CREATOR);
                        }
                    } else {
                        str18 = ce.b.i(parcel, readInt5);
                    }
                }
                ce.b.n(parcel, A5);
                ?? obj5 = new Object();
                obj5.f8563a = str18;
                obj5.f8564b = dVar;
                obj5.f8565c = fVar2;
                return obj5;
            case 7:
                int A6 = ce.b.A(parcel);
                String str19 = null;
                String str20 = null;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    char c11 = (char) readInt6;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            ce.b.z(parcel, readInt6);
                        } else {
                            str20 = ce.b.i(parcel, readInt6);
                        }
                    } else {
                        str19 = ce.b.i(parcel, readInt6);
                    }
                }
                ce.b.n(parcel, A6);
                ?? obj6 = new Object();
                obj6.f8571a = str19;
                obj6.f8572b = str20;
                return obj6;
            case 8:
                int A7 = ce.b.A(parcel);
                long j11 = 0;
                long j12 = 0;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    char c12 = (char) readInt7;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            ce.b.z(parcel, readInt7);
                        } else {
                            j12 = ce.b.x(parcel, readInt7);
                        }
                    } else {
                        j11 = ce.b.x(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A7);
                ?? obj7 = new Object();
                obj7.f8573a = j11;
                obj7.f8574b = j12;
                return obj7;
            case 9:
                int A8 = ce.b.A(parcel);
                String str21 = null;
                String str22 = null;
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            ce.b.z(parcel, readInt8);
                        } else {
                            str22 = ce.b.i(parcel, readInt8);
                        }
                    } else {
                        str21 = ce.b.i(parcel, readInt8);
                    }
                }
                ce.b.n(parcel, A8);
                ?? obj8 = new Object();
                obj8.f8575a = str21;
                obj8.f8576b = str22;
                return obj8;
            case 10:
                int A9 = ce.b.A(parcel);
                String str23 = null;
                String str24 = null;
                i8.f fVar3 = null;
                i8.g gVar = null;
                i8.g gVar2 = null;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            if (c14 != 4) {
                                if (c14 != 5) {
                                    if (c14 != 6) {
                                        ce.b.z(parcel, readInt9);
                                    } else {
                                        gVar2 = (i8.g) ce.b.h(parcel, readInt9, i8.g.CREATOR);
                                    }
                                } else {
                                    gVar = (i8.g) ce.b.h(parcel, readInt9, i8.g.CREATOR);
                                }
                            } else {
                                fVar3 = (i8.f) ce.b.h(parcel, readInt9, i8.f.CREATOR);
                            }
                        } else {
                            str24 = ce.b.i(parcel, readInt9);
                        }
                    } else {
                        str23 = ce.b.i(parcel, readInt9);
                    }
                }
                ce.b.n(parcel, A9);
                ?? obj9 = new Object();
                obj9.f8577a = str23;
                obj9.f8578b = str24;
                obj9.f8579c = fVar3;
                obj9.d = gVar;
                obj9.f8580e = gVar2;
                return obj9;
            case 11:
                return new e4.a(parcel);
            case 12:
                int A10 = ce.b.A(parcel);
                j5.d dVar2 = null;
                j5.a aVar = null;
                String str25 = null;
                j5.c cVar = null;
                j5.b bVar = null;
                boolean z12 = false;
                int i13 = 0;
                boolean z13 = false;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            dVar2 = (j5.d) ce.b.h(parcel, readInt10, j5.d.CREATOR);
                            break;
                        case 2:
                            aVar = (j5.a) ce.b.h(parcel, readInt10, j5.a.CREATOR);
                            break;
                        case 3:
                            str25 = ce.b.i(parcel, readInt10);
                            break;
                        case 4:
                            z12 = ce.b.o(parcel, readInt10);
                            break;
                        case 5:
                            i13 = ce.b.v(parcel, readInt10);
                            break;
                        case 6:
                            cVar = (j5.c) ce.b.h(parcel, readInt10, j5.c.CREATOR);
                            break;
                        case 7:
                            bVar = (j5.b) ce.b.h(parcel, readInt10, j5.b.CREATOR);
                            break;
                        case '\b':
                            z13 = ce.b.o(parcel, readInt10);
                            break;
                        default:
                            ce.b.z(parcel, readInt10);
                            break;
                    }
                }
                ce.b.n(parcel, A10);
                return new j5.e(dVar2, aVar, str25, z12, i13, cVar, bVar, z13);
            case 13:
                int A11 = ce.b.A(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    if (((char) readInt11) != 1) {
                        ce.b.z(parcel, readInt11);
                    } else {
                        pendingIntent = (PendingIntent) ce.b.h(parcel, readInt11, PendingIntent.CREATOR);
                    }
                }
                ce.b.n(parcel, A11);
                return new j5.f(pendingIntent);
            case 14:
                int A12 = ce.b.A(parcel);
                String str26 = null;
                String str27 = null;
                String str28 = null;
                ArrayList arrayList9 = null;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            z14 = ce.b.o(parcel, readInt12);
                            break;
                        case 2:
                            str26 = ce.b.i(parcel, readInt12);
                            break;
                        case 3:
                            str27 = ce.b.i(parcel, readInt12);
                            break;
                        case 4:
                            z15 = ce.b.o(parcel, readInt12);
                            break;
                        case 5:
                            str28 = ce.b.i(parcel, readInt12);
                            break;
                        case 6:
                            arrayList9 = ce.b.k(parcel, readInt12);
                            break;
                        case 7:
                            z16 = ce.b.o(parcel, readInt12);
                            break;
                        default:
                            ce.b.z(parcel, readInt12);
                            break;
                    }
                }
                ce.b.n(parcel, A12);
                return new j5.a(z14, str26, str27, z15, str28, arrayList9, z16);
            case 15:
                int A13 = ce.b.A(parcel);
                String str29 = null;
                boolean z17 = false;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 != 1) {
                        if (c15 != 2) {
                            ce.b.z(parcel, readInt13);
                        } else {
                            str29 = ce.b.i(parcel, readInt13);
                        }
                    } else {
                        z17 = ce.b.o(parcel, readInt13);
                    }
                }
                ce.b.n(parcel, A13);
                return new j5.b(str29, z17);
            case 16:
                int A14 = ce.b.A(parcel);
                byte[] bArr = null;
                String str30 = null;
                boolean z18 = false;
                while (parcel.dataPosition() < A14) {
                    int readInt14 = parcel.readInt();
                    char c16 = (char) readInt14;
                    if (c16 != 1) {
                        if (c16 != 2) {
                            if (c16 != 3) {
                                ce.b.z(parcel, readInt14);
                            } else {
                                str30 = ce.b.i(parcel, readInt14);
                            }
                        } else {
                            bArr = ce.b.c(parcel, readInt14);
                        }
                    } else {
                        z18 = ce.b.o(parcel, readInt14);
                    }
                }
                ce.b.n(parcel, A14);
                return new j5.c(z18, bArr, str30);
            case 17:
                int A15 = ce.b.A(parcel);
                boolean z19 = false;
                while (parcel.dataPosition() < A15) {
                    int readInt15 = parcel.readInt();
                    if (((char) readInt15) != 1) {
                        ce.b.z(parcel, readInt15);
                    } else {
                        z19 = ce.b.o(parcel, readInt15);
                    }
                }
                ce.b.n(parcel, A15);
                return new j5.d(z19);
            case 18:
                int A16 = ce.b.A(parcel);
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                Uri uri = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                u uVar = null;
                while (parcel.dataPosition() < A16) {
                    int readInt16 = parcel.readInt();
                    switch ((char) readInt16) {
                        case 1:
                            str31 = ce.b.i(parcel, readInt16);
                            break;
                        case 2:
                            str32 = ce.b.i(parcel, readInt16);
                            break;
                        case 3:
                            str33 = ce.b.i(parcel, readInt16);
                            break;
                        case 4:
                            str34 = ce.b.i(parcel, readInt16);
                            break;
                        case 5:
                            uri = (Uri) ce.b.h(parcel, readInt16, Uri.CREATOR);
                            break;
                        case 6:
                            str35 = ce.b.i(parcel, readInt16);
                            break;
                        case 7:
                            str36 = ce.b.i(parcel, readInt16);
                            break;
                        case '\b':
                            str37 = ce.b.i(parcel, readInt16);
                            break;
                        case '\t':
                            uVar = (u) ce.b.h(parcel, readInt16, u.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt16);
                            break;
                    }
                }
                ce.b.n(parcel, A16);
                return new j5.g(str31, str32, str33, str34, uri, str35, str36, str37, uVar);
            case 19:
                int A17 = ce.b.A(parcel);
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                String str42 = null;
                ArrayList arrayList10 = null;
                int i14 = 0;
                int i15 = 0;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                int i16 = 0;
                while (parcel.dataPosition() < A17) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            str38 = ce.b.i(parcel, readInt17);
                            break;
                        case 3:
                            str39 = ce.b.i(parcel, readInt17);
                            break;
                        case 4:
                            i14 = ce.b.v(parcel, readInt17);
                            break;
                        case 5:
                            i15 = ce.b.v(parcel, readInt17);
                            break;
                        case 6:
                            z20 = ce.b.o(parcel, readInt17);
                            break;
                        case 7:
                            z21 = ce.b.o(parcel, readInt17);
                            break;
                        case '\b':
                            str40 = ce.b.i(parcel, readInt17);
                            break;
                        case '\t':
                            z22 = ce.b.o(parcel, readInt17);
                            break;
                        case '\n':
                            str41 = ce.b.i(parcel, readInt17);
                            break;
                        case 11:
                            str42 = ce.b.i(parcel, readInt17);
                            break;
                        case '\f':
                            i16 = ce.b.v(parcel, readInt17);
                            break;
                        case '\r':
                            arrayList10 = ce.b.k(parcel, readInt17);
                            break;
                        default:
                            ce.b.z(parcel, readInt17);
                            break;
                    }
                }
                ce.b.n(parcel, A17);
                return new ConnectionConfiguration(str38, str39, i14, i15, z20, z21, str40, z22, str41, str42, i16, arrayList10);
            case 20:
                return new k4.b(parcel);
            case 21:
                return new ParcelImpl(parcel);
            case 22:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                baseSavedState.f16621a = z10;
                return baseSavedState;
            case 23:
                int A18 = ce.b.A(parcel);
                Bundle bundle = null;
                int i17 = 0;
                int i18 = 0;
                while (parcel.dataPosition() < A18) {
                    int readInt18 = parcel.readInt();
                    char c17 = (char) readInt18;
                    if (c17 != 1) {
                        if (c17 != 2) {
                            if (c17 != 3) {
                                ce.b.z(parcel, readInt18);
                            } else {
                                bundle = ce.b.b(parcel, readInt18);
                            }
                        } else {
                            i18 = ce.b.v(parcel, readInt18);
                        }
                    } else {
                        i17 = ce.b.v(parcel, readInt18);
                    }
                }
                ce.b.n(parcel, A18);
                return new m5.a(i17, i18, bundle);
            case 24:
                int A19 = ce.b.A(parcel);
                String str43 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < A19) {
                    int readInt19 = parcel.readInt();
                    char c18 = (char) readInt19;
                    if (c18 != 2) {
                        if (c18 != 5) {
                            ce.b.z(parcel, readInt19);
                        } else {
                            googleSignInOptions = (GoogleSignInOptions) ce.b.h(parcel, readInt19, GoogleSignInOptions.CREATOR);
                        }
                    } else {
                        str43 = ce.b.i(parcel, readInt19);
                    }
                }
                ce.b.n(parcel, A19);
                return new SignInConfiguration(str43, googleSignInOptions);
            case 25:
                try {
                    return Transport.a(parcel.readString());
                } catch (m6.a e10) {
                    throw new RuntimeException(e10);
                }
            case 26:
                return new n3.c(parcel);
            case 27:
                return new n3.b(parcel);
            case 28:
                try {
                    return o6.c.a(parcel.readString());
                } catch (o6.b e11) {
                    throw new RuntimeException(e11);
                }
            default:
                int A20 = ce.b.A(parcel);
                boolean z23 = false;
                while (parcel.dataPosition() < A20) {
                    int readInt20 = parcel.readInt();
                    if (((char) readInt20) != 1) {
                        ce.b.z(parcel, readInt20);
                    } else {
                        z23 = ce.b.o(parcel, readInt20);
                    }
                }
                ce.b.n(parcel, A20);
                return new a1(z23);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f8234a) {
            case 0:
                return new j[i10];
            case 1:
                return new k[i10];
            case 2:
                return new CommonWalletObject[i10];
            case 3:
                return new i8.a[i10];
            case 4:
                return new i8.b[i10];
            case 5:
                return new i8.d[i10];
            case 6:
                return new i8.c[i10];
            case 7:
                return new i8.e[i10];
            case 8:
                return new i8.f[i10];
            case 9:
                return new i8.g[i10];
            case 10:
                return new i8.h[i10];
            case 11:
                return new j4.a[i10];
            case 12:
                return new j5.e[i10];
            case 13:
                return new j5.f[i10];
            case 14:
                return new j5.a[i10];
            case 15:
                return new j5.b[i10];
            case 16:
                return new j5.c[i10];
            case 17:
                return new j5.d[i10];
            case 18:
                return new j5.g[i10];
            case 19:
                return new ConnectionConfiguration[i10];
            case 20:
                return new k4.b[i10];
            case 21:
                return new ParcelImpl[i10];
            case 22:
                return new o0[i10];
            case 23:
                return new m5.a[i10];
            case 24:
                return new SignInConfiguration[i10];
            case 25:
                return new Transport[i10];
            case 26:
                return new n3.c[i10];
            case 27:
                return new n3.b[i10];
            case 28:
                return new o6.c[i10];
            default:
                return new a1[i10];
        }
    }
}
