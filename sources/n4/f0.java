package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(10);
    public final String f16304a;
    public final CharSequence f16305b;
    public final int f16306c;
    public final Bundle d;

    public f0(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f16304a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f16305b = charSequence;
        this.f16306c = parcel.readInt();
        this.d = parcel.readBundle(y.class.getClassLoader());
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f16305b) + ", mIcon=" + this.f16306c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16304a);
        TextUtils.writeToParcel(this.f16305b, parcel, i10);
        parcel.writeInt(this.f16306c);
        parcel.writeBundle(this.d);
    }
}
