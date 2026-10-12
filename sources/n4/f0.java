package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new m8.h(10);
    public final String f16303a;
    public final CharSequence f16304b;
    public final int f16305c;
    public final Bundle d;

    public f0(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f16303a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f16304b = charSequence;
        this.f16305c = parcel.readInt();
        this.d = parcel.readBundle(y.class.getClassLoader());
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f16304b) + ", mIcon=" + this.f16305c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16303a);
        TextUtils.writeToParcel(this.f16304b, parcel, i10);
        parcel.writeInt(this.f16305c);
        parcel.writeBundle(this.d);
    }
}
