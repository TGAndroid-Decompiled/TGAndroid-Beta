package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(10);
    public final String f16600a;
    public final CharSequence f16601b;
    public final int f16602c;
    public final Bundle d;

    public e0(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f16600a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f16601b = charSequence;
        this.f16602c = parcel.readInt();
        this.d = parcel.readBundle(x.class.getClassLoader());
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f16601b) + ", mIcon=" + this.f16602c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16600a);
        TextUtils.writeToParcel(this.f16601b, parcel, i10);
        parcel.writeInt(this.f16602c);
        parcel.writeBundle(this.d);
    }
}
