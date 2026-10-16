package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new m8.h(8);
    public final String f15754a;
    public final CharSequence f15755b;
    public final int f15756c;
    public final Bundle d;

    public x(String str, int i10, Bundle bundle) {
        this.f15754a = str;
        this.f15755b = "";
        this.f15756c = i10;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f15755b) + ", mIcon=" + this.f15756c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15754a);
        TextUtils.writeToParcel(this.f15755b, parcel, i10);
        parcel.writeInt(this.f15756c);
        parcel.writeBundle(this.d);
    }

    public x(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f15754a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f15755b = charSequence;
        this.f15756c = parcel.readInt();
        this.d = parcel.readBundle(s.class.getClassLoader());
    }
}
