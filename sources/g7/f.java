package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.e0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(17);
    public final String f10454a;
    public final Bundle f10455b;
    public final Bundle f10456c;
    public final String d;
    public final String f10457e;
    public final ResultReceiver f10458f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f10454a = type;
        this.f10455b = credentialData;
        this.f10456c = candidateQueryData;
        this.d = str;
        this.f10457e = str2;
        this.f10458f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = e0.q(dest, 20293);
        e0.l(dest, 1, this.f10454a);
        e0.b(dest, 2, this.f10455b);
        e0.b(dest, 3, this.f10456c);
        e0.l(dest, 4, this.d);
        e0.l(dest, 5, this.f10457e);
        e0.k(dest, 6, this.f10458f, i10);
        e0.r(dest, q6);
    }
}
