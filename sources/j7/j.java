package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
public final class j extends r6.a {
    public static final Parcelable.Creator<j> CREATOR = new b(8);
    public final Bundle f17404a;

    public j(Bundle responseBundle) {
        kotlin.jvm.internal.j.e(responseBundle, "responseBundle");
        this.f17404a = responseBundle;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.b(dest, 1, this.f17404a);
        cc.s(dest, r10);
    }
}
