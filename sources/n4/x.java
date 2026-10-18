package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(8);
    public final String f17137a;
    public final CharSequence f17138b;
    public final int f17139c;
    public final Bundle d;

    public x(String str, int i10, Bundle bundle) {
        this.f17137a = str;
        this.f17138b = "";
        this.f17139c = i10;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f17138b) + ", mIcon=" + this.f17139c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17137a);
        TextUtils.writeToParcel(this.f17138b, parcel, i10);
        parcel.writeInt(this.f17139c);
        parcel.writeBundle(this.d);
    }

    public x(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f17137a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f17138b = charSequence;
        this.f17139c = parcel.readInt();
        this.d = parcel.readBundle(s.class.getClassLoader());
    }
}
