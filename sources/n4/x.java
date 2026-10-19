package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(8);
    public final String f17134a;
    public final CharSequence f17135b;
    public final int f17136c;
    public final Bundle d;

    public x(String str, int i10, Bundle bundle) {
        this.f17134a = str;
        this.f17135b = "";
        this.f17136c = i10;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f17135b) + ", mIcon=" + this.f17136c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17134a);
        TextUtils.writeToParcel(this.f17135b, parcel, i10);
        parcel.writeInt(this.f17136c);
        parcel.writeBundle(this.d);
    }

    public x(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f17134a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f17135b = charSequence;
        this.f17136c = parcel.readInt();
        this.d = parcel.readBundle(s.class.getClassLoader());
    }
}
