package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new m8.i(7);
    public final String f13536a;
    public final CharSequence f13537b;
    public final int f13538c;
    public final Bundle d;

    public v(String str, int i10, Bundle bundle) {
        this.f13536a = str;
        this.f13537b = "";
        this.f13538c = i10;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f13537b) + ", mIcon=" + this.f13538c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13536a);
        TextUtils.writeToParcel(this.f13537b, parcel, i10);
        parcel.writeInt(this.f13538c);
        parcel.writeBundle(this.d);
    }

    public v(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f13536a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f13537b = charSequence;
        this.f13538c = parcel.readInt();
        this.d = parcel.readBundle(q.class.getClassLoader());
    }
}
