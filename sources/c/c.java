package c;

import android.graphics.PointF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.firebase.messaging.r;
import e4.f;
import e4.k;
import e4.l;
import e4.m;
import e4.n;
import e4.o;
import f2.l0;
import f8.i;
import f8.j;
import g7.o8;
import java.util.ArrayList;
import o8.z;
public final class c implements Parcelable.Creator {
    public final int f2048a;

    public c(int i9) {
        this.f2048a = i9;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        float f10 = -1.0f;
        float f11 = 0.0f;
        boolean z10 = true;
        b bVar = null;
        String str = null;
        f8.c cVar = null;
        String str2 = null;
        PointF[] pointFArr = null;
        Bundle bundle = null;
        int i9 = 0;
        switch (this.f2048a) {
            case 0:
                ?? obj = new Object();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i10 = d.f2049b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.h);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                        bVar = (b) queryLocalInterface;
                    } else {
                        ?? obj2 = new Object();
                        obj2.f2047a = readStrongBinder;
                        bVar = obj2;
                    }
                }
                obj.f2051a = bVar;
                return obj;
            case 1:
                return new PictureFrame(parcel);
            case 2:
                return new c4.a(parcel);
            case 3:
                int z11 = o8.z(parcel);
                while (parcel.dataPosition() < z11) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        o8.y(parcel, readInt);
                    } else {
                        bundle = o8.a(parcel, readInt);
                    }
                }
                o8.m(parcel, z11);
                return new r(bundle);
            case 4:
                return new d4.b(parcel);
            case 5:
                return new d4.c(parcel);
            case 6:
                return new e4.a(parcel);
            case 7:
                return new e4.b(parcel);
            case 8:
                return new e4.c(parcel);
            case 9:
                return new e4.d(parcel);
            case 10:
                return new e4.e(parcel);
            case 11:
                return new f(parcel);
            case 12:
                return new k(parcel);
            case 13:
                return new l(parcel);
            case 14:
                return new m(parcel);
            case 15:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new n(readString, readString2, z.v(createStringArray));
            case 16:
                return new o(parcel);
            case 17:
                int z12 = o8.z(parcel);
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            o8.y(parcel, readInt2);
                        } else {
                            i9 = o8.u(parcel, readInt2);
                        }
                    } else {
                        pointFArr = (PointF[]) o8.k(parcel, readInt2, PointF.CREATOR);
                    }
                }
                o8.m(parcel, z12);
                return new e8.a(pointFArr, i9);
            case 18:
                int z13 = o8.z(parcel);
                LandmarkParcel[] landmarkParcelArr = null;
                e8.a[] aVarArr = null;
                int i11 = 0;
                int i12 = 0;
                float f12 = 0.0f;
                float f13 = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                float f16 = Float.MAX_VALUE;
                float f17 = Float.MAX_VALUE;
                float f18 = Float.MAX_VALUE;
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                float f22 = -1.0f;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = o8.u(parcel, readInt3);
                            break;
                        case 2:
                            i12 = o8.u(parcel, readInt3);
                            break;
                        case 3:
                            f12 = o8.r(parcel, readInt3);
                            break;
                        case 4:
                            f13 = o8.r(parcel, readInt3);
                            break;
                        case 5:
                            f14 = o8.r(parcel, readInt3);
                            break;
                        case 6:
                            f15 = o8.r(parcel, readInt3);
                            break;
                        case 7:
                            f16 = o8.r(parcel, readInt3);
                            break;
                        case '\b':
                            f17 = o8.r(parcel, readInt3);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) o8.k(parcel, readInt3, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f19 = o8.r(parcel, readInt3);
                            break;
                        case 11:
                            f20 = o8.r(parcel, readInt3);
                            break;
                        case '\f':
                            f21 = o8.r(parcel, readInt3);
                            break;
                        case '\r':
                            aVarArr = (e8.a[]) o8.k(parcel, readInt3, e8.a.CREATOR);
                            break;
                        case 14:
                            f18 = o8.r(parcel, readInt3);
                            break;
                        case 15:
                            f22 = o8.r(parcel, readInt3);
                            break;
                        default:
                            o8.y(parcel, readInt3);
                            break;
                    }
                }
                o8.m(parcel, z13);
                return new FaceParcel(i11, i12, f12, f13, f14, f15, f16, f17, f18, landmarkParcelArr, f19, f20, f21, aVarArr, f22);
            case 19:
                int z14 = o8.z(parcel);
                int i13 = 0;
                int i14 = 0;
                boolean z15 = false;
                boolean z16 = false;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            i9 = o8.u(parcel, readInt4);
                            break;
                        case 3:
                            i13 = o8.u(parcel, readInt4);
                            break;
                        case 4:
                            i14 = o8.u(parcel, readInt4);
                            break;
                        case 5:
                            z15 = o8.n(parcel, readInt4);
                            break;
                        case 6:
                            z16 = o8.n(parcel, readInt4);
                            break;
                        case 7:
                            f10 = o8.r(parcel, readInt4);
                            break;
                        default:
                            o8.y(parcel, readInt4);
                            break;
                    }
                }
                o8.m(parcel, z14);
                ?? obj3 = new Object();
                obj3.f4980a = i9;
                obj3.f4981b = i13;
                obj3.f4982c = i14;
                obj3.d = z15;
                obj3.f4983e = z16;
                obj3.f4984f = f10;
                return obj3;
            case 20:
                int z17 = o8.z(parcel);
                float f23 = 0.0f;
                int i15 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    o8.y(parcel, readInt5);
                                } else {
                                    i15 = o8.u(parcel, readInt5);
                                }
                            } else {
                                f23 = o8.r(parcel, readInt5);
                            }
                        } else {
                            f11 = o8.r(parcel, readInt5);
                        }
                    } else {
                        i9 = o8.u(parcel, readInt5);
                    }
                }
                o8.m(parcel, z17);
                return new LandmarkParcel(i9, f11, f23, i15);
            case 21:
                ?? obj4 = new Object();
                obj4.f5419a = parcel.readInt();
                obj4.f5420b = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z10 = false;
                }
                obj4.f5421c = z10;
                return obj4;
            case 22:
                return new f4.a(parcel);
            case 23:
                return new f4.b(parcel);
            case 24:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, f4.c.class.getClassLoader());
                return new f4.d(arrayList);
            case 25:
                return new f4.c(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 26:
                return new f4.e(parcel);
            case 27:
                int z18 = o8.z(parcel);
                f8.b bVar2 = null;
                UserAddress userAddress = null;
                f8.k kVar = null;
                String str3 = null;
                Bundle bundle2 = null;
                String str4 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            str2 = o8.h(parcel, readInt6);
                            break;
                        case 2:
                            bVar2 = (f8.b) o8.g(parcel, readInt6, f8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) o8.g(parcel, readInt6, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar = (f8.k) o8.g(parcel, readInt6, f8.k.CREATOR);
                            break;
                        case 5:
                            str3 = o8.h(parcel, readInt6);
                            break;
                        case 6:
                            bundle2 = o8.a(parcel, readInt6);
                            break;
                        case 7:
                            str4 = o8.h(parcel, readInt6);
                            break;
                        case '\b':
                            bundle3 = o8.a(parcel, readInt6);
                            break;
                        default:
                            o8.y(parcel, readInt6);
                            break;
                    }
                }
                o8.m(parcel, z18);
                ?? obj5 = new Object();
                obj5.f5944a = str2;
                obj5.f5945b = bVar2;
                obj5.f5946c = userAddress;
                obj5.d = kVar;
                obj5.f5947e = str3;
                obj5.f5948f = bundle2;
                obj5.h = str4;
                obj5.f5949n = bundle3;
                return obj5;
            case 28:
                int z19 = o8.z(parcel);
                f8.m mVar = null;
                ArrayList arrayList2 = null;
                f8.l lVar = null;
                f8.n nVar = null;
                String str5 = null;
                Bundle bundle4 = null;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                while (parcel.dataPosition() < z19) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            z20 = o8.n(parcel, readInt7);
                            break;
                        case 2:
                            z21 = o8.n(parcel, readInt7);
                            break;
                        case 3:
                            cVar = (f8.c) o8.g(parcel, readInt7, f8.c.CREATOR);
                            break;
                        case 4:
                            z22 = o8.n(parcel, readInt7);
                            break;
                        case 5:
                            mVar = (f8.m) o8.g(parcel, readInt7, f8.m.CREATOR);
                            break;
                        case 6:
                            arrayList2 = o8.e(parcel, readInt7);
                            break;
                        case 7:
                            lVar = (f8.l) o8.g(parcel, readInt7, f8.l.CREATOR);
                            break;
                        case '\b':
                            nVar = (f8.n) o8.g(parcel, readInt7, f8.n.CREATOR);
                            break;
                        case '\t':
                            z10 = o8.n(parcel, readInt7);
                            break;
                        case '\n':
                            str5 = o8.h(parcel, readInt7);
                            break;
                        case 11:
                            bundle4 = o8.a(parcel, readInt7);
                            break;
                        default:
                            o8.y(parcel, readInt7);
                            break;
                    }
                }
                o8.m(parcel, z19);
                ?? obj6 = new Object();
                obj6.f5950a = z20;
                obj6.f5951b = z21;
                obj6.f5952c = cVar;
                obj6.d = z22;
                obj6.f5953e = mVar;
                obj6.f5954f = arrayList2;
                obj6.h = lVar;
                obj6.f5955n = nVar;
                obj6.f5956r = z10;
                obj6.f5957s = str5;
                obj6.v = bundle4;
                return obj6;
            default:
                int z23 = o8.z(parcel);
                while (parcel.dataPosition() < z23) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            o8.y(parcel, readInt8);
                        } else {
                            str = o8.h(parcel, readInt8);
                        }
                    } else {
                        i9 = o8.u(parcel, readInt8);
                    }
                }
                o8.m(parcel, z23);
                ?? obj7 = new Object();
                obj7.f5958a = i9;
                obj7.f5959b = str;
                return obj7;
        }
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f2048a) {
            case 0:
                return new e[i9];
            case 1:
                return new PictureFrame[i9];
            case 2:
                return new c4.a[i9];
            case 3:
                return new r[i9];
            case 4:
                return new d4.b[i9];
            case 5:
                return new d4.c[i9];
            case 6:
                return new e4.a[i9];
            case 7:
                return new e4.b[i9];
            case 8:
                return new e4.c[i9];
            case 9:
                return new e4.d[i9];
            case 10:
                return new e4.e[i9];
            case 11:
                return new f[i9];
            case 12:
                return new k[i9];
            case 13:
                return new l[i9];
            case 14:
                return new m[i9];
            case 15:
                return new n[i9];
            case 16:
                return new o[i9];
            case 17:
                return new e8.a[i9];
            case 18:
                return new FaceParcel[i9];
            case 19:
                return new e8.b[i9];
            case 20:
                return new LandmarkParcel[i9];
            case 21:
                return new l0[i9];
            case 22:
                return new f4.a[i9];
            case 23:
                return new f4.b[i9];
            case 24:
                return new f4.d[i9];
            case 25:
                return new f4.c[i9];
            case 26:
                return new f4.e[i9];
            case 27:
                return new i[i9];
            case 28:
                return new j[i9];
            default:
                return new f8.k[i9];
        }
    }
}
