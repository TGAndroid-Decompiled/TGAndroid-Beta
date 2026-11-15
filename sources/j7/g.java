package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.yb;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new b(5);
    public final String f16916a;
    public final Bundle f16917b;
    public final Bundle f16918c;
    public final String d;
    public final String f16919e;
    public final ResultReceiver f16920f;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f16916a = type;
        this.f16917b = credentialData;
        this.f16918c = candidateQueryData;
        this.d = str;
        this.f16919e = str2;
        this.f16920f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.l(dest, 1, this.f16916a);
        yb.b(dest, 2, this.f16917b);
        yb.b(dest, 3, this.f16918c);
        yb.l(dest, 4, this.d);
        yb.l(dest, 5, this.f16919e);
        yb.k(dest, 6, this.f16920f, i7);
        yb.s(dest, r10);
    }
}
