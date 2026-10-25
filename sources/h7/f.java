package h7;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new f6.i(17);
    public final String f12685a;
    public final Bundle f12686b;
    public final Bundle f12687c;
    public final String d;
    public final String e;
    public final ResultReceiver f12688f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialData, "credentialData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        this.f12685a = type;
        this.f12686b = credentialData;
        this.f12687c = candidateQueryData;
        this.d = str;
        this.e = str2;
        this.f12688f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.l(dest, 1, this.f12685a);
        df.b(dest, 2, this.f12686b);
        df.b(dest, 3, this.f12687c);
        df.l(dest, 4, this.d);
        df.l(dest, 5, this.e);
        df.k(dest, 6, this.f12688f, i10);
        df.r(dest, q5);
    }
}
