package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(29);
    public final String f8249a;

    public g(String digitalCredentialPayload) {
        kotlin.jvm.internal.j.e(digitalCredentialPayload, "digitalCredentialPayload");
        this.f8249a = digitalCredentialPayload;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.l(dest, 1, this.f8249a);
        bc.s(dest, r10);
    }
}
