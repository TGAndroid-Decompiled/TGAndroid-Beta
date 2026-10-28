package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new x(1);
    public final String f18705a;
    public final CharSequence f18706b;
    public final int f18707c;
    public final Bundle d;

    public y(String str, int i10, Bundle bundle) {
        this.f18705a = str;
        this.f18706b = "";
        this.f18707c = i10;
        this.d = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.f18706b) + ", mIcon=" + this.f18707c + ", mExtras=" + this.d;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18705a);
        TextUtils.writeToParcel(this.f18706b, parcel, i10);
        parcel.writeInt(this.f18707c);
        parcel.writeBundle(this.d);
    }

    public y(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.f18705a = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.f18706b = charSequence;
        this.f18707c = parcel.readInt();
        this.d = parcel.readBundle(s.class.getClassLoader());
    }
}
