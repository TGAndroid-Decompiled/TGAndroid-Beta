package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(29);
    public final String f7970a;

    public g(String digitalCredentialPayload) {
        kotlin.jvm.internal.j.e(digitalCredentialPayload, "digitalCredentialPayload");
        this.f7970a = digitalCredentialPayload;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.l(dest, 1, this.f7970a);
        yb.s(dest, r10);
    }
}
