package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
public final class aj2 extends b4 {
    public static final Parcelable.Creator<aj2> CREATOR = new t4d((byte) 1);
    public final Intent a;

    public aj2(Intent intent) {
        this.a = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.s(parcel, r);
    }
}
