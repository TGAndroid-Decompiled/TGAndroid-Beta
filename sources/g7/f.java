package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.d0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(17);
    public final String f10390a;
    public final Bundle f10391b;
    public final Bundle f10392c;
    public final String d;
    public final String f10393e;
    public final ResultReceiver f10394f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f10390a = type;
        this.f10391b = credentialData;
        this.f10392c = candidateQueryData;
        this.d = str;
        this.f10393e = str2;
        this.f10394f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = d0.q(dest, 20293);
        d0.l(dest, 1, this.f10390a);
        d0.b(dest, 2, this.f10391b);
        d0.b(dest, 3, this.f10392c);
        d0.l(dest, 4, this.d);
        d0.l(dest, 5, this.f10393e);
        d0.k(dest, 6, this.f10394f, i10);
        d0.r(dest, q6);
    }
}
