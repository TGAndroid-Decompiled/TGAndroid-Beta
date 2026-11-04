package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import k2.p1;
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
    
    public static final Parcelable.Creator<r> CREATOR = new r0(27);
    public final int f9870a;

    r(int i3) {
        this.f9870a = i3;
    }

    public static r a(int i3) {
        r[] values;
        for (r rVar : values()) {
            if (i3 == rVar.f9870a) {
                return rVar;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(p1.j(i3, "Error code ", " is not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f9870a);
    }
}
