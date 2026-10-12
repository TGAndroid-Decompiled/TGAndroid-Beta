package k6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.g0;
public final class a extends o6.a {
    public final int f14158a;
    public final int f14159b;
    public final PendingIntent f14160c;
    public final String d;
    public static final a e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new g8.j(17);

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f14158a = i10;
        this.f14159b = i11;
        this.f14160c = pendingIntent;
        this.d = str;
    }

    public static String d(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            case 25:
                                return "API_INSTALL_REQUIRED";
                            default:
                                return i2.d.j(i10, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean b() {
        if (this.f14159b != 0 && this.f14160c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f14159b == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f14159b == aVar.f14159b && n6.l.l(this.f14160c, aVar.f14160c) && n6.l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14159b), this.f14160c, this.d});
    }

    public final String toString() {
        m4.c cVar = new m4.c(this);
        cVar.u(d(this.f14159b), "statusCode");
        cVar.u(this.f14160c, "resolution");
        cVar.u(this.d, "message");
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 1, 4);
        parcel.writeInt(this.f14158a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.f14159b);
        g0.k(parcel, 3, this.f14160c, i10);
        g0.l(parcel, 4, this.d);
        g0.r(parcel, q6);
    }

    public a(int i10) {
        this(1, i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
