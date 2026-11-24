package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
public enum f54 implements Parcelable {
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
    
    public static final Parcelable.Creator<f54> CREATOR = new yhf((byte) 7);
    public final byte a;

    f54(int i) {
        this.a = i;
    }

    public static f54 a(int i) {
        f54[] values;
        for (f54 f54Var : values()) {
            if (i == f54Var.a) {
                return f54Var;
            }
        }
        Locale locale = Locale.US;
        throw new Exception(td4.o(i, "Error code ", " is not supported"));
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
