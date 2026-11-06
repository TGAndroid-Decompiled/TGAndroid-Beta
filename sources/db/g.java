package db;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(29);
    public final String f8580a;

    public g(String digitalCredentialPayload) {
        kotlin.jvm.internal.j.e(digitalCredentialPayload, "digitalCredentialPayload");
        this.f8580a = digitalCredentialPayload;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = wb.r(dest, 20293);
        wb.l(dest, 1, this.f8580a);
        wb.s(dest, r10);
    }
}
