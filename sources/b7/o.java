package b7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import g7.o8;
import java.util.ArrayList;
import java.util.List;
public final class o implements Parcelable.Creator {
    public final int f1577a;

    public o(int i9) {
        this.f1577a = i9;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f1577a) {
            case 0:
                int z10 = o8.z(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent = null;
                String str = null;
                String str2 = null;
                int i9 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i9 = o8.u(parcel, readInt);
                            break;
                        case 2:
                            iBinder = o8.t(parcel, readInt);
                            break;
                        case 3:
                            iBinder2 = o8.t(parcel, readInt);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) o8.g(parcel, readInt, PendingIntent.CREATOR);
                            break;
                        case 5:
                            str = o8.h(parcel, readInt);
                            break;
                        case 6:
                            str2 = o8.h(parcel, readInt);
                            break;
                        default:
                            o8.y(parcel, readInt);
                            break;
                    }
                }
                o8.m(parcel, z10);
                return new n(i9, iBinder, iBinder2, pendingIntent, str, str2);
            case 1:
                int z11 = o8.z(parcel);
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                String str3 = null;
                String str4 = null;
                long j10 = Long.MAX_VALUE;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 != 1) {
                        if (c10 != 5) {
                            switch (c10) {
                                case '\b':
                                    z12 = o8.n(parcel, readInt2);
                                    continue;
                                case '\t':
                                    z13 = o8.n(parcel, readInt2);
                                    continue;
                                case '\n':
                                    str3 = o8.h(parcel, readInt2);
                                    continue;
                                case 11:
                                    z14 = o8.n(parcel, readInt2);
                                    continue;
                                case '\f':
                                    z15 = o8.n(parcel, readInt2);
                                    continue;
                                case '\r':
                                    str4 = o8.h(parcel, readInt2);
                                    continue;
                                case 14:
                                    j10 = o8.w(parcel, readInt2);
                                    continue;
                                default:
                                    o8.y(parcel, readInt2);
                                    continue;
                            }
                        } else {
                            arrayList = o8.l(parcel, readInt2, x5.d.CREATOR);
                        }
                    } else {
                        locationRequest = (LocationRequest) o8.g(parcel, readInt2, LocationRequest.CREATOR);
                    }
                }
                o8.m(parcel, z11);
                return new p(locationRequest, arrayList, z12, z13, str3, z14, z15, str4, j10);
            case 2:
                int z16 = o8.z(parcel);
                p pVar = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinder5 = null;
                String str5 = null;
                int i10 = 1;
                while (parcel.dataPosition() < z16) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i10 = o8.u(parcel, readInt3);
                            break;
                        case 2:
                            pVar = (p) o8.g(parcel, readInt3, p.CREATOR);
                            break;
                        case 3:
                            iBinder3 = o8.t(parcel, readInt3);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) o8.g(parcel, readInt3, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder4 = o8.t(parcel, readInt3);
                            break;
                        case 6:
                            iBinder5 = o8.t(parcel, readInt3);
                            break;
                        case 7:
                        default:
                            o8.y(parcel, readInt3);
                            break;
                        case '\b':
                            str5 = o8.h(parcel, readInt3);
                            break;
                    }
                }
                o8.m(parcel, z16);
                return new q(i10, pVar, iBinder3, iBinder4, pendingIntent2, iBinder5, str5);
            case 3:
                int z17 = o8.z(parcel);
                t tVar = v.f1590b;
                List list = w.f1591e;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                l lVar = null;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (parcel.dataPosition() < z17) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i11 = o8.u(parcel, readInt4);
                            break;
                        case 2:
                            i12 = o8.u(parcel, readInt4);
                            break;
                        case 3:
                            str6 = o8.h(parcel, readInt4);
                            break;
                        case 4:
                            str7 = o8.h(parcel, readInt4);
                            break;
                        case 5:
                            i13 = o8.u(parcel, readInt4);
                            break;
                        case 6:
                            str8 = o8.h(parcel, readInt4);
                            break;
                        case 7:
                            lVar = (l) o8.g(parcel, readInt4, l.CREATOR);
                            break;
                        case '\b':
                            list = o8.l(parcel, readInt4, u5.c.CREATOR);
                            break;
                        default:
                            o8.y(parcel, readInt4);
                            break;
                    }
                }
                o8.m(parcel, z17);
                return new l(i11, i12, str6, str7, str8, i13, list, lVar);
            default:
                int z18 = o8.z(parcel);
                while (parcel.dataPosition() < z18) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        o8.y(parcel, readInt5);
                    } else {
                        status = (Status) o8.g(parcel, readInt5, Status.CREATOR);
                    }
                }
                o8.m(parcel, z18);
                return new y(status);
        }
    }

    @Override
    public final Object[] newArray(int i9) {
        switch (this.f1577a) {
            case 0:
                return new n[i9];
            case 1:
                return new p[i9];
            case 2:
                return new q[i9];
            case 3:
                return new l[i9];
            default:
                return new y[i9];
        }
    }
}
