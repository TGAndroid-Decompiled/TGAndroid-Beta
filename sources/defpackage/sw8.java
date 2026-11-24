package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
public final class sw8 implements Parcelable {
    sw8 EF5;
    public static final sw8[] a = {new Enum("PUBLIC_KEY", 0)};
    public static final Parcelable.Creator<sw8> CREATOR = new lbd((byte) 1);

    public static sw8 a(String str) {
        sw8[] values;
        for (sw8 sw8Var : values()) {
            sw8Var.getClass();
            if (str.equals("public-key")) {
                return sw8Var;
            }
        }
        throw new Exception(kt6.o("PublicKeyCredentialType ", str, " not supported"));
    }

    public static sw8 valueOf(String str) {
        return (sw8) Enum.valueOf(sw8.class, str);
    }

    public static sw8[] values() {
        return (sw8[]) a.clone();
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
