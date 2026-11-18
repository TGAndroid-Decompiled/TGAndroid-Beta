package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.bc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new b(5);
    public final String f17301a;
    public final Bundle f17302b;
    public final Bundle f17303c;
    public final String d;
    public final String f17304e;
    public final ResultReceiver f17305f;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f17301a = type;
        this.f17302b = credentialData;
        this.f17303c = candidateQueryData;
        this.d = str;
        this.f17304e = str2;
        this.f17305f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.l(dest, 1, this.f17301a);
        bc.b(dest, 2, this.f17302b);
        bc.b(dest, 3, this.f17303c);
        bc.l(dest, 4, this.d);
        bc.l(dest, 5, this.f17304e);
        bc.k(dest, 6, this.f17305f, i7);
        bc.s(dest, r10);
    }
}
