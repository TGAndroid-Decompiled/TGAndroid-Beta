package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new m8.h(10);
    public final String f15165a;
    public final CharSequence f15166b;
    public final int f15167c;
    public final Bundle d;

    public g0(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f15165a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f15166b = charSequence;
        this.f15167c = parcel.readInt();
        this.d = parcel.readBundle(y.class.getClassLoader());
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f15166b) + ", mIcon=" + this.f15167c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15165a);
        TextUtils.writeToParcel(this.f15166b, parcel, i10);
        parcel.writeInt(this.f15167c);
        parcel.writeBundle(this.d);
    }
}
