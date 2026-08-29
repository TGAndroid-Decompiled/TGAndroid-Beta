package o6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.l1;
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
    
    public static final Parcelable.Creator<r> CREATOR = new w0(5);
    public final int f19428a;

    r(int i10) {
        this.f19428a = i10;
    }

    public static r a(int i10) {
        r[] values;
        for (r rVar : values()) {
            if (i10 == rVar.f19428a) {
                return rVar;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(l1.l(i10, "Error code ", " is not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f19428a);
    }
}
