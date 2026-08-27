package c7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import h7.q8;
import java.util.ArrayList;
import java.util.List;

public final class n implements Parcelable.Creator {

    public final int f2483a;

    public n(int i10) {
        this.f2483a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f2483a) {
            case 0:
                int iZ = q8.z(parcel);
                IBinder iBinderT = null;
                IBinder iBinderT2 = null;
                PendingIntent pendingIntent = null;
                String strH = null;
                String strH2 = null;
                int iU = 0;
                while (parcel.dataPosition() < iZ) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iU = q8.u(parcel, i10);
                            break;
                        case 2:
                            iBinderT = q8.t(parcel, i10);
                            break;
                        case 3:
                            iBinderT2 = q8.t(parcel, i10);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) q8.g(parcel, i10, PendingIntent.CREATOR);
                            break;
                        case 5:
                            strH = q8.h(parcel, i10);
                            break;
                        case 6:
                            strH2 = q8.h(parcel, i10);
                            break;
                        default:
                            q8.y(parcel, i10);
                            break;
                    }
                }
                q8.m(parcel, iZ);
                return new m(iU, iBinderT, iBinderT2, pendingIntent, strH, strH2);
            case 1:
                int iZ2 = q8.z(parcel);
                LocationRequest locationRequest = null;
                ArrayList arrayListL = null;
                String strH3 = null;
                String strH4 = null;
                long jW = Long.MAX_VALUE;
                boolean zN = false;
                boolean zN2 = false;
                boolean zN3 = false;
                boolean zN4 = false;
                while (parcel.dataPosition() < iZ2) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        locationRequest = (LocationRequest) q8.g(parcel, i11, LocationRequest.CREATOR);
                    } else if (c10 != 5) {
                        switch (c10) {
                            case '\b':
                                zN = q8.n(parcel, i11);
                                break;
                            case '\t':
                                zN2 = q8.n(parcel, i11);
                                break;
                            case '\n':
                                strH3 = q8.h(parcel, i11);
                                break;
                            case 11:
                                zN3 = q8.n(parcel, i11);
                                break;
                            case '\f':
                                zN4 = q8.n(parcel, i11);
                                break;
                            case '\r':
                                strH4 = q8.h(parcel, i11);
                                break;
                            case 14:
                                jW = q8.w(parcel, i11);
                                break;
                            default:
                                q8.y(parcel, i11);
                                break;
                        }
                    } else {
                        arrayListL = q8.l(parcel, i11, y5.d.CREATOR);
                    }
                }
                q8.m(parcel, iZ2);
                return new o(locationRequest, arrayListL, zN, zN2, strH3, zN3, zN4, strH4, jW);
            case 2:
                int iZ3 = q8.z(parcel);
                o oVar = null;
                IBinder iBinderT3 = null;
                IBinder iBinderT4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinderT5 = null;
                String strH5 = null;
                int iU2 = 1;
                while (parcel.dataPosition() < iZ3) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iU2 = q8.u(parcel, i12);
                            break;
                        case 2:
                            oVar = (o) q8.g(parcel, i12, o.CREATOR);
                            break;
                        case 3:
                            iBinderT3 = q8.t(parcel, i12);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) q8.g(parcel, i12, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderT4 = q8.t(parcel, i12);
                            break;
                        case 6:
                            iBinderT5 = q8.t(parcel, i12);
                            break;
                        case 7:
                        default:
                            q8.y(parcel, i12);
                            break;
                        case '\b':
                            strH5 = q8.h(parcel, i12);
                            break;
                    }
                }
                q8.m(parcel, iZ3);
                return new p(iU2, oVar, iBinderT3, iBinderT4, pendingIntent2, iBinderT5, strH5);
            case 3:
                int iZ4 = q8.z(parcel);
                s sVar = u.f2496b;
                List listL = v.f2497e;
                String strH6 = null;
                String strH7 = null;
                String strH8 = null;
                k kVar = null;
                int iU3 = 0;
                int iU4 = 0;
                int iU5 = 0;
                while (parcel.dataPosition() < iZ4) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iU3 = q8.u(parcel, i13);
                            break;
                        case 2:
                            iU4 = q8.u(parcel, i13);
                            break;
                        case 3:
                            strH6 = q8.h(parcel, i13);
                            break;
                        case 4:
                            strH7 = q8.h(parcel, i13);
                            break;
                        case 5:
                            iU5 = q8.u(parcel, i13);
                            break;
                        case 6:
                            strH8 = q8.h(parcel, i13);
                            break;
                        case 7:
                            kVar = (k) q8.g(parcel, i13, k.CREATOR);
                            break;
                        case '\b':
                            listL = q8.l(parcel, i13, v5.c.CREATOR);
                            break;
                        default:
                            q8.y(parcel, i13);
                            break;
                    }
                }
                q8.m(parcel, iZ4);
                return new k(iU3, iU4, strH6, strH7, strH8, iU5, listL, kVar);
            default:
                int iZ5 = q8.z(parcel);
                while (parcel.dataPosition() < iZ5) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        q8.y(parcel, i14);
                    } else {
                        status = (Status) q8.g(parcel, i14, Status.CREATOR);
                    }
                }
                q8.m(parcel, iZ5);
                return new x(status);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f2483a) {
            case 0:
                return new m[i10];
            case 1:
                return new o[i10];
            case 2:
                return new p[i10];
            case 3:
                return new k[i10];
            default:
                return new x[i10];
        }
    }
}
