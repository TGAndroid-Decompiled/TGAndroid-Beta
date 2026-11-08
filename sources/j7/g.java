package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.xb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new b(5);
    public final String f16563a;
    public final Bundle f16564b;
    public final Bundle f16565c;
    public final String d;
    public final String f16566e;
    public final ResultReceiver f16567f;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f16563a = type;
        this.f16564b = credentialData;
        this.f16565c = candidateQueryData;
        this.d = str;
        this.f16566e = str2;
        this.f16567f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.l(dest, 1, this.f16563a);
        xb.b(dest, 2, this.f16564b);
        xb.b(dest, 3, this.f16565c);
        xb.l(dest, 4, this.d);
        xb.l(dest, 5, this.f16566e);
        xb.k(dest, 6, this.f16567f, i7);
        xb.s(dest, r10);
    }
}
