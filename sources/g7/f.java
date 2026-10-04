package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.g0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(17);
    public final String f10318a;
    public final Bundle f10319b;
    public final Bundle f10320c;
    public final String d;
    public final String f10321e;
    public final ResultReceiver f10322f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f10318a = type;
        this.f10319b = credentialData;
        this.f10320c = candidateQueryData;
        this.d = str;
        this.f10321e = str2;
        this.f10322f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = g0.q(dest, 20293);
        g0.l(dest, 1, this.f10318a);
        g0.b(dest, 2, this.f10319b);
        g0.b(dest, 3, this.f10320c);
        g0.l(dest, 4, this.d);
        g0.l(dest, 5, this.f10321e);
        g0.k(dest, 6, this.f10322f, i10);
        g0.r(dest, q6);
    }
}
