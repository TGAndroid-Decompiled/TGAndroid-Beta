package m6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;
import m2.t;
public final class a extends q6.a {
    public final int f19176a;
    public final int f19177b;
    public final PendingIntent f19178c;
    public final String d;
    public final Integer f19179e;
    public static final a f19175f = new a(0, null, null);
    public static final Parcelable.Creator<a> CREATOR = new p(24);

    public a(int i3, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f19176a = i3;
        this.f19177b = i10;
        this.f19178c = pendingIntent;
        this.d = str;
        this.f19179e = num;
    }

    public static String d(int i3) {
        if (i3 != 99) {
            if (i3 != 1500) {
                switch (i3) {
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
                        switch (i3) {
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
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 20);
                                sb2.append("UNKNOWN_ERROR_CODE(");
                                sb2.append(i3);
                                sb2.append(")");
                                return sb2.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean b() {
        if (this.f19177b != 0 && this.f19178c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f19177b == 0) {
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
        if (this.f19177b == aVar.f19177b && p6.m.k(this.f19178c, aVar.f19178c) && p6.m.k(this.d, aVar.d) && p6.m.k(this.f19179e, aVar.f19179e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19177b), this.f19178c, this.d, this.f19179e});
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.A(d(this.f19177b), "statusCode");
        tVar.A(this.f19178c, "resolution");
        tVar.A(this.d, "message");
        tVar.A(this.f19179e, "clientMethodKey");
        return tVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.f19176a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.f19177b);
        j8.a.l(parcel, 3, this.f19178c, i3);
        j8.a.m(parcel, 4, this.d);
        j8.a.j(parcel, 5, this.f19179e);
        j8.a.t(parcel, s6);
    }

    public a(int i3, PendingIntent pendingIntent, String str) {
        this(1, i3, pendingIntent, str, null);
    }
}
