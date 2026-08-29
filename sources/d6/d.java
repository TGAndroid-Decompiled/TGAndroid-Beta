package d6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d8.e;
import d8.f;
import d8.g;
import d8.h;
import d8.i;
import d8.j;
import d8.k;
import d8.l;
import f2.i0;
import g4.m;
import g4.n;
import g4.o;
import q8.z;
public final class d implements Parcelable.Creator {
    public final int f5426a;

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5426a) {
            case 0:
                int A = ce.b.A(parcel);
                int i10 = 0;
                boolean z10 = false;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            ce.b.z(parcel, readInt);
                        } else {
                            z10 = ce.b.o(parcel, readInt);
                        }
                    } else {
                        i10 = ce.b.v(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new c(i10, z10);
            case 1:
                int A2 = ce.b.A(parcel);
                int i11 = 0;
                String[] strArr = null;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 != 2) {
                        if (c6 != 3) {
                            ce.b.z(parcel, readInt2);
                        } else {
                            strArr = ce.b.j(parcel, readInt2);
                        }
                    } else {
                        i11 = ce.b.v(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                ?? obj = new Object();
                obj.f5469a = i11;
                obj.f5470b = strArr;
                return obj;
            case 2:
                int A3 = ce.b.A(parcel);
                int i12 = 0;
                String str = null;
                String str2 = null;
                Point[] pointArr = null;
                f fVar = null;
                i iVar = null;
                j jVar = null;
                l lVar = null;
                k kVar = null;
                g gVar = null;
                byte[] bArr = null;
                d8.d dVar = null;
                d8.c cVar = null;
                e eVar = null;
                int i13 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    g gVar2 = gVar;
                    switch ((char) readInt3) {
                        case 2:
                            i12 = ce.b.v(parcel, readInt3);
                            break;
                        case 3:
                            str = ce.b.i(parcel, readInt3);
                            break;
                        case 4:
                            str2 = ce.b.i(parcel, readInt3);
                            break;
                        case 5:
                            i13 = ce.b.v(parcel, readInt3);
                            break;
                        case 6:
                            pointArr = (Point[]) ce.b.l(parcel, readInt3, Point.CREATOR);
                            break;
                        case 7:
                            fVar = (f) ce.b.h(parcel, readInt3, f.CREATOR);
                            break;
                        case '\b':
                            iVar = (i) ce.b.h(parcel, readInt3, i.CREATOR);
                            break;
                        case '\t':
                            jVar = (j) ce.b.h(parcel, readInt3, j.CREATOR);
                            break;
                        case '\n':
                            lVar = (l) ce.b.h(parcel, readInt3, l.CREATOR);
                            break;
                        case 11:
                            kVar = (k) ce.b.h(parcel, readInt3, k.CREATOR);
                            break;
                        case '\f':
                            gVar = (g) ce.b.h(parcel, readInt3, g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (d8.c) ce.b.h(parcel, readInt3, d8.c.CREATOR);
                            break;
                        case 14:
                            dVar = (d8.d) ce.b.h(parcel, readInt3, d8.d.CREATOR);
                            break;
                        case 15:
                            eVar = (e) ce.b.h(parcel, readInt3, e.CREATOR);
                            break;
                        case 16:
                            bArr = ce.b.c(parcel, readInt3);
                            break;
                        case 17:
                            z11 = ce.b.o(parcel, readInt3);
                            break;
                        default:
                            ce.b.z(parcel, readInt3);
                            break;
                    }
                    gVar = gVar2;
                }
                ce.b.n(parcel, A3);
                ?? obj2 = new Object();
                obj2.f5517a = i12;
                obj2.f5518b = str;
                obj2.A = bArr;
                obj2.f5519c = str2;
                obj2.d = i13;
                obj2.f5520e = pointArr;
                obj2.B = z11;
                obj2.f5521f = fVar;
                obj2.h = iVar;
                obj2.f5522n = jVar;
                obj2.f5523r = lVar;
                obj2.f5524s = kVar;
                obj2.v = gVar;
                obj2.f5525w = cVar;
                obj2.f5526x = dVar;
                obj2.f5527y = eVar;
                return obj2;
            case 3:
                int A4 = ce.b.A(parcel);
                int i14 = 0;
                String str3 = null;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                boolean z12 = false;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            i14 = ce.b.v(parcel, readInt4);
                            break;
                        case 3:
                            i15 = ce.b.v(parcel, readInt4);
                            break;
                        case 4:
                            i16 = ce.b.v(parcel, readInt4);
                            break;
                        case 5:
                            i17 = ce.b.v(parcel, readInt4);
                            break;
                        case 6:
                            i18 = ce.b.v(parcel, readInt4);
                            break;
                        case 7:
                            i19 = ce.b.v(parcel, readInt4);
                            break;
                        case '\b':
                            z12 = ce.b.o(parcel, readInt4);
                            break;
                        case '\t':
                            str3 = ce.b.i(parcel, readInt4);
                            break;
                        default:
                            ce.b.z(parcel, readInt4);
                            break;
                    }
                }
                ce.b.n(parcel, A4);
                ?? obj3 = new Object();
                obj3.f5471a = i14;
                obj3.f5472b = i15;
                obj3.f5473c = i16;
                obj3.d = i17;
                obj3.f5474e = i18;
                obj3.f5475f = i19;
                obj3.h = z12;
                obj3.f5476n = str3;
                return obj3;
            case 4:
                int A5 = ce.b.A(parcel);
                h hVar = null;
                String str4 = null;
                String str5 = null;
                i[] iVarArr = null;
                f[] fVarArr = null;
                String[] strArr2 = null;
                d8.a[] aVarArr = null;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            hVar = (h) ce.b.h(parcel, readInt5, h.CREATOR);
                            break;
                        case 3:
                            str4 = ce.b.i(parcel, readInt5);
                            break;
                        case 4:
                            str5 = ce.b.i(parcel, readInt5);
                            break;
                        case 5:
                            iVarArr = (i[]) ce.b.l(parcel, readInt5, i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (f[]) ce.b.l(parcel, readInt5, f.CREATOR);
                            break;
                        case 7:
                            strArr2 = ce.b.j(parcel, readInt5);
                            break;
                        case '\b':
                            aVarArr = (d8.a[]) ce.b.l(parcel, readInt5, d8.a.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt5);
                            break;
                    }
                }
                ce.b.n(parcel, A5);
                ?? obj4 = new Object();
                obj4.f5482a = hVar;
                obj4.f5483b = str4;
                obj4.f5484c = str5;
                obj4.d = iVarArr;
                obj4.f5485e = fVarArr;
                obj4.f5486f = strArr2;
                obj4.h = aVarArr;
                return obj4;
            case 5:
                int A6 = ce.b.A(parcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                d8.b bVar = null;
                d8.b bVar2 = null;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            str6 = ce.b.i(parcel, readInt6);
                            break;
                        case 3:
                            str7 = ce.b.i(parcel, readInt6);
                            break;
                        case 4:
                            str8 = ce.b.i(parcel, readInt6);
                            break;
                        case 5:
                            str9 = ce.b.i(parcel, readInt6);
                            break;
                        case 6:
                            str10 = ce.b.i(parcel, readInt6);
                            break;
                        case 7:
                            bVar = (d8.b) ce.b.h(parcel, readInt6, d8.b.CREATOR);
                            break;
                        case '\b':
                            bVar2 = (d8.b) ce.b.h(parcel, readInt6, d8.b.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt6);
                            break;
                    }
                }
                ce.b.n(parcel, A6);
                ?? obj5 = new Object();
                obj5.f5477a = str6;
                obj5.f5478b = str7;
                obj5.f5479c = str8;
                obj5.d = str9;
                obj5.f5480e = str10;
                obj5.f5481f = bVar;
                obj5.h = bVar2;
                return obj5;
            case 6:
                int A7 = ce.b.A(parcel);
                int i20 = 0;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    char c10 = (char) readInt7;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    ce.b.z(parcel, readInt7);
                                } else {
                                    str13 = ce.b.i(parcel, readInt7);
                                }
                            } else {
                                str12 = ce.b.i(parcel, readInt7);
                            }
                        } else {
                            str11 = ce.b.i(parcel, readInt7);
                        }
                    } else {
                        i20 = ce.b.v(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A7);
                ?? obj6 = new Object();
                obj6.f5498a = i20;
                obj6.f5499b = str11;
                obj6.f5500c = str12;
                obj6.d = str13;
                return obj6;
            case 7:
                int A8 = ce.b.A(parcel);
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    String str28 = str26;
                    switch ((char) readInt8) {
                        case 2:
                            str14 = ce.b.i(parcel, readInt8);
                            break;
                        case 3:
                            str15 = ce.b.i(parcel, readInt8);
                            break;
                        case 4:
                            str16 = ce.b.i(parcel, readInt8);
                            break;
                        case 5:
                            str17 = ce.b.i(parcel, readInt8);
                            break;
                        case 6:
                            str18 = ce.b.i(parcel, readInt8);
                            break;
                        case 7:
                            str19 = ce.b.i(parcel, readInt8);
                            break;
                        case '\b':
                            str20 = ce.b.i(parcel, readInt8);
                            break;
                        case '\t':
                            str21 = ce.b.i(parcel, readInt8);
                            break;
                        case '\n':
                            str22 = ce.b.i(parcel, readInt8);
                            break;
                        case 11:
                            str23 = ce.b.i(parcel, readInt8);
                            break;
                        case '\f':
                            str24 = ce.b.i(parcel, readInt8);
                            break;
                        case '\r':
                            str25 = ce.b.i(parcel, readInt8);
                            break;
                        case 14:
                            str26 = ce.b.i(parcel, readInt8);
                            continue;
                        case 15:
                            str27 = ce.b.i(parcel, readInt8);
                            break;
                        default:
                            ce.b.z(parcel, readInt8);
                            break;
                    }
                    str26 = str28;
                }
                ce.b.n(parcel, A8);
                ?? obj7 = new Object();
                obj7.f5487a = str14;
                obj7.f5488b = str15;
                obj7.f5489c = str16;
                obj7.d = str17;
                obj7.f5490e = str18;
                obj7.f5491f = str19;
                obj7.h = str20;
                obj7.f5492n = str21;
                obj7.f5493r = str22;
                obj7.f5494s = str23;
                obj7.v = str24;
                obj7.f5495w = str25;
                obj7.f5496x = str26;
                obj7.f5497y = str27;
                return obj7;
            case 8:
                int A9 = ce.b.A(parcel);
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str29 = ce.b.i(parcel, readInt9);
                            break;
                        case 3:
                            str30 = ce.b.i(parcel, readInt9);
                            break;
                        case 4:
                            str31 = ce.b.i(parcel, readInt9);
                            break;
                        case 5:
                            str32 = ce.b.i(parcel, readInt9);
                            break;
                        case 6:
                            str33 = ce.b.i(parcel, readInt9);
                            break;
                        case 7:
                            str34 = ce.b.i(parcel, readInt9);
                            break;
                        case '\b':
                            str35 = ce.b.i(parcel, readInt9);
                            break;
                        default:
                            ce.b.z(parcel, readInt9);
                            break;
                    }
                }
                ce.b.n(parcel, A9);
                ?? obj8 = new Object();
                obj8.f5503a = str29;
                obj8.f5504b = str30;
                obj8.f5505c = str31;
                obj8.d = str32;
                obj8.f5506e = str33;
                obj8.f5507f = str34;
                obj8.h = str35;
                return obj8;
            case 9:
                int A10 = ce.b.A(parcel);
                double d = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    char c11 = (char) readInt10;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            ce.b.z(parcel, readInt10);
                        } else {
                            d10 = ce.b.r(parcel, readInt10);
                        }
                    } else {
                        d = ce.b.r(parcel, readInt10);
                    }
                }
                ce.b.n(parcel, A10);
                ?? obj9 = new Object();
                obj9.f5501a = d;
                obj9.f5502b = d10;
                return obj9;
            case 10:
                int A11 = ce.b.A(parcel);
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    char c12 = (char) readInt11;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            ce.b.z(parcel, readInt11);
                        } else {
                            str37 = ce.b.i(parcel, readInt11);
                        }
                    } else {
                        str36 = ce.b.i(parcel, readInt11);
                    }
                }
                ce.b.n(parcel, A11);
                ?? obj10 = new Object();
                obj10.f5510a = str36;
                obj10.f5511b = str37;
                return obj10;
            case 11:
                int A12 = ce.b.A(parcel);
                int i21 = 0;
                String str38 = null;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    char c13 = (char) readInt12;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            ce.b.z(parcel, readInt12);
                        } else {
                            str38 = ce.b.i(parcel, readInt12);
                        }
                    } else {
                        i21 = ce.b.v(parcel, readInt12);
                    }
                }
                ce.b.n(parcel, A12);
                ?? obj11 = new Object();
                obj11.f5508a = i21;
                obj11.f5509b = str38;
                return obj11;
            case 12:
                int A13 = ce.b.A(parcel);
                String str39 = null;
                String str40 = null;
                int i22 = 0;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            if (c14 != 4) {
                                ce.b.z(parcel, readInt13);
                            } else {
                                i22 = ce.b.v(parcel, readInt13);
                            }
                        } else {
                            str40 = ce.b.i(parcel, readInt13);
                        }
                    } else {
                        str39 = ce.b.i(parcel, readInt13);
                    }
                }
                ce.b.n(parcel, A13);
                ?? obj12 = new Object();
                obj12.f5514a = str39;
                obj12.f5515b = str40;
                obj12.f5516c = i22;
                return obj12;
            case 13:
                int A14 = ce.b.A(parcel);
                String str41 = null;
                String str42 = null;
                while (parcel.dataPosition() < A14) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            ce.b.z(parcel, readInt14);
                        } else {
                            str42 = ce.b.i(parcel, readInt14);
                        }
                    } else {
                        str41 = ce.b.i(parcel, readInt14);
                    }
                }
                ce.b.n(parcel, A14);
                ?? obj13 = new Object();
                obj13.f5512a = str41;
                obj13.f5513b = str42;
                return obj13;
            case 14:
                return new PictureFrame(parcel);
            case 15:
                return new e4.a(parcel);
            case 16:
                ?? obj14 = new Object();
                obj14.f6348a = parcel.readInt();
                obj14.f6349b = parcel.readInt();
                boolean z13 = true;
                if (parcel.readInt() != 1) {
                    z13 = false;
                }
                obj14.f6350c = z13;
                return obj14;
            case 17:
                return new f4.b(parcel);
            case 18:
                return new f4.c(parcel);
            case 19:
                return new g4.a(parcel);
            case 20:
                return new g4.b(parcel);
            case 21:
                return new g4.c(parcel);
            case 22:
                return new g4.d(parcel);
            case 23:
                return new g4.e(parcel);
            case 24:
                return new g4.f(parcel);
            case 25:
                return new g4.k(parcel);
            case 26:
                return new g4.l(parcel);
            case 27:
                return new m(parcel);
            case 28:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new n(readString, readString2, z.v(createStringArray));
            default:
                return new o(parcel);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f5426a) {
            case 0:
                return new c[i10];
            case 1:
                return new d8.a[i10];
            case 2:
                return new d8.m[i10];
            case 3:
                return new d8.b[i10];
            case 4:
                return new d8.d[i10];
            case 5:
                return new d8.c[i10];
            case 6:
                return new f[i10];
            case 7:
                return new e[i10];
            case 8:
                return new h[i10];
            case 9:
                return new g[i10];
            case 10:
                return new j[i10];
            case 11:
                return new i[i10];
            case 12:
                return new l[i10];
            case 13:
                return new k[i10];
            case 14:
                return new PictureFrame[i10];
            case 15:
                return new e4.a[i10];
            case 16:
                return new i0[i10];
            case 17:
                return new f4.b[i10];
            case 18:
                return new f4.c[i10];
            case 19:
                return new g4.a[i10];
            case 20:
                return new g4.b[i10];
            case 21:
                return new g4.c[i10];
            case 22:
                return new g4.d[i10];
            case 23:
                return new g4.e[i10];
            case 24:
                return new g4.f[i10];
            case 25:
                return new g4.k[i10];
            case 26:
                return new g4.l[i10];
            case 27:
                return new m[i10];
            case 28:
                return new n[i10];
            default:
                return new o[i10];
        }
    }
}
