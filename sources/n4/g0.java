package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new m8.h(10);
    public final String f16586a;
    public final CharSequence f16587b;
    public final int f16588c;
    public final Bundle d;

    public g0(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f16586a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f16587b = charSequence;
        this.f16588c = parcel.readInt();
        this.d = parcel.readBundle(y.class.getClassLoader());
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f16587b) + ", mIcon=" + this.f16588c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16586a);
        TextUtils.writeToParcel(this.f16587b, parcel, i10);
        parcel.writeInt(this.f16588c);
        parcel.writeBundle(this.d);
    }
}
