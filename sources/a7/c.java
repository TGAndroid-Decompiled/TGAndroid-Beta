package a7;

import android.os.Parcel;

public class c extends RuntimeException {
    public c() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public c(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
