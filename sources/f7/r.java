package f7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public enum r implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator<r> CREATOR = new t0(12);
    public final int f11432a;

    r(int i7) {
        this.f11432a = i7;
    }

    public static r a(int i7) {
        r[] values;
        for (r rVar : values()) {
            if (i7 == rVar.f11432a) {
                return rVar;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(jg.g.k(i7, "Error code ", " is not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f11432a);
    }
}
