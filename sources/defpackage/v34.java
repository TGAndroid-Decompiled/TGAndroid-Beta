package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public enum v34 implements Parcelable {
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
    
    public static final Parcelable.Creator<v34> CREATOR = new xff((byte) 7);
    public final byte a;

    v34(int i) {
        this.a = i;
    }

    public static v34 a(int i) {
        v34[] values;
        for (v34 v34Var : values()) {
            if (i == v34Var.a) {
                return v34Var;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(tb4.n(i, "Error code ", " is not supported"));
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
