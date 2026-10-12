package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(17);
    public final String f9998a;
    public final Bundle f9999b;
    public final Bundle f10000c;
    public final String d;
    public final String e;
    public final ResultReceiver f10001f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f9998a = type;
        this.f9999b = credentialData;
        this.f10000c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f10001f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = g0.q(dest, 20293);
        g0.l(dest, 1, this.f9998a);
        g0.b(dest, 2, this.f9999b);
        g0.b(dest, 3, this.f10000c);
        g0.l(dest, 4, this.d);
        g0.l(dest, 5, this.e);
        g0.k(dest, 6, this.f10001f, i10);
        g0.r(dest, q6);
    }
}
