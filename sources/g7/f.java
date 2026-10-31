package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.h0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.p(16);
    public final String f7431a;
    public final Bundle f7432b;
    public final Bundle f7433c;
    public final String d;
    public final String e;
    public final ResultReceiver f7434f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f7431a = type;
        this.f7432b = credentialData;
        this.f7433c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f7434f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.l(dest, 1, this.f7431a);
        h0.b(dest, 2, this.f7432b);
        h0.b(dest, 3, this.f7433c);
        h0.l(dest, 4, this.d);
        h0.l(dest, 5, this.e);
        h0.k(dest, 6, this.f7434f, i10);
        h0.r(dest, q6);
    }
}
