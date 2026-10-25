package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new x(1);
    public final String f18706a;
    public final CharSequence f18707b;
    public final int f18708c;
    public final Bundle d;

    public y(String str, int i10, Bundle bundle) {
        this.f18706a = str;
        this.f18707b = "";
        this.f18708c = i10;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f18707b) + ", mIcon=" + this.f18708c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18706a);
        TextUtils.writeToParcel(this.f18707b, parcel, i10);
        parcel.writeInt(this.f18708c);
        parcel.writeBundle(this.d);
    }

    public y(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f18706a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f18707b = charSequence;
        this.f18708c = parcel.readInt();
        this.d = parcel.readBundle(s.class.getClassLoader());
    }
}
