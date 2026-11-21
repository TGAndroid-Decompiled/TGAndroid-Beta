package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.bc;
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new b(5);
    public final String f17323a;
    public final Bundle f17324b;
    public final Bundle f17325c;
    public final String d;
    public final String f17326e;
    public final ResultReceiver f17327f;

    public g(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f17323a = type;
        this.f17324b = credentialData;
        this.f17325c = candidateQueryData;
        this.d = str;
        this.f17326e = str2;
        this.f17327f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = bc.r(dest, 20293);
        bc.l(dest, 1, this.f17323a);
        bc.b(dest, 2, this.f17324b);
        bc.b(dest, 3, this.f17325c);
        bc.l(dest, 4, this.d);
        bc.l(dest, 5, this.f17326e);
        bc.k(dest, 6, this.f17327f, i7);
        bc.s(dest, r10);
    }
}
