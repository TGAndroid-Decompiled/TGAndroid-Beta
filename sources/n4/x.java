package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(8);
    public final String f16040a;
    public final CharSequence f16041b;
    public final int f16042c;
    public final Bundle d;

    public x(String str, int i10, Bundle bundle) {
        this.f16040a = str;
        this.f16041b = "";
        this.f16042c = i10;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f16041b) + ", mIcon=" + this.f16042c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16040a);
        TextUtils.writeToParcel(this.f16041b, parcel, i10);
        parcel.writeInt(this.f16042c);
        parcel.writeBundle(this.d);
    }

    public x(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f16040a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f16041b = charSequence;
        this.f16042c = parcel.readInt();
        this.d = parcel.readBundle(s.class.getClassLoader());
    }
}
