package k6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.y;
import w7.e0;
public final class a extends o6.a {
    public final int f14805a;
    public final int f14806b;
    public final PendingIntent f14807c;
    public final String d;
    public static final a f14804e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new g8.j(17);

    public a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f14805a = i10;
        this.f14806b = i11;
        this.f14807c = pendingIntent;
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
                                return i2.g.j(i10, "UNKNOWN_ERROR_CODE(", ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean b() {
        if (this.f14806b != 0 && this.f14807c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f14806b == 0) {
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
        if (this.f14806b == aVar.f14806b && n6.l.l(this.f14807c, aVar.f14807c) && n6.l.l(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14806b), this.f14807c, this.d});
    }

    public final String toString() {
        y yVar = new y(this);
        yVar.y(d(this.f14806b), "statusCode");
        yVar.y(this.f14807c, "resolution");
        yVar.y(this.d, "message");
        return yVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 1, 4);
        parcel.writeInt(this.f14805a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.f14806b);
        e0.k(parcel, 3, this.f14807c, i10);
        e0.l(parcel, 4, this.d);
        e0.r(parcel, q6);
    }

    public a(int i10) {
        this(1, i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(1, i10, pendingIntent, null);
    }
}
