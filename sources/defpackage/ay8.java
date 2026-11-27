package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class ay8 implements Parcelable {
    ay8 EF5;
    public static final ay8[] a = {new Enum("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<ay8> CREATOR = new ced((byte) 1);

    public static ay8 a(String str) {
        ay8[] values;
        for (ay8 ay8Var : values()) {
            ay8Var.getClass();
            if (str.equals("public-key")) {
                return ay8Var;
            }
        }
        throw new Exception(qd4.y("PublicKeyCredentialType ", str, " not supported"));
    }

    public static ay8 valueOf(String str) {
        return (ay8) Enum.valueOf(ay8.class, str);
    }

    public static ay8[] values() {
        return (ay8[]) a.clone();
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
