package h7;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new f6.i(17);
    public final String f12684a;
    public final Bundle f12685b;
    public final Bundle f12686c;
    public final String d;
    public final String e;
    public final ResultReceiver f12687f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f12684a = type;
        this.f12685b = credentialData;
        this.f12686c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f12687f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.l(dest, 1, this.f12684a);
        df.b(dest, 2, this.f12685b);
        df.b(dest, 3, this.f12686c);
        df.l(dest, 4, this.d);
        df.l(dest, 5, this.e);
        df.k(dest, 6, this.f12687f, i10);
        df.r(dest, q5);
    }
}
