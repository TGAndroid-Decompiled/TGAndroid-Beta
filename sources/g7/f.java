package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import w7.c0;
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new e6.i(17);
    public final String f10389a;
    public final Bundle f10390b;
    public final Bundle f10391c;
    public final String d;
    public final String f10392e;
    public final ResultReceiver f10393f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f10389a = type;
        this.f10390b = credentialData;
        this.f10391c = candidateQueryData;
        this.d = str;
        this.f10392e = str2;
        this.f10393f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = c0.q(dest, 20293);
        c0.l(dest, 1, this.f10389a);
        c0.b(dest, 2, this.f10390b);
        c0.b(dest, 3, this.f10391c);
        c0.l(dest, 4, this.d);
        c0.l(dest, 5, this.f10392e);
        c0.k(dest, 6, this.f10393f, i10);
        c0.r(dest, q6);
    }
}
