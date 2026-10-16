package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.f0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(17);
    public final String f10001a;
    public final Bundle f10002b;
    public final Bundle f10003c;
    public final String d;
    public final String e;
    public final ResultReceiver f10004f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f10001a = type;
        this.f10002b = credentialData;
        this.f10003c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f10004f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = f0.q(dest, 20293);
        f0.l(dest, 1, this.f10001a);
        f0.b(dest, 2, this.f10002b);
        f0.b(dest, 3, this.f10003c);
        f0.l(dest, 4, this.d);
        f0.l(dest, 5, this.e);
        f0.k(dest, 6, this.f10004f, i10);
        f0.r(dest, q6);
    }
}
