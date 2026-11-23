package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.cc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new b(5);
    public final String f17392a;
    public final Bundle f17393b;
    public final Bundle f17394c;
    public final String d;
    public final String f17395e;
    public final ResultReceiver f17396f;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f17392a = type;
        this.f17393b = credentialData;
        this.f17394c = candidateQueryData;
        this.d = str;
        this.f17395e = str2;
        this.f17396f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.l(dest, 1, this.f17392a);
        cc.b(dest, 2, this.f17393b);
        cc.b(dest, 3, this.f17394c);
        cc.l(dest, 4, this.d);
        cc.l(dest, 5, this.f17395e);
        cc.k(dest, 6, this.f17396f, i7);
        cc.s(dest, r10);
    }
}
