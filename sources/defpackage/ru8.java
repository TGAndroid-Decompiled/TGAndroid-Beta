package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ru8 implements Parcelable {
    ru8 EF5;
    public static final ru8[] a = {new Enum("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<ru8> CREATOR = new j9d((byte) 1);

    public static ru8 a(String str) {
        ru8[] values;
        for (ru8 ru8Var : values()) {
            ru8Var.getClass();
            if (str.equals("public-key")) {
                return ru8Var;
            }
        }
        throw new Exception(tb4.y("PublicKeyCredentialType ", str, " not supported"));
    }

    public static ru8 valueOf(String str) {
        return (ru8) Enum.valueOf(ru8.class, str);
    }

    public static ru8[] values() {
        return (ru8[]) a.clone();
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "public-key";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
