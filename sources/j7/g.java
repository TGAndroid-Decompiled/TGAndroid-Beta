package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.cc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new b(5);
    public final String f17292a;
    public final Bundle f17293b;
    public final Bundle f17294c;
    public final String d;
    public final String f17295e;
    public final ResultReceiver f17296f;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f17292a = type;
        this.f17293b = credentialData;
        this.f17294c = candidateQueryData;
        this.d = str;
        this.f17295e = str2;
        this.f17296f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.l(dest, 1, this.f17292a);
        cc.b(dest, 2, this.f17293b);
        cc.b(dest, 3, this.f17294c);
        cc.l(dest, 4, this.d);
        cc.l(dest, 5, this.f17295e);
        cc.k(dest, 6, this.f17296f, i7);
        cc.s(dest, r10);
    }
}
