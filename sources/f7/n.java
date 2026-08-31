package f7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import j7.f5;
import java.util.ArrayList;
import java.util.List;
public final class n implements Parcelable.Creator {
    public final int f6144a;

    public n(int i10) {
        this.f6144a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f6144a) {
            case 0:
                int z4 = f5.z(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent = null;
                String str = null;
                String str2 = null;
                int i10 = 0;
                while (parcel.dataPosition() < z4) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i10 = f5.u(parcel, readInt);
                            break;
                        case 2:
                            iBinder = f5.t(parcel, readInt);
                            break;
                        case 3:
                            iBinder2 = f5.t(parcel, readInt);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) f5.g(parcel, readInt, PendingIntent.CREATOR);
                            break;
                        case 5:
                            str = f5.h(parcel, readInt);
                            break;
                        case 6:
                            str2 = f5.h(parcel, readInt);
                            break;
                        default:
                            f5.y(parcel, readInt);
                            break;
                    }
                }
                f5.m(parcel, z4);
                return new m(i10, iBinder, iBinder2, pendingIntent, str, str2);
            case 1:
                int z10 = f5.z(parcel);
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                String str3 = null;
                String str4 = null;
                long j10 = Long.MAX_VALUE;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 != 1) {
                        if (c3 != 5) {
                            switch (c3) {
                                case '\b':
                                    z11 = f5.n(parcel, readInt2);
                                    continue;
                                case '\t':
                                    z12 = f5.n(parcel, readInt2);
                                    continue;
                                case '\n':
                                    str3 = f5.h(parcel, readInt2);
                                    continue;
                                case 11:
                                    z13 = f5.n(parcel, readInt2);
                                    continue;
                                case '\f':
                                    z14 = f5.n(parcel, readInt2);
                                    continue;
                                case '\r':
                                    str4 = f5.h(parcel, readInt2);
                                    continue;
                                case 14:
                                    j10 = f5.w(parcel, readInt2);
                                    continue;
                                default:
                                    f5.y(parcel, readInt2);
                                    continue;
                            }
                        } else {
                            arrayList = f5.l(parcel, readInt2, b6.d.CREATOR);
                        }
                    } else {
                        locationRequest = (LocationRequest) f5.g(parcel, readInt2, LocationRequest.CREATOR);
                    }
                }
                f5.m(parcel, z10);
                return new o(locationRequest, arrayList, z11, z12, str3, z13, z14, str4, j10);
            case 2:
                int z15 = f5.z(parcel);
                o oVar = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinder5 = null;
                String str5 = null;
                int i11 = 1;
                while (parcel.dataPosition() < z15) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = f5.u(parcel, readInt3);
                            break;
                        case 2:
                            oVar = (o) f5.g(parcel, readInt3, o.CREATOR);
                            break;
                        case 3:
                            iBinder3 = f5.t(parcel, readInt3);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) f5.g(parcel, readInt3, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder4 = f5.t(parcel, readInt3);
                            break;
                        case 6:
                            iBinder5 = f5.t(parcel, readInt3);
                            break;
                        case 7:
                        default:
                            f5.y(parcel, readInt3);
                            break;
                        case '\b':
                            str5 = f5.h(parcel, readInt3);
                            break;
                    }
                }
                f5.m(parcel, z15);
                return new p(i11, oVar, iBinder3, iBinder4, pendingIntent2, iBinder5, str5);
            case 3:
                int z16 = f5.z(parcel);
                s sVar = u.f6157b;
                List list = v.f6158e;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                k kVar = null;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i12 = f5.u(parcel, readInt4);
                            break;
                        case 2:
                            i13 = f5.u(parcel, readInt4);
                            break;
                        case 3:
                            str6 = f5.h(parcel, readInt4);
                            break;
                        case 4:
                            str7 = f5.h(parcel, readInt4);
                            break;
                        case 5:
                            i14 = f5.u(parcel, readInt4);
                            break;
                        case 6:
                            str8 = f5.h(parcel, readInt4);
                            break;
                        case 7:
                            kVar = (k) f5.g(parcel, readInt4, k.CREATOR);
                            break;
                        case '\b':
                            list = f5.l(parcel, readInt4, y5.c.CREATOR);
                            break;
                        default:
                            f5.y(parcel, readInt4);
                            break;
                    }
                }
                f5.m(parcel, z16);
                return new k(i12, i13, str6, str7, str8, i14, list, kVar);
            default:
                int z17 = f5.z(parcel);
                while (parcel.dataPosition() < z17) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        f5.y(parcel, readInt5);
                    } else {
                        status = (Status) f5.g(parcel, readInt5, Status.CREATOR);
                    }
                }
                f5.m(parcel, z17);
                return new w(status);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f6144a) {
            case 0:
                return new m[i10];
            case 1:
                return new o[i10];
            case 2:
                return new p[i10];
            case 3:
                return new k[i10];
            default:
                return new w[i10];
        }
    }
}
