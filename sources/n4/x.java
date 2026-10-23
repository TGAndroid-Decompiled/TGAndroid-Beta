package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(8);
    public final String f17197a;
    public final CharSequence f17198b;
    public final int f17199c;
    public final Bundle d;

    public x(String str, int i10, Bundle bundle) {
        this.f17197a = str;
        this.f17198b = "";
        this.f17199c = i10;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f17198b) + ", mIcon=" + this.f17199c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17197a);
        TextUtils.writeToParcel(this.f17198b, parcel, i10);
        parcel.writeInt(this.f17199c);
        parcel.writeBundle(this.d);
    }

    public x(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f17197a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f17198b = charSequence;
        this.f17199c = parcel.readInt();
        this.d = parcel.readBundle(s.class.getClassLoader());
    }
}
