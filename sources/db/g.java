package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(29);
    public final String f8583a;

    public g(String digitalCredentialPayload) {
        kotlin.jvm.internal.j.e(digitalCredentialPayload, "digitalCredentialPayload");
        this.f8583a = digitalCredentialPayload;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.l(dest, 1, this.f8583a);
        xb.s(dest, r10);
    }
}
