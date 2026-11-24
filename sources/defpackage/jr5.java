package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
public final class jr5 implements Parcelable {
    public static final Parcelable.Creator<jr5> CREATOR = new f41((byte) 23);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public jr5(IntentSender intentSender, Intent intent, int i, int i2) {
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
