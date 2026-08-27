package c7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import h7.r8;
import java.util.ArrayList;

public final class o extends z5.a {
    public static final Parcelable.Creator<o> CREATOR = new n(1);

    public final LocationRequest f2484a;

    public o(LocationRequest locationRequest, ArrayList arrayList, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        boolean z14;
        int i10 = locationRequest.f4337a;
        long j11 = locationRequest.f4338b;
        long jMin = locationRequest.f4339c;
        long j12 = locationRequest.d;
        long j13 = locationRequest.f4340e;
        int i11 = locationRequest.f4341f;
        float f10 = locationRequest.h;
        boolean z15 = locationRequest.f4342n;
        long j14 = locationRequest.f4343r;
        boolean z16 = z15;
        int i12 = locationRequest.f4344s;
        int i13 = locationRequest.v;
        String str3 = locationRequest.f4345w;
        boolean z17 = locationRequest.f4346x;
        WorkSource workSource = locationRequest.f4347y;
        k kVar = locationRequest.A;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                kVar = kVar;
                int i14 = 0;
                for (int size = arrayList.size(); i14 < size; size = size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    y5.d dVar = (y5.d) obj;
                    f6.f.a(workSource, dVar.f49607a, dVar.f49608b);
                }
            }
            z14 = true;
            i12 = z10 ? 1 : i12;
            i13 = z11 ? 2 : i13;
            if (str != null) {
                if (Build.VERSION.SDK_INT < 30) {
                    str3 = str;
                }
            } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
                str3 = str2;
            }
            z17 = z12 ? true : z17;
            z16 = z13 ? true : z16;
            if (j10 != Long.MAX_VALUE) {
                if (j10 != -1 && j10 < 0) {
                    z14 = false;
                }
                y5.l.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z14);
                j14 = j10;
            }
            if (jMin == -1) {
                jMin = j11;
            } else if (i10 != 105) {
                jMin = Math.min(jMin, j11);
            }
            this.f2484a = new LocationRequest(i10, j11, jMin, Math.max(j12, j11), Long.MAX_VALUE, j13, i11, f10, z16, j14 == -1 ? j11 : j14, i12, i13, str3, z17, new WorkSource(workSource), kVar);
        }
        z14 = true;
        if (z10) {
        }
        if (z11) {
        }
        if (str != null) {
            if (Build.VERSION.SDK_INT < 30) {
                str3 = str;
            }
        } else if (str2 != null) {
            str3 = str2;
        }
        if (z12) {
        }
        if (z13) {
        }
        if (j10 != Long.MAX_VALUE) {
            if (j10 != -1) {
                z14 = false;
            }
            y5.l.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z14);
            j14 = j10;
        }
        if (jMin == -1) {
            jMin = j11;
        } else if (i10 != 105) {
            jMin = Math.min(jMin, j11);
        }
        this.f2484a = new LocationRequest(i10, j11, jMin, Math.max(j12, j11), Long.MAX_VALUE, j13, i11, f10, z16, j14 == -1 ? j11 : j14, i12, i13, str3, z17, new WorkSource(workSource), kVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return y5.l.l(this.f2484a, ((o) obj).f2484a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2484a.hashCode();
    }

    public final String toString() {
        return this.f2484a.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f2484a, i10);
        r8.r(parcel, iQ);
    }
}
