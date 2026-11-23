package n6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
public final class a extends r6.a {
    public final int f21415a;
    public final int f21416b;
    public final PendingIntent f21417c;
    public final String d;
    public final Integer f21418e;
    public static final a f21414f = new a(0, null, null);
    public static final Parcelable.Creator<a> CREATOR = new m6.e(9);

    public a(int i7, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f21415a = i7;
        this.f21416b = i10;
        this.f21417c = pendingIntent;
        this.d = str;
        this.f21418e = num;
    }

    public static String d(int i7) {
        if (i7 != 99) {
            if (i7 != 1500) {
                switch (i7) {
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
                        switch (i7) {
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
                                StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 20);
                                sb2.append("UNKNOWN_ERROR_CODE(");
                                sb2.append(i7);
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
        if (this.f21416b != 0 && this.f21417c != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f21416b == 0) {
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
        if (this.f21416b == aVar.f21416b && q6.m.l(this.f21417c, aVar.f21417c) && q6.m.l(this.d, aVar.d) && q6.m.l(this.f21418e, aVar.f21418e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21416b), this.f21417c, this.d, this.f21418e});
    }

    public final String toString() {
        ji.k kVar = new ji.k(this);
        kVar.E(d(this.f21416b), "statusCode");
        kVar.E(this.f21417c, "resolution");
        kVar.E(this.d, "message");
        kVar.E(this.f21418e, "clientMethodKey");
        return kVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 1, 4);
        parcel.writeInt(this.f21415a);
        cc.q(parcel, 2, 4);
        parcel.writeInt(this.f21416b);
        cc.k(parcel, 3, this.f21417c, i7);
        cc.l(parcel, 4, this.d);
        cc.i(parcel, 5, this.f21418e);
        cc.s(parcel, r10);
    }

    public a(int i7, PendingIntent pendingIntent, String str) {
        this(1, i7, pendingIntent, str, null);
    }
}
