package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new m8.h(10);
    public final String f16636a;
    public final CharSequence f16637b;
    public final int f16638c;
    public final Bundle d;

    public e0(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f16636a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f16637b = charSequence;
        this.f16638c = parcel.readInt();
        this.d = parcel.readBundle(x.class.getClassLoader());
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f16637b) + ", mIcon=" + this.f16638c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16636a);
        TextUtils.writeToParcel(this.f16637b, parcel, i10);
        parcel.writeInt(this.f16638c);
        parcel.writeBundle(this.d);
    }
}
