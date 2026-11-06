package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.xb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new b(5);
    public final String f16560a;
    public final Bundle f16561b;
    public final Bundle f16562c;
    public final String d;
    public final String f16563e;
    public final ResultReceiver f16564f;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f16560a = type;
        this.f16561b = credentialData;
        this.f16562c = candidateQueryData;
        this.d = str;
        this.f16563e = str2;
        this.f16564f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.l(dest, 1, this.f16560a);
        xb.b(dest, 2, this.f16561b);
        xb.b(dest, 3, this.f16562c);
        xb.l(dest, 4, this.d);
        xb.l(dest, 5, this.f16563e);
        xb.k(dest, 6, this.f16564f, i7);
        xb.s(dest, r10);
    }
}
