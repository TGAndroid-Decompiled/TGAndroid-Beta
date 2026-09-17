package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(17);
    public final String f10482a;
    public final Bundle f10483b;
    public final Bundle f10484c;
    public final String d;
    public final String f10485e;
    public final ResultReceiver f10486f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f10482a = type;
        this.f10483b = credentialData;
        this.f10484c = candidateQueryData;
        this.d = str;
        this.f10485e = str2;
        this.f10486f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = e0.q(dest, 20293);
        e0.l(dest, 1, this.f10482a);
        e0.b(dest, 2, this.f10483b);
        e0.b(dest, 3, this.f10484c);
        e0.l(dest, 4, this.d);
        e0.l(dest, 5, this.f10485e);
        e0.k(dest, 6, this.f10486f, i10);
        e0.r(dest, q6);
    }
}
