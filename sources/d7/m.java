package d7;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
public final class m implements Parcelable.Creator {
    public final int f5452a;

    public m(int i10) {
        this.f5452a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        Status status = null;
        switch (this.f5452a) {
            case 0:
                int A = ce.b.A(parcel);
                IBinder iBinder = null;
                IBinder iBinder2 = null;
                PendingIntent pendingIntent = null;
                String str = null;
                String str2 = null;
                int i10 = 0;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i10 = ce.b.v(parcel, readInt);
                            break;
                        case 2:
                            iBinder = ce.b.u(parcel, readInt);
                            break;
                        case 3:
                            iBinder2 = ce.b.u(parcel, readInt);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) ce.b.h(parcel, readInt, PendingIntent.CREATOR);
                            break;
                        case 5:
                            str = ce.b.i(parcel, readInt);
                            break;
                        case 6:
                            str2 = ce.b.i(parcel, readInt);
                            break;
                        default:
                            ce.b.z(parcel, readInt);
                            break;
                    }
                }
                ce.b.n(parcel, A);
                return new l(i10, iBinder, iBinder2, pendingIntent, str, str2);
            case 1:
                int A2 = ce.b.A(parcel);
                LocationRequest locationRequest = null;
                ArrayList arrayList = null;
                String str3 = null;
                String str4 = null;
                long j10 = Long.MAX_VALUE;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 != 1) {
                        if (c3 != 5) {
                            switch (c3) {
                                case '\b':
                                    z10 = ce.b.o(parcel, readInt2);
                                    continue;
                                case '\t':
                                    z11 = ce.b.o(parcel, readInt2);
                                    continue;
                                case '\n':
                                    str3 = ce.b.i(parcel, readInt2);
                                    continue;
                                case 11:
                                    z12 = ce.b.o(parcel, readInt2);
                                    continue;
                                case '\f':
                                    z13 = ce.b.o(parcel, readInt2);
                                    continue;
                                case '\r':
                                    str4 = ce.b.i(parcel, readInt2);
                                    continue;
                                case 14:
                                    j10 = ce.b.x(parcel, readInt2);
                                    continue;
                                default:
                                    ce.b.z(parcel, readInt2);
                                    continue;
                            }
                        } else {
                            arrayList = ce.b.m(parcel, readInt2, z5.d.CREATOR);
                        }
                    } else {
                        locationRequest = (LocationRequest) ce.b.h(parcel, readInt2, LocationRequest.CREATOR);
                    }
                }
                ce.b.n(parcel, A2);
                return new n(locationRequest, arrayList, z10, z11, str3, z12, z13, str4, j10);
            case 2:
                int A3 = ce.b.A(parcel);
                n nVar = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent2 = null;
                IBinder iBinder5 = null;
                String str5 = null;
                int i11 = 1;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = ce.b.v(parcel, readInt3);
                            break;
                        case 2:
                            nVar = (n) ce.b.h(parcel, readInt3, n.CREATOR);
                            break;
                        case 3:
                            iBinder3 = ce.b.u(parcel, readInt3);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) ce.b.h(parcel, readInt3, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder4 = ce.b.u(parcel, readInt3);
                            break;
                        case 6:
                            iBinder5 = ce.b.u(parcel, readInt3);
                            break;
                        case 7:
                        default:
                            ce.b.z(parcel, readInt3);
                            break;
                        case '\b':
                            str5 = ce.b.i(parcel, readInt3);
                            break;
                    }
                }
                ce.b.n(parcel, A3);
                return new o(i11, nVar, iBinder3, iBinder4, pendingIntent2, iBinder5, str5);
            case 3:
                int A4 = ce.b.A(parcel);
                r rVar = t.f5465b;
                List list = u.f5466e;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                j jVar = null;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i12 = ce.b.v(parcel, readInt4);
                            break;
                        case 2:
                            i13 = ce.b.v(parcel, readInt4);
                            break;
                        case 3:
                            str6 = ce.b.i(parcel, readInt4);
                            break;
                        case 4:
                            str7 = ce.b.i(parcel, readInt4);
                            break;
                        case 5:
                            i14 = ce.b.v(parcel, readInt4);
                            break;
                        case 6:
                            str8 = ce.b.i(parcel, readInt4);
                            break;
                        case 7:
                            jVar = (j) ce.b.h(parcel, readInt4, j.CREATOR);
                            break;
                        case '\b':
                            list = ce.b.m(parcel, readInt4, w5.c.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt4);
                            break;
                    }
                }
                ce.b.n(parcel, A4);
                return new j(i12, i13, str6, str7, str8, i14, list, jVar);
            default:
                int A5 = ce.b.A(parcel);
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 1) {
                        ce.b.z(parcel, readInt5);
                    } else {
                        status = (Status) ce.b.h(parcel, readInt5, Status.CREATOR);
                    }
                }
                ce.b.n(parcel, A5);
                return new v(status);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f5452a) {
            case 0:
                return new l[i10];
            case 1:
                return new n[i10];
            case 2:
                return new o[i10];
            case 3:
                return new j[i10];
            default:
                return new v[i10];
        }
    }
}
