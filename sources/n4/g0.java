package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new m8.h(10);
    public final String f13771a;
    public final CharSequence f13772b;
    public final int f13773c;
    public final Bundle d;

    public g0(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f13771a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f13772b = charSequence;
        this.f13773c = parcel.readInt();
        this.d = parcel.readBundle(y.class.getClassLoader());
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f13772b) + ", mIcon=" + this.f13773c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13771a);
        TextUtils.writeToParcel(this.f13772b, parcel, i10);
        parcel.writeInt(this.f13773c);
        parcel.writeBundle(this.d);
    }
}
